/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.services;

import com.baitapnhom.doituong.Lop;
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
public class quanLyLop {
    private List<Lop> dsLop = new ArrayList<>();
    public void docDanhSachLop() throws SQLException{
        try (Connection conn = JdbcUtils.getConn()) {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM lop");
            while (rs.next()) {
                String maLop = rs.getString("MaLop");
                String tenLop = rs.getString("TenLop");
                String gVCN = rs.getString("GVCN");
                Lop lop = new Lop(maLop,tenLop,gVCN);
                this.dsLop.add(lop);
            }
        }    
    }
    public void hienThiDanhSachLop(){
        for(Lop lp : this.dsLop){
            lp.hienThi();
        }
    }
}
