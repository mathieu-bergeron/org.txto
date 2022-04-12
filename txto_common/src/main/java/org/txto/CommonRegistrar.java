package org.txto;

import ca.ntro.app.frontend.events.EventRegistrar;
import ca.ntro.app.models.ModelRegistrar;
import org.txto.models.values.Card;

public class CommonRegistrar {

	public static void registerModels(ModelRegistrar registrar) {
		registrar.registerValue(Card.class);
	}

	public static void registerEvents(EventRegistrar registrar) {
		
	}

}
