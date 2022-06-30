package tn.stage.spring.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
@Table(name = "ImpotsSoumis_Client")
public class ImpotsSoumis_Client {
	public static final long serialVersionUID =1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="ImpotsSoumis_Client")
	private int ImpotsSoumis_Client;
	
	@JsonIgnore
	@ManyToOne
	ImpotsSoumis impotsSoumis;
	
	@JsonIgnore
	@ManyToOne
	Client clients;
	
}
