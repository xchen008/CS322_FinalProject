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
public class Bid {
    int userid;
    int price; 
   
    public Bid(int userid, int price){
        this.userid=userid;
        this.price=price;
    }
    
    public int getUserID(){
        return userid;
    }
    
    public void setUserID(int userid){
        this.userid=userid;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int price){
        this.price=price;
    }
    
}
