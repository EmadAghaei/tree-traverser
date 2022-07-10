import java.util.LinkedList;
import java.util.Queue;

public class BfsTreeTraverser  implements ITreeTraverser {
    @Override
    public void traverse(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {

            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node n = q.remove();
                if( n== null){
                    System.out.print(" (Null) ");
                }else {
                    System.out.print(" ("+n.getData() + ") ");
                    q.add(n.getLeft());
                    q.add(n.getRight());
                }
            }
            System.out.println();
        }
    }
}
