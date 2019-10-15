
package library;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;

public class opent extends javax.swing.JDialog {

    
    ButtonGroup g=new ButtonGroup();

    conection conn=new conection();
    ResultSet rs;
    int n=0;
    public opent(int h) {
        initComponents();
        this.setAlwaysOnTop(true);
        add(jLabel1);
        add(jLabel2);
        add(jTextField1);
        add(jButton1);
        add(jLabel4);
        add(jLabel3);
        add(jCheckBox1);
        add(jCheckBox2);
        jTextField1.setText("");
        n=h;
        jTextField1.requestFocus();
        g.add(jCheckBox1);
        g.add(jCheckBox2);
        jCheckBox1.setSelected(true);
        this.setResizable(false);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){}
    }

    public opent() {
        initComponents();
        add(jLabel1);
        add(jLabel2);
        add(jTextField1);
        add(jButton1);
        add(jLabel4);
        add(jLabel3);
        add(jCheckBox1);
        add(jCheckBox2);
        g.add(jCheckBox1);
        g.add(jCheckBox2);
    }

    public void search()
    {
        if(n==0)
        {
        if(jCheckBox1.isSelected())
        {
            if(!jTextField1.getText().equals(""))
            {
            String t1;
            try {
                    t1 = jTextField1.getText(0,3);
                    boolean b=false;

                    conn.connect();
                    rs = conn.st.executeQuery("Select Book_Title from entry WHERE Book_Title LIKE '"+t1+"%'");
                    while(rs.next())
                    {
                       String h=rs.getString(1);
                       h=h.substring(0,3);
                        if(h.equalsIgnoreCase(t1.toString()))
                        {
                            b = true;
                            break;
                        }
                    }
                    if(b==false)
                        JOptionPane.showMessageDialog(this,"No Record found");

                      conn.con.close();
                    if(b==true)
                    {
                        showrecord sr1 = new showrecord(t1,1,1);
                        sr1.setVisible(true);
                        this.setVisible(false);
                        this.dispose();
                    }
                }
                catch (Exception e) {}
            }
         }

        if(jCheckBox2.isSelected())
        {
          if(!jTextField1.getText().equals(""))
          {
            String t1;
            try {
                    t1 = jTextField1.getText();
                        showrecord sr1 = new showrecord(t1,1,2);
                        sr1.setVisible(true);
                        this.setVisible(false);
                        this.dispose();

                }
                catch (Exception e) {}
            }
        }

        }
        if(n==1)
        {            
            jLabel1.setText("Search Your record by ID");
            jLabel2.setText("Enter ID");
            jCheckBox1.setEnabled(false);
            jCheckBox1.setSelected(false);
            jCheckBox2.setEnabled(false);
            jCheckBox2.setSelected(false);
            int t1=Integer.parseInt(jTextField1.getText());
            showrecord sr1 = new showrecord(t1);
            sr1.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
        if(n==2)
        {
             jLabel1.setText("Search Your record by Author Name");
            jLabel2.setText("Enter Author Name");
            if(jCheckBox1.isSelected())
            {
              if(!jTextField1.getText().equals(""))
              {
                String t1;
                try {
                    t1 = jTextField1.getText(0,3);
                    boolean b=false;

                    conn.connect();
                    rs = conn.st.executeQuery("Select Writer_Name from entry WHERE Writer_Name LIKE '"+t1+"%'");
                    while(rs.next())
                    {
                       String h=rs.getString(1);
                       h=h.substring(0,3);
                        if(h.equalsIgnoreCase(t1.toString()))
                        {
                            b = true;
                            break;
                        }
                    }
                    if(b==false)
                        JOptionPane.showMessageDialog(this,"No Record found");
                    conn.con.close();
                    if(b==true)
                    {
                        showrecord sr1 = new showrecord(t1,2,1);
                        sr1.setVisible(true);
                        this.setVisible(false);
                        this.dispose();
                    }
                }
                catch (Exception e) {}
          }
       }
       if(jCheckBox2.isSelected())
        {
            if(!jTextField1.getText().equals(""))
              {
                String t1;
                try {
                       t1 = jTextField1.getText();
                       showrecord sr1 = new showrecord(t1,2,2);
                        sr1.setVisible(true);
                        this.setVisible(false);
                        this.dispose();
                    }
                catch (Exception e) {}
            }
        }
   
    }
    
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Your record by Title");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter Title");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Advance Search");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Matching Search");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jCheckBox2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox2))
                .addGap(37, 37, 37))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-462)/2, (screenSize.height-261)/2, 462, 261);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Title field is empty");
                jCheckBox1.setSelected(false);
            }
        else
            search();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            if(jTextField1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Title field is empty");
                jCheckBox1.setSelected(false);
            }
        else
            search();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
            jTextField1.requestFocus();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
         if(jCheckBox2.isSelected())
            jTextField1.requestFocus();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
            search();
        }
        catch(Exception e){}
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        
               new opent().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
