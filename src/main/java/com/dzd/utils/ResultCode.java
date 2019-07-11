package com.dzd.utils;

/**
 * 响应码，参考HTTP状态码的语义
 */
public class ResultCode{
    //执行成功
    public static final String SUCCESS="200";
    //执行失败
    public static final String FAIL="400";
    //未认证或未授权
    public static final String UNAUTHORIZED="401";
    //接口不存在
    public static final String NOT_FOUND="404";
    //服务器内部错误
    public static final String INTERNAL_SERVER_ERROR="500";

    //webService返回值，是否成功 1表示成功
    public static final int GETWEBSEFVICESUCCESS = 1;

    //webService应用编码
    public static final String STRTRUSTID = "900000125@zytzb.zg";

}
