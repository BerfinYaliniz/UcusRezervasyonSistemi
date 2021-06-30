-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 30 Haz 2021, 17:35:19
-- Sunucu sürümü: 8.0.23
-- PHP Sürümü: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `member_db`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `adminlogin`
--

CREATE TABLE `adminlogin` (
  `admin_id` int NOT NULL,
  `admin_email` varchar(100) NOT NULL,
  `admin_password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Tablo döküm verisi `adminlogin`
--

INSERT INTO `adminlogin` (`admin_id`, `admin_email`, `admin_password`) VALUES
(1, 'admin@gmail.com', 'admin');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `anadolu_jt`
--

CREATE TABLE `anadolu_jt` (
  `sefer_id` int NOT NULL,
  `sefer_no` int NOT NULL,
  `sefer_baslangic` text NOT NULL,
  `sefer_bitis` text NOT NULL,
  `koltuk_no` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `anadolu_jt`
--

INSERT INTO `anadolu_jt` (`sefer_id`, `sefer_no`, `sefer_baslangic`, `sefer_bitis`, `koltuk_no`) VALUES
(0, 1, 'Bartyn', 'İstanbul', 6),
(1, 2, 'Bartyn', 'Ankara', 5);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `atlas`
--

CREATE TABLE `atlas` (
  `sefer_id` int NOT NULL,
  `sefer_no` int NOT NULL,
  `sefer_baslangic` varchar(50) NOT NULL,
  `sefer_bitis` varchar(50) NOT NULL,
  `koltuk_no` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `atlas`
--

INSERT INTO `atlas` (`sefer_id`, `sefer_no`, `sefer_baslangic`, `sefer_bitis`, `koltuk_no`) VALUES
(1, 1, 'Bartyn', 'Konya', 3),
(2, 2, 'Bartyn', 'Ankara', 3),
(3, 3, 'Antalya', 'İzmir', 6);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `pegasus`
--

CREATE TABLE `pegasus` (
  `sefer_id` int NOT NULL,
  `sefer_no` int NOT NULL,
  `sefer_baslangic` text NOT NULL,
  `sefer_bitis` text NOT NULL,
  `koltuk_no` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `yolcu_db`
--

CREATE TABLE `yolcu_db` (
  `member_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `member_email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `member_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `member_birth` date NOT NULL,
  `member_address` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Tablo döküm verisi `yolcu_db`
--

INSERT INTO `yolcu_db` (`member_name`, `member_email`, `member_password`, `member_birth`, `member_address`) VALUES
('ayse', 'ayse1@hotmail.com', '1234', '0000-00-00', ''),
('j', 'h', 'nn', '0000-00-00', '[C@5a42dd28'),
('sdf', 'h', 'nn', '0000-00-00', '[C@55fa81ae'),
('sdf', 'h', 'nn', '0000-00-00', '[C@2e7b851c'),
('sdf', 'h', 'nn', '0000-00-00', '[C@5c00075a'),
('asdfgh', 'd', 'c', '0000-00-00', 'd'),
('xc', 'df', 'xd', '0000-00-00', 'xc'),
('j', 'j', 'j', '0000-00-00', 'k'),
('sdfg', '12.12.21', 'erf', '0000-00-00', 'jh'),
('adres', 'dogum', 'sife', '0000-00-00', 'soyad'),
('ad', 'adres', 'sifre', '0000-00-00', 'email'),
('ad', 'email', 'sifre', '0000-00-00', 'adres'),
('gh', 'gh', 'gh', '0000-00-00', 'gh'),
('hyj', 'ukhk', 'uh', '0000-00-00', 'h'),
('jh', '', '', '0000-00-00', ''),
('fg', 'sdf', 'sdf', '0000-00-00', 'e'),
('f', 'df', 'rt', '0000-00-00', 'sed'),
('kjn', 'k', 'k', '0000-00-00', 'k'),
('sdfn', 'jın', 'jn', '0000-00-00', 'oj'),
('berfin', 'berfingh', 'sdf', '0000-00-00', 's'),
('berf', 'sd', 'sd', '0000-00-00', 'asdf'),
('berfin', 'berfin', '1234', '0000-00-00', 'sdfg'),
('', '', '', '0000-00-00', ''),
('khj', 'khj', 'hgg', '2012-12-20', 'l'),
('hg', 'fhg@hotmail.com', '65', '2012-12-20', 'jgu'),
('df', 'sdf', 'asd', '2012-12-20', 'r'),
('x', '12', 'd', '2012-12-12', ''),
('berfin', 'berfinq', '123', '2012-12-12', 'kj'),
('j', 'j', '123', '2012-12-12', 'nv'),
('a', 'a', '12', '2012-12-12', 'ljipjıj');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `adminlogin`
--
ALTER TABLE `adminlogin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Tablo için indeksler `atlas`
--
ALTER TABLE `atlas`
  ADD PRIMARY KEY (`sefer_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
