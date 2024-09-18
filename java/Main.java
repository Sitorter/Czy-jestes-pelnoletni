import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Jestes pelnoletni");
        }
        else{
            System.out.println("Nie jestes pelnoletni");
        }
        scanner.close();
    }
}