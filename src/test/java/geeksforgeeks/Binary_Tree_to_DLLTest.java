package geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Binary_Tree_to_DLLTest {

    @Test
    public void testBTreeSimple() {
        Binary_Tree_to_DLL.BTreeNode bTree = new Binary_Tree_to_DLL.BTreeNode("1 3 2", " ");

        assertEquals("1", bTree.getValue());
        assertEquals("3", bTree.getLeft().getValue());
        assertEquals("2", bTree.getRight().getValue());
    }

    @Test
    public void testBTreeWithNulls() {
        Binary_Tree_to_DLL.BTreeNode bTree = new Binary_Tree_to_DLL.BTreeNode("1 2 3 N N 4 6 N 5 N N 7 N", " ");

        assertEquals("1", bTree.getValue());

        assertEquals("2", bTree.getLeft().getValue());
        assertNull(bTree.getLeft().getLeft());
        assertNull(bTree.getLeft().getRight());


        assertEquals("3", bTree.getRight().getValue());

        assertEquals("4", bTree.getRight().getLeft().getValue());
        assertNull(bTree.getRight().getLeft().getLeft());
        assertEquals("5", bTree.getRight().getLeft().getRight().getValue());
        assertEquals("7", bTree.getRight().getLeft().getRight().getLeft().getValue());
        assertNull(bTree.getRight().getLeft().getRight().getRight());

        assertEquals("6", bTree.getRight().getRight().getValue());
        assertNull(bTree.getRight().getRight().getLeft());
        assertNull(bTree.getRight().getRight().getRight());

    }

}