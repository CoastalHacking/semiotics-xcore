package us.coastalhacking.semiotics.xcore.model.service;

import java.util.Collection;

public interface Converter {

	Collection<?> convert(Object source);
	
	boolean isConvertible(Object source);
}
