package edu.neu.cs3200.controllers;

import edu.neu.cs3200.MySQLConnector;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Utils {

    MySQLConnector connector = new MySQLConnector();

    @RequestMapping("/api/outcome/select/all")
    public List<String> getOutcomeTypes() throws SQLException {
        Connection conn = connector.getConnection();

        Statement stmt;
        stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM outcome_type");

        List<String> outcomes = new ArrayList<String>();
        while(res.next()){
            String outcome = res.getString("type");
            outcomes.add(outcome);
        }
        return outcomes;
    }

    @RequestMapping("/api/outcome/subtypes/select/all")
    public List<String> getOutcomeSubtypes() throws SQLException {
        Connection conn = connector.getConnection();

        Statement stmt;
        stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM outcome_subtype");

        List<String> outcomes = new ArrayList<String>();
        while(res.next()){
            String outcome = res.getString("subtype");
            outcomes.add(outcome);
        }
        return outcomes;
    }
}
