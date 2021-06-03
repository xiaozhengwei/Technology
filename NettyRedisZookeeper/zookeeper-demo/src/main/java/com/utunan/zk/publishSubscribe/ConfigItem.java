package com.utunan.zk.publishSubscribe;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;


@Slf4j
@Data
public class ConfigItem implements Serializable {

    private String type;
    private JSONObject data;

    public String getValue(String key) {
        Object v = data.get(key);
        return v.toString();
    }
}
