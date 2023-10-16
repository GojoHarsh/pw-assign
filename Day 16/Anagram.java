import java.util.Arrays;

public class Anagram {
   static  String rep(String a){
      String b= "";
       for(int i =0; i<a.length();i++) {
          if(a.charAt(i)!= ' ')
          {
              b= b+a.charAt(i);
          }
      }
      return b;
   }
    public static void main(String[] args) {
       String st1= "Mohak";
       String st2= "Aohmk";
       st1= rep(st1);
       st2=rep(st2);

      st1 = st1.toLowerCase();
      st2 = st2.toLowerCase();

       char arr1[]= st1.toCharArray();
       char arr2 []= st2.toCharArray();

       Arrays.sort(arr1);
       Arrays.sort(arr2);
       System.out.println(arr1);
       System.out.println(arr2);

     if(Arrays.equals(arr1,arr2)){     
        System.out.println("This is an anagram");

     }
     else{
        System.out.println("This is not an anagram");
     }
    
     


    }
}