package com.mapper;

import org.apache.ibatis.type.Alias;

import java.util.List;
import java.util.Map;

@Alias("DemoMapper")//不区分大小写
public interface DemoMapper {
  List<Map<String, Object>>selectAll(Map map);
  List<Map<String, Object>>selectByNameAndID(String id,String name);
}
