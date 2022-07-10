import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class InorderIterative implements ITreeTraverser {

    @Override
    public void traverse(Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.getLeft();
            } else {
                curr = stack.pop();
                curr.print();
                curr = curr.getRight();
            }
        }
    }

    public void traverse2(Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<>();
        stack.push(root);
        visited.add(root);
        while (!stack.isEmpty()) {
            Node n = stack.peek();
            if (n.getLeft() == null && n.getRight() == null) {
                n.print();
                stack.pop();
            }
            if (n.getRight() != null) {
                if (!visited.contains(n.getRight())) {
                    stack.pop();
                    stack.push(n.getRight());
                    visited.add(n.getRight());
                    stack.push(n);
                } else {
                    n.print();
                    stack.pop();
                }
            }

            if (n.getLeft() != null && !visited.contains(n.getLeft())) {
                stack.push(n.getLeft());
                visited.add(n.getLeft());
            }
        }
    }

}
