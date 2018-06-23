package bst;

public class Node implements Comparable<Node> {

    private int key;
    private Node leftChild;
    private Node rightChild;
    int x, y;

    public Node(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return key + "";
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Node) {
            Node n = (Node) o;
            return n.key == key;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Node n) {
        return key - n.key;
    }

}
