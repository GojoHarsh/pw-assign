public class CountVowels {
        public static void main(String[] args) {
            String str= "anonymous##";
            int cv= 0,sp=0, cc=0;
            
            for(int i =0; i<str.length(); i++){
              char  ch = str.charAt(i);
                if(ch>= 'a'&& ch<='z'){
                    if(ch=='a'|| ch=='e'||ch=='i'||ch== 'o'|| ch=='u'){
                        cv++;
                    }
                    else{ cc++;}
                }
                else{sp++;}
            }
            System.out.println("No. of consonants are:"+cc);
            System.out.println("No. of vowels are: "+ cv);
            System.out.println("No. of special characters are: " + sp);
        }
}
