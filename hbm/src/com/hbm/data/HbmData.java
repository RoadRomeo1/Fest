package com.hbm.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="single")
public class HbmData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
	private int id;
	@Column(name="name")
    private String name;
	@Column(name="eventname")
    private String eventname;
	@Column(name="date")
    private String date;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEventname() {
	return eventname;
}
public void setEventname(String eventname) {
	this.eventname = eventname;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}


}
