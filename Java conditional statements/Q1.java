import java.util.*;
import java.util.Scanner;
public class Q1{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
            int rate=scan.nextInt();
            int yrs=scan.nextInt();
            scan.nextLine();
            String type=scan.nextLine();
            double salary=scan.nextDouble();
            int per=0;
            if(rate>=3){
                System.out.println("Performance Rating:"+rate+"\n"+"Years of Service:"+yrs+"\n"+"Department:"+type);
                if(type.equalsIgnoreCase("Critical")){
                    if(rate==5 && yrs>=5){
                        System.out.println("Bonus Percentage: 18%");
                        per=18;
                    }
                    else if(rate==4 && yrs>=10){
                         System.out.println("Bonus Percentage: 22%");
                         per=22;
                    }
                    else if(rate==5){
                         System.out.println("Bonus Percentage: 15%");
                         per=15;
                    }
                    else if(rate==3){
                         System.out.println("Bonus Percentage: 10%");
                         per=10;
                    }
                }
                else if(type.equalsIgnoreCase("Non Critical")){
                    if(rate==5){
                        System.out.println("Bonus Percentage: 18%");
                        per=18;
                    }
                    else if(rate==4){
                         System.out.println("Bonus Percentage: 12%");
                         per=12;
                    }
                    else if(rate==3){
                         System.out.println("Bonus Percentage: 8%");
                         per=8;
                    }
                }
            double bonus=(salary*per)/100;
            System.out.println("Bonus Amount:"+bonus+"\n"+"Status:Eligible");
            }
            else{
                System.out.println("Performance Rating:"+rate+"\n"+"Years of Service:"+yrs+"\n"+"Department:"+type);
                System.out.println("Bonus Percentage: 0%");
                        per=0;
                
            int bonus=0;
            System.out.println("Bonus Amount: "+bonus+"\n"+"Status:Not Eligible");
            }
            }
}
    
