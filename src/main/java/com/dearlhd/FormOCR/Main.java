package com.dearlhd.FormOCR;

import com.dearlhd.FormOCR.KBUtil.KnowledgeBaseHelper;
import com.dearlhd.FormOCR.TableAnalyseUtil.TableDataInitializer;
import com.dearlhd.FormOCR.bean.TableNode;

import java.util.List;

/**
 * Created by dearlhd on 2018/4/18.
 */
public class Main {

    public static void main (String args[]) {
        KnowledgeBaseHelper helper = new KnowledgeBaseHelper();
        helper.queryConcept("name");
//        TableDataInitializer initializer = new TableDataInitializer();
//        List<TableNode> nodes = initializer.getNodes();
//        for (TableNode node : nodes) {
//            if (node.getValueEng().length() < 15) {
//                System.out.println(node.getValue() + "( " + node.getValueEng() + " ): ");
//                helper.queryConcept(node.getValueEng());
//
//
//                System.out.println("\n");
//            }
//        }
    }
}
