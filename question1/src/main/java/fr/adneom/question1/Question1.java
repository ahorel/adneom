package fr.adneom.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question1
{
	public static <Integer> List<List<Integer>> creerPartition(List<Integer> objs, final int N) {
	    return objs!=null ? new ArrayList<>
	    	(IntStream.range(0, objs.size()).boxed().collect(
	            Collectors.groupingBy(
	            		e -> e/N, Collectors.mapping(e->objs.get(e), Collectors.toList())
	                    )).values()) : null;
	}
}
