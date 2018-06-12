package com.tencent.mm.ui.e.c;

import android.content.Context;

public final class b
{
  private static a utc = null;
  
  public static void a(a parama)
  {
    utc = parama;
  }
  
  public static int bd(String paramString, int paramInt)
  {
    int i = paramInt;
    if (utc != null) {
      i = utc.bd(paramString, paramInt);
    }
    return i;
  }
  
  public static CharSequence c(CharSequence paramCharSequence, int paramInt)
  {
    CharSequence localCharSequence = paramCharSequence;
    if (utc != null) {
      localCharSequence = utc.c(paramCharSequence, paramInt);
    }
    return localCharSequence;
  }
  
  public static CharSequence d(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    paramContext = paramCharSequence;
    if (utc != null) {
      paramContext = utc.b(paramCharSequence, paramFloat);
    }
    return paramContext;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/e/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */