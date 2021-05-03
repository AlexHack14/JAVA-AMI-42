package com.lnu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Classes {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n;
    String name;
    int yearOfFoundation;
    int accreditation;
    int amountOfFaculties;
    System.out.println("Input n(amount universities):");
    n = Integer.parseInt(scanner.nextLine());

    List<University> universities = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      System.out.println("i = " + (i + 1));
      System.out.println("Input name: ");
      name = scanner.nextLine();
      System.out.println("Input yearOfFoundation: ");
      yearOfFoundation = Integer.parseInt(scanner.nextLine());
      System.out.println("Input accreditation: ");
      accreditation = Integer.parseInt(scanner.nextLine());
      System.out.println("Input amountOfFaculties: ");
      amountOfFaculties = Integer.parseInt(scanner.nextLine());
      universities.add(new University(name, yearOfFoundation, accreditation, amountOfFaculties));
    }

    System.out.println("Output universities that has more then 10 faculty");
    for (int i = 0; i < universities.size(); i++) {
      if(universities.get(i).getAmountOfFaculties() > 10) {
        System.out.println(universities.get(i));
      }
    }
  }
}


class University {

  private  String name;
  private  int yearOfFoundation;
  private  int accreditation;
  private  int amountOfFaculties;

  public University() {
    this.name = "LNU";
    this.yearOfFoundation = 1661;
    this.accreditation = 4;
    this.amountOfFaculties = 19;
  }

  public University(String name, int yearOfFoundation, int accreditation, int amountOfFaculties) {
    this.name = name;
    this.yearOfFoundation = yearOfFoundation;
    this.accreditation = accreditation;
    this.amountOfFaculties = amountOfFaculties;
  }

  public University(University university) {
    this.name = university.name;
    this.yearOfFoundation = university.yearOfFoundation;
    this.accreditation = university.accreditation;
    this.amountOfFaculties = university.amountOfFaculties;
  }

  public boolean isLNU() {
    University university = new University();
    return this.equals(university);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setYearOfFoundation(int yearOfFoundation) {
    this.yearOfFoundation = yearOfFoundation;
  }

  public void setAccreditation(int accreditation) {
    this.accreditation = accreditation;
  }

  public void setAmountOfFaculties(int amountOfFaculties) {
    this.amountOfFaculties = amountOfFaculties;
  }

  public String getName() {
    return name;
  }

  public int getYearOfFoundation() {
    return yearOfFoundation;
  }

  public int getAccreditation() {
    return accreditation;
  }

  public int getAmountOfFaculties() {
    return amountOfFaculties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    University that = (University) o;
    return yearOfFoundation == that.yearOfFoundation &&
        accreditation == that.accreditation &&
        amountOfFaculties == that.amountOfFaculties &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, yearOfFoundation, accreditation, amountOfFaculties);
  }

  @Override
  public String toString() {
    return "University{" +
        "name='" + name + '\'' +
        ", yearOfFoundation=" + yearOfFoundation +
        ", accreditation=" + accreditation +
        ", amountOfFaculties=" + amountOfFaculties +
        '}';
  }
}