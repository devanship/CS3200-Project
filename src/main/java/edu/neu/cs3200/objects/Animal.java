package edu.neu.cs3200.objects;

public class Animal {
    private String animalId;
    private String animalName;
    private String dateDischarged;
    private String outcomeType;
    private String outcomeSubtype;
    private String sex;
    private String age;
    private String animalType;
    private String color;

    public Animal(){

    }

    public Animal(String animalId, String animalName, String dateDischarged, String outcomeType,
                  String outcomeSubtype, String sex, String age, String animalType, String color) {
        this.animalId = animalId;
        this.animalName = animalName;
        this.dateDischarged = dateDischarged;
        this.outcomeType = outcomeType;
        this.outcomeSubtype = outcomeSubtype;
        this.sex = sex;
        this.age = age;
        this.animalType = animalType;
        this.color = color;
    }

    public String getAnimalId() {
        return animalId;
    }

    public void setAnimalId(String animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getDateDischarged() {
        return dateDischarged;
    }

    public void setDateDischarged(String dateDischarged) {
        this.dateDischarged = dateDischarged;
    }

    public String getOutcomeType() {
        return outcomeType;
    }

    public void setOutcomeType(String outcomeType) {
        this.outcomeType = outcomeType;
    }

    public String getOutcomeSubtype() {
        return outcomeSubtype;
    }

    public void setOutcomeSubtype(String outcomeSubtype) {
        this.outcomeSubtype = outcomeSubtype;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
