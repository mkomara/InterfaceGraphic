package ca.csf.dfc.donnees.tp.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

class LigneTest {

	@Test
	void testGetSetX() {
		Ligne test = new Ligne(1, 1, 1, 1, 1, null, null);	
		
		assertEquals(test.GetX(), 1);		
		test.setX(3);
		assertEquals(test.GetX(), 3);
		
	}

	@Test
	void testGetSetY() {
		Ligne test = new Ligne(1, 1, 1, 1, 1, null, null);	
		
		assertEquals(test.GetY(), 1);		
		test.setY(3);
		assertEquals(test.GetY(), 3);
		
	}

	@Test
	void testGetSetHauteur() {
		Ligne test = new Ligne(1, 1, 1, 1, 1, null, null);	
		
		assertEquals(test.GetHauteur(), 1);		
		test.setHauteur(130);
		assertEquals(test.GetHauteur(), 130);
		
	}

	@Test
	void testGetSetLargeur() {
		Ligne test = new Ligne(1, 1, 1, 1, 1, null, null);	
		
		assertEquals(test.GetLargeur(), 1);		
		test.setLargeur(130);
		assertEquals(test.GetLargeur(), 130);
	}

	@Test
	void testGetSetTrait() {
		Ligne test = new Ligne(1, 1, 1, 1, 1, null, null);	
		
		assertEquals(test.GetTrait(), 1);		
		test.setTrait(3);
		assertEquals(test.GetTrait(), 3);
	}

	@Test
	void testGetSetCouleur() {
		Ligne test = new Ligne(1, 1, 1, 1, 1, null, null);	
		
		assertEquals(test.GetCouleur(), null);
		test.setCouleur(Color.BLACK);
		assertEquals(test.GetCouleur(), Color.BLACK);
		test.setCouleur(Color.WHITE);
		assertEquals(test.GetCouleur(), Color.WHITE);

		
	}

	@Test
	void testGetSetRemplissage() {
		Ligne test = new Ligne(1, 1, 1, 1, 1, null, null);
		
		assertEquals(test.GetRemplissage(), null);
		test.setRemplissage(Color.BLACK);
		assertEquals(test.GetRemplissage(), Color.BLACK);
		test.setRemplissage(Color.WHITE);
		assertEquals(test.GetRemplissage(), Color.WHITE);
	}

	@Test
	void testLigne() {
		Ligne test = new Ligne(1, 2, 3, 4, 5, Color.BLACK, Color.WHITE);
		
	}

	@Test
	void testIsclicked() {
		Ligne test = new Ligne(10, 92, 24, 30, 2, null, null);	
		assertTrue(test.isclicked(15, 88));
		assertTrue(test.isclicked(35, 72));	
		assertTrue(test.isclicked(25, 82));
		assertTrue(test.isclicked(26, 76));	
		
		assertFalse(test.isclicked(37, 108));	
		assertFalse(test.isclicked(-5, 68));	
	}

	@Test
	void testDeplacer() {
		Ligne test = new Ligne(1, 1, 1, 1, 1, null, null);	
		
		
	}

	@Test
	void testModifier() {
		Ligne test = new Ligne(1, 1, 1, 1, 1, null, null);	
		
	}

	@Test
	void testCompareTo() {
		Ligne test = new Ligne(1, 1, 1, 1, 1, null, null);	
		
		
	}

}