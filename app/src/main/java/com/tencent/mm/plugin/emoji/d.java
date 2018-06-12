package com.tencent.mm.plugin.emoji;

import com.tencent.mm.aj.a;
import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.p;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class d
  extends p
  implements b
{
  private static d icO;
  
  private d()
  {
    super(a.class);
  }
  
  public static d aDh()
  {
    try
    {
      if (icO == null) {
        icO = new d();
      }
      d locald = icO;
      return locald;
    }
    finally {}
  }
  
  public static String aDi()
  {
    return g.Ei().dqp + "emoji/";
  }
  
  public final List<String> collectStoragePaths()
  {
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "emoji/" });
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/emoji/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */