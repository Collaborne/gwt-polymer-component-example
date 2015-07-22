package com.collaborne.hello.client;

import com.google.gwt.core.client.EntryPoint;

public class HelloEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		onModuleReady();
	}

	private native void onModuleReady() /*-{
		if ($wnd.onGwtReady()) {
			$wnd.onGwtReady();
		}
	}-*/;

}
