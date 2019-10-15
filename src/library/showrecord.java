package library;

import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class showrecord extends javax.swing.JFrame {

    ResultSet rs;
    conection conn=new conection();
    public showrecord(String t,int n,int c)
    {
        initComponents();
        this.setAlwaysOnTop(true);
         String c2,c3,c5,c6,s,c7;
        int c1,c4;
        this.setBounds(260,150,1000,450);
        DefaultTableModel md=new DefaultTableModel();
                        md.addColumn("Book ID");
                        md.addColumn("Book Title");
                        md.addColumn("Writer Name");
                        md.addColumn("Edition");
                        md.addColumn("Publication");
                        md.addColumn("Location");
                        md.addColumn("Availability");
                        jTable1.setModel(md);

        if(n==1)
        {
            if(c==1)
            {
                try
                {
                    conn.connect();
                    rs=conn.st.executeQuery("select Book_ID,Book_Title,Writer_Name,Edition_Year,Publication,Location,Avail from entry WHERE Book_Title LIKE '"+t+"%'");
                    while(rs.next())
                    {
                        c1=Integer.parseInt(rs.getInt(1)+"");
                        c2=rs.getString(2);
                        c3=rs.getString(3);
                        c4=Integer.parseInt(rs.getInt(4)+"");
                        c5=rs.getString(5);
                        c6=rs.getString(6);
                        c7=rs.getString(7);
                        md.addRow(new Object[]{c1 + "", c2, c3, c4 + "", c5, c6,c7});
                        jTable1.setModel(md);
                    }
                }
                catch(Exception e){}
           }
            if(c==2)
            {
                try
                {
                    conn.connect();
                    rs=conn.st.executeQuery("select Book_ID,Book_Title,Writer_Name,Edition_Year,Publication,Location,Avail from entry WHERE Book_Title LIKE '%"+t+"%'");
                    while(rs.next())
                    {
                        c1=Integer.parseInt(rs.getInt(1)+"");
                        c2=rs.getString(2);
                        c3=rs.getString(3);
                        c4=Integer.parseInt(rs.getInt(4)+"");
                        c5=rs.getString(5);
                        c6=rs.getString(6);
                        c7=rs.getString(7);
                        md.addRow(new Object[]{c1 + "", c2, c3, c4 + "", c5, c6,c7});
                        jTable1.setModel(md);
                    }
                }
                catch(Exception e){}
           }
        }
        if(n==2)
        {
            if(c==1)
            {
                try
                {
                    conn.connect();
                    rs=conn.st.executeQuery("select Book_ID,Book_Title,Writer_Name,Edition_Year,Publication,Location,Avail from entry WHERE Writer_Name LIKE '"+t+"%'");
                    while(rs.next())
                    {
                        c1=Integer.parseInt(rs.getInt(1)+"");
                        c2=rs.getString(2);
                        c3=rs.getString(3);
                        c4=Integer.parseInt(rs.getInt(4)+"");
                        c5=rs.getString(5);
                        c6=rs.getString(6);
                        c7=rs.getString(7);
                        md.addRow(new Object[]{c1 + "", c2, c3, c4 + "", c5, c6,c7});
                        jTable1.setModel(md);
                    }
                }
                catch(Exception e){}
            }
            if(c==2)
            {
                try
                {
                    conn.connect();
                    rs=conn.st.executeQuery("select Book_ID,Book_Title,Writer_Name,Edition_Year,Publication,Location,Avail from entry WHERE Writer_Name LIKE '%"+t+"%'");
                    while(rs.next())
                    {
                        c1=Integer.parseInt(rs.getInt(1)+"");
                        c2=rs.getString(2);
                        c3=rs.getString(3);
                        c4=Integer.parseInt(rs.getInt(4)+"");
                        c5=rs.getString(5);
                        c6=rs.getString(6);
                        c7=rs.getString(7);
                        md.addRow(new Object[]{c1 + "", c2, c3, c4 + "", c5, c6,c7});
                        jTable1.setModel(md);
                    }
                }
                catch(Exception e){}
            }
        }
    }

    public showrecord(int n) {
       initComponents();
       this.setAlwaysOnTop(true);
        String c2,c3,c5,c6,s,c7;
        int c1,c4;
        this.setBounds(260, 150, 900, 450);
        DefaultTableModel md=new DefaultTableModel();
                        md.addColumn("Book ID");
                        md.addColumn("Book Title");
                        md.addColumn("Writer Name");
                        md.addColumn("Edition");
                        md.addColumn("Publication");
                        md.addColumn("Location");
                        md.addColumn("Availability");
                        jTable1.setModel(md);

        try
        {
             conn.connect();
             rs=conn.st.executeQuery("select Book_ID,Book_Title,Writer_Name,Edition_Year,Publication,Location,Avail from entry");
             while(rs.next())
             {
                        c1=Integer.parseInt(rs.getInt(1)+"");
                        c2=rs.getString(2);
                        c3=rs.getString(3);
                        c4=Integer.parseInt(rs.getInt(4)+"");
                        c5=rs.getString(5);
                        c6=rs.getString(6);
                        c7=rs.getString(7);
                        if(c1==n)
                        {
                            md.addRow(new Object[]{c1 + "", c2, c3, c4 + "", c5, c6,c7});
                            jTable1.setModel(md);
                        }
            }
        }
        catch(Exception e){}
    }

    public showrecord() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(223, 223, 238));

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setDragEnabled(true);
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setIntercellSpacing(new java.awt.Dimension(1, 5));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel1.setBackground(new java.awt.Color(166, 236, 162));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Showing Record");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        
                new showrecord().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
