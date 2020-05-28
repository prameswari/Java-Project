/**
 * 1-5．Judgment
 * Tugas‚P|‚T@Judgmentiifj
 * 2. ‚PDGunakan fungsi scanf, input karakter string 10 kali, dan tampilkan string paling besar.
 * ¦Untuk perbandingan karakter string gunakan strcmp
 * ¦Saat tidak ada inputan, buatlah sebagai error dan memungkinkan dapat diinput sekali lagi.
 */
package tugas_dasar_1;

import java.util.InputMismatchException;
import java.util.Scanner;
//import java.lang.NullPointerException;;

/**
 * @author PRAMESWARI P PRAMONO
 *
 */
public class coba_Judgement_ {
	private static Scanner jml;
	private static Scanner input;


	public static void main(String[] args) {
		String smt;
		String s1 = null;
		String max = null;
		int x;
		String str[] = new String[100];
		input = new Scanner(System.in);
		jml = new Scanner(System.in);
		System.out.print("Masukan jumlah string yang akan diinput :");
		int in = jml.nextInt();
		boolean lanjutkanInput = true;

		do {
			try {
				for (x = 1; x <= in; x++) {
					System.out.print("Input string ke-" + x + ":");
					s1 = input.nextLine();
					// boolean cek = s1.isEmpty();
					if (s1.trim().length() == 0) {
						x--;
						throw new InputMismatchException();
					} else {
						str[x - 1] = s1;
						lanjutkanInput = false;
					}
				}
			} catch (InputMismatchException ex) {
				System.out.println("Coba lagi. \nInput anda salah ");
				lanjutkanInput = true;
			}
		} while (lanjutkanInput);

		for (x = 0; x < (in - 1); x++) {
			if (str[x].compareTo(str[x + 1]) > 0) {
				smt = str[x + 1];
				str[x + 1] = str[x];
				str[x] = smt;
				max = str[x + 1];
			} else
				max = str[x + 1];
		}
		System.out.println("String terbesar : " + max);
	}
}
