package tn.stage.spring.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "Client")
public class Client {
	public static final long serialVersionUID =1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="NumClient")
	private int NumClient;
	@Column(name="Nom")
	private String Nom;
	@Column(name="CodeClient")
	private String CodeClient;
	@Column(name="Adresse")
	private String Adresse;
	@Column(name="Telephone")
	private String Telephone;
	@Column(name="Fax")
	private String Fax;
	@Column(name="AdresseEMail")
	private String AdresseEMail;
	@Column(name="Pays")
	private String Pays;
	@Column(name="GSM")
	private String GSM;
	//text
	@Column(name="Observations")
	private String Observations;
	@Column(name="CodePostal")
	private String CodePostal;
	@Column(name="Ville")
	private String Ville;
	@Column(name="Civilité")
	private String Civilité;
	@Column(name="PrenomClient")
	private String PrenomClient;
	@Column(name="AdresseSuite")
	private String AdresseSuite;
	@Column(name="TypeClient")
	private String TypeClient;
	@Column(name="Société")
	private String Société;
	@Column(name="Rcs")
	private String Rcs;
	@Column(name="NumTVA")
	private String NumTVA;
	@Column(name="LCR")
	private String LCR;
	@Column(name="IBAN")
	private String IBAN;
	@Column(name="Banque")
	private String Banque;
	//MONEY
	@Column(name="EnCoursAutorisé")
	private float EnCoursAutorisé;
	@Column(name="ExemptTVA")
	private byte ExemptTVA;
	@Temporal(TemporalType.DATE)
	private Date DatefinExo;
	@Column(name="NumEoneration")
	private String NumEoneration;
	@Temporal(TemporalType.DATE)
	private Date DatedebutExo;
	@Column(name="Photo")
	private String Photo;
	@Temporal(TemporalType.DATE)
	private Date DateNaissance;
	@Column(name="ARappeler")
	private byte ARappeler;
	@Column(name="AdresseIP")
	private String AdresseIP;
	@Column(name="MotDePasse")
	private String MotDePasse;
	@Column(name="Question")
	private String Question;
	@Column(name="Réponse")
	private String Réponse;
	@Column(name="NomAdresse")
	private String NomAdresse;
	@Temporal(TemporalType.DATE)
	private Date SaisiPar;
	@Temporal(TemporalType.DATE)
	private Date SaisiLe;
	@Column(name="AuteurModif")
	private String AuteurModif;
	@Temporal(TemporalType.DATE)
	private Date DateModif;
	@Column(name="AdresseEMailNomAdresse")
	private String AdresseEMailNomAdresse;
	@Column(name="Représentant")
	private String Représentant;
	@Column(name="AncienCode")
	private String AncienCode;
	@Column(name="Login")
	private String Login;
	@Column(name="R1_NOM")
	private String R1_NOM;
	@Temporal(TemporalType.DATE)
	private Date R1_Date_de_naissance;
	@Column(name="R1_N_CIN")
	private String R1_N_CIN;
	@Temporal(TemporalType.DATE)
	private Date R1_Date_CIN;
	@Column(name="R1_Adresse")
	private String R1_Adresse;
	@Column(name="R1Qualité")
	private String R1Qualité;
	@Column(name="R1_N_TEL")
	private String R1_N_TEL;
	@Column(name="R1_E_mail")
	private String R1_E_mail;
	@Column(name="R2_NOM")
	private String R2_NOM;
	@Column(name="R2_Date_de_naissance")
	private String R2_Date_de_naissance;
	@Column(name="R_2N_CIN")
	private String R_2N_CIN;
	@Column(name="R2_Date_CIN")
	private String R2_Date_CIN;
	@Column(name="R2_Adresse")
	private String R2_Adresse;
	@Column(name="R2_Qualité")
	private String R2_Qualité;
	@Column(name="R2_N_TEL")
	private String R2_N_TEL;
	@Column(name="R2_Email")
	private String R2_Email;
	//MONEY
	@Column(name="Capital_Social")
	private float Capital_Social;
	//MONEY
	@Column(name="Valeur_Nominale")
	private float Valeur_Nominale;
	@Column(name="Nbre_de_parts")
	private int Nbre_de_parts;
    
    
	@JsonIgnore	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="clients")
	private Set<ImpotsSoumis_Client> ImpotsSoumis_Client;
	
	
	@ManyToOne
	private TypeClient typeClient;
	
	@ManyToOne
	private Associer associer;
}

    

    
    
	


