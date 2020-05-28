/**
 * 1-7．Input ２
 * Tugas‚V@Input(getchar)
 * Implementasikan tugas selama ini bukan dengan menggunakan fungsi scanf, 
 * namun dengan fungsi getchar.Juga, membuatnya fungsional.
 * Untuk tugas‚P|‚V dan seterusnya,
 * Selama secara khusus tidak ditentukan, jangan gunakan fungsi scanf.
 */
package tugas_dasar_1;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author PRAMESWARI P PRAMONO
 *
 */
public class GetCharsInput_1 {
	public static void main(String[] args) {
		int x = 1;
		Scanner scan = new Scanner(System.in);
		String teks;
		boolean lanjutkanInput = true;
		do {
			try {
				System.out.print("Input kalimat panjang apa saja : ");
				teks = scan.nextLine();
				if (teks.trim().length() == 0) {
					throw new InputMismatchException();
				} else
					lanjutkanInput = false;
				char[] getkar = new char[23];
				teks.getChars(2, 7, getkar, 0);
				System.out.println("\n");
				for (int i = 0; i < getkar.length; i++)
					System.out.println(getkar[i]);
			} catch (InputMismatchException ex) {
				System.out.println("Coba lagi. \nInput tidak boleh kosong");
			}
		} while (lanjutkanInput);

	}
}
