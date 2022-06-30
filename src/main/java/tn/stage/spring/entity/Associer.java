package tn.stage.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@Table(name = "Associer")

public class Associer {
	public static final long serialVersionUID =1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="IDAssocier")
	private int IDAssocier; //numeric
	@Column(name="Nom_et_Prénom")
	private String Nom_et_Prénom;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Date_de_naissance",nullable=false,updatable=false)
	private Date Date_de_naissance;
	
	@Column(name="N_CIN")
	private String N_CIN;
	@Column(name="Date_CIN",nullable=false,updatable=false)
	private Date Date_CIN;
	@Column(name="Adresse")
	private String Adresse;
	@Column(name="Représentant_Légal")
	private String Représentant_Légal;
	@Column(name="Nbre_de_parts")
	private int Nbre_de_parts;
	@Column(name="RL_Nom")
	private String RL_Nom;
	@Column(name="RL_CIN")
	private String RL_CIN;
	@Column(name="RL_Adresse")
	private String RL_Adresse;
	

}
