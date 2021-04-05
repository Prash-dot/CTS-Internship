import java.util.Scanner;

public class Temperture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit");
        double fahrenheit=sc.nextDouble();
        double celsius=((fahrenheit-32)*5)/9;
        System.out.println("Temperature in celsius = "+celsius);
    }
}
