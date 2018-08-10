package bst;

public class BSTVisualisation {

    Node root;
    Node tmp;
    static int howMany = 0;
    static int width = 120;
    static int height = 80;

    public void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.getKey()) {
            root.setLeftChild(deleteRec(root.getLeftChild(), key));
        } else if (key > root.getKey()) {
            root.setRightChild(deleteRec(root.getRightChild(), key));
        } else {
            if (root.getLeftChild() == null) {
                return root.getRightChild();
            } else if (root.getLeftChild() == null) {
                return root.getLeftChild();
            }

            root.setKey(minValue(root.getRightChild()));
            root.setRightChild(deleteRec(root.getRightChild(), root.getKey()));
        }

        return root;
    }

    private int minValue(Node root) {
        int minv = root.getKey();
        while (root.getLeftChild() != null) {
            minv = root.getLeftChild().getKey();
            root = root.getLeftChild();
        }
        return minv;
    }

    public void add(Node root) {
        this.root = root;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
            root.x = 500;
            root.y = 10;
            howMany++;
        } else {
            boolean ok = true;
            tmp = root;
            while (ok) {
                if (tmp.getKey() > data) {
                    if (tmp.getLeftChild() == null) {
                        tmp.setLeftChild(node);
                        tmp.getLeftChild().x = tmp.x - width;
                        tmp.getLeftChild().y = tmp.y + height;
                        howMany++;
                        width -= 5;
                        ok = false;
                    } else {
                        tmp = tmp.getLeftChild();
                    }
                } else {
                    if (tmp.getRightChild() == null) {
                        tmp.setRightChild(node);
                        tmp.getRightChild().x = tmp.x + width;
                        tmp.getRightChild().y = tmp.y + height;
                        howMany++;
                        width -= 5;
                        ok = false;
                    } else {
                        tmp = tmp.getRightChild();
                    }
                }
            }
        }
    }

}
