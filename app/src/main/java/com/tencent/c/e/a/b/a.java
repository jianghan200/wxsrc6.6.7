package com.tencent.c.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class a
  extends JceStruct
{
  static ArrayList<e> vks;
  public int bVU = 0;
  public String byN = "";
  public String dMB = "";
  public String imei = "";
  public String imsi = "";
  public String model = "";
  public int pMn = 0;
  public int requestType = 0;
  public int sdkVer = 0;
  public int seW = 0;
  public String vie = "";
  public long vkm = 0L;
  public String vkn = "";
  public ArrayList<e> vko = null;
  public String vkp = "";
  public String vkq = "";
  public int vkr = 0;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.vkm = paramJceInputStream.read(this.vkm, 0, true);
    this.vkn = paramJceInputStream.readString(1, true);
    if (vks == null)
    {
      vks = new ArrayList();
      e locale = new e();
      vks.add(locale);
    }
    this.vko = ((ArrayList)paramJceInputStream.read(vks, 2, true));
    this.pMn = paramJceInputStream.read(this.pMn, 3, true);
    this.vie = paramJceInputStream.readString(4, true);
    this.bVU = paramJceInputStream.read(this.bVU, 5, true);
    this.requestType = paramJceInputStream.read(this.requestType, 6, true);
    this.vkp = paramJceInputStream.readString(7, true);
    this.imei = paramJceInputStream.readString(8, false);
    this.imsi = paramJceInputStream.readString(9, false);
    this.dMB = paramJceInputStream.readString(10, false);
    this.model = paramJceInputStream.readString(11, false);
    this.vkq = paramJceInputStream.readString(12, false);
    this.vkr = paramJceInputStream.read(this.vkr, 13, false);
    this.sdkVer = paramJceInputStream.read(this.sdkVer, 14, false);
    this.byN = paramJceInputStream.readString(15, false);
    this.seW = paramJceInputStream.read(this.seW, 16, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.vkm, 0);
    paramJceOutputStream.write(this.vkn, 1);
    paramJceOutputStream.write(this.vko, 2);
    paramJceOutputStream.write(this.pMn, 3);
    paramJceOutputStream.write(this.vie, 4);
    paramJceOutputStream.write(this.bVU, 5);
    paramJceOutputStream.write(this.requestType, 6);
    paramJceOutputStream.write(this.vkp, 7);
    if (this.imei != null) {
      paramJceOutputStream.write(this.imei, 8);
    }
    if (this.imsi != null) {
      paramJceOutputStream.write(this.imsi, 9);
    }
    if (this.dMB != null) {
      paramJceOutputStream.write(this.dMB, 10);
    }
    if (this.model != null) {
      paramJceOutputStream.write(this.model, 11);
    }
    if (this.vkq != null) {
      paramJceOutputStream.write(this.vkq, 12);
    }
    if (this.vkr != 0) {
      paramJceOutputStream.write(this.vkr, 13);
    }
    if (this.sdkVer != 0) {
      paramJceOutputStream.write(this.sdkVer, 14);
    }
    if (this.byN != null) {
      paramJceOutputStream.write(this.byN, 15);
    }
    paramJceOutputStream.write(this.seW, 16);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/c/e/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */