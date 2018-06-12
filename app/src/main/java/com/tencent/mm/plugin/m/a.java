package com.tencent.mm.plugin.m;

import com.tencent.mm.ar.r;
import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.p;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends p
  implements b
{
  private static a iaY;
  
  private a()
  {
    super(r.class);
  }
  
  public static String Gj()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    g.Ek();
    return g.Ei().dqp + "package/";
  }
  
  public static a aCO()
  {
    try
    {
      if (iaY == null) {
        iaY = new a();
      }
      a locala = iaY;
      return locala;
    }
    finally {}
  }
  
  public final List<String> collectStoragePaths()
  {
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "package/" });
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/m/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */