import java.util.Stack;

public class PreorderIterative implements ITreeTraverser{
    @Override
    public void traverse(Node root) {
        if(root ==null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node n = stack.pop();
//            if(n.getLeft() == null && n.getRight()== null){
                n.print();
//            }
            if(n.getRight() !=null){
                stack.push(n.getRight());
            }
            if(n.getLeft() !=null){
                stack.push(n.getLeft());
            }
        }

    }
}
