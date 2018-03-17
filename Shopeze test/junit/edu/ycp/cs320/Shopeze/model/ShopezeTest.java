package edu.ycp.cs320.dhenry5.model;

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
	public void testSetMin() {
		model.setMin(1);
		assertEquals(1, model.getMin());
	}
	
	public void testSetMax() {
		model.setMax(100);
		assertEquals(100, model.getMax());
	}
}
