package com.tencent.mm.plugin.clean.c;

import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashSet;

public final class d
{
  private static long hQD = 0L;
  private static long hQE;
  private static com.tencent.mm.plugin.clean.c.a.b hQO;
  private static long hQT;
  private static long hQU;
  private static final ag hRc = new ag();
  private static HashSet<String> hRd;
  private static ArrayList<b> hRe;
  private static int hRf = 0;
  
  static
  {
    hQU = 0L;
    hQT = 0L;
    hQE = 0L;
  }
  
  public static void a(com.tencent.mm.plugin.clean.c.a.b paramb)
  {
    hQO = paramb;
  }
  
  public static com.tencent.mm.plugin.clean.c.a.b aBg()
  {
    boolean bool = true;
    if (hQO == null) {}
    for (;;)
    {
      x.d("MicroMsg.CleanLogic", "getThreadController threadController is null? %b", new Object[] { Boolean.valueOf(bool) });
      return hQO;
      bool = false;
    }
  }
  
  public static HashSet<String> aBh()
  {
    return hRd;
  }
  
  public static ArrayList<b> aBi()
  {
    return hRe;
  }
  
  public static long aBj()
  {
    return hQU;
  }
  
  public static long aBk()
  {
    return hQD;
  }
  
  public static long aBl()
  {
    return hQE;
  }
  
  public static long aBm()
  {
    return hQT;
  }
  
  public static final void aBn()
  {
    x.i("MicroMsg.CleanLogic", "startCleanDataNow");
    hRc.removeCallbacksAndMessages(null);
    hQU = 0L;
    hQT = 0L;
    m(null);
    hRf = 0;
  }
  
  public static final void aBo()
  {
    x.i("MicroMsg.CleanLogic", "start to post clean runnable!!");
    hRc.removeCallbacksAndMessages(null);
    hRc.postDelayed(new d.1(), 300000L);
  }
  
  public static final void aBp()
  {
    hRf += 1;
  }
  
  public static final void aBq()
  {
    hRf -= 1;
  }
  
  public static void b(HashSet<String> paramHashSet)
  {
    hRd = paramHashSet;
  }
  
  public static void cf(long paramLong)
  {
    hQU = paramLong;
  }
  
  public static void cg(long paramLong)
  {
    hQD = paramLong;
  }
  
  public static void ch(long paramLong)
  {
    long l = paramLong;
    if (paramLong <= 0L) {
      l = 0L;
    }
    hQE = l;
  }
  
  public static void ci(long paramLong)
  {
    hQT = paramLong;
  }
  
  public static void m(ArrayList<b> paramArrayList)
  {
    boolean bool = true;
    if (paramArrayList == null) {}
    for (;;)
    {
      x.i("MicroMsg.CleanLogic", "set analyse data: is null? %b", new Object[] { Boolean.valueOf(bool) });
      hRe = paramArrayList;
      return;
      bool = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/clean/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */