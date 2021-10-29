package pe.edu.upc.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Duenio")
public class Duenio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDuenio;
	
	@Column(name="nameDuenio", length=20, nullable=false)
	private String nameDuenio;

	@Column(name="nameApellido", length=20, nullable=false)
	private String nameApellido;
	
	@Column(name="numDNI", length=8, nullable=false)
	private int numDNI;
	
	@Column(name="NCorreo", length=20, nullable=false)
	private String NCorreo;
	
	@Column(name="numCelular", length=9, nullable=false)
	private int numCelular;
	
	public Duenio() {
		super();
	}

	public Duenio(int idDuenio, String nameDuenio, String nameApellido, int numDNI, String nCorreo, int numCelular) {
		super();
		this.idDuenio = idDuenio;
		this.nameDuenio = nameDuenio;
		this.nameApellido = nameApellido;
		this.numDNI = numDNI;
		NCorreo = nCorreo;
		this.numCelular = numCelular;
	}

	public int getIdDuenio() {
		return idDuenio;
	}

	public void setIdDuenio(int idDuenio) {
		this.idDuenio = idDuenio;
	}

	public String getNameDuenio() {
		return nameDuenio;
	}

	public void setNameDuenio(String nameDuenio) {
		this.nameDuenio = nameDuenio;
	}

	public String getNameApellido() {
		return nameApellido;
	}

	public void setNameApellido(String nameApellido) {
		this.nameApellido = nameApellido;
	}

	public int getNumDNI() {
		return numDNI;
	}

	public void setNumDNI(int numDNI) {
		this.numDNI = numDNI;
	}

	public String getNCorreo() {
		return NCorreo;
	}

	public void setNCorreo(String nCorreo) {
		NCorreo = nCorreo;
	}

	public int getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(int numCelular) {
		this.numCelular = numCelular;
	}
}
