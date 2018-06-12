package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import java.util.GregorianCalendar;

public final class i
{
  public static CharSequence f(Context paramContext, long paramLong)
  {
    if (paramLong < 3600000L) {
      return "";
    }
    GregorianCalendar localGregorianCalendar1 = new GregorianCalendar();
    GregorianCalendar localGregorianCalendar2 = new GregorianCalendar(localGregorianCalendar1.get(1), localGregorianCalendar1.get(2), localGregorianCalendar1.get(5));
    long l = paramLong - localGregorianCalendar2.getTimeInMillis();
    if ((l > 0L) && (l <= 86400000L)) {
      return paramContext.getString(m.i.fmt_pre_nowday);
    }
    l = localGregorianCalendar2.getTimeInMillis() - paramLong;
    if ((l > 0L) && (l <= 86400000L)) {
      return paramContext.getString(m.i.fmt_pre_yesterday);
    }
    new GregorianCalendar().setTimeInMillis(paramLong);
    int j = (int)((localGregorianCalendar1.getTimeInMillis() - paramLong) / 86400000L);
    int i = j;
    if (j <= 0) {
      i = 1;
    }
    if (i > 30) {
      return DateFormat.format(paramContext.getString(m.i.favorite_longdate), paramLong);
    }
    return paramContext.getResources().getQuantityString(m.g.fmt_indayh, i, new Object[] { Integer.valueOf(i) });
  }
  
  public static CharSequence v(Context paramContext, int paramInt)
  {
    if (paramInt <= 0) {
      return paramContext.getString(m.i.favorite_second_format, new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
    }
    int i = paramInt / 60;
    return paramContext.getString(m.i.favorite_second_format, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt % 60) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */