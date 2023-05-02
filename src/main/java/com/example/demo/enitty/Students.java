package com.example.demo.enitty;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString	
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
 @Table(name="tbl_students", uniqueConstraints = @UniqueConstraint(
  name="email_unique", columnNames="email_address"))
 
public class Students {  
	@Id
	@SequenceGenerator(
			name="students_sequence",
			sequenceName="students_sequence",
			allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	       generator="students_sequence")
	
	private Long studentId;
	private String firstName;
	private String lastName;
	@Column(name="email_address",
			nullable=false)
	private String email;
	private String guardianEmail; 
	private String  guardianName;
	 
	 private String guardianPhonenuumber;
	/*
	 * private String email; private String guardianEmail; private String
	 * guardianName;
	 * 
	 * private String guardianPhonenuumber;
	 */
	
	/*
	 * @Embedded private Guardian guardian;
	 */
	
}
