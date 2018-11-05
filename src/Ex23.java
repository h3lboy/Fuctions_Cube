import java.util.Scanner;

public class Ex23 {

    public static void main(String agrs[]){

        double  lenghth, width,height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lenghth of the cube");
        lenghth = scanner.nextDouble();

        System.out.println("Enter the Width of the cube ");
        width = scanner.nextDouble();

        System.out.println("Enter the height of the cube");
        height = scanner.nextDouble();


        double b = Volume(lenghth,width,height);

        System.out.println("The Volume of the cube is " + b);


    }



    public static double Volume(double lenghth , double width ,double height){


         double a = lenghth * width * height;

        return a;


    }







}
