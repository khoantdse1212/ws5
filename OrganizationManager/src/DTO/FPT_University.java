package DTO;
/**
 *
 * @author KhoaKandy
 */
public class FPT_University extends University implements Role {
    private String address;

    public FPT_University(String address, String name, int size) {
        super(name, size);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "FPTU has four cammpuses Hanoi, HCM, CanTho, QuyNhon";
    }
   
    @Override
    public void createWorker(){
        System.out.println("providing human resources");
    }
}