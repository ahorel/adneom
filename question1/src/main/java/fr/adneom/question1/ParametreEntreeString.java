package fr.adneom.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Sous classe qualifiant le tableau utilisé en entrée comme de type String
 * On peut donc réaliser un partitionnement
 * @author arthu
 *
 * @param <T>
 */
public class ParametreEntreeString<T> extends ParametreEntreeAbstract<T> {

	private static ParametreEntreeString instance = null;
	private T list;
	private int taille;
	private List<List<T>> partition;
	
	/**
	 * Constructeur ParametreEntreeString
	 * Permet de consolider les variables stockant le partitionnement et le pas de partitionnement
	 * @param objs
	 * @param N
	 */
	private ParametreEntreeString(List<T> objs,int N){
		//Rapatrier le paramètrage de la classe abstraite de strategie dans les sous classes typées
		this.list = super.t;
		this.partition = creerPartition(objs, N);
		//Rapatrier le partitionnement dans la classe abstraite de strategie
		super.partition = partition;
	}
	
	/**
	 * Recuperer le singleton de la classe ParametreEntreeString
	 * @return ParametreEntreeString
	 */
   	public static <T> ParametreEntreeString getInstance(List<T> objs,int N){
   		if(instance == null){   			
   			try {
   				instance = new ParametreEntreeString( objs, N);
			} 
   			catch (Exception e) {} 
   		}
   		return instance;
   	} 
	
   	/**
   	 * Encapsulation du paramètre T
   	 */
	@Override
	protected T get() {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * Encapsulation du paramtre T
	 */
	@Override
	protected void set(T t1) {
		// TODO Auto-generated method stub
		
	}


	/**
	 * Partitionnement de type JAVA 8
	 * @return List<List<>> non typée
	 * TODO : Dissocier le partitionnement java 8 des sous classes de partitionnement qui se suffisent à elles-mêmes
	 */
	@Override
	protected <T> List<List<T>> creerPartition(List<T> objs, int N) {
		 
		return objs!=null ? new ArrayList<>
			(IntStream.range(0, objs.size()).boxed().collect(
				Collectors.groupingBy(
			    	e -> e/N, Collectors.mapping(e->objs.get(e), Collectors.toList())
			       	)).values()) : null;
			
	}
}