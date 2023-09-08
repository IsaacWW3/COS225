import java.util.Scanner;
public class in_class_example {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double f;

        System.out.println("Enter the Farenheit: ");

        f = input.nextDouble();

        double c = (f - 32) * (5.0/9.0);

        System.out.println("The temp in Celcious is:" + c);
        input.close();

    }
}