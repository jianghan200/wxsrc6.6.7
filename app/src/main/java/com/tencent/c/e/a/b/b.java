package com.tencent.c.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class b
  extends JceStruct
{
  public String byN = "";
  public String vkn = "";
  public int vkt = 0;
  public float vku = 0.0F;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.vkn = paramJceInputStream.readString(0, true);
    this.vkt = paramJceInputStream.read(this.vkt, 1, true);
    this.vku = paramJceInputStream.read(this.vku, 2, true);
    this.byN = paramJceInputStream.readString(3, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.vkn, 0);
    paramJceOutputStream.write(this.vkt, 1);
    paramJceOutputStream.write(this.vku, 2);
    if (this.byN != null) {
      paramJceOutputStream.write(this.byN, 3);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/c/e/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */