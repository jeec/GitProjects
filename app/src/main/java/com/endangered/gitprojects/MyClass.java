package com.endangered.gitprojects;

import java.util.Objects;

/**
 * @author:jiyc
 * @date:2021/9/25
 */
class MyClass {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyClass)) return false;
        MyClass myClass = (MyClass) o;
        return name.equals(myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
