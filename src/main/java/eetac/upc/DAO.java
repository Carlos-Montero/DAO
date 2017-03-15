package eetac.upc;

import java.lang.reflect.Field;

/**
 * Created by Carlos on 15/03/2017.
 */
public abstract class DAO {
    public void insert(){

        StringBuffer stm = new StringBuffer();
        StringBuffer stm2 = new StringBuffer();
        stm.append("INSERT INTO "+this.getClass().getSimpleName()+" ");
        stm2.append("VALUES (");

        Field[] lista = this.getClass().getDeclaredFields();
        int i=0;
        for(i=0; i< lista.length-1;i++) {
            stm.append(lista[i].getName() + ", ");
            stm2.append("?, ");
        }
        stm.append(lista[i].getName()+" ");
        stm2.append("?)");
        stm.append(stm2);

        System.out.println(stm);
    }

    public void update(){

    }




}
