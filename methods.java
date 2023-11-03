public class methods
{
public static int AddNumbers(int num1,int num2){
    return num1+num2;
}

public static void main(String[] args) {
    int num1=10;
    int num2=20;
    
    int result=AddNumbers(num1, num2);
    System.out.println("The sum of two numbers is:" + result);
}
}
