package com.fyqz.generator;

import com.fyqz.util.GeneratorUtil;

/**
 * @Title: GameGenerator
 * @ProjectName: game-module
 * @Description: TODO
 * @author: zengchao
 * @date: 2020/5/3 11:39
 */
public class GameGenerator {
    static String [] models = {"game-common","game-api","game-service"};
    static String author = "zengchao";
    static String userName = "root";
    static String password = "root";
    static String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/runto?serverTimezone=UTC&useUnicode=true&allowPublicKeyRetrieval=true&useSSL=false&characterEncoding=utf8";
    /**
     * 排除的表
     */
    static String[] exclude = null;
    /**
     * 生成的表
     */
    static String[] include = {"scenario_map","scenario"};
    /**
     * 包的目录
     */
    static String parentPackage = "com.fyqz.scenario";
    public static void main(String[] args) {
        GeneratorUtil.generator(models[0], author, userName, password, jdbcUrl, exclude, include, parentPackage);
        GeneratorUtil.generator(models[1], author, userName, password, jdbcUrl, exclude, include, parentPackage);
        GeneratorUtil.generator(models[2], author, userName, password, jdbcUrl, exclude, include, parentPackage);

    }
}
