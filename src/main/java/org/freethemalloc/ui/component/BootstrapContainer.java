package org.freethemalloc.ui.component;

public class BootstrapContainer {

	private String container = "";
	private String component = "";
	
	public String getContainer() {
		return container;
	}
	
	public void setContainer(){
		this.container = "<div class=\"container\">"+this.component+"</div>";
	}
	
	public void appendComponent(String component){
		this.component += component;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.container;
	}
}
