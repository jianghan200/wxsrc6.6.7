package com.tencent.c.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class e
  extends JceStruct
{
  static ArrayList<g> vkA;
  public int action = 0;
  public double lat = 0.0D;
  public int vjz = 0;
  public long vkx = 0L;
  public ArrayList<g> vky = null;
  public double vkz = 0.0D;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.vkx = paramJceInputStream.read(this.vkx, 0, true);
    if (vkA == null)
    {
      vkA = new ArrayList();
      g localg = new g();
      vkA.add(localg);
    }
    this.vky = ((ArrayList)paramJceInputStream.read(vkA, 1, true));
    this.vjz = paramJceInputStream.read(this.vjz, 2, false);
    this.action = paramJceInputStream.read(this.action, 3, false);
    this.lat = paramJceInputStream.read(this.lat, 4, false);
    this.vkz = paramJceInputStream.read(this.vkz, 5, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.vkx, 0);
    paramJceOutputStream.write(this.vky, 1);
    if (this.vjz != 0) {
      paramJceOutputStream.write(this.vjz, 2);
    }
    if (this.action != 0) {
      paramJceOutputStream.write(this.action, 3);
    }
    if (this.lat != 0.0D) {
      paramJceOutputStream.write(this.lat, 4);
    }
    if (this.vkz != 0.0D) {
      paramJceOutputStream.write(this.vkz, 5);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/c/e/a/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */