import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int[] h=new int[d];
        int count=0;
        for(int i=0;i<d;i++){
            h[i]=sc.nextInt();
        }
        for(int i=1;i<d;i++){
            if(h[i-1]<h[i]){
                count++;
            }
        }
        if(count==d-1){
            System.out.format("yes");
        }
        else{
            System.out.format("no");
        }
    }
}