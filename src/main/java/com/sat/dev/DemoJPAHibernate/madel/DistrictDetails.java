package com.sat.dev.DemoJPAHibernate.madel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DistrictDetails {
	@Id
	private String name;
	private String sinceOld;
	private int gen;

	public DistrictDetails(String name, String sinceOld, int gen) {
		super();
		this.name = name;
		this.sinceOld = sinceOld;
		this.gen = gen;
	}

	public DistrictDetails() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinceOld() {
		return sinceOld;
	}

	public void setSinceOld(String sinceOld) {
		this.sinceOld = sinceOld;
	}

	public int getGen() {
		return gen;
	}

	public void setGen(int gen) {
		this.gen = gen;
	}

}
