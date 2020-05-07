package fr.adneom.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Question1
{
	public static <Integer> List<List<Integer>> creerPartition(List<Integer> objs, final int N) {
	    return objs!=null ? new ArrayList<>
	    	(IntStream.range(0, objs.size()).boxed().collect(
	            Collectors.groupingBy(
	            		e -> e/N, Collectors.mapping(e->objs.get(e), Collectors.toList())
	                    )).values()) : null;
	}
	
	/*
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		// Retourner une collection de n sous listes 
		List<List<Integer>> liste = creerPartition(list,1);
		liste.stream().forEach(System.out::println);

	}
	*/
}
