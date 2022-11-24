/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package unitTest3;

import com.homework.doituong.Lop;
import com.homework.services.quanLyLop;
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
    private ObservableList<Lop> dsL = FXCollections.observableArrayList();
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
quanLyLop qlL= new quanLyLop();
qlL.docDanhSachLop(dsL);
qlL.themLop("CS2004", "CSDL NC", "Ho Quang Khai", dsL);
for( Lop lo: this.dsL)
            if(lo.getGiaoVien().equalsIgnoreCase("Ho Quang Khai"))
            {
                assertEquals("CS2004", lo.getMaLop());
            }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}}
