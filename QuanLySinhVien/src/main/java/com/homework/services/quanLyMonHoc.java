/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.services;

import com.homework.doituong.MonHoc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HOME
 */
public class quanLyMonHoc {
    public void docDanhSachMonHoc(List<MonHoc> ds) throws SQLException{
        ds.clear();
        try (Connection conn = JdbcUtils.getConn()) {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM monhoc");
            while (rs.next()) {
                String maMH = rs.getString("MaMH");
                String tenMH = rs.getString("TenMH");
                int soTinChi = rs.getInt("SoTinChi");
                MonHoc mh = new MonHoc(maMH,tenMH,soTinChi);
                ds.add(mh);
            }
        }
    }
    public void hienThiDanhSachMonHoc(List<MonHoc> ds){
        for(MonHoc mh : ds){
            mh.hienThi();
        }
    }
    public void timKiem(String a,List<MonHoc> ds){
        for(MonHoc mh : ds){
            if(mh.getMaMH().toLowerCase().contains(a.toLowerCase()) || mh.getTenMH().toLowerCase().contains(a.toLowerCase())){
                mh.hienThi();
            }
        }
    }
}
