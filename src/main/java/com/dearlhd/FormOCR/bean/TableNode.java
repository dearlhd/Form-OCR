package com.dearlhd.FormOCR.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dearlhd on 2018/4/25.
 */
public class TableNode {
    int id;
    String value;
    boolean isProperty;
    public List<Integer> top;
    public List<Integer> bottom;
    public List<Integer> left;
    public List<Integer> right;

    public TableNode () {}

    public TableNode (int id, String value) {
        this.id = id;
        this.value = value;
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

    public boolean isProperty() {
        return isProperty;
    }

    public void setProperty(boolean property) {
        isProperty = property;
    }

    public List<Integer> getTop() {
        return top;
    }

    public void setTop(List<Integer> top) {
        this.top = top;
    }

    public List<Integer> getBottom() {
        return bottom;
    }

    public void setBottom(List<Integer> bottom) {
        this.bottom = bottom;
    }

    public List<Integer> getLeft() {
        return left;
    }

    public void setLeft(List<Integer> left) {
        this.left = left;
    }

    public List<Integer> getRight() {
        return right;
    }

    public void setRight(List<Integer> right) {
        this.right = right;
    }
}
