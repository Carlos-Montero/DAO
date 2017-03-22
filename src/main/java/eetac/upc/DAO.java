package eetac.upc;

import java.lang.reflect.Field;

/**
 * Created by Carlos on 15/03/2017.
 */
public abstract class DAO {
    public void insert(){ //acabado

        StringBuffer stm = new StringBuffer();
        StringBuffer stm2 = new StringBuffer();
        stm.append("INSERT INTO "+this.getClass().getSimpleName()+" ");
        stm2.append("VALUES (");

        Field[] lista = this.getClass().getDeclaredFields();
        int i=0;
        stm.append("(");
        for(i=0; i< lista.length-1;i++) {
            stm.append(lista[i].getName() + ", ");
            stm2.append("?, ");
        }
        stm.append(lista[i].getName()+"");
        stm.append(") ");
        stm2.append("?)");
        stm.append(stm2);

        System.out.println(stm);
    }

    public void update(){
        StringBuffer stm = new StringBuffer();
        StringBuffer stm2 = new StringBuffer();
        stm.append("UPDATE "+this.getClass().getSimpleName()+" ");
        stm2.append("SET (");

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


    public void select(int key){  //acabado
        StringBuffer stm = new StringBuffer();
        StringBuffer stm2 = new StringBuffer();
        stm.append("SELECT * FROM "+this.getClass().getSimpleName()+" WHERE ");
        stm2.append("= (");
        Field[] lista = this.getClass().getDeclaredFields();
        int i=0;
        /**
        for(i=0; i< lista.length-1;i++) {
            stm.append(lista[i].getName() + ", ");
            stm2.append("?, ");
        }
        stm.append(lista[i].getName()+" ");
        */

        stm.append(this.getPrimaryKey()).append("=?");

        System.out.println(stm);
    }


    public void delete(int key) { //acabado
        StringBuffer stm = new StringBuffer();
        StringBuffer stm2 = new StringBuffer();
        stm.append("DELETE FROM "+this.getClass().getSimpleName()+" WHERE ");
        stm2.append("= (");
        Field[] lista = this.getClass().getDeclaredFields();
        int i=0;
        /**
         for(i=0; i< lista.length-1;i++) {
         stm.append(lista[i].getName() + ", ");
         stm2.append("?, ");
         }
         stm.append(lista[i].getName()+" ");
         */
        stm.append(this.getPrimaryKey()).append("=?");
        System.out.println(stm);
    }

    public void findAll(){ StringBuffer stm = new StringBuffer();
        StringBuffer stm2 = new StringBuffer();
        stm.append("SELECT * FROM "+this.getClass().getSimpleName());
        /*stm2.append("= (");
        Field[] lista = this.getClass().getDeclaredFields();
        int i=0;

         for(i=0; i< lista.length-1;i++) {
         stm.append(lista[i].getName() + ", ");
         stm2.append("?, ");
         }
         stm.append(lista[i].getName()+" ");


        stm.append(this.getPrimaryKey()).append("=?");
        */
        System.out.println(stm);

    }

    public abstract String getPrimaryKey();





}
