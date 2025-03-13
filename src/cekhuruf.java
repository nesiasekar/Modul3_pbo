import java.util.Scanner;

public class cekhuruf {
    public static void main(String[] args) throws Exception {
        Scanner inputuser = new Scanner(System.in);

        System.out.print("Masukkan kalimat : ");
        String letter = inputuser.nextLine();

        int vokal = 0; 

        for(int i = 0; i < letter.length(); i++){
            char c = letter.charAt(i);
            if ( c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o');
            vokal++;
        }

        switch (vokal % 2) {
            case 0:
                System.out.println("Jumlah vokal genap = " + vokal);
                break;
            case 1: 
                System.out.println("Jumlah vokal ganjil =  " + vokal);
            default:
                break;
        }

        System.out.print("Kalimat saat terbalik : ");
        for(int i = letter.length() - 1; i >= 0; i--){
            System.out.print(letter.charAt(i));
        }

        inputuser.close();
    }
}
