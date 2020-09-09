package org.example.util;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class CreationCode {

    public String Code(){
        StringBuffer str=new StringBuffer();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyyMMddHHmmssSSS");
        Date date = new Date(System.currentTimeMillis());
        str.append(formatter.format(date));
        str.append((int)(Math.random()*1000)+1);
        String i=str.toString();
        return i;
    }
}
