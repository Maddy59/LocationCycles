package fr.eni.locationCycle;

import java.time.LocalDate;

public class Gyropode extends CycleElectrique {
	public int tailleMinCm;

	public Gyropode(LocalDate dateAchat, String modele, String marque,
			int autonomieKm, int tailleMinCm) {
		super(marque, modele, dateAchat, autonomieKm);
		this.tailleMinCm = tailleMinCm;
	}

	@Override
	public double getTarifLocationHeure() {
		return 29.9;
	}

	@Override
	public String toString() {
		return String.format("%s [%dm%d min]", super.toString(),
				this.tailleMinCm / 100, this.tailleMinCm % 100);
	}

}
