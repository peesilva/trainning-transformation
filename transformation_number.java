import java.util.Scanner;
public class transformation_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write a number: ");
        int numero = sc.nextInt();
        sc.close();

        String palavra = transformarNumeroEmPalavra(numero);

        System.out.println("The transformation is: " + palavra);
    }

    public static String transformarNumeroEmPalavra(int numero) {
        switch (numero) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            default:
                return "not locate";
        }
    }
}

