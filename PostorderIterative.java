import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class PostorderIterative implements ITreeTraverser{
    @Override
    public void traverse(Node root) {
        if(root ==null) return;
        Set<Node> traversedSet = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node n = stack.peek();
            if((n.getLeft() ==null && n.getRight()==null)
                    || (n.getLeft() !=null && traversedSet.contains(n.getLeft()))
                    || (n.getRight() !=null && traversedSet.contains(n.getRight()))){
                stack.pop();
                traversedSet.add(n);
                n.print();
            }
            if(n.getRight() !=null && !traversedSet.contains(n.getRight())){
                stack.push(n.getRight());
            }
            if(n.getLeft() !=null && !traversedSet.contains(n.getLeft())){
                stack.push(n.getLeft());
            }

        }
    }


}
