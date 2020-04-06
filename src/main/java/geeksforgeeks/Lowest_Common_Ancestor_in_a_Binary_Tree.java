package geeksforgeeks;

// https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1
public class Lowest_Common_Ancestor_in_a_Binary_Tree {

    public static void main(String[] args) {
        String input = "3\n2 3\n1 2 3\n3 4\n5 2 N 3 4\n7 6\n1 2 3 N N 4 6 N 5 N N 7 N";
        String[] inputLines = input.split("\n");
        int testCount = Integer.parseInt(inputLines[0]);
        for (int i = 0; i<testCount; i++) {
            String[] searchedValues = inputLines[i*2 + 1].split(" ");
            Binary_Tree_to_DLL.BTreeNode bTree = new Binary_Tree_to_DLL.BTreeNode(inputLines[i*2 + 2], " ");

            System.out.println(bTree.lca(searchedValues[0],searchedValues[1]).getValue());
        }
    }
}
