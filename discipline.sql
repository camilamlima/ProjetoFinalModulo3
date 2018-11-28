-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Tempo de geração: 18/05/2018 às 23:58
-- Versão do servidor: 5.7.22-0ubuntu0.16.04.1
-- Versão do PHP: 7.0.30-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projeto_final_modulo3`
--

-- Create DATABase `projeto_final_modulo3`;
use `projeto_final_modulo3`;
-- --------------------------------------------------------

--
-- Estrutura para tabela `discipline`
--

CREATE TABLE `discipline` (
  `id` int(11) NOT NULL,
  `name_discipline` varchar(200) NOT NULL,
  `workload` int(10) NOT NULL,
  `course_name` varchar(200) NOT NULL,
  `number_vacancies` int(10) NOT NULL,
  `period` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `discipline`
--
ALTER TABLE `discipline`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `discipline`
--
ALTER TABLE `discipline`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
