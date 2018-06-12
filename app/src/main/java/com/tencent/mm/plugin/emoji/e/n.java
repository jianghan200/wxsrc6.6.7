package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.gif.MMWXGFJNI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class n
{
  private static boolean igU = false;
  private static boolean igV = false;
  private static boolean igW = false;
  private static boolean igX = false;
  
  public static boolean aEg()
  {
    return (g.AT().getInt("EmotionRewardOption", 0) & 0x1) != 1;
  }
  
  public static boolean aEh()
  {
    return (g.AT().getInt("EmotionRewardOption", 0) & 0x2) != 2;
  }
  
  public static boolean aEi()
  {
    boolean bool = false;
    if ((g.AT().getInt("EmotionRewardOption", 0) & 0x4) == 4) {
      bool = true;
    }
    return bool;
  }
  
  public static int aEj()
  {
    return bi.getInt(g.AT().getValue("CustomEmojiMaxSize"), 150);
  }
  
  public static String aEk()
  {
    return g.AT().getValue("C2CEmojiNotAutoDownloadTimeRange");
  }
  
  public static String aEl()
  {
    return g.AT().getValue("EmotionPanelConfigName");
  }
  
  public static boolean aEm()
  {
    com.tencent.mm.storage.c localc;
    if (!igU)
    {
      localc = com.tencent.mm.model.c.c.Jx().fJ("100296");
      if (!localc.isValid()) {
        break label276;
      }
    }
    label276:
    for (int i = bi.getInt((String)localc.ckq().get("EnableEmoticonExternUrl"), 0);; i = 0)
    {
      int j = g.AT().getInt("EnableEmoticonExternUrl", 0);
      int k = MMWXGFJNI.getErrorCode();
      if (((j & 0x1) == 1) || ((i & 0x1) == 1)) {
        if ((!aEo()) && (!aEp()))
        {
          igW = true;
          if (k < 0)
          {
            igW = false;
            switch (k)
            {
            }
          }
        }
      }
      for (;;)
      {
        igU = true;
        x.i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcDownload:%b", new Object[] { Boolean.valueOf(igW) });
        return igW;
        igW = false;
        break;
        igW = false;
        break;
        h.mEJ.a(711L, 5L, 1L, false);
        continue;
        h.mEJ.a(711L, 6L, 1L, false);
        continue;
        h.mEJ.a(711L, 7L, 1L, false);
        continue;
        h.mEJ.a(711L, 8L, 1L, false);
        continue;
        h.mEJ.a(711L, 9L, 1L, false);
        continue;
        h.mEJ.a(711L, 10L, 1L, false);
      }
    }
  }
  
  public static boolean aEn()
  {
    int k;
    if (!igV)
    {
      int i = 0;
      com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100296");
      if (localc.isValid()) {
        i = bi.getInt((String)localc.ckq().get("EnableEmoticonExternUrl"), 0);
      }
      int j = g.AT().getInt("EnableEmoticonExternUrl", 0);
      k = MMWXGFJNI.getErrorCode();
      if (((j & 0x2) != 2) && ((i & 0x2) != 2)) {
        break label147;
      }
      if ((aEo()) || (aEp())) {
        break label135;
      }
      igX = true;
      h.mEJ.a(711L, 1L, 1L, false);
    }
    for (;;)
    {
      if (k < 0) {
        igX = false;
      }
      igV = true;
      x.i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcDecode:%b", new Object[] { Boolean.valueOf(igX) });
      return igX;
      label135:
      h.mEJ.a(711L, 0L, 1L, false);
      label147:
      igX = false;
    }
  }
  
  private static boolean aEo()
  {
    PackageManager localPackageManager = ad.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app.cn", 1);
      return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
  
  private static boolean aEp()
  {
    PackageManager localPackageManager = ad.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app", 1);
      return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/e/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */