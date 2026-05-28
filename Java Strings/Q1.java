import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        int v=0,iv=0;
        int c1=0,c2=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='@'){
                if(i!=0 && i!=a.length()-1){
                    c1=1;
                }
            }
            if(a.charAt(i)=='.'){
                c2=1;
            }
        }
        if(c1==1 && c2==1){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }
}
