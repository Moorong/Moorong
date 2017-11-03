package com.unioncast.common.rest.response.ssp;

import com.unioncast.common.ssp.model.SspAppInfo;

import java.io.Serializable;

/**
 * @auther wangyao
 * @date 2017-04-01 9:32
 */

public class SspAppInfoArrResponse implements Serializable {
    private static final long serialVersionUID = -2131651781440668815L;
    public SspAppInfo[] result;

    public SspAppInfo[] getResult() {
        return result;
    }

    public void setResult(SspAppInfo[] result) {
        this.result = result;
    }
}
