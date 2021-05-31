public class First {
    public static void main(String[] args) {
        int[] num = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        System.out.println("Array original: ");
        for(int i=0;i<num.length;i++)
            System.out.print(num[i] + "  ");

        System.out.println();

        System.out.println("Array invers: ");
        for(int i=num.length-1;i>=0;i--)
            System.out.print(num[i] + "  ");

    }
}
