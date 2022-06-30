package tn.stage.spring.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table(name = "ListesRIB")
public class ListesRIB {
	public static final long serialVersionUID =1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="IDBanque")
	private int IDBanque;
	@Column(name="CodeBanque")
	private String CodeBanque;
	@Column(name="Adresse")
	private String Adresse;
	@Column(name="NomBanque")
	private String NomBanque;
	@Column(name="AdresseEMail")
	private String AdresseEMail;
	@Column(name="Agence")
	private String Agence;
	@Column(name="Ville")
	private String Ville;
	@Column(name="CodePostal")
	private String CodePostal;
	@Column(name="Téléphone")
	private String Téléphone;
	@Column(name="IBAN")
	private String IBAN;
	@Temporal(TemporalType.DATE)
	private Date SaisiLe;
	@Column(name="SaisiePar")
	private String SaisiePar;
	@Column(name="Login")
	private String Login;
	@Column(name="MotDePasse")
	private String MotDePasse;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	Client clients;
}
