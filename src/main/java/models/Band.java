package models;

import java.util.Objects;

public class Band {
    private String name;
    private Integer members;

    public Band() {

    }
    public Band(String name, Integer members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Band band = (Band) o;
        return Objects.equals(name, band.name) &&
                Objects.equals(members, band.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, members);
    }
}
