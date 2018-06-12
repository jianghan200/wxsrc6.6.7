package com.tencent.mm.plugin.multitalk.a;

import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class d
{
  public static int lth = 0;
  public static int lti = 0;
  public static int ltj = 0;
  public static int ltk = 0;
  public static int ltl = 0;
  
  public static final void Hy(String paramString)
  {
    x.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkTalkFunction %s %d %d %d %d %d", new Object[] { paramString, Integer.valueOf(lth), Integer.valueOf(lti), Integer.valueOf(ltj), Integer.valueOf(ltk), Integer.valueOf(ltl) });
    h.mEJ.h(12729, new Object[] { paramString, Integer.valueOf(lth), Integer.valueOf(lti), Integer.valueOf(ltj), Integer.valueOf(ltk), Integer.valueOf(ltl) });
    cU(9, lth);
    cU(10, ltl);
    cU(11, lti);
    cU(12, ltj);
    cU(13, ltk);
    lth = 0;
    lti = 0;
    ltj = 0;
    ltk = 0;
    ltl = 0;
  }
  
  public static final void a(int paramInt1, boolean paramBoolean, int paramInt2, String paramString, int paramInt3)
  {
    x.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkSelectContact %d %b %d %s %d", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramInt3) });
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      h.mEJ.h(12727, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt3) });
      return;
    }
  }
  
  public static final void a(boolean paramBoolean, long paramLong, String paramString)
  {
    x.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkConnectSuccess %b %d %s", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(paramLong), paramString });
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      h.mEJ.h(12725, new Object[] { Integer.valueOf(1), Integer.valueOf(i), Long.valueOf(paramLong), paramString });
      return;
    }
  }
  
  public static final void a(boolean paramBoolean, long paramLong, String paramString, int paramInt)
  {
    x.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkConnectFail %b %d %s %d", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(paramLong), paramString, Integer.valueOf(paramInt) });
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      h.mEJ.h(12725, new Object[] { Integer.valueOf(2), Integer.valueOf(i), Long.valueOf(paramLong), paramString, Integer.valueOf(paramInt) });
      return;
    }
  }
  
  public static final void au(int paramInt, String paramString)
  {
    x.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkReceiveCall %d %s", new Object[] { Integer.valueOf(paramInt), paramString });
    h.mEJ.h(12723, new Object[] { Integer.valueOf(paramInt), paramString });
  }
  
  public static final void bfV()
  {
    x.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkDailSuccess");
    h.mEJ.h(12722, new Object[] { Integer.valueOf(1) });
  }
  
  public static final void bfW()
  {
    x.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkDailFail");
    h.mEJ.h(12722, new Object[] { Integer.valueOf(2) });
  }
  
  public static final void bfX()
  {
    h.mEJ.a(220L, 0L, 1L, false);
  }
  
  public static final void bfY()
  {
    h.mEJ.a(220L, 1L, 1L, false);
  }
  
  public static final void bfZ()
  {
    h.mEJ.h(14849, new Object[] { Integer.valueOf(1) });
  }
  
  public static final void bga()
  {
    h.mEJ.h(14849, new Object[] { Integer.valueOf(2) });
  }
  
  public static final void bgb()
  {
    h.mEJ.h(14849, new Object[] { Integer.valueOf(3) });
  }
  
  public static final void bgc()
  {
    h.mEJ.h(14849, new Object[] { Integer.valueOf(4) });
  }
  
  public static final void bgd()
  {
    h.mEJ.h(14849, new Object[] { Integer.valueOf(5) });
  }
  
  public static final void bge()
  {
    h.mEJ.h(14849, new Object[] { Integer.valueOf(6) });
  }
  
  public static final void bgf()
  {
    h.mEJ.h(14849, new Object[] { Integer.valueOf(7) });
  }
  
  public static final void bgg()
  {
    h.mEJ.h(14849, new Object[] { Integer.valueOf(8) });
  }
  
  public static final void bgh()
  {
    h.mEJ.h(14849, new Object[] { Integer.valueOf(9) });
  }
  
  public static final void bgi()
  {
    h.mEJ.h(14849, new Object[] { Integer.valueOf(10) });
  }
  
  private static void cU(int paramInt1, int paramInt2)
  {
    h.mEJ.a(220L, paramInt1, paramInt2, false);
  }
  
  public static final void f(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (paramBoolean2))
    {
      h.mEJ.h(12917, new Object[] { paramString, Integer.valueOf(2), Integer.valueOf(1) });
      return;
    }
    if (paramBoolean1)
    {
      h.mEJ.h(12917, new Object[] { paramString, Integer.valueOf(2), Integer.valueOf(2) });
      return;
    }
    if (paramBoolean2)
    {
      h.mEJ.h(12917, new Object[] { paramString, Integer.valueOf(1), Integer.valueOf(1) });
      return;
    }
    h.mEJ.h(12917, new Object[] { paramString, Integer.valueOf(1), Integer.valueOf(2) });
  }
  
  public static final void gH(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(220);
    localIDKey.SetKey(3);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    if (paramBoolean)
    {
      localIDKey = new IDKey();
      localIDKey.SetID(220);
      localIDKey.SetKey(4);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    h.mEJ.b(localArrayList, false);
  }
  
  public static final void gI(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(220);
    localIDKey.SetKey(5);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    if (paramBoolean)
    {
      localIDKey = new IDKey();
      localIDKey.SetID(220);
      localIDKey.SetKey(6);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    h.mEJ.b(localArrayList, false);
  }
  
  public static final void n(long paramLong, String paramString)
  {
    x.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMutliTalkDuration %d %s", new Object[] { Long.valueOf(paramLong), paramString });
    h.mEJ.h(12726, new Object[] { Long.valueOf(paramLong), paramString });
  }
  
  public static final void o(long paramLong, String paramString)
  {
    if (paramLong > 1000L) {}
    for (paramLong /= 1000L;; paramLong = 1L)
    {
      x.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkVideoDuration %d %s", new Object[] { Long.valueOf(paramLong), paramString });
      h.mEJ.h(12728, new Object[] { Long.valueOf(paramLong), paramString });
      return;
    }
  }
  
  public static final void tg(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(220);
    localIDKey.SetKey(7);
    localIDKey.SetValue(paramInt);
    localArrayList.add(localIDKey);
    localIDKey = new IDKey();
    localIDKey.SetID(220);
    localIDKey.SetKey(8);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    h.mEJ.b(localArrayList, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/multitalk/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */