public class InorderRecursive implements ITreeTraverser {

    @Override
    public void traverse(Node node) {
        if(node == null) return;
        traverse(node.getLeft());
        node.print();
        traverse(node.getRight());
    }

}
