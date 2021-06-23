package DTO;

public class Colony extends Organization {
        private String land;
        private String ocean;
        private int Colony;

    public Colony(String land, String ocean, int Colony, int size, String Organization) {
        super(size, Organization);
        this.land = land;
        this.ocean = ocean;
        this.Colony = Colony;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getOcean() {
        return ocean;
    }

    public void setOcean(String ocean) {
        this.ocean = ocean;
    }

    public int getColony() {
        return Colony;
    }

    public void setColony(int Colony) {
        this.Colony = Colony;
    }

        @Override
    public void communicateByTool() {
        System.out.println("the colony communicate by sound");
    }

    public void grow() {
        System.out.println("an annual cycle of growth that begins in spring");
    }
        
    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        return "Colony{" + "land=" + land + ", ocean=" + ocean + ", Colony=" + Colony + '}';
    }
}  