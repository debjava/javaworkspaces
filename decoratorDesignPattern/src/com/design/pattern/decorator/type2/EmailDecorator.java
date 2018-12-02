package com.design.pattern.decorator.type2;
public abstract class EmailDecorator implements IEmail
{
   //wrapped component
   IEmail originalEmail;
   
   @Override
	public String getContents() {
		return originalEmail.getContents();
	}
}