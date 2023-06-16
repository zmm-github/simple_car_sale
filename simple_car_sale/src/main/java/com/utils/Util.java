package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 阿毛
 * @date 2021/6/1 13:06
 */
@Component
public class Util {
    private static InputStream inputStream;
    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() throws IOException {
        inputStream = Resources.getResourceAsStream("conf/mybatis-conf.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }

    //设置分页
    public static Pagination setPagination(String cp,Long totalRow) {
        //创建pagination对象
        Pagination pagination = new Pagination();
        if (cp != null) {
            pagination.setCurrPage(Integer.parseInt(cp));
        } else {
            pagination.setCurrPage(1);
        }
        //设置总页数
        pagination.setTotalPage(totalRow);
        return pagination;
    }
}
