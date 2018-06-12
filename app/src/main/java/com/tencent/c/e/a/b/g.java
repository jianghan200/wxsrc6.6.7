package com.tencent.c.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class g
  extends JceStruct
{
  static Map<Integer, ArrayList<f>> vkF;
  public long vkC = 0L;
  public Map<Integer, ArrayList<f>> vkD = null;
  public int vkE = 0;
  public int vki = 0;
  public int vkj = 0;
  public int vkk = 0;
  public int vkl = 0;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.vkC = paramJceInputStream.read(this.vkC, 0, true);
    if (vkF == null)
    {
      vkF = new HashMap();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new f());
      vkF.put(Integer.valueOf(0), localArrayList);
    }
    this.vkD = ((Map)paramJceInputStream.read(vkF, 1, true));
    this.vki = paramJceInputStream.read(this.vki, 2, false);
    this.vkj = paramJceInputStream.read(this.vkj, 3, false);
    this.vkk = paramJceInputStream.read(this.vkk, 4, false);
    this.vkl = paramJceInputStream.read(this.vkl, 5, false);
    this.vkE = paramJceInputStream.read(this.vkE, 6, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.vkC, 0);
    paramJceOutputStream.write(this.vkD, 1);
    paramJceOutputStream.write(this.vki, 2);
    paramJceOutputStream.write(this.vkj, 3);
    paramJceOutputStream.write(this.vkk, 4);
    paramJceOutputStream.write(this.vkl, 5);
    if (this.vkE != 0) {
      paramJceOutputStream.write(this.vkE, 6);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/c/e/a/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */