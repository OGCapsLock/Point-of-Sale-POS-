-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01-Maio-2022 às 22:43
-- Versão do servidor: 10.4.17-MariaDB
-- versão do PHP: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `dbwsvendas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_cliente`
--

CREATE TABLE `tbl_cliente` (
  `pk_id_cliente` int(11) NOT NULL,
  `cli_nome` varchar(300) NOT NULL,
  `cli_endereco` varchar(350) NOT NULL,
  `cli_bairro` varchar(300) NOT NULL,
  `cli_cidade` varchar(200) NOT NULL,
  `cli_uf` varchar(2) NOT NULL,
  `cli_cep` varchar(9) NOT NULL,
  `cli_telefone` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_cliente`
--

INSERT INTO `tbl_cliente` (`pk_id_cliente`, `cli_nome`, `cli_endereco`, `cli_bairro`, `cli_cidade`, `cli_uf`, `cli_cep`, `cli_telefone`) VALUES
(1, 'WENDEL SEGADILHA', 'RUA SÃO JOÃO', 'VILA ADELAIDE CABRAL', 'SANTA INES', 'MA', '65300-855', '(98)98600-3186');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_forma_pagamento`
--

CREATE TABLE `tbl_forma_pagamento` (
  `pk_id_for_pag` bigint(20) UNSIGNED NOT NULL,
  `descricao_for_pag` varchar(255) NOT NULL,
  `desconto_for_pag` float NOT NULL,
  `parcelas_for_pag` int(11) NOT NULL,
  `situacao_for_pag` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_forma_pagamento`
--

INSERT INTO `tbl_forma_pagamento` (`pk_id_for_pag`, `descricao_for_pag`, `desconto_for_pag`, `parcelas_for_pag`, `situacao_for_pag`) VALUES
(1, 'A VISTA', 0, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_fornecedor`
--

CREATE TABLE `tbl_fornecedor` (
  `idFornecedor` int(11) NOT NULL,
  `forNome` varchar(50) NOT NULL,
  `forEmpresa` varchar(60) NOT NULL,
  `forTelefone` varchar(25) NOT NULL,
  `forDescricao` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_fornecedor`
--

INSERT INTO `tbl_fornecedor` (`idFornecedor`, `forNome`, `forEmpresa`, `forTelefone`, `forDescricao`) VALUES
(7, 'cuna', 'service solution', '8465606', 'venda de mouse'),
(8, 'Angelina', 'Mult Lda', '842702769', 'venda de pratos pretos');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_produto`
--

CREATE TABLE `tbl_produto` (
  `pk_id_produto` int(11) NOT NULL,
  `pro_nome` varchar(300) NOT NULL,
  `pro_valor` double NOT NULL,
  `pro_estoque` int(11) NOT NULL,
  `pro_Cod_Barras` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_produto`
--

INSERT INTO `tbl_produto` (`pk_id_produto`, `pro_nome`, `pro_valor`, `pro_estoque`, `pro_Cod_Barras`) VALUES
(1, 'CAMISA GOLA POLO', 30, 71, 22),
(6, 'Teclado', 500, 200, 55),
(7, 'Mouse', 99.5, 450, 77);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_usuario`
--

CREATE TABLE `tbl_usuario` (
  `pk_id_usuario` int(11) NOT NULL,
  `usu_nome` varchar(150) NOT NULL,
  `usu_login` varchar(100) NOT NULL,
  `usu_senha` varchar(20) NOT NULL,
  `usu_Perfil` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_usuario`
--

INSERT INTO `tbl_usuario` (`pk_id_usuario`, `usu_nome`, `usu_login`, `usu_senha`, `usu_Perfil`) VALUES
(1, 'Administrador', 'admin', 'admin', 'admin'),
(2, 'ANGELINA', 'angel', 'angel', 'funcionario');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_venda`
--

CREATE TABLE `tbl_venda` (
  `pk_id_venda` int(11) NOT NULL,
  `fk_cliente` int(11) NOT NULL,
  `ven_data` date NOT NULL,
  `ven_valor_liquido` double NOT NULL,
  `ven_valor_bruto` double NOT NULL,
  `ven_desconto` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_venda`
--

INSERT INTO `tbl_venda` (`pk_id_venda`, `fk_cliente`, `ven_data`, `ven_valor_liquido`, `ven_valor_bruto`, `ven_desconto`) VALUES
(51, 1, '2022-04-27', 30, 30, 0),
(52, 1, '2022-04-27', 30, 30, 0),
(53, 1, '2022-04-27', 110, 120, 10),
(54, 1, '2022-04-28', 30, 30, 0),
(55, 1, '2022-04-28', 30, 30, 0),
(56, 1, '2022-04-28', 30, 30, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_vendas_produtos`
--

CREATE TABLE `tbl_vendas_produtos` (
  `pk_id_venda_produto` int(11) NOT NULL,
  `fk_produto` int(11) NOT NULL,
  `fk_venda` int(11) NOT NULL,
  `ven_pro_valor` double NOT NULL,
  `ven_pro_quantidade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbl_cliente`
--
ALTER TABLE `tbl_cliente`
  ADD PRIMARY KEY (`pk_id_cliente`);

--
-- Índices para tabela `tbl_forma_pagamento`
--
ALTER TABLE `tbl_forma_pagamento`
  ADD PRIMARY KEY (`pk_id_for_pag`),
  ADD UNIQUE KEY `pk_id_for_pag` (`pk_id_for_pag`);

--
-- Índices para tabela `tbl_fornecedor`
--
ALTER TABLE `tbl_fornecedor`
  ADD PRIMARY KEY (`idFornecedor`);

--
-- Índices para tabela `tbl_produto`
--
ALTER TABLE `tbl_produto`
  ADD PRIMARY KEY (`pk_id_produto`),
  ADD UNIQUE KEY `pro_Cod_Barras` (`pro_Cod_Barras`);

--
-- Índices para tabela `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  ADD PRIMARY KEY (`pk_id_usuario`);

--
-- Índices para tabela `tbl_venda`
--
ALTER TABLE `tbl_venda`
  ADD PRIMARY KEY (`pk_id_venda`),
  ADD KEY `fk_cliente_venda` (`fk_cliente`);

--
-- Índices para tabela `tbl_vendas_produtos`
--
ALTER TABLE `tbl_vendas_produtos`
  ADD PRIMARY KEY (`pk_id_venda_produto`),
  ADD KEY `fk_produtos_venda` (`fk_produto`),
  ADD KEY `fk_venda_prod` (`fk_venda`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbl_cliente`
--
ALTER TABLE `tbl_cliente`
  MODIFY `pk_id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `tbl_forma_pagamento`
--
ALTER TABLE `tbl_forma_pagamento`
  MODIFY `pk_id_for_pag` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `tbl_fornecedor`
--
ALTER TABLE `tbl_fornecedor`
  MODIFY `idFornecedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `tbl_produto`
--
ALTER TABLE `tbl_produto`
  MODIFY `pk_id_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  MODIFY `pk_id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `tbl_venda`
--
ALTER TABLE `tbl_venda`
  MODIFY `pk_id_venda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT de tabela `tbl_vendas_produtos`
--
ALTER TABLE `tbl_vendas_produtos`
  MODIFY `pk_id_venda_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=109;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tbl_venda`
--
ALTER TABLE `tbl_venda`
  ADD CONSTRAINT `fk_cliente_venda` FOREIGN KEY (`fk_cliente`) REFERENCES `tbl_cliente` (`pk_id_cliente`);

--
-- Limitadores para a tabela `tbl_vendas_produtos`
--
ALTER TABLE `tbl_vendas_produtos`
  ADD CONSTRAINT `fk_produtos_venda` FOREIGN KEY (`fk_produto`) REFERENCES `tbl_produto` (`pk_id_produto`),
  ADD CONSTRAINT `fk_venda_prod` FOREIGN KEY (`fk_venda`) REFERENCES `tbl_venda` (`pk_id_venda`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
