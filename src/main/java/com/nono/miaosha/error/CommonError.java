package com.nono.miaosha.error;

/**
 * Created by yaolei on 2019/07/14.
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);


}
