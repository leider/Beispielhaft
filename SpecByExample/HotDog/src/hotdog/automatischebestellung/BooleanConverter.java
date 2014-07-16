package hotdog.automatischebestellung;

import fitnesse.slim.Converter;


public class BooleanConverter implements Converter<Boolean> {

	@Override
	public Boolean fromString(String arg) {
		return arg.equals("ja");
	}

	@Override
	public String toString(Boolean arg) {
		return arg ? "ja" : "nein";
	}
	
}
