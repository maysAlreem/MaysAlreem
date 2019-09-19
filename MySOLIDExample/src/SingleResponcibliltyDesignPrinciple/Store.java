package SingleResponcibliltyDesignPrinciple;

import java.util.ArrayList;
import java.util.List;


public class Store {
private String name ;
private String descriptin;

List<Section> allSections = new ArrayList<Section>() ;
	
	
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescriptin() {
	return descriptin;
}
public void setDescriptin(String descriptin) {
	this.descriptin = descriptin;
	
}

@Override
public String toString() {

	return "Store Name :"+getName()+"\nStore Description :"+getDescriptin()+"\n"+ PrintAllSections();
}
private String PrintAllSections(){
	String StoreInfo="";
	for(int x=0 ; allSections.size()>x;x++){
		StoreInfo += allSections.get(x).toString();
	}
	return StoreInfo;
	
}
}

