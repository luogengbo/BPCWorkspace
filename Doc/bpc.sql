/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : sakila

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2016-06-29 23:05:37
*/

SET FOREIGN_KEY_CHECKS=0;


-- ----------------------------
-- Table structure for dict_item
-- ----------------------------
DROP TABLE IF EXISTS `dict_item`;
CREATE TABLE `dict_item` (
  `pk_dict_item` tinyint(32) NOT NULL AUTO_INCREMENT,
  `dict_id` varchar(256) NOT NULL COMMENT '字典ID',
  `dict_name` varchar(256) DEFAULT NULL COMMENT '字典名称',
  `group_id` varchar(256) DEFAULT NULL COMMENT '字典组',
  `sort` tinyint(4) DEFAULT NULL COMMENT '排序',
  `is_effective` varchar(2) DEFAULT NULL COMMENT '是否有效',
  `operator` varchar(65) DEFAULT NULL COMMENT '操作员',
  `create_time` datetime DEFAULT NOW() COMMENT '创建时间',
  `last_modify_time` datetime DEFAULT NOW() COMMENT '修改时间',
  `description` varchar(512) DEFAULT NULL COMMENT '描述',
  `en_name` varchar(256) DEFAULT NULL COMMENT '英文名称',
  PRIMARY KEY (`pk_dict_item`),
  KEY `IDX_DICT_ITEM_GROUP_ID` (`group_id`(255)) USING HASH
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for params
-- ----------------------------
DROP TABLE IF EXISTS `params`;
CREATE TABLE `params` (
  `pk_param` tinyint(32) NOT NULL AUTO_INCREMENT,
  `param_key` varchar(256) NOT NULL COMMENT '参数KEY',
  `param_name` varchar(256) DEFAULT NULL COMMENT '参数名称',
  `param_value` varchar(4000) DEFAULT NULL COMMENT '参数值',
  `is_effective` varchar(2) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `operator` varchar(64) DEFAULT NULL COMMENT '操作员',
  `create_time` datetime DEFAULT NOW() COMMENT '创建时间',
  `last_modify_time` datetime DEFAULT NOW() COMMENT '修改时间',
  `description` varchar(512) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`pk_param`),
  KEY `IDX_PARAMS_KEY` (`param_key`(255)) USING HASH
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for navigate_info
-- ----------------------------
DROP TABLE IF EXISTS `navigate_info`;
CREATE TABLE `navigate_info` (
  `pk_navigate_info` tinyint(32) NOT NULL AUTO_INCREMENT,
  `nav_key` varchar(256) NOT NULL COMMENT '导航KEY',
  `nav_name` varchar(256) DEFAULT NULL COMMENT '导航名称',
  `display_order` tinyint(8) DEFAULT NULL COMMENT '展示顺序',
  `nav_icon` varchar(64) DEFAULT NULL COMMENT '展示样式，图标样式',
  `is_effective` varchar(2) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `operator` varchar(64) DEFAULT NULL COMMENT '操作员',
  `create_time` datetime DEFAULT NOW() COMMENT '创建时间',
  `last_modify_time` datetime DEFAULT NOW() COMMENT '修改时间',
  PRIMARY KEY (`pk_navigate_info`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



