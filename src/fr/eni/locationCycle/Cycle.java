package fr.eni.locationCycle;

import java.time.LocalDate;

public abstract class Cycle {
	String marque;
	String modele;
	LocalDate dateAchat;

	// Constructueur
	public Cycle(String marque, String modele, LocalDate dateAchat) {
		this.marque = marque;
		this.modele = modele;
		this.dateAchat = dateAchat;
	}
	// Calculer l'âge du cycle
	public int age() {
		return dateAchat.until(LocalDate.now()).getYears();
	}
	// Indique le tarif pour une heure
	public abstract double getTarifLocationHeure();

	@Override
	public String toString() {
		int age = this.age();
		return String.format("%s %s %s (%dan%s)",
				this.getClass().getSimpleName(), this.marque, this.modele, age,
				age > 1 ? "s" : "");
	}
}
