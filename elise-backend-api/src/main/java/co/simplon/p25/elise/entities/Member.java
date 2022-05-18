package co.simplon.p25.elise.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "members")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "surname")
	private String surname;

	@Column(name = "code_dep")
	private String codeDep;

	@ManyToOne
	@JoinColumn(name = "type_id")
	private TypeMember memberType;

	@ManyToOne
	@JoinColumn(name = "task_id")
	private Task memberTask;
	
	public Member() {
		
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
