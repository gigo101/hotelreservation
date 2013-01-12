
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class RoomType extends javax.swing.JFrame {

    /**
     * Creates new form RoomType
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String tableindex=null;
    String tabledescription=null;
    String tableprice=null;
    
    public RoomType() {
        initComponents();
        conn =javaconnect.ConnecrDb();
        Update_table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_roomtype = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cmd_delete = new javax.swing.JButton();
        cmd_add = new javax.swing.JButton();
        cmd_close = new javax.swing.JButton();
        cmd_edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tbl_roomtype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_roomtypeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_roomtype);

        cmd_delete.setText("Delete");
        cmd_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_deleteActionPerformed(evt);
            }
        });

        cmd_add.setText("Add");
        cmd_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_addActionPerformed(evt);
            }
        });

        cmd_close.setText("Close");
        cmd_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_closeActionPerformed(evt);
            }
        });

        cmd_edit.setText("Edit");
        cmd_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmd_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(cmd_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cmd_add)
                .addGap(18, 18, 18)
                .addComponent(cmd_edit)
                .addGap(18, 18, 18)
                .addComponent(cmd_delete)
                .addGap(18, 18, 18)
                .addComponent(cmd_close)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-637)/2, (screenSize.height-456)/2, 637, 456);
    }// </editor-fold>//GEN-END:initComponents

      private void Update_table(){
        
        try{
            //Statement st=conn.createStatement();
            String sql="Select roomtypeid,roomtypedesc,format(roomprice,2) as price from roomtype";
            
            //rs=st.executeQuery(sql); //if using simple query not prepared statment
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            tbl_roomtype.setModel(DbUtils.resultSetToTableModel(rs));     
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);    
            
        } finally{
            try {
                rs.close();
                pst.close();
                                
            } catch (Exception e) {
            }
        }
        
    }
      
    private void cmd_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_closeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cmd_closeActionPerformed

    private void cmd_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_addActionPerformed
        // TODO add your handling code here:
        new add_roomtype().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cmd_addActionPerformed

    private void tbl_roomtypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_roomtypeMouseClicked
        // TODO add your handling code here:
        int row=tbl_roomtype.getSelectedRow();
        String Table_click= (tbl_roomtype.getModel().getValueAt(row, 0).toString());
        tableindex=Table_click;
        String table_description=(tbl_roomtype.getModel().getValueAt(row, 1).toString());
        tabledescription=table_description;
        String table_price=(tbl_roomtype.getModel().getValueAt(row, 2).toString());
        tableprice=table_price;
    }//GEN-LAST:event_tbl_roomtypeMouseClicked

    private void cmd_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_editActionPerformed
        // TODO add your handling code here:
        new edit_roomtype(tableindex,tabledescription,tableprice).setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_cmd_editActionPerformed

    private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_deleteActionPerformed
        // TODO add your handling code here:
        int p=JOptionPane.showConfirmDialog(null,"Are you sure you want to delete?", "Delete",JOptionPane.YES_NO_OPTION);
        if(p==0){  
            try {
            String sql="Delete from roomtype where roomtypeid=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, tableindex);
            pst.execute();
            Update_table();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        }
    }//GEN-LAST:event_cmd_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomType().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_add;
    private javax.swing.JButton cmd_close;
    private javax.swing.JButton cmd_delete;
    private javax.swing.JButton cmd_edit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_roomtype;
    // End of variables declaration//GEN-END:variables
}