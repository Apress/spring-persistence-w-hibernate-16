package com.apress.springpersistence.audiomanager.core.domain.components;

import com.apress.springpersistence.audiomanager.core.domain.Thing;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by pfisher on 9/30/14.
 */
@Embeddable
public class QuantitativeValue {


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
