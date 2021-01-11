package com;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class TestParams {
  public void test(String name,String age){}

  public static void main(String[] args) throws Exception{
    Method method = TestParams.class.getMethod("test", String.class, String.class);
    for (Parameter parameter : method.getParameters()) {
      System.out.println(parameter.getName());
    }
  }
}
