
package edu.samoilenko.strlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StrangeList<T extends Number> {
	private List<T> list;
	private Adder<T> adder;
	private final int LIST_SIZE = 5;

	public StrangeList() {
		list = new ArrayList<>();
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
			if (el instanceof Double) {
				adder = (Adder<T>) new DoubleAdder();
			}
			if (el instanceof Integer) {
				adder = (Adder<T>) new IntegerAdder();
			}
			if (el instanceof Float) {
				adder = (Adder<T>) new FloatAdder();
			}
			
			for (int i = 0; i < list.size(); i++) {
				list.set(i, adder.add(list.get(i), el));
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

}
