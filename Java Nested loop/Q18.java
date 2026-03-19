import java.util.*;
public class Q18{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r= scan.nextInt();
        int c= scan.nextInt();
        String arr[][]=new String[r][c];
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
              arr[i][j]=scan.next();
           }
            System.out.println();
}
            System.out.print("Day ");
            for(int i=1;i<=c;i++){
                System.out.print("Period"+i+" ");
            }
            System.out.println();
       for(int i=0;i<r;i++){
           switch(i){
               case 0: System.out.print("Monday ");
                    break;
               case 1: System.out.print("Tuesday ");
               break;
               case 2: System.out.print("Wednesday ");
               break;
               case 3: System.out.print("Thursday ");
               break;
               case 4: System.out.print("Friday ");
               break;
               case 5: System.out.print("Saturday ");
               break;
           }
           for(int j=0;j<c;j++){
              System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
    }
}
