package us.coastalhacking.semiotics.xcore.model.service;

import java.util.Collection;

public interface Controller {

	Collection<?> transform(Object source, Object target);
	
	boolean isSourceSupported(Object source);
	
	boolean isTargetSupported(Object target);
}
