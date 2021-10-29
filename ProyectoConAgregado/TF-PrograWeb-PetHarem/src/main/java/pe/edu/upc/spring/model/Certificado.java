package pe.edu.upc.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Certificado")
public class Certificado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCertificado;
	
	@Column(name="NCertificado", length=20, nullable=false)
	private String NCertificado;

	public Certificado() {
		super();
	}

	public Certificado(int idCertificado, String nCertificado) {
		super();
		this.idCertificado = idCertificado;
		NCertificado = nCertificado;
	}

	public int getIdCertificado() {
		return idCertificado;
	}

	public void setIdCertificado(int idCertificado) {
		this.idCertificado = idCertificado;
	}

	public String getNCertificado() {
		return NCertificado;
	}

	public void setNCertificado(String nCertificado) {
		NCertificado = nCertificado;
	}

	
}
