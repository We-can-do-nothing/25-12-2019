package com.cqjtu.pojo;

import java.io.Serializable;
import java.util.Objects;

/**
 * 将数据包装成对象
 */
public class FirstHomework implements Serializable {

    private Integer id;
    private String name;
    private String password;
    private String gender;
    private Double salary;

    public FirstHomework(Integer id, String name, String password, String gender, Double salary) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.salary = salary;
    }

    public FirstHomework() {
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
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirstHomework that = (FirstHomework) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(password, that.password) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, gender, salary);
    }

    @Override
    public String toString() {
        return "FirstHomework{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
