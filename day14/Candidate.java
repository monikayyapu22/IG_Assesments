package day14;

public class Candidate {

    private String name;
    private String expertise;
    private String city;
    private int experience;

    public Candidate(String name, String expertise, String city, int experience) {
        this.name = name;
        this.expertise = expertise;
        this.city = city;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getExpertise() {
        return expertise;
    }

    public String getCity() {
        return city;
    }

    public int getExperience() {
        return experience;
    }
}
