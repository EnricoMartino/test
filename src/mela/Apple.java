package mela; //esempio base di apple nel progetto multithread

//mostra ordinal(), compareTo(), equals()
enum mela {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class Apple {
	public static void main(String args[]) {
		mela ap1, ap2, ap3;
		// ottiene tutti i valori ordinali utilizzando ordinal()

		System.out.println("Ecco tutte le costanti mela:" + "e i relativi ordinali");
		for (mela a : mela.values())
			System.out.println(a + " " + a.ordinal()); // dice la posizione
		ap1 = mela.RedDel;
		ap2 = mela.GoldenDel;
		ap3 = mela.RedDel;
		System.out.println();
		// mostra compareTo() e equals()
		if (ap1.compareTo(ap2) < 0)
			System.out.println(ap1 + " viene prima di " + ap2);

		if (ap1.compareTo(ap2) > 0)
			System.out.println(ap2 + " viene prima di " + ap1);

		if (ap1.compareTo(ap3) == 0)
			System.out.println(ap1 + " è uguale a " + ap3);

		System.out.println();

		if (ap1.equals(ap2))
			System.out.println("Errore!");

		if (ap1.equals(ap3))
			System.out.println(ap1 + " è uguale a " + ap3);

		if (ap1 == ap3)
			System.out.println(ap1 + "==" + ap3);

	}
}
