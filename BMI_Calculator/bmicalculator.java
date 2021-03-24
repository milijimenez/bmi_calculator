import java.util.Scanner;

/**
 *
 */

/**
 * @author milijimenez
 *
 */
public class bmicalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kilograms: ");
        double weight = sc.nextDouble();

        System.out.println("Enter height in cm: ");
        double height = sc.nextDouble();
        height = height/100;
        System.out.println("---------------------");
        double bmi = weight/(height * height);
        if (bmi < 18.5) {
            System.out.println("Your BMI is :" + bmi + "\n Status: Underweight");
            System.out.println("---------------------");
        } else if (bmi >= 18.5 && bmi < 35) {
            System.out.println("Your BMI is :" + bmi + "\n Status: Normal");
            System.out.println("---------------------");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Your BMI is :" + bmi + "\n Status: Overweight");
            System.out.println("---------------------");
        } else if (bmi >= 30) {
            System.out.println("Your BMI is :" + bmi + "\n Status: Obese");
            System.out.println("---------------------");
        } else {

        }
        sc.close();
    }

}
