/**1-3．Struktur berulang
 * Tugas‚P|‚R@Struktur Berulangiwhile,forj
 * 2. ‚QDBuat program yang menampilkan dari 
 * 1 sampai 10.
 * @iuntuk mengulanginya gunakan statement 
 * forj
 * ‚RDModifikasi statement for pada program ‚
 * Q dengan menggunakan increment
 * @@Dan, gunakan j++ dan ++k pada increment,
 * kemudian konfirmasikan seperti apa perbedaan yang ada.
 * @@¦Kumpulkan perbedaan pre-increment dan 
 * post-increment pada file teks(.txt), 
 * kemudian persentasikan pada saat review
 */
package tugas_dasar_1;

/**
 * @author PRAMESWARI P PRAMONO
 *
 */
public class Strukur_Berulang_2 {
	public static void main(String[] args) {
		// deklarasi dan inisiasi variabel yang akan dicetak
		int j;

		// menggunakan fungsi rekursif for untuk mencetak dari 1 hingga 10
		for (j = 1; j <= 10;) {
			System.out.println(++j); // digunakan operator increment untuk menambahkan 1 sebelum mencetak
		}
	}

}
