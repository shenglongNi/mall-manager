package com.mall;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.util.Properties;

public class CommonGenerator extends DefaultCommentGenerator{
    /**
     * 设置用户配置的参数
     * @param properties
     */
    @Override
    public void addConfigurationProperties(Properties properties) {
        super.addConfigurationProperties(properties);
    }

    /**
     * 给字段添加注释
     * @param field
     * @param introspectedTable
     * @param introspectedColumn
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        String remarks = introspectedColumn.getRemarks();
        if(StringUtils.isNotBlank(remarks)) {
            field.addJavaDocLine("/**");
            String[] remarksLines = remarks.split(System.getProperty("line.separator"));
            for (String remark : remarksLines) {
                field.addJavaDocLine("*" + remark);
            }
            addJavadocTag(field, false);
            field.addJavaDocLine("*/");
        }
    }
}
