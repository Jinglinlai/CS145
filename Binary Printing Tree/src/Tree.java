// TreeNode class definition
class TreeNode<T extends Comparable<T>> {
   TreeNode<T> leftNode;
   T data;
   TreeNode<T> rightNode;

   public TreeNode(T nodeData) {
      data = nodeData;
      leftNode = rightNode = null;
   }
}

// Tree class definition with add, remove, and search methods
public class Tree<T extends Comparable<T>> {
   private TreeNode<T> root;

   public Tree() {
      root = null;
   }

   // Add node (iterative)
   public void add(T value) {
      if (root == null) {
         root = new TreeNode<>(value);
         return;
      }

      TreeNode<T> currentNode = root;
      TreeNode<T> parent = null;

      while (true) {
         parent = currentNode;
         if (value.compareTo(currentNode.data) < 0) {
            currentNode = currentNode.leftNode;
            if (currentNode == null) {
               parent.leftNode = new TreeNode<>(value);
               return;
            }
         } else if (value.compareTo(currentNode.data) > 0) {
            currentNode = currentNode.rightNode;
            if (currentNode == null) {
               parent.rightNode = new TreeNode<>(value);
               return;
            }
         } else {
            return; // Duplicate value, do nothing
         }
      }
   }

   // Remove node (recursive)
   public void remove(T value) {
      root = removeRecursive(root, value);
   }

   private TreeNode<T> removeRecursive(TreeNode<T> node, T value) {
      if (node == null) {
         return null;
      }

      if (value.compareTo(node.data) < 0) {
         node.leftNode = removeRecursive(node.leftNode, value);
      } else if (value.compareTo(node.data) > 0) {
         node.rightNode = removeRecursive(node.rightNode, value);
      } else {
         // Node to be deleted found
         if (node.leftNode == null) {
            return node.rightNode;
         } else if (node.rightNode == null) {
            return node.leftNode;
         }

         // Node with two children
         node.data = findMin(node.rightNode);
         node.rightNode = removeRecursive(node.rightNode, node.data);
      }
      return node;
   }

   private T findMin(TreeNode<T> node) {
      T minValue = node.data;
      while (node.leftNode != null) {
         node = node.leftNode;
         minValue = node.data;
      }
      return minValue;
   }

   // Search for a node (iterative)
   public boolean search(T value) {
      TreeNode<T> currentNode = root;

      while (currentNode != null) {
         if (value.compareTo(currentNode.data) < 0) {
            currentNode = currentNode.leftNode;
         } else if (value.compareTo(currentNode.data) > 0) {
            currentNode = currentNode.rightNode;
         } else {
            return true; // Value found
         }
      }
      return false; // Value not found
   }

   // Preorder traversal (recursive)
   public void preorderTraversal() {
      preorderHelper(root);
   }

   private void preorderHelper(TreeNode<T> node) {
      if (node == null) {
         return;
      }

      System.out.printf("%s ", node.data);
      preorderHelper(node.leftNode);
      preorderHelper(node.rightNode);
   }

   // Inorder traversal (recursive)
   public void inorderTraversal() {
      inorderHelper(root);
   }

   private void inorderHelper(TreeNode<T> node) {
      if (node == null) {
         return;
      }

      inorderHelper(node.leftNode);
      System.out.printf("%s ", node.data);
      inorderHelper(node.rightNode);
   }

   // Postorder traversal (recursive)
   public void postorderTraversal() {
      postorderHelper(root);
   }

   private void postorderHelper(TreeNode<T> node) {
      if (node == null) {
         return;
      }

      postorderHelper(node.leftNode);
      postorderHelper(node.rightNode);
      System.out.printf("%s ", node.data);
   }

   // Output tree structure
   public void outputTree(int totalSpace) {
      outputTreeHelper(root, totalSpace >= 0 ? totalSpace : 0);
   }

   private void outputTreeHelper(TreeNode<T> currentNode, int spaces) {
      if (currentNode != null) {
         outputTreeHelper(currentNode.rightNode, spaces + 5);

         for (int k = 0; k < spaces; k++) {
            System.out.print(" ");
         }

         System.out.println(currentNode.data);
         outputTreeHelper(currentNode.leftNode, spaces + 5);
      }
   }
}
