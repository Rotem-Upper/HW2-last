package com.example.hw2;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Message implements Serializable {
    public String ID;
    public String Avatar;
    public String Name;
    public String Text;

    public Message(String a, String n, String t) {
        Avatar = a;
        Name = n;
        Text = t;
        ID = String.valueOf(System.currentTimeMillis());
    }

    public Message(String a, String n, String t, String i) {
        Avatar = a;
        Name = n;
        Text = t;
        ID = i;
    }

    public Map<String,String> getAsMap() {
        Map<String,String> map = new HashMap<>();
        map.put("ID",ID);
        map.put("Avatar",Avatar);
        map.put("Name", Name);
        map.put("Text",Text);
        return map;
    }
}
