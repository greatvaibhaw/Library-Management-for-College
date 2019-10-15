package library;

import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
public class conection {
    Connection con;
    Statement st;
String user = new com.sun.security.auth.module.NTSystem().getName().toString();
    String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};" +"DBQ=Record.mdb";
    static String url2="LibReport.pdf";
    public void connect()
    {
        try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con = DriverManager.getConnection(url,user,"kingkhan");
                st = con.createStatement();
           }
           catch (SQLException e) {
                url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)}; DBQ="+FileSystemView.getFileSystemView().getDefaultDirectory().getPath().toString()+File.separatorChar+"Record.mdb".toString();
                url2=FileSystemView.getFileSystemView().getDefaultDirectory().getPath().toString()+File.separatorChar+"LibReport.pdf";
                connect();
           }
           catch(ClassNotFoundException e){JOptionPane.showMessageDialog(null,"Sorry Microsoft Access Driver Not Found in your System.");}
    }
    public static void main(String args[])
    {
        new conection();
    }

}
