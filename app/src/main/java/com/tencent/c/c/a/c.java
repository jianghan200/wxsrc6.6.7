package com.tencent.c.c.a;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class c
  extends JceStruct
{
  static b viv = new b();
  public String eMI = "";
  public String fMk = "";
  public String guid = "";
  public String hvl = "";
  public String imei = "";
  public String imsi = "";
  public String ip = "";
  public double latitude = 0.0D;
  public double longitude = 0.0D;
  public String nyk = "";
  public String vie = "";
  public String vif = "";
  public String vig = "";
  public int vih = 0;
  public int vii = 0;
  public b vij = null;
  public int vik = 0;
  public int vil = 0;
  public int vim = 0;
  public int vin = 0;
  public short vio = 0;
  public String vip = "";
  public int viq = 0;
  public String vir = "";
  public String vis = "";
  public String vit = "";
  public String viu = "";
  
  public final JceStruct newInit()
  {
    return new c();
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.imei = paramJceInputStream.readString(0, true);
    this.eMI = paramJceInputStream.readString(1, false);
    this.hvl = paramJceInputStream.readString(2, false);
    this.ip = paramJceInputStream.readString(3, false);
    this.vie = paramJceInputStream.readString(4, false);
    this.vif = paramJceInputStream.readString(5, false);
    this.vig = paramJceInputStream.readString(6, false);
    this.vih = paramJceInputStream.read(this.vih, 7, false);
    this.vii = paramJceInputStream.read(this.vii, 8, false);
    this.vij = ((b)paramJceInputStream.read(viv, 9, false));
    this.guid = paramJceInputStream.readString(10, false);
    this.imsi = paramJceInputStream.readString(11, false);
    this.vik = paramJceInputStream.read(this.vik, 12, false);
    this.vil = paramJceInputStream.read(this.vil, 13, false);
    this.vim = paramJceInputStream.read(this.vim, 14, false);
    this.vin = paramJceInputStream.read(this.vin, 15, false);
    this.fMk = paramJceInputStream.readString(16, false);
    this.vio = paramJceInputStream.read(this.vio, 17, false);
    this.longitude = paramJceInputStream.read(this.longitude, 18, false);
    this.latitude = paramJceInputStream.read(this.latitude, 19, false);
    this.vip = paramJceInputStream.readString(20, false);
    this.viq = paramJceInputStream.read(this.viq, 21, false);
    this.vir = paramJceInputStream.readString(22, false);
    this.vis = paramJceInputStream.readString(23, false);
    this.nyk = paramJceInputStream.readString(24, false);
    this.vit = paramJceInputStream.readString(25, false);
    this.viu = paramJceInputStream.readString(26, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.imei, 0);
    if (this.eMI != null) {
      paramJceOutputStream.write(this.eMI, 1);
    }
    if (this.hvl != null) {
      paramJceOutputStream.write(this.hvl, 2);
    }
    if (this.ip != null) {
      paramJceOutputStream.write(this.ip, 3);
    }
    if (this.vie != null) {
      paramJceOutputStream.write(this.vie, 4);
    }
    if (this.vif != null) {
      paramJceOutputStream.write(this.vif, 5);
    }
    if (this.vig != null) {
      paramJceOutputStream.write(this.vig, 6);
    }
    if (this.vih != 0) {
      paramJceOutputStream.write(this.vih, 7);
    }
    if (this.vii != 0) {
      paramJceOutputStream.write(this.vii, 8);
    }
    if (this.vij != null) {
      paramJceOutputStream.write(this.vij, 9);
    }
    if (this.guid != null) {
      paramJceOutputStream.write(this.guid, 10);
    }
    if (this.imsi != null) {
      paramJceOutputStream.write(this.imsi, 11);
    }
    if (this.vik != 0) {
      paramJceOutputStream.write(this.vik, 12);
    }
    if (this.vil != 0) {
      paramJceOutputStream.write(this.vil, 13);
    }
    if (this.vim != 0) {
      paramJceOutputStream.write(this.vim, 14);
    }
    if (this.vin != 0) {
      paramJceOutputStream.write(this.vin, 15);
    }
    if (this.fMk != null) {
      paramJceOutputStream.write(this.fMk, 16);
    }
    if (this.vio != 0) {
      paramJceOutputStream.write(this.vio, 17);
    }
    if (this.longitude != 0.0D) {
      paramJceOutputStream.write(this.longitude, 18);
    }
    if (this.latitude != 0.0D) {
      paramJceOutputStream.write(this.latitude, 19);
    }
    if (this.vip != null) {
      paramJceOutputStream.write(this.vip, 20);
    }
    if (this.viq != 0) {
      paramJceOutputStream.write(this.viq, 21);
    }
    if (this.vir != null) {
      paramJceOutputStream.write(this.vir, 22);
    }
    if (this.vis != null) {
      paramJceOutputStream.write(this.vis, 23);
    }
    if (this.nyk != null) {
      paramJceOutputStream.write(this.nyk, 24);
    }
    if (this.vit != null) {
      paramJceOutputStream.write(this.vit, 25);
    }
    if (this.viu != null) {
      paramJceOutputStream.write(this.viu, 26);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/c/c/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */