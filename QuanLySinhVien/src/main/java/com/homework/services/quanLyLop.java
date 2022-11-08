/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.services;

import com.homework.doituong.Lop;
import com.homework.doituong.SinhVien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class quanLyLop {
    
    public void docDanhSachLop(List<Lop> ds) throws SQLException{
        ds.clear();
        try (Connection conn = JdbcUtils.getConn()) {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM lop");
            while (rs.next()) {
                String maLop = rs.getString("MaLop");
                String tenLop = rs.getString("TenLop");
                String gVCN = rs.getString("GVCN");
                Lop lop = new Lop(maLop,tenLop,gVCN);
                ds.add(lop);
            }
        }    
    }
    public void hienThiDanhSachLop(List<Lop> ds){
        for(Lop lp : ds){
            lp.hienThi();
        }
    }
    public void timKiem(String a,List<Lop> ds){
        for(Lop lop : ds){
            if(Objects.isNull(lop.getgVCN()) == false){
                if(lop.getTenLop().toLowerCase().contains(a.toLowerCase())||lop.getMaLop().toLowerCase().contains(a.toLowerCase()) || lop.getTenLop().toLowerCase().contains(a.toLowerCase())){
                    lop.hienThi();
                }
            }
            else if(a.toLowerCase().contains("NULL".toLowerCase())){
                if(Objects.isNull(lop.getgVCN())){
                      lop.hienThi();
                }
            }
        }
    }
    
    public void themLop(String maLop,String tenLop,String GVCN,List<Lop> ds) throws SQLException{
        if(maLop.isEmpty() || tenLop.isEmpty()){
            System.out.println("maLop va TenLop khong dc de trong!");
            return;
        }
        if(GVCN.isEmpty()){
            GVCN = "null";
        }
        
        for(Lop lop : ds){
            if(lop.getMaLop().equals(maLop)){
                System.out.println("maLop ton tai!");
                return;
            }
        }
        
         Statement stmt = null;
            try (Connection conn = com.homework.services.JdbcUtils.getConn()){                
                    String sql = "INSERT INTO lop (MaLop,TenLop,GVCN) VALUES ('"+ maLop + "','"+ tenLop + "','"+ GVCN + "')";
                    stmt = (Statement) conn.createStatement();
                    stmt.executeUpdate(sql);
                    System.out.println(sql);
                

            } 
    }
}
