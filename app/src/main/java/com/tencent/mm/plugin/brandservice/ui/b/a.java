package com.tencent.mm.plugin.brandservice.ui.b;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.plugin.brandservice.b.f;
import com.tencent.mm.plugin.brandservice.b.h;
import java.util.GregorianCalendar;
import java.util.HashMap;

public final class a
{
  private static HashMap<Long, Long> hsA = new HashMap();
  private static HashMap<Long, String> hsB = new HashMap();
  
  public static String e(Context paramContext, long paramLong)
  {
    for (;;)
    {
      GregorianCalendar localGregorianCalendar;
      long l1;
      int j;
      int i;
      try
      {
        localGregorianCalendar = new GregorianCalendar();
        if (paramLong < 3600000L)
        {
          paramContext = "";
          return paramContext;
        }
        l1 = localGregorianCalendar.getTimeInMillis();
        if (hsA.containsKey(Long.valueOf(paramLong))) {
          if (l1 - ((Long)hsA.get(Long.valueOf(paramLong))).longValue() < 60000L)
          {
            if (hsB.containsKey(Long.valueOf(paramLong))) {
              paramContext = (String)hsB.get(Long.valueOf(paramLong));
            }
          }
          else {
            hsA.remove(Long.valueOf(paramLong));
          }
        }
        if ((l1 - paramLong) / 3600000L == 0L)
        {
          j = (int)((l1 - paramLong) / 60000L);
          i = j;
          if (j <= 0) {
            i = 1;
          }
          paramContext = paramContext.getResources().getQuantityString(b.f.fmt_in60min, i, new Object[] { Integer.valueOf(i) });
          hsB.put(Long.valueOf(paramLong), paramContext);
          hsA.put(Long.valueOf(paramLong), Long.valueOf(l1));
          continue;
        }
        localGregorianCalendar = new GregorianCalendar(localGregorianCalendar.get(1), localGregorianCalendar.get(2), localGregorianCalendar.get(5));
      }
      finally {}
      long l2 = paramLong - localGregorianCalendar.getTimeInMillis();
      if ((l2 > 0L) && (l2 <= 86400000L))
      {
        j = (int)((l1 - paramLong) / 3600000L);
        i = j;
        if (j <= 0) {
          i = 1;
        }
        paramContext = paramContext.getResources().getQuantityString(b.f.fmt_in24h, i, new Object[] { Integer.valueOf(i) });
        hsB.put(Long.valueOf(paramLong), paramContext);
        hsA.put(Long.valueOf(paramLong), Long.valueOf(l1));
      }
      else
      {
        l2 = paramLong - localGregorianCalendar.getTimeInMillis() + 86400000L;
        if ((l2 > 0L) && (l2 <= 86400000L))
        {
          paramContext = paramContext.getString(b.h.fmt_pre_yesterday);
          hsB.put(Long.valueOf(paramLong), paramContext);
          hsA.put(Long.valueOf(paramLong), Long.valueOf(l1));
        }
        else
        {
          j = (int)((localGregorianCalendar.getTimeInMillis() + 86400000L - paramLong) / 86400000L);
          i = j;
          if (j <= 0) {
            i = 1;
          }
          paramContext = paramContext.getResources().getQuantityString(b.f.fmt_indayh, i, new Object[] { Integer.valueOf(i) });
          hsB.put(Long.valueOf(paramLong), paramContext);
          hsA.put(Long.valueOf(paramLong), Long.valueOf(l1));
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */