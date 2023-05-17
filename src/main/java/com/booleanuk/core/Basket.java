package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<Item> items = new ArrayList<>();

    public void add(Item items){this.items.add(items);}

    public int getTotal() {
        int total = 0;

        for (Item items : this.items) {
            total += items.getPrice();
        }

        return total;
    }

    public boolean isInBasket(String name) {

        for (Item items : this.items){
            if(items.getName().equals(name)){
                return true;
            }
        }

        return false;
    }
}
