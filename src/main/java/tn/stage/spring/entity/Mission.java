package tn.stage.spring.entity;

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
@Table(name = "Mission")

public class Mission {
	
	public static final long serialVersionUID =1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="IDF_Mission")
	private int IDF_Mission; //numeric
	@Column(name="Designation_mission")
	private String Designation_mission;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy="missions")
	private Set<Taches> taches;

	@JsonIgnore
	@ManyToOne
	Departement departements;

}
