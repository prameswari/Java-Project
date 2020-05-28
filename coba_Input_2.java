/**1-4．Input
 * Tugas‚P|‚S@Inputiscanfj
 * 2. ‚QDGunakan fungsi scanf, masukkan 1 half-width angka dan munculkan 
 * dalam nomor biner. 
 * ¦Saat tidak ada inputan, buatlah sebagai error dan memungkinkan dapat 
 * diinput sekali lagi.
 */
package tugas_dasar_1;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author PRAMESWARI P PRAMONO
 *
 */
public class coba_Input_2 {
	public static void main(String args[]) {
		coba_Input_2 obj = new coba_Input_2();
		obj.dptkanNilai();
		obj.konversi();
	}

	int num;

	void dptkanNilai() {
		System.out.println("Konversi Bilangan Desimal Ke Biner");
		System.out.println("===================================");
		Scanner scan = new Scanner(System.in);
		boolean lanjutkanInput = true;

		do {
			try {
				System.out.print("\nMasukkan Bilangan Desimal :");
				String nums = scan.nextLine();
				if (nums.trim().length() == 0) {
					throw new InputMismatchException();
					// lanjutkanInput = true;
				} else
					lanjutkanInput = false;
				num = Integer.parseInt(nums);
			} catch (InputMismatchException ex) {
				System.out.println("Coba lagi. \nInput harus sebuah integer ");
			}
		} while (lanjutkanInput);
	}

	void konversi() {
		String binary = Integer.toBinaryString(num);
		System.out.println("Bilangan binernya adalah : " + binary);
	}
}
