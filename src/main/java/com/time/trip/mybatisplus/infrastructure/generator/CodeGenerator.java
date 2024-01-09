package com.time.trip.mybatisplus.infrastructure.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;

public class CodeGenerator {

    public static void main(String[] args) {
        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);
        generator.global(globalConfig().build());
        generator.strategy(strategyConfig().build());
        generator.execute();
    }

    /**
     * 数据源配置
     */
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://localhost:3306/mybatis_plus", "root", "Nriet@123")
            .build();

    /**
     * 全局配置
     */
    protected static GlobalConfig.Builder globalConfig() {
        return new GlobalConfig.Builder()
                // 禁止打开输出目录，一般不需要打开
                .disableOpenDir()
                // 指定输出目录，通过 `System.getProperty("user.dir")` 获取当前工程绝对路径，然后再指定到 Source 目录即可。具体的包路径由包配置定义
                .outputDir(System.getProperty("user.dir") + "/src/main/java")
                // 作者名，一般使用公司简称
                .author("trip")
                // 开启 kotlin 模式
//                .enableKotlin()
                // 开启 swagger 模式，entity一般无需 swagger 注释
//                .enableSwagger()
                // 时间策略(ONLY_DATE: 只使用 java.util.date 代替, SQL_PACK: 使用 java.sql 包下的, TIME_PACK: 使用 java.time 包下的)
                // 默认 TIME_PACK，一般使用 ONLY_DATE(java8 新的时间类型，LocalDateTime 等类型)
                .dateType(DateType.ONLY_DATE)
                // 注释日期
                .commentDate("yyyy-MM-dd")
                ;
    }

    /**
     * 包配置
     */
    protected static PackageConfig.Builder packageConfig() {
        return new PackageConfig.Builder()
                
                ;
    }

    /**
     * 模板配置
     */
    protected static TemplateConfig.Builder templateConfig() {
        return new TemplateConfig.Builder();
    }

    /**
     * 注入配置
     */
    protected static InjectionConfig.Builder injectionConfig() {
        // 测试自定义输出文件之前注入操作，该操作再执行生成代码前 debug 查看
        return new InjectionConfig.Builder().beforeOutputFile((tableInfo, objectMap) -> {
            System.out.println("tableInfo: " + tableInfo.getEntityName() + " objectMap: " + objectMap.size());
        });
    }

    /**
     * 策略配置
     */
    protected static StrategyConfig.Builder strategyConfig() {
        return new StrategyConfig.Builder();
    }

}
