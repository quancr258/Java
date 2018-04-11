/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithuchanhso2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
class SV 
{
    private String ht, ns, gt;
    public SV(String ht, String ns, String gt) 
    {
        super();
        this.ht = ht;
        this.ns = ns;
        this.gt = gt;
    }
    public String getht() 
    {
        return ht;
    }
    public void setht(String ht) 
    {
        this.ht = ht;
    }
    public String getns() 
    {
        return ns;
    }
    public void setns(String ns) 
    {
        this.ns = ns;
    }
    public String getgt() 
    {
        return gt;
    }
    public void setgt(String ns) 
    {
        this.gt = gt;
    }
    public String xuat(String s) 
    {
        int ds, dht, dns, kcht, kcns, kcgt, i;
        String kht = "", kns = "", kgt = "";
        ds = s.length();
        dht = ht.length();
        dns = ns.length();
        kcht = 8 - ds;
        kcns = 21 - (dht);
        kcgt = 16 - (dns);
        for(i = 0; i < kcht; i++)
        {
            if(i == 0 || i < 4 - ds || i ==  kcht - 1) kht += " ";
            else kht += "-";
        }
        for(i = 0; i < kcns; i++)
        {
            if(i == 0 || i < 7 - dht || i ==  kcns - 1) kns += " ";
            else kns += "-";
        }
        for(i = 0; i < kcgt; i++)
        {
            if(i == 0 || i < 9 - dns || i ==  kcgt - 1) kgt += " ";
            else kgt += "-";
        }
        return s + kht + ht + kns + ns + kgt + gt ;
    }
}
