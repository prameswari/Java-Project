/**
 * 1-5．Judgment
 * Tugas‚P|‚T@Judgmentiifj
 * 1. ‚QDDengan menggunakan fungsi scanf, masukkan angka 10 kali, dan tampilkan angka ganjil terbesar.
 * ¦Saat tidak ada inputan dan inputan selain nilai numerik half-width, buatlah sebagai error dan memungkinkan dapat diinput sekali lagi.
 */
package tugas_dasar_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author PRAMESWARI P PRAMONO
 *
 */
public class Judgement_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num[] = new int[100];
		int maxgjl = 0;
		boolean lanjutkanInput = true;

		do {
			try {
				System.out.print("Masukan jumlah bilangan : ");
				String angkaS = input.nextLine();
				if (angkaS.trim().length() == 0) {
					throw new InputMismatchException();
				} else
					lanjutkanInput = false;
				int angka = Integer.parseInt(angkaS);

				lanjutkanInput = false;

				for (int x = 1; x <= angka; x++) {
					System.out.print("Bilangan ke-" + x + ": ");
					num[x] = input.nextInt();
				}
				for (int x = 1; x <= angka; x++) {
					if (num[x] % 2 == 1 & num[x] > maxgjl)
						maxgjl = num[x];
				}
				System.out.println("===================================================================");
				if (maxgjl > 0)
					System.out.print("Bilangan ganjil terbesar adalah : " + maxgjl);
				else
					System.out.print("Tidak ada bilangan ganjil");

			} catch (InputMismatchException ex) {
				System.out.println("Coba lagi. \nInput harus sebuah integer ");
				// input.nextLine();
			}
		} while (lanjutkanInput);
	}
}
