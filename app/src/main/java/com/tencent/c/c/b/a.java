package com.tencent.c.c.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class a
  extends JceStruct
{
  static ArrayList<b> viA;
  static d viB = new d();
  static c viz = new c();
  public c viw = null;
  public ArrayList<b> vix = null;
  public d viy = null;
  
  static
  {
    viA = new ArrayList();
    b localb = new b();
    viA.add(localb);
  }
  
  public final JceStruct newInit()
  {
    return new a();
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.viw = ((c)paramJceInputStream.read(viz, 0, false));
    this.vix = ((ArrayList)paramJceInputStream.read(viA, 1, false));
    this.viy = ((d)paramJceInputStream.read(viB, 2, false));
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.viw != null) {
      paramJceOutputStream.write(this.viw, 0);
    }
    if (this.vix != null) {
      paramJceOutputStream.write(this.vix, 1);
    }
    if (this.viy != null) {
      paramJceOutputStream.write(this.viy, 2);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/c/c/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */