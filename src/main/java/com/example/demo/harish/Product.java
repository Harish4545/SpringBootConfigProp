package com.example.demo.harish;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="my.app")
@Component("pobj")
public class Product {
	
	private Integer pid;
	private String pname;
	private Double pcost;
	
	private Map<String,String> info; 
	
	
	public Map<String, String> getInfo() {
		return info;
	}


	public void setInfo(Map<String, String> info) {
		this.info = info;
	}


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public Double getPcost() {
		return pcost;
	}


	public void setPcost(Double pcost) {
		this.pcost = pcost;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + ", info=" + info + "]";
	}

}
