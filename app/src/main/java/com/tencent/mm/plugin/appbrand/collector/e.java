package com.tencent.mm.plugin.appbrand.collector;

import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class e
{
  public static StringBuilder a(TimePoint paramTimePoint)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramTimePoint == null)
    {
      x.i("MicroMsg.CostTimeUtil", "print failed, headPoint is null.");
      return localStringBuilder;
    }
    localStringBuilder.append(0).append(". ").append(paramTimePoint.name).append(" : ");
    localStringBuilder.append(paramTimePoint.fok);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramTimePoint.foj.get());
    localStringBuilder.append(", ");
    localStringBuilder.append(paramTimePoint.fok.get() - paramTimePoint.fok.get());
    int i = 0;
    TimePoint localTimePoint;
    for (Object localObject = paramTimePoint; ((TimePoint)localObject).fol.get() != null; localObject = localTimePoint)
    {
      localTimePoint = (TimePoint)((TimePoint)localObject).fol.get();
      localStringBuilder.append("\n");
      localStringBuilder.append(i + 1).append(". ").append(localTimePoint.name).append(" : ");
      localStringBuilder.append((localTimePoint.fok.get() - ((TimePoint)localObject).fok.get()) / 1000000.0D);
      i += 1;
    }
    localStringBuilder.append("\n");
    localStringBuilder.append("total cost : ").append((((TimePoint)localObject).fok.get() - paramTimePoint.fok.get()) / 1000000.0D);
    return localStringBuilder;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/collector/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */