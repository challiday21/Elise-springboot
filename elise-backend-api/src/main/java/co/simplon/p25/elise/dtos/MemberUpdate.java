package co.simplon.p25.elise.dtos;

public class MemberUpdate {

	private Long id;
	private String firstName;
	private String surname;
	private String codeDep;
	private Long memberType;
	private Long memberTask;

	public MemberUpdate() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getMemberType() {
		return memberType;
	}

	public void setMemberType(Long memberType) {
		this.memberType = memberType;
	}

	public Long getMemberTask() {
		return memberTask;
	}

	public void setMemberTask(Long memberTask) {
		this.memberTask = memberTask;
	}
}