package com.tencent.c.c.a;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class b
  extends JceStruct
{
  public int vib = 0;
  public int vic = 0;
  public int vid = 0;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.vib = paramJceInputStream.read(this.vib, 1, true);
    this.vic = paramJceInputStream.read(this.vic, 2, true);
    this.vid = paramJceInputStream.read(this.vid, 3, true);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.vib, 1);
    paramJceOutputStream.write(this.vic, 2);
    paramJceOutputStream.write(this.vid, 3);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/c/c/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */