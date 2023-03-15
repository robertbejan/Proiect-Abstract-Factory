package Abstract_Factory_Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import laborator.PIPproiect;

class AbstrFactryTest {

	@Test
	public void testSelectare_FabricaNull() {
		assertEquals("Nu este corect", null, Selectare_Fabrica.selectare(""));
	}
	
	@Test
	public void testTopor_piatraText() {
		assertEquals("Nu este corect", "Topor de piatra", Topor_piatra.echipament());
	}
	
	@Test
	public void testTarnacop_piatraEchipament() {
		assertEquals("Nu este corect", "Tarnacop de piatra", Tarnacop_piatra.echipament());
	}
}
