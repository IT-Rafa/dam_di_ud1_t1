/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.di.ud1.ti1.hotellucho;

/**
 *
 * @author rafa
 */
public class CongressLoungeBook1 extends LoungeBook{
    private int catJornadas;
    private boolean needRooms;

    /**
     * @return the catJornadas
     */
    public int getCatJornadas() {
        return catJornadas;
    }

    /**
     * @param catJornadas the catJornadas to set
     */
    public void setCatJornadas(int catJornadas) {
        this.catJornadas = catJornadas;
    }

    /**
     * @return the needRooms
     */
    public boolean isNeedRooms() {
        return needRooms;
    }

    /**
     * @param needRooms the needRooms to set
     */
    public void setNeedRooms(boolean needRooms) {
        this.needRooms = needRooms;
    }
    
}
