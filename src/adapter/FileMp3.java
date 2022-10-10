package adapter;

class FileMp3 {
	
	String nombre;
	
	public FileMp3(String nombre) {
		this.nombre = nombre;
	}
	
	public String playMp3() {
		return this.nombre;
	}
}
