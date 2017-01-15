package us.coastalhacking.semiotics.xcore.model.service;

import java.util.Collection;

public interface Transformer {

	Collection<?> transform(Collection<?> sources, Object target);

	boolean isTransformable(Collection<?> sources, Object target);
	
	boolean isSourceSupported(Collection<?> sources);
	
	boolean isTargetSupported(Object target);
}
