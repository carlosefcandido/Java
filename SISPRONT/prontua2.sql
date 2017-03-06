-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 06-Mar-2017 às 13:14
-- Versão do servidor: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prontua2`
--
CREATE DATABASE IF NOT EXISTS `prontua2` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `prontua2`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `entrega_prontuario`
--

CREATE TABLE `entrega_prontuario` (
  `codentrega` int(11) NOT NULL,
  `codfunc` int(11) NOT NULL,
  `codpront` int(11) NOT NULL,
  `data` varchar(20) DEFAULT NULL,
  `hora` time DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `entrega_prontuario`
--

INSERT INTO `entrega_prontuario` (`codentrega`, `codfunc`, `codpront`, `data`, `hora`) VALUES
(1, 1, 1, NULL, NULL),
(2, 1, 1, '2017-03-05 00:00:00', NULL),
(3, 1, 1, '2017-03-05 00:00:00', '17:24:12'),
(4, 1, 1, '2017-03-05 00:00:00', '17:25:25'),
(5, 2, 1, '03/05/2017', '17:32:07'),
(6, 1, 1, '05/03/2017', '17:34:04');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `codfunc` int(11) NOT NULL,
  `nome` varchar(250) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `setor` varchar(100) NOT NULL,
  `login` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`codfunc`, `nome`, `cpf`, `setor`, `login`, `senha`) VALUES
(1, 'Carlos Eduardo de Farias Candido', '099.258.477-96', 'CPD', 'kadu', 'kadu'),
(2, 'Alice Correa dos Santos', '105.635.387-24', 'Item 1', 'alice', 'alice');

-- --------------------------------------------------------

--
-- Estrutura da tabela `prontuario`
--

CREATE TABLE `prontuario` (
  `codpront` int(11) NOT NULL,
  `nome` varchar(300) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `num_pront` varchar(20) NOT NULL,
  `data_internacao` varchar(10) NOT NULL,
  `data_alta` varchar(10) NOT NULL,
  `corredor` varchar(10) NOT NULL,
  `prateleira` varchar(10) NOT NULL,
  `num_caixa` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `prontuario`
--

INSERT INTO `prontuario` (`codpront`, `nome`, `cpf`, `num_pront`, `data_internacao`, `data_alta`, `corredor`, `prateleira`, `num_caixa`) VALUES
(1, 'Carlos Eduardo', '099.258.477-96', '12345', '10/10/2010', '11/10/2010', 'Item 1', 'Item 1', 'Item 1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `retirada_prontuario`
--

CREATE TABLE `retirada_prontuario` (
  `codretirada` int(11) NOT NULL,
  `codfunc` int(11) NOT NULL,
  `codpront` int(11) NOT NULL,
  `data` varchar(20) DEFAULT NULL,
  `hora` time DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `retirada_prontuario`
--

INSERT INTO `retirada_prontuario` (`codretirada`, `codfunc`, `codpront`, `data`, `hora`) VALUES
(1, 2, 1, '06/03/2017', '09:52:35');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `entrega_prontuario`
--
ALTER TABLE `entrega_prontuario`
  ADD PRIMARY KEY (`codentrega`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`codfunc`),
  ADD UNIQUE KEY `cpf` (`cpf`);

--
-- Indexes for table `prontuario`
--
ALTER TABLE `prontuario`
  ADD PRIMARY KEY (`codpront`);

--
-- Indexes for table `retirada_prontuario`
--
ALTER TABLE `retirada_prontuario`
  ADD PRIMARY KEY (`codretirada`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `entrega_prontuario`
--
ALTER TABLE `entrega_prontuario`
  MODIFY `codentrega` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `codfunc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `prontuario`
--
ALTER TABLE `prontuario`
  MODIFY `codpront` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `retirada_prontuario`
--
ALTER TABLE `retirada_prontuario`
  MODIFY `codretirada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
