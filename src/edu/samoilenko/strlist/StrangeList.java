
package edu.samoilenko.strlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StrangeList<T extends Number> implements Iterable<T> {
	private List<T> list;
	Adder<T> adder;

	private final int LIST_SIZE = 5;

	public StrangeList() {
		list = new ArrayList<>();
		adder = new Adder<>();

	}

	public void add(T el) {
		list.add(el);
		if (list.size() == LIST_SIZE)
			list.remove(LIST_SIZE - 1);
	}

	private T peek(int index) {
		return list.get(index);
	}

	
	@SuppressWarnings("unchecked")
	public boolean delete(int index) {
		if (list.size() > index) {
			T el = this.peek(index);
			list.remove(index);
			for (int i = 0; i < list.size(); i++) {
				list.set(i, (T) adder.add(list.get(i), el));
			}

			return true;
		}

		throw new IllegalArgumentException("Wrong index");

	}

	public void printAll() {
		list.forEach(System.out::println);
	}

	public String toString() {

		return IntStream.range(0, list.size()).
				filter(n -> n % 2 != 0)
				.mapToObj(list::get)
				.collect(Collectors.toList())
				.toString() + " size=" + list.size();
	}

	public int size() {
		return list.size();
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

}
