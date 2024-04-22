import java.util.Scanner;

public class Robbery {


    public static int maxMoney(int nums[],int n){
        if(n == 1)  return nums[0];
        if(n == 2)  return Math.max(nums[0],nums[1]);
        for(int i = 2 ; i < nums.length ; i++){
            int x = i - 2;
            int max = 0;
            while(x >= 0){
                max = Math.max(max,nums[x]+nums[i]);
                x--;
            }
            nums[i] = max;
        }
        return Math.max(nums[n-1],nums[n-2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(maxMoney(nums,n));
        
    }
}
