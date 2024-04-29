import java.util.*;

public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
        
    }

    public static Node insert(int[] arr, Node root, int i) {
        // if(arr[i] == -1)    return new Node();
        if (i < arr.length) {
            Node temp = new Node(arr[i]);
            root = temp;

            // insert left child
            root.left = insert(arr, root.left, 2 * i + 1);

            // insert right child
            root.right = insert(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    public static void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
        Node root = insert(arr, null, 0);
        levelOrder(root);
    }
}
