/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebaymazon;


/**
 *
 * @author XueruChen
 */
public class Application {
    private int id;
    private String name;
    private String address;
    private String phone_number;
    private String credit_card;
    
    public Application(int id, String name, String address, String phone_number, String credit_card){
        this.id=id;
        this.name=name;
        this.address=address;
        this.phone_number=phone_number;
        this.credit_card=credit_card;
    }
    
    public int getID(){
        return id;
    }
    
    public void setID(int id){
        this.id=id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address=address;
    }
    
    public String getPhoneNumber(){
        return phone_number;
    }
    
    public void setPhoneNumber(String phone_number){
        this.phone_number=phone_number;
    }
    
    public String getCreditCard(){
        return credit_card;
    }
    
    public void setCreditCard(String credit_card){
        this.credit_card=credit_card;
    }
    
}
