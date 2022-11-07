-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlysinhvien
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hoc`
--

DROP TABLE IF EXISTS `hoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoc` (
  `MaMH` char(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `MaSV` int NOT NULL,
  `NgayDangKy` date NOT NULL,
  `Diem` decimal(4,2) DEFAULT NULL,
  `submit` tinyint NOT NULL,
  PRIMARY KEY (`NgayDangKy`,`MaMH`,`MaSV`),
  KEY `fk_hoc_sinhvien_idx` (`MaSV`),
  KEY `fk_hoc_monhoc_idx` (`MaMH`),
  CONSTRAINT `fk_hoc_monhoc` FOREIGN KEY (`MaMH`) REFERENCES `monhoc` (`MaMH`),
  CONSTRAINT `fk_hoc_sinhvien` FOREIGN KEY (`MaSV`) REFERENCES `sinhvien` (`MaSV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoc`
--

LOCK TABLES `hoc` WRITE;
/*!40000 ALTER TABLE `hoc` DISABLE KEYS */;
INSERT INTO `hoc` VALUES ('ITEC4415',4,'1999-12-03',8.00,1),('ITEC3402',3,'2020-07-05',5.00,1),('ITEC3406',2,'2020-07-05',7.33,0),('ITEC4415',1,'2020-07-05',0.00,0),('POLI1207',2,'2020-07-05',0.00,0),('ITEC3406',6,'2022-11-07',7.00,1);
/*!40000 ALTER TABLE `hoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lop`
--

DROP TABLE IF EXISTS `lop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lop` (
  `MaLop` char(8) NOT NULL,
  `TenLop` varchar(50) NOT NULL,
  `GVCN` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MaLop`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lop`
--

LOCK TABLES `lop` WRITE;
/*!40000 ALTER TABLE `lop` DISABLE KEYS */;
INSERT INTO `lop` VALUES ('CS2001','Khoa hoc may tinh','Nguyen Van A'),('CS2002','Khoa hoc may tinh','null'),('IM2001','He thong thong tin','Nguyen Van C'),('IM2002','He thong thong tin','null'),('IT2001','Cong nghe thong tin','Nguyen Van B'),('IT2002','Cong nghe thong tin','Huynh Van A'),('MK2001','Truyen thong','null'),('null','null','null');
/*!40000 ALTER TABLE `lop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monhoc`
--

DROP TABLE IF EXISTS `monhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monhoc` (
  `MaMH` char(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `TenMH` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `SoTinChi` tinyint DEFAULT NULL,
  PRIMARY KEY (`MaMH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monhoc`
--

LOCK TABLES `monhoc` WRITE;
/*!40000 ALTER TABLE `monhoc` DISABLE KEYS */;
INSERT INTO `monhoc` VALUES ('ITEC0702','He thong tin quan ly',5),('ITEC1234','mang may tinh',4),('ITEC3402','Co so du lieu nang cao',3),('ITEC3406','Lap trinh co so du lieu',3),('ITEC4415','Kiem thu phan men',3),('POLI1207','Lich su dang',3),('POLI1234','Ho Chi Minh 2022',5);
/*!40000 ALTER TABLE `monhoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinhvien`
--

DROP TABLE IF EXISTS `sinhvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinhvien` (
  `MaSV` int NOT NULL AUTO_INCREMENT,
  `HoSV` varchar(50) NOT NULL,
  `TenSV` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `GioiTinh` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `QueQuan` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `MaLop` char(8) DEFAULT NULL,
  PRIMARY KEY (`MaSV`),
  KEY `fk_lop_sinhvien_idx` (`MaLop`),
  CONSTRAINT `fk_lop_sinhvien` FOREIGN KEY (`MaLop`) REFERENCES `lop` (`MaLop`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinhvien`
--

LOCK TABLES `sinhvien` WRITE;
/*!40000 ALTER TABLE `sinhvien` DISABLE KEYS */;
INSERT INTO `sinhvien` VALUES (1,'Huynh Hiep','Thien','Nam','2002-05-07','Tp.HCM','CS2001'),(2,'Tran Quang','Huy','Nam','1999-01-01','Tp.HCM','IM2001'),(3,'Le Vu','Ho','Nam','2001-01-01','Tp.HCM','IT2001'),(4,'Huynh','Tien','Nam','2003-05-02','Tp.HCM','CS2002'),(5,'Tien','Huynh','null','1990-01-01','null','null'),(6,'Khang','Dang','Nu','1990-01-01','Ha noi','MK2001'),(7,'Huynh Tan','Phat','null','1990-01-01','null','null'),(8,'Huynh','Duy','null','1990-01-01','null','null'),(9,'Danh','Cao','null','1990-01-01','null','null');
/*!40000 ALTER TABLE `sinhvien` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-07 16:30:12
