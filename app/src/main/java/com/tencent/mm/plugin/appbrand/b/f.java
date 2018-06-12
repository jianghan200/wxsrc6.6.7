package com.tencent.mm.plugin.appbrand.b;

import android.text.TextUtils;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.e.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService;
import com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService.StopBackgroundMusicTask;
import com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService.b;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

abstract class f
  extends g
{
  final com.tencent.mm.plugin.appbrand.g fdO;
  int fjG = 0;
  private final AppBrandMusicClientService.b fjH = new f.1(this);
  private final com.tencent.mm.plugin.appbrand.ui.banner.f fjI = new f.2(this);
  
  f(h paramh, com.tencent.mm.plugin.appbrand.g paramg)
  {
    super(paramh);
    this.fdO = paramg;
  }
  
  private void cf(int paramInt)
  {
    this.fjG |= paramInt;
  }
  
  abstract void acx();
  
  public void enter()
  {
    super.enter();
    this.fjG = 0;
    Object localObject1 = this.fdO.mAppId;
    int i = this.fdO.fct.fig;
    Object localObject2;
    AppBrandMusicClientService.b localb;
    if ((this.fdO.fcu != null) && (this.fdO.fcu.frh))
    {
      i = 1;
      if (i == 0) {
        break label211;
      }
      if (AppBrandMusicClientService.ut((String)localObject1))
      {
        cf(1);
        localObject2 = AppBrandMusicClientService.ghS;
        localb = this.fjH;
        if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (localb != null)) {
          break label163;
        }
      }
      label91:
      if (e.qn((String)localObject1) == e.c.fci) {
        break label263;
      }
      AppBrandStickyBannerLogic.a.anT();
      label105:
      localObject1 = e.qn((String)localObject1);
      switch (f.3.fjK[localObject1.ordinal()])
      {
      }
    }
    for (;;)
    {
      this.fjG = this.fjG;
      jH(0);
      return;
      i = 0;
      break;
      label163:
      if (!((AppBrandMusicClientService)localObject2).ghR.containsKey(localObject1))
      {
        ((AppBrandMusicClientService)localObject2).ghR.put(localObject1, localb);
        break label91;
      }
      ((AppBrandMusicClientService)localObject2).ghR.remove(localObject1);
      ((AppBrandMusicClientService)localObject2).ghR.put(localObject1, localb);
      break label91;
      label211:
      localObject2 = AppBrandMusicClientService.ghS;
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        break label91;
      }
      if (!((String)localObject1).equalsIgnoreCase(((AppBrandMusicClientService)localObject2).ghT))
      {
        x.e("MicroMsg.AppBrandMusicClientService", "appId is diff, can't stop music");
        break label91;
      }
      localObject2 = new AppBrandMusicClientService.StopBackgroundMusicTask();
      ((AppBrandMusicClientService.StopBackgroundMusicTask)localObject2).appId = ((String)localObject1);
      AppBrandMainProcessService.a((MainProcessTask)localObject2);
      break label91;
      label263:
      cf(2);
      AppBrandStickyBannerLogic.a.d(this.fjI);
      break label105;
      cf(16);
      continue;
      cf(4);
      continue;
      cf(8);
    }
  }
  
  public void exit()
  {
    super.exit();
    this.fjG = 0;
    AppBrandMusicClientService localAppBrandMusicClientService = AppBrandMusicClientService.ghS;
    String str = this.fdO.mAppId;
    if ((!TextUtils.isEmpty(str)) && (localAppBrandMusicClientService.ghR.containsKey(str))) {
      localAppBrandMusicClientService.ghR.remove(str);
    }
    AppBrandStickyBannerLogic.a.c(this.fjI);
  }
  
  final void jH(int paramInt)
  {
    this.fjG &= (paramInt ^ 0xFFFFFFFF);
    if (this.fjG == 0) {
      acx();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */