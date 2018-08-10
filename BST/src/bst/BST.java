package bst;

import javax.swing.UIManager;

public class BST {

    public static void main(String[] args) {
        String laf = "com.jtattoo.plaf.mint.MintLookAndFeel";
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            UIManager.setLookAndFeel(laf);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BSTView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BSTView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BSTView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BSTView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        BSTModel model = new BSTModel();
        BSTView view = new BSTView();
        BSTController controller = new BSTController(model, view);
        view.setVisible(true);

    }

}
