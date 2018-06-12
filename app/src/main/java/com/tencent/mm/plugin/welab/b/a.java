package com.tencent.mm.plugin.welab.b;

import android.app.Activity;
import android.content.Context;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.websearch.api.i;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.plugin.welab.a.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class a
  implements b
{
  public final String bYQ()
  {
    return r.PX("discoverRecommendEntry").optString("labIcon");
  }
  
  public final String bYR()
  {
    String str2 = r.PX("discoverRecommendEntry").optString("wording");
    String str1 = str2;
    if (bi.oW(str2)) {
      str1 = ad.getContext().getString(R.l.find_friends_look);
    }
    return str1;
  }
  
  public final void e(Activity paramActivity, String paramString)
  {
    if (!p.zO(0))
    {
      x.e("MicroMsg.FTS.LookOneLookOpener", "fts h5 template not avail");
      return;
    }
    paramString = r.PX("discoverRecommendEntry").optString("wording");
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.FTS.LookOneLookOpener", "empty query");
      return;
    }
    ((i)g.l(i.class)).a(ad.getContext(), new a.1(this, paramString, paramActivity));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/welab/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */