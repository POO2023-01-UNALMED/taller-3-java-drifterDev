package taller3.televisores;

public class TV {
	private static int numTV=0;
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	
	public TV(Marca marca, boolean estado){
		this.marca=marca;
		this.estado=estado;
		this.canal=1;
		this.precio=500;
		this.volumen=1;
		setNumTV(getNumTV()+1);
	}
	public static void setNumTV(int num) {
		numTV=num;
	}
	public Marca getMarca() {
		return this.marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public int getCanal() {
		return this.canal;
	}
	public void setCanal(int canal) {
		if((canal<=120 && canal>=1) && this.estado==true) {
			this.canal=canal;
		}
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getVolumen() {
		return this.volumen;
	}
	public void setVolumen(int volumen) {
		if(this.estado==true && (volumen<=7 && volumen>=0)){
			this.volumen = volumen;
		}
	}
	public Control getControl() {
		return this.control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		this.estado=true;
	}
	public void turnOff() {
		this.estado=false;
	}
	public boolean getEstado() {
		return this.estado;
	}
	public void canalUp() {
		if(this.estado && this.canal<=119) {
			this.canal++;
		}
	}
	public void canalDown() {
		if (this.estado && this.canal>=2) {
			this.canal--;
		}
	}
	public void volumenUp() {
		if (this.estado && this.volumen<=6) {
			this.volumen++;
		}
	}
	public void volumenDown() {
		if(this.estado && this.volumen>=1) {
			this.volumen--;
		}
	}

}
