public class Permutation {

    public static void permutation(char arr[],int vis[],int pos,char ans[]){
        if(pos == arr.length){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(vis[i] == 0){
                vis[i] = 1;
                ans[pos] = arr[i];
                permutation(arr,vis,pos+1,ans);
                vis[i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        int vis[] = new int[str.length()];
        char ans[] = new char[str.length()];
        char arr[] = str.toCharArray();
        permutation(arr,vis,0,ans);
    }
}