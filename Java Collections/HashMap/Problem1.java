import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int tag=0,v1=0,v2=0;
        int []arr=new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,scan.nextInt());
        }
        int target=scan.nextInt();
        for(int i=0;i<n;i++){
            tag=target-map.get(i);
            if(map.containsValue(tag)){
                v1=i;
                for(int j=i+1;j<n;j++){
                    if(map.get(j)==tag){{
                        v2=j;
                        break;
                    }
                    }
                }
            }
            if(v2!=0){
                break;
            }
        }
        arr[0]=v1;
        arr[1]=v2;
            System.out.print(Arrays.toString(arr));
    }
}
