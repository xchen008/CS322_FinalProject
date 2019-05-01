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
public class SupUser {
    
    String[] TabooList = {"money", "jail", "gang"};
    int[] VIP = new int[100];
    int[] Applist = new int[100];
    private void processApp()
    {
    
    //process application list
    
    }
    Item[] itemapp = new Item[100];
    
    private void processItem()
    {
    //accept or reject new item information
    
    }
    
    Complain[] Complain_list = new Complain[100];
    
    private void processComplaints()
    {
        //save or delete complaint
        
    }
    
    public void removeUser(){
        //maybe create list of all users from userDb
        //SU can remove the user
        
    }
    
    public void sendWarning(){
        //OU gets a pop up when they are warned after logging in
    }
    
    public void collectTransaction(){
        //maybe list of transaction db?
    }
    
    public void replaceTaboo(){
        
        //if user uses taboo word, must replace that word with "***"
        //also warn user
        
    }
    

}
