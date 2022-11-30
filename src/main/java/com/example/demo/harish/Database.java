package com.example.demo.harish;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix="my.db")
@Component("dobj")
public class Database {
	
	private String database;
	private String url;
	
	private List<String> numbers;
	
	
	private Vendor vb;
	
	public Vendor getVb() {
		return vb;
	}

	public void setVb(Vendor vb) {
		this.vb = vb;
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "Database [database=" + database + ", url=" + url + ", numbers=" + numbers + ", vb=" + vb + "]";
	}
	
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
