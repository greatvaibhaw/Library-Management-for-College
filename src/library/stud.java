
package library;

import java.awt.Dimension;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class stud extends javax.swing.JInternalFrame {

    ResultSet rs;
    conection conn=new conection();
    PreparedStatement pst;
    Dimension d=new Dimension();
    public stud() {
        initComponents();
        d=this.getSize();
        this.setSize(d.width+150,d.height+50);
        this.toFront();
        this.setLocation(220,50);
    }

    public void add()
    {
        jTable1.setModel(md=new javax.swing.table.DefaultTableModel(
    new Object [][] {},
    new String [] {
        "Select", "Student Name", "Father Name", "Mother Name", "Class", "Roll No.", "Mobile No.", "E-Mail", "Address", "Session"
    }
    ) {
    Class[] types = new Class [] {
        java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
    };
        public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }
    });

    try
    {
        String s1,s2,s3,s4,s5,s6,s7,s8,s9;
        conn.connect();
        rs=conn.st.executeQuery("select * from student ORDER BY Roll");
        while(rs.next())
        {
            s1=rs.getString(1);
            s2=rs.getString(2);
            s3=rs.getString(3);
            s4=rs.getString(4);
            s5=rs.getString(5);
            s6=rs.getString(6);
            s7=rs.getString(7);
            s8=rs.getString(8);
            s9=rs.getString(10);
            md.addRow(new Object[]{false,s1,s2,s3,s4,s5,s6,s7,s8,s9});
            jTable1.setModel(md);
        }
        conn.con.close();
    }
    catch(Exception e){System.out.println(e);}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setClosable(true);

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Student Name", "Father Name", "Mother Name", "Class", "Roll No.", "Mobile No.", "E-Mail", "Address", "Session"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
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
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(35);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JAGATPUR P.G. COLLEGE ");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ALL BCA STUDENTS");
        jPanel1.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i,ii=jTable1.getRowCount();
        kk=0;
        for(i=0;i<ii;i++)
        {
            if(jTable1.getValueAt(i, 0).toString().equals("true".toString()))
            {
                id[kk++]=jTable1.getValueAt(i, 5)+"";
            }
        }

            int n=1;
             String sw="aaa";
            for(i=0;i<kk;i++)
            {
                
               // System.out.println(Integer.parseInt(id[i]));
            try{
                conn.connect();
                   rs=conn.st.executeQuery("select * from Issue where S_ID = '"+id[i]+"'");
                   
                  if(rs.next())
                    sw=rs.getString(1);
                   if(!sw.toString().equals(id[i].toString()))
                   conn.st.executeUpdate("delete * from student where Roll = '"+id[i]+"'");
                   else
                   n=0;
                   conn.con.commit();
                   conn.con.close();
                }
                catch(SQLException e){ }
              }
            if(n==1)
            {
                JOptionPane.showMessageDialog(this, "Record Successfully Deleted !!");
                add();
            }
            if(n==0)
            {
                JOptionPane.showMessageDialog(this,"Some records can't be deleted \n Because they still have book");
                add();
            }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel md;
    boolean bb[]=new boolean[100];
    static String id[]=new String[100];
    static int kk=0;
}