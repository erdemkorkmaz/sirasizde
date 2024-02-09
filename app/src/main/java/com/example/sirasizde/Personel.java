package com.example.sirasizde;

import android.util.Log;

public class Personel {
    public int getYas(){
        return yas;
    }
    public void setYas(int yas){
        if(yas<18 || yas>55){
            Log.e("kapsülleme","Düşük veya Yüksek yaş girdiniz.");
            yas=18;
        }
        this.yas = yas;
    }
    private int yas;
     private int maas;
     public int getMaas(){
         return maas;
     }

    public void setMaas(int maas) {
        if (maas<4253){
            Log.e("kapsülleme" ,"Büyük maaş girdiniz");
            maas=4253;
        }
        this.maas = maas;
    }
}
