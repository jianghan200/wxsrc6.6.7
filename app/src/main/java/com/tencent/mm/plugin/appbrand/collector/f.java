package com.tencent.mm.plugin.appbrand.collector;

import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class f
{
  private static final AtomicInteger fof = new AtomicInteger();
  private static final AtomicLong fog = new AtomicLong();
  private static boolean foh;
  
  public static boolean ads()
  {
    return foh;
  }
  
  public static String adt()
  {
    float f2 = 0.0F;
    int i = fof.get();
    long l1 = fog.get();
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("fps : ");
    int j = fof.get();
    long l2 = fog.get();
    if ((!foh) || (l2 <= 0L))
    {
      f1 = 0.0F;
      localStringBuilder2.append(f1);
      localStringBuilder1.append("\ncount : ").append(i);
      localStringBuilder2 = localStringBuilder1.append("\naverage cost : ");
      if (i > 0) {
        break label125;
      }
    }
    label125:
    for (float f1 = f2;; f1 = 1.0F * (float)l1 / i)
    {
      localStringBuilder2.append(f1);
      return localStringBuilder1.toString();
      f1 = j * 1000.0F / (float)l2;
      break;
    }
  }
  
  public static void bO(long paramLong)
  {
    if ((!foh) || (paramLong <= 0L)) {
      return;
    }
    x.v("MicroMsg.FPSCollector", "collect(cost : %s)", new Object[] { Long.valueOf(paramLong) });
    fog.addAndGet(paramLong);
    fof.getAndIncrement();
  }
  
  public static void cy(boolean paramBoolean)
  {
    foh = paramBoolean;
  }
  
  public static void reset()
  {
    fof.set(0);
    fog.set(0L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/collector/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */