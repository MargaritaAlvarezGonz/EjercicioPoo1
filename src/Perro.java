
public class Perro {
	String raza;
	String nombre;
	int edad;
	char sexo;
	
	Perro(){
		System.out.println("Nuevo registro de mascota");
	}
	
	Perro(String r, String n, int ed, char s){
		this();
		this.raza = r;
		this.nombre = n;
		this.edad = ed;
		this.sexo = s;		
	}
	
	void imprimirInformacion(){
        System.out.println("Raza: " + raza);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        
    }
	
	public static void main(String[] args){
        
        Perro p=new Perro("Labrador","Vainilla",2,'H');
        p.imprimirInformacion();
        System.out.println();
        
        Perro p1=new Perro("Pastor-Aleman","Ajax", 1, 'M');
        p1.imprimirInformacion();
        }
}
