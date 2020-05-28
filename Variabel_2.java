/**1-2．Variabel
 * Tugas‚P|‚Q@Variabel
 * @Modifikasi masalah tugas‚P|‚P, untuk 
 * membuat program berikut.
 * 2. ‚QDBuat sebuah program yang menampilkan
 *  karakter HELLO C sebagai variabel 
 *  string(array tipe char).
 */
package tugas_dasar_1;

import javax.swing.JOptionPane;

/**
 * @author PRAMESWARI P PRAMONO
 *
 */
public class Variabel_2 {
	public static void main(String[] args) {
		// deklarasi dan inisiasi array bertipe data String
		String teks[] = { "HELLO C" };

		// method untuk menampilkan array
		JOptionPane.showMessageDialog(null, "" + teks[0], "Program 1-2 : Show Arr", JOptionPane.INFORMATION_MESSAGE);
	}
}
