package api.server.constraint.inf;

import org.hibernate.validator.internal.engine.path.PathImpl;
import org.springframework.beans.factory.InitializingBean;

import javax.validation.ConstraintViolation;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public interface SetDefault<A extends Annotation, T> extends InitializingBean {

    <B> void setDefault(ConstraintViolation<B> tConstraintViolation, A annotation) throws Exception;

    Class<A> getAnnotation();

    default <B> void invokeSetFieldValue(ConstraintViolation<B> tConstraintViolation, T fieldType) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        B rootBean = tConstraintViolation.getRootBean();
        PathImpl propertyPath = (PathImpl) tConstraintViolation.getPropertyPath();
        String fieldName = propertyPath.toString();
        String methodName = "set" + fieldName.replaceFirst(fieldName.charAt(0) + "", (fieldName.charAt(0) + "").toUpperCase());
        Method method = rootBean.getClass().getMethod(methodName, fieldType.getClass());
        method.invoke(rootBean, fieldType);
    }

}
