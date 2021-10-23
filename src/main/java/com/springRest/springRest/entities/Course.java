package com.springRest.springRest.entities;

public class Course {
	
	private long id ;
	private String titile ;
	private String description ;
	
	public Course(long id, String titile, String description) {
		super();
		this.id = id;
		this.titile = titile;
		this.description = description;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", titile=" + titile + ", description=" + description + ", getId()=" + getId()
				+ ", getTitile()=" + getTitile() + ", getDescription()=" + getDescription() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
