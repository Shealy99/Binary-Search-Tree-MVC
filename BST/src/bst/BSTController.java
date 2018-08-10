package bst;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class BSTController {

    BSTModel model = new BSTModel();
    BSTView view = new BSTView();
    GraphicTree g = new GraphicTree();

    public BSTController(BSTModel model, BSTView view) {
        this.model = model;
        this.view = view;
        view.addInsertionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int key = view.getInsertKey();
                model.insert(key);
                g.add(key);
                view.emptyTextField();
            }
        });
        view.addDeletionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int key = view.getDeleteKey();
                model.deleteKey(key);
                view.emptyTextField();
                g.deleteKey(key);

            }
        });

        view.addNewListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                g.getReady(g.root);
                g.drawTree();
            }
        });

        view.addSearchListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String output = JOptionPane.showInputDialog("Enter the number you want to find on the tree:");
                try {
                    int searchKey = Integer.parseInt(output);
                    Node node = model.search(model.getRoot(), searchKey);
                    if (node == null) {
                        JOptionPane.showMessageDialog(null, "Node not found!");
                    } else {
                        String[] options = {"Ok", "Find Path"};
                        int response = JOptionPane.showOptionDialog(view, "     Node with key= " + searchKey + " is found on the tree!",
                                "Successful search!", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, "Ok");
                        if (response == JOptionPane.NO_OPTION) {
                            JOptionPane.showMessageDialog(view, model.getPath(new StringBuilder(), model.getRoot(), searchKey));
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Enter a number!!!");
                }
            }
        });
        view.addPrintListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                StringBuilder sb = new StringBuilder();
                sb.delete(0, sb.length());
                view.setIn(model.getInOrder(sb, model.getRoot()).toString());
                sb.delete(0, sb.length());
                view.setPre(model.getPreOrder(sb, model.getRoot()).toString());
                sb.delete(0, sb.length());
                view.setPost(model.getPostOrder(sb, model.getRoot()).toString());

            }
        }
        );
        view.addResetListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setRoot(null);
            }
        });
    }

}
