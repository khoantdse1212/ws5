package DTO;

/**
 *
 * @author KhoaKandy
 */
public class Colony extends Organization {

    protected String place;

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void grow() {
        System.out.println("“an annual cycle of growth that begins in spring");
    }

    public void reproduce() {
        System.out.println("“Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        return "the colony's size is " + size + ",and the place field " + place + "";
    }

    @Override
    public void communicateByTool() {
        System.out.println("“the colony communicate by sound");
    }

}
