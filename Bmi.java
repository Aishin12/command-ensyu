import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("一人目");
        System.out.print("身長(cm):");
        double height1 = sc.nextDouble();
        System.out.print("体重(kg):");
        double weight1 = sc.nextDouble();

        System.out.println("二人目");
        System.out.print("身長(cm):");
        double height2 = sc.nextDouble();
        System.out.print("体重(kg):");
        double weight2 = sc.nextDouble();

        height = Math.pow(height1*0.01,2);
        double BMI1 = weight/height;
        System.out.println("一人目のBMI"+(Math.floor(BMI1* 100)) / 100); 


        height = Math.pow(height2*0.01,2);
        double BMI2 = weight2/height2;
        System.out.println("二人目のBMI"+(Math.floor(BMI2* 100)) / 100); 
    }
}
