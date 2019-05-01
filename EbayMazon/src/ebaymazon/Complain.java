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
public class Complain {
    int buyerid;
    int sellerid;
    String complaint;
    
    public Complain(int buyerid, int sellerid, String complaint){
        this.buyerid=buyerid;
        this.sellerid=sellerid;
        this.complaint=complaint;
    }
    public int getBuyerID(){
        return buyerid;
    }
    
    public void setBuyerID(int buyerid){
        this.buyerid=buyerid;
    }
    
    public int getSellerID(){
        return sellerid;
    }
    
    public void setSellerID(int sellerid){
        this.sellerid=sellerid;
    }
    
    public String getComplaint(){
        return complaint;
    }
    
    public void setComplaint(String complaint){
        this.complaint=complaint;
    }
    
}
