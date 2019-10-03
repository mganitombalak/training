package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;

	@Transient
	private String resoruceUrl;
	
	@OneToMany(mappedBy = "category")
	private List<SubCategory> subCategorys;

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

	public String getResoruceUrl() {
		return resoruceUrl;
	}

	public void setResoruceUrl(String resoruceUrl) {
		this.resoruceUrl = resoruceUrl;
	}

	public List<SubCategory> getSubCategorys() {
		return subCategorys;
	}

	public void setSubCategorys(List<SubCategory> subCategorys) {
		this.subCategorys = subCategorys;
	}

}
