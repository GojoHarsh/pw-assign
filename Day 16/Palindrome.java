import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
       String bef = "2552";
       String aft= "";


        System.out.println("Before reversing:"+ bef);
        for(int i=bef.length()-1; i>=0;i--){
            aft= aft + bef.charAt(i);
        }
        System.out.println("After reversing:" + aft);
        if(bef.equals(aft)){
            System.out.println("This is palandrome");
        }
        else{
            System.out.println("This is not a palandrome");
        }
    }
}