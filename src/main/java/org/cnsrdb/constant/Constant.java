package org.cnsrdb.constant;

/**
 * Created by rammel on 2018/1/6.
 */
public class Constant {

    public static final String EMPTY = "";
    public static final Object nil = null;
    public static final String NEWS = "新闻动态";
    public static final String NOTICE = "通知通告";
    public static final String ACAD = "学术活动";

    public static boolean isDynamicType(String type) {
        return type.equals(NEWS) || type.equals(NOTICE) || type.equals(ACAD);
    }
}
