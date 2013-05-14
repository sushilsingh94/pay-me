package com.github.jberkel.payme.model;

import java.util.Locale;

public enum ItemType {
    INAPP,
    SUBS,
    UNKNOWN;

    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }

    public static ItemType fromString(String type) {
        for (ItemType t : values()) {
            if (t.toString().equals(type)) return t;
        }
        return UNKNOWN;
    }
}
