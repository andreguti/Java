package refrigerador;

public class Frutas
{
	private String color;
	private int expiracion;
	private String tamanio;

	public Frutas()
	{
	
	}

	public void setColor(String c)
	{
		this.color = c;
	}

	public String getColor()
	{
		return color;
	}

	public void setExpiracion(int exp)
	{
		this.expiracion = exp;
	}

	public int getExpiracion()
	{
		return expiracion;
	}


	public void setTamanio(String tam)
	{
		this.tamanio = tam;
	}

	public String getTamanio()
	{
		return tamanio;
	}
}//fin clase frutas