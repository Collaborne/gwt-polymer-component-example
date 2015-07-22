package com.collaborne.hello.client;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsType;

@JsExport
@JsType
public class HelloWorldPresenter implements HelloWorldInterface {

	public HelloWorldPresenter() {
		
	}

	@Override
	public String sayHello(String name) {
		return name + ", Hello World!";
	}

}
