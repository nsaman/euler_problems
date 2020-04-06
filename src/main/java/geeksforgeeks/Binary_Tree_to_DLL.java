package geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
public class Binary_Tree_to_DLL {

    public static void main(String[] args) {
        String input = "2\n1 3 2\n10 20 30 40 60";
        String[] inputLines = input.split("\n");
        int testCount = Integer.parseInt(inputLines[0]);
        for (int i = 1; i<=testCount; i++) {
            BTreeNode bTree = new BTreeNode(inputLines[i], " ");
            DLLNode dll = bToDll(bTree, null);

            StringBuilder forward = new StringBuilder();
            forward.append(dll.getValue());
            while (dll.getNext() != null) {
                dll = dll.getNext();
                forward.append(" ");
                forward.append(dll.getValue());
            }
            System.out.println(forward.toString());

            StringBuilder backward = new StringBuilder();
            backward.append(dll.getValue());
            while (dll.getPrevious() != null) {
                dll = dll.getPrevious();
                backward.append(" ");
                backward.append(dll.getValue());
            }
            System.out.println(backward.toString());
        }
    }

    public static DLLNode bToDll(BTreeNode bTreeNode, DLLNode dllNode) {
        if(bTreeNode == null)
            return dllNode;

        DLLNode currentDllNode = dllNode;

        if(bTreeNode.getRight() != null)
            currentDllNode = bToDll(bTreeNode.getRight(), currentDllNode);

        DLLNode thisDllNode = new DLLNode(bTreeNode.getValue());
        if(currentDllNode != null) {
            currentDllNode.setPrevious(thisDllNode);
            thisDllNode.setNext(currentDllNode);
        }
        currentDllNode = thisDllNode;

        if(bTreeNode.getLeft() != null)
            currentDllNode = bToDll(bTreeNode.getLeft(), currentDllNode);

        return  currentDllNode;
    }

    public static class DLLNode {
        private String value;
        private DLLNode previous;
        private DLLNode next;

        public DLLNode(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public DLLNode getPrevious() {
            return previous;
        }

        public void setPrevious(DLLNode previous) {
            this.previous = previous;
        }

        public DLLNode getNext() {
            return next;
        }

        public void setNext(DLLNode next) {
            this.next = next;
        }
    }

    public static class BTreeNode {
        private String value;
        private BTreeNode left;
        private BTreeNode right;

        public BTreeNode(String value) {
            this.value = value;
        }

        public BTreeNode(String input, String deliminator) {
            List<String> inputs = Arrays.asList(input.split(deliminator));

            int depth = 0;
            while(inputs.size() > 0) {
                inputs = insertIntoTreeAtDepth(inputs, depth);
                depth++;
            }
        }

        public List<String> insertIntoTreeAtDepth(List<String> inputs, int depth) {
            if(inputs.size() == 0)
                return inputs;

            List<String> returnList = new ArrayList<>(inputs);

            // if we are at the 0 depth, fill the initial node
            if(depth == 0) {
                value = inputs.get(0);
                returnList.remove(inputs.get(0));
            }
            // else if 1 depth, create children
            else if (depth == 1) {
                left = returnList.get(0).equals("N") ? null :new BTreeNode(returnList.get(0));
                returnList.remove(returnList.get(0));

                if(returnList.size() > 0) {
                    right = returnList.get(0).equals("N") ? null :new BTreeNode(returnList.get(0));
                    returnList.remove(returnList.get(0));
                }
            }
            // else if we need to go deeper, transverse
            else {
                if (left != null)
                    returnList = left.insertIntoTreeAtDepth(returnList, depth - 1);
                if (right != null)
                    returnList = right.insertIntoTreeAtDepth(returnList, depth - 1);
            }

            return returnList;
        }

        public BTreeNode lca(String n1, String n2) {
            if (value.equals(n1) || value.equals(n2))
                return this;

            BTreeNode leftNode = null;
            if(left != null)
                leftNode = left.lca(n1, n2);

            BTreeNode rightNode = null;
            if(right != null)
                rightNode = right.lca(n1, n2);

            if(leftNode != null && rightNode != null)
                return this;
            else if(leftNode != null)
                return leftNode;
            else if(rightNode != null)
                return rightNode;

            return null;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public BTreeNode getLeft() {
            return left;
        }

        public void setLeft(BTreeNode left) {
            this.left = left;
        }

        public BTreeNode getRight() {
            return right;
        }

        public void setRight(BTreeNode right) {
            this.right = right;
        }
    }
}
