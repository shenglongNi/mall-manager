package com.mall;

import com.google.common.collect.Lists;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

public class Generator {
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> warnings = Lists.newArrayList();
        InputStream in = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        Configuration cf = configurationParser.parseConfiguration(in);

        in.close();

        DefaultShellCallback shellCallback = new DefaultShellCallback(true);

        MyBatisGenerator generator = new MyBatisGenerator(cf, shellCallback, warnings);

        generator.generate(null);

        for(String waring : warnings) {
            System.out.println(waring);
        }

    }
}
