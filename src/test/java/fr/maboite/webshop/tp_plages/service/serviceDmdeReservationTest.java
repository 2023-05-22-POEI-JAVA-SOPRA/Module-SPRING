package fr.maboite.webshop.tp_plages.service;

import org.junit.jupiter.api.Test;

import fr.maboite.webshop.tp_plages.model.DemandeReservation;

public class serviceDmdeReservationTest {
	
	
	private serviceReservation resSer;
	
	@Test
    public void test_null_if_bad_plage() {
        DemandeReservation dr = new DemandeReservation("Boubou","Saucisson","Hotel saucisson");
        assertNull(resSer.createFromDemande(dr));
    }
    
    @Test
    public void test_null_if_bad_hotel() {
        DemandeReservation dr = new DemandeReservation("Boubou","Saucisson plage","super Hotel saucisson");
        assertNull(resSer.createFromDemande(dr));
    }
}
