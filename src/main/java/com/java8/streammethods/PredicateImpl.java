/*
 * Decompiled with CFR 0_110.
 */
package com.java8.streammethods;

import com.java8.streammethods.PredicateInt;

public class PredicateImpl
implements PredicateInt {
    @Override
    public boolean compare(int value) {
        if (value > 3) {
            return true;
        }
        return false;
    }
}

