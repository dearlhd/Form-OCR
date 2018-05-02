package com.dearlhd.FormOCR;

import com.dearlhd.FormOCR.KBUtil.KnowledgeBaseHelper;
import com.dearlhd.FormOCR.NLPUtil.Similarity.CosineSimilarity;
import com.dearlhd.FormOCR.NLPUtil.Similarity.SimHash;
import com.dearlhd.FormOCR.TableAnalyseUtil.TableDataInitializer;
import com.dearlhd.FormOCR.bean.TableNode;

import java.util.List;

/**
 * Created by dearlhd on 2018/4/18.
 */
public class Main {

    public static void main (String args[]) {
//        KnowledgeBaseHelper helper = new KnowledgeBaseHelper();
//        helper.queryConcept("name");
        
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

        String sent1 = "CET-6，具备一定的英文读写能力，能熟练阅读英文技术文档";
        String sent2 = "熟练掌握JDBC、Socket,熟悉Swing,对面向对象编程有较为深刻的理解。精通Struts,熟悉Spring、Hibernate等主流开发框架。";
        String sent3 = "熟悉HTML、JavaScript、CSS,能够熟练使用Ajax进行编程。";
        String sent4 = "熟悉SQL,能够熟练使用Oracle 9i、MySql 5.0数据库。";
        String sent5 = "这是啥情况";

        SimHash hash1 = new SimHash(sent1, 64);
        SimHash hash2 = new SimHash(sent2, 64);
        SimHash hash3 = new SimHash(sent3, 64);
        SimHash hash4 = new SimHash(sent4, 64);
        SimHash hash5 = new SimHash(sent5, 64);

        System.out.println(  hash1.getSemblance(hash3) );
        System.out.println(  hash2.getSemblance(hash3) );
        System.out.println(  hash3.getSemblance(hash4) );
        System.out.println(  hash4.getSemblance(hash5) );

        System.out.print("\n\n\n\n");

        System.out.println(CosineSimilarity.getSimilarity(sent1, sent2));
        System.out.println(CosineSimilarity.getSimilarity(sent2, sent3));
        System.out.println(CosineSimilarity.getSimilarity(sent3, sent4));
        System.out.println(CosineSimilarity.getSimilarity(sent4, sent5));
    }
}
