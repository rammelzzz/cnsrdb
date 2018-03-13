package org.test;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

/**
 * Created by rammel on 2018/1/6.
 */
public class Test {

    private Logger logger = Logger.getLogger(getClass());

    @org.junit.Test
    public void test() {
        String JDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://127.0.0.1:1433;database=cnsrdb";
        try {
            Class.forName(JDriver);
        }catch (Exception e) {
            logger.info("加载数据库引擎失败！");
            e.printStackTrace();
        }

        logger.info("加载驱动成功！");

        try {
            String sa = "sa";
            Connection connection = DriverManager.getConnection(url, sa, sa);
            logger.info("连接成功！");
            String query = "select * from bm.[teacher]";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                System.out.println(rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("出错！");
        }
    }

    @org.junit.Test
    public void testOOM() {
//        List<OOMObject> list = new ArrayList<OOMObject>();
//        while(true) {
//            list.add(new OOMObject());
//        }
        List<String> names = Arrays.asList("Tom", "Peter", "Mike");

        Collections.sort(names, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        Collections.sort(names, (String a, String b) ->  b.compareTo(a));

        Collections.sort(names, (a, b) -> b.compareTo(a));
    }
}
