package openCloseDesignPrinciple;

public class Client {

	public static void main(String[] args) {
eskanBankATM eskanBankATM =new eskanBankATM();
operation WithdrawMoney=new Withdraw();
operation DepositMoney=new Deposit();
eskanBankATM.getOperation(WithdrawMoney);
eskanBankATM.getOperation(DepositMoney);
	}

}
