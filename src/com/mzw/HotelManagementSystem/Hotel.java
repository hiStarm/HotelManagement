package com.mzw.HotelManagementSystem;

/**
 * @author mzw
 * @date 2020/2/12 - 17:18
 */
public class Hotel {
    /*
        规定酒店：5层，每层5个房间
        1、2为标准间
        3、4为大床房
        5为豪华间
     */
    Room[][] rooms;
    public Hotel() {
        rooms = new Room[5][5];
        for(int i = 0;i< rooms.length;i++){
            for(int k = 0;k<rooms[i].length;k++){
                if(i<3){
                    rooms[i][k] = new Room(((i+1)*100+k+1)+"","标准间",false);
                }else if(i<5){
                    rooms[i][k] = new Room(((i+1)*100+k+1)+"","大床房",false);
                }else{
                    rooms[i][k] = new Room(((i+1)*100+k+1)+"","豪华间",false);
                }
            }
        }
    }
    //打印房间信息
    public void Print(){
        for(int i=0;i<rooms.length;i++){
            for(int k=0;k<rooms[i].length;k++){
                System.out.print(rooms[i][k]+"  ");
            }
            System.out.println();
        }
    }
    //预定方法
    public void order(String no){
        for(int i=0;i<rooms.length;i++){
            for(int k=0;k<rooms[i].length;k++){
                if(rooms[i][k].getNo().equals(no)){
                    if(rooms[i][k].isUse){
                        System.out.println("该房间以被预定");
                        return;
                    }
                    else{
                        System.out.println("预定成功");
                        rooms[i][k].setIsUse(true);
                        return;
                    }
                }
            }

        }
    }
    //退订方法
    public void unsubscribe(String no){
        for(int i=0;i<rooms.length;i++){
            for(int k=0;k<rooms[i].length;k++){
                if(rooms[i][k].getNo().equals(no)){
                    if(rooms[i][k].isUse){
                        System.out.println("退订成功");
                        rooms[i][k].setIsUse(false);
                        return;
                    }
                    else{
                        System.out.println("该房间并未预定");
                        return;
                    }
                }
            }

        }
    }

}
