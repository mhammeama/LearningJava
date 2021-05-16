package com.company.core;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Object> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public Object pop(){
        if(this.items.size()> 0){
            Object temp = items.get(0); // Object temp = items[0]
            items.remove(0);
            return temp;
        }
        return  null;
    }

    public Object peek(){
        if(this.items.size()> 0){
            Object temp = items.get(0);
                 return temp;
        }
        return null;
    }

    public void push(Object o){
        items.add(0, o);
    }
}