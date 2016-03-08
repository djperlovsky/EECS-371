package eecs371FinalProject;

import com.cyc.kb.Context;
import com.cyc.kb.ContextFactory;
import com.cyc.kb.KbCollection;
import com.cyc.kb.KbCollectionFactory;
import com.cyc.kb.KbIndividual;
import com.cyc.kb.KbIndividualFactory;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.KbTypeException;

public class TestClass {
	public static void main(String[] args) throws KbTypeException, CreateException
	{
		KbCollection actorsInMovies = KbCollectionFactory.findOrCreate("ActorInMovies");
		actorsInMovies.addGeneralization("Person");
		Context peopleDataMt = ContextFactory.get("PeopleDataMt");
		KbIndividual nicholson = 
		  KbIndividualFactory.findOrCreate("JackNicholson", actorsInMovies, peopleDataMt);	
	}
}
