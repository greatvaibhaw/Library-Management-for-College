
package library;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;
public class frame extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement st;
    PreparedStatement pst;
    Dimension d=new Dimension();
    static newentry nw=new newentry();
    static stentry sten=new stentry();
    static edit ed=new edit();
    static strecord sr=new strecord();
    static IssueBook isu=new IssueBook();
    public static front fn=new front();
    static reset rst=new reset();
    static returnbook rb=new returnbook();
    static stud sd=new stud();
    static opent pp1=new opent(0);
    static opent pp2=new opent(1);
    static opent pp3=new opent(2);
    static help hp=new help();
    static rethistory rh=new rethistory();
    static isbook ib=new isbook();
    String user = new com.sun.security.auth.module.NTSystem().getName().toString();
    rep rp=new rep();
    Font f=new Font("Times New Roman",Font.PLAIN,18);
    int w,h;
    String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};" +"DBQ=Record.mdb";
    public frame() {
        initComponents();
        jDesktopPane1.add(nw);
        jDesktopPane1.add(sten);
        jDesktopPane1.add(ed);
        jDesktopPane1.add(sr);
        jDesktopPane1.add(isu);
        jDesktopPane1.add(rb);
        jDesktopPane1.add(sd);
        jDesktopPane1.add(hp);
        jDesktopPane1.add(rh);
        jDesktopPane1.add(ib);
        d=Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(d.width,d.height-25);
        jInternalFrame2.setVisible(false);
        jInternalFrame2.setBounds(150,65,1100,550);
        jInternalFrame2.setTitle("Showing Library Book Record");
        jPanel4.setSize(jInternalFrame2.getMaximumSize().width,50);
        if(fn.hide==0)
            jMenu3.setVisible(false);
        if(fn.hide==1)
            jMenu3.setVisible(true);
        this.setIconImage(new ImageIcon(getClass().getResource("book.png")).getImage());
        jMenu13.setFont(f);
    }
    private void destroy()
    {
        nw.dispose();
        sten.dispose();
        ed.dispose();
        sr.dispose();
        isu.dispose();
        rb.dispose();
        sd.dispose();
        pp1.dispose();
        pp2.dispose();
        pp3.dispose();
        hp.dispose();
        rh.dispose();
        ib.dispose();
    }
    
    public void data()
   {
       try
       {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           con=DriverManager.getConnection(url,user,"kingkhan");
           st=con.createStatement();
       }
       catch(SQLException e){
           url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)}; DBQ="+FileSystemView.getFileSystemView().getDefaultDirectory().getPath().toString()+File.separatorChar+"Record.mdb".toString();
           data();
       }
       catch(ClassNotFoundException e){JOptionPane.showMessageDialog(null,"Sorry Microsoft Access Driver Not Found in your System.");}
   }

   private void promo1(int n)
    {
       int k;
       if(n==0)
       {
           k=JOptionPane.showConfirmDialog(this,"Suerly Promote Students","Promoting BCA I - BCA II",2);
            if(k==0)
            {
            data();
            try
            {
                    st.executeUpdate("update student set Class = 'BCA II' where class = 'BCA I'");
                    JOptionPane.showMessageDialog(this,"Successfully Promoted");
            }
            catch(Exception e){}
            }
        }
       if(n==1)
       {
           k=JOptionPane.showConfirmDialog(this,"Suerly Promote Students","Promoting BCA II - BCA III",2);
            if(k==0)
            {
            data();
            try
            {
                    st.executeUpdate("update student set Class = 'BCA III' where class = 'BCA II'");
                    JOptionPane.showMessageDialog(this,"Successfully Promoted");
            }
            catch(Exception e){}
            }
        }
       if(n==2)
       {
           k=JOptionPane.showConfirmDialog(this,"Suerly Promote Students","Promoting BCA III - BCA IV",2);
            if(k==0)
            {
            data();
            try
            {
                    st.executeUpdate("update student set Class = 'BCA III' where class = 'BCA IV'");
                    JOptionPane.showMessageDialog(this,"Successfully Promoted");
            }
            catch(Exception e){}
            }
        }
       if(n==3)
       {
           k=JOptionPane.showConfirmDialog(this,"Suerly Promote Students","Promoting BCA IV - BCA V",2);
            if(k==0)
            {
            data();
            try
            {
                    st.executeUpdate("update student set Class = 'BCA V' where class = 'BCA IV'");
                    JOptionPane.showMessageDialog(this,"Successfully Promoted");
            }
            catch(Exception e){}
            }
        }
       if(n==4)
       {
           k=JOptionPane.showConfirmDialog(this,"Suerly Promote Students","Promoting BCA V - BCA VI",2);
            if(k==0)
            {
            data();
            try
            {
                    st.executeUpdate("update student set Class = ' ' where class = 'BCA VI'");
                    st.executeUpdate("update student set Class = 'BCA VI' where class = 'BCA V'");
                    JOptionPane.showMessageDialog(this,"Successfully Promoted");
            }
            catch(Exception e){}
            }
        }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jPopupMenu1.setBackground(new java.awt.Color(204, 255, 204));
        jPopupMenu1.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jPopupMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPopupMenu1.setLightWeightPopupEnabled(false);

        jMenuItem40.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jMenuItem40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Images/newFile.png"))); // NOI18N
        jMenuItem40.setText("New Book Entry");
        jMenuItem40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuItem40.setBorderPainted(true);
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem40);

        jMenuItem41.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jMenuItem41.setText("New Student Entry");
        jMenuItem41.setBorderPainted(true);
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem41);

        jMenu13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu13.setText("Search Books");
        jMenu13.setBorderPainted(true);
        jMenu13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu13ActionPerformed(evt);
            }
        });

        jMenuItem42.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jMenuItem42.setText("Search by Book Title");
        jMenuItem42.setBorderPainted(true);
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem42);

        jMenuItem43.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jMenuItem43.setText("Search by Book ID");
        jMenuItem43.setBorderPainted(true);
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem43);

        jMenuItem44.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jMenuItem44.setText("Search by Writer Name");
        jMenuItem44.setBorderPainted(true);
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem44);

        jPopupMenu1.add(jMenu13);

        jMenuItem45.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jMenuItem45.setText("Edit Book Records");
        jMenuItem45.setBorderPainted(true);
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem45);

        jMenuItem46.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jMenuItem46.setText("Edit Student Records");
        jMenuItem46.setBorderPainted(true);
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem46);

        jMenuItem47.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jMenuItem47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/can.png"))); // NOI18N
        jMenuItem47.setText("Exit");
        jMenuItem47.setBorderPainted(true);
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem47);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Jagatpur P.G. College Library Software");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 204));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));
        jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jDesktopPane1MouseReleased(evt);
            }
        });

        jInternalFrame2.setClosable(true);
        jInternalFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setTitle("Showing Record");
        jInternalFrame2.setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Showcard Gothic", 1, 36));
        jLabel12.setForeground(new java.awt.Color(102, 0, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("THE LIBRARY RECORD");
        jPanel1.add(jLabel12, java.awt.BorderLayout.CENTER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, new Boolean(false)},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "abc", "Title 2", "Title 3", "Title 4", "select"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(24);
        jTable1.setRowMargin(2);
        jTable1.setRowSelectionAllowed(false);
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText("Move Damaged");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("Export to Excel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jInternalFrame2.setBounds(10, 10, 170, 30);
        jDesktopPane1.add(jInternalFrame2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel4.setBackground(new java.awt.Color(227, 203, 124));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Images/newFile.png"))); // NOI18N
        jButton2.setToolTipText("New Book Entry");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton2.setIconTextGap(0);
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/save_h.png"))); // NOI18N
        jButton3.setToolTipText("Save Book Entry");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton3.setPreferredSize(new java.awt.Dimension(0, 0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Images/edit_n.png"))); // NOI18N
        jButton4.setToolTipText("Edit Books");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/import_icon_f.png"))); // NOI18N
        jButton5.setToolTipText("Show Library Store");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/USERS 2.gif"))); // NOI18N
        jButton6.setToolTipText("Student New Entry");
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Images/book1.png"))); // NOI18N
        jButton10.setToolTipText("Issue Books");
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/book2.jpg"))); // NOI18N
        jButton11.setToolTipText("Return Book");
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/logout.jpg"))); // NOI18N
        jButton9.setToolTipText("Logout");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 588, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1)))
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setInheritsPopupMenu(true);

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setMnemonic('F');
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI Black", 0, 14));
        jMenu1.setPreferredSize(new java.awt.Dimension(50, 25));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New Entry");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(137, 25));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Save");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(137, 25));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu8.setMnemonic('M');
        jMenu8.setText("Maintain");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 14));

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Update");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem5);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setText("Edit Record");
        jMenuItem15.setPreferredSize(new java.awt.Dimension(191, 25));
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem15);

        jMenu14.setText("Search By");

        jMenuItem48.setText("Book Title");
        jMenuItem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem48ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem48);

        jMenuItem13.setText("ID");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem13);

        jMenuItem14.setText("Author");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem14);

        jMenu8.add(jMenu14);

        jMenuItem12.setText("Show Library Store");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem12);

        jMenuBar1.add(jMenu8);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setMnemonic('B');
        jMenu2.setText("Book");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenu2.setMaximumSize(new java.awt.Dimension(65, 32767));
        jMenu2.setPreferredSize(new java.awt.Dimension(70, 23));

        jMenuItem7.setText("Issue Book");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Return Book");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem19.setText("Book Lost");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed1(evt);
            }
        });
        jMenu2.add(jMenuItem19);

        jMenuItem26.setText("Book Dameged");
        jMenuItem26.setPreferredSize(new java.awt.Dimension(175, 23));
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem26);

        jMenuBar1.add(jMenu2);

        jMenu9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu9.setMnemonic('S');
        jMenu9.setText("Student");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenu9.setPreferredSize(new java.awt.Dimension(75, 20));
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });

        jMenuItem16.setText("New Record");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem16);

        jMenuItem17.setText("Search Record");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem17);

        jMenuItem27.setText("Update Record");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem27);

        jMenu11.setText("Promote Students");
        jMenu11.setPreferredSize(new java.awt.Dimension(143, 23));

        jMenuItem20.setText("BCA I - BCA II");
        jMenuItem20.setPreferredSize(new java.awt.Dimension(200, 23));
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem20);

        jMenuItem21.setText("BCA II - BCA III");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem21);

        jMenuItem22.setText("BCA III - BCA IV");
        jMenuItem22.setPreferredSize(new java.awt.Dimension(125, 23));
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem22);

        jMenuItem23.setText("BCA IV - BCA V");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem23);

        jMenuItem24.setText("BCA V - BCA VI");
        jMenuItem24.setPreferredSize(new java.awt.Dimension(125, 23));
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem24);

        jMenu9.add(jMenu11);

        jMenuBar1.add(jMenu9);

        jMenu3.setMnemonic('A');
        jMenu3.setText("Administrator");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14));

        jMenuItem33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Key.png"))); // NOI18N
        jMenuItem33.setText("Change User & Password");
        jMenuItem33.setPreferredSize(new java.awt.Dimension(187, 23));
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem33);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/Lk.png"))); // NOI18N
        jMenuItem9.setText("Lock with security question");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenu4.setText("Show Report");
        jMenu4.setPreferredSize(new java.awt.Dimension(191, 25));

        jMenuItem6.setText("Prepare Invoice");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenu6.setText("Student Report");

        jMenuItem10.setText("All Student Report");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem18.setText("BCA I SEM");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem28.setText("BCA II SEM");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem28);

        jMenuItem29.setText("BCA III SEM");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem29);

        jMenuItem30.setText("BCA IV SEM");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem30);

        jMenuItem31.setText("BCA V SEM");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem31);

        jMenuItem32.setText("BCA VI SEM");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem32);

        jMenu4.add(jMenu6);

        jMenuItem11.setText("Damaged Book");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem25.setText("Library Stock");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem25);

        jMenu3.add(jMenu4);

        jMenuItem34.setText("Students Record ");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem34);

        jMenu10.setText("Clear Collected Money Records");

        jMenuItem35.setText("Student Fine Records");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem35);

        jMenuItem36.setText("Lost Book Records");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem36);

        jMenu3.add(jMenu10);

        jMenu12.setText("Book History");

        jMenuItem39.setText("Show Issue History");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem39);

        jMenuItem37.setText("Show Return History");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem37);

        jMenuItem38.setText("Clear Return History");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem38);

        jMenu3.add(jMenu12);

        jMenuBar1.add(jMenu3);

        jMenu5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu5.setText("Help");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenu5.setPreferredSize(new java.awt.Dimension(50, 20));
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(nw.isClosed())
        {
            nw.setVisible(true);
             jDesktopPane1.add(nw);
        }
        nw.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        nw.save();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        pp2.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        pp3.setVisible(true);
}//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        library();
        jInternalFrame2.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        if(ed.isClosed())
        {
            ed.setu();
            ed.setVisible(true);
            jDesktopPane1.add(ed);
        }
        ed.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        if(sten.isClosed())
        {
            sten.clean();
            sten.setVisible(true);
            jDesktopPane1.add(sten);
        }
        sten.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ed.update();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem16ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed1
        if(sten.isClosed())
        {
            sten.clean();
            sten.setVisible(true);
            jDesktopPane1.add(sten);
        }
        sten.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed1

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        if(sr.isClosed())
        {
            sr.clear();
            sr.setVisible(true);
            jDesktopPane1.add(sr);
        }
        sr.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int i,ii=jTable1.getRowCount();
        kk=0;
        for(i=0;i<ii;i++)
        {
            if(jTable1.getValueAt(i, 12).toString().equals("true".toString()))
            {
                id[kk++]=jTable1.getValueAt(i, 1)+"";
            }
        }
           
            int n=1;
            for(i=0;i<kk;i++)
            {
                data();
                System.out.print(Integer.parseInt(id[i]));
            try{

                   rs=st.executeQuery("select Avail from entry where Book_ID="+Integer.parseInt(id[i]));
                   rs.next();
                   if(rs.getString(1).equals("Yes"))
                   st.executeUpdate("delete * from entry where Book_ID="+Integer.parseInt(id[i]));
                   else
                      n=0;
                   con.close();
                }
                catch(SQLException e){ }
              }
            if(n==1)
            {
                JOptionPane.showMessageDialog(this, "Record Successfully Deleted !!");
                library();
            }
            if(n==0)
                   {
                          JOptionPane.showMessageDialog(this,"Some records can't be deleted \n Because they are not available");
                          library();
                   }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private String getCellValue(int x,int y)
    {
        return md.getValueAt(x, y).toString();
    }
    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1PropertyChange

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        if(isu.isClosed())
        {
            isu.cln();
            isu.setVisible(true);
            jDesktopPane1.add(isu);
        }
        isu.setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       new security().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(nw.isClosed())
        {
           nw.set();
           nw.setVisible(true);
            jDesktopPane1.add(nw);
        }
        nw.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         nw.save();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(ed.isClosed())
        {
            ed.setu();
            ed.setVisible(true);
            jDesktopPane1.add(ed);
        }
        ed.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        library();
        jInternalFrame2.setVisible(true);
        if(jInternalFrame2.isIcon())
        try {
            jInternalFrame2.setIcon(false);
        } catch (Exception e) {}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(sten.isClosed())
        {
            sten.setVisible(true);
            sten.clean();
            jDesktopPane1.add(sten);
        }
        sten.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       if(rb.isClosed())
        {
           rb.clr();
           rb.setVisible(true);
            jDesktopPane1.add(rb);
        }
        rb.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        // TODO add your handling code here:
        sr.stset();
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu9ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
        promo1(0);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
        promo1(2);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:
        promo1(4);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        new reset().setVisible(true);
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
       rp.reportI();
       rp.open();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       rp.reporta();
       rp.open();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       XSSFWorkbook wb=new XSSFWorkbook();
       XSSFSheet ws=wb.createSheet();
       TreeMap<String,Object[]> data=new TreeMap();
       data.put("-1",new Object[]{md.getColumnName(0),md.getColumnName(1),md.getColumnName(2),md.getColumnName(3),md.getColumnName(4),md.getColumnName(5),md.getColumnName(6),md.getColumnName(7),md.getColumnName(8),md.getColumnName(9),md.getColumnName(10),md.getColumnName(11),});
       for(int i=0;i<md.getRowCount();i++)
       {
           data.put(Integer.toString(i), new Object[]{getCellValue(i,0),getCellValue(i,1),getCellValue(i,2),getCellValue(i,3),getCellValue(i,4),getCellValue(i,5),getCellValue(i,6),getCellValue(i,7),getCellValue(i,8),getCellValue(i,9),getCellValue(i,10),getCellValue(i,11)});
       }
       Set<String> ids=data.keySet();
       XSSFRow row;
       int rowID=0;
       for(String key: ids)
       {
           row=ws.createRow(rowID++);
           Object[] values=data.get(key);

           int cellID=0;
           for(Object o: values)
           {
               Cell cell=row.createCell(cellID++);
               cell.setCellValue(o.toString());
           }
       }
       try
       {
           JFileChooser chooser=new JFileChooser();
           chooser.showSaveDialog(null);
           File f=chooser.getCurrentDirectory();
           String pt=chooser.getSelectedFile().getName();
           FileOutputStream fos=new FileOutputStream(new File(f.toString()+"/"+pt+".xlsx"));
           wb.write(fos);
           fos.close();
           JOptionPane.showMessageDialog(null,"Exported Successfully");
       }
       catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        int i,ii=jTable1.getRowCount();
        kk=0;
        for(i=0;i<ii;i++) {
            if(jTable1.getValueAt(i, 12).toString().equals("true".toString())) {
                id[kk++]=jTable1.getValueAt(i, 1)+"";
            }
        }
        for(i=0;i<kk;i++) {
            data();
            try{

                rs=st.executeQuery("select * from entry where Book_ID="+Integer.parseInt(id[i]));
                rs.next();
                if(rs.getString(12).equals("Yes")) {
                    st.executeUpdate("insert into damage values('"+rs.getDate(1)+" "+"','"+Integer.parseInt(id[i])+" "+"','"+rs.getString(3)+"','"+rs.getString(4)+"','"+rs.getInt(5)+" "+"',"
                            + "'"+rs.getString(6)+"','"+rs.getInt(7)+" "+"','"+rs.getString(8)+"','"+rs.getInt(9)+" "+"','"+rs.getString(10)+"','"+rs.getString(11)+"')");
                    st.executeUpdate("delete * from entry where Book_ID="+Integer.parseInt(id[i]));
                    JOptionPane.showMessageDialog(this,"Successfully moved to damaged Library");
                    library();
                    con.close();
                } else
                    JOptionPane.showMessageDialog(this,"The book is not available in Library"+"\n"+"Please return that book from students");
            } catch(SQLException e){}
        }
}//GEN-LAST:event_jButton8ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        data();
        try {
            int n=Integer.parseInt(JOptionPane.showInputDialog(this,"Enter Book ID","Damaged Book",2));
            rs=st.executeQuery("select * from entry where Book_ID="+n);
            rs.next();
            if(rs.getString(12).equals("Yes")) {
                st.executeUpdate("insert into damage values('"+rs.getDate(1)+" "+"','"+n+" "+"','"+rs.getString(3)+"','"+rs.getString(4)+"','"+rs.getInt(5)+" "+"',"
                        + "'"+rs.getString(6)+"','"+rs.getInt(7)+" "+"','"+rs.getString(8)+"','"+rs.getInt(9)+" "+"','"+rs.getString(10)+"','"+rs.getString(11)+"')");
                st.executeUpdate("delete from entry where Book_ID="+n);
                JOptionPane.showMessageDialog(this,"Successfully moved to damaged Library");
            } else
                JOptionPane.showMessageDialog(this,"The book is not available in Library"+"\n"+"Please return that book from students");
        } catch(NumberFormatException e){JOptionPane.showMessageDialog(this,"Wrong input !! not an book ID");} catch(SQLException e){}
}//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       if(isu.isClosed())
        {
            isu.cln();
            isu.setVisible(true);
            jDesktopPane1.add(isu);
        }
        isu.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(rb.isClosed()) {
            rb.clr();
            rb.setVisible(true);
            jDesktopPane1.add(rb);
        }
        rb.setVisible(true);
}//GEN-LAST:event_jButton11ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if(isu.isClosed())
        {
            isu.cln();
            isu.setVisible(true);
            jDesktopPane1.add(isu);
        }
        isu.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem19ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed1
        int id=Integer.parseInt(JOptionPane.showInputDialog(this,"Enter Book_ID","Book Losted",1));
        int val=Integer.parseInt(JOptionPane.showInputDialog(this,"Enter Book Price","Book Losted",1));
        data();
        try
        {
            st.executeUpdate("delete from entry where Book_ID="+id);
            st.executeUpdate("delete from Issue where Book_ID='"+id+""+"'");
            st.executeUpdate("insert into lost values('"+val+"')");
            st.executeUpdate("delete from return where Book_ID='"+id+""+"'");
            JOptionPane.showMessageDialog(this,"Fees Successfully Charged");
            con.commit();
            con.close();
        }
        catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_jMenuItem19ActionPerformed1

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        promo1(1);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        promo1(3);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        rp.reportII();
        rp.open();
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        rp.reportIV();
        rp.open();
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
       rp.reportV();
       rp.open();
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
       rp.reportVI();
       rp.open();
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      rp.invoice();
      rp.open();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        rp.dbreport();
        rp.open();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        rp.lbreport();
        rp.open();
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
       if(sd.isClosed())
        {
            sd.setVisible(true);
            jDesktopPane1.add(sd);
            sd.add();
        }
        sd.setVisible(true);
        sd.add();
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        rp.reportIII();
        rp.open();
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        if(hp.isClosed())
        {
           hp.setVisible(true);
            jDesktopPane1.add(hp);
        }
        hp.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        data();
        try
        {
            st.executeUpdate("update return set Late_Fee=0");
            JOptionPane.showMessageDialog(this,"Records cleared successfully");
            con.commit();
            con.close();
        }
        catch(Exception e){}
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        data();
        try
        {
            st.executeUpdate("delete Price from lost");
            JOptionPane.showMessageDialog(this,"Records cleared successfully");
            con.commit();
            con.close();
        }
        catch(Exception e){}
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
         if(rh.isClosed())
        {
           rh.setVisible(true);
            jDesktopPane1.add(rh);
        }
        rh.setVisible(true);
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        int n=JOptionPane.showConfirmDialog(this,"Surely clear Returned Book Records ?","Delete Returned Books",2);
        if(n==0)
        {
            data();
            try
            {
                st.executeUpdate("delete * from return");
                JOptionPane.showMessageDialog(this,"Records cleared successfully");
                con.commit();
                con.close();
            }
            catch(Exception e){}
        }
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        if(ib.isClosed())
        {
           ib.setVisible(true);
            jDesktopPane1.add(ib);
        }
        ib.setVisible(true);
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jDesktopPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MouseReleased
        if(evt.isPopupTrigger())
        {
            jPopupMenu1.show(jDesktopPane1,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_jDesktopPane1MouseReleased

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        if(nw.isClosed())
        {
           nw.set();
           nw.setVisible(true);
            jDesktopPane1.add(nw);
        }
        nw.setVisible(true);
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
        if(sten.isClosed())
        {
            sten.setVisible(true);
            sten.clean();
            jDesktopPane1.add(sten);
        }
        sten.setVisible(true);
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jMenu13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu13ActionPerformed

    }//GEN-LAST:event_jMenu13ActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        pp1.setVisible(true);
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        pp2.setVisible(true);
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
        pp3.setVisible(true);
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
        if(ed.isClosed())
        {
            ed.setu();
            ed.setVisible(true);
            jDesktopPane1.add(ed);
        }
        ed.setVisible(true);
    }//GEN-LAST:event_jMenuItem45ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        if(sr.isClosed())
        {
            sr.clear();
            sr.setVisible(true);
            jDesktopPane1.add(sr);
        }
        sr.setVisible(true);
    }//GEN-LAST:event_jMenuItem46ActionPerformed

    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem47ActionPerformed

    private void jMenuItem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem48ActionPerformed
        pp1.setVisible(true);
    }//GEN-LAST:event_jMenuItem48ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new front().setVisible(true);
        destroy();
        this.dispose();
}//GEN-LAST:event_jButton9ActionPerformed

    public void library()
    {
        String c1,c3,c4,c6,c8,c10,c11,c12;
        int c2,c5,c7,c9;


        jTable1.setModel(md=new javax.swing.table.DefaultTableModel(
    new Object [][] {
        
    },new String [] {"Entry Date","Book ID","Book Title","Writer Name","Edition","Publication","Book Received Year","Received Place","Price","Book Detail","Location","Availability","Select"}

) {
    Class[] types = new Class [] {
         Object.class,Object.class,Object.class,Object.class,Object.class,Object.class,Object.class,Object.class,Object.class,Object.class,Object.class,Object.class,Boolean.class
    };
    public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }
});

            try
            {
             data();
             rs=st.executeQuery("select * from entry order by Book_ID");
             while(rs.next())
             {
                        c1=rs.getDate(1)+"";
                        c2=Integer.parseInt(rs.getInt(2)+"");
                        c3=rs.getString(3);
                        c4=rs.getString(4);
                        c5=Integer.parseInt(rs.getInt(5)+"");
                        c6=rs.getString(6);
                        c7=Integer.parseInt(rs.getInt(7)+"");
                        c8=rs.getString(8);
                        c9=Integer.parseInt(rs.getInt(9)+"");
                        c10=rs.getString(10);
                        c11=rs.getString(11);
                        c12=rs.getString(12);
                        md.addRow(new Object[]{c1 + "", c2 + "", c3, c4 , c5 + "", c6, c7 + "", c8, c9 + "", c10, c11,c12,false});
                        jTable1.setModel(md);
                        
            }
             con.close();
        }
        catch(Exception e){System.out.println(e);}
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        new frame().setVisible(true);
    }
    public void look()
    {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
 DefaultTableModel md;
 boolean bb[]=new boolean[100];
 static String id[]=new String[100];
 static int kk=0;
}
