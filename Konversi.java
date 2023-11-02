import java.util.Scanner;

public class Konversi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Menu = 7;
        
        while(Menu != 0){
            System.out.println("Menu Konversi:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Heksadesimal");
            System.out.println("4. Heksadesimal ke Biner");
            System.out.println("5. Desimal ke Heksadesimal");
            System.out.println("6. Heksadesimal ke Desimal");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-6): ");
            Menu = input.nextInt();

            switch (Menu) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    String biner = input.next();
                    int desimal = Integer.parseInt(biner, 2);
                    System.out.println("Hasil: " + desimal);
                    break;

                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimalInput = input.nextInt();
                    String binerOutput = Integer.toBinaryString(desimalInput);
                    System.out.println("Hasil: " + binerOutput);
                    break;

                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    String binerInputHexa = input.next();
                    int desimalHexa = Integer.parseInt(binerInputHexa, 2);
                    String heksadesimal = Integer.toHexString(desimalHexa);
                    System.out.println("Hasil: " + heksadesimal);
                    break;

                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String heksadesimalInput = input.next();
                    int desimalBiner = Integer.parseInt(heksadesimalInput, 16);
                    String binerOutputHexa = Integer.toBinaryString(desimalBiner);
                    System.out.println("Hasil: " + binerOutputHexa);
                    break;

                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimalToHexa = input.nextInt();
                    String heksadesimalOutput = Integer.toHexString(desimalToHexa);
                    System.out.println("Hasil: " + heksadesimalOutput);
                    break;

                case 6:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String heksadesimalToDesimal = input.next();
                    int desimalOutput = Integer.parseInt(heksadesimalToDesimal, 16);
                    System.out.println("Hasil: " + desimalOutput);
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
