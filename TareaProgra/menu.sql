-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 12-11-2019 a las 02:20:11
-- Versión del servidor: 5.7.27-0ubuntu0.18.04.1
-- Versión de PHP: 7.2.19-0ubuntu0.18.04.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `menu`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Libro`
--

CREATE TABLE `Libro` (
  `id_libro` int(11) NOT NULL,
  `titulo` varchar(20) NOT NULL,
  `escritor` varchar(20) NOT NULL,
  `idioma` varchar(20) NOT NULL,
  `paginas` int(4) NOT NULL,
  `genero_libro` varchar(20) NOT NULL,
  `fecha_libro` date NOT NULL,
  `capitulos` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Libro`
--

INSERT INTO `Libro` (`id_libro`, `titulo`, `escritor`, `idioma`, `paginas`, `genero_libro`, `fecha_libro`, `capitulos`) VALUES
(1, 'Estrutura', 'Joyanes', 'Español', 600, 'Educacion', '2000-01-01', 8),
(3, 'Tomorrowland', 'Roberto Hasbun', 'Ingles', 400, 'Romatica', '2018-11-25', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Pelicula`
--

CREATE TABLE `Pelicula` (
  `id_pelicula` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `genero` varchar(20) NOT NULL,
  `fecha_lanzamiento` date NOT NULL,
  `audio` varchar(20) NOT NULL,
  `director` varchar(20) NOT NULL,
  `duracion` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Pelicula`
--

INSERT INTO `Pelicula` (`id_pelicula`, `nombre`, `genero`, `fecha_lanzamiento`, `audio`, `director`, `duracion`) VALUES
(2, 'Cars', 'Animada', '2001-01-01', 'Español', 'Pixar', 150),
(4, 'Xmen', 'Ciencia Ficcion', '2000-01-01', 'Español', 'Marvel', 120),
(5, 'LinternaVerde', 'Ciencia Ficcion', '2000-01-01', 'Ingles', 'Marvel', 150),
(6, 'Aquaman', 'Ciencia Ficcion', '2000-01-01', 'Español', 'DC ', 160),
(7, 'Kong', 'Accion', '2017-07-22', 'Frances', 'Warner', 160);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Revista`
--

CREATE TABLE `Revista` (
  `id_revista` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `editorial` varchar(20) NOT NULL,
  `idioma` varchar(20) NOT NULL,
  `paginas` int(4) NOT NULL,
  `genero` varchar(20) NOT NULL,
  `fecha_revista` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Revista`
--

INSERT INTO `Revista` (`id_revista`, `nombre`, `editorial`, `idioma`, `paginas`, `genero`, `fecha_revista`) VALUES
(2, 'Avon', 'Avon', 'Español', 50, 'Belleza', '2000-01-01'),
(3, 'RevistaMexico', 'MexicoTimes', 'Español', 20, 'Noticias', '2000-01-01'),
(4, 'Batman', 'DC Comics', 'Ingles', 300, 'Comic', '1998-07-22');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Serie`
--

CREATE TABLE `Serie` (
  `id_serie` int(11) NOT NULL,
  `nombre_serie` varchar(20) NOT NULL,
  `genero_serie` varchar(20) NOT NULL,
  `fecha_serie` date NOT NULL,
  `audio_serie` varchar(20) NOT NULL,
  `director_serie` varchar(20) NOT NULL,
  `duracion_serie` int(3) NOT NULL,
  `temporadas` int(3) NOT NULL,
  `capitulos` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Serie`
--

INSERT INTO `Serie` (`id_serie`, `nombre_serie`, `genero_serie`, `fecha_serie`, `audio_serie`, `director_serie`, `duracion_serie`, `temporadas`, `capitulos`) VALUES
(2, 'Pretty', 'Romatica', '2000-01-01', 'Ingles', 'Warner', 44, 60, 12),
(3, 'Flash', 'Ciencia Ficcion', '2014-02-04', 'Español', 'Warner', 60, 20, 0),
(4, 'Transilvania', 'Animada', '2000-01-01', 'Español', 'Disney', 12, 5, 12),
(5, 'Arrow', 'Accion', '2000-01-01', 'Español', 'DC', 44, 5, 10),
(6, 'Supergirl', 'Accion', '2018-03-15', 'Ingles', 'DC', 20, 5, 10);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Libro`
--
ALTER TABLE `Libro`
  ADD PRIMARY KEY (`id_libro`);

--
-- Indices de la tabla `Pelicula`
--
ALTER TABLE `Pelicula`
  ADD PRIMARY KEY (`id_pelicula`);

--
-- Indices de la tabla `Revista`
--
ALTER TABLE `Revista`
  ADD PRIMARY KEY (`id_revista`);

--
-- Indices de la tabla `Serie`
--
ALTER TABLE `Serie`
  ADD PRIMARY KEY (`id_serie`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Libro`
--
ALTER TABLE `Libro`
  MODIFY `id_libro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `Pelicula`
--
ALTER TABLE `Pelicula`
  MODIFY `id_pelicula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `Revista`
--
ALTER TABLE `Revista`
  MODIFY `id_revista` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `Serie`
--
ALTER TABLE `Serie`
  MODIFY `id_serie` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
