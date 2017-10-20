/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : sboot

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-10-19 20:05:21
*/

CREATE DATABASE IF NOT EXISTS sboot DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

USE sboot;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_dept
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
  `d_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID，自增',
  `d_name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of t_dept
-- ----------------------------
INSERT INTO `t_dept` VALUES ('1', 'Product');

-- ----------------------------
-- Table structure for t_emp
-- ----------------------------
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE `t_emp` (
  `e_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID，自增',
  `e_name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `e_age` int(3) DEFAULT NULL,
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of t_emp
-- ----------------------------
