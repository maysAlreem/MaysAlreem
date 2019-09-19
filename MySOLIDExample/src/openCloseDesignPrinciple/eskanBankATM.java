package openCloseDesignPrinciple;

public class eskanBankATM implements ATM{

	@Override
	public void getOperation(operation ClienOp) {
		ClienOp.doOperation();
		
	}

}
