/*
 * Decompiled with CFR 0_110.
 */
package com.java8.service;

public class Color {
    private String color;

    public Color() {
    }

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = 31 * result + (this.color == null ? 0 : this.color.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Color other = (Color)obj;
        if (this.color == null ? other.color != null : !this.color.equals(other.color)) {
            return false;
        }
        return true;
    }
}

