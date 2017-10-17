package com.prueba;

public class Estudiante {
	//atributos de la clase,son privados
	private int codigo;
	private String nombre;
	
	//constructor de la clase
	public Estudiante(int codigo, String nombre)
	{
		//llamada a metodos
		//se establecen valores de forma segura
		setCodigo(codigo);
		setNombre(nombre);
	}
	/*
	 * Como los atributos de la clase son privados
	 * necesito una manera de acceder a sus valores
	 * por eso creo metodos para poder acceder
	 * de forma segura a estos*/
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	void probar()
	{
		System.out.println("Hola, soy un método sin modificador de acceso");
	}
}
