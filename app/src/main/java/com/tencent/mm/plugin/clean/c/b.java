package com.tencent.mm.plugin.clean.c;

import java.util.ArrayList;
import java.util.Iterator;

public final class b
  implements Comparable<b>
{
  public long gTK;
  public ArrayList<a> hQM;
  public String username;
  
  public final boolean aAY()
  {
    this.gTK = 0L;
    Iterator localIterator = this.hQM.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      this.gTK += locala.size;
    }
    return this.hQM.size() != 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/clean/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */