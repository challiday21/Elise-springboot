package co.simplon.p25.elise.dtos;

public class MemberCreate {
	
	private String firstName;
	private String surname;
	private String codeDep;
	
	public MemberCreate() {
		
	}
		
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getCodeDep() {
		return codeDep;
	}
	
	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}
	
}