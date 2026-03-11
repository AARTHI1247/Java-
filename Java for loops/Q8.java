import java.util.*;
public class Q8{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int d=0,t=0;
        double ft=0;
        double st=0;
        double ot=0;
        double td=0;
        double sp=0;
        double sumot=0;
        double s=0;
        for(int i=0;i<n;i++){
            String name=scan.next();
            double price=scan.nextDouble();
            int q=scan.nextInt();
            if(q==1){
                d=0;
            }
            else if(q>=2 && q<=4){
                d=10;
            }
            else if(q>=5 && q<=9){
                d=15;
            }
            else if(q>=10){
                d=20;
            }
             t=t+q;
             st=price*q*(1-d/100.0);
             ot=price*q;
             sumot=sumot+ot;
             ft=ft+st;
            System.out.println("Product: "+name);
            System.out.println("Unit Price: "+price);
            System.out.println("Quantity:"+q);
            System.out.println("Discount: "+d+"%");
            System.out.println("Subtotal: "+st);
                        System.out.println();
        }   
            td=sumot-ft;
            sp=(td/ot)*100.0;
            System.out.println("Total Items: "+t);
            System.out.println("Original Total: "+sumot);
            System.out.println("Total Discount: $"+td);
            System.out.println("Final Total: $"+ft);
            System.out.println("Savings: "+sp);
    }
}
