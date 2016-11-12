package io.swagger.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="StatusExt")
@XmlEnum(StatusExtValid.class)
public enum StatusExtValid {

    @XmlEnumValue("placed") PLACED(String.valueOf("placed")), @XmlEnumValue("approved") APPROVED(
            String.valueOf("approved")), @XmlEnumValue("delivered") DELIVERED(String.valueOf("delivered"));


    private String value;

    StatusExtValid(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusExtValid fromValue(String v) {
        for (StatusExtValid b : StatusExtValid.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

