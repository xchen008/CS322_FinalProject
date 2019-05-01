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
public class Item {
    
    //submit bid should be here, we can have an array of user's bid
    Bid[] allbid = new Bid[10];
    int seller;
    int buyer;
    int time;
    // not sure if this is the class for new item information?
    //if not, I think we need a new class for new item info.
    String[] key_words; //maybe we can have an array with key words for the user to choose from
    private String title;
    private int fixed_price;
    public Item(String title, int fixed_price){
        this.title=title;
        this.fixed_price=fixed_price;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public int getFixed_price(){
        return fixed_price;
    }
    public void setFixed_price(int price){
        this.fixed_price=fixed_price;
    }
}
