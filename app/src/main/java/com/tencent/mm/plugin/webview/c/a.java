package com.tencent.mm.plugin.webview.c;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.protocal.c.bje;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class a
  implements e
{
  a pNC = new a((byte)0);
  private c pND = new a.1(this);
  
  public a()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.pND);
  }
  
  public static String t(Map<String, Object> paramMap, String paramString)
  {
    if (paramMap.containsKey(paramString))
    {
      if (paramMap.get(paramString) != null) {
        return paramMap.get(paramString).toString();
      }
      return "";
    }
    return "";
  }
  
  public static int v(Map<String, Object> paramMap, String paramString)
  {
    paramMap = t(paramMap, paramString);
    if (bi.oW(paramMap)) {
      return 0;
    }
    return Integer.valueOf(paramMap).intValue();
  }
  
  public final boolean W(Map<String, Object> paramMap)
  {
    x.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "getSearchEmotionData: %s", new Object[] { paramMap.toString() });
    String str1 = t(paramMap, "keyword");
    String str2 = t(paramMap, "nextPageBuffer");
    int i = v(paramMap, "type");
    int j = v(paramMap, "webview_instance_id");
    paramMap = t(paramMap, "searchID");
    if (bi.oW(paramMap)) {}
    for (long l = 0L;; l = Long.valueOf(paramMap).longValue())
    {
      this.pNC.a(i, str1, str2, j, l);
      return false;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof b))
    {
      au.DF().b(234, this);
      this.pNC.bgH = false;
      paramString = (b)paraml;
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break label118;
      }
      this.pNC.bLW = false;
      h.Bh(paramString.pNI).a("{}", paramString.pNJ, "", 0L);
    }
    for (;;)
    {
      paraml = paramString.bTD().sjt;
      String str = ab.b(paramString.bTD().rHj);
      long l = paramString.bTD().rHm;
      h.Bh(paramString.pNI).a(paraml, paramString.pNJ, str, l);
      return;
      label118:
      this.pNC.bLW = true;
    }
  }
  
  private final class a
  {
    boolean bLW;
    boolean bgH;
    private b pNF;
    private String pNG;
    private long pNH;
    
    private a() {}
    
    public final void a(int paramInt1, String paramString1, String paramString2, int paramInt2, long paramLong)
    {
      if (bi.oW(paramString1))
      {
        if (paramString2 == null) {}
        for (paramString2 = "";; paramString2 = paramString2.toString())
        {
          x.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "error query:%s type:%d pagebuf:%s ", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2 });
          return;
        }
      }
      Object localObject = new StringBuffer();
      ((StringBuffer)localObject).append(paramString1);
      ((StringBuffer)localObject).append(paramInt1);
      localObject = com.tencent.mm.a.g.u(((StringBuffer)localObject).toString().getBytes());
      if ((!bi.oW(this.pNG)) && (this.pNG.equals(localObject)) && (System.currentTimeMillis() - this.pNH <= 8000L) && (bi.oW(paramString2)))
      {
        if (this.bLW)
        {
          x.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "hit the search cache %s", new Object[] { paramString1 });
          h.Bh(paramInt2).a(this.pNF.bTD().sjt, true, ab.b(this.pNF.bTD().rHj), this.pNF.bTD().rHm);
          return;
        }
        if (this.bgH)
        {
          if (this.pNF != null) {
            this.pNF.pNI = paramInt2;
          }
          x.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "wait the netscene running");
          return;
        }
        x.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "netscene error try again");
      }
      x.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "start New NetScene query:%s newMD5:%s webviewID:%d", new Object[] { paramString1, localObject, Integer.valueOf(paramInt2) });
      if (this.pNF != null) {
        au.DF().c(this.pNF);
      }
      this.pNG = ((String)localObject);
      this.pNH = System.currentTimeMillis();
      this.bgH = true;
      this.bLW = false;
      au.DF().a(234, a.this);
      this.pNF = new b(paramInt1, paramString1, paramString2.getBytes(), paramInt2, paramLong);
      au.DF().a(this.pNF, 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */