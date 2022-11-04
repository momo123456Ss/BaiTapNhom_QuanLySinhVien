/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.services;

import com.homework.doituong.Hoc;

import com.homework.doituong.SinhVien;
import static com.homework.jframeQLSinhVien.danhSachHoc.isNumeric;
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
public class quanLyHoc {
    public void docDanhSachHoc(List<Hoc> ds) throws SQLException, ParseException{
        ds.clear();
        try (Connection conn = JdbcUtils.getConn()) {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM hoc");
            while (rs.next()) {
                String maMH = rs.getString("MaMH");
                int maSV = rs.getInt("MaSV");
                String ngayDangKy = rs.getString("NgayDangKy");
                double diem = rs.getDouble("Diem");
                boolean submit = rs.getBoolean("submit");
                Hoc hoc = new Hoc(maMH,maSV,ngayDangKy,diem,submit);
                ds.add(hoc);
            }
        }
    }
    public void hienThiDanhSachHoc(List<Hoc> ds){
        for(Hoc hc: ds){
            hc.hienThi();
        }
    }
    public void timKiem(String a,List<Hoc> ds){
        for(Hoc hoc : ds){
                  if(isNumeric(a)){
                    if(Integer.toString(hoc.getMaSV()).equals(a)){
                      hoc.hienThi();
                    }
                  }
                  else{
                      if(hoc.getMaMH().toLowerCase().contains(a)){
                          hoc.hienThi();
                      }
                  }
                  
            }
    }
}
