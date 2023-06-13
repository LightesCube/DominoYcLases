import java.util.Vector;

public class Dado {
	private int caraSuperior;
	private Object lanzar;
	private String probabilidadCara;
	public Vector<JuegoDeDados> dado = new Vector<JuegoDeDados>();
	public Calculadora calculadora;

	public int getCaraSuperior() {
		return this.caraSuperior;
	}

	public void setCaraSuperior(int caraSuperior) {
		this.caraSuperior = caraSuperior;
	}

	public void getLanzar() {
		return this.lanzar;
	}

	public void setLanzar(Object lanzar) {
		this.lanzar = lanzar;
	}

	public String getProbabilidadCara() {
		return this.probabilidadCara;
	}

	public void setProbabilidadCara(String probabilidadCara) {
		this.probabilidadCara = probabilidadCara;
	}
}