CREATE TABLE `jdbc_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `age` bigint(20) DEFAULT NULL,
  `email` varchar(200) NULL DEFAULT NULL,
  `phone` varchar(200) NULL DEFAULT NULL,
  `version` varchar(200) DEFAULT NULL,
  `last_modify_time` timestamp NULL DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;






