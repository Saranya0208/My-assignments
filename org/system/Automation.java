package org.system;

public class Automation extends Multilang  {

	@Override
	public void javaLang() {
		System.out.println("MultiLang: Java");

	}

	@Override
	public void SeleniumLang() {
		System.out.println("MultiLang: Selenium");

	}
	public static void main(String[] args) {
		Automation aut = new Automation();
		aut.javaLang();
		aut.python();
		aut.ruby();
		aut.SeleniumLang();
	}

}