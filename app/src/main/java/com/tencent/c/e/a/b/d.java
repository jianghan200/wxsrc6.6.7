package com.tencent.c.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class d
  extends JceStruct
{
  static b vkw;
  public int errorCode = 0;
  public b vkv = null;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.errorCode = paramJceInputStream.read(this.errorCode, 0, true);
    if (vkw == null) {
      vkw = new b();
    }
    this.vkv = ((b)paramJceInputStream.read(vkw, 1, false));
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.errorCode, 0);
    if (this.vkv != null) {
      paramJceOutputStream.write(this.vkv, 1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/c/e/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */