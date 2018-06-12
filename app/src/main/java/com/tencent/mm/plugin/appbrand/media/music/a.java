package com.tencent.mm.plugin.appbrand.media.music;

import android.text.TextUtils;
import com.tencent.mm.an.b;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class a
{
  public String bKC;
  public String bPg;
  public int bPh;
  private HashMap<String, c> dRX = new HashMap();
  public String ghU;
  public String ghV;
  
  public final void a(c paramc, String paramString)
  {
    if (this.dRX.get(paramString) != null)
    {
      x.i("MicroMsg.AppBrandMusicPlayerManager", "listeners already add appid: %s", new Object[] { paramString });
      return;
    }
    com.tencent.mm.sdk.b.a.sFg.b(paramc);
    this.dRX.put(paramString, paramc);
  }
  
  public final boolean bE(String paramString1, String paramString2)
  {
    if (paramString2.equalsIgnoreCase("play")) {
      x.i("MicroMsg.AppBrandMusicPlayerManager", "play option appid %s, pre appid %s", new Object[] { paramString1, this.ghU });
    }
    do
    {
      return true;
      if (!paramString1.equalsIgnoreCase(this.ghU)) {
        break;
      }
      paramString1 = b.Qa();
    } while ((paramString1 != null) && (paramString1.rsp.equals(this.ghV)));
    return false;
  }
  
  public final void tl(String paramString)
  {
    if (this.dRX.get(paramString) == null)
    {
      x.i("MicroMsg.AppBrandMusicPlayerManager", "listeners already remove appid: %s", new Object[] { paramString });
      return;
    }
    com.tencent.mm.sdk.b.a.sFg.c((c)this.dRX.remove(paramString));
    this.dRX.remove(paramString);
  }
  
  public final boolean uu(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.AppBrandMusicPlayerManager", "appId is empty");
      return false;
    }
    if (!paramString.equalsIgnoreCase(this.ghU))
    {
      x.e("MicroMsg.AppBrandMusicPlayerManager", "appId is not equals pre play id");
      return false;
    }
    if (TextUtils.isEmpty(this.ghV))
    {
      x.e("MicroMsg.AppBrandMusicPlayerManager", "now app not play music");
      return false;
    }
    paramString = b.Qa();
    if (paramString == null)
    {
      x.e("MicroMsg.AppBrandMusicPlayerManager", "wrapper is null");
      return false;
    }
    if (!this.ghV.equalsIgnoreCase(paramString.rsp))
    {
      x.e("MicroMsg.AppBrandMusicPlayerManager", "musicId is diff");
      return false;
    }
    if (!b.PY())
    {
      x.i("MicroMsg.AppBrandMusicPlayerManager", "MusicHelper.isPlayingMusic FALSE");
      return false;
    }
    return true;
  }
  
  private static final class a
  {
    private static a ghW = new a((byte)0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/music/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */