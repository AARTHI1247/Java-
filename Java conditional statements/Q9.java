import java.util.Scanner;
public class Q9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double Revenue= scan.nextDouble();
        scan.nextLine();
        String Type= scan.nextLine();
        double Expenses= scan.nextDouble();
        double Credits= scan.nextDouble();
        System.out.println("Annual Revenue:" +Revenue);
        System.out.println("Business Type:" + Type);
        System.out.println("Deductible Expenses: $" + Expenses);
        System.out.println("Tax Credits: $" + Credits);
        double income=Revenue-Expenses;
        int tr=0;
        int bv=0;
        String c="";
        if(Type.equalsIgnoreCase("C-Corp")){
            if(income<500000){
            tr=21;
            }
            else if(income<1000000 && income>500000){
                tr=24;
            }
            else if(income>1000000 && income>2000000){
                tr=28;
            }
            else if( income>200000){
                tr=30;
            }
        }
        else if(Type.equalsIgnoreCase("S-Corp")){
            if(income<500000){
            tr=20;
            }
            else if(income<1000000 && income>5000000){
                tr=25;
            }
            else if( income>1000000){
                tr=28;
            }
        }
        else if(Type.equalsIgnoreCase(" LLC")){
            if(income<200000){
            tr=15;
            }
            else if(income<5000000 && income>2000000){
                tr=18;
            }
            else if( income>500000){
                tr=22;
            }
        }
        else if(Type.equalsIgnoreCase("Partnership")){
            if(income<300000){
                tr=18;
                }
                else if(income<8000000 && income>5000000){
                    tr=22;
                }
                else if( income>800000){
                    tr=26;
                }
        }
        double gt=income*(tr/100);
        double nt=gt-0;
        double et=(nt/Revenue)*100;
        
        System.out.println("Taxable Income: $"+ Income);
        System.out.println("Rate:"+tr+"%");
        System.out.println("Gross Tax:$" +gt);
        System.out.println("Net Tax After Credits:$"+nt);
        System.out.println("Effective Tax Rate:" +et);
        scan.close();
    }
}

