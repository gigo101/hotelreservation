/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class CheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CheckIn
     */
    PreparedStatement pst=null;
    ResultSet rs=null;
    String sql=null;
    Connection conn=null;
    String tableindex;
    String roomname;
    String roomdescription;
    String roomprice;
    
    public CheckIn() {
        initComponents();
        conn=javaconnect.ConnecrDb();
        Update_table();
    }
    
public void Update_table(){
        
        try{
            //Statement st=conn.createStatement();
            String sql="Select roomid,roomname,roomtypedesc,format(roomprice,2) as price from rooms,roomtype where rooms.roomtypeid=roomtype.roomtypeid and rooms.available='Yes'";
            
            //rs=st.executeQuery(sql); //if using simple query not prepared statment
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            tbl_rooms.setModel(DbUtils.resultSetToTableModel(rs));     
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmd_checkin = new javax.swing.JButton();
        txt_roomid = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        cmd_cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_roomdescription = new javax.swing.JTextField();
        txt_customername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_roomname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_rooms = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(24, 22, 235)), "Check In", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(16, 31, 233))); // NOI18N

        jLabel5.setText("Description");

        cmd_checkin.setText("Check In");
        cmd_checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_checkinActionPerformed(evt);
            }
        });

        txt_roomid.setFocusable(false);

        txt_price.setFocusable(false);

        cmd_cancel.setText("Close");
        cmd_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_cancelActionPerformed(evt);
            }
        });

        jLabel3.setText("Customer Name");

        jLabel1.setText("Room Id");

        txt_roomdescription.setFocusable(false);

        jLabel2.setText("Room Name");

        txt_roomname.setFocusable(false);

        jLabel4.setText("Price");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_roomid, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_roomname)
                    .addComponent(txt_customername)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmd_checkin)
                        .addGap(18, 18, 18)
                        .addComponent(cmd_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txt_roomdescription, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_roomid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_roomname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_roomdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_customername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_checkin)
                    .addComponent(cmd_cancel))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Room", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(25, 20, 241))); // NOI18N

        tbl_rooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_rooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_roomsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_rooms);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-839)/2, (screenSize.height-512)/2, 839, 512);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_cancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cmd_cancelActionPerformed

    private void tbl_roomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_roomsMouseClicked
        // TODO add your handling code here:
        int row=tbl_rooms.getSelectedRow();
        String Table_click= (tbl_rooms.getModel().getValueAt(row, 0).toString());
        tableindex=Table_click;  
        roomname=(tbl_rooms.getModel().getValueAt(row, 1).toString());
        roomdescription=(tbl_rooms.getModel().getValueAt(row, 2).toString());
        roomprice=(tbl_rooms.getModel().getValueAt(row, 3).toString());
        
        txt_roomid.setText(tableindex);
        txt_roomname.setText(roomname);
        txt_roomdescription.setText(roomdescription);
        txt_price.setText(roomprice);
    }//GEN-LAST:event_tbl_roomsMouseClicked

    private void cmd_checkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_checkinActionPerformed
        // TODO add your handling code here:
        if(txt_roomid.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Please select a room!");            
        
        }
        else{
            if(txt_customername.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please input Customer Name!"); 
            
            }
            else{
                            int p=JOptionPane.showConfirmDialog(null, "Are you sure you want to save this transaction?","Check In",JOptionPane.YES_NO_OPTION);
            if(p==0){
                sql="Insert into checkIn(roomid,customername,status,checkInDate) values (?,?,?, CURDATE())";
                try {
                    pst=conn.prepareStatement(sql);
                    pst.setString(1, tableindex);
                    pst.setString(2, txt_customername.getText());
                    pst.setString(3, "in");             
                    pst.execute();
            
                    JOptionPane.showMessageDialog(null, "Data saved!");
            
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
        
        
                try {
                    sql="Update rooms set Available=? where roomid=?";
                    pst=conn.prepareStatement(sql);
                    pst.setString(1, "No");
                    pst.setString(2, tableindex);
                    pst.execute();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
        
                    Update_table();
                    txt_customername.setText("");
                    txt_roomid.setText("");
                    txt_roomdescription.setText("");
                    txt_roomname.setText("");
                    txt_price.setText("");
             }
            
            }
        }
    }//GEN-LAST:event_cmd_checkinActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_cancel;
    private javax.swing.JButton cmd_checkin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_rooms;
    private javax.swing.JTextField txt_customername;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_roomdescription;
    private javax.swing.JTextField txt_roomid;
    private javax.swing.JTextField txt_roomname;
    // End of variables declaration//GEN-END:variables
}