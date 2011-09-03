package com.bigshoulders.webapp;

public class PMaker {
	private String info="";
	public PMaker(){
		
	}
	public void setP(String info){
		this.info=info;
	}
	public String makeP(){
		return "<p>"+info+"</p>";
	}

}
