package com.tencent.mm.plugin.appbrand.jsapi.f.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.e.b;
import com.tencent.mm.plugin.appbrand.r.b.a;
import com.tencent.mm.plugin.appbrand.r.b.a.b;
import com.tencent.mm.pluginsdk.q;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class b
{
  public static SensorManager ejl;
  private static HashMap<String, HashMap<String, c>> fSQ = new HashMap();
  private static HashMap<String, e.b> fSR = new HashMap();
  private static Set<c> fSS = new HashSet();
  public static com.tencent.mm.plugin.appbrand.r.b.b fST;
  public static a fSU;
  
  public static c E(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt2 == -1)
    {
      x.e("MicroMsg.AppBrandMapManager", "[getMapView]INVALID_MAP_ID");
      return null;
    }
    synchronized (fSQ)
    {
      paramString = (HashMap)fSQ.get(paramString);
      if (paramString == null) {
        return null;
      }
      paramString = (c)paramString.get(paramInt1 + "&" + paramInt2);
      return paramString;
    }
  }
  
  public static void F(String paramString, int paramInt1, int paramInt2)
  {
    HashMap localHashMap1;
    synchronized (fSQ)
    {
      localHashMap1 = (HashMap)fSQ.get(paramString);
      if (localHashMap1 == null) {
        return;
      }
      ??? = (c)localHashMap1.get(paramInt1 + "&" + paramInt2);
      if (??? == null)
      {
        x.e("MicroMsg.AppBrandMapManager", "[destroyMapView] mapview not exist, err");
        return;
      }
    }
    x.i("MicroMsg.AppBrandMapManager", "destoryMapView appId:%s, componentId:%d, mapId:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    localHashMap1.remove(paramInt1 + "&" + paramInt2);
    if (localHashMap1.size() <= 0) {
      synchronized (fSQ)
      {
        fSQ.remove(paramString);
        b((c)???);
        x.i("MicroMsg.AppBrandMapManager", "[uninitLifeListener] appId:%s", new Object[] { paramString });
        synchronized (fSR)
        {
          e.b localb = (e.b)fSR.get(paramString);
          if (localb != null) {
            e.b(paramString, localb);
          }
        }
      }
    }
    synchronized (fSR)
    {
      fSR.remove(paramString);
      ((c)???).onPause();
      ((c)???).onDestroy();
      x.i("MicroMsg.AppBrandMapManager", "[destroyMapView]appid:%s, map count:%d", new Object[] { paramString, Integer.valueOf(localHashMap1.size()) });
      return;
      paramString = finally;
      throw paramString;
      paramString = finally;
      throw paramString;
    }
  }
  
  public static c a(Context paramContext, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt2 == -1)
    {
      x.e("MicroMsg.AppBrandMapManager", "[createMapView]INVALID_MAP_ID");
      paramContext = null;
      return paramContext;
    }
    label365:
    for (;;)
    {
      synchronized (fSQ)
      {
        ??? = (HashMap)fSQ.get(paramString);
        if (??? != null) {
          break label365;
        }
        localObject2 = new HashMap();
        fSQ.put(paramString, localObject2);
        synchronized (fSR)
        {
          e.b localb = (e.b)fSR.get(paramString);
          ??? = localObject2;
          if (localb == null)
          {
            x.i("MicroMsg.AppBrandMapManager", "[initLifeListener] appId:%s", new Object[] { paramString });
            ??? = new b.2(paramString);
            fSR.put(paramString, ???);
            ??? = localObject2;
          }
          localObject2 = (c)((HashMap)???).get(paramInt1 + "&" + paramInt2);
          if (localObject2 != null)
          {
            x.i("MicroMsg.AppBrandMapManager", "map is exist, return");
            paramString = ((c)localObject2).getView();
            paramContext = (Context)localObject2;
            if (paramString == null) {
              break;
            }
            paramContext = (Context)localObject2;
            if (!ViewGroup.class.isInstance(paramString.getParent())) {
              break;
            }
            ((ViewGroup)paramString.getParent()).removeView(paramString);
            return (c)localObject2;
          }
        }
      }
      x.i("MicroMsg.AppBrandMapManager", "createMapView appId:%s, componentId:%d mapId:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      Object localObject2 = ((com.tencent.mm.plugin.appbrand.compat.a.c)g.l(com.tencent.mm.plugin.appbrand.compat.a.c.class)).l(paramContext, paramBoolean);
      ((com.tencent.mm.plugin.appbrand.compat.a.b)localObject2).adv();
      ((com.tencent.mm.plugin.appbrand.compat.a.b)localObject2).onResume();
      paramContext = new c(paramContext, paramString, paramInt2, (com.tencent.mm.plugin.appbrand.compat.a.b)localObject2);
      ((HashMap)???).put(paramInt1 + "&" + paramInt2, paramContext);
      x.i("MicroMsg.AppBrandMapManager", "appId:%s, map count:%d", new Object[] { paramString, Integer.valueOf(((HashMap)???).size()) });
      return paramContext;
    }
  }
  
  public static void a(c paramc)
  {
    try
    {
      x.i("MicroMsg.AppBrandMapManager", "registerListener map:%s", new Object[] { paramc });
      fSS.add(paramc);
      if (fSS.size() == 1) {
        init();
      }
      return;
    }
    finally
    {
      paramc = finally;
      throw paramc;
    }
  }
  
  public static void b(c paramc)
  {
    try
    {
      x.i("MicroMsg.AppBrandMapManager", "unregisterListener map:%s", new Object[] { paramc });
      fSS.remove(paramc);
      if (fSS.size() == 0) {
        uninit();
      }
      return;
    }
    finally
    {
      paramc = finally;
      throw paramc;
    }
  }
  
  private static void init()
  {
    try
    {
      x.i("MicroMsg.AppBrandMapManager", "init");
      if (fST == null)
      {
        fST = new b.1();
        a.b.aoC().a(fST);
      }
      if (fSU == null)
      {
        fSU = new a();
        Object localObject1 = (SensorManager)ad.getContext().getSystemService("sensor");
        ejl = (SensorManager)localObject1;
        localObject1 = ((SensorManager)localObject1).getDefaultSensor(3);
        ejl.registerListener(fSU, (Sensor)localObject1, 1);
      }
      return;
    }
    finally {}
  }
  
  private static void uninit()
  {
    try
    {
      x.i("MicroMsg.AppBrandMapManager", "uninit");
      if (fST != null)
      {
        x.i("MicroMsg.AppBrandMapManager", "locationListener uninit");
        a.b.aoC().b(fST);
        fST = null;
      }
      if ((fSU != null) && (ejl != null))
      {
        x.i("MicroMsg.AppBrandMapManager", "sensorListener uninit");
        ejl.unregisterListener(fSU);
        ejl = null;
        fSU = null;
      }
      return;
    }
    finally {}
  }
  
  private static final class a
    implements SensorEventListener
  {
    private float fSV = 0.0F;
    private long timestamp = 200L;
    
    public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
    
    public final void onSensorChanged(SensorEvent arg1)
    {
      if (???.sensor.getType() == 3)
      {
        long l1 = System.currentTimeMillis();
        long l2 = this.timestamp;
        float f1 = q.ay(???.values[0]);
        if ((l1 - l2 > 200L) && (Math.abs(f1 - this.fSV) > 3.0F))
        {
          synchronized (b.AW())
          {
            Iterator localIterator1 = b.AW().values().iterator();
            Object localObject2;
            float f2;
            do
            {
              do
              {
                Iterator localIterator2;
                while (!localIterator2.hasNext())
                {
                  if (!localIterator1.hasNext()) {
                    break;
                  }
                  localIterator2 = ((HashMap)localIterator1.next()).values().iterator();
                }
                localObject2 = (c)localIterator2.next();
              } while ((localObject2 == null) || (!((c)localObject2).fSX) || (((c)localObject2).isBackground) || (((c)localObject2).fSY == null));
              localObject2 = ((c)localObject2).fSY;
              ((d)localObject2).fTV = f1;
              f2 = ((d)localObject2).getHeading();
            } while (((d)localObject2).fTv == null);
            x.d("MicroMsg.AppbrandMapLocationPoint", "updateRotation rotation:%f", new Object[] { Float.valueOf(f2) });
            ((d)localObject2).fTv.setRotation(f2);
          }
          this.fSV = f1;
          this.timestamp = System.currentTimeMillis();
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */