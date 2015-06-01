package fiuba.algo3.algocraft;



import org.junit.Assert;
import org.junit.Test;

public class RecursoTest {

	@Test
	public void test01_crearNodoDeMineralConReservaInicialEn1000()
	{
		Recurso mineral = new Mineral(new Posicion(1,1));
		Assert.assertEquals(mineral.reservaDisponible(), 1000);
	}
	
}