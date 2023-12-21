package com.app;

public class College {
	public Long clgId;
	public String clgname;
	public String location;
	
	public Long getClgId() {
		return clgId;
	}
	public void setClgId(Long clgId) {
		this.clgId = clgId;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [clgId=" + clgId + ", clgname=" + clgname + ", location=" + location + "]";
	}

}
