package com.tencent.c.c.a;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class a
  extends JceStruct
{
  public int vhY = 0;
  public int vhZ = 0;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.vhY = paramJceInputStream.read(this.vhY, 0, true);
    this.vhZ = paramJceInputStream.read(this.vhZ, 1, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.vhY, 0);
    paramJceOutputStream.write(this.vhZ, 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/c/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */