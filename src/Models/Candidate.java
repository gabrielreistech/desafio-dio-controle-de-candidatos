package Models;

public class Candidate {

    private String name;
    private String address;
    private Double salaryIntention;

    public Candidate(){}

    public Candidate(String name, String address, Double salaryIntention) {
        this.name = name;
        this.address = address;
        this.salaryIntention = salaryIntention;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalaryIntention() {
        return salaryIntention;
    }

    public void setSalaryIntention(Double salaryIntention) {
        this.salaryIntention = salaryIntention;
    }

    @Override
    public String toString() {
        return "name: " + name + '\'' +
                ", address: " + address + '\'' +
                ", salaryIntention: " + salaryIntention + " --- ";
    }
}
