package com.exadel.easyabac.demo.security.model.project;

import com.exadel.easyabac.demo.security.validator.DemoValidator;
import com.exadel.easyabac.model.annotation.Access;
import com.exadel.easyabac.model.validation.EntityAccessValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Example of ABAC annotation to restrict project entity access.
 * This annotation will be placed to controllers or services to enable protection.
 *
 * @author Gleb Bondarchuk
 * @since 1.0-RC1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Access(identifier = ProjectId.class)
public @interface ProjectAccess {

    ProjectAction[] value();

    Class<? extends EntityAccessValidator> validator() default DemoValidator.class;
}
