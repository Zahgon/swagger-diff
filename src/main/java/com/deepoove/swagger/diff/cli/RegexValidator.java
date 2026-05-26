package com.deepoove.swagger.diff.cli;

import java.lang.reflect.Field;
import java.util.regex.Pattern;
import com.beust.jcommander.IParameterValidator2;
import com.beust.jcommander.ParameterDescription;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.Parameterized;

public class RegexValidator implements IParameterValidator2 {

    private static final String PARAMETERIZED_FIELD_NAME = "field";

    @Override
    public void validate(String name, String value) throws ParameterException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void validate(String name, String value, ParameterDescription pd) throws ParameterException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
