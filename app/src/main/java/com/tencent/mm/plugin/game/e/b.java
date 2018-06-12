package com.tencent.mm.plugin.game.e;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.plugin.game.f.g;
import com.tencent.mm.plugin.game.f.i;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b
{
  public static HashMap<Long, Long> hsA = new HashMap();
  public static HashMap<Long, String> hsB = new HashMap();
  private static Map<String, List<String>> kdg = new HashMap();
  private static Map<String, List<String>> kdh = new HashMap();
  
  public static String g(Context paramContext, long paramLong)
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    if (paramLong < 3600000L) {
      return "";
    }
    long l1 = localGregorianCalendar.getTimeInMillis();
    if (hsA.containsKey(Long.valueOf(paramLong))) {
      if (l1 - ((Long)hsA.get(Long.valueOf(paramLong))).longValue() < 60000L)
      {
        if (hsB.containsKey(Long.valueOf(paramLong))) {
          return (String)hsB.get(Long.valueOf(paramLong));
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
      paramContext = paramContext.getResources().getQuantityString(f.g.fmt_in60min, i, new Object[] { Integer.valueOf(i) });
      hsB.put(Long.valueOf(paramLong), paramContext);
      hsA.put(Long.valueOf(paramLong), Long.valueOf(l1));
      return paramContext;
    }
    localGregorianCalendar = new GregorianCalendar(localGregorianCalendar.get(1), localGregorianCalendar.get(2), localGregorianCalendar.get(5));
    long l2 = paramLong - localGregorianCalendar.getTimeInMillis();
    if ((l2 > 0L) && (l2 <= 86400000L))
    {
      j = (int)((l1 - paramLong) / 3600000L);
      i = j;
      if (j <= 0) {
        i = 1;
      }
      paramContext = paramContext.getResources().getQuantityString(f.g.fmt_in24h, i, new Object[] { Integer.valueOf(i) });
      hsB.put(Long.valueOf(paramLong), paramContext);
      hsA.put(Long.valueOf(paramLong), Long.valueOf(l1));
      return paramContext;
    }
    l2 = paramLong - localGregorianCalendar.getTimeInMillis() + 86400000L;
    if ((l2 > 0L) && (l2 <= 86400000L))
    {
      paramContext = paramContext.getString(f.i.fmt_pre_yesterday);
      hsB.put(Long.valueOf(paramLong), paramContext);
      hsA.put(Long.valueOf(paramLong), Long.valueOf(l1));
      return paramContext;
    }
    int j = (int)((localGregorianCalendar.getTimeInMillis() + 86400000L - paramLong) / 86400000L);
    int i = j;
    if (j <= 0) {
      i = 1;
    }
    paramContext = paramContext.getResources().getQuantityString(f.g.fmt_indayh, i, new Object[] { Integer.valueOf(i) });
    hsB.put(Long.valueOf(paramLong), paramContext);
    hsA.put(Long.valueOf(paramLong), Long.valueOf(l1));
    return paramContext;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */