package tn.esprit.spring.services;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import tn.esprit.spring.kaddem.entities.*;
import tn.esprit.spring.kaddem.repositories.*;
import tn.esprit.spring.kaddem.services.*;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class DepartementServiceImplTest {
    @Mock
    private EtudiantRepository etudiantRepository;

    @Mock
    private ContratRepository contratRepository;

    @Mock
    private EquipeRepository equipeRepository;

    @Mock
    private DepartementRepository departementRepository;

    @InjectMocks
    private EtudiantServiceImpl etudiantService;

    @Before
    public void setUp() {
    }

    @Test
    public void testRetrieveAllDepartement() {
          List<Departement> departements = new ArrayList<>();
           when(departementRepository.findAll()).thenReturn(departements);
                List<Departement> result = Service.retrieveAllDepartements();
        verify(departementRepository, times(1)).findAll();
        assertEquals(departements, result);
    }

}
