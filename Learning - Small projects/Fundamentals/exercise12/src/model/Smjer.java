package model;

import java.math.BigDecimal;

public class Smjer extends Entitet {

	private String naziv;
	private int trajanje;
	private BigDecimal cijena;
	private boolean certificiran;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getTrajanje() {
		return trajanje;
	}
	public void setTrajanje(int trajanje) {
		this.trajanje = trajanje;
	}
	public BigDecimal getCijena() {
		return cijena;
	}
	public void setCijena(BigDecimal cijena) {
		this.cijena = cijena;
	}
	public boolean isCertificiran() {
		return certificiran;
	}
	public void setCertificiran(boolean certificiran) {
		this.certificiran = certificiran;
	}
	
	@Override
	public String toString() {
		return naziv;
	}
	
	
	
}
