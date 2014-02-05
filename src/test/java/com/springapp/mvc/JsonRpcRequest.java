package com.springapp.mvc;

import java.util.Map;

public class JsonRpcRequest {
    final String jsonrpc = "2.0";
    String method;
    Map<String, Object> params;
    Integer id;

    public JsonRpcRequest(String method, Map<String, Object> params, Integer id) {
        this.method = method;
        this.params = params;
        this.id = id;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
