package com.example.demo;
@Document(collection="Patient")
public class Patient

{  @Id
    private string id;
    private string name;
    private string age;
    public Patient(){}


    public Patient(string name, string age) {
        this.name = name;
        this.age = age;
    }
    public string getId() {
        return id;
    }

    public void setId(string id) {
        this.id = id;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;

    }

    public string getAge() {
        return age;
    }

    public void setAge(string age) {
        this.age = age;
    }
}