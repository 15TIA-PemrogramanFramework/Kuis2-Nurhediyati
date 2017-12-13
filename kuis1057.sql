-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.43
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1057`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1057`
--

CREATE TABLE `identitas_1057` (
  `id` bigint(20) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `nohp` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1057`
--

INSERT INTO `identitas_1057` (`id`, `alamat`, `name`, `nohp`) VALUES
(1, 'Jl singgalang VI', 'Yataaai', '082285182758'),
(3, 'Jl Baung', 'Yati Comel', '082285182759'),
(4, 'Jl Baung', ' Comel', '08766182759');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1057`
--

CREATE TABLE `ipk_1057` (
  `id` bigint(20) NOT NULL,
  `ipk` varchar(100) NOT NULL,
  `nim` varchar(255) DEFAULT NULL,
  `predicat` varchar(255) DEFAULT NULL,
  `tahun` varchar(255) DEFAULT NULL,
  `identitas_1057_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk_1057`
--

INSERT INTO `ipk_1057` (`id`, `ipk`, `nim`, `predicat`, `tahun`, `identitas_1057_id`) VALUES
(1, '3.6', '1555301057', 'cumlaude', '2015', 1),
(3, '3.7', '1555301058', NULL, '2015', NULL),
(4, '3.9', '1555301058', NULL, '2015', NULL),
(8, '4', '1555301084', 'cumlaude', '2019', NULL),
(10, '4.9', '1555301084', 'cumlaude', '2019', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1057`
--
ALTER TABLE `identitas_1057`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_p3cl45jgctxrgfywemr81yrf2` (`name`);

--
-- Indexes for table `ipk_1057`
--
ALTER TABLE `ipk_1057`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_30vxtlqoojja5raog4q0bjwnt` (`ipk`),
  ADD KEY `FKk7op06xvlpbh8e2033s0crybh` (`identitas_1057_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1057`
--
ALTER TABLE `identitas_1057`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `ipk_1057`
--
ALTER TABLE `ipk_1057`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk_1057`
--
ALTER TABLE `ipk_1057`
  ADD CONSTRAINT `FKk7op06xvlpbh8e2033s0crybh` FOREIGN KEY (`identitas_1057_id`) REFERENCES `identitas_1057` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
