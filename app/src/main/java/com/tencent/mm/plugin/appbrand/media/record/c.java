package com.tencent.mm.plugin.appbrand.media.record;

import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class c
{
  private static Map<String, com.tencent.mm.sdk.b.c> gij = new HashMap();
  private static ArrayList<String> gik = new ArrayList();
  private static boolean gil = false;
  
  public static void alb()
  {
    if (gil)
    {
      x.i("MicroMsg.Record.AppBrandRecordClientService", "update device info done!");
      return;
    }
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run() {}
    }, "record_update_device_info");
  }
  
  public static void b(String paramString, com.tencent.mm.sdk.b.c paramc)
  {
    if (gij.containsKey(paramString))
    {
      x.e("MicroMsg.Record.AppBrandRecordClientService", "appId:%s has add listener", new Object[] { paramString });
      return;
    }
    if (paramc == null)
    {
      x.e("MicroMsg.Record.AppBrandRecordClientService", "listener is null");
      return;
    }
    x.i("MicroMsg.Record.AppBrandRecordClientService", "addRecordListener,appId:%s", new Object[] { paramString });
    gij.put(paramString, paramc);
    if (!gik.contains(paramString)) {
      gik.add(paramString);
    }
    a.sFg.a(paramc);
  }
  
  public static void onCreate() {}
  
  public static void onDestroy()
  {
    x.i("MicroMsg.Record.AppBrandRecordClientService", "onDestroy");
    Object localObject1 = gik.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (String)((Iterator)localObject1).next();
      localObject2 = (com.tencent.mm.sdk.b.c)gij.remove(localObject2);
      if (localObject2 != null) {
        a.sFg.c((com.tencent.mm.sdk.b.c)localObject2);
      }
    }
    gij.clear();
    gik.clear();
    localObject1 = e.ale();
    x.i("MicroMsg.Record.AudioRecordMgr", "destroy");
    if ((((e)localObject1).gix == e.a.giK) || (((e)localObject1).gix == e.a.giL) || (((e)localObject1).gix == e.a.giO)) {
      ((e)localObject1).we();
    }
  }
  
  public static void uv(String paramString)
  {
    if (!gij.containsKey(paramString)) {
      x.e("MicroMsg.Record.AppBrandRecordClientService", "appId:%s not exist the appId for listener", new Object[] { paramString });
    }
    do
    {
      return;
      x.i("MicroMsg.Record.AppBrandRecordClientService", "removeRecordListener,appId:%s", new Object[] { paramString });
      gik.remove(paramString);
      paramString = (com.tencent.mm.sdk.b.c)gij.remove(paramString);
    } while (paramString == null);
    a.sFg.c(paramString);
  }
  
  private static final class a
    implements i<IPCVoid, IPCString>
  {
    private static IPCString alc()
    {
      try
      {
        x.i("MicroMsg.Record.AppBrandRecordClientService", "ipc updateDeviceInfo");
        IPCString localIPCString = new IPCString(g.Ei().DU().cmX());
        return localIPCString;
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.Record.AppBrandRecordClientService", localException, "ipc updateDeviceInfo task", new Object[0]);
      }
      return new IPCString("");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/record/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */