package com.tencent.mm.plugin.subapp.c;

import com.tencent.mm.g.c.eg;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public final class k
  extends i<g>
{
  public static final String[] diD = { i.a(g.dhO, "VoiceRemindInfo") };
  private static long enX = 0L;
  e diF;
  Map<String, c> orF = new HashMap();
  
  public k(e parame)
  {
    super(parame, g.dhO, "VoiceRemindInfo", eg.ciG);
    this.diF = parame;
  }
  
  public static String nJ(String paramString)
  {
    long l = System.currentTimeMillis();
    String str2 = new SimpleDateFormat("ssHHmmMMddyy").format(new Date(l));
    String str1 = str2;
    if (paramString != null)
    {
      str1 = str2;
      if (paramString.length() > 1) {
        str1 = str2 + com.tencent.mm.a.g.u(paramString.getBytes()).substring(0, 7);
      }
    }
    paramString = str1 + l % 10000L;
    paramString = new StringBuilder().append(paramString);
    l = enX;
    enX = 1L + l;
    return l;
  }
  
  public final boolean jy(String paramString)
  {
    if (paramString.length() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.diF.delete("VoiceRemindInfo", "filename= ?", new String[] { paramString }) <= 0) {
        x.w("MicroMsg.VoiceRemindStorage", "delete failed, no such file:" + paramString);
      }
      return true;
    }
  }
  
  public final void ol(String paramString)
  {
    c localc = (c)this.orF.get(paramString);
    if (localc != null)
    {
      localc.Tz();
      this.orF.remove(paramString);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/subapp/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */