/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.services;

import com.homework.doituong.SinhVien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class quanLySinhVien {
    private List<SinhVien> dsSV = new ArrayList<>();
    
    public  void docDanhSachSinhVien(List<SinhVien> ds) throws SQLException, ParseException{
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
                SinhVien sv = new SinhVien(maSV,hoSV,tenSV,gioiTinh,ngaySinh,queQuan,maLop);
                dsSV.add(sv);
                ds.add(sv);
                
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public void hienThiDanhSach(List<SinhVien> ds){
        for(SinhVien sv : ds){
            sv.hienThi();

        }
    }
    public void timKiem(String a,List<SinhVien> ds){
        for(SinhVien sv : ds){
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
                for(SinhVien sv : this.dsSV){
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
}
