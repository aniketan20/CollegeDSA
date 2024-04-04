import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * LevelOrderTraversal
 */
public class LevelOrderTraversal {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
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

    public static void leftView(Node root) {
        LinkedList<Node> que = new LinkedList<>();
        if(root == null)    return;

        que.add(root);
        while(!que.isEmpty()) {
            int x = que.size();

            for(int i = 0 ; i < x ; i++) {
                Node temp = que.peek();
                if(i == 0) System.out.print(que.peek().data+" ");
                que.pop();
                if(temp.left != null){
                    que.add(temp.left);
                }
                if(temp.right != null) {
                    que.add(temp.right);
                };   
            }
            
        }
    }

    public static void rightView(Node root) {
        LinkedList<Node> que = new LinkedList<>();
        if(root == null)    return;

        que.add(root);
        while(!que.isEmpty()) {
            int x = que.size();
            while(x > 0){
                Node temp = que.poll();
                if(temp.left != null){
                    que.add(temp.left);
                }
                if(temp.right != null) {
                    que.add(temp.right);
                };
                x--;
                if(x == 0){
                    System.out.print(temp.data+" ");
                }
            }
            
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.right.right.left = new Node(8);

        levelOrder(root);
        // leftView(root);
        // rightView(root);
    }
}