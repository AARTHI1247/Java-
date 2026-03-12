import java.util.*;

public class Q19{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ec=0;
        int esc=0;
        int ac=0;
        int total=0;
        
        for(int i=0;i<n;i++){
            String type=scan.next();
            int months=scan.nextInt();
            int wp=0;
            
            if(type.equalsIgnoreCase("Electronics")){
                wp=12;
            }
            else if(type.equalsIgnoreCase("Appliance")){
                wp=24;
            }
            else if(type.equalsIgnoreCase("Computer")){
                wp=36;
            }
            
            int rem=wp-months;
            
            if(rem<0){
                rem=0;
            }
            
            if(rem==0){
                ec++;
            }
            else if(rem>=1 && rem<=3){
                esc++;
            }
            else{
                ac++;
            }
            
            total++;
        }
        
        System.out.println("Total Products: "+total);
        System.out.println("Expired: "+ec);
        System.out.println("Expiring Soon: "+esc);
        System.out.println("Active: "+ac);
    }
}
