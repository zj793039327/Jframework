package com.neo.test.mybatis.local;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neo.test.mybatis.domain.blog.Author;

/**
 * 
 * TestLocalSqlSessionFactory
 * @author zjhome
 * @time 2015-3-4下午11:04:23
 */
public class TestLocalSqlSessionFactory {
    public static void main(String[] args) throws IOException {
        String resource = "com/neo/test/mybatis/local/mybatis-cfg-test.xml";
        //System.out.println(FileUtils.readFileToString(new File(resource)));;
        InputStream input = Resources.getResourceAsStream(resource);
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(input);
        
        
        SqlSession session = ssf.openSession();
        AuthorMapper am = session.getMapper(AuthorMapper.class);
        
        Author a = am.findById("1");
        System.out.println(a);
    }
}
