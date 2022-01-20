package de.telekom.sea7.bankkonto2;

import de.telekom.sea7.bankkonto2.BaseObject;
import de.telekom.sea7.bankkonto2.Transactions;
import de.telekom.sea7.bankkonto2.TransactionsView;

public class Application extends BaseObject {
	
	public Application(Object parent) {
		super(parent);
	}
	
	public void run() {
		Transactions model = new Transactions();
		
		TransactionsView view = new TransactionsView(this, model);
		view.menu();	
	}
}