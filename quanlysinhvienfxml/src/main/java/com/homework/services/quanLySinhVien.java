/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.services;


import com.homework.doituong.Lop;
import com.homework.doituong.sinhVien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class quanLySinhVien {
    private List<sinhVien> dsSV = new ArrayList<>();
    
    public  void docDanhSachSinhVien(ObservableList<sinhVien> ds) throws SQLException, ParseException{
        dsSV.clear();
        ds.clear();
        try (Connection conn = com.homework.services.JdbcUtils.getConn()) {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM sinhvien");
            while (rs.next()) {
                int maSV = rs.getInt("MaSV");
                String hoSV = rs.getString("HoSV");
                String tenSV = rs.getString("TenSV");
                String gioiTinh = rs.getString("GioiTinh");
                String ngaySinh = rs.getString("NgaySinh");
                String queQuan = rs.getString("QueQuan");
                String maLop = rs.getString("MaLop");
                sinhVien sv = new sinhVien(maSV,hoSV,tenSV,gioiTinh,ngaySinh,queQuan,maLop);
                dsSV.add(sv);
                ds.add(sv);
                
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public void hienThiDanhSach(List<sinhVien> ds){
        for(sinhVien sv : ds){
            sv.hienThi();

        }
    }
    public void timKiem(String a,List<sinhVien> ds){
        for(sinhVien sv : ds){
            if(a.equals(Integer.toString(sv.getMaSV())) || a.equals(sv.getMaLop())){
                sv.hienThi();
            }
        }
    }
    
    int dem = 0;
    public void themSinhVien(String ho,String ten,String gioiTinh,String ngaySinh,String queQuan,String maLop) throws SQLException{
                    if(queQuan.isEmpty()){
                        queQuan = "null";
                    }
                    if (ngaySinh.isEmpty()){
                        ngaySinh = "1990-01-01";
                    }
                    if(maLop.isEmpty()){
                        maLop = "null";
                    }
        if(gioiTinh.isEmpty()){
            gioiTinh = "null";
        }
        
        if(maLop != "null"){
                for(sinhVien sv : this.dsSV){
                    if(!sv.getMaLop().toLowerCase().equals(maLop)){
                     System.out.println("Ma lop ko ton tai!");
                     return;
                  }
             }
        }
        
        
        dem = dsSV.size() + 1;
        Statement stmt = null;
        
            try (Connection conn = com.homework.services.JdbcUtils.getConn()){   
                    

                    String sql = "INSERT INTO sinhvien (MaSV,HoSV,TenSV,GioiTinh,NgaySinh,QueQuan,MaLop) VALUES ('"
                            + dem + "','"
                            + ho + "','"
                            + ten + "','"
                            + gioiTinh + "','"
                            + ngaySinh + "','"
                            + queQuan + "','"
                            + maLop+ "')";
                    System.out.print(sql + "\n");
                    stmt = (Statement) conn.createStatement();
                    stmt.executeUpdate(sql);
                    
                

            } 
    }
     public static boolean isValidDate(final String date) {

        boolean valid = false;

        try {

            // ResolverStyle.STRICT for 30, 31 days checking, and also leap year.
            LocalDate.parse(date,
                    DateTimeFormatter.ofPattern("uuuu-M-d")
                            .withResolverStyle(ResolverStyle.STRICT)
            );

            valid = true;

        } catch (DateTimeParseException e) {
            //e.printStackTrace();
            valid = false;
        }

        return valid;
    }
    public void updateSinhVien(String maSV,List<sinhVien> dsSV,List<Lop> dsLop){
        boolean checkSV = false;
        for(sinhVien sv: dsSV){
            if(maSV.equals(Integer.toString(sv.getMaSV()))){
                 checkSV = true;
            }
        }
        
        if(checkSV == false){
            System.out.print("MaSV ko ton tai!");
            return;
        }
        int choose;
        do{
            System.out.println("1.Ho");
            System.out.println("2.Ten");
            System.out.println("3.Gioi tinh");
            System.out.println("4.Ngay sinh");
            System.out.println("5.Que quan");
            System.out.println("6.Ma lop");
            System.out.print("Ban chon: ");
            choose = sinhVien.sc.nextInt();
            sinhVien.sc.nextLine();
            switch(choose){
                case 1:
                    System.out.print("Nhap HoSV: "); String hoSV = sinhVien.sc.nextLine();
                    try (Connection conn = com.homework.services.JdbcUtils.getConn()){
                        String query = "update sinhvien set HoSV = '" + hoSV + "' where MaSV = '" + maSV +"'";        
                         Statement stmt = null;
                         stmt = (Statement) conn.createStatement();
                         stmt.execute(query);
                          System.out.println(query);
                    } catch (SQLException ex) {
                        Logger.getLogger(quanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    break;
                case 2:
                    System.out.print("Nhap TenSV: "); String tenSV = sinhVien.sc.nextLine();
                    try (Connection conn = com.homework.services.JdbcUtils.getConn()){
                        String query = "update sinhvien set TenSV = '" + tenSV + "' where MaSV = '" + maSV +"'";        
                         Statement stmt = null;
                         stmt = (Statement) conn.createStatement();
                         stmt.execute(query);
                          System.out.println(query);
                    } catch (SQLException ex) {
                        Logger.getLogger(quanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    break;
                case 3:
                    boolean  checkGioiTinh = false;
                    System.out.print("Nhap GioiTinh: "); String gioiTinh = sinhVien.sc.nextLine();
                    if(gioiTinh.toLowerCase().equalsIgnoreCase("Nam") || gioiTinh.toLowerCase().equalsIgnoreCase("Nu")){
                        checkGioiTinh = true;
                    }
                    if(checkGioiTinh == false){
                        System.out.print("GioiTinh la Nam hoac Nu \n");
                        return;
                    }
                    try (Connection conn = com.homework.services.JdbcUtils.getConn()){
                        String query = "update sinhvien set GioiTinh = '" + gioiTinh + "' where MaSV = '" + maSV +"'";        
                         Statement stmt = null;
                         stmt = (Statement) conn.createStatement();
                         stmt.execute(query);
                          System.out.println(query);
                    } catch (SQLException ex) {
                        Logger.getLogger(quanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    break;
                case 4:
                    System.out.print("Nhap NgaySinh: "); String ngaySinh = sinhVien.sc.nextLine();
                    if(!isValidDate(ngaySinh)){
                        System.out.println("ngaySinh phai la yyyy-MM-dd");
                        return;
                    }
                    try (Connection conn = com.homework.services.JdbcUtils.getConn()){
                        String query = "update sinhvien set NgaySinh = '" + ngaySinh + "' where MaSV = '" + maSV +"'";        
                         Statement stmt = null;
                         stmt = (Statement) conn.createStatement();
                         stmt.execute(query);
                          System.out.println(query);
                    } catch (SQLException ex) {
                        Logger.getLogger(quanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    
                    break;
                case 5:
                    System.out.print("Nhap QueQuan: "); String queQuan = sinhVien.sc.nextLine();
                    try (Connection conn = com.homework.services.JdbcUtils.getConn()){
                        String query = "update sinhvien set QueQuan = '" + queQuan + "' where MaSV = '" + maSV +"'";        
                         Statement stmt = null;
                         stmt = (Statement) conn.createStatement();
                         stmt.execute(query);
                          System.out.println(query);
                    } catch (SQLException ex) {
                        Logger.getLogger(quanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
                    }    
                    break;
                case 6:
                    boolean checkLop = false;
                    System.out.print("Nhap MaLop: "); String maLop = sinhVien.sc.nextLine();
                    for(Lop lp : dsLop){
                        if(maLop.toLowerCase().equals(lp.getMaLop().toLowerCase())){
                            checkLop = true;
                        }
                    }
                    if(checkLop == false){
                        System.out.println("Ma lop ko ton tai!");
                        return;
                    }
                    try (Connection conn = com.homework.services.JdbcUtils.getConn()){
                        String query = "update sinhvien set TenSV = '" + maLop + "' where MaSV = '" + maSV +"'";        
                         Statement stmt = null;
                         stmt = (Statement) conn.createStatement();
                         stmt.execute(query);
                          System.out.println(query);
                    } catch (SQLException ex) {
                        Logger.getLogger(quanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                    

            }
        }while(choose != 0);
    }
}
