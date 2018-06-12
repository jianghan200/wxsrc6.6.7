package com.tencent.mm.plugin.websearch.b;

import android.text.TextUtils;
import com.tencent.mm.ab.v;
import com.tencent.mm.plugin.websearch.api.ad;
import com.tencent.mm.plugin.websearch.api.d;
import com.tencent.mm.plugin.websearch.api.e;
import org.xwalk.core.Log;

public final class a
  implements e
{
  public final void a(String paramString, d paramd)
  {
    if (TextUtils.isEmpty(paramString))
    {
      Log.w("RelevantSearchService", "empty query");
      if (paramd != null) {
        paramd.a(false, null, null, null);
      }
    }
    paramString = new com.tencent.mm.plugin.websearch.a.a(paramString);
    v.a(paramString.diG, new a.1(this, paramd, paramString));
  }
  
  public final void ah(String paramString1, String paramString2, String paramString3)
  {
    ad.a(paramString1, paramString2, System.currentTimeMillis(), paramString3);
  }
  
  public final void g(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    ad.h(paramString1, paramString2, paramInt, paramString3);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/websearch/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */