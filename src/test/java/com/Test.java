package com;

import com.mapper.DemoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;


public class Test {

  public static void main(String[] args) throws IOException {
    String resources = "mybatis.xml";
    InputStream inputStream = Resources.getResourceAsStream(resources);
    //xml解析完成
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    //动态代理
    //拿到动态代理的mapper
    DemoMapper mapper = sqlSession.getMapper(DemoMapper.class);
    HashMap<Object, Object> map = new HashMap<>();
    map.put("id","1336586442040713218");
    map.put("id","1338373521894236162");
    System.out.println(mapper.selectAll(map));
  }
}
