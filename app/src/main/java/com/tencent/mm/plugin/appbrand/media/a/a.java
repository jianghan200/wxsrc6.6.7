package com.tencent.mm.plugin.appbrand.media.a;

import android.text.TextUtils;
import com.tencent.mm.plugin.appbrand.jsapi.audio.b;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
  private static Map<String, c> ghJ = new ConcurrentHashMap();
  private static Map<String, com.tencent.mm.sdk.b.c> ghK = new HashMap();
  private static ArrayList<String> ghL = new ArrayList();
  
  public static void Pa(String paramString)
  {
    x.i("MicroMsg.Audio.AppBrandAudioClientService", "onDestroy");
    b.Pa(paramString);
    ghJ.clear();
    paramString = ghL.iterator();
    while (paramString.hasNext())
    {
      Object localObject = (String)paramString.next();
      localObject = (com.tencent.mm.sdk.b.c)ghK.remove(localObject);
      if (localObject != null) {
        com.tencent.mm.sdk.b.a.sFg.c((com.tencent.mm.sdk.b.c)localObject);
      }
    }
    ghK.clear();
    ghL.clear();
  }
  
  public static void a(String paramString, c paramc)
  {
    ghJ.put(paramString, paramc);
  }
  
  public static void a(String paramString, com.tencent.mm.sdk.b.c paramc)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.Audio.AppBrandAudioClientService", "appId is empty");
      return;
    }
    if (paramc == null)
    {
      x.e("MicroMsg.Audio.AppBrandAudioClientService", "listener is null");
      return;
    }
    if (ghK.containsKey(paramString)) {
      us(paramString);
    }
    x.d("MicroMsg.Audio.AppBrandAudioClientService", "addAudioPlayerListener,appId:%s", new Object[] { paramString });
    ghK.put(paramString, paramc);
    if (!ghL.contains(paramString)) {
      ghL.add(paramString);
    }
    com.tencent.mm.sdk.b.a.sFg.a(paramc);
  }
  
  public static void onCreate(String paramString)
  {
    x.i("MicroMsg.Audio.AppBrandAudioClientService", "onCreate");
    ghJ.clear();
    b.onCreate(paramString);
  }
  
  public static c ur(String paramString)
  {
    return (c)ghJ.get(paramString);
  }
  
  public static void us(String paramString)
  {
    if (!ghK.containsKey(paramString)) {
      x.e("MicroMsg.Audio.AppBrandAudioClientService", "appId:%s not exist the appId for listener", new Object[] { paramString });
    }
    do
    {
      return;
      x.d("MicroMsg.Audio.AppBrandAudioClientService", "removeAudioPlayerListener,appId:%s", new Object[] { paramString });
      ghL.remove(paramString);
      paramString = (com.tencent.mm.sdk.b.c)ghK.remove(paramString);
    } while (paramString == null);
    com.tencent.mm.sdk.b.a.sFg.c(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */