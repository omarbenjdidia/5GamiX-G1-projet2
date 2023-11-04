package tn.esprit.spring.services;
import tn.esprit.spring.entities.Etudiant;
import tn.esprit.spring.entities.Option;
import tn.esprit.spring.repository.EtudiantRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
class EtudiantServiceImplMock {

    @Mock
    EtudiantRepository etudiantRepository;

    @InjectMocks
    EtudiantServiceImpl etudiantService;

    Etudiant etudiant = new Etudiant("f1", "l1", Option.GAMIX);

    List<Etudiant> listEtudiant = new ArrayList<Etudiant>() {
        {
            add(new Etudiant("f1", "l1", Option.GAMIX));
            add(new Etudiant("f1", "l1", Option.GAMIX));
        }
    };

    @Test
    public void testRetrieveEtudiant() {
        Mockito.when(etudiantRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(etudiant));
        Etudiant etudiant1 = etudiantService.retrieveEtudiant("2");
        assertNotNull(user1);
    }
}
