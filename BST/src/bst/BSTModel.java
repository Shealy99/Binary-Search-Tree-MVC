package bst;

public class BSTModel {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        Node tmp = root;
        this.root = root;
        if (tmp.getKey() < this.root.getKey()) {
            this.root.setLeftChild(tmp);
        } else {
            this.root.setRightChild(tmp);
        }

    }

    public void createTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.getKey()) {
            root.setLeftChild(insertRec(root.getLeftChild(), key));
        } else if (key > root.getKey()) {
            root.setRightChild(insertRec(root.getRightChild(), key));
        }
        return root;
    }

//     public Node insert(int key, Node root) {
//        Node newNode = new Node(key);
//        if (root == null) {
//            return newNode;
//        } else {
//            if (key < root.getKey()) {
//                if (root.getLeftChild() == null) {
//                    root.setLeftChild(newNode);
//                } else {
//                    insert(key, root.getLeftChild());
//                }
//            } else {
//                if (root.getRightChild() == null) {
//                    root.setRightChild(newNode);
//                } else {
//                    insert(key, root.getRightChild());
//                }
//            }
//        }
//        return root;
//
//    }
    public void Postorder(Node node) {
        if (node == null) {
            return;
        }

        Postorder(node.getLeftChild());
        Postorder(node.getRightChild());
        System.out.print(node + "\t");
    }

    public void Inorder(Node node) {
        if (node == null) {
            return;
        }
        Inorder(node.getLeftChild());
        System.out.print(node + "\t");
        Inorder(node.getRightChild());
    }

    public Node search(Node root, int key) {
        if (root == null || root.getKey() == key) {
            return root;
        }

        if (root.getKey() > key) {
            return search(root.getLeftChild(), key);
        }

        return search(root.getRightChild(), key);
    }

    public void Preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node + "\t");
        Preorder(node.getLeftChild());
        Preorder(node.getRightChild());
    }

    public void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    public StringBuilder getInOrder(StringBuilder string, Node root) {
        if (root != null) {
            if (root.getLeftChild() != null) {
                getInOrder(string, root.getLeftChild());
            }
            string.append(root).append(", ");
            if (root.getRightChild() != null) {
                getInOrder(string, root.getRightChild());
            }
        }

        return string;
    }

    public StringBuilder getPreOrder(StringBuilder string, Node root) {
        if (root != null) {
            string.append(root).append(", ");
            if (root.getLeftChild() != null) {
                getInOrder(string, root.getLeftChild());
            }
            if (root.getRightChild() != null) {
                getInOrder(string, root.getRightChild());
            }
        }

        return string;
    }

    public StringBuilder getPostOrder(StringBuilder string, Node root) {
        if (root != null) {
            if (root.getLeftChild() != null) {
                getInOrder(string, root.getLeftChild());
            }
            if (root.getRightChild() != null) {
                getInOrder(string, root.getRightChild());
            }
            string.append(root).append(", ");
        }
        return string;
    }

    public StringBuilder getPath(StringBuilder sb, Node root, int key) {
        if (this.root == root) {
            sb.append("Rrenja, ");
        }
        if (root != null) {
            if (key == root.getKey()) {
                sb.append("Vlera");
            } else if (key > root.getKey()) {
                sb.append("biri i djathte, ");
                getPath(sb, root.getRightChild(), key);
            } else {
                sb.append("biri i majte, ");
                getPath(sb, root.getLeftChild(), key);
            }
        }
        return sb;
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
}
