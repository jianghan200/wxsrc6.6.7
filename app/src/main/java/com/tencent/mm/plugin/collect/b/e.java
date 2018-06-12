package com.tencent.mm.plugin.collect.b;

import android.content.Context;
import com.tencent.mm.plugin.wxpay.a.i;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class e
{
  public static String a(Context paramContext, long paramLong, int paramInt)
  {
    paramLong = 1000L * paramLong;
    if (paramInt == 0) {
      return new SimpleDateFormat(paramContext.getString(a.i.collect_bill_date_day_format)).format(new Date(paramLong));
    }
    if (paramInt == 1) {
      return new SimpleDateFormat(paramContext.getString(a.i.collect_bill_date_month_format)).format(new Date(paramLong));
    }
    return new SimpleDateFormat(paramContext.getString(a.i.collect_bill_date_year_format)).format(new Date(paramLong));
  }
  
  public static String os(int paramInt)
  {
    return String.format("%.2f", new Object[] { Double.valueOf(paramInt / 100.0D) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/collect/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */