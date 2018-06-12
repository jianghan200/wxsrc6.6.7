package com.tencent.mm.plugin.music.cache;

import android.text.TextUtils;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCInteger;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest;
import com.tencent.mm.plugin.music.cache.ipc.a.a;
import com.tencent.mm.plugin.music.cache.ipc.a.b;
import com.tencent.mm.plugin.music.cache.ipc.a.d;
import com.tencent.mm.plugin.music.cache.ipc.a.e;
import com.tencent.mm.plugin.music.cache.ipc.a.h;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.File;
import java.util.Map;

public final class e
{
  private static aa<String, Boolean> lxA = new aa(20);
  private static aa<String, Integer> lxB = new aa(20);
  private static aa<String, Integer> lxC = new aa(20);
  private static aa<String, Long> lxD = new aa(20);
  private static aa<String, String> lxE = new aa(20);
  private static String lxF = null;
  private static int lxG = 0;
  private static aa<String, String> lxz = new aa(20);
  
  public static String Gq()
  {
    if (lxF != null) {
      return lxF;
    }
    Object localObject = (IPCString)XIPCInvoker.a("com.tencent.mm", null, a.a.class);
    if (localObject == null) {}
    for (localObject = null; TextUtils.isEmpty((CharSequence)localObject); localObject = ((IPCString)localObject).value)
    {
      x.i("MicroMsg.Music.PieceCacheHelper", "retAccPath:%s is invalid", new Object[] { localObject });
      return com.tencent.mm.compatible.util.e.bnE;
    }
    x.i("MicroMsg.Music.PieceCacheHelper", "getAccPath retAccPath:%s", new Object[] { localObject });
    lxF = (String)localObject;
    return (String)localObject;
  }
  
  public static void Ii(String paramString)
  {
    Object localObject = (IPCString)XIPCInvoker.a("com.tencent.mm", new IPCString(paramString), a.h.class);
    if (localObject == null) {}
    for (localObject = com.tencent.mm.plugin.music.d.a.IE(paramString);; localObject = ((IPCString)localObject).value)
    {
      if ((!TextUtils.isEmpty((CharSequence)localObject)) && (!TextUtils.isEmpty(paramString)) && (!TextUtils.isEmpty((CharSequence)localObject))) {
        lxz.put(paramString, localObject);
      }
      return;
    }
  }
  
  public static String Ij(String paramString)
  {
    if (lxz.bb(paramString)) {
      return (String)lxz.get(paramString);
    }
    return "";
  }
  
  public static boolean Ik(String paramString)
  {
    if (lxA.bb(paramString)) {
      return ((Boolean)lxA.get(paramString)).booleanValue();
    }
    return false;
  }
  
  public static String Il(String paramString)
  {
    paramString = Ij(paramString);
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.Music.PieceCacheHelper", "getMusicMIMEType musicId is empty!");
      return null;
    }
    paramString = (IPCString)XIPCInvoker.a("com.tencent.mm", new IPCString(paramString), a.b.class);
    if (paramString == null) {
      return null;
    }
    return paramString.value;
  }
  
  public static String Im(String paramString)
  {
    if (lxE.bb(paramString)) {
      return (String)lxE.get(paramString);
    }
    return null;
  }
  
  public static long In(String paramString)
  {
    if (lxD.bb(paramString)) {
      return ((Long)lxD.get(paramString)).longValue();
    }
    return -1L;
  }
  
  public static long Io(String paramString)
  {
    paramString = new File(com.tencent.mm.plugin.music.d.a.IF(paramString));
    if (paramString.exists()) {
      return paramString.length();
    }
    return -1L;
  }
  
  public static int Ip(String paramString)
  {
    if ((paramString != null) && (lxB.bb(paramString))) {
      return ((Integer)lxB.get(paramString)).intValue();
    }
    return 0;
  }
  
  public static int Iq(String paramString)
  {
    if ((paramString != null) && (lxC.bb(paramString))) {
      return ((Integer)lxC.get(paramString)).intValue();
    }
    return 0;
  }
  
  public static void Z(String paramString, long paramLong)
  {
    if (paramLong > 0L) {
      lxD.put(paramString, Long.valueOf(paramLong));
    }
  }
  
  public static void aH(String paramString, boolean paramBoolean)
  {
    if (!TextUtils.isEmpty(paramString)) {
      lxA.put(paramString, Boolean.valueOf(paramBoolean));
    }
  }
  
  public static boolean b(com.tencent.mm.an.a parama)
  {
    boolean bool = ao.isWifi(ad.getContext());
    int i;
    if (bool) {
      if (parama.field_wifiEndFlag == 1) {
        i = 1;
      }
    }
    while ((i != 0) && (new File(com.tencent.mm.plugin.music.d.a.g(parama, bool)).exists()))
    {
      return true;
      i = 0;
      continue;
      if (parama.field_endFlag == 1) {
        i = 1;
      } else {
        i = 0;
      }
    }
    return false;
  }
  
  public static void bL(String paramString, int paramInt)
  {
    if (paramString != null) {
      lxB.put(paramString, Integer.valueOf(paramInt));
    }
  }
  
  public static void bM(String paramString, int paramInt)
  {
    if (paramString != null) {
      lxC.put(paramString, Integer.valueOf(paramInt));
    }
  }
  
  public static int bhL()
  {
    if (lxG != 0) {
      return lxG;
    }
    IPCInteger localIPCInteger = (IPCInteger)XIPCInvoker.a("com.tencent.mm", new IPCInteger(3), a.d.class);
    if (localIPCInteger == null) {}
    for (int i = 3;; i = localIPCInteger.value)
    {
      lxG = i;
      x.i("MicroMsg.Music.PieceCacheHelper", "sRemovePlayingAudioPlayerGroupCount:%d", new Object[] { Integer.valueOf(lxG) });
      if (lxG == 0) {
        lxG = 3;
      }
      return lxG;
    }
  }
  
  public static boolean c(com.tencent.mm.an.a parama)
  {
    int i;
    if ((parama == null) || (TextUtils.isEmpty(parama.playUrl))) {
      i = 0;
    }
    while (i != 0)
    {
      parama = parama.playUrl;
      Logger.i("MicroMsg.PieceFileCache", "existFileByUrl");
      parama = com.tencent.mm.plugin.music.d.a.IF(parama);
      Logger.i("MicroMsg.PieceFileCache", "existFile, fileName:" + parama);
      boolean bool = new File(parama).exists();
      x.i("MicroMsg.PieceFileCache", "the piece File exist:%b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        break;
      }
      return true;
      Object localObject = com.tencent.mm.plugin.music.d.a.IE(parama.playUrl);
      localObject = ((com.tencent.mm.an.a.a)g.l(com.tencent.mm.an.a.a.class)).mr((String)localObject);
      if ((localObject != null) && (((com.tencent.mm.an.f)localObject).field_fileCacheComplete == 1)) {
        i = 1;
      } else {
        i = 0;
      }
    }
    return false;
  }
  
  public static void dR(String paramString1, String paramString2)
  {
    x.i("MicroMsg.Music.PieceCacheHelper", "setMusicMIMEType mimeType:%s", new Object[] { paramString2 });
    paramString1 = Ij(paramString1);
    if (TextUtils.isEmpty(paramString1))
    {
      x.e("MicroMsg.Music.PieceCacheHelper", "setMusicMIMEType musicId is empty!");
      return;
    }
    IPCAudioParamRequest localIPCAudioParamRequest = new IPCAudioParamRequest();
    localIPCAudioParamRequest.lxx = paramString1;
    localIPCAudioParamRequest.mimeType = paramString2;
    XIPCInvoker.a("com.tencent.mm", localIPCAudioParamRequest, a.e.class);
  }
  
  public static void dS(String paramString1, String paramString2)
  {
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2))) {
      lxE.put(paramString1, paramString2);
    }
  }
  
  public static void deleteFile(String paramString)
  {
    Logger.i("MicroMsg.PieceFileCache", "deleteFileByUrl");
    f.deleteFile(com.tencent.mm.plugin.music.d.a.IF(paramString));
  }
  
  public static void k(String paramString, Map<String, String> paramMap)
  {
    if ((paramMap != null) && (Ik(paramString)))
    {
      paramMap.put("Cookie", "qqmusic_fromtag=97;qqmusic_uin=1234567;qqmusic_key=;");
      paramMap.put("referer", "stream12.qqmusic.qq.com");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/music/cache/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */