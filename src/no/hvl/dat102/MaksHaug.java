package no.hvl.dat102;

public final class MaksHaug<T extends Comparable<? super T>> implements MaksHaugInterface<T> {
	private T[] haug;
	private int antall; 
	private static final int STANDARD_KAPASITET = 100;

	public MaksHaug() {
		this(STANDARD_KAPASITET); 
	}

	public MaksHaug(int startkapasitet) {
		@SuppressWarnings("unchecked")
		T[] tmp = (T[]) new Comparable[startkapasitet + 1];
		haug = tmp;
		antall = 0;
	}

	public MaksHaug(T[] elementer) {
		this(elementer.length);
		antall = elementer.length;

		for (int index = 1; index <= antall; index++)
			haug[index] = elementer[index - 1];

		for (int node = antall / 2; node > 0; node--)
			reparerNed(node);
	} 

	private boolean harVB(int node) {
		return 2 * node <= antall;
	}

	private boolean harHB(int node) {
		return 2 * node + 1 <= antall;
	}

	@Override
	public void leggTil(T nyttElement) {
		// Har inkludert reparerOpp-metoden fr� forelesing
		
		// fyll inn
	} 

	@Override
	public T fjernMaks() {
		T rot = null;

		// fyll inn

		return rot;
	} 

	@Override
	public T finnMaks() {
		T rot= null;
		if (!erTom())
			rot = haug[1];
		return rot;
	} 

	@Override
	public boolean erTom() {
		return antall < 1;
	} 

	@Override
	public int getAntall() {
		return antall;
	} 

	@Override
	public void toem() {
		for (int i = 1; i <= antall; i++) {
			haug[i] = null;
		}
		antall = 0;
	} 

	/*
	 * Vi har et undertre med rot i posisjon node. Undertreet er en haug
	 * bortsett fra roten at roten kanskje ikke oppyller kravet om � v�re
	 * st�rre enn barna sine. Metoden reparer undertreet slik at undertreet
	 * er en haug etter at metoden er utf�rt.
	 */
	private void reparerNed(int node) {
		boolean ferdig = false;
		
		// fyll inn
	} 

}
