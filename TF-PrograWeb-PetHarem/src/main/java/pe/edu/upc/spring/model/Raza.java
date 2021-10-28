package pe.edu.upc.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Raza")
public class Raza implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int idRaza;
	
	@Column(name="nombreRaza", length=60, nullable=false)
	private String nombreRaza;

	public Raza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Raza(int idRaza, String nombreRaza) {
		super();
		this.idRaza = idRaza;
		this.nombreRaza = nombreRaza;
	}

	public int getIdRaza() {
		return idRaza;
	}

	public void setIdRaza(int idRaza) {
		this.idRaza = idRaza;
	}

	public String getNombreRaza() {
		return nombreRaza;
	}

	public void setNombreRaza(String nombreRaza) {
		this.nombreRaza = nombreRaza;
	} 
	
	

}
