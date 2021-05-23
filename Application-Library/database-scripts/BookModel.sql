CREATE TABLE `book_model` (
  `bookid` int NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) DEFAULT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `quantity` int NOT NULL,
  PRIMARY KEY (`bookid`)
) ENGINE=MyISAM AUTO_INCREMENT=32656 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
