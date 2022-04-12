package org.txto;

import ca.ntro.app.frontend.events.EventRegistrar;
import ca.ntro.app.models.ModelRegistrar;
import org.txto.models.values.Paragraph;

public class CommonRegistrar {

	public static void registerModels(ModelRegistrar registrar) {
		registrar.registerValue(Paragraph.class);
	}

	public static void registerEvents(EventRegistrar registrar) {
		
	}

}
