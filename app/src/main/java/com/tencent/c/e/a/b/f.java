package com.tencent.c.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class f
  extends JceStruct
{
  public long vkB = 0L;
  public float x = 0.0F;
  public float y = 0.0F;
  public float z = 0.0F;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.vkB = paramJceInputStream.read(this.vkB, 0, true);
    this.x = paramJceInputStream.read(this.x, 1, true);
    this.y = paramJceInputStream.read(this.y, 2, true);
    this.z = paramJceInputStream.read(this.z, 3, true);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.vkB, 0);
    paramJceOutputStream.write(this.x, 1);
    paramJceOutputStream.write(this.y, 2);
    paramJceOutputStream.write(this.z, 3);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/c/e/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */