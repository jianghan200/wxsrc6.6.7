package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.protocal.c.av;
import com.tencent.mm.protocal.c.ct;
import com.tencent.mm.protocal.c.dd;
import com.tencent.mm.protocal.c.de;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public final class ag
{
  public static int a(Context paramContext, av paramav)
  {
    if (paramav == null) {}
    do
    {
      return 0;
      if (paramav.hcE != 6) {
        break;
      }
    } while (paramav.raU == null);
    if (a.ezo.r(paramContext, paramav.raS.jQb)) {
      return paramav.raU.rcR;
    }
    return paramav.raU.rcS;
    return paramav.otY;
  }
  
  public static void a(Context paramContext, ay paramay, av paramav)
  {
    if ((paramav != null) && (paramav.raS != null))
    {
      Object localObject = paramav.raS.jQb;
      boolean bool;
      if (bi.oW((String)localObject))
      {
        bool = false;
        if (!bool) {
          break label451;
        }
        paramay.ofl = false;
        if ((paramav.raW == null) || (paramav.raX == null)) {
          break label277;
        }
        if (!a.ezo.r(paramContext, paramav.raS.jQb)) {
          break label233;
        }
        paramContext = paramav.raW;
        label79:
        localObject = w.chP();
        if (!((String)localObject).equals("zh_CN")) {
          break label241;
        }
        paramContext = paramContext.rdj;
        label99:
        switch (paramav.hcE)
        {
        default: 
          paramay.ofl = false;
        }
      }
      for (;;)
      {
        if (bi.oW(paramContext))
        {
          x.e("MicroMsg.OpenActionContent", "text can not load ?");
          paramay.ofl = false;
        }
        return;
        localObject = g.bl((String)localObject, true);
        if ((localObject == null) || (bi.oW(((f)localObject).field_appId)))
        {
          bool = false;
          break;
        }
        if ((((f)localObject).field_appInfoFlag & 0x20) > 0) {}
        for (bool = true;; bool = false)
        {
          x.v("MicroMsg.AppInfoLogic", "canShowSNSTail, appid = %s, ret = %b", new Object[] { ((f)localObject).field_appId, Boolean.valueOf(bool) });
          break;
        }
        label233:
        paramContext = paramav.raX;
        break label79;
        label241:
        if ((((String)localObject).equals("zh_TW")) || (((String)localObject).equals("zh_HK")))
        {
          paramContext = paramContext.rdk;
          break label99;
        }
        paramContext = paramContext.rdi;
        break label99;
        label277:
        if (paramav == null) {
          localObject = "";
        }
        for (;;)
        {
          try
          {
            if (bi.oW((String)localObject)) {
              continue;
            }
            int i = paramContext.getResources().getIdentifier((String)localObject, "string", paramContext.getPackageName());
            if (i <= 0) {
              continue;
            }
            paramContext = paramContext.getString(i);
          }
          catch (Exception paramContext)
          {
            paramContext = "";
          }
          if (paramav.hcE == 6)
          {
            if (paramav.raV == null) {
              localObject = "";
            } else if (a.ezo.r(paramContext, paramav.raS.jQb)) {
              localObject = paramav.raV.rdl;
            } else {
              localObject = paramav.raV.rdm;
            }
          }
          else {
            localObject = paramav.raT;
          }
        }
        break label99;
        paramay.ofm = paramContext;
        paramay.ofl = true;
        continue;
        if (paramav.otY == 1)
        {
          paramay.ofm = paramContext;
          paramay.ofl = true;
          continue;
          paramay.ofm = paramContext;
          paramay.ofl = true;
        }
      }
    }
    label451:
    paramay.ofl = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */