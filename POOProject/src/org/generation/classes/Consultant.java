package org.generation.classes;

public class Consultant implements Pagable {
	private String razonSocial;
	private String RFC;
	private double costoHora;
	
	
	public Consultant(String razonSocial, String RFC, double costoHora) {
		super();
		this.razonSocial = razonSocial;
		RFC = RFC;
		this.costoHora = costoHora;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getRFC() {
		return RFC;
	}


	public void setRFC(String rFC) {
		RFC = rFC;
	}


	public double getCostoHora() {
		return costoHora;
	}


	public void setCostoHora(double costoHora) {
		this.costoHora = costoHora;
	}


	@Override
	public String toString() {
		return "Consultant [razonSocial=" + razonSocial + ", RFC=" + RFC + ", costoHora=" + costoHora + "]";
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return razonSocial;
	}


	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return "Externo";
	}


	@Override
	public String calculateSalary(int days) {
		// TODO Auto-generated method stub
		return String.format("%.2f", ((this.costoHora*8)*days)*1.16);	
	}


	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 10000;
	}	
}//classConsultant
