package tn.stage.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "ServiceJob_Consultation")
public class ServiceJob_Consultation {
	public static final long serialVersionUID =1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="ServiceJob_Consultation")
	private int ServiceJob_Consultation;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	Consultation consultation;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	ServiceJob serviceJob;
	

}
