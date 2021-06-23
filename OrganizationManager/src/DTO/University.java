package DTO;

public class University extends Organization{
    private String name;
    private int University;

    public University(String name, int University, int size, String Organization) {
        super(size, Organization);
        this.name = name;
        this.University = University;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniversity() {
        return University;
    }

    public void setUniversity(int University) {
        this.University = University;
    }

    
    public void commnicateByTool(){
        System.out.println("in the university, people communicate by voice");       
    }
    
    public void enroll(){
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
    }
    
    public void educate(){
        System.out.println("provide education at university standard");
    }

    @Override
    public String toString() {
        return "encourage the advancement and development of knowledge";
    }
    
}
