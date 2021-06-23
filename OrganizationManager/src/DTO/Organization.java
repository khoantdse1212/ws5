/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

public abstract class Organization{
    private int size;
    private String Organization;

    public Organization(int size, String Organization) {
        this.size = size;
        this.Organization = Organization;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }
    public abstract void communicateByTool(){
    }
    @Override
    public String toString() {
        return "Organization{" + "size=" + size + ", Organization=" + Organization + '}';
    }
}
   
    
    


