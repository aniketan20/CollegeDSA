public class NQueen {


    public static void printArray(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int count = 0;

    public static boolean isSafe(int arr[][],int q,int i){
        for(int j = 0 ; j < q ; j++){
            if(arr[j][i] == 1){
                return false;
            }
        }
        for(int j = q-1 ; j >= 0 ; j--){
            if(i-j >= 0 && arr[j][i-j] == 1){
                return false;
            }
            if(i+j < arr.length && arr[j][i+j] == 1){
                return false;
            }
        }
        return true;
    }

    public static void nQueen(int arr[][],int j){
        if(j == arr.length){
            printArray(arr);
            count++;
            return;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(isSafe(arr, j, i)){
                arr[i][j] = 1;
                nQueen(arr, j+1);
            }
            arr[i][j] = 0;
        }
    }

    public static void main(String[] args) {
        int q = 4;
        int arr[][] = new int[q][q];
        nQueen(arr,0);
        
    }
}
