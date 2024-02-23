import java.util.HashMap;

public class FrequencyArray {
    public static void main(String[] args) {

        int arr[] = {1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4};
        boolean visited[] = new boolean[arr.length];
        int j = 0;
        int x = 0; // for no. of iterations 

        // Brute Force - 1
        // for(int i = 0 ; i < arr.length ; i++) {
        //     int count = 1;
        //     for(j = i+1 ; j < arr.length ; j++) {
        //         if(arr[i] == arr[j] && !visited[j]) {
        //             count++;
        //             visited[j] = true;
        //         }
        //         x++;
        //     }
        //     if(!visited[i])  System.out.println(arr[i] + " " + count);
        // }

        // Brute Force - 2 (with less itearations)
        for(int i = 0 ; i < arr.length ; i++) {
            int count = 1;
            if(visited[i])  continue;
            for(j = i+1 ; j < arr.length ; j++) {
                if(arr[i] == arr[j] && !visited[j]) {
                    count++;
                    visited[j] = true;
                }
                x++;
            }
            System.out.println(arr[i] + " " + count);
        }

        // Optimized code using hashmap
        // HashMap <Integer,Integer> hm = new HashMap<>();
        // for(int i = 0 ; i < arr.length ; i++){
        //     // if(hm.containsKey(arr[i])){
        //     //     hm.put(arr[i], hm.get(arr[i])+1);
        //     // }
        //     // else{
        //     //     hm.put(arr[i], 1);
        //     // }
        //     hm.put(arr[i],hm.getOrDefault(arr[i], 0) + 1);
        //     x++;
        // }

        System.out.println(x);
    }
}

