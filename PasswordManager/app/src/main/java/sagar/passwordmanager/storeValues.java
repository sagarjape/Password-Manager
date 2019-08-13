package sagar.passwordmanager;

import android.content.Context;

import android.content.SharedPreferences;
import android.widget.EditText;


/**
 * Created by SYSTEM on 9/1/2014.
 */
public class storeValues {
    static String p[]=new String[20];
    static String u[]=new String[20];
     static int n=0;
    public static void setValue(EditText e, EditText ed){
        if(u[n] != null){
            n++;
        }

        u[n] = e.getText().toString();
        p[n] = ed.getText().toString();
        System.out.println("Input User >>"+n+" "+u[n]);
        System.out.println("Input Pwd >>"+n+" "+p[n]);


    }

    public String getValue(String s){
        String result="";
        boolean flag= false;

        for (int j = 0; j < 20; j++) {
            System.out.println("Saved User >>"+j+" "+u[j]);
            System.out.println("Saved Pwd >>"+j+" "+p[j]);
              if (u[j]!=null) {
                result = p[j];
                flag=true;
            }
        }
        if(flag==false){
                result = "Wrong Username";
        }

        return result;

    }
    }


