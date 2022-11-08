import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("身長(cm):");
        double height = sc.nextDouble();
        System.out.print("体重(kg):");
        double weight = sc.nextDouble();
        height = Math.pow(height*0.01,2);
        double BMI = weight/height;
        System.out.println((Math.floor(BMI* 100)) / 100); 
    }
}
