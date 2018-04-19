package com.dearlhd.FormOCR.bean;

/**
 * Created by dearlhd on 2018/4/18.
 */
public class QueryResult {
    private String subject;
    private String predict;
    private String object;

    public QueryResult() {}

    public QueryResult(String sub, String pre, String obj) {
        subject = sub;
        predict = pre;
        object = obj;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPredict() {
        return predict;
    }

    public void setPredict(String predict) {
        this.predict = predict;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
}
