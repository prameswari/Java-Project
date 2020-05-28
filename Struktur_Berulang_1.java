/**1-3．Struktur berulang
 * Tugas‚P|‚R@Struktur Berulangiwhile,forj
 * 1. ‚PDTampilkan array variabel karakter 
 * HELLO C dari tugas 2, masing-masing 1 
 * karakter baris demi baris.
 * @iuntuk mengulanginya, gunakan statement 
 * whilej
 */
package tugas_dasar_1;

/**
 * @author PRAMESWARI P PRAMONO
 *
 */
public class Struktur_Berulang_1 {
	public static void main(String[] args) {
		// deklarasi dan inisiasi variabel untuk indeks
		int i = 0;

		// deklarasi dan inisiasi char array bertipe data String
		String teks[] = { "H", "E", "L", "L", "O", " ", "C" };

		// fungsi perulangan untuk mencetak array tiap indeks/baris
		while (i <= 6) {
			System.out.println(teks[i]);
			i++;
		}
	}
}
