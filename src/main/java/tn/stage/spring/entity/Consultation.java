package tn.stage.spring.entity;

import java.util.Date;
import java.util.List;

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
@Table(name = "Consultation")

public class Consultation {
	
	public static final long serialVersionUID =1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="IDF_Consultation")
	private int IDF_Consultation; //numeric
	@Column(name="CodeConsultant")
	private String CodeConsultant;
	@Column(name="MantantConsultation")
	private float MantantConsultation;
	@Column(name="Avance")
	private float Avance;
	@Column(name="Resteapayer")
	private float Resteapayer;
	@Column(name="Designationtache")
	private String Designationtache;
	@Column(name="Service_job")
	private int Service_job;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dateConsultaion",nullable=false,updatable=false)
	private Date dateConsultaion;
	@Column(name="attachment")
	private String attachment;
		
	
	@ManyToOne
	private Taches taches;
	
	@ManyToOne
	private StatutConsultation statutConsultation;
	
	//@ManyToOne
	//private Consultant consultant;
	
	
	
	
	
	
	
	
	
	
	
	
	

}
