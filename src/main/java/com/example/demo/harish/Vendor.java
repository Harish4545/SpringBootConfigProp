package com.example.demo.harish;



public class Vendor {


	private Integer vid;
	private String vname;



	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}

	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vname=" + vname + "]";

	}
}
