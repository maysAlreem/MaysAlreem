package SingleResponcibliltyDesignPrinciple;

public class Section {
private String sectionName;
private String sectionDescription;

public String getSectionName() {
	return sectionName;
}
public void setSectionName(String sectionName) {
	this.sectionName = sectionName;
}
public String getSectionDescription() {
	return sectionDescription;
}
public void setSectionDescription(String sectionDescription) {
	this.sectionDescription = sectionDescription;
}
@Override
public String toString() {
	
	return "\nStore section name :"+getSectionName()+"\nStore section Description :"+getSectionDescription();
}

}
