/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.di.ud1.t1.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafa
 */
public class HotelLucho {

   private final List<String> loungeList;

    public HotelLucho() {
        this.loungeList = new ArrayList<>();
        loungeList.add("Salón Habana");
    }

    /**
     * @return the loungeList
     */
    public List<String> getLoungeList() {
        return loungeList;
    }

}
