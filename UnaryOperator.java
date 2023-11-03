public class UnaryOperator {
    public static void main(String args[]){
 
 //OR OPERATOR

int a=10;  
int b=5;  
int c=20;  
System.out.println(a>b||a<c);//true  
System.out.println(a>b|a<c);//true 
System.out.println(a>b||a++<c);//true
System.out.println(a);//10 
System.out.println(a>b|a++<c);//true  
System.out.println(a);//11
