package co.simplon.p25.elise.dtos;

import co.simplon.p25.elise.entities.Task;
import co.simplon.p25.elise.entities.MemberType;

public class MemberList {

	private String firstName;
	private String surname;
	private String codeDep;
	private MemberType memberType;
	private Task memberTask;

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

	public MemberType getMemberType() {
		return memberType;
	}

	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}

	public Task getMemberTask() {
		return memberTask;
	}

	public void setMemberTask(Task memberTask) {
		this.memberTask = memberTask;
	}
}