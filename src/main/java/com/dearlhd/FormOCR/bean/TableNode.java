package com.dearlhd.FormOCR.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dearlhd on 2018/4/25.
 */
public class TableNode {
    int id;
    String value;
    String valueEng;
    boolean isProperty;
    public List<Integer> top;
    public List<Integer> bottom;
    public List<Integer> left;
    public List<Integer> right;

    public TableNode () {}

    public TableNode (int id, String value, String valueEng) {
        this.id = id;
        this.value = value;
        this.valueEng = valueEng;
        this.top = new ArrayList<>();
        this.bottom = new ArrayList<>();
        this.left = new ArrayList<>();
        this.right = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueEng() {
        return valueEng;
    }

    public void setValueEng(String valueEng) {
        this.valueEng = valueEng;
    }

    public boolean isProperty() {
        return isProperty;
    }

    public void setProperty(boolean property) {
        isProperty = property;
    }
}
