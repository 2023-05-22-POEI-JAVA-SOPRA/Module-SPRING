package fr.maboite.webshop.model;

import java.time.LocalDate;

public class ReservationPojo {

	private Integer id;
	
	private String name;
	
	private LocalDate begin;
	
	private LocalDate end;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBegin() {
		return begin;
	}

	public void setBegin(LocalDate begin) {
		this.begin = begin;
	}

	public LocalDate getEnd() {
		return end;
	}

	public void setEnd(LocalDate end) {
		this.end = end;
	}
	
	
}
