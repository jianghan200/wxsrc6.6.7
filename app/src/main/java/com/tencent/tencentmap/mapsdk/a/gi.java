package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;

public abstract class gi
  implements Cloneable
{
  ArrayList<Object> a = null;
  
  public gi a()
  {
    try
    {
      gi localgi = (gi)super.clone();
      if (this.a != null)
      {
        ArrayList localArrayList = this.a;
        localgi.a = new ArrayList();
        int j = localArrayList.size();
        int i = 0;
        while (i < j)
        {
          localgi.a.add(localArrayList.get(i));
          i += 1;
        }
      }
      return localCloneNotSupportedException;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/gi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */