package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.interfaces.IX5DateSorter;

public class DateSorter
{
  public static int DAY_COUNT = 5;
  private android.webkit.DateSorter a;
  private IX5DateSorter b;
  
  static
  {
    a();
  }
  
  public DateSorter(Context paramContext)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      this.b = localbv.c().h(paramContext);
      return;
    }
    this.a = new android.webkit.DateSorter(paramContext);
  }
  
  private static boolean a()
  {
    boolean bool2 = false;
    bv localbv = bv.a();
    boolean bool1 = bool2;
    if (localbv != null)
    {
      bool1 = bool2;
      if (localbv.b()) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public long getBoundary(int paramInt)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return this.b.getBoundary(paramInt);
    }
    return this.a.getBoundary(paramInt);
  }
  
  public int getIndex(long paramLong)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return this.b.getIndex(paramLong);
    }
    return this.a.getIndex(paramLong);
  }
  
  public String getLabel(int paramInt)
  {
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b())) {
      return this.b.getLabel(paramInt);
    }
    return this.a.getLabel(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/smtt/sdk/DateSorter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */