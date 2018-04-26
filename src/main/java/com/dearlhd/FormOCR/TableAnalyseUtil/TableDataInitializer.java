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
        TableNode node = new TableNode(i++, "姓名", "name");
        node.right.add(1);
        node.bottom.add(4);
        nodes.add(node);

        node = new TableNode(i++, "朱富陶", "Zhu Futao");
        node.left.add(0);
        node.right.add(2);
        node.bottom.add(5);
        nodes.add(node);

        node = new TableNode(i++, "性别", "gender");
        node.left.add(1);
        node.right.add(3);
        node.bottom.add(6);
        nodes.add(node);

        node = new TableNode(i++, "男", "male");
        node.left.add(2);
        node.bottom.add(7);
        nodes.add(node);

        node = new TableNode(i++, "毕业院校", "graduated school");
        node.right.add(5);
        node.bottom.add(8);
        nodes.add(node);

        node = new TableNode(i++, "中南大学", "Central South University");
        node.top.add(1);
        node.left.add(4);
        node.right.add(6);
        node.bottom.add(9);
        nodes.add(node);

        node = new TableNode(i++, "出生日期", "date of birth");
        node.top.add(2);
        node.left.add(5);
        node.right.add(7);
        node.bottom.add(10);
        nodes.add(node);

        node = new TableNode(i++, "1987年1月15日", "January 15, 1987");
        node.top.add(3);
        node.left.add(6);
        node.bottom.add(11);
        nodes.add(node);

        node = new TableNode(i++, "学历", "Education");
        node.top.add(4);
        node.right.add(9);
        node.bottom.add(12);
        nodes.add(node);

        node = new TableNode(i++, "本科", "Undergraduate");
        node.top.add(5);
        node.left.add(8);
        node.right.add(10);
        node.bottom.add(13);
        nodes.add(node);

        node = new TableNode(i++, "电话", "phone");
        node.top.add(6);
        node.left.add(9);
        node.right.add(11);
        node.bottom.add(14);
        nodes.add(node);

        node = new TableNode(i++, "13555555555", "13555555555");
        node.top.add(7);
        node.left.add(10);
        node.bottom.add(15);
        nodes.add(node);

        node = new TableNode(i++, "籍贯", "Origin");
        node.top.add(8);
        node.right.add(13);
        node.bottom.add(16);
        nodes.add(node);

        node = new TableNode(i++, "湖南娄底市", "Loudi City, Hunan");
        node.top.add(9);
        node.left.add(12);
        node.right.add(14);
        node.bottom.add(17);
        nodes.add(node);

        node = new TableNode(i++, "邮箱", "E-mail");
        node.top.add(19);
        node.left.add(13);
        node.right.add(15);
        node.bottom.add(17);
        nodes.add(node);

        node = new TableNode(i++, "zft15@163.com", "zft15@163.com");
        node.top.add(11);
        node.left.add(14);
        node.bottom.add(17);
        nodes.add(node);

        node = new TableNode(i++, "求职意向", "Career Objective");
        node.top.add(12);
        node.right.add(17);
        node.bottom.add(18);
        nodes.add(node);

        node = new TableNode(i++, "JAVA开发工程师", "JAVA development engineer");
        node.top.add(13); node.top.add(14); node.top.add(15);
        node.left.add(16);
        node.bottom.add(18);
        nodes.add(node);

        node = new TableNode(i++, "技能", "skill");
        node.top.add(16); node.top.add(17);
        node.bottom.add(19); node.bottom.add(20);
        nodes.add(node);

        node = new TableNode(i++, "英语", "English");
        node.top.add(18);
        node.right.add(20);
        node.bottom.add(21);
        nodes.add(node);

        node = new TableNode(i++, "CET-6，具备一定的英文读写能力，能熟练阅读英文技术文档", "CET-6, with a certain level of English literacy, able to read English technical documents");
        node.top.add(18);
        node.left.add(19);
        node.bottom.add(22);
        nodes.add(node);

        node = new TableNode(i++, "JAVA", "JAVA");
        node.top.add(19);
        node.right.add(22);
        node.bottom.add(23);
        nodes.add(node);

        node = new TableNode(i++, "熟练掌握JDBC、Socket,熟悉Swing,对面向对象编程有较为深刻的理解。精通Struts,熟悉Spring、Hibernate等主流开发框架。", "Proficient in JDBC, Socket, familiar with Swing, has a deeper understanding of object-oriented programming. Proficient in Struts, familiar with Spring, Hibernate and other mainstream development framework.");
        node.top.add(20);
        node.left.add(21);
        node.bottom.add(24);
        nodes.add(node);

        node = new TableNode(i++, "网页相关", "Web related");
        node.top.add(21);
        node.right.add(24);
        node.bottom.add(25);
        nodes.add(node);

        node = new TableNode(i++, "熟悉HTML、JavaScript、CSS,能够熟练使用Ajax进行编程。", "Familiar with HTML, JavaScript, CSS, and skillfully use Ajax for programming.");
        node.top.add(22);
        node.left.add(23);
        node.bottom.add(26);
        nodes.add(node);

        node = new TableNode(i++, "数据库", "database");
        node.top.add(23);
        node.right.add(26);
        node.bottom.add(27);
        nodes.add(node);

        node = new TableNode(i++, "熟悉SQL,能够熟练使用Oracle 9i、MySql 5.0数据库。", "Familiar with SQL, able to use Oracle 9i, MySql 5.0 database.");
        node.top.add(24);
        node.left.add(25);
        node.bottom.add(27);
        nodes.add(node);

        node = new TableNode(i++, "工作经验", "work experience");
        node.top.add(25); node.top.add(26);
        node.bottom.add(28);
        nodes.add(node);

        node = new TableNode(i++, "2009年7月，实习于上海杰普软件科技有限公司。\n2009年8月至今，实习于湖南凯哥信息技术有限公司。", "July 2009, internship at Shanghai Jiepu Software Technology Co., Ltd.\nAugust 2009 till now, internship in Hunan Kege Information Technology Co., Ltd.");
        node.top.add(27);
        node.bottom.add(29);
        nodes.add(node);

        node = new TableNode(i++, "项目经验", "project experience");
        node.top.add(28);
        node.bottom.add(30);
        nodes.add(node);

        node = new TableNode(i++, "项目名称：Fusion fxHL7时间： 2009年8月至今（项目正在进行中）Fusion fxHL7是一个医疗信息整合引笮，可以实现医疗信息系统之间消息的路由、过滤、转换，通过该引擎可以实现将分散系统的信息，按照“以病人为中心”的原则重新组织。该引擎支持HL7 v2.x、HL7 v3. 0、XML、EDI、X12、TEXT等数据格式，以及TCP,DIC0M等传输协议和File读写、数据库读写方式。项目名称：电信采集系统时间： 2009年7月Woss (Wide-Brand Operation Support System,宽带运营支撑系统），本系统是Woss项目中的一个子模块。该系统主要定期采集服务器上的原始计费文件，整理成数据清单，并上传给中心处理系统，中心处理系统接收数据信息，并将数据保存到Oracle数据库。项目名称：视频网站时间： 2008年9月该项目是我在软件教育学习时所完成的项目。本项目是采用MVC架构构建，采用基本的JavaScript + Servlet + Jsp + JavaBean + Struts + Hibernate + Spring+ Ajax 实现，使用Oracle数据库来管理数据，并使用了JSP动态网页开发技术和Struts框架。实现一个类似于土豆网的视频网站。", "Project Name: Fusion fxHL7 Time: August 2009 to date (project in progress) Fusion fxHL7 is a medical information integration guide, which can realize the routing, filtering and conversion of messages between medical information systems. Through this engine, it can be dispersed. The system information is reorganized according to the principle of \"patient-centered\". The engine supports HL7 v2.x, HL7 v3. 0, XML, EDI, X12, TEXT and other data formats, and TCP, DIC0M and other transmission protocols and File read and write, database read and write methods. Project Name: Telecommunication Acquisition System Time: July 2009 Woss (Wide-Brand Operation Support System, Broadband Operational Support System). This system is a sub-module of the Woss project. The system periodically collects the original billing files on the server, collates them into a data list, and uploads them to the central processing system. The central processing system receives the data information and saves the data to the Oracle database. Project Name: Video Website Time: September 2008 This project was completed during my software education study. This project is built using the MVC architecture, using the basic JavaScript + Servlet + Jsp + JavaBean + Struts + Hibernate + Spring + Ajax implementation, using an Oracle database to manage data, and using JSP dynamic web development technology and Struts framework. Implement a video website similar to Tudou.");
        node.top.add(29);
        node.bottom.add(31);
        nodes.add(node);

        node = new TableNode(i++, "教育背景", "Education background");
        node.top.add(30);
        node.bottom.add(32);
        nodes.add(node);

        node = new TableNode(i++, "2006年9月至2010年6月，就读于中南大学计算机科学与技术专业。2008年4月至2008年12月，参加***软件教育的JAVA培训。", "From September 2006 to June 2010, he studied computer science and technology at Central South University. From April 2008 to December 2008, participated in JAVA software education JAVA training.");
        node.top.add(31);
        nodes.add(node);
    }

}
