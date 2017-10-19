package refrigerador;

public class Main
{
	public static void main(String[] args)
	{
		Refrigerador refri = new Refrigerador();
		refri.setTemperatura(4);

		CajaFrutas cajaFrutas = new CajaFrutas();

		Papaya papaya = new Papaya();
		papaya.setExpiracion(5);

		Sandia sandia = new Sandia();
		sandia.setExpiracion(7);

		Banana banana = new Banana();
		banana.setExpiracion(3);

		Papaya[] papayas = new Papaya[4];

		Sandia[] sandias = new Sandia[5];

		Banana[] bananas = new Banana[3];

		for (int x = 0;x < papayas.length; x++)
		{
			papayas[x] = papaya;
		}

		for (int y = 0; y < sandias.length; y++)
		{
			sandias[y] = sandia;
		}

		for(int z = 0; z < bananas.length; z++)
		{
			bananas[z] = banana;
		}

		

		cajaFrutas.bananas = bananas;
		cajaFrutas.papayas = papayas;
		cajaFrutas.sandias = sandias;

		//refri.setCajaFrutas(cajaFrutas);
		refri.setCajaFruta(cajaFrutas);
		//Acceder a todas las papayas                                                                                           
		for(int i = 0; i < refri.getCajaFruta().papayas.length; i++)
		{
			System.out.println("Papaya numero: "+(i+1));
			System.out.println("Semillas: "+refri.getCajaFruta().papayas[i].getSemillas());
			System.out.println("Fecha de Expiracion: "+refri.getCajaFruta().papayas[i].getExpiracion());
			System.out.println("\n");
		}
		//acceder a las bananas
		for(int i = 0; i < refri.getCajaFruta().bananas.length; i++)
		{
			System.out.println("Banana numero: "+(i+1));
			System.out.println("Fecha de Expiracion: "+refri.getCajaFruta().bananas[i].getExpiracion());
			System.out.println("\n");
		}
		//acceder a las sandias
		for(int i = 0; i < refri.getCajaFruta().sandias.length; i++)
		{
			System.out.println("Sandia numero: "+(i+1));
			System.out.println("Fecha de Expiracion: "+refri.getCajaFruta().sandias[i].getExpiracion());
			System.out.println("\n");
		}
		
		
	}
}