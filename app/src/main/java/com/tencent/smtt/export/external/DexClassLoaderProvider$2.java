package com.tencent.smtt.export.external;

import android.app.Service;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.TimerTask;

final class DexClassLoaderProvider$2
  extends TimerTask
{
  DexClassLoaderProvider$2(String paramString1, String paramString2, String paramString3, ClassLoader paramClassLoader, String paramString4) {}
  
  public final void run()
  {
    for (boolean bool1 = true;; bool1 = false)
    {
      try
      {
        File localFile1 = new File(this.val$dexPath.replace(".jar", ".dex"));
        if ((!localFile1.exists()) || (localFile1.length() == 0L)) {
          continue;
        }
        localFile1 = new File(this.val$optimizedDirectory);
        File localFile2 = new File(this.val$dexPath);
        boolean bool2 = localFile1.exists();
        boolean bool3 = localFile1.isDirectory();
        boolean bool4 = localFile2.exists();
        if ((!bool2) || (!bool3) || (!bool4))
        {
          new StringBuilder("dex loading exception(").append(bool2).append(", ").append(bool3).append(", ").append(bool4).append(")");
          return;
        }
        long l = System.currentTimeMillis();
        new DexClassLoader(this.val$dexPath, this.val$optimizedDirectory, this.val$libraryPath, this.val$parent);
        String.format("load_dex completed -- cl_cost: %d, existed: %b", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Boolean.valueOf(bool1) });
        if ((DexClassLoaderProvider.access$100()) && ("tbs_jars_fusion_dex.jar".equals(this.val$dexName)) && (DexClassLoaderProvider.mService != null))
        {
          DexClassLoaderProvider.mService.stopSelf();
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        new StringBuilder("@AsyncDexLoad task exception: ").append(localThrowable);
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/smtt/export/external/DexClassLoaderProvider$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */