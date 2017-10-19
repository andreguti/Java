package refrigerador;

public class Refrigerador
{
	private int temperatura;
	private CajaFrutas cajaFruta;
	public Refrigerador()
	{
	
	}

	public void setTemperatura(int temp)
	{
		this.temperatura = temp;
	}

	public int getTemperatura()
	{
		return temperatura;
	}

	public void setCajaFruta(CajaFrutas cajaFruta)
	{
		this.cajaFruta = cajaFruta;
	}

	public CajaFrutas getCajaFruta()
	{
		return this.cajaFruta;
	}

	/*public CajaFruta getCajaFruta()
	{
		return CajaFrutas;
	}*/
}
