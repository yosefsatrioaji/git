import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Tebak_Kata {
    public static void main(String args[]) {
		System.out.println("KELOMPOK 74");
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println("Sekarang adalah jam " + sdf.format(cal.getTime()) );
		String restrart;
                pendefinisi2 object = new pendefinisi2();
		do
		{
			String jawaban;
			String retry;
			System.out.println("Welcome to Program Kelompok 74");
			Scanner in = new Scanner(System.in);
			System.out.println("1. Soal pertama");
			System.out.println("2. Soal kedua");
			System.out.println("3. Soal ketiga");
			System.out.println("4. Soal keempat");
			System.out.println("5. About");
			System.out.println("Masukkan pilihan anda");
			int pilihan = in.nextInt();
			switch(pilihan) {
			case 1 :
			object.soal("Aku biasanya besar warnanya abu-abu, siapakah aku?","gajah");
			break;
			case 2 :
			object.soal("Aku adalah benda bundar yang biasa di jalanan, siapakah aku?","roda");
			break;
			case 3 :
			object.soal("Dipasang di bawah tapi di baca ke atas, apakah itu?", "nike");
			break;
			case 4 :
            object.soal("Aku laki-laki tapi bisa hamil, siapakah aku?", "Kuda laut");
			break;
			case 5 :
			System.out.println("Made by Kelompok 74 Shift 2");
			System.out.println("Rio Amin Fathani, Yosef Satrio Aji, Arief Syaifuddin");
			System.out.println("21120119130069, 21120119130097,21120119130105");
			System.out.println();
			break;
			default :
			System.out.println("Soal belum cukup banyak ya? :( tunggu update selanjutnya yaa :D");
			break;
        }
		System.out.println("Terimakasih sudah bermain! Apakah anda ingin bermain lagi? Y jika ya");
		restrart = in.next();
      }
	  while(restrart.equalsIgnoreCase("Y"));


	  System.out.println("Terimakasih sudah bermain!");
    }
}
