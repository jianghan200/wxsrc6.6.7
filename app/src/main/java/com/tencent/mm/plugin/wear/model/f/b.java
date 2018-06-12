package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.cej;
import com.tencent.mm.sdk.platformtools.ad;

public abstract class b
  extends c
{
  protected static String c(String paramString, com.tencent.mm.storage.bd parambd)
  {
    if (s.fq(paramString))
    {
      paramString = d(paramString, parambd);
      return String.format(ad.getContext().getString(R.l.notification_msg_chatroom_template), new Object[] { h.PP(paramString), Character.valueOf('​'), h.aa(parambd).jSA });
    }
    return String.format(ad.getContext().getString(R.l.notification_msg_single_template), new Object[] { h.aa(parambd).jSA });
  }
  
  protected static String d(String paramString, com.tencent.mm.storage.bd parambd)
  {
    Object localObject = paramString;
    if (s.fq(paramString))
    {
      int i = com.tencent.mm.model.bd.iA(parambd.field_content);
      localObject = paramString;
      if (i != -1)
      {
        parambd = parambd.field_content.substring(0, i).trim();
        localObject = paramString;
        if (parambd != null)
        {
          localObject = paramString;
          if (parambd.length() > 0) {
            localObject = parambd;
          }
        }
      }
    }
    return (String)localObject;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */