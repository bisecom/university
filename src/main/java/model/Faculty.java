package model;

import java.util.Objects;

public class Faculty {
    private int id;
    private String name;
    private int budgetPlacesQty;
    private int totalPlacesQty;
    private int firstSubjectId;
    private int secondSubjectId;
    private int thirdSubjectId;

    public Faculty(){}
    public Faculty(int id, String name, int budgetPlacesQty, int totalPlacesQty,
                   int firstSubjectId, int secondSubjectId, int thirdSubjectId){
        this.id = id;
        this.name = name;
        this.budgetPlacesQty = budgetPlacesQty;
        this.totalPlacesQty = totalPlacesQty;
        this.firstSubjectId = firstSubjectId;
        this.secondSubjectId = secondSubjectId;
        this.thirdSubjectId = thirdSubjectId;
    }
    public Faculty(String name, int budgetPlacesQty, int totalPlacesQty,
                   int firstSubjectId, int secondSubjectId, int thirdSubjectId){
        this.name = name;
        this.budgetPlacesQty = budgetPlacesQty;
        this.totalPlacesQty = totalPlacesQty;
        this.firstSubjectId = firstSubjectId;
        this.secondSubjectId = secondSubjectId;
        this.thirdSubjectId = thirdSubjectId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudgetPlacesQty() {
        return budgetPlacesQty;
    }

    public void setBudgetPlacesQty(int budgetPlacesQty) {
        this.budgetPlacesQty = budgetPlacesQty;
    }

    public int getTotalPlacesQty() {
        return totalPlacesQty;
    }

    public void setTotalPlacesQty(int totalPlacesQty) {
        this.totalPlacesQty = totalPlacesQty;
    }

    public int getFirstSubjectId() {
        return firstSubjectId;
    }

    public void setFirstSubjectId(int firstSubjectId) {
        this.firstSubjectId = firstSubjectId;
    }

    public int getSecondSubjectId() {
        return secondSubjectId;
    }

    public void setSecondSubjectId(int secondSubjectId) {
        this.secondSubjectId = secondSubjectId;
    }

    public int getThirdSubjectId() {
        return thirdSubjectId;
    }

    public void setThirdSubjectId(int thirdSubjectId) {
        this.thirdSubjectId = thirdSubjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return id == faculty.id &&
                budgetPlacesQty == faculty.budgetPlacesQty &&
                totalPlacesQty == faculty.totalPlacesQty &&
                firstSubjectId == faculty.firstSubjectId &&
                secondSubjectId == faculty.secondSubjectId &&
                thirdSubjectId == faculty.thirdSubjectId &&
                name.equals(faculty.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, budgetPlacesQty, totalPlacesQty, firstSubjectId, secondSubjectId, thirdSubjectId);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", budgetPlacesQty=" + budgetPlacesQty +
                ", totalPlacesQty=" + totalPlacesQty +
                ", firstSubjectId=" + firstSubjectId +
                ", secondSubjectId=" + secondSubjectId +
                ", thirdSubjectId=" + thirdSubjectId +
                '}';
    }
}
