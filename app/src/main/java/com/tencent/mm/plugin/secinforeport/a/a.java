package com.tencent.mm.plugin.secinforeport.a;

import com.tencent.mm.protocal.c.ats;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class a
  extends Enum<a>
{
  private static b mOu = new a.1();
  
  public static void a(b paramb)
  {
    if (paramb != null) {
      mOu = paramb;
    }
  }
  
  public static void f(int paramInt1, String paramString, int paramInt2)
  {
    x.v("MicroMsg.ClipBordReport", "report ClipboardOperation %d, %s, %d", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2) });
    mOu.a(paramInt1, paramString, paramInt2, null);
  }
  
  public static void s(int paramInt, String paramString1, String paramString2)
  {
    x.v("MicroMsg.ClipBordReport", "report reportMiniProgram %d, %d, %s, %s", new Object[] { Integer.valueOf(5), Integer.valueOf(paramInt), paramString1, paramString2 });
    ats localats = new ats();
    localats.bPS = paramString1;
    localats.rWX = paramString2;
    paramString1 = null;
    try
    {
      paramString2 = localats.toByteArray();
      paramString1 = paramString2;
    }
    catch (IOException paramString2)
    {
      for (;;)
      {
        x.w("MicroMsg.ClipBordReport", "getExtInfo exp %s", new Object[] { paramString2.getMessage() });
      }
    }
    mOu.a(5, "", paramInt, paramString1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/secinforeport/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */