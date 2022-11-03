/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.services;

import com.baitapnhom.doituong.Hoc;
import com.baitapnhom.doituong.SinhVien;
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
    private List<Hoc> qlHoc = new ArrayList<>();
    public void docDanhSachHoc() throws SQLException, ParseException{
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
                this.qlHoc.add(hoc);
            }
        }
    }
    public void hienThiDanhSachHoc(){
        for(Hoc hc: this.qlHoc){
            hc.hienThi();
        }
    }
}
