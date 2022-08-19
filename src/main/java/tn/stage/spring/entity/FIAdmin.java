package tn.stage.spring.entity;



import java.time.LocalDateTime;

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
@Table(name = "FIAdmin")
public class FIAdmin {
	
	public static final long serialVersionUID =1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="Client")
	private String Client;
	@Column(name="Responsable")
	private String Responsable;
	@Column(name="Telephone")
	private String Telephone;
	@Column(name="Email")
	private String Email;
	@Column(name="Mission")
	private String Mission;
	@Column(name="Taches")
	private String Taches;
	@Column(name="Demandeur")
	private String Demandeur;
	@Column(name="Contrat")
	private String Contrat;
	@Column(name="Consultant")
	private String Consultant;
	@Column(name="Date_debut")
	private LocalDateTime Date_debut;
	@Column(name="Date_fin")
	private LocalDateTime Date_fin;
	@Column(name="Nbre_heures")
	private int Nbre_heures;
	@Column(name="Nbre_jours")
	private int Nbre_jours;
	@Column(name="Departement")
	private String Departement;
	@Column(name="Descriptif_mission")
	private String Descriptif_mission;
	@Column(name="Commentaires_observations")
	private String Commentaires_observations;
}
