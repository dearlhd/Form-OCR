package com.dearlhd.FormOCR;

import com.dearlhd.FormOCR.KBUtil.KnowledgeBaseHelper;

/**
 * Created by dearlhd on 2018/4/18.
 */
public class Main {

    public static void main (String args[]) {
        KnowledgeBaseHelper helper = new KnowledgeBaseHelper();
        helper.queryConcept("name");
    }
}
