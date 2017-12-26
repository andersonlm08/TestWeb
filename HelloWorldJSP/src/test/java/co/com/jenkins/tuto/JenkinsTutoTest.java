package co.com.jenkins.tuto;

import org.junit.Test;
import static org.junit.Assert.*;


public class JenkinsTutoTest {
	
	//@Test
	public void debeCalcularPrecioMultiploTres5(){
		
		JenkinsTuto jenkinsTuto = new JenkinsTuto();
		int cantidad = 3;
		double precio = jenkinsTuto.calcularPrecio(cantidad);
		
		assertTrue("Precio correcto", precio == 5000.0D);
	}
	
	//@Test
	public void debeCalcularPrecioMultiploTres10(){
		
		JenkinsTuto jenkinsTuto = new JenkinsTuto();
		int cantidad = 6;
		double precio = jenkinsTuto.calcularPrecio(cantidad);
		
		assertTrue("Precio correcto", precio == 10000.0D);
	}
	
	//@Test
	public void debeCalcularPrecioNoMultipoTres2(){
		
		JenkinsTuto jenkinsTuto = new JenkinsTuto();
		int cantidad = 1;
		double precio = jenkinsTuto.calcularPrecio(cantidad);
		
		assertTrue("Precio correcto", precio == 2000.0D);
	}
	
	@Test
	public void debeCalcularPrecioNoMultipoTres4(){
		
		JenkinsTuto jenkinsTuto = new JenkinsTuto();
		int cantidad = 4;
		double precio = jenkinsTuto.calcularPrecio(cantidad);
		
		assertTrue("Precio correcto", precio == 7000.0D);
	}
	
	@Test
	public void debeCalcularPrecioNoMultipoTres7(){
		
		JenkinsTuto jenkinsTuto = new JenkinsTuto();
		int cantidad = 7;
		double precio = jenkinsTuto.calcularPrecio(cantidad);
		
		assertTrue("Precio correcto", precio == 12000.0D);
	}
	
	@Test
	public void debeCalcularPrecioNoMultipoTres8(){
		
		JenkinsTuto jenkinsTuto = new JenkinsTuto();
		int cantidad = 8;
		double precio = jenkinsTuto.calcularPrecio(cantidad);
		
		assertTrue("Precio correcto", precio == 14000.0D);
	}
	
	

}
