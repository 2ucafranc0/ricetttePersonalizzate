package org.generation.italy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc= new Scanner (System.in);
		String risposta="";
		Integer grammi;
		float totaleCalorie;
		float contatore=0f;
		HashMap<String, Float> listaIngredienti = new HashMap<String, Float>();
		listaIngredienti.put("Burro",7f);
		listaIngredienti.put("Olio",9f);
		listaIngredienti.put("Pasta",3.6f);
		listaIngredienti.put("Macinato di vitello",1.4f);
		listaIngredienti.put("Salmone",2.8f);
		listaIngredienti.put("Latte",0.64f);
	
		
		
		ArrayList<String> ingredientiScelti = new ArrayList<>();
		
		System.out.println("Benvenuto a  Crea la tua ricetta personalizzata!!");
		System.out.println("questi sono gli ingredienti dipsonibili e le lore rispettive calorie al grammo");
		System.out.println(listaIngredienti);
		do 
		{
		      System.out.println("scegli un ingrediente per la tua ricetta");
		      String ingredienteScelto = sc.nextLine();
	          
		      if (listaIngredienti.containsKey(ingredienteScelto)) 
		      {  ingredientiScelti.add(ingredienteScelto);
		      
		      System.out.println("Inserisci la quantità in grammi");
		       grammi=Integer.parseInt(sc.nextLine());
		      contatore+=grammi*listaIngredienti.get(ingredienteScelto);
		       
		       System.out.println("Vuoi inserire un altro proddotto?");
		       risposta= sc.nextLine();
		      }else  System.out.println("Prodotto non disponibile");
		} while (risposta.equals("si"));
		
		System.out.println("Gli ingrendììenti scelti sono: ");
		for (int i=0;i<ingredientiScelti.size();i++)
		{
	       System.out.println(ingredientiScelti.get(i));   
		}
		System.out.println("le calorie totali per la sua ricetta sono: "+ contatore);
	
		

		       
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
