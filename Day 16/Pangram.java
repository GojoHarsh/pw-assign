import java.util.Scanner;

public class Pangram {
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
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the sentence:");
     String s = sc.nextLine();
            s= rep(s);

         
         char ch[] = s.toCharArray();
         int arr[]= new int[26];
         boolean flag = true;
         for(int i =0 ; i<32; i++){
            arr[ch[i]-97]++;
         }
         for(int i=0; i<26; i++){
            if(arr[i]==0){
                System.out.println("This is not a panagram.");
                flag =false;
            }
         }
         if (flag ==true){
            System.out.println("This is a Panagram.");
         }
   }

   
    
}
