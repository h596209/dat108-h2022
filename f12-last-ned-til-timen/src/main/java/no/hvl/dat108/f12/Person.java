package no.hvl.dat108.f12;

import java.time.LocalDate;

import javax.validation.constraints.Size;

import javax.validation.constraints.Pattern;

public class Person {
	@Size(min=2 message="feilmelding")
	private String navn;
	
	@Pattern(regexp = "^\\d{8}$") // Eller "^[0-9]{8}$"
	private String mobil;

	@Min(100)
	@Max(250)
	private int hoydecm;

	@Past
	private LocalDate fdato;
	
	
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getMobil() {
		return mobil;
	}
	public void setMobil(String mobil) {
		this.mobil = mobil;
	}
	public int getHoydecm() {
		return hoydecm;
	}
	public void setHoydecm(int hoydecm) {
		this.hoydecm = hoydecm;
	}
	public LocalDate getFdato() {
		return fdato;
	}
	public void setFdato(LocalDate fdato) {
		this.fdato = fdato;
	}
	
	
}
