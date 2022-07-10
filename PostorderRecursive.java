public class PostorderRecursive implements ITreeTraverser{
    @Override
    public void traverse(Node root) {
        if(root == null) return;
        traverse(root.getLeft());
        traverse(root.getRight());
        root.print();
    }
}
