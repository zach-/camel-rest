package com.tsa.puridiom.rq.router;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

import com.tsa.puridiom.cm.message.ServiceData;

	/**
	 * @author Zach Bricker
	 */

@Component
public class SampleRESTRoute  {

	public ServiceData execute(Exchange exchange) {
		System.out.println("Logging from Execute ");
		return new ServiceData();
	}
	
	public ServiceData get(ServiceData serviceData) {
		System.out.println("Logging from get method ");
		return serviceData;
	}
	
	public ServiceData post(ServiceData serviceData) {
		System.out.println("Logging from post method ");
		return serviceData;
	}
	
	public ServiceData put(ServiceData serviceData) {
		System.out.println("Logging from put method ");
		return serviceData;
	}
	
	public ServiceData delete(ServiceData serviceData) {
		System.out.println("Logging from delete method ");
		return serviceData;
	}
}
