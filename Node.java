import java.util.LinkedList;
import java.util.Queue;

public class Node {

    private Node left;
    private Node right;
    private String data;

    public Node(Node left, Node right, String data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public void print() {
        System.out.print(data + " ");
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
