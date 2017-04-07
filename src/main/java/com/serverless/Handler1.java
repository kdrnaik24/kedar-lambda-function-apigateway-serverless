package com.serverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler1 implements RequestHandler<String, ApiGatewayResponse>
{

	@Override
	public ApiGatewayResponse handleRequest(String string, Context arg1) 
	{
		string = string +50;
		GetFunction fun = new GetFunction(string);
		return ApiGatewayResponse.builder()
				.setObjectBody(fun)
				.build();
		

	}

}
