import java.util.Scanner;
class Readme{
    public static void main(String args[]){
     Scanner scanner =new Scanner(System.in);
     System.out.println("Enter any number");
     int number= scanner.nextInt();
    if(number %2 == 0){
        System.out.println("EVEN NUMBER");
    }
    else{
        System.out.println("ODD NUMBER");
    }
    }
}
