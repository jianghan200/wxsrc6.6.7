package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.f;
import com.tencent.mm.ac.z;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.s;
import com.tencent.mm.ui.tools.k;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class am
{
  public static void a(bd parambd, Context paramContext, String paramString, boolean paramBoolean)
  {
    if (paramContext == null)
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: context is null");
      return;
    }
    if (parambd == null)
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: msg is null");
      return;
    }
    au.HU();
    if (!c.isSDCardAvailable())
    {
      s.gH(paramContext);
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: sd card is not available");
      return;
    }
    a(dF(z.MY().hw(4)), paramContext, new am.5(parambd, paramContext, paramBoolean, paramString));
  }
  
  public static void a(bd parambd, String paramString, Context paramContext)
  {
    a(parambd, paramString, paramContext, 512);
  }
  
  private static void a(bd parambd, String paramString, Context paramContext, int paramInt)
  {
    if (paramContext == null)
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptMusicConnector: context is null");
      return;
    }
    if (parambd == null)
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptMusicConnector: msg is null");
      return;
    }
    List localList = null;
    switch (paramInt)
    {
    }
    for (;;)
    {
      a(localList, paramContext, new am.10(parambd, paramString, paramInt, paramContext));
      return;
      localList = dF(z.MY().hw(256));
      continue;
      localList = dF(f.MM());
      continue;
      localList = dF(z.MY().hw(512));
    }
  }
  
  private static void a(List<String> paramList, Context paramContext, n.d paramd)
  {
    if ((paramList == null) || (paramList.isEmpty()))
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "tryShowConnectorDialog: careList is null or empty");
      return;
    }
    k localk = new k(paramContext);
    localk.uAx = new am.11();
    localk.uAy = new am.2(paramContext);
    localk.ofp = new am.3(paramList);
    localk.ofq = paramd;
    localk.bEo();
  }
  
  public static void b(bd parambd, Context paramContext)
  {
    if (paramContext == null)
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVoiceConnector: context is null");
      return;
    }
    if (parambd == null)
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVoiceConnector: msg is null");
      return;
    }
    au.HU();
    if (!c.isSDCardAvailable())
    {
      s.gH(paramContext);
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVoiceConnector: sd card not available");
      return;
    }
    a(dF(z.MY().hw(2)), paramContext, new am.4(parambd, paramContext));
  }
  
  public static void b(bd parambd, String paramString, Context paramContext)
  {
    a(parambd, paramString, paramContext, 256);
  }
  
  public static void c(bd parambd, Context paramContext)
  {
    if (paramContext == null)
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: context is null");
      return;
    }
    if (parambd == null)
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: msg is null");
      return;
    }
    au.HU();
    if (!c.isSDCardAvailable())
    {
      s.gH(paramContext);
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: sd card is not available");
      return;
    }
    a(dF(z.MY().hw(8)), paramContext, new am.6(parambd, paramContext));
  }
  
  public static void c(bd parambd, String paramString, Context paramContext)
  {
    a(parambd, paramString, paramContext, 128);
  }
  
  public static void d(bd parambd, Context paramContext)
  {
    if (paramContext == null)
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: context is null");
      return;
    }
    if (parambd == null)
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: msg is null");
      return;
    }
    au.HU();
    if (!c.isSDCardAvailable())
    {
      s.gH(paramContext);
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: sd card is not available");
      return;
    }
    a(dF(z.MY().hw(64)), paramContext, new am.9(parambd, paramContext));
  }
  
  private static List<String> dF(List<String> paramList)
  {
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!f.kK(str)) {
        localLinkedList.add(str);
      }
    }
    x.d("MicroMsg.LongClickBrandServiceHelper", "get selected accept list, size %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    return localLinkedList;
  }
  
  public static void l(String paramString, Context paramContext)
  {
    if (paramContext == null)
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptTextConnector: context is null");
      return;
    }
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptTextConnector: content is null");
      return;
    }
    a(dF(z.MY().hw(1)), paramContext, new am.1(paramString, paramContext));
  }
  
  public static void m(String paramString, Context paramContext)
  {
    if (paramContext == null)
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptLocationConnector: context is null");
      return;
    }
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptLocationConnector: locationXML is null");
      return;
    }
    a(dF(z.MY().hw(16)), paramContext, new am.7(paramString, paramContext));
  }
  
  public static void n(String paramString, Context paramContext)
  {
    if (paramContext == null)
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptPersonalCardConnector: context is null");
      return;
    }
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptPersonalCardConnector: locationXML is null");
      return;
    }
    a(dF(z.MY().hw(32)), paramContext, new am.8(paramString, paramContext));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */