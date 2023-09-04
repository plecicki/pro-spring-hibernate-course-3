package com.kodilla.tasklist;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateMinValidator implements ConstraintValidator<DateMin, LocalDate> {

    private String annotationValue;

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        LocalDate minDate = LocalDate.parse(annotationValue, DateTimeFormatter.ISO_DATE);
        return value.isAfter(minDate);
    }

    @Override
    public void initialize(DateMin constraintAnnotation) {
        annotationValue = constraintAnnotation.value();
    }
}
