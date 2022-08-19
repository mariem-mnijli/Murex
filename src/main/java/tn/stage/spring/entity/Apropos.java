package tn.stage.spring.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "Apropos")
public class Apropos {
	
	public static final long serialVersionUID =1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="Adresse")
	private String Adresse;
	@Column(name="Societe")
	private String Societe;
	@Column(name="Site_web")
	private String Site_web;
	@Column(name="Telephone")
	private String Telephone;
	@Column(name="Adresse_email")
	private String Adresse_email;
	

}
