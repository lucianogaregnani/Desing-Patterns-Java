package adapter;

class ArchivoMp3 implements ArchivoDeMusica {
	FileMp3 file = new FileMp3("Duki - Malbec");
	
	public String reproducir() {
		return "Reproduciendo archivo" + "<" + file.playMp3()+ ">";
	}
	
}
