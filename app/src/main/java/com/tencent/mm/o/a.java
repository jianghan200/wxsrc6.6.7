package com.tencent.mm.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.StatFs;
import android.preference.PreferenceManager;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class a
{
  public static int dhT = -1;
  public static final long[] dhU = { 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L };
  public static final long[] dhV = { 104857600L, 314572800L, 524288000L, 1073741824L, 1073741824L };
  
  public static int BP()
  {
    double d = 0.0D;
    for (;;)
    {
      int i;
      try
      {
        localStatFs = new StatFs(h.getDataDirectory().getPath());
        l1 = localStatFs.getAvailableBlocks();
        i = localStatFs.getBlockSize();
        l1 *= i;
      }
      catch (Exception localException1)
      {
        StatFs localStatFs;
        long l1 = 0L;
        x.e("MicroMsg.DbChecker", "get db spare space error");
        long l2 = 0L;
        long l3 = 0L;
        continue;
        if (dhT < 0)
        {
          dhT = dhU.length - 1;
          i = 0;
          if (i < dhU.length)
          {
            if (l3 >= dhU[i]) {
              continue;
            }
            dhT = i;
          }
        }
        if (l1 < dhV[dhT])
        {
          i = 1;
          continue;
          i += 1;
          continue;
        }
      }
      try
      {
        l3 = localStatFs.getBlockCount() * localStatFs.getBlockSize();
        l2 = localStatFs.getFreeBlocks();
        i = localStatFs.getBlockSize();
        l2 *= i;
        d = l1 / l3;
        if (l3 <= 0L) {
          break label244;
        }
        if (l1 >= 52428800L) {
          continue;
        }
        i = 2;
      }
      catch (Exception localException2)
      {
        continue;
        i = 0;
      }
    }
    x.i("MicroMsg.DbChecker", "checkRomSparespace[%d] available:%d all:%d freeSize :%d availPercent %f mobileSizeIndex %d", new Object[] { Integer.valueOf(i), Long.valueOf(l1), Long.valueOf(l3), Long.valueOf(l2), Double.valueOf(d), Integer.valueOf(dhT) });
    return i;
  }
  
  public static void b(Context paramContext, long paramLong)
  {
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putLong("db_check_tip_time", paramLong).commit();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */