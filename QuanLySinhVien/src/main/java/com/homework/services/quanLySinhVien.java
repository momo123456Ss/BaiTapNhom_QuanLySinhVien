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

/**
 *
 * @author HOME
 */
public class quanLySinhVien {
    public  void docDanhSachSinhVien(List<SinhVien> ds) throws SQLException, ParseException{
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
}
