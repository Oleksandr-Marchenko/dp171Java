package com.softserve.elementaryTasks.validation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                TriangleValidationTest.class,
                NumberAsTextValidation.class
        })
public class AllValidationTest {

}
