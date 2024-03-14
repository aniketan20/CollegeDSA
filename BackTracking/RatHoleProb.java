/*
 * BackTracking: exploring all possibilities using recusrion
 * Rat hole problem
 * 1 means blocked and 0 means unblocked
 */
public class RatHoleProb {

    public static boolean ratHoleProblem(int arr[][], int i,int j) {
        if(i == arr.length - 1 && j == arr[0].length - 1) {
            return true;
        }

        int dx[] = {0,1,-1,0};
        int dy[] = {1,0,0,-1};

        for(int k = 0 ; k < 4 ; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            
            if(x < 0 || x >= arr.length || y < 0 || y >= arr[0].length || arr[x][y] == 1) {
                continue;
            }
            arr[x][y] = 2;
            // boolean flag = ratHoleProblem(arr, x, y);
            // if(flag)  return true;
            if(ratHoleProblem(arr, x, y))   return true;
            arr[x][y] = 0;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {0,0,1,1,1},
            {1,0,1,0,0},
            {0,0,1,1,1},
            {1,0,1,0,0},
            {1,0,0,0,0}
        };
        System.out.println(ratHoleProblem(arr,0,0));
    }
}