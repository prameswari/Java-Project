/**
 * 1-8．Masalah umum
 * Tugas‚P|‚W@Masalah Umum
 * Buatlah program yang memiliki fungsi di bawah ini.
 * ¡Fungsi
 * EPertama-tama masukkan karakter string referensi.
 * ESetelah itu, masukkan karakter string dan periksa apakah sesuai dengan karakter string referensi atau tidak.
 * ESaat sesuai, hitung berapa kali,dan tampilkan.
 * ESaat tidak sesuai, tampilkan error.
 * EApabila karakter string selesai uendvdimasukkan, akan mengakhiri program.
 * 
 * ¡Perhatian
 * EUntuk membandingkan string, pertama-tama gunakan fungsi strlen, selanjutnya gunakan fungsi strcmp.
 * EPertimbangkan huruf kapitalEhuruf kecil dari karakter inputan.
 * EMengenai tidak ada masukkan, keluarkan error.
 */
package tugas_dasar_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author PRAMESWARI P PRAMONO
 *
 */
public class Masalah_Umum {
	public static void main(String[] args) {
		String key = "call";
		Scanner input = new Scanner(System.in);
		int x = 0;
		String cnfrm = "y";

		do {
			try {
				System.out.print("Input string : ");
				String teks = input.nextLine();
				if (teks.trim().length() == 0) {
					throw new InputMismatchException();
				}
				if (key.equals(teks)) {
					x = x + 1;
				} else
					System.out.println("Inputan tidak sesuai !");

				System.out.println("=====================================");
				System.out.print("Apakah anda ingin mengulang (y/t)? ");
				cnfrm = input.nextLine();
				if (cnfrm.trim().length() == 0) {
					throw new InputMismatchException();
				}
			} catch (InputMismatchException ex) {
				System.out.println("Coba lagi. \nInput tidak boleh kosong ");
			}

		} while (cnfrm.equals("y"));

		System.out.print("Jumlah string yang cocok : " + x);
	}
}
