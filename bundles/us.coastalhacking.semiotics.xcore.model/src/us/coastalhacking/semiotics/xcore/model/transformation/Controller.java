package us.coastalhacking.semiotics.xcore.model.transformation;

import java.util.Collection;

public interface Controller {

	Collection<?> transform(Object source, Object target);
}
