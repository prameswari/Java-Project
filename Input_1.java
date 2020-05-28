/**1-4．Input
 * Tugas‚P|‚S@Inputiscanfj
 * 1. ‚PDGunakan fungsi scanf, untuk menampilkan string karakter yang diinput.
 * ¦Saat tidak ada inputan, buatlah sebagai error dan memungkinkan 
 * dapat diinput sekali lagi.
 */
package tugas_dasar_1;
import javax.swing.JOptionPane;
/**
 * @author PRAMESWARI P PRAMONO
 *
 */
public class Input_1 {
	public static void main(String[] args) 
	{
		String teks;
		int x=1;
		do {
			teks = JOptionPane.showInputDialog ("Input teks apa saja :");
			if(teks.isEmpty()==true) {
				JOptionPane.showMessageDialog (null, "Input kosong", "Warning",
						JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog (null, "Teks yang diinput : "+teks, "Hasil",
						JOptionPane.INFORMATION_MESSAGE);
				x=2;
				}
		}while (x==1);
	}
}
