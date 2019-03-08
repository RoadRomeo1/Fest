package com.hbm.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="team")
public class TeamData {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
	private int id;  

@Column(name="m1")
private String partner1;

@Column(name="m2")
private String partner2;

@Column(name="m3")
private String partner3;

@Column(name="m4")
private String partner4;

@Column(name="m5")
private String partner5;

@Column(name="m6")
private String partner6;

@Column(name="m7")
private String partner7;

@Column(name="m8")
private String partner8;

@Column(name="m9")
private String partner9;

@Column(name="m10")
private String partner10;

@Column(name="m11")
private String partner11;

@Column(name="m12")
private String partner12;

@Column(name="m13")
private String partner13;

@Column(name="m14")
private String partner14;

@Column(name="m15")
private String partner15;

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

public String getPartner3() {
	return partner3;
}

public void setPartner3(String partner3) {
	this.partner3 = partner3;
}

public String getPartner4() {
	return partner4;
}

public void setPartner4(String partner4) {
	this.partner4 = partner4;
}

public String getPartner5() {
	return partner5;
}

public void setPartner5(String partner5) {
	this.partner5 = partner5;
}

public String getPartner6() {
	return partner6;
}

public void setPartner6(String partner6) {
	this.partner6 = partner6;
}

public String getPartner7() {
	return partner7;
}

public void setPartner7(String partner7) {
	this.partner7 = partner7;
}

public String getPartner8() {
	return partner8;
}

public void setPartner8(String partner8) {
	this.partner8 = partner8;
}

public String getPartner9() {
	return partner9;
}

public void setPartner9(String partner9) {
	this.partner9 = partner9;
}

public String getPartner10() {
	return partner10;
}

public void setPartner10(String partner10) {
	this.partner10 = partner10;
}

public String getPartner11() {
	return partner11;
}

public void setPartner11(String partner11) {
	this.partner11 = partner11;
}

public String getPartner12() {
	return partner12;
}

public void setPartner12(String partner12) {
	this.partner12 = partner12;
}

public String getPartner13() {
	return partner13;
}

public void setPartner13(String partner13) {
	this.partner13 = partner13;
}

public String getPartner14() {
	return partner14;
}

public void setPartner14(String partner14) {
	this.partner14 = partner14;
}

public String getPartner15() {
	return partner15;
}

public void setPartner15(String partner15) {
	this.partner15 = partner15;
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
