-- phpMyAdmin SQL Dump
-- version 4.3.8
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 04, 2016 at 07:02 AM
-- Server version: 5.5.42-37.1-log
-- PHP Version: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `thewebb2_cit360`
--
CREATE DATABASE thewebb2_cit360;

USE thewebb2_cit360;

-- --------------------------------------------------------

--
-- Table structure for table `counties`
--

CREATE TABLE IF NOT EXISTS `counties` (
  `id` int(3) NOT NULL,
  `county` varchar(30) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=52 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `counties`
--

INSERT INTO `counties` (`id`, `county`) VALUES
(1, 'Ada'),
(2, '	Adams	'),
(3, '	Alturas	'),
(4, '	Bannock	'),
(5, '	Bear Lake	'),
(6, '	Benewah	'),
(7, '	Bingham	'),
(8, '	Blaine	'),
(9, '	Boise	'),
(10, '	Bonner	'),
(11, '	Bonneville	'),
(12, '	Boundary	'),
(13, '	Butte	'),
(14, '	Camas	'),
(15, '	Canyon	'),
(16, '	Caribou	'),
(17, '	Cassia	'),
(18, '	Clark	'),
(19, '	Clearwater	'),
(20, '	Coeur d''Alene Reservation	'),
(21, '	Custer	'),
(22, '	Duck Valley Reservation	'),
(23, '	Elmore	'),
(24, '	Fort Hall Reservation	'),
(25, '	Franklin	'),
(26, '	Fremont	'),
(27, '	Gem	'),
(28, '	Gooding	'),
(29, '	Idaho	'),
(30, '	Jefferson	'),
(31, '	Jerome	'),
(32, '	Kootenai	'),
(33, '	Latah	'),
(34, '	Lemhi	'),
(35, '	Lewis	'),
(36, '	Lincoln	'),
(37, '	Madison	'),
(38, '	Minidoka	'),
(39, '	Nez Perce	'),
(40, '	Nez Perce Reservation	'),
(41, '	Oneida	'),
(42, '	Owyhee	'),
(43, '	Payette	'),
(44, '	Power	'),
(45, '	Shoshone	'),
(46, '	State Level Sites	'),
(47, '	Teton	'),
(48, '	Twin Falls	'),
(49, '	Valley	'),
(50, '	Washington	'),
(51, '	Yellowstone National Park	');

-- --------------------------------------------------------

--
-- Table structure for table `eagle`
--

CREATE TABLE IF NOT EXISTS `eagle` (
  `id` int(3) NOT NULL,
  `eagle_type` varchar(30) NOT NULL,
  `eagle_size` varchar(30) NOT NULL,
  `eagle_description` varchar(100) NOT NULL,
  `county_found` varchar(30) NOT NULL,
  `location_found` int(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `eagle_list`
--

CREATE TABLE IF NOT EXISTS `eagle_list` (
  `id` int(3) NOT NULL,
  `type_of_eagle` varchar(50) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=60 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `eagle_list`
--

INSERT INTO `eagle_list` (`id`, `type_of_eagle`) VALUES
(1, 'White-bellied Sea-eagle Haliaeetus leucogaster'),
(2, '	Sanford''s Sea-eagle Haliaeetus sanfordi	'),
(3, '	African Fish-eagle Haliaeetus vocifer	'),
(4, '	Madagascar Fish-eagle Haliaeetus vociferoides	'),
(5, '	Pallas''s Fish-eagle Haliaeetus leucoryphus	'),
(6, '	White-tailed Eagle Haliaeetus albicilla	'),
(7, '	Bald Eagle Haliaeetus leucocephalus	'),
(8, '	Steller''s Sea-eagle Haliaeetus pelagicus	'),
(9, '	Lesser Fish-eagle Ichthyophaga humilis	'),
(10, '	Grey-headed Fish-eagle Ichthyophaga ichthyaetus	'),
(11, '	Short-toed Snake-eagle Circaetus gallicus	'),
(12, '	Black-chested Snake-eagle Circaetus pectoralis	'),
(13, '	Beaudouin''s Snake-eagle Circaetus beaudouini	'),
(14, '	Brown Snake-eagle Circaetus cinereus	'),
(15, '	Southern Banded Snake-eagle Circaetus fasciolatus'),
(16, '	Banded Snake-eagle Circaetus cinerascens	'),
(17, '	Crested Serpent-eagle Spilornis cheela	'),
(18, '	South Nicobar Serpent-eagle Spilornis klossi	'),
(19, '	Mountain Serpent-eagle Spilornis kinabaluensis	'),
(20, '	Sulawesi Serpent-eagle Spilornis rufipectus	'),
(21, '	Philippine Serpent-eagle Spilornis holospilus	'),
(22, '	Andaman Serpent-eagle Spilornis elgini	'),
(23, '	Congo Serpent-eagle Dryotriorchis spectabilis	'),
(24, '	Madagascar Serpent-eagle Eutriorchis astur	'),
(25, '	Black-chested Buzzard-eagle Geranoaetus melanoleu'),
(26, '	Solitary Eagle Harpyhaliaetus solitarius	'),
(27, '	Crowned Eagle Harpyhaliaetus coronatus	'),
(28, '	Crested Eagle Morphnus guianensis	'),
(29, '	Harpy Eagle Harpia harpyja	'),
(30, '	New Guinea Eagle Harpyopsis novaeguineae	'),
(31, '	Philippine Eagle Pithecophaga jefferyi	'),
(32, '	Black Eagle Ictinaetus malayensis	'),
(33, '	Lesser Spotted Eagle Aquila pomarina	'),
(34, '	Indian Spotted Eagle Aquila hastata	'),
(35, '	Greater Spotted Eagle Aquila clanga	'),
(36, '	Tawny Eagle Aquila rapax	'),
(37, '	Steppe Eagle Aquila nipalensis	'),
(38, '	Spanish Imperial Eagle Aquila adalberti	'),
(39, '	Eastern Imperial Eagle Aquila heliaca	'),
(40, '	Gurney''s Eagle Aquila gurneyi	'),
(41, '	Golden Eagle Aquila chrysaetos	'),
(42, '	Wedge-tailed Eagle Aquila audax	'),
(43, '	Verreaux''s Eagle Aquila verreauxii	'),
(44, '	Wahlberg''s Eagle Aquila wahlbergi	'),
(45, '	Bonelli''s Eagle Aquila fasciatus	'),
(46, '	African Hawk-eagle Hieraaetus spilogaster	'),
(47, '	Booted Eagle Hieraaetus pennatus	'),
(48, '	Little Eagle Hieraaetus morphnoides	'),
(49, '	New Guinea Hawk-eagle Hieraaetus weiskei	'),
(50, '	Ayres''s Hawk-eagle Hieraaetus ayresii	'),
(51, '	Martial Eagle Polemaetus bellicosus	'),
(52, '	Long-crested Eagle Lophaetus occipitalis	'),
(53, '	Cassin''s Hawk-eagle Aquila africanus	'),
(54, '	Black Hawk-eagle Spizaetus tyrannus	'),
(55, '	Black-and-white Hawk-eagle Spizaetus melanoleucus'),
(56, '	Ornate Hawk-eagle Spizaetus ornatus	'),
(57, '	Black-and-chestnut Eagle Spizaetus isidori	'),
(58, '	Crowned Hawk-eagle Stephanoaetus coronatus	'),
(59, '	Bateleur Terathopius ecaudatus	');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `counties`
--
ALTER TABLE `counties`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `eagle`
--
ALTER TABLE `eagle`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `eagle_list`
--
ALTER TABLE `eagle_list`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `counties`
--
ALTER TABLE `counties`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=52;
--
-- AUTO_INCREMENT for table `eagle`
--
ALTER TABLE `eagle`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `eagle_list`
--
ALTER TABLE `eagle_list`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=60;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
