package edu.ycp.cs320.Shopeze.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.Shopeze.model.ShopezeModel;

public class ShopezeTest {
	private ShopezeModel model;
	
	@Before
	public void setUp() {
		model = new ShopezeModel();
	}
	
	@Test
	public void testAddOneItem() {
		model.populatearray();
		model.additem("apple");
		assertEquals("apple", model.getListItem(0))
	}
	
	public void testAddingMultiple() {
		model.populatearray();
		model.additem("apple");
		model.additem("toothpaste");
		assertEquals("apple", model.getListItem(0))
		assertEquals("toothpaste", model.getListItem(1))
	}
	
	public void testCheckUser(){
		assertTrue(model.usercheck(username, password));
	}
}
