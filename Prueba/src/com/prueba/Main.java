
package com.prueba;

import java.io.IOException;
import java.util.Scanner;
import com.salon4.llorar.*;

public class Main {
	public static int id = 0;
	public static long id2 = 0;

	public static void main(String[] args) {
		
		id = 25;
		// TODO Auto-generated method stub
		System.out.println("#####");
		
		int a  = 1;
		int b = 81;
		int resultado = 0;
		
		resultado = a + b ;
		
		//Suma
		System.out.println("Suma: "+resultado);
		
		float d = 3.14592678f;
		float c = 10.34434343434f;
		float resf = 0.0f;
		
		resf = d + c;
		
		System.out.println("Suma de flotantes: "+resf);
		System.out.println(d + b);
		
		//Chicharronera
		double x1 = ((-b)+ Math.sqrt(Math.pow(b, 2) -(4*a*c )))/(2*a);
		double x2 = ((-b)- Math.sqrt(Math.pow(b, 2) -(4*a*c )))/(2*a);
		System.out.println("Chicharronera: X1 = "+x1+" , X2 = "+x2);
		
		String cadena = "Parangaricutirimicuaro";
		
		System.out.println("////////////////// Cadenas  /////////////");
		System.out.println("");
		System.out.println("\n");
		String cadenaCesar = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		int espacio = 3;
		System.out.println(cadena);
		//Moverse por el arreglo de la cadena
		for(int x = 0; x < cadena.length(); x++)
		{
			System.out.println(cadena.charAt(x));
			//HAcer substitución
			cadena = cadena.replace(cadena.charAt(x), cadenaCesar.charAt(x + espacio)); 
		}
		System.out.println(cadena);
		//Subcadenas
		System.out.println(cadena.substring(3, 6));
		//Convertir a minúsculas
		System.out.println(cadena.toLowerCase());
		
		//Arrays
		String [] meses = {"Jan", "Feb", "Mar", "Apr", "May", 
				"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		String [] sem = {"Mon", "Tue", "Wed","Thu", "Fri","Sat","Sun"};
		//Obejtivo: mostrar enero , julio, noviembre, dicembre y marzo en la misma línea
		System.out.print(meses[0]+" "+meses[6]+" "+meses[10]
				+" "+meses[11]+" "+meses[2]+" "+sem[0]+" "+sem[4]+" "+sem[1]);
		
		//Fallo provocado
		//System.out.println(sem[8]);
		
		boolean x = true;
		boolean az = false;
		System.out.println("\n\n");
		//System.out.println(x != az);

		//System.out.println(x || az);
		//System.out.println(x && az);
		/*
		if(x != az)
		{
			System.out.println("Chana!!!");
		}
		else
		{
			System.out.println("Juana!!!");
		}*/
		/*
		//Bloque de palacio de fierro
		if(x == az)
		{
			System.out.println("Chana!!!");
		}
		else if(x == az)
		{
			System.out.println("Juana!!!");
		}
		else if(x == az)
		{
			System.out.println("Melón!!!");
		}
		else if(!x == !az)
		{
			System.out.println("Sandía!!!");
		}
		else if(!(x == !az))
		{
			System.out.println("La vieja del otro día!!!");
		}
		else
		{
			System.out.println("Ni modo!!!");
		}*/
		
		//Switch de la mexicana que fruta vendía
		System.out.println("\n\n");
		
		/*
		String opcion = "Chana";
		//Instanciar la clase que lee de teclado
		Scanner lector = new Scanner(System.in);
		//Leer de teclado hasta dar 'enter'
		opcion = lector.nextLine();
		
		switch(opcion)
		{
			case "Chana":
				System.out.println("Chana!!");
				break;
			case "Juana":
				System.out.println("Juana!!");
				break;
			case "Chona":
				System.out.println("Chona!!");
				break;
			default:
				System.out.println("Ninguno!!");
				break;
		}*/
		
		//Le da equals el método
		/*
		String cadena5 = "Hola";
		
		if(cadena5.equals("Hola "))
		{
			System.out.println("Son iguales!!");
		}
		else
		{
			System.out.println("No son iguales!!");
		}*/
		
		//For each
		/*
		for(String i: meses)
		{
			System.out.print(i);
			
		}*/
		
		//Bucle while
		/*
		int contador = 0;
		while(contador < meses.length)
		{
			System.out.println((contador+1)+" : "+meses[contador]);
			contador++;
		}*/
		
		//CuentaPalabras cPlb = new CuentaPalabras(7);
		//cPlb.cuentaLetras();
		
		
		
		
		//Bloque try and catch
		//Controlar excepciones
		//NullPointer, NumeberFormat, OutOfBounds, IO
		
		//sin manejador de excepciones, da error y se detiene el programa
		//int contador = 0;
		/*while(contador < 14)
		{
			System.out.println((contador+1)+" : "+meses[contador]);
			contador++;
		}*/
		/*try{
		     contador = 0;
			while(contador < 14)
			{
				System.out.println((contador+1)+" : "+meses[contador]);
				contador++;
			}
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Excepcion:  "+ex);
		}catch(NullPointerException ex){
			System.out.println("Excepcion:  "+ex);
		}catch(ClassCastException ex){
			System.out.println("Excepcion:  "+ex);
		}catch(NumberFormatException ex){
			System.out.println("Excepcion:  "+ex);
		}catch(Exception ex){
			System.out.println("Excepcion:  "+ex);
		}finally{
			//el fnally se ejecuta sin importar si se llego a la excepcion
			System.out.println("Bloque finally");
		}
		System.out.println("Saliendo de la excepcion...");*/
		
		//instanciacion de la clase, uso del constructor sobrecargado
		Estudiante estudiHambre = new Estudiante(2, "Paquito");
		//obtener los datos de forma segura
		System.out.println(estudiHambre.getCodigo()+" : "+estudiHambre.getNombre());
		//cambiar los valores
		estudiHambre.setNombre("Juanitaa");
		estudiHambre.setCodigo(22);
		//obtener los datos de forma segura
		System.out.println(estudiHambre.getCodigo()+" : "+estudiHambre.getNombre());
		
		//llamar al metodo sin modificador de acceso
		
		estudiHambre.probar();
		Sacapuntas sacaPuntas = new Sacapuntas(456, "filo");
		
		id2++;
		System.out.println(x);
		probarEstatico();
		
		
		
		
		
		
		
		//Float flotante = 0.0f;
		
		
		
		
		
		
		
	}//fin del main
	//metodo estatico
	public static void probarEstatico()
	{
		id = 99999;
		System.out.println("\n"+id);
		main(null);
	}
}


