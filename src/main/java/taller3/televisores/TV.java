package taller3.televisores;

public class TV {
	private static int numTV=0;
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	public TV(Marca marca, boolean estado){
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if(canal<=120 || canal>=1) {
			this.canal=canal;
		}
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if(estado && canal<=119) {
			canal++;
		}
	}
	public void canalDown() {
		if (estado && canal>=2) {
			canal--;
		}
	}
	public void volumenUp() {
		if (estado && volumen<=6) {
			volumen++;
		}
	}
	public void volumenDown() {
		if(estado && volumen>=1) {
			volumen--;
		}
	}

}
