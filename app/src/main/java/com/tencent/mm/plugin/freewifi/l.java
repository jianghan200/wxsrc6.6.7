package com.tencent.mm.plugin.freewifi;

import com.tencent.mm.plugin.report.service.h;

public final class l
{
  public static void b(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      h.mEJ.h(12651, new Object[] { Integer.valueOf(4), paramString1, Integer.valueOf(1), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
      return;
    }
    h.mEJ.h(12651, new Object[] { Integer.valueOf(4), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
  }
  
  public static void c(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      h.mEJ.h(12651, new Object[] { Integer.valueOf(5), paramString1, Integer.valueOf(1), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
      return;
    }
    h.mEJ.h(12651, new Object[] { Integer.valueOf(5), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
  }
  
  public static void s(String paramString1, String paramString2, int paramInt)
  {
    h.mEJ.h(12651, new Object[] { Integer.valueOf(1), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
  }
  
  public static void t(String paramString1, String paramString2, int paramInt)
  {
    h.mEJ.h(12651, new Object[] { Integer.valueOf(2), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
  }
  
  public static void u(String paramString1, String paramString2, int paramInt)
  {
    h.mEJ.h(12651, new Object[] { Integer.valueOf(3), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */