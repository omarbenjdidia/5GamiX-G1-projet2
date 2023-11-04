package tn.esprit.spring.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import tn.esprit.spring.entities.Etudiant;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class EtudiantServiceImpl {

    @Autowired
    IEtudiantService E;

    @Test
    @Order(1)
    public void testretrieveAllEtudiants() {
        List<Etudiant> listEtudiant = E.retrieveAllEtudiants();
        Assertions.assertEquals(0, listEtudiant.size());
    }
}
