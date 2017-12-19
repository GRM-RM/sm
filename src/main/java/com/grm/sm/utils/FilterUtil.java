package com.grm.sm.utils;

/**
 *
 * @author grm
 *
 * 对学生类字段信息的过滤
 */
public class FilterUtil {

    /**
     *
     * 对查询信息的过滤
     * @param source 待过滤的信息源
     * @return       过滤之后的信息
     */
    public static String filterQueryString(String source){
        source=source.trim();
        source=source.replaceAll("<", "&lt");
        source=source.replaceAll(">", "&gt");
        source=source.replaceAll("'", "''");
        return source;
    }

    /**
     *
     * 对添加信息的过滤
     * @param source 待过滤的信息源
     * @return       过滤之后的信息
     */
    public static String filterAddString(String source){
        source=source.trim();
        source=source.replaceAll("<", "&lt");
        source=source.replaceAll(">", "&gt");
        source=source.replaceAll("\"","'");
        return source;
    }
}
