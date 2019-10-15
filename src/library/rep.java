package library;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.sql.*;
import java.util.Date;
public class rep {

    ResultSet rs,rs1;
    conection conn=new conection();
    String user = new com.sun.security.auth.module.NTSystem().getName().toString();
    int a=0,ft;String s;

    public void reporta()
    {
        try
        {
            Document document=new Document();
            PdfWriter.getInstance(document,new FileOutputStream(conn.url2));
            document.open();
            document.add(new Paragraph("Jagatpur P.G. College, Jagatpur",FontFactory.getFont(FontFactory.TIMES_BOLD,36,Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph("\n"+new Date().toString()));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------\n\n"));
            PdfPTable table=new PdfPTable(9);
            table.setWidthPercentage(105);
            PdfPCell cell=new PdfPCell(new Paragraph("All BCA Student Report"));
            cell.setColspan(9);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cell);
            table.addCell("Name ");
            table.addCell("Father Name");
            table.addCell("Mother Name ");
            table.addCell("Class");
            table.addCell("Roll No.");
            table.addCell("Mobile ");
            table.addCell("E-Mail ");
            table.addCell("Address ");
            table.addCell("Session ");
            conn.connect();
            rs=conn.st.executeQuery("select * from student ORDER BY Roll");
            while(rs.next())
            { 
            table.addCell(rs.getString(1));
            table.addCell(rs.getString(2));
            table.addCell(rs.getString(3));
            table.addCell(rs.getString(4));
            table.addCell(rs.getString(5));
            table.addCell(rs.getString(6));
            table.addCell(rs.getString(7));
            table.addCell(rs.getString(8));
            table.addCell(rs.getString(10));
            }
            conn.con.close();
            document.add(table);
            document.close();
        }
        catch(Exception e){System.out.println(e);}
    }
    public void reportI()
    {
        try
        {
            Document document=new Document();
            PdfWriter.getInstance(document,new FileOutputStream(conn.url2));
            document.open();
            document.add(new Paragraph("Jagatpur P.G. College, Jagatpur",FontFactory.getFont(FontFactory.TIMES_BOLD,36,Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph("\n"+new Date().toString()));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------\n\n"));
            PdfPTable table=new PdfPTable(9);
            table.setWidthPercentage(105);
             PdfPCell cell=new PdfPCell(new Paragraph("BCA I SEM Report"));
             cell.setColspan(9);
             cell.setHorizontalAlignment(Element.ALIGN_CENTER);
             cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cell);
            table.addCell("Name ");
            table.addCell("Father Name");
            table.addCell("Class ");
            table.addCell("Roll No.");
            table.addCell("Mobile ");
            table.addCell("E-Mail ");
            table.addCell("Address ");
            table.addCell("Session ");
            table.addCell("Book Issued ");
            conn.connect();
            rs=conn.st.executeQuery("select * from student WHERE Class='BCA I'");
            while(rs.next())
            {

                s=rs.getString(5);
                ft=cal(s);

            table.addCell(rs.getString(1));
            table.addCell(rs.getString(2));
            table.addCell(rs.getString(4));
            table.addCell(s);
            table.addCell(rs.getString(6));
            table.addCell(rs.getString(7));
            table.addCell(rs.getString(8));
            table.addCell(rs.getString(10));
            table.addCell(ft+"");
            }
            conn.con.close();
            document.add(table);
            document.close();
        }
        catch(Exception e){System.out.println(e);}
    }
    public void reportII()
    {
        try
        {
            Document document=new Document();
            PdfWriter.getInstance(document,new FileOutputStream(conn.url2));
            document.open();
            document.add(new Paragraph("Jagatpur P.G. College, Jagatpur",FontFactory.getFont(FontFactory.TIMES_BOLD,36,Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph("\n"+new Date().toString()));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------\n\n"));
            PdfPTable table=new PdfPTable(9);
            table.setWidthPercentage(105);
             PdfPCell cell=new PdfPCell(new Paragraph("BCA II SEM Report"));
             cell.setColspan(9);
             cell.setHorizontalAlignment(Element.ALIGN_CENTER);
             cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cell);
            table.addCell("Name ");
            table.addCell("Father Name");
            table.addCell("Class ");
            table.addCell("Roll No.");
            table.addCell("Mobile ");
            table.addCell("E-Mail ");
            table.addCell("Address ");
            table.addCell("Session ");
            table.addCell("Book Issued ");
            conn.connect();
            rs=conn.st.executeQuery("select * from student WHERE Class='BCA II'");
            while(rs.next())
            {
                s=rs.getString(5);
                ft=cal(s);

            table.addCell(rs.getString(1));
            table.addCell(rs.getString(2));
            table.addCell(rs.getString(4));
            table.addCell(s);
            table.addCell(rs.getString(6));
            table.addCell(rs.getString(7));
            table.addCell(rs.getString(8));
            table.addCell(rs.getString(10));
            table.addCell(ft+"");
            }
            conn.con.close();
            document.add(table);
            document.close();
        }
        catch(Exception e){System.out.println(e);}
    }
    public void reportIII()
    {
        try
        {
            Document document=new Document();
            PdfWriter.getInstance(document,new FileOutputStream(conn.url2));
            document.open();
            document.add(new Paragraph("Jagatpur P.G. College, Jagatpur",FontFactory.getFont(FontFactory.TIMES_BOLD,36,Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph("\n"+new Date().toString()));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------\n\n"));
            PdfPTable table=new PdfPTable(9);
            table.setWidthPercentage(105);
             PdfPCell cell=new PdfPCell(new Paragraph("BCA III SEM Report"));
             cell.setColspan(9);
             cell.setHorizontalAlignment(Element.ALIGN_CENTER);
             cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cell);
            table.addCell("Name ");
            table.addCell("Father Name");
            table.addCell("Class ");
            table.addCell("Roll No.");
            table.addCell("Mobile ");
            table.addCell("E-Mail ");
            table.addCell("Address ");
            table.addCell("Session ");
            table.addCell("Book Issued ");
            conn.connect();
            rs=conn.st.executeQuery("select * from student WHERE Class='BCA III'");
            while(rs.next())
            {
                s=rs.getString(5);
                ft=cal(s);

            table.addCell(rs.getString(1));
            table.addCell(rs.getString(2));
            table.addCell(rs.getString(4));
            table.addCell(s);
            table.addCell(rs.getString(6));
            table.addCell(rs.getString(7));
            table.addCell(rs.getString(8));
            table.addCell(rs.getString(10));
            table.addCell(ft+"");
            }
            conn.con.close();
            document.add(table);
            document.close();
        }
        catch(Exception e){System.out.println(e);}
    }
    public void reportIV()
    {
        try
        {
            Document document=new Document();
            PdfWriter.getInstance(document,new FileOutputStream(conn.url2));
            document.open();
            document.add(new Paragraph("Jagatpur P.G. College, Jagatpur",FontFactory.getFont(FontFactory.TIMES_BOLD,36,Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph("\n"+new Date().toString()));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------\n\n"));
            PdfPTable table=new PdfPTable(9);
            table.setWidthPercentage(105);
             PdfPCell cell=new PdfPCell(new Paragraph("BCA IV SEM Report"));
             cell.setColspan(9);
             cell.setHorizontalAlignment(Element.ALIGN_CENTER);
             cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cell);
            table.addCell("Name ");
            table.addCell("Father Name");
            table.addCell("Class ");
            table.addCell("Roll No.");
            table.addCell("Mobile ");
            table.addCell("E-Mail ");
            table.addCell("Address ");
            table.addCell("Session ");
            table.addCell("Book Issued ");
            conn.connect();
            rs=conn.st.executeQuery("select * from student WHERE Class='BCA IV'");
            while(rs.next())
            {
                s=rs.getString(5);
                ft=cal(s);

            table.addCell(rs.getString(1));
            table.addCell(rs.getString(2));
            table.addCell(rs.getString(4));
            table.addCell(s);
            table.addCell(rs.getString(6));
            table.addCell(rs.getString(7));
            table.addCell(rs.getString(8));
            table.addCell(rs.getString(10));
            table.addCell(ft+"");
            }
            conn.con.close();
            document.add(table);
            document.close();
        }
        catch(Exception e){System.out.println(e);}
    }
    public void reportV()
    {
        try
        {
            Document document=new Document();
            PdfWriter.getInstance(document,new FileOutputStream(conn.url2));
            document.open();
            document.add(new Paragraph("Jagatpur P.G. College, Jagatpur",FontFactory.getFont(FontFactory.TIMES_BOLD,36,Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph("\n"+new Date().toString()));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------\n\n"));
            PdfPTable table=new PdfPTable(9);
            table.setWidthPercentage(105);
             PdfPCell cell=new PdfPCell(new Paragraph("BCA V SEM Report"));
             cell.setColspan(9);
             cell.setHorizontalAlignment(Element.ALIGN_CENTER);
             cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cell);
            table.addCell("Name ");
            table.addCell("Father Name");
            table.addCell("Class ");
            table.addCell("Roll No.");
            table.addCell("Mobile ");
            table.addCell("E-Mail ");
            table.addCell("Address ");
            table.addCell("Session ");
            table.addCell("Book Issued ");
            conn.connect();
            rs=conn.st.executeQuery("select * from student WHERE Class='BCA V'");
            while(rs.next())
            {
                s=rs.getString(5);
                ft=cal(s);

            table.addCell(rs.getString(1));
            table.addCell(rs.getString(2));
            table.addCell(rs.getString(4));
            table.addCell(s);
            table.addCell(rs.getString(6));
            table.addCell(rs.getString(7));
            table.addCell(rs.getString(8));
            table.addCell(rs.getString(10));
            table.addCell(rs.getString(ft+""));
            }
            conn.con.close();
            document.add(table);
            document.close();
        }
        catch(Exception e){System.out.println(e);}
    }
    public void reportVI()
    {
        try
        {
            Document document=new Document();
            PdfWriter.getInstance(document,new FileOutputStream(conn.url2));
            document.open();
            document.add(new Paragraph("Jagatpur P.G. College, Jagatpur",FontFactory.getFont(FontFactory.TIMES_BOLD,36,Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph("\n"+new Date().toString()));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------\n\n"));
            PdfPTable table=new PdfPTable(9);
            table.setWidthPercentage(105);
             PdfPCell cell=new PdfPCell(new Paragraph("BCA VI SEM Report"));
             cell.setColspan(9);
             cell.setHorizontalAlignment(Element.ALIGN_CENTER);
             cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cell);
            table.addCell("Name ");
            table.addCell("Father Name");
            table.addCell("Class ");
            table.addCell("Roll No.");
            table.addCell("Mobile ");
            table.addCell("E-Mail ");
            table.addCell("Address ");
            table.addCell("Session ");
            table.addCell("Books Issued ");
            conn.connect();
            rs=conn.st.executeQuery("select * from student WHERE Class='BCA VI'");
            while(rs.next())
            {
                s=rs.getString(5);
                ft=cal(s);
                System.out.println(ft);

            table.addCell(rs.getString(1));
            table.addCell(rs.getString(2));
            table.addCell(rs.getString(4));
            table.addCell(s);
            table.addCell(rs.getString(6));
            table.addCell(rs.getString(7));
            table.addCell(rs.getString(8));
            table.addCell(rs.getString(10));
            table.addCell(ft+"");
            }
            conn.con.close();
            document.add(table);
            document.close();
        }
        catch(Exception e){System.out.println(e);}
    }

    public void invoice()
    {
        int sm,rm;
        conn.connect();
        try
        {
            Document document=new Document();
            PdfWriter.getInstance(document,new FileOutputStream(conn.url2));
            document.open();
            Paragraph p1=new Paragraph("Jagatpur P.G. College",FontFactory.getFont(FontFactory.TIMES_BOLD,36,Font.BOLD,BaseColor.BLACK));
            p1.setAlignment(Element.ALIGN_CENTER);
            document.add(p1);
            document.add(new Paragraph("\n"+new Date().toString()));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------\n\n"));
            Paragraph p2=new Paragraph("LIBRARY INVOICE\n\n\n\n");
            p2.setAlignment(Element.ALIGN_CENTER);
            document.add(p2);
            Chunk ch=new Chunk();
            ch.setUnderline(0.2f,-2f);
            document.add(ch);
            rs=conn.st.executeQuery("select Late_Fee from return");
            sm=0;
            while(rs.next())
            sm=sm+rs.getInt(1);
            Paragraph p3=new Paragraph("Rs."+sm+"\n\n\n");
            p3.setAlignment(Element.ALIGN_RIGHT);
            Paragraph p5=new Paragraph("     Late Fees Charges - ");
            document.add(p5);
            document.add(p3);
            rm=0;
            rs=conn.st.executeQuery("select * from lost");
            while(rs.next())
            rm=rm+rs.getInt(1);
            Paragraph p4=new Paragraph("Rs."+rm+"\n\n\n\n\n\n\n\n\n\n");
            p4.setAlignment(Element.ALIGN_RIGHT);
            Paragraph p6=new Paragraph("     Lost Book Charges  -");
            document.add(p6);
            document.add(p4);
            document.add(new Paragraph("_____________________________________________________________________________\n\n"));
            Paragraph p7=new Paragraph("Grand Total :  "+(rm+sm),FontFactory.getFont(FontFactory.TIMES_BOLDITALIC,18,Font.UNDERLINE,BaseColor.BLACK));
            p7.setAlignment(Element.ALIGN_CENTER);
            document.add(p7);
            conn.con.close();
            document.close();
        }
        catch(Exception e){System.out.print(e);}
    }

    public void dbreport()
    {
        try
        {
            Document document=new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(document,new FileOutputStream(conn.url2));
            document.open();
            Paragraph p1=new Paragraph("Jagatpur P.G. College, Jagatpur",FontFactory.getFont(FontFactory.TIMES_BOLD,36,Font.BOLD,BaseColor.BLUE));
            p1.setAlignment(Element.ALIGN_CENTER);
            document.add(p1);
            document.add(new Paragraph("\n     "+new Date().toString()));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n"));
            PdfPTable table=new PdfPTable(11);
            table.setWidthPercentage(105);
             PdfPCell cell=new PdfPCell(new Paragraph("Damaged Book Report"));
             cell.setColspan(11);
             cell.setHorizontalAlignment(Element.ALIGN_CENTER);
             cell.setBackgroundColor(BaseColor.MAGENTA);
            table.addCell(cell);
            table.addCell("Entry Date ");
            table.addCell("Book ID ");
            table.addCell("Book Title ");
            table.addCell("Writer Name ");
            table.addCell("Edition Year");
            table.addCell("Publication ");
            table.addCell("Book Received Year");
            table.addCell("Received Place ");
            table.addCell("Price");
            table.addCell("Book Detail ");
            table.addCell("Location ");
            conn.connect();
            rs=conn.st.executeQuery("select * from damage");
            while(rs.next())
            {
            table.addCell(rs.getDate(1)+"");
            table.addCell(rs.getInt(2)+"");
            table.addCell(rs.getString(3));
            table.addCell(rs.getString(4));
            table.addCell(rs.getInt(5)+"");
            table.addCell(rs.getString(6));
            table.addCell(rs.getInt(7)+"");
            table.addCell(rs.getString(8));
            table.addCell(rs.getInt(9)+"");
            table.addCell(rs.getString(10)+"");
            table.addCell(rs.getString(11));
            }
            conn.con.close();
            document.add(table);
            document.close();
        }
        catch(Exception e){System.out.print(e);}
    }

    public void lbreport()
    {
        try
        {
            int av=0,na=0,tt=0;
            String s1;
            Document document=new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(document,new FileOutputStream(conn.url2));
            document.open();
            Paragraph p1=new Paragraph("Jagatpur P.G. College, Jagatpur",FontFactory.getFont(FontFactory.TIMES_BOLD,36,Font.BOLD,BaseColor.BLUE));
            p1.setAlignment(Element.ALIGN_CENTER);
            document.add(p1);
            document.add(new Paragraph("\n     "+new Date().toString()));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n"));
            PdfPTable table=new PdfPTable(9);
            table.setWidthPercentage(105);
             PdfPCell cell=new PdfPCell(new Paragraph("Library Stock Report"));
             cell.setColspan(9);
             cell.setHorizontalAlignment(Element.ALIGN_CENTER);
             cell.setBackgroundColor(BaseColor.MAGENTA);
            table.addCell(cell);
            table.addCell("Entry Date ");
            table.addCell("Book ID ");
            table.addCell("Book Title ");
            table.addCell("Writer Name ");
            table.addCell("Edition Year");
            table.addCell("Publication ");
            table.addCell("Price");
            table.addCell("Book Detail ");
            table.addCell("Availability");
            conn.connect();
            rs=conn.st.executeQuery("select * from entry");
            while(rs.next())
            {
                s1=rs.getString(12);
                if(s1.equals("Yes"))
                    av++;
                if(s1.equals("No"))
                    na++;
                tt++;
            table.addCell(rs.getDate(1)+"");
            table.addCell(rs.getInt(2)+"");
            table.addCell(rs.getString(3));
            table.addCell(rs.getString(4));
            table.addCell(rs.getInt(5)+"");
            table.addCell(rs.getString(6));
            table.addCell(rs.getInt(9)+"");
            table.addCell(rs.getString(10));
            table.addCell(s1);
            }
            conn.con.close();
            document.add(new Paragraph("Total No. Of Books : "+tt+"      ",FontFactory.getFont(FontFactory.TIMES_ROMAN,16,Font.BOLD,BaseColor.BLACK)));
            document.add(new Paragraph("Available Books : "+av+"      ",FontFactory.getFont(FontFactory.TIMES_ROMAN,16,Font.BOLD,BaseColor.BLACK)));
            document.add(new Paragraph("Not Available Books : "+na+" \n\n",FontFactory.getFont(FontFactory.TIMES_ROMAN,16,Font.BOLD,BaseColor.BLACK)));
            document.add(table);
            document.close();
        }
        catch(Exception e){System.out.print(e);}
    }

    public void open()
    {
        try
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+conn.url2);
        }
        catch(Exception e){System.out.print(e);}
    }

   public int cal(String ag)
   {
       conn.connect();
       try
       {    a=0;
            rs1=conn.st.executeQuery("select * from Issue");
            while(rs1.next())
            {
                if(rs1.getString(1).equals(ag))
                    a++;
            }
       }
       catch(Exception e){}

       return a;
   }

    public static void main(String args[]) throws SQLException
    {
        new rep();
    }
}