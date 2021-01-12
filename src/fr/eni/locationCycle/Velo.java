package fr.eni.locationCycle;

import java.time.LocalDate;

public class Velo extends Cycle {
	private int nbVitesses;

	public Velo(LocalDate dateAchat, String modele, String marque,
			int nbVitesses) {
		super(marque, modele, dateAchat);
		this.nbVitesses = nbVitesses;
	}

	@Override
	public double getTarifLocationHeure() {
		return 4.9;
	}

	@Override
	public String toString() {
		return String.format("%s %d vitesse%s", super.toString(),
				this.nbVitesses, this.nbVitesses > 1 ? "s" : "");
	}

}
