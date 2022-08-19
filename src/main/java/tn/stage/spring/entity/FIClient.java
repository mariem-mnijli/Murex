package tn.stage.spring.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class FIClient implements Serializable{
	
	public static final long serialVersionUID =1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="client", nullable=true,length = 25)
	private String client;
	
	@Column(name="responsable", nullable=true,length = 40)
	private String responsable;
	
	
	@Column(name="telephone", nullable=true,length = 15)
	private String Telephone;
	
	
	@Column(name="adresseEMail", nullable=true,length = 30)
	private String adresseEMail;
	
	@Column(name="mission", nullable=true,length = 15)
	private String mission;
	

	@Column(name="taches")
	private String taches;
	
	@Column(name="demandeur", nullable=true,length = 15)
	private String demandeur;
	
	@Column(name="contrat", nullable=true)
	private String contrat;
	
	@Column(name="consultant", nullable=true,length = 5)
	private String consultant;
	
	@Column(name="departement", nullable=true,length = 30)
	private String departement;
	
	@Column(name="description", nullable=true,length = 5)
	private String description;
	
	@Column(name="commentaires", nullable=true,length = 25)
	private String commentaires;
	
	@Column(name="datedebut", nullable=true,length = 150)
	private LocalDateTime datedebut;
	
	@Column(name="datefin", nullable=true,length = 150)
	private LocalDateTime datefin;
	
	@Column(name="nbrheure", nullable=true,length = 25)
	private int nbrheure; 
	
	@Column(name="nbrjours", nullable=true,length = 25)
	private int nbrjours;
	
	@Enumerated (EnumType.STRING ) 
	private statusFI statusfi;

	
}
