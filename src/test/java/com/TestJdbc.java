package com;

import java.sql.*;

public class TestJdbc {
  static {
    try {
      Class.forName(Driver.class.getName());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws Exception {
    Connection connection = DriverManager.getConnection("jdbc:mysql://47.98.174.139:3306/guns?autoReconnect=true&useUnicode=true" +
      "&characterEncoding=utf8&zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false&serverTimezone=CTT","caizhigui","czg@123A");
    PreparedStatement preparedStatement = connection.prepareStatement("select  * from lm_order_jd where order_id =?");
    preparedStatement.setString(1,"46711936");
    ResultSet resultSet = preparedStatement.executeQuery();
    while (resultSet.next()){
      String columnName1 = resultSet.getMetaData().getColumnName(1);
      String columnName2 = resultSet.getMetaData().getColumnName(2);
      String columnName3 = resultSet.getMetaData().getColumnName(3);
      String columnName4 = resultSet.getMetaData().getColumnName(4);
      System.out.println(columnName1+": "+resultSet.getString(1));
      System.out.println(columnName2+": "+resultSet.getString(2));
      System.out.println(columnName3+": "+resultSet.getString(3));
      System.out.println(columnName4+": "+resultSet.getString(4));
    }
    resultSet.close();
    preparedStatement.close();
    connection.close();

  }
}
