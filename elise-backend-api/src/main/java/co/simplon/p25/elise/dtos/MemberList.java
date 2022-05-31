package co.simplon.p25.elise.dtos;

import co.simplon.p25.elise.entities.Task;
import co.simplon.p25.elise.entities.TypeMember;

public class MemberList {

	private String firstName;
	private String surname;
	private String codeDep;
	private TypeMember memberType;
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

	public TypeMember getMemberType() {
		return memberType;
	}

	public void setMemberType(TypeMember memberType) {
		this.memberType = memberType;
	}

	public Task getMemberTask() {
		return memberTask;
	}

	public void setMemberTask(Task memberTask) {
		this.memberTask = memberTask;
	}
}