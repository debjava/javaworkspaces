package com.design.pattern.decorator.type2;
public class EmailSender
{
	public void sendEmail(IEmail email)
	{
		//read the email to-address, to see if it's going outside of the company
		//if so decorate it 
		IEmail external = new ExternalEmailDecorator(email);
		System.out.println(external.getContents());
		//send 
	}

	public static void main(String[] args) {
		EmailSender mail = new EmailSender();
		IEmail email1 = new Email("ssadasds");
		mail.sendEmail(email1);
	}
}