import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        char  ch[]=s.toCharArray();
        int fre[]=new int[256];
        for(int i=0;i<ch.length;i++){
            fre[ch[i]]++;
        }
        for(int i=0;i<ch.length;i++){
            if(fre[ch[i]]>0){
                System.out.print(ch[i]+"-"+fre[ch[i]]+" ");
                fre[ch[i]]=0;
            }

        }
    }
}
