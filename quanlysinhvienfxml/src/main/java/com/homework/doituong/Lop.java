    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.doituong;

/**
 *
 * @author HOME
 */
public class Lop {
    private String maLopFX;
    private String tenLop;
    private String gVCN;
    public Lop(String maLopFX,String tenLop,String giaoVien){
        this.maLopFX = maLopFX;
        this.tenLop = tenLop;
        this.gVCN = giaoVien;
    }
    public void hienThi(){
        System.out.printf("Ma lop: %s - Ten lop: %s - GVCN: %s\n",this.maLopFX,this.tenLop,this.gVCN);
    }
    public String getMaLop() {
        return maLopFX;
    }

    public void setMaLop(String maLopFX) {
        this.maLopFX = maLopFX;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getgVCN() {
        return gVCN;
    }

    public void setgVCN(String gVCN) {
        this.gVCN = gVCN;
    }
}
