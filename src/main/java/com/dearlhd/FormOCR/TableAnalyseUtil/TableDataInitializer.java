package com.dearlhd.FormOCR.TableAnalyseUtil;

import com.dearlhd.FormOCR.bean.TableNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dearlhd on 2018/4/25.
 */
public class TableDataInitializer {
    List<TableNode> nodes;

    public TableDataInitializer() {
        nodes = new ArrayList<>();
        initNodes();
    }

    public List<TableNode> getNodes () {
        return nodes;
    }

    public void printNodes () {
        for (TableNode node : nodes) {
            System.out.println(node.getId() + " " + node.getValue());
        }
    }

    private void initNodes () {
        int i = 0;
        TableNode node = new TableNode(i++, "姓名");
        node.right.add(1);
        node.bottom.add(4);
        nodes.add(node);

        node = new TableNode(i++, "朱富陶");
        node.left.add(0);
        node.right.add(2);
        node.bottom.add(5);
        nodes.add(node);

        node = new TableNode(i++, "性别");
        node.left.add(1);
        node.right.add(3);
        node.bottom.add(6);
        nodes.add(node);

        node = new TableNode(i++, "男");
        node.left.add(2);
        node.bottom.add(7);
        nodes.add(node);

        node = new TableNode(i++, "毕业院校");
        node.right.add(5);
        node.bottom.add(8);
        nodes.add(node);

        node = new TableNode(i++, "中南大学");
        node.top.add(1);
        node.left.add(4);
        node.right.add(6);
        node.bottom.add(9);
        nodes.add(node);

        node = new TableNode(i++, "出生日期");
        node.top.add(2);
        node.left.add(5);
        node.right.add(7);
        node.bottom.add(10);
        nodes.add(node);

        node = new TableNode(i++, "1987年1月15日");
        node.top.add(3);
        node.left.add(6);
        node.bottom.add(11);
        nodes.add(node);

        node = new TableNode(i++, "学历");
        node.top.add(4);
        node.right.add(9);
        node.bottom.add(12);
        nodes.add(node);

        node = new TableNode(i++, "本科");
        node.top.add(5);
        node.left.add(8);
        node.right.add(10);
        node.bottom.add(13);
        nodes.add(node);

        node = new TableNode(i++, "电话");
        node.top.add(6);
        node.left.add(9);
        node.right.add(11);
        node.bottom.add(14);
        nodes.add(node);

        node = new TableNode(i++, "13555555555");
        node.top.add(7);
        node.left.add(10);
        node.bottom.add(15);
        nodes.add(node);

        node = new TableNode(i++, "籍贯");
        node.top.add(8);
        node.right.add(13);
        node.bottom.add(16);
        nodes.add(node);

        node = new TableNode(i++, "湖南娄底市");
        node.top.add(9);
        node.left.add(12);
        node.right.add(14);
        node.bottom.add(17);
        nodes.add(node);

        node = new TableNode(i++, "邮箱");
        node.top.add(19);
        node.left.add(13);
        node.right.add(15);
        node.bottom.add(17);
        nodes.add(node);

        node = new TableNode(i++, "zft15@163.com");
        node.top.add(11);
        node.left.add(14);
        node.bottom.add(17);
        nodes.add(node);

        node = new TableNode(i++, "求职意向");
        node.top.add(12);
        node.right.add(17);
        node.bottom.add(18);
        nodes.add(node);

        node = new TableNode(i++, "JAVA开发工程师");
        node.top.add(13); node.top.add(14); node.top.add(15);
        node.left.add(16);
        node.bottom.add(18);
        nodes.add(node);

        node = new TableNode(i++, "技能");
        node.top.add(16); node.top.add(17);
        node.bottom.add(19); node.bottom.add(20);
        nodes.add(node);

        node = new TableNode(i++, "英语");
        node.top.add(18);
        node.right.add(20);
        node.bottom.add(21);
        nodes.add(node);

        node = new TableNode(i++, "CET-6，具备一定的英文读写能力，能熟练阅读英文技术文档");
        node.top.add(18);
        node.left.add(19);
        node.bottom.add(22);
        nodes.add(node);

        node = new TableNode(i++, "JAVA");
        node.top.add(19);
        node.right.add(22);
        node.bottom.add(23);
        nodes.add(node);

        node = new TableNode(i++, "熟练掌握JDBC、Socket,熟悉Swing,对面向对象编程有较为深刻的理解。精通Struts,熟悉Spring、Hibernate等主流开发框架。");
        node.top.add(20);
        node.left.add(21);
        node.bottom.add(24);
        nodes.add(node);

        node = new TableNode(i++, "网页相关");
        node.top.add(21);
        node.right.add(24);
        node.bottom.add(25);
        nodes.add(node);

        node = new TableNode(i++, "熟悉HTML、JavaScript、CSS,能够熟练使用Ajax进行编程。");
        node.top.add(22);
        node.left.add(23);
        node.bottom.add(26);
        nodes.add(node);

        node = new TableNode(i++, "数据库");
        node.top.add(23);
        node.right.add(26);
        node.bottom.add(27);
        nodes.add(node);

        node = new TableNode(i++, "熟悉SQL,能够熟练使用Oracle 9i、MySql 5.0数据库。");
        node.top.add(24);
        node.left.add(25);
        node.bottom.add(27);
        nodes.add(node);

        node = new TableNode(i++, "工作经验");
        node.top.add(25); node.top.add(26);
        node.bottom.add(28);
        nodes.add(node);

        node = new TableNode(i++, "2009年7月，实习于上海杰普软件科技有限公司。\n2009年8月至今，实习于湖南凯哥信息技术有限公司。");
        node.top.add(27);
        node.bottom.add(29);
        nodes.add(node);

        node = new TableNode(i++, "项目经验");
        node.top.add(28);
        node.bottom.add(30);
        nodes.add(node);

        node = new TableNode(i++, "项目名称：Fusion fxHL7时间： 2009年8月至今（项目正在进行中）Fusion fxHL7是一个医疗信息整合引笮，可以实现医疗信息系统之间消息的路由、过滤、转换，通过该引擎可以实现将分散系统的信息，按照“以病人为中心”的原则重新组织。该引擎支持HL7 v2.x、HL7 v3. 0、XML、EDI、X12、TEXT等数据格式，以及TCP,DIC0M等传输协议和File读写、数据库读写方式。项目名称：电信采集系统时间： 2009年7月Woss (Wide-Brand Operation Support System,宽带运营支撑系统），本系统是Woss项目中的一个子模块。该系统主要定期采集服务器上的原始计费文件，整理成数据清单，并上传给中心处理系统，中心处理系统接收数据信息，并将数据保存到Oracle数据库。项目名称：视频网站时间： 2008年9月该项目是我在软件教育学习时所完成的项目。本项目是采用MVC架构构建，采用基本的JavaScript + Servlet + Jsp + JavaBean + Struts + Hibernate + Spring+ Ajax 实现，使用Oracle数据库来管理数据，并使用了JSP动态网页开发技术和Struts框架。实现一个类似于土豆网的视频网站。");
        node.top.add(29);
        node.bottom.add(31);
        nodes.add(node);

        node = new TableNode(i++, "教育背景");
        node.top.add(30);
        node.bottom.add(32);
        nodes.add(node);

        node = new TableNode(i++, "2006年9月至2010年6月，就读于中南大学计算机科学与技术专业。2008年4月至2008年12月，参加***软件教育的JAVA培训。");
        node.top.add(31);
        nodes.add(node);
    }

}
