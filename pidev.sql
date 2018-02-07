-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Mer 07 Février 2018 à 00:59
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `pidev`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE `admin` (
  `CIN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `babysittings`
--

CREATE TABLE `babysittings` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `heure_deb` time NOT NULL,
  `duree` int(11) NOT NULL,
  `adresse` varchar(250) NOT NULL,
  `babysitteur` int(11) NOT NULL,
  `nbr_enfants` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `babysittings`
--

INSERT INTO `babysittings` (`id`, `date`, `heure_deb`, `duree`, `adresse`, `babysitteur`, `nbr_enfants`) VALUES
(2, '1970-01-01', '14:30:00', 4, '27,Rue LaFoie-Cité L\'indépendance-Ariana', 4, 4);

-- --------------------------------------------------------

--
-- Structure de la table `bonplans`
--

CREATE TABLE `bonplans` (
  `id` int(11) NOT NULL,
  `intitule` varchar(20) NOT NULL,
  `lieu` varchar(20) NOT NULL,
  `description` varchar(200) NOT NULL,
  `budget` float NOT NULL,
  `date_debut` datetime NOT NULL,
  `date_fin` datetime NOT NULL,
  `image` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `coupons`
--

CREATE TABLE `coupons` (
  `id` int(11) NOT NULL,
  `image_coupon` varchar(50) NOT NULL,
  `nom` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `covoiturage`
--

CREATE TABLE `covoiturage` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `nbr_places` int(11) NOT NULL,
  `heure_dep` int(11) NOT NULL,
  `lieu_dep` varchar(250) NOT NULL,
  `lieu_dest` varchar(250) NOT NULL,
  `covoitureur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `covoiturage`
--

INSERT INTO `covoiturage` (`id`, `date`, `nbr_places`, `heure_dep`, `lieu_dep`, `lieu_dest`, `covoitureur`) VALUES
(1, '1970-01-01', 3, 10, 'Cité Les Roses-Tunis', 'Garderie LPA', 2),
(3, '1970-01-01', 1, 14, 'Immeuble Prestige,Cité Ennasr', 'Garderie El Maarefa', 4),
(4, '1970-01-01', 4, 17, '27,Rue LaFoie-Cité L\'indépendance-Ariana', 'Garderie L\'Espoir', 1);

-- --------------------------------------------------------

--
-- Structure de la table `enfant`
--

CREATE TABLE `enfant` (
  `CIN` int(11) NOT NULL,
  `Age` int(11) NOT NULL,
  `Pseudonyme` varchar(20) NOT NULL,
  `Sexe` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `evenements`
--

CREATE TABLE `evenements` (
  `id` int(11) NOT NULL,
  `intitule` varchar(20) NOT NULL,
  `date` datetime NOT NULL,
  `adresse` varchar(50) NOT NULL,
  `image` varchar(200) NOT NULL,
  `description` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `forums`
--

CREATE TABLE `forums` (
  `id` int(11) NOT NULL,
  `theme` varchar(20) NOT NULL,
  `intitule` varchar(20) NOT NULL,
  `date_creation` datetime NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `garderies`
--

CREATE TABLE `garderies` (
  `id` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `adresse` varchar(50) NOT NULL,
  `telephone` int(11) NOT NULL,
  `image` varchar(250) NOT NULL,
  `proprietaire` int(11) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `medecins`
--

CREATE TABLE `medecins` (
  `id` int(11) NOT NULL,
  `nom` varchar(250) NOT NULL,
  `prenom` varchar(250) NOT NULL,
  `specialite` varchar(250) NOT NULL,
  `telephone` int(11) NOT NULL,
  `adresse` varchar(250) NOT NULL,
  `email` varchar(250) NOT NULL,
  `image` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `parent`
--

CREATE TABLE `parent` (
  `CIN` int(11) NOT NULL,
  `Sexe` int(11) NOT NULL,
  `DateNaiss` int(11) NOT NULL,
  `Rue` varchar(50) NOT NULL,
  `Ville` varchar(20) NOT NULL,
  `CodePostal` int(11) NOT NULL,
  `Telephone` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `posts`
--

CREATE TABLE `posts` (
  `id` int(11) NOT NULL,
  `sujet` varchar(200) NOT NULL,
  `contenu` varchar(500) NOT NULL,
  `date` datetime NOT NULL,
  `idForum` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `promotions`
--

CREATE TABLE `promotions` (
  `id` int(11) NOT NULL,
  `code_promo` int(11) NOT NULL,
  `delai_promo` int(11) NOT NULL,
  `image_promo` varchar(100) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `publicites`
--

CREATE TABLE `publicites` (
  `id` int(11) NOT NULL,
  `intitule` varchar(50) NOT NULL,
  `image_pub` varchar(100) NOT NULL,
  `nom_enseigne` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `reclamation`
--

CREATE TABLE `reclamation` (
  `Id` int(11) NOT NULL,
  `intitule` varchar(500) NOT NULL,
  `contenu` varchar(500) NOT NULL,
  `date` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `CIN` int(11) NOT NULL,
  `Nom` int(11) NOT NULL,
  `Prenom` int(11) NOT NULL,
  `Email` int(11) NOT NULL,
  `MotDePasse` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `admin`
--
ALTER TABLE `admin`
  ADD KEY `CIN` (`CIN`);

--
-- Index pour la table `babysittings`
--
ALTER TABLE `babysittings`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `bonplans`
--
ALTER TABLE `bonplans`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `coupons`
--
ALTER TABLE `coupons`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `covoiturage`
--
ALTER TABLE `covoiturage`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `enfant`
--
ALTER TABLE `enfant`
  ADD PRIMARY KEY (`CIN`),
  ADD KEY `CIN` (`CIN`);

--
-- Index pour la table `evenements`
--
ALTER TABLE `evenements`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `forums`
--
ALTER TABLE `forums`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `garderies`
--
ALTER TABLE `garderies`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `medecins`
--
ALTER TABLE `medecins`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `parent`
--
ALTER TABLE `parent`
  ADD KEY `CIN` (`CIN`);

--
-- Index pour la table `posts`
--
ALTER TABLE `posts`
  ADD KEY `idForum` (`idForum`);

--
-- Index pour la table `promotions`
--
ALTER TABLE `promotions`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `publicites`
--
ALTER TABLE `publicites`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `reclamation`
--
ALTER TABLE `reclamation`
  ADD PRIMARY KEY (`Id`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`CIN`),
  ADD KEY `CIN` (`CIN`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `babysittings`
--
ALTER TABLE `babysittings`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `bonplans`
--
ALTER TABLE `bonplans`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `coupons`
--
ALTER TABLE `coupons`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `covoiturage`
--
ALTER TABLE `covoiturage`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `evenements`
--
ALTER TABLE `evenements`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `forums`
--
ALTER TABLE `forums`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `garderies`
--
ALTER TABLE `garderies`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `medecins`
--
ALTER TABLE `medecins`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `promotions`
--
ALTER TABLE `promotions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `publicites`
--
ALTER TABLE `publicites`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `reclamation`
--
ALTER TABLE `reclamation`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`CIN`) REFERENCES `user` (`CIN`);

--
-- Contraintes pour la table `enfant`
--
ALTER TABLE `enfant`
  ADD CONSTRAINT `enfant_ibfk_1` FOREIGN KEY (`CIN`) REFERENCES `parent` (`CIN`);

--
-- Contraintes pour la table `parent`
--
ALTER TABLE `parent`
  ADD CONSTRAINT `parent_ibfk_1` FOREIGN KEY (`CIN`) REFERENCES `user` (`CIN`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
