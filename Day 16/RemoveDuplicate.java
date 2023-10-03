public class RemoveDuplicate {
        public static void main(String[] args) {
            String a = "Java";
            String b = "";
            char c[]= a.toCharArray();
            
            for(int i= 0 ; i<c.length; i++){
                Boolean k = false;
                for(int j= i+1; j<c.length; j++){
                    if(c[i]==c[j]){
                         k= true;
                         break;
                    }
                    }
                if(k ==false){
                    b = b+c[i];
                    }
            }System.out.println(b);


           
        }
}
