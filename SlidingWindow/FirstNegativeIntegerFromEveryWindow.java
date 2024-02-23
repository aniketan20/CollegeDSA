/*
 *  arr[] = {-8,2,3,-6,1,-7,3}
 *  w = 3
 */

public class FirstNegativeIntegerFromEveryWindow {
    public static void main(String[] args) {
        int arr[] = {-8,2,3,-6,1,-7,3};
        int w = 3;
        int n = arr.length;
        
        //time complexity O(n*w)
        // boolean flag;
        // for(int i = 0 ; i < (n - w + 1) ; i++){
        //     flag = false;
        //     for(int j = 0 ; j < w ; j++){
        //         if(arr[i+j] < 0){
        //             System.out.print(arr[i+j] + " ");
        //             flag = true;
        //             break;
        //         }
        //     }
        //     if(!flag){
        //         System.out.print(null+" ");
        //     }
        // }

        //time complexity O(n)
        int NI=0,NE=0;
        for(int i = w - 1; i < n ; i++){
            while((NI < i) && (NI <= (i-w) || arr[NI] >= 0)){
                NI++;
            }
            if(arr[NI] < 0){
                NE = arr[NI];
            }
            else{
                NE = 0;
            }
            System.out.print(NE+" ");
        }
    }
}
