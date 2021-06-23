/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

public interface Role {
    public void createWorker();
}

public class FPTUniversity extends University {
    private String address;
    private int FPTUniversity;

    public FPTUniversity(String address, int FPTUniversity, String name, int University, int size, String Organization) {
        super(name, University, size, Organization);
        this.address = address;
        this.FPTUniversity = FPTUniversity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFPTUniversity() {
        return FPTUniversity;
    }

    public void setFPTUniversity(int FPTUniversity) {
        this.FPTUniversity = FPTUniversity;
    }
    
    
    public String toString(){
        return "FPTU has four cammpuses Hanoi, HCM, CanTho, QuyNhon";
    }
    
    public void createWorker(){
        System.out.println("providing human resources");
    }
}
