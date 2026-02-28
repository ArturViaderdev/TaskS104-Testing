package level1Exercise2;

import level1Exercise2.exceptions.IncorrectNumberException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix els números de un DNI.");
        int number;
        try
        {
            number = scanner.nextInt();
            showDNI(number);
        }
        catch(Exception ex)
        {
            System.out.println("Has de introduir només números.");
        }
    }

    private static void showDNI(int number)
    {
        try
        {
            System.out.println("La lletra pel DNI " + Integer.toString(number) + " és "  + CalculoDni.letterDni(number));
        } catch (IncorrectNumberException e) {
            System.out.println(e.getMessage());
        }

    }
}
