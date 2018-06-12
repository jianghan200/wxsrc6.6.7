package com.tencent.mm.plugin.p;

import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class c
  implements b, com.tencent.mm.kernel.b.c
{
  private static c kny;
  
  public static String Gb()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    g.Ek();
    return g.Ei().dqp + "image/";
  }
  
  public static String Gc()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    g.Ek();
    return g.Ei().dqp + "image2/";
  }
  
  public static c aWC()
  {
    try
    {
      if (kny == null) {
        kny = new c();
      }
      c localc = kny;
      return localc;
    }
    finally {}
  }
  
  public static String aWD()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    g.Ek();
    return g.Ei().dqp + "sfs";
  }
  
  public static String aWE()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    g.Ek();
    return g.Ei().dqp + "bizmsg/";
  }
  
  public final List<String> collectStoragePaths()
  {
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "image/", "image2/", "sfs", "bizmsg/" });
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/p/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */