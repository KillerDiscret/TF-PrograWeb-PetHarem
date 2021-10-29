package pe.edu.upc.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Mascota")
public class Mascota implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMascota;
	
	@Column(name="NMascota", length=20, nullable=false)
	private String NMascota;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fechaNacimiento")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthDatePet;
	
	@Column(name="peso", length=4, nullable=false)
	private double peso;
	
	@Column(name="tamanio", length=4, nullable=false)
	private int tamanio;
	
	@ManyToOne
	@JoinColumn(name="idDuenio", nullable=false)
	private Duenio duenio;
	
	@ManyToOne
	@JoinColumn(name="idRaza", nullable=false)
	private Raza raza;

	public Mascota() {
		super();
	}

	public Mascota(int idMascota, String nMascota, Date birthDatePet, double peso, int tamanio, Duenio duenio,
			Raza raza) {
		super();
		this.idMascota = idMascota;
		NMascota = nMascota;
		this.birthDatePet = birthDatePet;
		this.peso = peso;
		this.tamanio = tamanio;
		this.duenio = duenio;
		this.raza = raza;
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public String getNMascota() {
		return NMascota;
	}

	public void setNMascota(String nMascota) {
		NMascota = nMascota;
	}

	public Date getBirthDatePet() {
		return birthDatePet;
	}

	public void setBirthDatePet(Date birthDatePet) {
		this.birthDatePet = birthDatePet;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public Duenio getDuenio() {
		return duenio;
	}

	public void setDuenio(Duenio duenio) {
		this.duenio = duenio;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	
}
