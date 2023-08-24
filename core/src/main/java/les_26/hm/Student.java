package les_26.hm;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private int numberGroup;
    private Address address;
    private Contact contactInfo;

    private List<Subject> favoriteSubjects;


    public Student(String name, String surname, int numberGroup, Address address, Contact contactInfo, List<Subject> favoriteSubjects) {
        this.name = name;
        this.surname = surname;
        this.numberGroup = numberGroup;
        this.address = address;
        this.contactInfo = contactInfo;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;


    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Contact contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Subject> getFavoriteSubjects() {
        return favoriteSubjects;
    }

    public void setFavoriteSubjects(List<Subject> favoriteSubjects) {
        this.favoriteSubjects = favoriteSubjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numberGroup == student.numberGroup && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(address, student.address) && Objects.equals(contactInfo, student.contactInfo) && Objects.equals(favoriteSubjects, student.favoriteSubjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, numberGroup, address, contactInfo, favoriteSubjects);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberGroup=" + numberGroup +
                ", address=" + address +
                ", contactInfo=" + contactInfo +
                ", favoriteSubjects=" + favoriteSubjects +
                '}';
    }
}
