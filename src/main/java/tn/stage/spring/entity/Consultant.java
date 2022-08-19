package tn.stage.spring.entity;

import javax.persistence.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Consultant implements Serializable{

	public static final long serialVersionUID =1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int numConsultant;
	
	@Column(name="nom", nullable=true,length = 25)
	private String nom;
	
	@Column(name="codeConsultant", nullable=true,length = 40)
	private String codeConsultant;
	
	@Column(name="adresse", nullable=true,length = 150)
	private String adresse;
	
	@Column(name="telephone", nullable=true,length = 15)
	private String Telephone;
	
	@Column(name="fax", nullable=true,length = 15)
	private String Fax;
	
	@Column(name="adresseEMail", nullable=true,length = 30)
	private String adresseEMail;
	
	@Column(name="pays", nullable=true,length = 15)
	private String pays;
	
	@Column(name="gsm", nullable=true,length = 15)
	private String gsm;
	
	@Column(name="observations", nullable=true)
	private String observations;
	
	@Column(name="codePostal", nullable=true,length = 5)
	private String codePostal;
	
	@Column(name="ville", nullable=true,length = 30)
	private String ville;
	
	@Column(name="civilite", nullable=true,length = 5)
	private String civilite;
	
	@Column(name="prenomConsultant", nullable=true,length = 25)
	private String prenomConsultant;
	
	@Column(name="adresseSuite", nullable=true,length = 150)
	private String adresseSuite;
	
	
	
	
	
}
