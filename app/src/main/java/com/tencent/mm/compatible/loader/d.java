package com.tencent.mm.compatible.loader;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.q;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  private static Map<String, String> dfN;
  
  public static String y(Context paramContext, String paramString)
  {
    l = bi.VF();
    if (dfN == null) {}
    try
    {
      str1 = bi.convertStreamToString(paramContext.getAssets().open("preload/libraries.ini"));
      localObject2 = q.Wi(str1);
      x.v("MicroMsg.PluginClassLoader", "libraries.ini content\n%s", new Object[] { str1 });
      if ((localObject2 != null) && (((Map)localObject2).size() > 0)) {
        break label121;
      }
      x.e("MicroMsg.PluginClassLoader", "parse libraries.ini failed");
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str1;
        x.e("MicroMsg.PluginClassLoader", "load preload libraries failed");
        x.printErrStackTrace("MicroMsg.PluginClassLoader", localException, "", new Object[0]);
      }
      dfN = new HashMap(((Map)localObject2).size());
      Object localObject1 = ((Map)localObject2).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        x.d("MicroMsg.PluginClassLoader", "preload file, plugin=%s, md5=%s", new Object[] { ((Map.Entry)localObject2).getKey(), ((Map.Entry)localObject2).getValue() });
        dfN.put(((Map.Entry)localObject2).getKey(), ((Map.Entry)localObject2).getValue());
      }
      localObject1 = (String)localObject1 + "/" + paramString;
      Object localObject2 = (String)dfN.get(paramString);
      if (localObject2 != null) {
        break label285;
      }
      x.w("MicroMsg.PluginClassLoader", "extractVoipDex not in preloadfiles");
      return null;
      File localFile = new File((String)localObject1);
      if (!localFile.exists()) {
        break label376;
      }
      String str2 = g.m(localFile);
      if ((str2 == null) || (!str2.equalsIgnoreCase((String)localObject2))) {
        break label355;
      }
      x.d("MicroMsg.PluginClassLoader", "extractVoipDex: targetFilePath:[%s] time:%d", new Object[] { localFile, Long.valueOf(bi.bH(l)) });
      return (String)localObject1;
      x.e("MicroMsg.PluginClassLoader", "extractVoipDex target file exists, but md5 check failed, target=%s assets=%s", new Object[] { str2, localObject2 });
      e.deleteFile((String)localObject1);
      if (j.C(paramContext, "preload/" + paramString, (String)localObject1)) {
        break label416;
      }
      x.f("MicroMsg.PluginClassLoader", "extractVoipDex  copyAssets failed");
      return null;
      x.i("MicroMsg.PluginClassLoader", "extractVoipDex time:%d so:%s md5:%s ", new Object[] { Long.valueOf(bi.bH(l)), paramString, localObject2 });
      return (String)localObject1;
    }
    str1 = paramContext.getDir("lib", 0).getAbsolutePath();
    if (dfN == null)
    {
      x.e("MicroMsg.PluginClassLoader", "extractVoipDex preload so files loaded failed");
      return null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/loader/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */