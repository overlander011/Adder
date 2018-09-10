import util.java.Scanner;
class Adder {    
    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X = " );
        int x = sc.nextInt();
        System.out.println("Enter Y = " );
        int y = sc.nextInt();
        System.out.println(x + y);
    }
}