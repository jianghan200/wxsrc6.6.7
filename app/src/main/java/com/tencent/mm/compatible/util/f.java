package com.tencent.mm.compatible.util;

import android.os.StatFs;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class f
{
  public static boolean Aa()
  {
    if (!zZ()) {
      return false;
    }
    for (;;)
    {
      try
      {
        localStatFs = new StatFs(e.bnC);
      }
      catch (Exception localException1)
      {
        try
        {
          i = localStatFs.getBlockCount();
          l2 = i;
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            StatFs localStatFs;
            int i;
            long l3;
            long l4;
            l1 = 0L;
            long l2 = 0L;
          }
        }
        try
        {
          i = localStatFs.getAvailableBlocks();
          l1 = i;
        }
        catch (Exception localException3)
        {
          l1 = 0L;
          break label176;
        }
        try
        {
          i = localStatFs.getBlockSize();
          l3 = i;
          if ((localStatFs == null) || (l2 <= 0L) || (l2 - l1 < 0L)) {
            break;
          }
          i = (int)((l2 - l1) * 100L / l2);
          l4 = l3 * l1;
          x.i("MicroMsg.CUtil", "checkSDCardFull blockCount: %d, availCount: %d, blockSize: %d, totalSize: %d, availSize: %d, used percent: %d", new Object[] { Long.valueOf(l2), Long.valueOf(l1), Long.valueOf(l3), Long.valueOf(l3 * l2), Long.valueOf(l4), Integer.valueOf(i) });
          if ((95 > i) || (l4 > 314572800L)) {
            break;
          }
          x.i("MicroMsg.CUtil", "checkSDCardFull is full!");
          return true;
        }
        catch (Exception localException4)
        {
          break label176;
        }
        localException1 = localException1;
        l1 = 0L;
        l2 = 0L;
        localStatFs = null;
      }
      label176:
      x.e("MicroMsg.CUtil", "checkSDCardFull", new Object[] { localException1 });
      l3 = 0L;
    }
  }
  
  public static boolean aM(long paramLong)
  {
    if (!zZ())
    {
      x.i("MicroMsg.CUtil", "summer isSDCardHaveEnoughSpace sdcard not avail and ret false");
      return false;
    }
    for (;;)
    {
      try
      {
        localStatFs = new StatFs(e.bnC);
      }
      catch (Exception localException1)
      {
        try
        {
          i = localStatFs.getBlockCount();
          l1 = i;
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            StatFs localStatFs;
            int i;
            long l2;
            long l1 = 0L;
          }
        }
        try
        {
          i = localStatFs.getAvailableBlocks();
          l2 = i;
          if ((localStatFs == null) || (l1 <= 0L) || (l1 - l2 < 0L)) {
            break;
          }
          l1 = localStatFs.getBlockSize();
          if (localStatFs.getFreeBlocks() * l1 >= paramLong) {
            break label143;
          }
          x.i("MicroMsg.CUtil", "summer isSDCardHaveEnoughSpace needSize: " + paramLong + " not enough and ret false");
          return false;
        }
        catch (Exception localException3)
        {
          break label121;
        }
        localException1 = localException1;
        localStatFs = null;
        l1 = 0L;
      }
      label121:
      x.e("MicroMsg.CUtil", "isSDCardHaveEnoughSpace", new Object[] { localException1 });
      l2 = 0L;
    }
    label143:
    return true;
  }
  
  public static boolean zZ()
  {
    boolean bool2 = false;
    String str = h.getExternalStorageDirectory().getAbsolutePath();
    boolean bool1;
    if (e.bnC.equalsIgnoreCase(str))
    {
      bool1 = bool2;
      try
      {
        if (h.getExternalStorageState().equals("mounted"))
        {
          boolean bool3 = new File(str).canWrite();
          bool1 = bool2;
          if (bool3) {
            bool1 = true;
          }
        }
        return bool1;
      }
      catch (Exception localException1)
      {
        x.w("MicroMsg.CUtil", "summer isSDCardAvail 1 e: " + localException1.getMessage() + " SDCARD_ROOT: " + e.bnC);
        return false;
      }
    }
    try
    {
      bool1 = new File(e.bnC).canWrite();
      return bool1;
    }
    catch (Exception localException2)
    {
      x.w("MicroMsg.CUtil", "summer isSDCardAvail 1 e: " + localException2.getMessage() + " SDCARD_ROOT: " + e.bnC);
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/util/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */