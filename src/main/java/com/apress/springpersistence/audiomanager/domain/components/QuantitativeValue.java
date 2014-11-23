package com.apress.springpersistence.audiomanager.domain.components;

import com.apress.springpersistence.audiomanager.domain.Thing;

import javax.persistence.Embeddable;

/**
 * Created by pfisher on 9/30/14.
 */
@Embeddable
public class QuantitativeValue extends Thing {
    private Integer maxValue;
    private Integer minValue;
    private String unitCode;
    private Number value;
    private String valueReference;

    public Integer getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    public Integer getMinValue() {
        return minValue;
    }

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    public String getValueReference() {
        return valueReference;
    }

    public void setValueReference(String valueReference) {
        this.valueReference = valueReference;
    }
}
