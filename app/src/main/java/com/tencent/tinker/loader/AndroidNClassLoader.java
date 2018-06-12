package com.tencent.tinker.loader;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
class AndroidNClassLoader
  extends PathClassLoader
{
  private static Object vtg = null;
  private final PathClassLoader vth;
  private String vti;
  
  private AndroidNClassLoader(String paramString, PathClassLoader paramPathClassLoader, Application paramApplication)
  {
    super(paramString, paramPathClassLoader.getParent());
    this.vth = paramPathClassLoader;
    paramString = paramApplication.getClass().getName();
    if ((paramString != null) && (!paramString.equals("android.app.Application"))) {
      this.vti = paramString;
    }
  }
  
  public static AndroidNClassLoader a(PathClassLoader paramPathClassLoader, Application paramApplication)
  {
    AndroidNClassLoader localAndroidNClassLoader = new AndroidNClassLoader("", paramPathClassLoader, paramApplication);
    Field localField = ShareReflectUtil.b(paramPathClassLoader, "pathList");
    paramPathClassLoader = localField.get(paramPathClassLoader);
    Constructor localConstructor = ShareReflectUtil.a(paramPathClassLoader, new Class[] { ClassLoader.class, String.class, String.class, File.class });
    Object localObject2 = (Object[])ShareReflectUtil.b(paramPathClassLoader, "dexElements").get(paramPathClassLoader);
    Object localObject1 = (List)ShareReflectUtil.b(paramPathClassLoader, "nativeLibraryDirectories").get(paramPathClassLoader);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject3 = ShareReflectUtil.d(localObject2.getClass().getComponentType(), "dexFile");
    int i = 1;
    int m = localObject2.length;
    int j = 0;
    if (j < m)
    {
      DexFile localDexFile = (DexFile)((Field)localObject3).get(localObject2[j]);
      int k = i;
      if (localDexFile != null)
      {
        if (i == 0) {
          break label182;
        }
        i = 0;
      }
      for (;;)
      {
        localStringBuilder.append(localDexFile.getName());
        k = i;
        j += 1;
        i = k;
        break;
        label182:
        localStringBuilder.append(File.pathSeparator);
      }
    }
    localObject2 = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localObject1 = ((List)localObject1).iterator();
    i = 1;
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (File)((Iterator)localObject1).next();
      if (localObject3 != null)
      {
        if (i != 0) {
          i = 0;
        }
        for (;;)
        {
          localStringBuilder.append(((File)localObject3).getAbsolutePath());
          break;
          localStringBuilder.append(File.pathSeparator);
        }
      }
    }
    localField.set(localAndroidNClassLoader, localConstructor.newInstance(new Object[] { localAndroidNClassLoader, localObject2, localStringBuilder.toString(), null }));
    ShareReflectUtil.b(paramPathClassLoader, "definingContext").set(paramPathClassLoader, localAndroidNClassLoader);
    vtg = paramPathClassLoader;
    paramPathClassLoader = (Context)ShareReflectUtil.b(paramApplication, "mBase").get(paramApplication);
    paramPathClassLoader = ShareReflectUtil.b(paramPathClassLoader, "mPackageInfo").get(paramPathClassLoader);
    ShareReflectUtil.b(paramPathClassLoader, "mClassLoader").set(paramPathClassLoader, localAndroidNClassLoader);
    if (Build.VERSION.SDK_INT < 27)
    {
      paramPathClassLoader = paramApplication.getResources();
      ShareReflectUtil.b(paramPathClassLoader, "mClassLoader").set(paramPathClassLoader, localAndroidNClassLoader);
      paramPathClassLoader = ShareReflectUtil.b(paramPathClassLoader, "mDrawableInflater").get(paramPathClassLoader);
      if (paramPathClassLoader != null) {
        ShareReflectUtil.b(paramPathClassLoader, "mClassLoader").set(paramPathClassLoader, localAndroidNClassLoader);
      }
    }
    Thread.currentThread().setContextClassLoader(localAndroidNClassLoader);
    return localAndroidNClassLoader;
  }
  
  public Class<?> findClass(String paramString)
  {
    if (((paramString != null) && (paramString.startsWith("com.tencent.tinker.loader.")) && (!paramString.equals("com.tencent.tinker.loader.TinkerTestDexLoad"))) || ((this.vti != null) && (this.vti.equals(paramString)))) {
      return this.vth.loadClass(paramString);
    }
    return super.findClass(paramString);
  }
  
  public String findLibrary(String paramString)
  {
    return super.findLibrary(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/AndroidNClassLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */