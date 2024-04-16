import java.util.*;

public class BinarySearchTree {

    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        if(root == null)    return new Node(val);
        if(root.data < val) root.right = insert(root.right, val);
        if(root.data > val) root.left = insert(root.left, val);
        return root;
    }

    public static void levelOrder(Node root) {
        LinkedList<Node> que = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)    return;

        que.add(root);
        res.add(root.data);
        System.out.println(root.data);
        while(!que.isEmpty()) {
            int x = que.size();
            while(x > 0){
                Node temp = que.poll();
                if(temp.left != null){
                    que.add(temp.left);
                    // res.add(temp.left.data);
                    System.out.print(temp.left.data+ " ");
                }
                if(temp.right != null) {
                    que.add(temp.right);
                    // res.add(temp.right.data);
                    System.out.print(temp.right.data+ " ");
                };
                x--;
                if(x == 0)    System.out.println();
            }
            
        }
    }

    public static void main(String[] args) {
        int arr[] = {11,7,15,5,9,17,16,21};

        Node root = new Node(arr[0]);
        for(int i = 1 ; i < arr.length ; i++){
            root = insert(root,arr[i]);
        }

        levelOrder(root);

    }
}
