package no.hvl.dat102.stabel;

import no.hvl.dat102.adt.StabelADT;

public class KjedetStabel<T> implements StabelADT<T> {
	private LinearNode<T> topp;

	public KjedetStabel() {
		topp = null;

	}

	@Override
	public void push(T el) {
		LinearNode<T> nynode = new LinearNode<T>(el);
		//a Fyll ut

	}

	@Override
	public T pop() {
		if (erTom())
			throw new EmptyCollectionException("stabel");
		//b Fyll ut

		return null;
	}

	@Override
	public T peek() {
		if (erTom())
			throw new EmptyCollectionException("stabel");

		//c Fyll ut
		return null;
	}

	@Override
	public boolean erTom() {
		return (topp == null);
	}


}
