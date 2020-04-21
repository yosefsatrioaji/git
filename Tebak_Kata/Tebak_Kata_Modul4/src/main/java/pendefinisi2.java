import java.util.Scanner;
public class pendefinisi2 {
    String jawaban;
    String retry;
    Scanner in = new Scanner (System.in);
    
    String soalsimple(String soal2){
        System.out.println(soal2);
        jawaban = in.next();
        return soal2;
    }
    
    public void soal (String soal1,String jawaban1){
        String soal2 = soal1;
        soalsimple(soal2);
        if(jawaban.equalsIgnoreCase(jawaban1)){
            System.out.println("JAWABAN ANDA BENAR");
        }
        else{
            System.out.println("yah, jawaban anda salah, ingin coba lagi? Y untuk ya");
            retry = in.next();
            if (retry.equalsIgnoreCase("y")){
                soalsimple(soal2);
                if(jawaban.equalsIgnoreCase(jawaban1)){
                    System.out.println("JAWABAN ANDA BENAR");
                }
		else{
                System.out.println("yah, jawaban anda salah, yang benar adalah "+jawaban1);
		}
            }
        }
    }
}