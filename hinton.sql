/*
Navicat MySQL Data Transfer

Source Server         : Hotel
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : hinton

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2018-03-25 19:31:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `roomnumber` varchar(255) NOT NULL,
  `roomtype` varchar(255) NOT NULL,
  `price` int(255) NOT NULL,
  `direction` varchar(255) NOT NULL,
  `paystatus` int(11) NOT NULL DEFAULT '0',
  `status` int(255) NOT NULL,
  `costumer` varchar(255) DEFAULT NULL,
  `in_data` date DEFAULT NULL,
  `out_data` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES ('1', '320', '尊享度假套房', '1000', '南', '0', '3', '', null, null);
INSERT INTO `room` VALUES ('2', '321', '尊享度假套房', '2000', '西', '1', '2', '陈云', '2017-12-19', '2017-12-24');
INSERT INTO `room` VALUES ('4', '322', '尊享情侣套房', '1000', '南', '1', '2', '周川军', '2017-01-05', '2017-01-06');
INSERT INTO `room` VALUES ('5', '323', '尊享情侣套房', '900', '南', '1', '2', '章三', '2017-01-08', '2017-01-15');
INSERT INTO `room` VALUES ('6', '324', '尊享平民套房', '500', '南', '1', '2', '周华', '2018-01-03', '2018-01-05');
INSERT INTO `room` VALUES ('7', '420', '总统套房', '6000', '东', '0', '1', null, null, null);
INSERT INTO `room` VALUES ('8', '421', '尊享度假套房', '1000', '东', '0', '1', null, null, null);
INSERT INTO `room` VALUES ('9', '422', '尊享情侣套房', '1500', '南', '0', '1', null, null, null);
INSERT INTO `room` VALUES ('10', '425', '总统套房', '2000', '北', '0', '1', null, null, null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(11) NOT NULL,
  `count` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `src` varchar(255) NOT NULL,
  `credit` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('25', '0', 'manager1', '张家辉', '123456', '../../../img/photo/1.jpg', '');
INSERT INTO `user` VALUES ('26', '1', 'waiter1', '肖肖', '123456', '../../../img/photo/2.jpg', '');
INSERT INTO `user` VALUES ('28', '2', 'costumer2', '赵小宝', '123456', '../../../img/photo/2.jpg', '');
INSERT INTO `user` VALUES ('29', '2', 'costumer3', '张三丰', '123456', '../../../img/photo/4.jpg', '');
INSERT INTO `user` VALUES ('30', '2', 'costumer4', '周华', '123456', '../../../img/photo/3.jpg', '34290119960320x');
