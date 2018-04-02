package edu.neu.cs3200.controllers;

import edu.neu.cs3200.MySQLConnector;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
public class Delete {

    MySQLConnector connector = new MySQLConnector();

    @RequestMapping("api/delete/animal/id/{animal_id}")
    public void deleteAnimalById(@PathVariable("animal_id") String animalId) throws SQLException {
        Connection conn = connector.getConnection();

        CallableStatement cStmt = conn.prepareCall("{call delete_animal_by_id(?)}");
        cStmt.setString(1, animalId);
        cStmt.executeQuery();
    }
}
