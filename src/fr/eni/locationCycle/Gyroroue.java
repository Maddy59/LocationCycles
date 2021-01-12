package fr.eni.locationCycle;

import java.time.LocalDate;

public class Gyroroue extends CycleElectrique {

	public Gyroroue(LocalDate dateAchat, String modele, String marque,
			int autonomieKm) {
		super(marque, modele, dateAchat, autonomieKm);
	}

	@Override
	public double getTarifLocationHeure() {
		return 18.9;
	}
}
