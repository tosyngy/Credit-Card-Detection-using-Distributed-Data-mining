-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 10, 2016 at 01:06 PM
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `creditcarddatamining`
--
CREATE DATABASE `creditcarddatamining` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `creditcarddatamining`;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `level` int(1) NOT NULL,
  `status` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`, `level`, `status`) VALUES
(1, 'admin', 'admin', 1, '0');

-- --------------------------------------------------------

--
-- Table structure for table `atmacc`
--

CREATE TABLE IF NOT EXISTS `atmacc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `no` varchar(20) NOT NULL,
  `security_no` varchar(10) NOT NULL,
  `bank` varchar(100) NOT NULL,
  `pin` varchar(11) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `atmacc`
--

INSERT INTO `atmacc` (`id`, `name`, `no`, `security_no`, `bank`, `pin`, `status`) VALUES
(1, 'olabode segun', '89392738732', '383', 'firstbank', '1234', 0),
(2, 'olabode segun', '8438348834389', '324', 'wema', '0000', 0),
(3, 'adeola raji', '12345678901234', '123', 'FirstBank', '0000', 0),
(4, 'raji adedolapo', '0987654321123456', '390', 'FirstBank', '1111', 0);

-- --------------------------------------------------------

--
-- Table structure for table `bank_account`
--

CREATE TABLE IF NOT EXISTS `bank_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usr_id` int(11) NOT NULL,
  `bank_name` varchar(200) NOT NULL,
  `amt` float NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `bank_account`
--

INSERT INTO `bank_account` (`id`, `usr_id`, `bank_name`, `amt`, `status`) VALUES
(1, 1, 'firstbank', 28300, 0),
(2, 1, 'wema', 5000, 0),
(3, 2, 'FirstBank', 9300.42, 0),
(4, 3, 'FirstBank', 3504.17, 0);

-- --------------------------------------------------------

--
-- Table structure for table `card`
--

CREATE TABLE IF NOT EXISTS `card` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `no` varchar(20) NOT NULL,
  `security` int(5) NOT NULL,
  `bank` varchar(100) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `card`
--

INSERT INTO `card` (`id`, `user_id`, `name`, `no`, `security`, `bank`, `status`) VALUES
(2, 1, 'olabode segun', '89392738732', 383, 'firstbank', 0),
(3, 2, 'adeola raji', '12345678901234', 123, 'FirstBank', 0),
(4, 3, 'raji adedolapo', '0987654321123456', 390, 'FirstBank', 0);

-- --------------------------------------------------------

--
-- Table structure for table `register_detaila`
--

CREATE TABLE IF NOT EXISTS `register_detaila` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `surname` varchar(100) NOT NULL,
  `first name` varchar(100) NOT NULL,
  `other name` varchar(100) NOT NULL,
  `date of birth` varchar(100) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `occupation` varchar(100) NOT NULL,
  `state of origin` varchar(20) NOT NULL,
  `local government` varchar(50) NOT NULL,
  `meiden name` varchar(50) NOT NULL,
  `address` text NOT NULL,
  `state of birth` varchar(100) NOT NULL,
  `mobile no` varchar(20) NOT NULL,
  `marital status` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` text NOT NULL,
  `status` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `register_detaila`
--

INSERT INTO `register_detaila` (`id`, `surname`, `first name`, `other name`, `date of birth`, `gender`, `occupation`, `state of origin`, `local government`, `meiden name`, `address`, `state of birth`, `mobile no`, `marital status`, `email`, `password`, `status`) VALUES
(1, 'name1', 'name2', 'name3', '10/05/95', 'Male', 'working', 'lagos', 'logos', 'mother', 'here or there', 'here', '08012345678', 'Single', 'me@u.com', 'user1', '0'),
(2, 'adeola', 'raji', 'ester', '12/05/99', 'Female', 'teacher', 'osun', 'ire', 'mama', 'my home', 'lagos', '07012345678', 'Married', 'adeola@raji.com', 'user2', '0'),
(3, 'aina', 'abiodun', 'oluwatobiloba', '01/11/90', 'Male', 'teacher', 'ogun', 'agbado', 'tinuke', 'agbado crossing', 'ijaye', '08107347818', 'Single', 'ainatobilobaa@hotmail.com', '12345678', '0');

-- --------------------------------------------------------

--
-- Table structure for table `sec_ques`
--

CREATE TABLE IF NOT EXISTS `sec_ques` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `question` text NOT NULL,
  `answer` varchar(20) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `sec_ques`
--

INSERT INTO `sec_ques` (`id`, `user_id`, `question`, `answer`, `status`) VALUES
(1, 1, 'is sola my best teacher?', 'maybe not', 0),
(3, 1, 'was i ever married', 'maybe', 0),
(4, 1, 'did i ever attempt to jump from hill', 'no', 0),
(5, 1, 'can i trade the world for money', 'no', 0),
(6, 2, 'is dolapo my lovely brother', 'yes', 0),
(7, 2, 'is atan my parents home town', 'no', 0),
(8, 2, 'my husband lives at abuja', 'yes', 0),
(9, 2, 'my first son is popularly called my grand father', 'maybe not', 0),
(10, 2, 'i love eaten moimoi', 'maybe', 0),
(11, 3, 'what is your maiden name?', 'yes', 0),
(12, 3, 'what is your father''s name?', 'maybe', 0);

-- --------------------------------------------------------

--
-- Table structure for table `transactionhistory`
--

CREATE TABLE IF NOT EXISTS `transactionhistory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `card_id` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `payment_type` text NOT NULL,
  `amount` double NOT NULL DEFAULT '0',
  `status` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

--
-- Dumping data for table `transactionhistory`
--

INSERT INTO `transactionhistory` (`id`, `card_id`, `type`, `payment_type`, `amount`, `status`) VALUES
(1, '89392738732', 'deposite', 'deposite', 30000, 0),
(2, '89392738732', 'deposite', 'deposite', 10000, 0),
(3, '89392738732', 'withdraw', 'withdraw', 5000, 0),
(4, '89392738732', 'balance status', 'status', 0, 0),
(5, '89392738732', 'cash transfer', 'withdraw', 5000, 0),
(6, '89392738732', 'mobile recharge', 'withdraw', 200, 0),
(7, '89392738732', 'mobile recharge', 'withdraw', 500, 0),
(8, '89392738732', 'block card', 'status', 0, 0),
(9, '89392738732', 'pin changed', 'status', 0, 0),
(10, '89392738732', 'block card', 'status', 0, 0),
(11, '89392738732', 'bill payment', 'withdraw', 1000, 0),
(14, '0987654321123456', 'withdraw', 'withdraw', 1000, 0),
(13, '0987654321123456', 'balance status', 'status', 0, 0),
(15, '0987654321123456', 'block card', 'status', 0, 0),
(16, '0987654321123456', 'balance status', 'status', 0, 0),
(17, '0987654321123456', 'mobile recharge', 'withdraw', 100, 0),
(18, '0987654321123456', 'mobile recharge', 'withdraw', 100, 0),
(19, '0987654321123456', 'mobile recharge', 'withdraw', 100, 0),
(20, '0987654321123456', 'cash transfer', 'withdraw', 1000, 0),
(21, '0987654321123456', 'pin changed', 'status', 0, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
