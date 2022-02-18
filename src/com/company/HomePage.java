import java.util.Scanner;
public class HomePage {
    public static void main(String[] args) {
        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of months");
        int noOfMonth = sc.nextInt();

        // Check the no of month
        if(noOfMonth == 1){
            System.out.println("The month is jan");
        }else if(noOfMonth ==2){
            System.out.println("The month is feb");
        }else if(noOfMonth ==3){
            System.out.println("The month is march");
        }else if(noOfMonth ==4){
            System.out.println("The month is april");
        }else if(noOfMonth ==5){
            System.out.println("The month is may");
        }else if(noOfMonth ==6){
            System.out.println("The month is june");
        }else if(noOfMonth ==7){
            System.out.println("The month is july");
        }else if(noOfMonth ==8){
            System.out.println("The month is aug");
        }else if(noOfMonth ==9){
            System.out.println("The month is sep");
        }else if(noOfMonth ==10){
            System.out.println("The month is oct");
        }else if(noOfMonth ==11){
            System.out.println("The month is nov");
        }else if(noOfMonth ==12){
            System.out.println("The month is dec");
        }else{
            System.out.println("Invalid option given.");
        }



    }
}
