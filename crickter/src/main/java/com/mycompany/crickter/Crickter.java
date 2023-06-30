/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crickter;

import java.util.logging.Logger;

/**
 *
 * @author dnyaneshwar
 */
 class Crickter_list {

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public Crickter_list(String a, String b, String c, String d, String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    @Override
    public String toString() {
        return "Crickter{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + '}';
    }
    
    
}
class Crickter
{
    public static void main(String[] args)
    {
        Crickter_list a = new Crickter_list("sachin","virat","rahane","pant","gill");
        System.out.println(a);
    }
}