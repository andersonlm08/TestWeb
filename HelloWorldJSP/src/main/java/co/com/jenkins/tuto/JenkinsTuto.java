package co.com.jenkins.tuto;

public class JenkinsTuto {

	public double calcularPrecio(int cantidad) {
		double precio = 0;
		int modulo = modulo(cantidad);
		double cantidadDividida = dividirCantidad(cantidad);
		
		if(modulo == 0 ){
			 precio =  cantidadDividida * 5000.0D;
		}else{
			if(cantidadDividida > 1.0D){
				return ((cantidad / 3) * 5000) + (modulo * 2000);
			}
			//retorna esto solo cuando son 1 o 2
			return modulo * 2000.0D;
		}
		
		return precio;
	}
	
	private double dividirCantidad(int cantidad){
		return (cantidad/3.0D);
	}
	private int modulo(int cantidad){		
		return cantidad % 3;
	}
}
