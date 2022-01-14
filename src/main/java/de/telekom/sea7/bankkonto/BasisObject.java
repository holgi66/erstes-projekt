package de.telekom.sea7.bankkonto;

public class BasisObject {
	private int id;
	private Object parent;
	
	public BasisObject(int id, Object parent) {
		this.id = id; // this bezieht sich auf die Variablen der Instanz
		this.parent = parent;
	}
	
	public String objectToString() {
		return super.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Object getParent() {
		return parent;
	}
}
