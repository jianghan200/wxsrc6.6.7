package com.tencent.tinker.loader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.ArrayMap;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class TinkerResourcePatcher
{
  private static Method vtA = null;
  private static Field vtB = null;
  private static Field vtC = null;
  private static Field vtD = null;
  private static Field vtE = null;
  private static Field vtF = null;
  private static Field vtG = null;
  private static Field vtH = null;
  private static Collection<WeakReference<Resources>> vtw = null;
  private static Object vtx = null;
  private static AssetManager vty = null;
  private static Method vtz = null;
  
  public static void bQ(Context paramContext, String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return;
      Object localObject2 = paramContext.getApplicationInfo();
      int j;
      int i;
      if (Build.VERSION.SDK_INT < 27)
      {
        localObject1 = new Field[] { vtE, vtF };
        j = localObject1.length;
        i = 0;
      }
      for (;;)
      {
        if (i >= j) {
          break label171;
        }
        Iterator localIterator = ((Map)localObject1[i].get(vtx)).entrySet().iterator();
        for (;;)
        {
          if (localIterator.hasNext())
          {
            Object localObject4 = ((WeakReference)((Map.Entry)localIterator.next()).getValue()).get();
            if (localObject4 != null)
            {
              String str = (String)vtD.get(localObject4);
              if (((ApplicationInfo)localObject2).sourceDir.equals(str))
              {
                vtD.set(localObject4, paramString);
                continue;
                localObject1 = new Field[] { vtE };
                break;
              }
            }
          }
        }
        i += 1;
      }
      label171:
      if (((Integer)vtz.invoke(vty, new Object[] { paramString })).intValue() == 0) {
        throw new IllegalStateException("Could not create new AssetManager");
      }
      if ((vtH != null) && (vtA != null))
      {
        vtH.set(vty, null);
        vtA.invoke(vty, new Object[0]);
      }
      Object localObject1 = vtw.iterator();
      for (;;)
      {
        if (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Resources)((WeakReference)((Iterator)localObject1).next()).get();
          if (localObject2 == null) {
            continue;
          }
          try
          {
            vtB.set(localObject2, vty);
            c((Resources)localObject2);
            ((Resources)localObject2).updateConfiguration(((Resources)localObject2).getConfiguration(), ((Resources)localObject2).getDisplayMetrics());
          }
          catch (Throwable localThrowable)
          {
            for (;;)
            {
              Object localObject3 = vtC.get(localObject2);
              ShareReflectUtil.b(localObject3, "mAssets").set(localObject3, vty);
            }
          }
        }
      }
      if (Build.VERSION.SDK_INT >= 24) {}
      try
      {
        if (vtG != null) {
          vtG.set(paramContext.getApplicationInfo(), paramString);
        }
        if (hS(paramContext)) {
          continue;
        }
        throw new TinkerRuntimeException("checkResInstall failed");
      }
      catch (Throwable paramString)
      {
        for (;;) {}
      }
    }
  }
  
  private static void c(Resources paramResources)
  {
    try
    {
      paramResources = ShareReflectUtil.d(Resources.class, "mTypedArrayPool").get(paramResources);
      Method localMethod = ShareReflectUtil.b(paramResources, "acquire", new Class[0]);
      Object localObject;
      do
      {
        localObject = localMethod.invoke(paramResources, new Object[0]);
      } while (localObject != null);
      return;
    }
    catch (Throwable paramResources)
    {
      new StringBuilder("clearPreloadTypedArrayIssue failed, ignore error: ").append(paramResources);
    }
  }
  
  public static void hR(Context paramContext)
  {
    Object localObject2 = Class.forName("android.app.ActivityThread");
    vtx = ShareReflectUtil.c(paramContext, (Class)localObject2);
    try
    {
      localObject1 = Class.forName("android.app.LoadedApk");
      vtD = ShareReflectUtil.d((Class)localObject1, "mResDir");
      vtE = ShareReflectUtil.d((Class)localObject2, "mPackages");
      if (Build.VERSION.SDK_INT < 27) {
        vtF = ShareReflectUtil.d((Class)localObject2, "mResourcePackages");
      }
      localObject1 = paramContext.getAssets();
      vtz = ShareReflectUtil.b(localObject1, "addAssetPath", new Class[] { String.class });
    }
    catch (ClassNotFoundException localThrowable1)
    {
      try
      {
        Object localObject1;
        vtH = ShareReflectUtil.b(localObject1, "mStringBlocks");
        vtA = ShareReflectUtil.b(localObject1, "ensureStringBlocks", new Class[0]);
        vty = (AssetManager)ShareReflectUtil.a(localObject1, new Class[0]).newInstance(new Object[0]);
        if (Build.VERSION.SDK_INT >= 19)
        {
          localObject1 = Class.forName("android.app.ResourcesManager");
          localObject2 = ShareReflectUtil.c((Class)localObject1, "getInstance", new Class[0]).invoke(null, new Object[0]);
        }
        for (;;)
        {
          try
          {
            vtw = ((ArrayMap)ShareReflectUtil.d((Class)localObject1, "mActiveResources").get(localObject2)).values();
            if (vtw != null) {
              break label246;
            }
            throw new IllegalStateException("resource references is null");
            localClassNotFoundException = localClassNotFoundException;
            localClass = Class.forName("android.app.ActivityThread$PackageInfo");
          }
          catch (NoSuchFieldException localNoSuchFieldException)
          {
            Class localClass;
            vtw = (Collection)ShareReflectUtil.d(localClass, "mResourceReferences").get(localObject2);
            continue;
          }
          vtw = ((HashMap)ShareReflectUtil.d((Class)localObject2, "mActiveResources").get(vtx)).values();
        }
        label246:
        paramContext = paramContext.getResources();
        if (Build.VERSION.SDK_INT >= 24) {}
        for (;;)
        {
          try
          {
            vtC = ShareReflectUtil.b(paramContext, "mResourcesImpl");
          }
          catch (Throwable localThrowable1)
          {
            try
            {
              vtG = ShareReflectUtil.d(ApplicationInfo.class, "publicSourceDir");
              return;
            }
            catch (NoSuchFieldException paramContext)
            {
              return;
            }
            localThrowable1 = localThrowable1;
            vtB = ShareReflectUtil.b(paramContext, "mAssets");
            continue;
          }
          vtB = ShareReflectUtil.b(paramContext, "mAssets");
        }
      }
      catch (Throwable localThrowable2)
      {
        for (;;) {}
      }
    }
  }
  
  private static boolean hS(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getAssets().open("only_use_to_test_tinker_resource.txt");
      SharePatchFileUtil.ar(paramContext);
      return true;
    }
    catch (Throwable paramContext)
    {
      new StringBuilder("checkResUpdate failed, can't find test resource assets file only_use_to_test_tinker_resource.txt e:").append(paramContext.getMessage());
      return false;
    }
    finally
    {
      SharePatchFileUtil.ar(null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/TinkerResourcePatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */