package com.mzw.HotelManagementSystem;

/**
 * @author mzw
 * @date 2020/2/12 - 17:11
 */
public class Room {
     String no;        //房间号
     String type;      //"标准间","大床房","豪华间"
     boolean isUse;    //true代表正在使用，false代表空闲
    public Room(String no,String type,boolean isUse){
        super();
        this.no = no;
        this.type = type;
        this.isUse = isUse;
    }
    public void setNo(String no){
        this.no= no;
    }
    public String getNo(){
        return no;
    }
    public void setType(String type){
        this.type= type;
    }
    public String getType(){
        return type;
    }
    public void setIsUse(boolean isUse){
        this.isUse =isUse;
    }
    public boolean getIsUse(){

        return isUse;
    }
    public String ToString(){
        return "["+no+","+type+","+(isUse?"使用":"空闲")+"]";
    }
}
