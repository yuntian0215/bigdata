/*
 Navicat Premium Data Transfer

 Source Server         : 测试数据库
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : 10.0.18.13:3306
 Source Schema         : bigdata

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 28/04/2020 15:34:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bigdata_resources
-- ----------------------------
DROP TABLE IF EXISTS `bigdata_resources`;
CREATE TABLE `bigdata_resources`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `resources_code` int(11) NULL DEFAULT NULL COMMENT '资源编码',
  `resources_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '资源名称',
  `resources_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '资源描述',
  `state` int(2) NULL DEFAULT NULL COMMENT '0未启用，1启用，2禁用',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `url_num` int(2) NULL DEFAULT NULL COMMENT 'url排序',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bigdata_resources
-- ----------------------------
INSERT INTO `bigdata_resources` VALUES (1, 55, '热点角色', '热点模块功能权限', 1, '2020-04-27 14:09:19', '2020-04-27 14:09:22', NULL);
INSERT INTO `bigdata_resources` VALUES (2, 56, '搜索角色', '搜索模块功能权限', 1, '2020-04-27 14:11:18', '2020-04-27 14:11:20', NULL);
INSERT INTO `bigdata_resources` VALUES (3, 571, '分析角色a', '分析模块10个主题功能权限', 1, '2020-04-27 14:12:29', '2020-04-27 14:12:32', NULL);
INSERT INTO `bigdata_resources` VALUES (4, 572, '分析角色b', '分析模块30个主题功能权限', 1, '2020-04-27 14:14:32', '2020-04-27 14:14:36', NULL);
INSERT INTO `bigdata_resources` VALUES (5, 573, '分析角色c', '分析模块100个主题功能权限', 1, '2020-04-27 14:14:39', '2020-04-27 14:14:42', NULL);
INSERT INTO `bigdata_resources` VALUES (6, 574, '分析角色d', '分析模块300个主题功能权限', 1, '2020-04-27 14:14:45', '2020-04-27 14:14:48', NULL);
INSERT INTO `bigdata_resources` VALUES (7, 575, '分析角色e', '分析模块功能权限', 1, '2020-04-27 14:14:51', '2020-04-27 14:14:54', NULL);
INSERT INTO `bigdata_resources` VALUES (8, 58, '报告角色', '报告模块功能权限', 1, '2020-04-27 14:16:33', '2020-04-27 14:16:36', NULL);
INSERT INTO `bigdata_resources` VALUES (9, 59, '大屏角色', '大屏模块功能权限', 1, '2020-04-27 14:16:39', '2020-04-27 14:16:43', NULL);
INSERT INTO `bigdata_resources` VALUES (10, 60, '设置角色', '设置模块功能权限', 1, '2020-04-27 14:16:46', '2020-04-27 14:16:48', NULL);

-- ----------------------------
-- Table structure for bigdata_role
-- ----------------------------
DROP TABLE IF EXISTS `bigdata_role`;
CREATE TABLE `bigdata_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
  `state` int(2) NULL DEFAULT NULL COMMENT '0未启用，1启用，2禁用',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bigdata_role
-- ----------------------------
INSERT INTO `bigdata_role` VALUES (1, '角色1', 1, '2020-04-27 14:59:55', '2020-04-27 14:59:57');
INSERT INTO `bigdata_role` VALUES (2, '角色2', 1, '2020-04-27 15:00:09', '2020-04-27 15:00:12');

-- ----------------------------
-- Table structure for bigdata_role_resources
-- ----------------------------
DROP TABLE IF EXISTS `bigdata_role_resources`;
CREATE TABLE `bigdata_role_resources`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NULL DEFAULT NULL COMMENT '角色id',
  `resources_code` int(11) NULL DEFAULT NULL COMMENT '资源编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bigdata_role_resources
-- ----------------------------
INSERT INTO `bigdata_role_resources` VALUES (1, 1, 55);
INSERT INTO `bigdata_role_resources` VALUES (2, 1, 573);
INSERT INTO `bigdata_role_resources` VALUES (3, 2, 58);

-- ----------------------------
-- Table structure for bigdata_user
-- ----------------------------
DROP TABLE IF EXISTS `bigdata_user`;
CREATE TABLE `bigdata_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `real_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号码',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `state` int(2) NULL DEFAULT NULL COMMENT '0未启用，1启用，2禁用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bigdata_user
-- ----------------------------
INSERT INTO `bigdata_user` VALUES (1, 'test', NULL, '13838385438', '$2a$10$NZ5o7r2E.ayT2ZoxgjlI.eJ6OEYqjH7INR/F.mXDbjZJi9HF0YCVG', NULL, '2020-04-27 14:58:10', '2020-04-27 14:58:12', 1);
INSERT INTO `bigdata_user` VALUES (2, 'admin', NULL, '13838386756', '$2a$10$NZ5o7r2E.ayT2ZoxgjlI.eJ6OEYqjH7INR/F.mXDbjZJi9HF0YCVG', NULL, '2020-04-27 14:59:10', '2020-04-27 14:59:13', NULL);

-- ----------------------------
-- Table structure for bigdata_user_role
-- ----------------------------
DROP TABLE IF EXISTS `bigdata_user_role`;
CREATE TABLE `bigdata_user_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户ID',
  `role_id` int(11) NULL DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bigdata_user_role
-- ----------------------------
INSERT INTO `bigdata_user_role` VALUES (1, 1, 1);
INSERT INTO `bigdata_user_role` VALUES (2, 2, 2);

SET FOREIGN_KEY_CHECKS = 1;
