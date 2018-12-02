package com.ddlab.rnd.axis2.ws;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.ddlab.rnd.axis2.stub.SimplewebserviceStub;
import com.ddlab.rnd.axis2.stub.SimplewebserviceStub.GetName;
import com.ddlab.rnd.axis2.stub.SimplewebserviceStub.GetNameResponse;

public class WebserviceExecuter 
{
	public static void executeWS()
	{
		try 
		{
			String endPoint = "http://localhost:8080/simplewebservice/services/simplewebservice?wsdl";
			SimplewebserviceStub wsStub = new SimplewebserviceStub(endPoint);
			GetName getName = new GetName();
			getName.setName("My First Webservice Testing through Axis2 Client Stub . ");
			GetNameResponse getNameResponse = wsStub.getName(getName);
			String responseStr = getNameResponse.get_return();
			System.out.println(responseStr);
		}
		catch (AxisFault e) 
		{
			e.printStackTrace();
		} 
		catch (RemoteException e) 
		{
			e.printStackTrace();
		}
	}
}
