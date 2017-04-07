package com.serverless;

public class GetFunction 
{
	private String str;

	public GetFunction(String str) 
	{
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "GetFunction [str=" + str + "]";
	}
	
	
	
}
