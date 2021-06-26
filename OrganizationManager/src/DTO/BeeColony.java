package DTO;
/**
 *
 * @author KhoaKandy
 */
public class BeeColony extends Colony implements Role {
    private String type ;
    
    public BeeColony(String type, String place, int size) {
        super(place, size);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "the colony’s type is  " +type+", size about " + size + ",and the place field " + place +"";
    }
    @Override
    public void createWorker(){
        System.out.println("Worker bees perform all the work of the bees");
    }
}