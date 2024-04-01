package practica_entornos_desarrollo_uf1;
import java.util.Scanner;

/**
 * Clase Notas
 * La clase "notas" permite gestionar las notas de un estudiante, 
 * calcular su nota final y determinar si ha aprobado o no.
 * 
 * @author Enrique Segovia Vazquez
 * @version 1.0
 * @since 01/04/2024
 * 
 */

public class notas {
	double uf_1, uf_2, uf_3;
	double acu_1, acu_2, acu_3, def;
	
	Scanner entrada = new Scanner(System.in);
	
	/**
     * Método para ingresar las notas del estudiante.
     * 
     */
	public void IngresaNotas() {
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf_1= entrada.nextDouble();

		System.out.print("ingrese nota 2: ");
		
		uf_2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf_3= entrada.nextDouble();
	}
	
	/**
     * Método para comprobar la correcta introducción de las notas.
     */
	public void comprobarcion(){
		if (uf_1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf_2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf_3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}	
	}
	
	/**
     * Método para calcular la nota final del estudiante.
     * 
     */
	public void Calculonotas() {
		acu_1= uf_1*0.35;
		acu_2 = uf_2 * 0.35;
		acu_3 = uf_3 * 0.30;
		
		def = acu_1 + acu_2+ acu_3;
	}
	
	/**
     * Método para mostrar las notas y el resultado final.
     * 
     */
	public void Mostrar() {
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf_1);
		System.out.println(" nota2 = " + uf_2);
		System.out.println(" nota3 = " + uf_3);
		
		System.out.println(" acumuado 1 = "+ acu_1);
		System.out.println(" acumuado 2 = "+ acu_2);
		System.out.println(" acumuado 3 = "+ acu_3);
		
		System.out.println(" nota definitiva es = "+ def);
	}
	
	/**
     * Método para determinar si el estudiante aprobó o no.
     * 
     */
	public void aprobado() {
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
		
	/**
     * Método principal para ejecutar el programa.
     * @param args Argumentos de la línea de comandos.
     * 
     */
	public static void main(String[] args) {
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
	}
}


	


