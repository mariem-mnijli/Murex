package tn.stage.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table(name = "ServiceJob")
public class ServiceJob {
	
	public static final long serialVersionUID =1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="IDF_Service_job")
	private int IDF_Service_job; //numeric
	@Column(name="DescriptionSJ")
	private String DescriptionSJ;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DateDebut",nullable=false,updatable=false)
	private Date DateDebut;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DateFin",nullable=false,updatable=false)
	private Date DateFin;
	@Column(name="MantantService")
	private float MantantService;
	@Column(name="AvanceService")
	private float AvanceService;
	@Column(name="ResteService")
	private float ResteService;
	
	//@ManyToOne
	//private SousTraitant sousTraitant;
	
	@ManyToOne
	private StatutConsultation statutConsultation;
	
	@ManyToOne
	private Client client;
	
	
	

}
