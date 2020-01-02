use mall;

create table if not exists pms_brand (id int not null primary key);

alter table
   pms_brand
modify
   id bigint;

show index
from
   pms_brand;

alter table
   pms_brand
add
   i int;

show columns
from
   pms_brand;

-- user management --
create table if not exists ums_admin (
   id bigint primary key,
   username varchar(64),
   password varchar(64),
   icon varchar(500),
   email varchar(100),
   nick_name varchar(200),
   note varchar(500),
   create_time datetime,
   login_time datetime,
   status int(1)
);

create table if not exists ums_role (
   id bigint primary key,
   name varchar(100),
   description varchar(500),
   admin_count int,
   create_time datetime,
   status int(1),
   sort int
);

create table if not exists ums_permission (
   id bigint primary key,
   pid bigint,
   name varchar(100),
   value varchar(200),
   icon varchar(500),
   type int(1),
   uri varchar(200),
   status int(1),
   create_time datetime,
   sort int,
   foreign key(pid) references ums_permission(id)
);

create table if not exists ums_admin_role_relation (
   id bigint primary key,
   admin_id bigint,
   role_id bigint,
   foreign key (admin_id) references ums_admin(id),
   foreign key (role_id) references ums_role(id)
);

create table if not exists ums_role_permission_relation (
   id bigint primary key,
   role_id bigint,
   permission_id bigint,
   foreign key (role_id) references ums_role(id),
   foreign key (permission_id) references ums_permission(id)
);

create table if not exists ums_admin_permission_relation (
   id bigint primary key,
   admin_id bigint,
   permission_id bigint,
   type int(1),
   foreign key (admin_id) references ums_admin(id),
   foreign key (permission_id) references ums_permission(id)
);

show columns
from
   ums_admin_role_relation;

show columns
from
   ums_permission;

-- product management
-- all lack foreign key
create table if not exists pms_product_attribute (
   id bigint primary key auto_increment,
   product_attribute_category_id bigint,
   name varchar(64),
   select_type int(1),
   input_type int(1),
   input_list int(1),
   sort int,
   filter_type int(1),
   search_type int(1),
   related_status int(1),
   hand_add_status int(1),
   type int(1)
);

create table if not exists pms_product_atrribute_value (
   id bigint primary key auto_increment,
   product_id bigint,
   product_attribute_id bigint,
   value varchar(64)
);

create table if not exists pms_product (
   id bigint not null auto_increment,
   brand_id bigint comment '品牌id',
   product_category_id bigint comment '品牌分类id',
   feight_template_id bigint comment '运费模版id',
   product_attribute_category_id bigint comment '品牌属性分类id',
   name varchar (64) not null comment '商品名称',
   pic varchar (255) comment '图片',
   product_sn varchar (64) not null comment '货号',
   delete_status int (1) comment '删除状态：0->未删除；1->已删除',
   publish_status int (1) comment '上架状态：0->下架；1->上架',
   new_status int (1) comment '新品状态:0->不是新品；1->新品',
   recommand_status int (1) comment '推荐状态；0->不推荐；1->推荐',
   verify_status int (1) comment '审核状态：0->未审核；1->审核通过',
   sort int comment '排序',
   sale int comment '销量',
   price decimal (10, 2) comment '价格',
   promotion_price decimal (10, 2) comment '促销价格',
   gift_growth int default 0 comment '赠送的成长值',
   gift_point int default 0 comment '赠送的积分',
   use_point_limit int comment '限制使用的积分数',
   sub_title varchar (255) comment '副标题',
   description text comment '商品描述',
   original_price decimal (10, 2) comment '市场价',
   stock int comment '库存',
   low_stock int comment '库存预警值',
   unit varchar (16) comment '单位',
   weight decimal (10, 2) comment '商品重量，默认为克',
   preview_status int (1) comment '是否为预告商品：0->不是；1->是',
   service_ids varchar (64) comment '以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮',
   keywords varchar (255) comment '关键字',
   note varchar (255) comment '备注',
   album_pics varchar (255) comment '画册图片，连产品图片限制为5张，以逗号分割',
   detail_title varchar (255) comment '详情标题',
   detail_desc text comment '详情描述',
   detail_html text comment '产品详情网页内容',
   detail_mobile_html text comment '移动端网页详情',
   promotion_start_time datetime comment '促销开始时间',
   promotion_end_time datetime comment '促销结束时间',
   promotion_per_limit int comment '活动限购数量',
   promotion_type int (1) comment '促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购',
   product_category_name varchar (255) comment '产品分类名称',
   brand_name varchar (255) comment '品牌名称',
   primary key (id)
);

DROP TABLE IF EXISTS `pms_product_category`;
CREATE TABLE `pms_product_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL COMMENT '上机分类的编号：0表示一级分类',
  `name` varchar(64) DEFAULT NULL,
  `level` int(1) DEFAULT NULL COMMENT '分类级别：0->1级；1->2级',
  `product_count` int(11) DEFAULT NULL,
  `product_unit` varchar(64) DEFAULT NULL,
  `nav_status` int(1) DEFAULT NULL COMMENT '是否显示在导航栏：0->不显示；1->显示',
  `show_status` int(1) DEFAULT NULL COMMENT '显示状态：0->不显示；1->显示',
  `sort` int(11) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL COMMENT '图标',
  `keywords` varchar(255) DEFAULT NULL,
  `description` text COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8 COMMENT='产品分类';

DROP TABLE IF EXISTS `pms_product_attribute_category`;
CREATE TABLE `pms_product_attribute_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `attribute_count` int(11) DEFAULT '0' COMMENT '属性数量',
  `param_count` int(11) DEFAULT '0' COMMENT '参数数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='产品属性分类表';