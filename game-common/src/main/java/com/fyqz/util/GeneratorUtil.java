/*
 * Copyright (c) 2011-2020, baomidou (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.fyqz.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;


/**
 * 代码生成器
 *
 * @author 曾超
 */
public class GeneratorUtil {

    public static void generator(String modelMame, String author, String userName, String password, String jdbcUrl, String[] exclude, String[] include, String parentPackage) {
        int result = 0;
        String fileFolder = System.getProperty("user.dir" ) + "/" + modelMame + "/src/main/java";
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator().setGlobalConfig(
                // 全局配置
                new GlobalConfig()
                        .setOutputDir(fileFolder)//输出目录
                        .setFileOverride(true)// 是否覆盖文件
                        .setActiveRecord(false)// 开启 activeRecord 模式
                        .setEnableCache(false)// XML 二级缓存
                        .setBaseResultMap(true)// XML ResultMap
                        .setBaseColumnList(true)// XML columList
                        //.setKotlin(true) 是否生成 otlin 代码
                        .setAuthor(author)
                        .setOpen(false)
                        // 自定义文件命名，注意 %s 会自动填充表实体属性！
                        .setEntityName("%sEntity" )
                        // .setMapperName("%sDao")
                        // .setXmlName("%sDao")
                        // .setServiceName("MP%sService")
                        // .setServiceImplName("%sServiceDiy")
                        // .setControllerName("%sAction")
                        .setSwagger2(true)
        ).setDataSource(
                // 数据源配置
                new DataSourceConfig()
                        .setDbType(DbType.MYSQL) // 数据库类型
                        .setTypeConvert(new MySqlTypeConvert() {
                            // 自定义数据库表字段类型转换【可选】
                            @Override
                            public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                                return super.processTypeConvert(globalConfig, fieldType);
                            }
                        })
                        .setDbQuery(new MySqlQuery() {
                            @Override
                            public String[] fieldCustom() {
                                return new String[]{"NULL" , "PRIVILEGES"};
                            }
                        })
                        .setDriverName("com.mysql.cj.jdbc.Driver" )
                        .setUsername(userName)
                        .setPassword(password)
                        .setUrl(jdbcUrl)
        ).setStrategy(
                // 策略配置
                new StrategyConfig()
                        // .setCapitalMode(true)// 全局大写命名
                        // .setDbColumnUnderline(true)//全局下划线命名
                        //.setTablePrefix(new String[]{"bmd_", "mp_"})// 此处可以修改为您的表前缀
                        .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
                        .setInclude(include) // 需要生成的表
                        .setExclude(exclude) // 排除生成的表
                        // 自定义实体父类
                        .setSuperEntityClass("com.fyqz.base.BaseModel" )
                        // 自定义实体，公共字段
                        .setSuperEntityColumns(new String[]{"id"})
                        .setEntityBooleanColumnRemoveIsPrefix(true)
                        // 自定义 mapper 父类
                         .setSuperMapperClass("com.fyqz.base.BaseMapper")
                        // 自定义 service 父类
                        // .setSuperServiceClass("com.baomidou.demo.TestService")
                        // 自定义 service 实现类父类
                        // .setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl")
                        // 自定义 controller 父类
                         .setSuperControllerClass("com.fyqz.base.BaseController")
                        // 【实体】是否生成字段常量（默认 false）
                        // public static final String ID = "test_id";
                        .setEntityColumnConstant(true)
                        // 【实体】是否为构建者模型（默认 false）
                        // public User setName(String name) {this.name = name; return this;}
                        // .setEntityBuilderModel(true)
                        // 【实体】是否为lombok模型（默认 false）<a href="https://projectlombok.org/">document</a>
                        .setEntityLombokModel(true)
                        // Boolean类型字段是否移除is前缀处理
                        // .setEntityBooleanColumnRemoveIsPrefix(true)
                        .setRestControllerStyle(true)
                        // .setControllerMappingHyphenStyle(true)
        ).setPackageInfo(
                // 包配置
                new PackageConfig()
                        .setParent(parentPackage)// 自定义包路径
                        .setController("controller" )// 这里是控制器包名，默认 web
        ).setCfg(
                // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
                new InjectionConfig() {
                    @Override
                    public void initMap() {

                    }
                }.setFileOutConfigList(Collections.singletonList(new FileOutConfig(
                        "/templates/mapper.xml" + ".vm" ) {
                    // 自定义输出文件目录
                    @Override
                    public String outputFile(TableInfo tableInfo) {
                        return "E:/zc_cloud/game-module/game-service/src/main/resources/mapper/scenario/" + tableInfo.getEntityName() + ".xml";

                    }
                }))
        ).setTemplate(
                // 关闭默认 xml 生成，调整生成 至 根目录
                initTemplate(modelMame)
        );
        // 执行生成
        if (1 == result) {
            mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        }
        mpg.execute();
    }

    public static TemplateConfig initTemplate(String modelName) {
        if (modelName.indexOf("api" ) > 0) {
            return new TemplateConfig().setXml("")
                    // 自定义模板配置，模板可以参考源码 /mybatis-plus/src/main/resources/template 使用 copy
                    // 至您项目 src/main/resources/template 目录下，模板名称也可自定义如下配置：
                    .setController("..." )
                    .setEntity("" )
                    .setController("" )
                    .setMapper("" )
                    .setXml("" )
                    // .setService("" )
                    .setServiceImpl("" );
        } else if (modelName.indexOf("common" ) > 0) {
            return new TemplateConfig().setXml("")
                    // 自定义模板配置，模板可以参考源码 /mybatis-plus/src/main/resources/template 使用 copy
                    // 至您项目 src/main/resources/template 目录下，模板名称也可自定义如下配置：
                    .setController("" )
                    .setEntity("tpl/entity.java.vm" )
                    .setController("" )
                    .setMapper("" )
                    .setXml("" )
                    .setService("" )
                    .setServiceImpl("" );

        } else {
            return new TemplateConfig().setXml(null)
                    // 自定义模板配置，模板可以参考源码 /mybatis-plus/src/main/resources/template 使用 copy
                    // 至您项目 src/main/resources/template 目录下，模板名称也可自定义如下配置：
                    .setEntity("" )
                    //.setController("" )
                    .setMapper("tpl/mapper.java.vm" )
                    //.setXml("" )
                    .setService("" )
                    .setServiceImpl("tpl/serviceImpl.java.vm" );
        }
    }
}
