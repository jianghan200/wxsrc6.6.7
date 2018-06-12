package com.tencent.mm.ui.chatting;

import com.tencent.mm.ak.g;
import com.tencent.mm.ak.o;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.g.a;

public final class ae
{
  public static String a(bd parambd, g.a parama)
  {
    String str2 = "";
    String str1 = str2;
    if (parama != null)
    {
      str1 = str2;
      if (!bi.oW(parama.bGP))
      {
        parama = ao.asF().SR(parama.bGP);
        str1 = str2;
        if (parama != null)
        {
          str1 = str2;
          if (parama.aSc())
          {
            str1 = str2;
            if (com.tencent.mm.a.e.cn(parama.field_fileFullPath)) {
              str1 = parama.field_fileFullPath;
            }
          }
        }
      }
    }
    if (!bi.oW(str1))
    {
      x.d("MicroMsg.HistoryExportUtil", "get hd appmsg image path ok, %s", new Object[] { str1 });
      return str1;
    }
    if (parambd != null) {
      str1 = o.Pf().E(parambd.field_imgPath, true);
    }
    x.d("MicroMsg.HistoryExportUtil", "try get thumb appmsg image path finish, %s", new Object[] { str1 });
    return str1;
  }
  
  private static String g(com.tencent.mm.ak.e parame)
  {
    if (parame != null)
    {
      Object localObject;
      if (parame.ON())
      {
        localObject = parame.dTL;
        if ((localObject == null) || (!com.tencent.mm.a.e.cn((String)localObject))) {}
      }
      do
      {
        String str;
        do
        {
          return (String)localObject;
          localObject = parame.dTL;
          str = o.Pf().o((String)localObject, null, null);
          if (str == null) {
            break;
          }
          localObject = str;
        } while (com.tencent.mm.a.e.cn(str));
        parame = parame.dTN;
        parame = o.Pf().o(parame, null, null);
        if (parame == null) {
          break;
        }
        localObject = parame;
      } while (com.tencent.mm.a.e.cn(parame));
    }
    return null;
  }
  
  public static String gu(long paramLong)
  {
    String str = g(o.Pf().br(paramLong));
    if (str != null) {
      return str;
    }
    return null;
  }
  
  public static String gv(long paramLong)
  {
    String str = g(o.Pf().bq(paramLong));
    if (str != null) {
      return str;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */