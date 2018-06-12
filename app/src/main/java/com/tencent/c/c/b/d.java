package com.tencent.c.c.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class d
  extends JceStruct
{
  public String dMB = "";
  public String model = "";
  public String platform = "";
  public int root = 0;
  public String vjk = "";
  public String vjl = "";
  public int vjm = 0;
  public String vjn = "";
  
  public final JceStruct newInit()
  {
    return new d();
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.vjk = paramJceInputStream.readString(0, false);
    this.vjl = paramJceInputStream.readString(1, false);
    this.dMB = paramJceInputStream.readString(2, false);
    this.model = paramJceInputStream.readString(3, false);
    this.vjm = paramJceInputStream.read(this.vjm, 4, false);
    this.vjn = paramJceInputStream.readString(5, false);
    this.platform = paramJceInputStream.readString(6, false);
    this.root = paramJceInputStream.read(this.root, 7, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.vjk != null) {
      paramJceOutputStream.write(this.vjk, 0);
    }
    if (this.vjl != null) {
      paramJceOutputStream.write(this.vjl, 1);
    }
    if (this.dMB != null) {
      paramJceOutputStream.write(this.dMB, 2);
    }
    if (this.model != null) {
      paramJceOutputStream.write(this.model, 3);
    }
    if (this.vjm != 0) {
      paramJceOutputStream.write(this.vjm, 4);
    }
    if (this.vjn != null) {
      paramJceOutputStream.write(this.vjn, 5);
    }
    if (this.platform != null) {
      paramJceOutputStream.write(this.platform, 6);
    }
    if (this.root != 0) {
      paramJceOutputStream.write(this.root, 7);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/c/c/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */