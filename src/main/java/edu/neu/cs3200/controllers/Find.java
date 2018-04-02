package edu.neu.cs3200.controllers;
import edu.neu.cs3200.MySQLConnector;
import edu.neu.cs3200.objects.Animal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Find {

    MySQLConnector connector = new MySQLConnector();

    @RequestMapping("/api/find/animal/id/{animal_id}")
    public List<Animal> findAnimalById(@PathVariable("animal_id") String animalId) throws SQLException {
        Connection conn = connector.getConnection();

        String query = "SELECT * FROM animal WHERE animal_id = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, animalId);
        ResultSet res = stmt.executeQuery();

        List<Animal> animals = new ArrayList<>();

        while(res.next()) {
            Animal animal = new Animal();

            animal.setAnimalId(res.getString("animal_id"));
            animal.setAge(res.getString("age"));
            animal.setAnimalName(res.getString("name"));
            animal.setDateDischarged(res.getString("date_discharged"));
            animal.setOutcomeType(res.getString("outcome_type"));
            animal.setOutcomeSubtype(res.getString("outcome_subtype"));
            animal.setAnimalType(res.getString("animal_type"));
            animal.setSex(res.getString("sex"));
            animal.setColor(res.getString("color"));

            animals.add(animal);
        }
        return animals;
    }

    @RequestMapping("/api/find/animal/breed/{breed}")
    public List<Animal> findAnimalByBreed(@PathVariable("breed") String breed) throws SQLException {
        Connection conn = connector.getConnection();

        String query = "SELECT * FROM animal WHERE animal_type = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, breed);
        ResultSet res = stmt.executeQuery();

        List<Animal> animals = new ArrayList<>();

        while(res.next()) {
            Animal animal = new Animal();

            animal.setAnimalId(res.getString("animal_id"));
            animal.setAge(res.getString("age"));
            animal.setAnimalName(res.getString("name"));
            animal.setDateDischarged(res.getString("date_discharged"));
            animal.setOutcomeType(res.getString("outcome_type"));
            animal.setOutcomeSubtype(res.getString("outcome_subtype"));
            animal.setAnimalType(res.getString("animal_type"));
            animal.setSex(res.getString("sex"));
            animal.setColor(res.getString("color"));

            animals.add(animal);
        }
        return animals;
    }

    // Animal type is either cat or dog
    @RequestMapping("/api/find/animal/species/{species}")
    public List<Animal> findAnimalsBySpecies(@PathVariable("species") String species) throws SQLException {
        Connection conn = connector.getConnection();

        CallableStatement cStmt = conn.prepareCall("{call animal_by_species(?)}");
        cStmt.setString(1, species);
        ResultSet res = cStmt.executeQuery();

        List<Animal> animals = new ArrayList<>();

        while(res.next()) {
            Animal animal = new Animal();

            animal.setAnimalId(res.getString("animal_id"));
            animal.setAge(res.getString("age"));
            animal.setAnimalName(res.getString("name"));
            animal.setDateDischarged(res.getString("date_discharged"));
            animal.setOutcomeType(res.getString("outcome_type"));
            animal.setOutcomeSubtype(res.getString("outcome_subtype"));
            animal.setAnimalType(res.getString("animal_type"));
            animal.setSex(res.getString("sex"));
            animal.setColor(res.getString("color"));

            animals.add(animal);
        }
        return animals;
    }
}
