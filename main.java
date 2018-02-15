import java.io.*;
public class Esercizio {
	public static void main(String args[])
	{
		//Impostazione standard input
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
	
		//Dichiarazione variabili
		int n=0;
		int numeri[] = new int[100];
		
		//Richiesta inserimento numero elementi vettore con controllo
		do
		{
			System.out.print("Quanti numeri vuoi inserire nel vettore?: ");
			try {
				String numeroLetto = tastiera.readLine();
				n = Integer.valueOf(numeroLetto).intValue();
				}
			catch (Exception e)
			{
				System.out.println("Il valore inserito non è valido!");
			}
			if ((n<=0)||(n>100))
			System.out.println("Inserisci un valore compreso tra '0' e '100'");
		}
		while ((n<=0)||(n>100));
		
		//Inserimento elementi nel vettore
		for(int i=0; i<n; i++)
		{
			System.out.print("Inserisci elemento n. "+(i+1)+": ");
			try {
					String numeroLetto = tastiera.readLine();
					numeri[i] = Integer.valueOf(numeroLetto).intValue();
				}
			catch (Exception e)
			{
				System.out.println("Il valore inserito non è valido!");
			}
		}
		
		//Ricerca e output valori uguali
		int c[] = new int[100];
		int frequenze[] = new int[100];
		
	    for (int i = 0; i < 100;i++)
	    	frequenze[i]=0;
	    	
	    for (int i = 0; i < c.length; i++)
			if ((c[i]>=0)&&(c[i] <= 100))
				frequenze[c[i]]++;
		   
	    System.out.println("Le frequenze sono: ");
	    for(int i=0; i<100;i++)
	        System.out.println(" Cifra " + i + " : " + frequenze[i] + " volte");
		}	
}
		
