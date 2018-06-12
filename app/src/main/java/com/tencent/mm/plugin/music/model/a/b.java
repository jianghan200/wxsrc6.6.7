package com.tencent.mm.plugin.music.model.a;

import android.text.TextUtils;
import com.tencent.mm.an.a;
import com.tencent.mm.plugin.music.cache.e;
import com.tencent.mm.plugin.music.model.g;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  private static aa<String, String> lyD = new aa(20);
  private static aa<String, Long> lyE = new aa(20);
  
  public static String Iw(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (lyD.bb(paramString))) {}
    for (String str = (String)lyD.get(paramString); str == null; str = null) {
      return paramString;
    }
    return str;
  }
  
  public static boolean Ix(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    while (!paramString.contains("wxshakemusic")) {
      return false;
    }
    return true;
  }
  
  public static String Iy(String paramString)
  {
    String str = paramString;
    if (Ix(paramString))
    {
      int i = paramString.lastIndexOf("wxshakemusic");
      str = paramString;
      if (i > 1) {
        str = paramString.substring(0, i - 1);
      }
    }
    return str;
  }
  
  public static void dU(String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      return;
    }
    lyD.put(paramString1, paramString2);
    lyE.put(paramString1, Long.valueOf(System.currentTimeMillis()));
  }
  
  public static void h(a parama)
  {
    boolean bool2 = true;
    boolean bool1 = false;
    if (parama == null)
    {
      x.e("MicroMsg.Music.MusicUrlParser", "GetShakeMusicUrl, music is null");
      return;
    }
    boolean bool3 = ao.isWifi(ad.getContext());
    PBool localPBool = new PBool();
    String str;
    int i;
    label106:
    int j;
    if (bi.oW(parama.field_songWifiUrl))
    {
      str = parama.field_songWebUrl;
      str = g.a(str, parama.field_songWapLinkUrl, bool3, localPBool);
      x.i("MicroMsg.Music.MusicUrlParser", "parsePlayUrl mSrc:%s", new Object[] { str });
      x.i("MicroMsg.Music.MusicUrlParser", "songWifiUrl:%s", new Object[] { parama.field_songWifiUrl });
      if (!bool3) {
        break label192;
      }
      i = 1;
      if (!localPBool.value) {
        break label197;
      }
      j = 1;
      label116:
      x.i("MicroMsg.Music.MusicUrlParser", "isWifi:%d, isQQMusic:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      if (bool3) {
        bool1 = localPBool.value;
      }
      if (!com.tencent.mm.plugin.music.d.b.IG(str)) {
        break label202;
      }
      x.i("MicroMsg.Music.MusicUrlParser", "can match shake music wifi url");
      bool1 = bool2;
    }
    label192:
    label197:
    label202:
    for (;;)
    {
      parama.playUrl = str;
      e.aH(str, bool1);
      return;
      str = parama.field_songWifiUrl;
      break;
      i = 0;
      break label106;
      j = 0;
      break label116;
    }
  }
  
  public static boolean i(a parama)
  {
    if ((parama == null) || (TextUtils.isEmpty(parama.playUrl))) {
      return false;
    }
    if (!Ix(parama.playUrl)) {
      return false;
    }
    if (g.tB(parama.field_musicType))
    {
      if (e.c(parama))
      {
        x.i("MicroMsg.Music.MusicUrlParser", "qq music pieceFile cache is valid");
        return false;
      }
    }
    else if (e.b(parama))
    {
      x.i("MicroMsg.Music.MusicUrlParser", "music cache is valid");
      return false;
    }
    if (!lyD.bb(parama.playUrl)) {
      return true;
    }
    long l = 0L;
    if (lyE.bb(parama.playUrl)) {
      l = ((Long)lyE.get(parama.playUrl)).longValue();
    }
    if (System.currentTimeMillis() - l > 86400000L)
    {
      lyD.remove(parama.playUrl);
      lyE.remove(parama.playUrl);
      x.i("MicroMsg.Music.MusicUrlParser", "shake music url in cache is timeout");
      return true;
    }
    return false;
  }
  
  public static String mv(String paramString)
  {
    String str = Iw(paramString);
    if ((!TextUtils.isEmpty(str)) && (!str.equalsIgnoreCase(paramString)))
    {
      x.i("MicroMsg.Music.MusicUrlParser", "use temp shake music url to play:%s", new Object[] { str });
      return str;
    }
    if (Ix(paramString))
    {
      paramString = Iy(str);
      x.i("MicroMsg.Music.MusicUrlParser", "play url :%s", new Object[] { paramString });
      return paramString;
    }
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/music/model/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */