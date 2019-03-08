package com.hbm.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="partner")
public class CoupleData {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
    private int id;
   @Column(name="partner1")
   private String partner1;
   @Column(name="partner2")
   private String partner2;
   @Column(name="eventname")
   private String eventname;
   @Column(name="date")
   private String date;
public String getPartner1() {
	return partner1;
}
public void setPartner1(String partner1) {
	this.partner1 = partner1;
}
public String getPartner2() {
	return partner2;
}
public void setPartner2(String partner2) {
	this.partner2 = partner2;
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
