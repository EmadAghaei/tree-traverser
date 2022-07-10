public class PreorderRecursive implements ITreeTraverser{
    @Override
    public void traverse(Node root) {
        if(root ==null) return;
        root.print();
        traverse(root.getLeft());
        traverse(root.getRight());
    }
}
