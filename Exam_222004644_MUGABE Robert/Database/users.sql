-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 18, 2024 at 01:52 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `exam`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `fname` text NOT NULL,
  `lname` text NOT NULL,
  `sex` text NOT NULL,
  `email` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`fname`, `lname`, `sex`, `email`, `username`, `password`) VALUES
('Mugabe', 'Robert', 'male', 'mugabe@gmail.com', 'mugabe123', '123'),
('Abizeyimana', 'Pascal', 'Male', 'pascal@gmail.com', 'pascal', '12345'),
('44646464', '4455454', 'Male', '344747', 'rewq', '12345'),
('Anitha', 'MUSONERA', 'female', 'anitha@gmail.com', 'anitha123', '123'),
('KARIZA', 'Aviella', 'female', 'kariza@gmail.com', 'kariza', '123'),
('SHAMI', 'Jesse', 'Male', 'shamijesse@gmail.com', 'jesse', '123'),
('Mutoni', 'Jacky', 'female', 'jacky@gmail.com', 'jacky', '123'),
('MUCYO', 'Papias', 'Male', 'papias@gmail.com', 'mucyo', '123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
