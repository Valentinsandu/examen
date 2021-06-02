import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner zileAleSaptamanii = new Scanner(System.in);
        System.out.println("Intruduceti un numar de la 1 la 7: ");
        int numarIntrodus = zileAleSaptamanii.nextInt();
        String ziASaptaminii = " ";
        switch (numarIntrodus){
            case 1:
                ziASaptaminii = "luni";
                break;
            case 2:
                ziASaptaminii = "marti";
                break;
            case 3:
                ziASaptaminii = "miercuri";
                break;
            case 4:
                ziASaptaminii = "joi";
                break;
            case 5:
                ziASaptaminii = "viner";
                break;
            case 6:
                ziASaptaminii = "sambata";
                break;
            case 7:
                ziASaptaminii = "duminica";
                break;
        }
        System.out.println("Astazi este " + ziASaptaminii + " , git uraaa!");
    }
}
