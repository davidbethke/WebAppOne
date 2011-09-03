package com.bigshoulders.webapp;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.HttpSessionStore;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.session.ISessionStore;

public class WicketApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return HomePage.class;
	}
	protected void init(){
		getResourceSettings().setResourcePollFrequency(null);
	}
	protected ISessionStore newSessionStore(){
		return new HttpSessionStore(this);
	}
}
