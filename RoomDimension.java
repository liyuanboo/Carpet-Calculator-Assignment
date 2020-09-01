import java.util.Scanner;

class RoomDimension {
    double area(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the width of the carpet in feet: ");
        double width = scan.nextDouble();
        System.out.print("Input the length of the carpet in feet: ");
        double length = scan.nextDouble();
        return width * length;
    }

    double desiredPrice(){
         Scanner scan = new Scanner(System.in);
         System.out.print("Input the price per square foot of the desired carpeting: ");
         return scan.nextDouble();
    }
}


