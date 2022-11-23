/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testPack;

import com.homework.doituong.sinhVien;
import com.homework.services.quanLySinhVien;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author HOME
 */
public class test {

    private ObservableList<sinhVien> dsSV = FXCollections.observableArrayList();

    public test() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() throws SQLException {
        quanLySinhVien qlSV = new quanLySinhVien();
        try {
            qlSV.docDanhSachSinhVien(dsSV);
        } catch (ParseException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (sinhVien sv : this.dsSV) {
            if (sv.getMaSV() == 1) {
                assertEquals("Huynh Hiep Thien", sv.getHoSV() + " " + sv.getTenSV());
            }
        }
    }

    @Test
    public void hello2() throws SQLException {
        quanLySinhVien qlSV = new quanLySinhVien();
        try {
            qlSV.docDanhSachSinhVien(dsSV);
        } catch (ParseException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (sinhVien sv : this.dsSV) {
            if (sv.getMaSV() == 2) {
                assertEquals("Huynh Hiep Thien", sv.getHoSV() + " " + sv.getTenSV());
            }
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"CS2001","CS2002","ECIT2001","IM2001","IM2002","IT2001","IT2002","ITEC3402","MK2001","null","TESTER"})
    public void testMaLop(String maLop) {
        quanLySinhVien qlSV = new quanLySinhVien();
        try {
            qlSV.docDanhSachSinhVien(dsSV);
        } catch (SQLException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertTrue(qlSV.timKiemMaLop(maLop, 15, dsSV));
    }
   
   
}
