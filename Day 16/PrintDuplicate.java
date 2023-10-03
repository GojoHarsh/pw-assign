public class PrintDuplicate {
    public static void main(String[] args) {
        String dp = "neon";
           
            char d[]= dp.toCharArray();
            System.out.println("Duplicate characters is: ");
            for(int i=0; i<d.length;i ++){
                Boolean r= false;
                for (int j =i+1; j<d.length; j++){
                    if(d[i]==d[j]){
                       System.out.println(d[j]);
                       break;
                    }
                }
            }
    }
}
