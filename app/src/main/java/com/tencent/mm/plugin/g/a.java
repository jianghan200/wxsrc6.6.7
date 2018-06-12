package com.tencent.mm.plugin.g;

import com.tencent.mm.aa.q;
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
  private static a gRi;
  
  private a()
  {
    super(q.class);
  }
  
  public static a aqH()
  {
    try
    {
      if (gRi == null) {
        gRi = new a();
      }
      a locala = gRi;
      return locala;
    }
    finally {}
  }
  
  public static String aqI()
  {
    return g.Ei().cachePath + "avatar/";
  }
  
  public final List<String> collectStoragePaths()
  {
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "avatar/" });
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */