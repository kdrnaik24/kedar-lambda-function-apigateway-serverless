package com.serverless;

import com.serverless.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Map<String, Object>, ApiGatewayResponse>
{

	@Override
	public ApiGatewayResponse handleRequest(Map<String, Object> input, Context arg1) 
	{
		Map<String, Object> map = input;
		
		System.out.println(input.toString());
		Response response = new Response("This is the input from user", input);

		return ApiGatewayResponse.builder()
		.setObjectBody(response)
		.build();
	}
	
}
	
	
	


	
	



	

	

