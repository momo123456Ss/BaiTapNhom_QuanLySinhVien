/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package unitTest2;

import com.homework.doituong.MonHoc;
import com.homework.services.quanLyMonHoc;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class testAdd {
    private ObservableList<MonHoc> dsMH = FXCollections.observableArrayList();
    public testAdd() {
        
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
@Test
public void testAdd() throws SQLException{
    quanLyMonHoc qlMH= new quanLyMonHoc();
    qlMH.docDanhSachMonHoc(dsMH);
    qlMH.themMonHoc("IT2052", "Rot mon", "10", dsMH);
     for (MonHoc mh : this.dsMH) {
            if (mh.getMaMH().equalsIgnoreCase("IT2052")) {
                assertEquals("Rot mon", mh.getTenMH());
            }
        }
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
