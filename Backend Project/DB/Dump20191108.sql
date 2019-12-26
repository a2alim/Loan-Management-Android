CREATE DATABASE  IF NOT EXISTS `loanmanagement` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `loanmanagement`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: loanmanagement
-- ------------------------------------------------------
-- Server version	5.1.60-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `applyloan`
--

DROP TABLE IF EXISTS `applyloan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `applyloan` (
  `loanId` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `createdDate` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `installmentAmount` bigint(20) NOT NULL,
  `installmentType` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `loanAmount` bigint(20) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `totalInstallment` int(11) NOT NULL,
  `totalPayableAmount` bigint(20) DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `username` varchar(12) NOT NULL,
  PRIMARY KEY (`loanId`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `applyloan`
--

LOCK TABLES `applyloan` WRITE;
/*!40000 ALTER TABLE `applyloan` DISABLE KEYS */;
INSERT INTO `applyloan` VALUES (1,'Cumilla, Dhaka.','personalLOan','2019-11-08 19:08:14','fazlyrabbi1991@gmail.com','Fazly ',500,'Weekly','Rabbi',20000,'$2a$10$UxWWEFBq3lu4KM/uXQUAj.6Lmwo0gnEciTUXaf3gMEVNoxvHnRcWG','01748956832','approved',44,22000,NULL,'rabbi'),(2,'Tonagi, Dhaka.','personalLOan','2019-11-08 19:08:41','asif@gmail.com','Abdulllah',625,'Weekly','Al-Asif',25000,'$2a$10$LQ2/tLho5SEvoKGEZPzdHuDYNsR14XvoPLtYaGP4w3jVYWtFhCuXy','01725986715','approved',44,27500,NULL,'asif'),(3,'Dhamrai, Dhaka.','personalLOan','2019-11-08 19:08:52','asraf@gmai.com','Asraful ',750,'Weekly','Islam',30000,'$2a$10$o3BBoVvXtdYzTsDoZA9ajucH1waBBR2zGIoN0V8wL8rXC7l9.Pnc6','01758956832','approved',44,33000,NULL,'asraf'),(4,'Azimpur, Dhaka.','homeLoan','2019-11-08 19:09:20','enamul@gmail.com','Enamul',3500,'Monthly','Haque',35000,'$2a$10$zf5DW3AdAaaha61//WuzOepEjYjVFzEIyurlf.kZBdWDnZielmxFy','01785369825','approved',11,0,NULL,'enamul'),(5,'Gulshan, Dhaka.','homeLoan','2019-11-08 19:09:40','faruk@gmail.com','Omar',40000,'Monthly','Faruk',400000,'$2a$10$rGcf.ROHrrD0NMWfIV.CF.JYWfWK5u.wNp1VV/YSkR4Bj4mKR4XdC','01725986895','approved',11,0,NULL,'faruk'),(6,'Dhaka','autoLoan','2019-11-08 19:10:02','monir@gmail.com','Monir',10000,'Monthly','Khan',100000,'$2a$10$jyd/LgwcQEBvETRUI/lG1.UMCNJrLlvJaufZ0L76U9/IzpixSx0aq','01872986585','approved',11,0,NULL,'monir'),(7,'Mohammadpur, Dhaka.','bussinessLoan','2019-11-08 19:10:40','payer@gmail.com','payer',150000,'Monthly','Ahmed',1500000,'$2a$10$/FuUQZxYBr6Yi4zZGw00d./VMwnOn13pxz/ApkJjWOWMxhMojJTja','01785256899','approved',11,0,NULL,'payer'),(8,'Gabtoli, Dhaka.','personalLOan','2019-11-08 19:10:56','rabiul@gmail.com','Rabiul',500,'Weekly','Islam',20000,'$2a$10$We7o25KdMdiQIkvhQqFBleYLugdHiwQq/AGr9QPXdQIi0nL01PYzy','01758659875','approved',44,22000,NULL,'rabiul'),(9,'Mohammadpur, Dhaka.','personalLOan','2019-11-08 19:57:26','raju@gmail.com','Raju',1500,'Weekly','Ahmed',60000,'$2a$10$UjQm7HoXGq9In0RfXSeLJ.Z6AmKUmRDY6DNMEdiwnm2TUQZYZjFqu','01075822454','approved',44,66000,NULL,'raju'),(10,'Kustia, Dhaka.','personalLOan','2019-11-08 19:57:37','Rubayet@gmail.com','Rubayet',1000,'Weekly','Islam',40000,'$2a$10$04iX.fSeZEjCv0IC0QSmZOMEJyAHSKw/KADOZtg0XqLPKlQ5T5Tzi','01754256980','approved',44,44000,NULL,'rubayet'),(11,'Mohammadpur, Dhaka','personalLOan','2019-11-08 19:57:47','saif@gmial.com','Saif',875,'Weekly','Tanvir',35000,'$2a$10$IM7qNIUltr.IWmyiOe09f.K3GpB.GfURVomqH34qyksVArjZ93YJK','01705986585','approved',44,38500,NULL,'saif'),(12,'Dhaka.','personalLOan','2019-11-08 19:58:10','saker@gmail.com','Salauddin',1125,'Weekly','Saker',45000,'$2a$10$wgFLkHJoUuQYlMd2nhxNgOr6NZqB6r0Ss6ozQux359L4t7.0Qv/Yi','01758326598','pending',44,49500,NULL,'saker'),(13,'Rajbari, Dhaka.','personalLOan','2019-11-08 21:24:51','adoralim121@gmail.com','Abdul',625,'Weekly','Alim',25000,'$2a$10$9ZCTgW4.4JSe98uz5W9cAe/S8Q6WJhN1FzTtuDE4M6QPetZ68b7Um','01705768898','pending',44,27500,NULL,'a2alim'),(14,'Dhaka.','personalLOan','2019-11-08 21:25:03','saker@gmail.com','Salauddin',625,'Weekly','Saker',25000,'$2a$10$wgFLkHJoUuQYlMd2nhxNgOr6NZqB6r0Ss6ozQux359L4t7.0Qv/Yi','01758326598','pending',44,27500,NULL,'saker'),(15,'Azimpur, Dhaka.','personalLOan','2019-11-08 21:31:50','enamul@gmail.com','Enamul',1375,'Weekly','Haque',55000,'$2a$10$zf5DW3AdAaaha61//WuzOepEjYjVFzEIyurlf.kZBdWDnZielmxFy','01785369825','pending',44,60500,NULL,'enamul'),(16,'Azimpur, Dhaka.','personalLOan','2019-11-08 21:32:04','enamul@gmail.com','Enamul',1375,'Weekly','Haque',55000,'$2a$10$zf5DW3AdAaaha61//WuzOepEjYjVFzEIyurlf.kZBdWDnZielmxFy','01785369825','pending',44,60500,NULL,'enamul');
/*!40000 ALTER TABLE `applyloan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact` (
  `contactId` bigint(20) NOT NULL AUTO_INCREMENT,
  `date` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`contactId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES (1,'Fri Nov 08 20:34:39 BDT 2019','as3339if@gmail.com','Abdulllah','Al-Asif','My loan has not approved yet. What the reason.'),(2,'Fri Nov 08 20:43:49 BDT 2019','mmjitu2019@gmail.com','mm','Jitu','My loan problem. Check out That. '),(3,'Fri Nov 08 20:44:32 BDT 2019','adoralim121@gmail.com','abdul ','Alim','Sir please Check out my loan. and please approved my loan first. ');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `installment`
--

DROP TABLE IF EXISTS `installment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `installment` (
  `installmentId` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `installmentAmount` bigint(20) NOT NULL,
  `installmentDate` datetime DEFAULT NULL,
  `loanAmount` bigint(20) NOT NULL,
  `loanId` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `totalPaid` bigint(20) NOT NULL,
  `totalPayable` bigint(20) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`installmentId`)
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `installment`
--

LOCK TABLES `installment` WRITE;
/*!40000 ALTER TABLE `installment` DISABLE KEYS */;
INSERT INTO `installment` VALUES (1,'Cumilla, Dhaka.','personalLOan','fazlyrabbi1991@gmail.com',500,'2019-11-08 20:17:20',20000,1,'Fazly  Rabbi ',0,20000,'rabbi'),(2,'Cumilla, Dhaka.','personalLOan','fazlyrabbi1991@gmail.com',500,'2019-11-08 20:17:38',20000,1,'Fazly  Rabbi ',500,19500,'rabbi'),(3,'Cumilla, Dhaka.','personalLOan','fazlyrabbi1991@gmail.com',500,'2019-11-08 20:17:47',20000,1,'Fazly  Rabbi ',1000,19000,'rabbi'),(4,'Cumilla, Dhaka.','personalLOan','fazlyrabbi1991@gmail.com',500,'2019-11-08 20:17:55',20000,1,'Fazly  Rabbi ',1500,18500,'rabbi'),(5,'Cumilla, Dhaka.','personalLOan','fazlyrabbi1991@gmail.com',500,'2019-11-08 20:18:01',20000,1,'Fazly  Rabbi ',2000,18000,'rabbi'),(6,'Cumilla, Dhaka.','personalLOan','fazlyrabbi1991@gmail.com',500,'2019-11-08 20:18:41',20000,1,'Fazly  Rabbi ',2500,17500,'rabbi'),(7,'Cumilla, Dhaka.','personalLOan','fazlyrabbi1991@gmail.com',500,'2019-11-08 20:18:47',20000,1,'Fazly  Rabbi ',3000,17000,'rabbi'),(8,'Cumilla, Dhaka.','personalLOan','fazlyrabbi1991@gmail.com',500,'2019-11-08 20:18:53',20000,1,'Fazly  Rabbi ',3500,16500,'rabbi'),(9,'Cumilla, Dhaka.','personalLOan','fazlyrabbi1991@gmail.com',500,'2019-11-08 20:18:59',20000,1,'Fazly  Rabbi ',4000,16000,'rabbi'),(10,'Cumilla, Dhaka.','personalLOan','fazlyrabbi1991@gmail.com',500,'2019-11-08 20:19:05',20000,1,'Fazly  Rabbi ',4500,15500,'rabbi'),(11,'Tonagi, Dhaka.','personalLOan','asif@gmail.com',625,'2019-11-08 20:19:22',25000,2,'Abdulllah Al-Asif ',0,25000,'asif'),(12,'Tonagi, Dhaka.','personalLOan','asif@gmail.com',625,'2019-11-08 20:19:29',25000,2,'Abdulllah Al-Asif ',625,24375,'asif'),(13,'Tonagi, Dhaka.','personalLOan','asif@gmail.com',625,'2019-11-08 20:19:35',25000,2,'Abdulllah Al-Asif ',1250,23750,'asif'),(14,'Tonagi, Dhaka.','personalLOan','asif@gmail.com',625,'2019-11-08 20:19:41',25000,2,'Abdulllah Al-Asif ',1875,23125,'asif'),(15,'Tonagi, Dhaka.','personalLOan','asif@gmail.com',625,'2019-11-08 20:19:47',25000,2,'Abdulllah Al-Asif ',2500,22500,'asif'),(16,'Tonagi, Dhaka.','personalLOan','asif@gmail.com',625,'2019-11-08 20:19:55',25000,2,'Abdulllah Al-Asif ',3125,21875,'asif'),(17,'Tonagi, Dhaka.','personalLOan','asif@gmail.com',625,'2019-11-08 20:20:00',25000,2,'Abdulllah Al-Asif ',3750,21250,'asif'),(18,'Tonagi, Dhaka.','personalLOan','asif@gmail.com',625,'2019-11-08 20:22:31',25000,2,'Abdulllah Al-Asif ',4375,20625,'asif'),(19,'Tonagi, Dhaka.','personalLOan','asif@gmail.com',625,'2019-11-08 20:23:06',25000,2,'Abdulllah Al-Asif ',5000,20000,'asif'),(20,'Tonagi, Dhaka.','personalLOan','asif@gmail.com',625,'2019-11-08 20:23:11',25000,2,'Abdulllah Al-Asif ',5625,19375,'asif'),(21,'Dhamrai, Dhaka.','personalLOan','asraf@gmai.com',750,'2019-11-08 20:23:23',30000,3,'Asraful  Islam ',0,30000,'asraf'),(22,'Dhamrai, Dhaka.','personalLOan','asraf@gmai.com',750,'2019-11-08 20:23:28',30000,3,'Asraful  Islam ',750,29250,'asraf'),(23,'Dhamrai, Dhaka.','personalLOan','asraf@gmai.com',750,'2019-11-08 20:23:33',30000,3,'Asraful  Islam ',1500,28500,'asraf'),(24,'Dhamrai, Dhaka.','personalLOan','asraf@gmai.com',750,'2019-11-08 20:23:44',30000,3,'Asraful  Islam ',2250,27750,'asraf'),(25,'Dhamrai, Dhaka.','personalLOan','asraf@gmai.com',750,'2019-11-08 20:23:52',30000,3,'Asraful  Islam ',3000,27000,'asraf'),(26,'Dhamrai, Dhaka.','personalLOan','asraf@gmai.com',750,'2019-11-08 20:23:58',30000,3,'Asraful  Islam ',3750,26250,'asraf'),(27,'Dhamrai, Dhaka.','personalLOan','asraf@gmai.com',750,'2019-11-08 20:24:05',30000,3,'Asraful  Islam ',4500,25500,'asraf'),(28,'Dhamrai, Dhaka.','personalLOan','asraf@gmai.com',750,'2019-11-08 20:24:18',30000,3,'Asraful  Islam ',5250,24750,'asraf'),(29,'Dhamrai, Dhaka.','personalLOan','asraf@gmai.com',750,'2019-11-08 20:24:23',30000,3,'Asraful  Islam ',6000,24000,'asraf'),(30,'Dhamrai, Dhaka.','personalLOan','asraf@gmai.com',750,'2019-11-08 20:24:29',30000,3,'Asraful  Islam ',6750,23250,'asraf'),(31,'Azimpur, Dhaka.','homeLoan','enamul@gmail.com',3500,'2019-11-08 20:24:36',35000,4,'Enamul Haque ',0,35000,'enamul'),(32,'Azimpur, Dhaka.','homeLoan','enamul@gmail.com',3500,'2019-11-08 20:24:42',35000,4,'Enamul Haque ',3500,31500,'enamul'),(33,'Azimpur, Dhaka.','homeLoan','enamul@gmail.com',3500,'2019-11-08 20:24:51',35000,4,'Enamul Haque ',7000,28000,'enamul'),(34,'Azimpur, Dhaka.','homeLoan','enamul@gmail.com',3500,'2019-11-08 20:24:56',35000,4,'Enamul Haque ',10500,24500,'enamul'),(35,'Azimpur, Dhaka.','homeLoan','enamul@gmail.com',3500,'2019-11-08 20:25:02',35000,4,'Enamul Haque ',14000,21000,'enamul'),(36,'Azimpur, Dhaka.','homeLoan','enamul@gmail.com',3500,'2019-11-08 20:25:07',35000,4,'Enamul Haque ',17500,17500,'enamul'),(37,'Azimpur, Dhaka.','homeLoan','enamul@gmail.com',3500,'2019-11-08 20:25:12',35000,4,'Enamul Haque ',21000,14000,'enamul'),(38,'Azimpur, Dhaka.','homeLoan','enamul@gmail.com',3500,'2019-11-08 20:25:17',35000,4,'Enamul Haque ',24500,10500,'enamul'),(39,'Azimpur, Dhaka.','homeLoan','enamul@gmail.com',3500,'2019-11-08 20:25:35',35000,4,'Enamul Haque ',28000,7000,'enamul'),(40,'Azimpur, Dhaka.','homeLoan','enamul@gmail.com',3500,'2019-11-08 20:25:42',35000,4,'Enamul Haque ',31500,3500,'enamul'),(41,'Gulshan, Dhaka.','homeLoan','faruk@gmail.com',40000,'2019-11-08 20:25:54',400000,5,'Omar Faruk ',0,400000,'faruk'),(42,'Gulshan, Dhaka.','homeLoan','faruk@gmail.com',40000,'2019-11-08 20:26:01',400000,5,'Omar Faruk ',40000,360000,'faruk'),(43,'Gulshan, Dhaka.','homeLoan','faruk@gmail.com',40000,'2019-11-08 20:26:11',400000,5,'Omar Faruk ',80000,320000,'faruk'),(44,'Gulshan, Dhaka.','homeLoan','faruk@gmail.com',40000,'2019-11-08 20:26:16',400000,5,'Omar Faruk ',120000,280000,'faruk'),(45,'Gulshan, Dhaka.','homeLoan','faruk@gmail.com',40000,'2019-11-08 20:26:20',400000,5,'Omar Faruk ',160000,240000,'faruk'),(46,'Gulshan, Dhaka.','homeLoan','faruk@gmail.com',40000,'2019-11-08 20:26:26',400000,5,'Omar Faruk ',200000,200000,'faruk'),(47,'Gulshan, Dhaka.','homeLoan','faruk@gmail.com',40000,'2019-11-08 20:26:30',400000,5,'Omar Faruk ',240000,160000,'faruk'),(48,'Gulshan, Dhaka.','homeLoan','faruk@gmail.com',40000,'2019-11-08 20:26:40',400000,5,'Omar Faruk ',280000,120000,'faruk'),(49,'Gulshan, Dhaka.','homeLoan','faruk@gmail.com',40000,'2019-11-08 20:26:46',400000,5,'Omar Faruk ',320000,80000,'faruk'),(50,'Gulshan, Dhaka.','homeLoan','faruk@gmail.com',40000,'2019-11-08 20:26:53',400000,5,'Omar Faruk ',360000,40000,'faruk'),(51,'Gulshan, Dhaka.','homeLoan','faruk@gmail.com',40000,'2019-11-08 20:26:59',400000,5,'Omar Faruk ',400000,0,'faruk'),(52,'Dhaka','autoLoan','monir@gmail.com',10000,'2019-11-08 20:27:13',100000,6,'Monir Khan ',0,100000,'monir'),(53,'Dhaka','autoLoan','monir@gmail.com',10000,'2019-11-08 20:27:19',100000,6,'Monir Khan ',10000,90000,'monir'),(54,'Dhaka','autoLoan','monir@gmail.com',10000,'2019-11-08 20:27:27',100000,6,'Monir Khan ',20000,80000,'monir'),(55,'Dhaka','autoLoan','monir@gmail.com',10000,'2019-11-08 20:27:36',100000,6,'Monir Khan ',30000,70000,'monir'),(56,'Dhaka','autoLoan','monir@gmail.com',10000,'2019-11-08 20:27:47',100000,6,'Monir Khan ',40000,60000,'monir'),(57,'Dhaka','autoLoan','monir@gmail.com',10000,'2019-11-08 20:27:52',100000,6,'Monir Khan ',50000,50000,'monir'),(58,'Dhaka','autoLoan','monir@gmail.com',10000,'2019-11-08 20:28:01',100000,6,'Monir Khan ',60000,40000,'monir'),(59,'Dhaka','autoLoan','monir@gmail.com',10000,'2019-11-08 20:28:07',100000,6,'Monir Khan ',70000,30000,'monir'),(60,'Mohammadpur, Dhaka.','bussinessLoan','payer@gmail.com',150000,'2019-11-08 20:28:15',1500000,7,'payer Ahmed ',0,1500000,'payer'),(61,'Mohammadpur, Dhaka.','bussinessLoan','payer@gmail.com',150000,'2019-11-08 20:28:20',1500000,7,'payer Ahmed ',150000,1350000,'payer'),(62,'Mohammadpur, Dhaka.','bussinessLoan','payer@gmail.com',150000,'2019-11-08 20:28:28',1500000,7,'payer Ahmed ',300000,1200000,'payer'),(63,'Mohammadpur, Dhaka.','bussinessLoan','payer@gmail.com',150000,'2019-11-08 20:28:33',1500000,7,'payer Ahmed ',450000,1050000,'payer'),(64,'Mohammadpur, Dhaka.','bussinessLoan','payer@gmail.com',150000,'2019-11-08 20:28:37',1500000,7,'payer Ahmed ',600000,900000,'payer'),(65,'Mohammadpur, Dhaka.','bussinessLoan','payer@gmail.com',150000,'2019-11-08 20:28:50',1500000,7,'payer Ahmed ',750000,750000,'payer'),(66,'Mohammadpur, Dhaka.','bussinessLoan','payer@gmail.com',150000,'2019-11-08 20:28:55',1500000,7,'payer Ahmed ',900000,600000,'payer'),(67,'Mohammadpur, Dhaka.','bussinessLoan','payer@gmail.com',150000,'2019-11-08 20:29:06',1500000,7,'payer Ahmed ',1050000,450000,'payer'),(68,'Mohammadpur, Dhaka.','bussinessLoan','payer@gmail.com',150000,'2019-11-08 20:29:12',1500000,7,'payer Ahmed ',1200000,300000,'payer'),(69,'Gabtoli, Dhaka.','personalLOan','rabiul@gmail.com',500,'2019-11-08 20:29:19',20000,8,'Rabiul Islam ',0,20000,'rabiul'),(70,'Gabtoli, Dhaka.','personalLOan','rabiul@gmail.com',500,'2019-11-08 20:29:24',20000,8,'Rabiul Islam ',500,19500,'rabiul'),(71,'Gabtoli, Dhaka.','personalLOan','rabiul@gmail.com',500,'2019-11-08 20:29:29',20000,8,'Rabiul Islam ',1000,19000,'rabiul'),(72,'Gabtoli, Dhaka.','personalLOan','rabiul@gmail.com',500,'2019-11-08 20:29:34',20000,8,'Rabiul Islam ',1500,18500,'rabiul'),(73,'Gabtoli, Dhaka.','personalLOan','rabiul@gmail.com',500,'2019-11-08 20:29:39',20000,8,'Rabiul Islam ',2000,18000,'rabiul'),(74,'Gabtoli, Dhaka.','personalLOan','rabiul@gmail.com',500,'2019-11-08 20:29:44',20000,8,'Rabiul Islam ',2500,17500,'rabiul'),(75,'Gabtoli, Dhaka.','personalLOan','rabiul@gmail.com',500,'2019-11-08 20:29:50',20000,8,'Rabiul Islam ',3000,17000,'rabiul'),(76,'Mohammadpur, Dhaka.','personalLOan','raju@gmail.com',1500,'2019-11-08 20:29:59',60000,9,'Raju Ahmed ',0,60000,'raju'),(77,'Mohammadpur, Dhaka.','personalLOan','raju@gmail.com',1500,'2019-11-08 20:30:06',60000,9,'Raju Ahmed ',1500,58500,'raju'),(78,'Mohammadpur, Dhaka.','personalLOan','raju@gmail.com',1500,'2019-11-08 20:30:12',60000,9,'Raju Ahmed ',3000,57000,'raju'),(79,'Mohammadpur, Dhaka.','personalLOan','raju@gmail.com',1500,'2019-11-08 20:30:16',60000,9,'Raju Ahmed ',4500,55500,'raju'),(80,'Mohammadpur, Dhaka.','personalLOan','raju@gmail.com',1500,'2019-11-08 20:30:22',60000,9,'Raju Ahmed ',6000,54000,'raju'),(81,'Mohammadpur, Dhaka.','personalLOan','raju@gmail.com',1500,'2019-11-08 20:30:27',60000,9,'Raju Ahmed ',7500,52500,'raju'),(82,'Mohammadpur, Dhaka.','personalLOan','raju@gmail.com',1500,'2019-11-08 20:30:32',60000,9,'Raju Ahmed ',9000,51000,'raju'),(83,'Kustia, Dhaka.','personalLOan','Rubayet@gmail.com',1000,'2019-11-08 20:30:40',40000,10,'Rubayet Islam ',0,40000,'rubayet'),(84,'Kustia, Dhaka.','personalLOan','Rubayet@gmail.com',1000,'2019-11-08 20:30:47',40000,10,'Rubayet Islam ',1000,39000,'rubayet'),(85,'Kustia, Dhaka.','personalLOan','Rubayet@gmail.com',1000,'2019-11-08 20:30:55',40000,10,'Rubayet Islam ',2000,38000,'rubayet'),(86,'Kustia, Dhaka.','personalLOan','Rubayet@gmail.com',1000,'2019-11-08 20:31:00',40000,10,'Rubayet Islam ',3000,37000,'rubayet'),(87,'Kustia, Dhaka.','personalLOan','Rubayet@gmail.com',1000,'2019-11-08 20:31:07',40000,10,'Rubayet Islam ',4000,36000,'rubayet'),(88,'Mohammadpur, Dhaka','personalLOan','saif@gmial.com',875,'2019-11-08 20:31:13',35000,11,'Saif Tanvir ',0,35000,'saif'),(89,'Mohammadpur, Dhaka','personalLOan','saif@gmial.com',875,'2019-11-08 20:31:19',35000,11,'Saif Tanvir ',875,34125,'saif'),(90,'Dhaka.','personalLOan','saker@gmail.com',1125,'2019-11-08 20:31:26',45000,12,'Salauddin Saker ',0,45000,'saker'),(91,'Dhaka.','personalLOan','saker@gmail.com',1125,'2019-11-08 20:31:31',45000,12,'Salauddin Saker ',1125,43875,'saker'),(92,'Dhaka.','personalLOan','saker@gmail.com',1125,'2019-11-08 20:31:37',45000,12,'Salauddin Saker ',2250,42750,'saker');
/*!40000 ALTER TABLE `installment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userinfo`
--

DROP TABLE IF EXISTS `userinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userinfo` (
  `userId` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `createdDate` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `enabled` bit(1) NOT NULL,
  `filename` varchar(255) DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `username` varchar(12) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userinfo`
--

LOCK TABLES `userinfo` WRITE;
/*!40000 ALTER TABLE `userinfo` DISABLE KEYS */;
INSERT INTO `userinfo` VALUES (2,'Tonagi, Dhaka.','2019-11-08 18:49:08','asif@gmail.com','','asif_developer.b8196dc1.jpg','Abdulllah','Al-Asif','$2a$10$LQ2/tLho5SEvoKGEZPzdHuDYNsR14XvoPLtYaGP4w3jVYWtFhCuXy','01725986715','User',NULL,'asif'),(3,'Dhamrai, Dhaka.','2019-11-08 18:50:50','asraf@gmai.com','','ashraful_developer.cb2600e5.jpg','Asraful ','Islam','$2a$10$o3BBoVvXtdYzTsDoZA9ajucH1waBBR2zGIoN0V8wL8rXC7l9.Pnc6','01758956832','User',NULL,'asraf'),(4,'Azimpur, Dhaka.','2019-11-08 18:51:54','enamul@gmail.com','','enamul_qa.e99128ff.jpg','Enamul','Haque','$2a$10$zf5DW3AdAaaha61//WuzOepEjYjVFzEIyurlf.kZBdWDnZielmxFy','01785369825','User',NULL,'enamul'),(5,'Gulshan, Dhaka.','2019-11-08 18:54:39','faruk@gmail.com','','faruk.jpg','Omar','Faruk','$2a$10$rGcf.ROHrrD0NMWfIV.CF.JYWfWK5u.wNp1VV/YSkR4Bj4mKR4XdC','01725986895','User',NULL,'faruk'),(6,'Dhaka','2019-11-08 18:58:20','monir@gmail.com','','monir_developer.3546012a.jpg','Monir','Khan','$2a$10$jyd/LgwcQEBvETRUI/lG1.UMCNJrLlvJaufZ0L76U9/IzpixSx0aq','01872986585','User',NULL,'monir'),(7,'Mohammadpur, Dhaka.','2019-11-08 18:59:25','payer@gmail.com','','payer_developer.39539d4e.jpg','payer','Ahmed','$2a$10$/FuUQZxYBr6Yi4zZGw00d./VMwnOn13pxz/ApkJjWOWMxhMojJTja','01785256899','User',NULL,'payer'),(8,'Gabtoli, Dhaka.','2019-11-08 19:00:53','rabiul@gmail.com','','rabiul_developer.858fcf4a.jpg','Rabiul','Islam','$2a$10$We7o25KdMdiQIkvhQqFBleYLugdHiwQq/AGr9QPXdQIi0nL01PYzy','01758659875','User',NULL,'rabiul'),(9,'Mohammadpur, Dhaka.','2019-11-08 19:01:54','raju@gmail.com','','raju_developer.6d874c37.jpg','Raju','Ahmed','$2a$10$UjQm7HoXGq9In0RfXSeLJ.Z6AmKUmRDY6DNMEdiwnm2TUQZYZjFqu','01075822454','User',NULL,'raju'),(10,'Kustia, Dhaka.','2019-11-08 19:03:08','Rubayet@gmail.com','','rubyet_developer.7b92bc3e.jpg','Rubayet','Islam','$2a$10$04iX.fSeZEjCv0IC0QSmZOMEJyAHSKw/KADOZtg0XqLPKlQ5T5Tzi','01754256980','User',NULL,'rubayet'),(11,'Mohammadpur, Dhaka','2019-11-08 19:04:36','saif@gmial.com','','saif_developer.471f02e7.jpg','Saif','Tanvir','$2a$10$IM7qNIUltr.IWmyiOe09f.K3GpB.GfURVomqH34qyksVArjZ93YJK','01705986585','User',NULL,'saif'),(12,'Dhaka.','2019-11-08 19:06:14','saker@gmail.com','','salauddin_developer.1f0c0635.jpg','Salauddin','Saker','$2a$10$wgFLkHJoUuQYlMd2nhxNgOr6NZqB6r0Ss6ozQux359L4t7.0Qv/Yi','01758326598','User',NULL,'saker'),(13,'Rajbari, Dhaka.','2019-11-08 19:07:34','adoralim121@gmail.com','','alim_developer.3cdc4bdd.jpg','Abdul','Alim','$2a$10$9ZCTgW4.4JSe98uz5W9cAe/S8Q6WJhN1FzTtuDE4M6QPetZ68b7Um','01705768898','admin',NULL,'a2alim');
/*!40000 ALTER TABLE `userinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'loanmanagement'
--

--
-- Dumping routines for database 'loanmanagement'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-08 21:57:27
