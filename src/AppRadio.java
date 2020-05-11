import model.Radio;
public class AppRadio {
	public static void main(String args[]){
	
	Radio e1;

    e1 = new Radio(true,10,100.5f);
    
    System.out.println(e1.mostrarDisplay());
    e1.ligar();
    e1.diminuirVolume(5);
    System.out.println(e1.mostrarDisplay());
    e1.aumentarVolume(15);
    e1.sintonizar(97.7f);
    System.out.println(e1.mostrarDisplay());
	}
    
	
}
