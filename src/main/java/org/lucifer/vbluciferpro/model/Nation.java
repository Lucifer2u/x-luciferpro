package org.lucifer.vbluciferpro.model;

import java.util.Objects;

public class Nation {
    private Integer id;

    private String name;

    public Nation() {
    }

    public Nation(String name) {

        this.name = name;
    }

    //只用name来判断，不使用id（按理来说应该id和name都一致）
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Nation nation = (Nation) o;
        return Objects.equals(name, nation.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}