package com.softserve.elementaryTasks.validation;

import java.util.List;

public interface ArgsValidator<T> {

    boolean validate(T argument);
}
