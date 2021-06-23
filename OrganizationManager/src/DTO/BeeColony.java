/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

public interface Role {
    public void createWorker();
}

public class BeeColony extends Colony {
    private String honey;
    private String wasp;
    private int BeeColony;

    public BeeColony(String honey, String wasp, int BeeColony, String land, String ocean, int Colony, int size, String Organization) {
        super(land, ocean, Colony, size, Organization);
        this.honey = honey;
        this.wasp = wasp;
        this.BeeColony = BeeColony;
    }

    public String getHoney() {
        return honey;
    }

    public void setHoney(String honey) {
        this.honey = honey;
    }

    public String getWasp() {
        return wasp;
    }

    public void setWasp(String wasp) {
        this.wasp = wasp;
    }

    public int getBeeColony() {
        return BeeColony;
    }

    public void setBeeColony(int BeeColony) {
        this.BeeColony = BeeColony;
    }

    @Override
    public String toString() {
        return "BeeColony{" + "honey=" + honey + ", wasp=" + wasp + ", BeeColony=" + BeeColony + '}';
    }
    
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }
}
   