public class Main {
    public static void main(String[] args) {

        Node d = new Node(null, null, "d");
        Node f = new Node (null, d, "f");
        Node e = new Node (null, null, "e");
        Node b = new Node (e, f, "b");
        Node c = new Node (null, null, "c");
        Node a = new Node(b,c, "a");

        System.out.println("\n BFS Traverse: ");
        ITreeTraverser bfsTraverser  = new BfsTreeTraverser();
        bfsTraverser.traverse(a);

        System.out.println("\nInOrder Iterative: ");
        ITreeTraverser inOrderTraverserIterative = new InorderIterative();
        inOrderTraverserIterative.traverse(a);

        System.out.println("\nInOrder Iterative 2: ");
        new InorderIterative().traverse2(a);


        System.out.println("\nInOrder Recursive: ");
        ITreeTraverser recursiveInOrderTraverser = new InorderRecursive();
        recursiveInOrderTraverser.traverse(a);


        System.out.println("\nPreOrder Recursive: ");
        ITreeTraverser recursivePreOrderTraverser = new PreorderRecursive();
        recursivePreOrderTraverser.traverse(a);


        System.out.println("\nPreOrder Iterative: ");
        ITreeTraverser preOrderIterative = new PreorderIterative();
        preOrderIterative.traverse(a);


        System.out.println("\nPostOrder Recursive: ");
        ITreeTraverser postorderRecursive = new PostorderRecursive();
        postorderRecursive.traverse(a);


        System.out.println("\nPostOrder Iterative: ");
        ITreeTraverser postorderIterative = new PostorderIterative();
        postorderIterative.traverse(a);
    }
}