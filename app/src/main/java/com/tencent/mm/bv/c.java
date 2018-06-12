package com.tencent.mm.bv;

import android.os.Environment;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class c
{
  private static boolean tfw = false;
  public static a tfx = null;
  
  public static void DC(int paramInt)
  {
    final boolean bool1;
    final boolean bool2;
    final boolean bool3;
    boolean bool4;
    switch (paramInt)
    {
    default: 
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = false;
    }
    for (;;)
    {
      x.d("MicroMsg.MemoryDumpOperation", "hprof operate: dump:%b, checkWifi:%b, uploadSingal:%b,uploadAll:%b,", new Object[] { Boolean.valueOf(bool4), Boolean.valueOf(bool3), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      Executors.newSingleThreadExecutor().execute(new Runnable()
      {
        public final void run()
        {
          if (c.yT())
          {
            x.w("MicroMsg.MemoryDumpOperation", "Hprof is mUploading");
            return;
          }
          if (this.tfy) {}
          for (String str = b.V(true, false);; str = null)
          {
            Process.setThreadPriority(10);
            boolean bool = ao.isWifi(ad.getContext());
            if ((bool3) && (!bool))
            {
              x.w("MicroMsg.MemoryDumpOperation", "Hprof no wifi");
              return;
            }
            if ((bool2) && (str != null)) {}
            for (;;)
            {
              c.aZ(true);
              c.mp(str);
              c.aZ(false);
              return;
              if (bool1) {
                str = b.tfv;
              } else {
                str = null;
              }
            }
          }
        }
      });
      return;
      x.i("MicroMsg.MemoryDumpOperation", "GC NOW.");
      System.gc();
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      continue;
      bool1 = false;
      bool2 = true;
      bool3 = false;
      bool4 = true;
      continue;
      bool1 = false;
      bool2 = true;
      bool3 = true;
      bool4 = true;
      continue;
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = true;
      continue;
      bool1 = true;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      continue;
      bool1 = true;
      bool2 = false;
      bool3 = true;
      bool4 = false;
    }
  }
  
  static boolean zZ()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    try
    {
      if (Environment.getExternalStorageState().equals("mounted"))
      {
        boolean bool3 = new File(Environment.getExternalStorageDirectory().getAbsolutePath()).canWrite();
        bool1 = bool2;
        if (bool3) {
          bool1 = true;
        }
      }
      return bool1;
    }
    catch (Exception localException) {}
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/bv/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */