/**1-6．Operasi, tipe
 * Tugas‚P|‚U@Operasi,Tipe

 * 1. Gunakan fungsi scanf, masukkan 2 angka, kemudian hitunglah empat operasi aritmatika, OR, AND dan output masing-masing.
 
 * Konfirmasikan perbedaan hasil operasi saat masing-masing variabel di set ke tipe int, tipe float, tipe double.
 * iCoding untuk dapat memverifikasi semua pola dengan satu programj

 * 1. ¦Memungkinkan dapat menginput di bawah titik desimal.
 * ¦Mengatasi mengenai error jumlah digit inputan.
 * ¦Saat tidak ada inputan dan inputan selain nilai numerik half-width, buatlah sebagai error.
 */
package tugas_dasar_1;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author PRAMESWARI P PRAMONO
 *
 */
public class Operasi_Tipe_1 {
	public static void main(String[] args) {
		String ulg = "y";
		boolean ulangInput = true;

		NumberFormat ubah = NumberFormat.getInstance();
		ubah.setMaximumIntegerDigits(4); // maks 4 digit dari belakang
		ubah.setGroupingUsed(true);

		do {
			while (ulg.equals("y")) {
				try {
					System.out.println("");
					Scanner input = new Scanner(System.in);
					System.out.println("***********SELAMAT DATANG DI APLIKASI OPERASI BILANGAN************");
					System.out.println("");
					System.out.println("		MENU UTAMA		");
					System.out.println("1. Tipe Data Integer");
					System.out.println("2. Tipe Data Float");
					System.out.println("3. Tipe Data Double");
					System.out.println("===================================================================");
					System.out.println("Pilihan [1/2/3]");
					String pilih = input.nextLine();
	
					if (pilih.trim().length() == 0) {
						throw new InputMismatchException();
					} else
						ulangInput = false;
					int num = Integer.parseInt(pilih);
					switch (num) {
					// OPERASI ANTAR BILANGAN INTEGER
					case 1: {
						System.out.println("=====================================");
						System.out.println("OPERASI ANTAR BILANGAN INTEGER");
						System.out.println("=====================================");
						int a, b, hasil;
						Scanner s = new Scanner(System.in);

						System.out.println("Masukkan angka pertama (a) : ");
						a = s.nextInt();
						System.out.println(ubah.format(a));

						System.out.println("Masukkan angka kedua (b) : ");
						b = s.nextInt();
						System.out.println(ubah.format(b));

						hasil = a & b;

						System.out.println("a & b: " + hasil);

						hasil = a | b;
						System.out.println("a | b: " + hasil);

						hasil = a + b;
						System.out.println("a + b: " + hasil);

						hasil = a - b;
						System.out.println("a - b: " + hasil);

						hasil = a * b;
						System.out.println("a x b: " + hasil);

						hasil = a / b;
						System.out.println("a bagi b: " + hasil);
						break;

					}
					// OPERASI ANTAR BILANGAN FLOAT
					case 2: {
						System.out.println("=====================================");
						System.out.println("OPERASI ANTAR BILANGAN FLOAT");
						System.out.println("=====================================");
						float a, b, hasil;
						Scanner s = new Scanner(System.in);

						System.out.println("Masukkan angka pertama (a) : ");
						a = s.nextFloat();
						System.out.println("Masukkan angka kedua (b) : ");
						b = s.nextFloat();

						hasil = a + b;
						System.out.println("a + b: " + hasil);

						hasil = a - b;
						System.out.println("a - b: " + hasil);

						hasil = a * b;
						System.out.println("a x b: " + hasil);

						hasil = a / b;
						System.out.println("a bagi b: " + hasil);
						break;

					}
					// OPERASI ANTAR BILANGAN DOUBLE
					case 3: {
						System.out.println("=====================================");
						System.out.println("OPERASI ANTAR BILANGAN DOUBLE");
						System.out.println("=====================================");
						double a, b, hasil;
						Scanner s = new Scanner(System.in);

						System.out.println("Masukkan angka pertama (a) : ");
						a = s.nextDouble();
						System.out.println("Masukkan angka kedua (b) : ");
						b = s.nextDouble();

						hasil = a + b;
						System.out.println("a + b: " + hasil);

						hasil = a - b;
						System.out.println("a - b: " + hasil);

						hasil = a * b;
						System.out.println("a x b: " + hasil);

						hasil = a / b;
						System.out.println("a bagi b: " + hasil);
						break;
					}
					default: {

						System.out.println("Warning !! Pilihan tidak tersedia !! ");
						throw new InputMismatchException();
					}
					}
					System.out.println("=====================================");
					System.out.println("Apakah anda ingin mengulang (y/t)? ");
					System.out.println("=====================================");
					ulg = input.next();
				} catch (InputMismatchException ex) {
					System.out.println("Coba lagi. \nInput anda salah ");
				}
			}

		} while (ulangInput);
	}
}
