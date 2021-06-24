-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 22 Haz 2021, 20:30:03
-- Sunucu sürümü: 10.4.18-MariaDB
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
-- Tablo için tablo yapısı `anadolu_jt`
--

CREATE TABLE `anadolu_jt` (
  `sefer_id` int(11) NOT NULL,
  `sefer_no` int(11) NOT NULL,
  `sefer_baslangic` text NOT NULL,
  `sefer_bitis` text NOT NULL,
  `koltuk_no` int(11) NOT NULL
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
  `sefer_id` int(11) NOT NULL,
  `sefer_no` int(11) NOT NULL,
  `sefer_baslangic` varchar(50) NOT NULL,
  `sefer_bitis` varchar(50) NOT NULL,
  `koltuk_no` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `atlas`
--

INSERT INTO `atlas` (`sefer_id`, `sefer_no`, `sefer_baslangic`, `sefer_bitis`, `koltuk_no`) VALUES
(1, 1, 'Bartyn', 'Konya', 3),
(2, 2, 'Bartyn', 'Ankara', 3),
(3, 3, 'Antalya', 'İzmir', 6),
(4, 4, 'Ankara', 'Samsun', 6),
(5, 5, 'İstanbul', 'Edirne', 3),
(6, 6, 'Diyarbakir', 'Adana', 3),
(7, 2, 'afasf', 'afaf', 3),
(8, 4, 'fffwwfw', 'fwfwfwf', 3);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `pegasus`
--

CREATE TABLE `pegasus` (
  `sefer_id` int(11) NOT NULL,
  `sefer_no` int(11) NOT NULL,
  `sefer_baslangic` text NOT NULL,
  `sefer_bitis` text NOT NULL,
  `koltuk_no` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `yolcu_db`
--

CREATE TABLE `yolcu_db` (
  `member_name` text NOT NULL,
  `member_email` text NOT NULL,
  `member_password` int(11) NOT NULL,
  `member_birth` text NOT NULL,
  `member_address` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `anadolu_jt`
--
ALTER TABLE `anadolu_jt`
  ADD PRIMARY KEY (`sefer_id`);

--
-- Tablo için indeksler `atlas`
--
ALTER TABLE `atlas`
  ADD PRIMARY KEY (`sefer_id`,`sefer_no`,`koltuk_no`);

--
-- Tablo için indeksler `pegasus`
--
ALTER TABLE `pegasus`
  ADD PRIMARY KEY (`sefer_id`,`sefer_no`,`koltuk_no`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `atlas`
--
ALTER TABLE `atlas`
  MODIFY `sefer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
