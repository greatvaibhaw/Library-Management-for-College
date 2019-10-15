
package library;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhuwesh
 */
public class returnbook extends javax.swing.JInternalFrame {

    conection conn=new conection();
    ResultSet rs;
    PreparedStatement pst;
    public returnbook() {
        initComponents();
        this.setBounds(280,60,768,531);
        this.toFront();
        jLabel7.setVisible(false);
        jTextField2.setVisible(false);
    }

    public void getval(int n)
    {
        String s1;
        int id=1,im=1,iy=1,rd=1,rm=1,ry=1,rate,days;
        int i,ii=jTable1.getRowCount();
        for(i=0;i<ii;i++)
        {
            if(jTable1.getValueAt(i,0).toString().equals("true"))
            {
                days=1;
                rate=n;
                s1=jTable1.getValueAt(i,1).toString();
                iy=Integer.parseInt(s1.substring(0,4));
                im=Integer.parseInt(s1.substring(5,7));
                id=Integer.parseInt(s1.substring(8,10));
                rd=Integer.parseInt(jComboBox1.getSelectedItem().toString());
                rm=Integer.parseInt(jComboBox2.getSelectedItem().toString());
                ry=Integer.parseInt(jComboBox3.getSelectedItem().toString());
                days=((rd-id)+(rm-im)*30+(ry-iy)*365);
                rate=rate*(days-14);
                tdays=days-14;
                trate+=rate;
            }
        }
        if(tdays<=0 && trate<=0)
        {
            tdays=0;
            trate=0;
        }
        jLabel7.setText("Late fee for "+tdays+" days for returned books");
        jTextField2.setText("Rs. "+trate);
    }

    public void clr()
    {
        jTextField1.setText("");
        jTextField2.setText("");
        jLabel3.setText("............................");
        jLabel5.setText("..........................");
        jLabel7.setText("");
        jTable1.setVisible(false);
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Return Book");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Enter Student ID:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel4.setText("Class");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel3.setText("............................");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel5.setText("..........................");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jButton1.setText("Return Books");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 12));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Issue Date", "Book ID", "Book Name", "Writer Name", "Publication"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(6);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel6.setText("Returning Date");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBox3.setEditable(true);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel7.setText("Late Fees");
        jLabel7.setAutoscrolls(true);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jButton2.setText("Charge Late Fee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jButton1)
                .addGap(7, 7, 7)
                .addComponent(jButton2)
                .addContainerGap(297, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-768)/2, (screenSize.height-531)/2, 768, 531);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String s1,s2;
        try {
            conn.connect();
            pst = conn.con.prepareStatement("select * from student where Roll = ?");
            pst.setString(1,jTextField1.getText());
            rs=pst.executeQuery();
            if(jTextField1.getText().trim().equals("")) {
                jLabel3.setText("............................");
                jLabel5.setText("..........................");
                jTable1.setVisible(false);
            }
            if(rs.next()) {
                s1=rs.getString(1);
                jLabel3.setText(s1);
                s2=rs.getString(4);
                jLabel5.setText(s2);
                jTable1.setVisible(true);
                issue();
            } else {
                jLabel3.setText("............................");
                jLabel5.setText("..........................");
                jTable1.setVisible(false);
            }
        } catch (Exception e) {}
}//GEN-LAST:event_jTextField1KeyReleased

    private void issue()
    {
        jTable1.setModel(md=new javax.swing.table.DefaultTableModel(
    new Object [][] {},
    new String [] {
        "Select", "Issue Date", "Book ID", "Book Name", "Writer Name", "Publication"
    }
) {
    Class[] types = new Class [] {
        java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
    };

    public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }
});
    try
    {
        String s1,s2,s3,s4,s5;
        conn.connect();
        rs=conn.st.executeQuery("select * from Issue where S_ID = '"+jTextField1.getText()+"'");
        while(rs.next())
        {
            s1=rs.getString(4);
            s2=rs.getString(5);
            s3=rs.getString(6);
            s4=rs.getString(7);
            s5=rs.getString(8);
            md.addRow(new Object[]{false,s1,s2,s3,s4,s5});
            jTable1.setModel(md);
        }
        conn.con.close();
    }
    catch(Exception e){}

    }
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

}//GEN-LAST:event_jTextField1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i,ii=jTable1.getRowCount();
        kk=0;
        for(i=0;i<ii;i++)
        {
            if(jTable1.getValueAt(i,0).toString().equals("true".toString()))
            {
                id[kk++]=jTable1.getValueAt(i, 2)+"";
            }
        }
         String s1,s2,s3,s4,s5,s6,s7,s8,s9,s11,s12,s13,f,s10,p;
         int ln;
            for(i=0;i<kk;i++)
            {
                 conn.connect();
            try{
                   s1=jTextField1.getText();
                   s2=jLabel3.getText();
                   s3=jLabel5.getText();
                   s4=jTable1.getValueAt(i,1).toString();
                   s11=s4.substring(0,4);
                   s12=s4.substring(5,7);
                   s13=s4.substring(8,10);
                   f=s13+"-"+s12+"-"+s11;
                   System.out.println(s11+" "+s12+" "+s13);
                   s5=jTable1.getValueAt(i,2).toString();
                   s6=jTable1.getValueAt(i,3).toString();
                   s7=jTable1.getValueAt(i,4).toString();
                   s8=jTable1.getValueAt(i,5).toString();
                   s9=jComboBox1.getSelectedItem().toString()+"-"+jComboBox2.getSelectedItem().toString()+"-"+jComboBox3.getSelectedItem().toString();
                   p=jTextField2.getText();
                   ln=Integer.parseInt(p.substring(4,p.length()));
                   //System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+" "+s6+" "+s7+" "+s8+" "+s9+" "+trate+" "+ln);
                   conn.st.executeUpdate("insert into return values('"+s1+"','"+s2+"','"+s3+"','"+f+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+ln+"')");
                   conn.st.executeUpdate("delete from Issue where Book_ID='"+s5+"'");
                   conn.st.executeUpdate("update entry set Avail = 'Yes' where Book_ID ="+Integer.parseInt(id[i]));
                   JOptionPane.showMessageDialog(this, "Book Returned Successfully!!");
                   issue();
                   conn.con.commit();
                   conn.con.close();
                }
                catch(SQLException e){System.out.println(e);}
                 catch(NumberFormatException e){JOptionPane.showMessageDialog(this,"You inputed Wrong rate please include "+"\b"+"Rs.","",0);
                 jTextField2.requestFocus();}
                 catch(StringIndexOutOfBoundsException e){JOptionPane.showMessageDialog(this,"You inputed Wrong rate please include Rs. before value","",0);
                 jTextField2.requestFocus();}
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel7.setVisible(true);
        jTextField2.setVisible(true);
        int n=Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the Rate","Late fees Charge",1));
        getval(n);
        trate=0;tdays=0;
       // getval();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel md;
    static int kk=0;
    static String id[]=new String[100];
    int trate=0,tdays=0;
}
