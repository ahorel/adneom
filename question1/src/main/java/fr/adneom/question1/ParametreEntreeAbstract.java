package fr.adneom.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Classe permettant de réaliser la stratégie de partitionnement à partir des trois sous classes :
 * - ParametreEntreeString
 * - ParametreEntreeEntier
 * - ParametreEntreeInvalide
 * @author arthu
 *
 * @param <T>
 */
public abstract class ParametreEntreeAbstract<T> {
	protected T t;
	
	protected List<List<T>> partition;
	
	protected abstract T get();
	
	protected abstract void set(T t1);
	
	protected abstract <T> List<List<T>> creerPartition(List<T> objs, final int N);
	
	

}
