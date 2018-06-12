package com.tencent.mm.plugin.game.wepkg.model;

import com.tencent.mm.g.a.ub;
import com.tencent.mm.plugin.game.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.game.wepkg.ipc.WepkgMainProcessTask;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public class h
{
  private static volatile h kfM = null;
  
  private void a(String paramString, List<WepkgPreloadFile> paramList, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        if (!bi.cX(paramList)) {
          break label240;
        }
        x.i("MicroMsg.Wepkg.WepkgUpdater", "loopDownload WepkgPreloadFile is empty");
        if (bi.oW(paramString))
        {
          j(paramBoolean, paramString);
          return;
        }
        paramList = g.Eo(paramString);
        if (!bi.cX(paramList)) {
          break;
        }
        paramList = new WepkgCrossProcessTask();
        paramList.nc = 3006;
        paramList.kff.kfA = paramString;
        paramList.kff.kfY = true;
        if (ad.cic())
        {
          paramList.aai();
          paramList = g.Em(paramString);
          if ((paramList != null) && (paramList.createTime != 0L))
          {
            com.tencent.mm.plugin.game.wepkg.utils.a.b("downloadCompleteTime", "", paramList.kfA, paramList.version, -1L, System.currentTimeMillis() - paramList.createTime * 1000L, null);
            paramList = new WepkgCrossProcessTask();
            paramList.nc = 3007;
            paramList.kff.kfA = paramString;
            if (!ad.cic()) {
              break label203;
            }
            paramList.aai();
          }
          j(paramBoolean, paramString);
          x.i("MicroMsg.Wepkg.WepkgUpdater", "WepkgPreloadFile downloadComplete:true");
          return;
        }
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.Wepkg.WepkgUpdater", "loopDownload err:%s", new Object[] { paramString.getMessage() });
        return;
      }
      WepkgMainProcessService.b(paramList);
      continue;
      label203:
      WepkgMainProcessService.b(paramList);
    }
    x.i("MicroMsg.Wepkg.WepkgUpdater", "WepkgPreloadFile downloadComplete:false list.size:%s", new Object[] { Integer.valueOf(paramList.size()) });
    j(paramBoolean, paramString);
    return;
    label240:
    WepkgPreloadFile localWepkgPreloadFile = (WepkgPreloadFile)paramList.remove(0);
    if (localWepkgPreloadFile != null)
    {
      x.i("MicroMsg.Wepkg.WepkgUpdater", "download preload files pkgid:%s, version:%s, rid:%s", new Object[] { localWepkgPreloadFile.kfA, localWepkgPreloadFile.version, localWepkgPreloadFile.kfk });
      paramString = new h.3(this, paramString, paramList, paramBoolean);
      paramString.object = localWepkgPreloadFile;
      g.a(2, localWepkgPreloadFile.kfA, localWepkgPreloadFile.kfk, localWepkgPreloadFile.downloadUrl, localWepkgPreloadFile.size, localWepkgPreloadFile.version, localWepkgPreloadFile.bKg, localWepkgPreloadFile.kfm, paramString);
      return;
    }
    x.i("MicroMsg.Wepkg.WepkgUpdater", "download item is null, to loop");
    a(paramString, paramList, paramBoolean);
  }
  
  public static h aVz()
  {
    if (kfM == null) {}
    try
    {
      if (kfM == null) {
        kfM = new h();
      }
      return kfM;
    }
    finally {}
  }
  
  private static void j(boolean paramBoolean, String paramString)
  {
    if (paramBoolean)
    {
      localObject = new ub();
      ((ub)localObject).cfW.bIH = 0;
      com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
    }
    Object localObject = new WepkgCrossProcessTask();
    ((WepkgCrossProcessTask)localObject).nc = 2006;
    ((WepkgCrossProcessTask)localObject).kff.kfA = paramString;
    if (ad.cic()) {
      ((WepkgCrossProcessTask)localObject).aai();
    }
    for (;;)
    {
      f.Ej(paramString);
      return;
      WepkgMainProcessService.b((WepkgMainProcessTask)localObject);
    }
  }
  
  public final void aC(final String paramString, final boolean paramBoolean)
  {
    if (bi.oW(paramString))
    {
      j(paramBoolean, paramString);
      return;
    }
    a local1 = new a()
    {
      public final void a(BaseWepkgProcessTask paramAnonymousBaseWepkgProcessTask)
      {
        if ((this.object instanceof String))
        {
          h.a(h.this, (String)this.object, paramBoolean);
          return;
        }
        h.k(paramBoolean, paramString);
      }
    };
    local1.object = paramString;
    x.i("MicroMsg.Wepkg.WepkgUpdater", "start update wepkg. pkgid:%s, isAutoUpdate:%s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if (bi.oW(paramString))
    {
      j(paramBoolean, paramString);
      return;
    }
    x.i("MicroMsg.Wepkg.WepkgUpdater", "update big package. pkgid:%s, isAutoUpdate:%s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    WepkgVersion localWepkgVersion = g.Em(paramString);
    if (localWepkgVersion == null)
    {
      j(paramBoolean, paramString);
      return;
    }
    if (!localWepkgVersion.kfX)
    {
      g.a(1, localWepkgVersion.kfA, "", localWepkgVersion.downloadUrl, localWepkgVersion.kfV, localWepkgVersion.version, localWepkgVersion.bKg, localWepkgVersion.kfm, new h.2(this, local1, paramBoolean, paramString));
      return;
    }
    local1.a(null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */