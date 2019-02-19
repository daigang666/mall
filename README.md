# mall

又一个小商场系统。

mall = Spring Boot后端 + Vue管理员前端 + 微信小程序用户前端

* [文档](https://linlinjava.gitbook.io/mall)
* [贡献](https://linlinjava.gitbook.io/mall/contribute)
* [FAQ](https://linlinjava.gitbook.io/mall/7)

## 上架实例

![](./doc/pic/demo.png)    

## 项目代码

* [码云](https://gitee.com/linlinjava/mall)
* [GitHub](https://github.com/linlinjava/mall)

## 项目架构
![](./doc/pic/1.png)    

## 技术栈

> 1. Spring Boot
> 2. Vue
> 3. 微信小程序

![](doc/pic/2.png)    

## 功能

### 小商城功能

* 首页
* 专题列表、专题详情
* 分类列表、分类详情
* 品牌列表、品牌详情
* 新品首发、人气推荐
* 优惠券列表、优惠券选择
* 团购
* 搜索
* 商品详情、商品评价、商品分享
* 购物车
* 下单
* 订单列表、订单详情
* 地址、收藏、足迹、意见反馈
* 客服

### 管理平台功能

* 会员管理
* 商城管理
* 商品管理
* 推广管理
* 系统管理

## 云演示

### 小商城演示访问

由于没有上线，只能在微信开发工具中测试运行：

1. 微信开发工具导入mall-wx项目;
2. 项目配置，启用“不校验合法域名、web-view（业务域名）、TLS 版本以及 HTTPS 证书”
3. 点击“编译”，即可在微信开发工具预览效果；
4. 也可以点击“预览”，然后手机扫描登录。
   注意，手机需要打开调试功能。

![](./doc/pic/3.png)    


### 管理平台演示访问

1. 浏览器打开，输入以下网址[http://122.152.206.172:8080/#/login](http://122.152.206.172:8080/#/login)
2. 管理员名称`admin123`，管理员密码`admin123`

![](doc/pic/4.png)

## 快速启动

1. 配置最小开发环境：
    * [MySQL](https://dev.mysql.com/downloads/mysql/)
    * [JDK1.8或以上](http://www.oracle.com/technetwork/java/javase/overview/index.html)
    * [Maven](https://maven.apache.org/download.cgi)
    * [Nodejs](https://nodejs.org/en/download/)
    * [微信开发者工具](https://developers.weixin.qq.com/miniprogram/dev/devtools/download.html)
    
2. 数据库依次导入mall-db/sql下的数据库文件
    * mall_schema.sql
    * mall_table.sql
    * mall_data.sql

3. 启动小商场和管理后台的后端服务

    打开命令行，输入以下命令
    ```bash
    cd mall
    mvn install
    mvn package
    cd ./mall-all
    mvn spring-boot:run
    ```
    
4. 启动管理后台前端

    打开命令行，输入以下命令
    ```bash
    npm install -g cnpm --registry=https://registry.npm.taobao.org
    cd mall/mall-admin
    cnpm install
    cnpm run dev
    ```
    此时，浏览器打开，输入网址`http://localhost:9527`, 此时进入管理后台登录页面。
    
5. 启动小商城前端
   
   打开微信开发者工具，导入mall-wx模块,点击`编译`即可，此时可以预览小商场效果。

   这里存在两套小商场前端mall-wx和renard-wx，开发者可以分别导入和测试。
   
注意：
> 这里只是最简启动方式，而且小商场的微信登录会失败，更详细方案请参考文档。

## 开发计划

当前版本[v1.1.0](./CHANGELOG.md)

目前项目开发中，存在诸多不足，以下是目前规划的开发计划。

V 1.0.0 完成以下目标：

1. 除了部分功能（如优惠券等），小商城的优化和改进基本结束；
2. 管理后台基本实现所有表的CRUD操作；
3. 后端服务能够对参数进行检验。

V 2.0.0 完成以下目标：

1. 小商城和管理后台完成所有基本业务；
2. 管理后台实现统计功能、日志功能、权限功能

V 3.0.0 完成以下目标：

1. 管理后台一些辅助功能
2. 后端服务加强安全功能、配置功能
3. 缓存功能以及优化一些性能

## 警告

> 1. 本项目仅用于学习练习
> 2. 项目目前还不完善，仍处在开发中，不承担任何使用后果
> 3. 项目代码开源[MIT](./LICENSE)，项目文档采用 [署名-禁止演绎 4.0 国际协议许可](https://creativecommons.org/licenses/by-nd/4.0/deed.zh)

## 致谢

本项目基于或参考以下项目：

1. [nideshop-mini-program](https://github.com/tumobi/nideshop-mini-program)

   项目介绍：基于Node.js+MySQL开发的开源微信小程序商城（微信小程序）

   项目参考：
    （1）mall项目数据库基于nideshop-mini-program项目数据库；
    （2）mall项目的mall-wx模块基于nideshop-mini-program开发。

2. [vue-element-admin](https://github.com/PanJiaChen/vue-element-admin)
  
   项目介绍： 一个基于Vue和Element的后台集成方案
  
   项目参考：mall项目的mall-admin模块的前端框架基于该项目修改扩展。

3. [mall-admin-web](https://github.com/macrozheng/mall-admin-web)

   项目介绍：mall-admin-web是一个电商后台管理系统的前端项目，基于Vue+Element实现。

   项目参考：mall项目的mall-admin模块的一些页面布局样式参考了该项目。

4. [biu](https://github.com/CaiBaoHong/biu)

   项目介绍：管理后台项目开发脚手架，基于vue-element-admin和springboot搭建，前后端分离方式开发和部署。

   项目参考：mall项目的权限管理功能参考了该项目。
