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
public class LoungeBook {
    private String nombre;
    private String tfno;
    private String eventType;
    private int cantPeople;
    private String cucineType;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tfno
     */
    public String getTfno() {
        return tfno;
    }

    /**
     * @param tfno the tfno to set
     */
    public void setTfno(String tfno) {
        this.tfno = tfno;
    }

    /**
     * @return the eventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType the eventType to set
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * @return the cantPeople
     */
    public int getCantPeople() {
        return cantPeople;
    }

    /**
     * @param cantPeople the cantPeople to set
     */
    public void setCantPeople(int cantPeople) {
        this.cantPeople = cantPeople;
    }

    /**
     * @return the cucineType
     */
    public String getCucineType() {
        return cucineType;
    }

    /**
     * @param cucineType the cucineType to set
     */
    public void setCucineType(String cucineType) {
        this.cucineType = cucineType;
    }
    
}
