package com.tencent.mm.y;

import android.content.Context;
import android.util.Base64;
import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.aa.q;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.biz.a.a;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.s;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public final class i
{
  public static String a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    if (paramContext == null)
    {
      x.w("MicroMsg.AppMsgBizHelper", "getReaderAppMsgContent: context is null");
      return null;
    }
    if ((paramString1 == null) || (paramString2 == null))
    {
      x.w("MicroMsg.AppMsgBizHelper", "getReaderAppMsgContent: msg is null");
      return null;
    }
    g.Ek();
    if (!g.Ei().isSDCardAvailable())
    {
      s.gH(paramContext);
      return null;
    }
    try
    {
      paramContext = ((a)g.l(a.class)).wS(paramString1);
      paramString1 = paramContext.dzs;
      if ((paramString1 != null) && (paramString1.size() > 0) && (paramInt < paramString1.size()))
      {
        m localm = (m)paramString1.get(paramInt);
        paramString1 = new g.a();
        paramString1.title = localm.title;
        paramString1.description = localm.dzA;
        paramString1.action = "view";
        paramString1.type = 5;
        paramString1.url = localm.url;
        paramString1.bZG = paramContext.bZG;
        paramString1.bZH = paramContext.bZH;
        paramString1.cGB = paramContext.cGB;
        paramString1.thumburl = localm.dzy;
        if (bi.oW(paramString1.thumburl))
        {
          paramContext = q.KH().kc(paramString2);
          if (paramContext != null) {
            paramString1.thumburl = paramContext.Kx();
          }
        }
        paramContext = g.a.a(paramString1, null, null);
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      x.printErrStackTrace("MicroMsg.AppMsgBizHelper", paramContext, "", new Object[0]);
      x.e("MicroMsg.AppMsgBizHelper", "retransmit app msg error : %s", new Object[] { paramContext.getLocalizedMessage() });
    }
    return null;
  }
  
  public static String gR(int paramInt)
  {
    if ((paramInt <= 0) || (paramInt >= 86400L)) {
      return null;
    }
    if (paramInt < 3600L) {}
    for (Object localObject = "mm:ss";; localObject = "HH:mm:ss")
    {
      localObject = new SimpleDateFormat((String)localObject);
      ((SimpleDateFormat)localObject).setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
      return ((SimpleDateFormat)localObject).format(Long.valueOf(paramInt * 1000L));
    }
  }
  
  public static boolean gr(String paramString)
  {
    return (paramString != null) && (paramString.endsWith("@app"));
  }
  
  public static String gs(String paramString)
  {
    Object localObject = ay.WA(paramString);
    if (localObject == null)
    {
      localObject = gt(paramString);
      paramString = new StringBuilder("");
      localObject = ((l)localObject).dzs.iterator();
      while (((Iterator)localObject).hasNext())
      {
        m localm = (m)((Iterator)localObject).next();
        if (!bi.oW(localm.title)) {
          paramString.append(localm.title);
        }
      }
      paramString = paramString.toString();
    }
    do
    {
      return paramString;
      localObject = (String)((Map)localObject).get(".msg.appmsg.mmreader.category.item.title");
      paramString = (String)localObject;
    } while (localObject != null);
    return "";
  }
  
  public static l gt(String paramString)
  {
    try
    {
      l locall = (l)new l().aG(Base64.decode(paramString, 0));
      return locall;
    }
    catch (Exception localException)
    {
      try
      {
        paramString = (l)new l().aG(bi.WP(paramString));
        return paramString;
      }
      catch (Exception paramString) {}
    }
    return new l();
  }
  
  public static boolean gu(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    paramString = ((a)g.l(a.class)).wS(paramString);
    if (paramString == null)
    {
      x.w("MicroMsg.AppMsgBizHelper", "isBizMsgForbidForward reader is null");
      return false;
    }
    return paramString.dzt == 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/y/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */