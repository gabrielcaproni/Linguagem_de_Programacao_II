/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Gabriel Pegoraro
 */
public class ConverteData extends Converter<Object, Object>{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    @Override
    public Object convertForward(Object value) {
        Calendar c= (Calendar) value;
        return sdf.format(c.getTime());
    }

    @Override
    public Object convertReverse(Object value) {
        String str = (String) value;
        Calendar c = Calendar.getInstance();
        try{
            c.setTime(sdf.parse(str));
            return c;
        }catch(Exception e){
            return null;
        }
    }
    
    
}
