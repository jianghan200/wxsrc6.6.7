package com.tencent.c.c.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class c
  extends JceStruct
{
  static byte[] vji;
  static byte[] vjj;
  public int dQL = 0;
  public int requestType = 0;
  public int viZ = 0;
  public int viq = 0;
  public int vja = 0;
  public int vjb = 0;
  public byte[] vjc = null;
  public int vjd = 0;
  public long vje = 0L;
  public byte[] vjf = null;
  public int vjg = 0;
  public int vjh = 0;
  
  static
  {
    byte[] arrayOfByte = (byte[])new byte[1];
    vji = arrayOfByte;
    ((byte[])arrayOfByte)[0] = 0;
    arrayOfByte = (byte[])new byte[1];
    vjj = arrayOfByte;
    ((byte[])arrayOfByte)[0] = 0;
  }
  
  public final JceStruct newInit()
  {
    return new c();
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.viZ = paramJceInputStream.read(this.viZ, 0, false);
    this.viq = paramJceInputStream.read(this.viq, 1, false);
    this.requestType = paramJceInputStream.read(this.requestType, 2, false);
    this.vja = paramJceInputStream.read(this.vja, 3, false);
    this.vjb = paramJceInputStream.read(this.vjb, 4, false);
    this.vjc = ((byte[])paramJceInputStream.read(vji, 5, false));
    this.vjd = paramJceInputStream.read(this.vjd, 6, false);
    this.dQL = paramJceInputStream.read(this.dQL, 7, false);
    this.vje = paramJceInputStream.read(this.vje, 8, false);
    this.vjf = ((byte[])paramJceInputStream.read(vjj, 9, false));
    this.vjg = paramJceInputStream.read(this.vjg, 10, false);
    this.vjh = paramJceInputStream.read(this.vjh, 11, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.viZ != 0) {
      paramJceOutputStream.write(this.viZ, 0);
    }
    paramJceOutputStream.write(this.viq, 1);
    paramJceOutputStream.write(this.requestType, 2);
    if (this.vja != 0) {
      paramJceOutputStream.write(this.vja, 3);
    }
    if (this.vjb != 0) {
      paramJceOutputStream.write(this.vjb, 4);
    }
    if (this.vjc != null) {
      paramJceOutputStream.write(this.vjc, 5);
    }
    if (this.vjd != 0) {
      paramJceOutputStream.write(this.vjd, 6);
    }
    if (this.dQL != 0) {
      paramJceOutputStream.write(this.dQL, 7);
    }
    if (this.vje != 0L) {
      paramJceOutputStream.write(this.vje, 8);
    }
    if (this.vjf != null) {
      paramJceOutputStream.write(this.vjf, 9);
    }
    if (this.vjg != 0) {
      paramJceOutputStream.write(this.vjg, 10);
    }
    if (this.vjh != 0) {
      paramJceOutputStream.write(this.vjh, 11);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/c/c/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */