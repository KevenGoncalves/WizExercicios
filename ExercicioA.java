import java.util.Date;

public class ExercicioA {

	public static void main(String args[]) {
		
		Hora clock = new Hora("02:45:30");

  }
}


class Hora{

	//Atributos
	private int hora;
	private int minutos;
	private int segundos;
	
	//Construtor 1
	Hora(int hora,int minutos,int segundos){
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	//Construtor 2
	Hora(){
		Date relogio = new Date();
		this.hora = relogio.getHours();
		this.minutos = relogio.getMinutes();
		this.segundos = relogio.getSeconds();	
	}
	
	//Contrutor 3
	Hora(int segundos){
		this.hora = segundos / 60 * 60;
		this.minutos = segundos / 60;
		this.segundos = segundos % (24 * 3600);	
	}
	
	//Contrutor 4
	Hora(String horas){
		String horasTratadas[] = horas.split(":",3);
		this.hora = Integer.parseInt(horasTratadas[0]);
		this.minutos = Integer.parseInt(horasTratadas[1]);
		this.segundos = Integer.parseInt(horasTratadas[2]);
	}
	
	//Getters e Setters
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public int getMinutos() {
		return minutos;
	}
	
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public int getSegundos() {
		return segundos;
	}
	
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	//toString	
	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + "]";
	}
	
	//compareTo
	public String compareTo(Hora clock) {
		
		if(this.hora < clock.getHora() || this.minutos < clock.getMinutos() || this.segundos < clock.getSegundos()) {
			return "Esta Hora é Menor";
		}
		
		else if(this.hora == clock.getHora() && this.minutos == clock.getMinutos() && this.segundos == clock.getSegundos()) {
			return "Esta Hora é Igual";
		}
		
		return "Esta Hora é Maior";
	}
	
}
