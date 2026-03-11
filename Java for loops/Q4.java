import java.util.*;
public class Q4{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double sumsales=0;
        double sumc=0;
        int max=0;
        String tpf="";
        for (int i=0;i<n;i++){
            String name=scan.next();
            int sales=scan.nextInt();
                    int per=0;

            if(sales>0 && sales<=40000){
                per=5;
            }
            else if(sales>=40001 && sales<=80000){
                per=8;
            }
            else if(sales>=80001 && sales<=100000){
                per=10;
            }
            else if(sales>=100001 && sales<=150000){
                per=12;
            }
            else if(sales>150000){
                per=15;
            }
            double commision=sales*(per/100.0);
            int bonus=0;
            if(sales>=100000 && sales<150000){
                bonus=2000;
            } 
            else if(sales>=150000){
                bonus=3000;
            }
            if(max<sales){
                max=sales;
                tpf=name;
            }
            sumsales=sumsales+sales;
            sumc=sumc+commision;
            double tp=commision+bonus;
            System.out.println("Sales Rep: "+name);
            System.out.println("Sales Amount:"+sales);
            System.out.println("Commission Rate:"+per+"%");
            System.out.println("Commission Earned: "+commision);
            System.out.println("Bonus: "+bonus);
            System.out.println("Total Payout:"+tp);
            System.out.println();
        }
        System.out.println("Total Sales Reps: "+n);
        System.out.println("Total Sales:"+sumsales);
        System.out.println("Total Commissions: "+sumc);
        System.out.println("Total Performer:"+tpf);
    }
}
