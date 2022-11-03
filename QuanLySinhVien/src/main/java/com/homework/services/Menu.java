/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.services;

import com.homework.doituong.SinhVien;
import com.homework.doituong.userPassword;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author HOME
 */
public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public static final SimpleDateFormat F = new SimpleDateFormat("yyyy-MM-dd");
    public static final DecimalFormat dF = new DecimalFormat("#.00");
    private List<SinhVien> dsSinhVien = new ArrayList<>();
    public void Menu() throws  SQLException, ParseException {
        
       userPassword userPassword = new userPassword();
       System.out.print("Nhap UserName: ");
       String userName = sc.nextLine();
       System.out.print("Nhap PassWord: ");
       String passWord = sc.nextLine();
       if (userPassword.check(userName, passWord)) {
           int choose;
           do {
               quanLySinhVien quanLySinhVien = new quanLySinhVien();
               
               quanLyLop quanLyLop = new quanLyLop();
               quanLyMonHoc quanLyMonHoc = new quanLyMonHoc();
               quanLyHoc qlHoc = new quanLyHoc();
               System.out.println("1.Danh sach sinh vien");
               System.out.println("2.Danh sach Lop");
               System.out.println("3.Danh sach mon hoc");
               System.out.println("4.Danh sach Hoc ");
               System.out.println("======================================");
               System.out.println("5.Tim kiem sinh vien theo MaSV hoac MaLop ");
               System.out.print("Ban chon: ");
               choose = sc.nextInt();
               sc.nextLine();
               switch (choose) {
                   case 1:
                       
                       quanLySinhVien.docDanhSachSinhVien(dsSinhVien);
                       quanLySinhVien.hienThiDanhSach();
                       break;
                   case 2:
                       quanLyLop.docDanhSachLop();
                       quanLyLop.hienThiDanhSachLop();
                       break;
                   case 3:
                       quanLyMonHoc.docDanhSachMonHoc();
                       quanLyMonHoc.hienThiDanhSachMonHoc();
                       break;
                   case 4:
                       qlHoc.docDanhSachHoc();
                       qlHoc.hienThiDanhSachHoc();
                       break;
                    case 5:
                        quanLySinhVien.docDanhSachSinhVien(dsSinhVien);
                        System.out.print("Nhap MaSV || MaLop: "); String tmp = Menu.sc.nextLine();
                        quanLySinhVien.timKiem(tmp, dsSinhVien);
                        break;

               }
           } while (choose != 0);
       }
       else {
           System.out.print("Sai UserName hoac PassWord\n");
       }
    }
}
