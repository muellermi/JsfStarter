package de.jsfclass.jsfstarter;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Insurance {
	
 private List<SelectItem> obtainList (){
	 List<SelectItem> items = new ArrayList<>();
	 items.add(new SelectItem(1, "Lebensversicherung"));
	 items.add(new SelectItem(2, "Krankenversicherung"));
	 items.add(new SelectItem(3, "KFZ"));
	return items; 
 }
 
 public List<SelectItem> getItems(){
	 return obtainList();
 }
 
 private int insuranceType;

public int getInsuranceType() {
	return insuranceType;
}

public void setInsuranceType(int insuranceType) {
	this.insuranceType = insuranceType;
} 
}
