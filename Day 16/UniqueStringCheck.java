import java.util.Arrays;
import java. util.Scanner;

public class UniqueStringCheck {
    static  String rep(String a){
        String b= "";
         for(int i =0; i<a.length();i++) {
            if(a.charAt(i)!= ' ')
            {
                b= b+a.charAt(i);
            }
        }
        return b;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Statement: ");
        String s = sc.nextLine();
        s = rep(s);
        s= s.toLowerCase();
        char ch[]= s.toCharArray();
        Arrays.sort(ch);
        boolean u= true;
        for(int i=0; i<ch.length;i++){
            for (int j=i+1; j<ch.length; j++){
                if(ch[i]==ch[j]){
                    u= false;
                    break;
                }

            }
        }
        if(u==false){
            System.out.println("This is not a Unique string");
        }
        else{
            System.out.println("Unique string");
        }
        
        
    }
}
