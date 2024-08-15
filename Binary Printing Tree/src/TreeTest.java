public class TreeTest {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();

        int[] values = {97, 39, 72, 83, 8, 58, 17, 5, 71, 30};

        System.out.print("\n\nInserting the following values: ");
        for (int value : values) {
            System.out.print(value + " ");
            tree.add(value);
        }

        // Traversals
        System.out.println("\n\nPreorder traversal:");
        tree.preorderTraversal();

        System.out.println("\n\nInorder traversal:");
        tree.inorderTraversal();

        System.out.println("\n\nPostorder traversal:");
        tree.postorderTraversal();

        // Output tree structure
        System.out.println("\n\nTree structure:");
        tree.outputTree(0);
    }
}
