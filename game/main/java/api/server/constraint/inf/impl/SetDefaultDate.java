package api.server.constraint.inf.impl;


import api.server.constraint.annotation.DefaultDate;
import org.apache.commons.lang3.StringUtils;
import api.server.constraint.inf.SetDefault;

import javax.validation.ConstraintViolation;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Set default {@link Date} value for {@Code field} annotated by {@link DefaultDate}
 */
public class SetDefaultDate implements SetDefault<DefaultDate, Date> {

    @Override
    public <B> void setDefault(ConstraintViolation<B> tConstraintViolation, DefaultDate annotation) throws Exception {
        String value = annotation.value();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = StringUtils.isBlank(value) ? new Date() : dateFormat.parse(value);
        invokeSetFieldValue(tConstraintViolation, date);
    }

    @Override
    public Class<DefaultDate> getAnnotation() {
        return DefaultDate.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
    }
}
