-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:33067
-- Generation Time: Apr 05, 2020 at 02:40 PM
-- Server version: 5.6.40-log
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `music`
--

-- --------------------------------------------------------

--
-- Table structure for table `album_lut`
--

CREATE TABLE `album_lut` (
  `album_id` int(11) DEFAULT NULL,
  `artist_id` int(11) DEFAULT NULL,
  `album_name` varchar(30) DEFAULT NULL,
  `album_release_date` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `album_lut`
--

INSERT INTO `album_lut` (`album_id`, `artist_id`, `album_name`, `album_release_date`) VALUES
(2, 2, 'Glory Sound Prep', '2018-11-09 00:00:00'),
(3, 2, 'The Human Condition', '2016-06-10 00:00:00'),
(4, 2, 'The Definition', '2014-09-23 00:00:00'),
(5, 2, 'The Separation', '2013-03-05 00:00:00'),
(6, 2, 'Translations Through Speakers', '2013-03-05 00:00:00'),
(7, 3, 'Neotheater', '2019-01-01 00:00:00'),
(8, 3, 'The Click (Deluxe Edition)', '2018-01-01 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `artist_lut`
--

CREATE TABLE `artist_lut` (
  `artist_id` int(11) DEFAULT NULL,
  `artist_name` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `artist_lut`
--

INSERT INTO `artist_lut` (`artist_id`, `artist_name`) VALUES
(2, 'Jon Bellion'),
(3, 'AJR');

-- --------------------------------------------------------

--
-- Table structure for table `playlist_lut`
--

CREATE TABLE `playlist_lut` (
  `playlist_id` int(11) DEFAULT NULL,
  `playlist_name` varchar(30) DEFAULT NULL,
  `create_date` varchar(40) DEFAULT NULL,
  `created_by_user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `playlist_lut`
--

INSERT INTO `playlist_lut` (`playlist_id`, `playlist_name`, `create_date`, `created_by_user_id`) VALUES
(1, 'My First Playlist', '2020-04-01 00:00:00', 1),
(2, 'My Second Playlist', '2020-04-02 00:00:00', 1),
(3, 'Stacy\'s Playlist', '2020-04-04 00:00:00', 2);

-- --------------------------------------------------------

--
-- Table structure for table `playlist_songs`
--

CREATE TABLE `playlist_songs` (
  `playlist_id` int(11) DEFAULT NULL,
  `song_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `song_lut`
--

CREATE TABLE `song_lut` (
  `song_id` int(11) DEFAULT NULL,
  `artist_id` int(11) DEFAULT NULL,
  `song_name` varchar(30) DEFAULT NULL,
  `song_length` varchar(40) DEFAULT NULL,
  `album_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `song_lut`
--

INSERT INTO `song_lut` (`song_id`, `artist_id`, `song_name`, `song_length`, `album_id`) VALUES
(3, 2, 'He Is The Same', '1899-12-30 04:01:00', 3),
(4, 2, '80\'s Films', '1899-12-30 03:36:00', 3),
(5, 2, 'All Time Low', '1899-12-30 03:37:00', 3),
(6, 2, 'New York Soul - Pt. ii', '1899-12-30 04:27:00', 3),
(7, 2, 'Fashion', '1899-12-30 03:55:00', 3),
(8, 2, 'Maybe IDK', '1899-12-30 03:53:00', 3),
(9, 2, 'Woke The F*ck Up', '1899-12-30 03:39:00', 3),
(10, 2, 'Overwhelming', '1899-12-30 02:52:00', 3),
(12, 2, 'Weight Of The World', '1899-12-30 04:29:00', 3),
(13, 2, 'The Good In Me', '1899-12-30 03:43:00', 3),
(14, 2, 'Morning In America', '1899-12-30 04:25:00', 3),
(15, 2, 'iRobot', '1899-12-30 03:28:00', 3),
(16, 2, 'Guillotine', '1899-12-30 03:28:00', 3),
(17, 2, 'Hand Of God - Outro', '1899-12-30 05:37:00', 3),
(18, 2, 'Munny Right', '1899-12-30 04:14:00', 4),
(19, 2, 'Carry Your Throne', '1899-12-30 03:24:00', 4),
(20, 2, 'Pre-Occupied', '1899-12-30 04:28:00', 4),
(21, 2, 'Human', '1899-12-30 03:25:00', 4),
(22, 2, 'Run Wild', '1899-12-30 03:13:00', 4),
(23, 2, 'A Haunted House', '1899-12-30 03:03:00', 4),
(24, 2, 'Jungle', '1899-12-30 03:52:00', 4),
(25, 2, 'Simple & Sweet', '1899-12-30 02:52:00', 4),
(26, 2, 'An Immigrant', '1899-12-30 03:01:00', 4),
(27, 2, 'Ooh', '1899-12-30 03:39:00', 4),
(28, 2, 'Luxury', '1899-12-30 04:03:00', 4),
(29, 2, 'Eyes To The Sky', '1899-12-30 02:45:00', 5),
(30, 2, 'Jim Morrison', '1899-12-30 03:19:00', 5),
(31, 2, 'Halloween', '1899-12-30 02:46:00', 5),
(32, 2, '2 Rocking Chairs', '1899-12-30 03:00:00', 5),
(33, 2, 'Ungrateful Eyes', '1899-12-30 03:25:00', 5),
(34, 2, 'One More Time', '1899-12-30 02:59:00', 5),
(35, 2, 'To My Future Wife...', '1899-12-30 02:31:00', 5),
(36, 2, 'A Dedicated Instrumental', '1899-12-30 01:32:00', 5),
(37, 2, 'When The Lions Come', '1899-12-30 04:22:00', 5),
(38, 2, 'NewYorkSoul', '1899-12-30 02:34:00', 5),
(39, 2, 'Superman, The Gift And The Cur', '1899-12-30 03:06:00', 5),
(40, 2, 'Kingdom Come', '1899-12-30 02:20:00', 5),
(41, 2, 'LIFE', '1899-12-30 03:23:00', 6),
(42, 2, 'Don\'t Ask Cuz I Don\'t Know', '1899-12-30 03:16:00', 6),
(43, 2, 'The Wonder Years', '1899-12-30 03:29:00', 6),
(44, 2, 'While You Count Sheep', '1899-12-30 03:25:00', 6),
(45, 2, 'For The Dreamers', '1899-12-30 04:26:00', 6),
(46, 2, 'Dead Man Walking', '1899-12-30 03:17:00', 6),
(47, 2, 'Wutup Snow?', '1899-12-30 03:50:00', 6),
(48, 2, 'Waves Of Loneliness', '1899-12-30 03:26:00', 6),
(49, 2, 'Paper Planes', '1899-12-30 03:07:00', 6),
(50, 2, 'Timeless', '1899-12-30 03:29:00', 6),
(51, 2, 'Conversations with my Wife', '1899-12-30 03:26:00', 2),
(52, 2, 'JT', '1899-12-30 04:28:00', 2),
(53, 2, 'Let\'s Begin', '1899-12-30 05:41:00', 2),
(54, 2, 'Stupid Deep', '1899-12-30 02:58:00', 2),
(55, 2, 'The Internet', '1899-12-30 03:09:00', 2),
(56, 2, 'Blu', '1899-12-30 03:03:00', 2),
(57, 2, 'Adult Swim', '1899-12-30 05:14:00', 2),
(58, 2, 'Couples Retreat', '1899-12-30 03:29:00', 2),
(59, 2, 'Cautionary Tales', '1899-12-30 03:47:00', 2),
(60, 2, 'Mah\'s Joint', '1899-12-30 08:02:00', 2),
(61, 3, 'Next Up Forever', '1899-12-30 04:17:00', 7),
(62, 3, 'Birthday Party', '1899-12-30 03:44:00', 7),
(63, 3, '100 Bad Days', '1899-12-30 03:33:00', 7),
(64, 3, 'Don\'t Throw Out My Legos', '1899-12-30 04:11:00', 7),
(65, 3, 'Break My Face', '1899-12-30 03:46:00', 7),
(66, 3, 'Turning Out Pt. ii', '1899-12-30 03:43:00', 7),
(67, 3, 'The Entertainment\'s Here', '1899-12-30 03:07:00', 7),
(68, 3, 'Karma', '1899-12-30 04:05:00', 7),
(69, 3, 'Beats', '1899-12-30 03:19:00', 7),
(70, 3, 'Wow, I\'m Not Crazy', '1899-12-30 03:17:00', 7),
(71, 3, 'Dear Winter', '1899-12-30 02:48:00', 7),
(72, 3, 'Finale (Can\'t Wait To See What', '1899-12-30 04:38:00', 7),
(73, 3, 'Overture', '1899-12-30 03:34:00', 8),
(74, 3, 'The Good Part', '1899-12-30 03:47:00', 8),
(75, 3, 'Weak', '1899-12-30 03:21:00', 8),
(76, 3, 'Sober Up', '1899-12-30 03:39:00', 8),
(77, 3, 'Drama', '1899-12-30 03:24:00', 8),
(78, 3, 'Turning Out', '1899-12-30 04:19:00', 8),
(79, 3, 'Three-Thirty', '1899-12-30 03:30:00', 8),
(80, 3, 'Call My Dad', '1899-12-30 02:16:00', 8),
(81, 3, 'I\'m Not Famous', '1899-12-30 03:40:00', 8),
(82, 3, 'Netflix Trip', '1899-12-30 03:58:00', 8),
(83, 3, 'Bud Like You', '1899-12-30 03:51:00', 8),
(84, 3, 'Come Hang Out', '1899-12-30 04:26:00', 8),
(85, 3, 'Burn The House Down', '1899-12-30 03:32:00', 8),
(86, 3, 'Role Models', '1899-12-30 03:12:00', 8),
(87, 3, 'Normal', '1899-12-30 03:05:00', 8),
(88, 3, 'Pretender - Acoustic', '1899-12-30 03:01:00', 8);

-- --------------------------------------------------------

--
-- Table structure for table `user_lut`
--

CREATE TABLE `user_lut` (
  `user_id` int(11) DEFAULT NULL,
  `user_name` varchar(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_lut`
--

INSERT INTO `user_lut` (`user_id`, `user_name`) VALUES
(1, 'Mason'),
(2, 'Stacy'),
(3, 'William');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
