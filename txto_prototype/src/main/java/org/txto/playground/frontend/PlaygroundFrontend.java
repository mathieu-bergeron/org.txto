package org.txto.playground.frontend;

import ca.ntro.app.frontend.FrontendFx;
import ca.ntro.app.frontend.ViewRegistrarFx;
import ca.ntro.app.frontend.events.EventRegistrar;
import ca.ntro.app.tasks.frontend.FrontendTasks;
import org.txto.CommonRegistrar;
import org.txto.playground.frontend.views.PlaygroundRootView;
import org.txto.playground.frontend.views.PlaygroundTableTopView;

public class PlaygroundFrontend implements FrontendFx {

	@Override
	public void registerEvents(EventRegistrar registrar) {
		CommonRegistrar.registerEvents(registrar);

	}

	@Override
	public void registerViews(ViewRegistrarFx registrar) {
		
		registrar.registerView(PlaygroundRootView.class, "/root.xml");
		registrar.registerView(PlaygroundTableTopView.class, "/table_top.xml");
	}

	@Override
	public void createTasks(FrontendTasks tasks) {
		
	}

	@Override
	public void execute() {
		
	}

}
