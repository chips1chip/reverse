import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String a=sc.nextLine();
        String b="";
        for(int i =a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        System.out.println("reverse of the string:"+b);
    }
    
}