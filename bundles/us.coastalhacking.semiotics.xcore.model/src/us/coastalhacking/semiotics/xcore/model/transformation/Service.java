package us.coastalhacking.semiotics.xcore.model.transformation;

import java.util.Collection;

public interface Service {

	Collection<?> transform(Object source, Object target);

	boolean isTransformable(Object source, Object target);
	
	boolean isSourceSupported(Object source);
}
