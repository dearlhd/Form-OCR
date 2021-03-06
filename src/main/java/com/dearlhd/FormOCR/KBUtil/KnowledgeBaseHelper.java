package com.dearlhd.FormOCR.KBUtil;

import com.dearlhd.FormOCR.bean.QueryResult;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dearlhd on 2018/4/18.
 */
public class KnowledgeBaseHelper {

    final public String KB_PATH = "KnowledgeBase/dbpedia_2016-10.owl";
    final public String KB_PATH_ONLINE = "http://dbpedia.org/sparql";
    private Model model = null;

    public KnowledgeBaseHelper () {
        model = ModelFactory.createMemModelMaker().createDefaultModel();
        model.read(KB_PATH_ONLINE);
    }

    public List<QueryResult> queryConcept (String concept) {
        List<QueryResult> queryResults = new ArrayList<>();
        String queryString = "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\n" +
                "SELECT ?s ?p ?o\n" +
                "WHERE {\n" +
                "    ?s ?p ?o .\n" +
                "    FILTER (regex (?o, \"" + concept + "\", \"i\") &&\n" +
                "           langMatches(lang(?o), \"EN\")).\n" +
                "} limit 10";

        String testQuery =
                "PREFIX dbo: <http://dbpedia.org/ontology/>\n" +
                "PREFIX dbp: <http://dbpedia.org/property/>\n" +
                "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                "SELECT  ?country_name\n" +
                "WHERE {\n" +
                "?country a dbo:Country.\n" +
                "?country rdfs:label ?country_name.\n" +
                "FILTER langMatches( lang(?country_name), \"en\"  ).}\n" +
                "GROUP BY ?country_name\n" +
                "LIMIT 10";

        String testQuery2 = "select * where { ?s ?p ?o .} LIMIT 100";

        Query query = QueryFactory.create(testQuery);
        QueryExecution qe = QueryExecutionFactory.create(query, model);
        ResultSet results = qe.execSelect();

        if (results.hasNext()) {
            System.out.println("有结果");
        }

        int i = 0;
        while (results.hasNext()) {
            System.out.print(++i + ": ");
            QuerySolution qs = results.next();
            String sub = qs.get("s").toString();
            String pre = qs.get("p").toString();
            String obj = qs.get("o").toString();
            QueryResult qr = new QueryResult(sub, pre, obj);
            queryResults.add(qr);
            System.out.println(sub + "\t" + pre + "\t" + obj);
            if (results.hasNext()) {
                results.next();
            }
        }

//        ResultSetFormatter.out(System.out, results, query);
        qe.close();
        return queryResults;
    }
}
