package com.destcar.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "carro")
public class CarroVO {
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "idCarro")
	private Long idCarro;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "placa")
	private String placa;
	
	@Column(name = "data")
	private LocalDate data;

	@Column(name = "kmRodado")
	private String kmRodado;
	
	@Column(name = "modelo")
	private String modelo;
	
	


	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Long getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(Long idCarro) {
		this.idCarro = idCarro;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getKmRodado() {
		return kmRodado;
	}
	public void setKmRodado(String kmRodado) {
		this.kmRodado = kmRodado;
	}
	
	
}
