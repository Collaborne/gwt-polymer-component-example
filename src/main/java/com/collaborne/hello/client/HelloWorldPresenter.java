package com.collaborne.hello.client;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsType;

@JsExport
@JsType
public class HelloWorldPresenter {

	public String sayHello(String name) {
		return name + ", Hello World!";
	}

}
