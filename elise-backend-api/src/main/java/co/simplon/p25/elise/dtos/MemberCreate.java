package co.simplon.p25.elise.dtos;

public class MemberCreate {
	
	private String firstName;
	private String lastName;
	private String codeDep;
	
	public MemberCreate() {
		
	}
		
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCodeDep() {
		return codeDep;
	}
	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}
	
}
