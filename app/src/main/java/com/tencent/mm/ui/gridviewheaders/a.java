package com.tencent.mm.ui.gridviewheaders;

import android.content.Context;
import com.tencent.mm.w.a.k;
import java.util.Calendar;
import java.util.Date;

public class a
{
  private static a utQ;
  private long utN;
  private long utO;
  private long utP;
  
  private a()
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(7, 1);
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    this.utO = localCalendar.getTimeInMillis();
    localCalendar = Calendar.getInstance();
    localCalendar.set(5, 1);
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    this.utP = localCalendar.getTimeInMillis();
    this.utN = Calendar.getInstance().getTimeInMillis();
  }
  
  public static a czj()
  {
    if (utQ == null) {}
    try
    {
      utQ = new a();
      return utQ;
    }
    finally {}
  }
  
  public static long gO(long paramLong)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong);
    localCalendar.set(5, 1);
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    localCalendar.set(14, 0);
    return localCalendar.getTimeInMillis();
  }
  
  public final String a(Date paramDate, Context paramContext)
  {
    if (paramDate.getTime() >= this.utO) {
      return paramContext.getString(a.k.this_week);
    }
    if (paramDate.getTime() >= this.utP) {
      return paramContext.getString(a.k.this_month);
    }
    return String.format("%d/%d", new Object[] { Integer.valueOf(paramDate.getYear() + 1900), Integer.valueOf(paramDate.getMonth() + 1) });
  }
  
  public final long b(Date paramDate)
  {
    if (paramDate.getTime() >= this.utO) {
      return Long.MAX_VALUE;
    }
    if (paramDate.getTime() >= this.utP) {
      return 9223372036854775806L;
    }
    return paramDate.getYear() * 100 + paramDate.getMonth();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/gridviewheaders/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */