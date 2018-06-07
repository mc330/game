package api.server.constraint.inf.impl;

import api.server.constraint.annotation.DefaultString;
import api.server.constraint.inf.SetDefault;

import javax.validation.ConstraintViolation;

/**
 * Set default {@link String} value for {@Code field} annotated by {@link DefaultString}
 */
public class SetDefaultString implements SetDefault<DefaultString, String> {

    @Override
    public <B> void setDefault(ConstraintViolation<B> tConstraintViolation, DefaultString annotation) throws Exception {
        String value = annotation.value();
        invokeSetFieldValue(tConstraintViolation, value);
    }

    @Override
    public Class<DefaultString> getAnnotation() {
        return DefaultString.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
    }
}
