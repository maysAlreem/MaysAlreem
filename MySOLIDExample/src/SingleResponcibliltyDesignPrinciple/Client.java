package SingleResponcibliltyDesignPrinciple;

public class Client {

	public static void main(String[] args) {
		Store myStore=new Store();
		myStore.setName("Family Store");
		myStore.setDescriptin("Store has all family and home needed ");
	    Section PlantSections=new Section();
		PlantSections.setSectionName("Plants");
		PlantSections.setSectionDescription("plants section has all type of plants");
		
		Section furntureSections=new Section();
		furntureSections.setSectionName("furnture");
		furntureSections.setSectionDescription("furnture section has all type of furnture");
		//myStore.setStoreSection(PlantSections);
		myStore.allSections.add(PlantSections); 
		//myStore.setStoreSection(furntureSections);
		myStore.allSections.add(furntureSections);
	    System.out.print(myStore);	
	
	}

}
