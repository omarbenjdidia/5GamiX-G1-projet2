package tn.esprit.spring.services; // Make sure to specify the correct package

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
public class EquipeServiceImplTest {
   /* @Mock
    private EtudiantRepository etudiantRepository;
*/
    @Mock
    private ContratRepository contratRepository;

    @Mock
    private EquipeRepository equipeRepository;

    @Mock
    private DepartementRepository departementRepository;

    @InjectMocks
    private EquipeServiceImpl equipeService;

    @Before
    public void setUp() {
        // Initialize any test data or configurations here
    }

    @Test
public void testAddEquipe() {
    // Create a mock Equipe object
    Equipe equipe = new Equipe();

    // Mock the behavior of the equipeRepository's save method
    when(equipeRepository.save(equipe)).thenReturn(equipe);

    // Call the service method to add an Equipe
    Equipe addedEquipe = equipeService.addEquipe(equipe);

    // Verify that the equipeRepository's save method was called once
    verify(equipeRepository, times(1)).save(equipe);

    // Assert that the addedEquipe is the same as the mock Equipe
    assertEquals(equipe, addedEquipe);
}

    // Similar test methods for other service methods can be added here
}
