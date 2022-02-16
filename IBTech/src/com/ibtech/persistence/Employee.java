package com.ibtech.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Type;
import lombok.Data;

@Entity
@Table(name = "EMPLOYEES")
@Data
public class Employee {

	@Id
	@Column(name = "EMP_NO")
	private int employeeNumber;

	@Column(name = "BIRTH_DATE")
	@Temporal(TemporalType.DATE)
	private Date birthDate;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "GENDER", columnDefinition = "SMALLINT")
	@Type(type = "org.hibernate.type.ShortType")
	private short gender;

	@Column(name = "HIRE_DATE")
	@Temporal(TemporalType.DATE)
	private Date hireDate;



}
