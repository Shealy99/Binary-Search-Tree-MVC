package bst;

import java.awt.event.ActionListener;

public class BSTView extends javax.swing.JFrame {

    public BSTView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 255, 219));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel1.setText("Binary Search tree");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 10, 290, 52);

        jTextField1.setToolTipText("Enter a number.");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(30, 110, 120, 30);

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel2.setText("Add a node");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(51, 89, 70, 17);

        jTextField2.setToolTipText("Enter a number.");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(30, 180, 120, 30);

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel3.setText("Delete a node");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(44, 160, 90, 17);

        jPanel2.setBackground(new java.awt.Color(26, 62, 41));
        jPanel2.setForeground(new java.awt.Color(35, 84, 56));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PreOrder", jPanel2);

        jPanel3.setBackground(new java.awt.Color(35, 84, 56));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("InOrder", jPanel3);

        jPanel4.setBackground(new java.awt.Color(43, 103, 69));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Postorder", jPanel4);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(217, 89, 237, 136);

        jButton1.setText("Print");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 240, 61, 26);

        jButton2.setText("Search Node");
        jPanel1.add(jButton2);
        jButton2.setBounds(300, 240, 107, 26);

        jButton3.setText("Delete Tree");
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 234, 110, 26);

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(430, 240, 20, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void addNewListener(ActionListener l) {
        jButton4.addActionListener(l);
    }

    public int getInsertKey() {
        return Integer.parseInt(jTextField1.getText());
    }

    public int getDeleteKey() {
        return Integer.parseInt(jTextField2.getText());
    }

    public void addPrintListener(ActionListener al) {
        jButton1.addActionListener(al);
    }

    public void setPre(String txt) {
        jLabel4.setText(txt);
    }

    public void setIn(String txt) {
        jLabel5.setText(txt);
    }

    public void setPost(String txt) {
        jLabel6.setText(txt);
    }

    public void emptyTextField() {
        jTextField1.setText("");
        jTextField2.setText("");
    }

    public void addSearchListener(ActionListener al) {
        jButton2.addActionListener(al);
    }

    public void addInsertionListener(ActionListener l) {
        jTextField1.addActionListener(l);
    }

    public void addDeletionListener(ActionListener l) {
        jTextField2.addActionListener(l);
    }

    public void addResetListener(ActionListener l) {
        jButton3.addActionListener(l);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
