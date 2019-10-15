
package library;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class rethistory extends javax.swing.JInternalFrame {

    conection conn=new conection();
    ResultSet rs;
    public rethistory() {
        initComponents();
        set();
    }

    public void set()
    {
        String c1,c2,c3,c4,c5,c6,c7,c8,c9;
        int c10;
        DefaultTableModel md=new DefaultTableModel();
                        md.addColumn("Student ID");
                        md.addColumn("Student Name");
                        md.addColumn("Class");
                        md.addColumn("Book ID");
                        md.addColumn("Issue Date");
                        md.addColumn("Book Name");
                        md.addColumn("Writer Name");
                        md.addColumn("Publication");
                        md.addColumn("Return Date");
                        md.addColumn("Late Fees");
                        jTable1.setModel(md);

        try
        {
            conn.connect();
            rs=conn.st.executeQuery("select * from return");
            while(rs.next())
            {
                c1=rs.getString(1);
                c2=rs.getString(2);
                c3=rs.getString(3);
                c4=rs.getDate(4)+"";
                c5=rs.getString(5);
                c6=rs.getString(6);
                c7=rs.getString(7);
                c8=rs.getString(8);
                c9=rs.getDate(9)+"";
                c10=rs.getInt(10);
                md.addRow(new Object[]{c1,c2,c3,c5,c4,c6,c7,c8,c9,c10+""});
                jTable1.setModel(md);
            }
            conn.con.close();
        }
        catch(Exception e){System.out.println(e);}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(229, 247, 193));
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Return History");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-763)/2, (screenSize.height-443)/2, 763, 443);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
