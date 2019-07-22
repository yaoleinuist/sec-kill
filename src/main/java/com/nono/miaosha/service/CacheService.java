package com.nono.miaosha.service;

/**
 * Created by yaolei on 2019/07/15.
 */
//封装本地缓存操作类
public interface CacheService {
    //存方法
    void setCommonCache(String key,Object value);

    //取方法
    Object getFromCommonCache(String key);
}
