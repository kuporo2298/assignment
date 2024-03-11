/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradingsystem;

/**
 *
 * @author kristian
 */
public class product {
    private int id;
    private String name;
    private String addDate;
    private float price;
    private byte[] picture;
         
    public product(int pid, String pname,float pprice,String pAdddate,byte[] pimg){
        this.id=pid;
        this.name=pname;
        this.addDate=pAdddate;
        this.price=pprice;
        this.picture=pimg;
    }
        public int getId(){
            return id;
        }   
        
        public String getName(){
            return name ;
        }
        public float getPrice(){
            return price;
        }
        public String getadddate(){
            return addDate;
        }
        public byte[] getImg(){
    return picture;
}
    
}
