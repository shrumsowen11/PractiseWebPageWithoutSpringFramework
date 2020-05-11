-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 11, 2020 at 10:52 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `keubiko_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee_tbl`
--

CREATE TABLE `employee_tbl` (
  `EID` int(11) NOT NULL,
  `UserID` varchar(50) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `DOB` date NOT NULL,
  `MOBILE` bigint(11) DEFAULT NULL,
  `SALARY` double DEFAULT NULL,
  `SSN` bigint(11) NOT NULL,
  `CREATEDATE` timestamp NULL DEFAULT NULL,
  `UPDATEDATE` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee_tbl`
--

INSERT INTO `employee_tbl` (`EID`, `UserID`, `Password`, `NAME`, `EMAIL`, `DOB`, `MOBILE`, `SALARY`, `SSN`, `CREATEDATE`, `UPDATEDATE`) VALUES
(3, 'rabinabasnet11', 'bmb11', 'Rabina', 'rabina@gmail.com', '1995-09-09', 43532454, 450000, 43535, NULL, NULL),
(1, 'shrums', 'shrums', 'shrums', 'shrums@gmail.com', '1994-05-12', 2435235, 2435235, 2435235, '2020-05-07 04:00:00', '2020-05-21 04:00:00'),
(0, 'bibhu', 'bibhu', 'bibhu', 'bibhu@gmail.com', '2020-09-09', 123, 1500, 123, NULL, NULL),
(23, 'beckham', 'beckham', 'beckham', 'beckham@gmail.com', '1889-09-09', 234234, 34000000000, 234234, NULL, NULL),
(0, 'kaji', 'kaji', 'kaji', 'kaji@gmail.com', '2020-04-02', 324, 3000, 324, NULL, NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
