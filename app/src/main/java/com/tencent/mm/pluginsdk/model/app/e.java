package com.tencent.mm.pluginsdk.model.app;

import android.os.HandlerThread;
import com.tencent.mm.g.c.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.ac.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;
import java.util.Map;

public final class e
{
  public Map<String, Integer> fxF = null;
  private ag handler = new e.2(this, g.Em().lnJ.getLooper());
  public List<r> mTQ = null;
  public List<r> qzB = null;
  private al qzC = new al(new e.1(this), false);
  
  public e()
  {
    this.qzC.J(600000L, 600000L);
  }
  
  final boolean a(r paramr)
  {
    if (paramr == null)
    {
      x.e("MicroMsg.AppIconService", "startDownload fail, geticoninfo is null");
      return false;
    }
    int i;
    if (paramr == null)
    {
      x.e("MicroMsg.AppIconService", "increaseCounter fail, info is null");
      i = 0;
    }
    while (i == 0)
    {
      x.e("MicroMsg.AppIconService", "increaseCounter fail");
      return false;
      localObject = Integer.valueOf(bi.a((Integer)this.fxF.get(paramr.toString()), 0));
      if (((Integer)localObject).intValue() >= 5)
      {
        x.e("MicroMsg.AppIconService", "increaseCounter fail, has reached the max try count");
        i = 0;
      }
      else
      {
        this.fxF.put(paramr.toString(), Integer.valueOf(((Integer)localObject).intValue() + 1));
        i = 1;
      }
    }
    Object localObject = a.bmf().SW(paramr.appId);
    if (localObject == null)
    {
      x.e("MicroMsg.AppIconService", "push, appinfo does not exist, appId = " + paramr.appId);
      return false;
    }
    switch (paramr.efG)
    {
    default: 
      x.e("MicroMsg.AppIconService", "push, unknown iconType = " + paramr.efG);
      return false;
    case 1: 
      if ((((f)localObject).field_appIconUrl == null) || (((f)localObject).field_appIconUrl.length() == 0))
      {
        x.e("MicroMsg.AppIconService", "push, appIconUrl is null, appId = " + paramr.appId);
        return false;
      }
      localObject = ((f)localObject).field_appIconUrl;
    }
    for (;;)
    {
      x.i("MicroMsg.AppIconService", "appIconUrl = " + (String)localObject);
      com.tencent.mm.sdk.f.e.post(new s(this.handler, paramr.appId, paramr.efG, (String)localObject), "AppIconService_getIcon");
      return true;
      if ((((f)localObject).field_appWatermarkUrl == null) || (((f)localObject).field_appWatermarkUrl.length() == 0))
      {
        x.e("MicroMsg.AppIconService", "push, appWatermarkUrl is null, appId = " + paramr.appId);
        return false;
      }
      localObject = ((f)localObject).field_appWatermarkUrl;
      continue;
      if ((((p)localObject).cmL == null) || (((p)localObject).cmL.length() == 0))
      {
        x.e("MicroMsg.AppIconService", "push, appSuggestionIconUrl is null, appId = " + paramr.appId);
        return false;
      }
      localObject = ((p)localObject).cmL;
      continue;
      if ((((p)localObject).cmW == null) || (((p)localObject).cmW.length() == 0))
      {
        x.e("MicroMsg.AppIconService", "push, servicePanelIconUrl is null, appId = " + paramr.appId);
        return false;
      }
      localObject = ((p)localObject).cmW;
      continue;
      if ((((p)localObject).cmX == null) || (((p)localObject).cmX.length() == 0))
      {
        x.e("MicroMsg.AppIconService", "push, serviceListIconUrl is null, appId = " + paramr.appId);
        return false;
      }
      localObject = ((p)localObject).cmX;
    }
  }
  
  public final void cO(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      x.e("MicroMsg.AppIconService", "push fail, appId is null");
    }
    r localr;
    do
    {
      do
      {
        return;
        localr = new r(paramString, paramInt);
        if (this.qzB.contains(localr))
        {
          x.i("MicroMsg.AppIconService", "push, appId = " + paramString + ", iconType = " + paramInt + " already in running list");
          return;
        }
        if (this.qzB.size() < 5) {
          break;
        }
        x.i("MicroMsg.AppIconService", "running list has reached the max count");
      } while (this.mTQ.contains(localr));
      this.mTQ.add(localr);
      return;
    } while (!a(localr));
    this.qzB.add(localr);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */