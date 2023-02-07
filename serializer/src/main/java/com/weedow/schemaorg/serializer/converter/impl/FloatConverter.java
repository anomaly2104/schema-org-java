package com.weedow.schemaorg.serializer.converter.impl;

import com.weedow.schemaorg.commons.model.JsonLdDataType;

public class FloatConverter extends AbstractConverter {

    public static final FloatConverter INSTANCE = new FloatConverter();

    private FloatConverter() {
    }

    @Override
    @SuppressWarnings("java:S1872")
    public boolean supports(Class<? extends JsonLdDataType<?>> jsonLdDataType, Class<?> targetType) {
        return (Number.class.isAssignableFrom(targetType) || String.class.isAssignableFrom(targetType)) && jsonLdDataType.getSimpleName().equals("Float");
    }

    @Override
    public Float getValue(Object source) {
        return source instanceof Float ? (Float) source : Float.valueOf(source.toString());
    }
}
