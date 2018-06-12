package com.tencent.mm.plugin.welab.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import org.json.JSONObject;

public final class b
  implements com.tencent.mm.plugin.welab.a.a.b
{
  public final String bYQ()
  {
    return r.PX("discoverSearchEntry").optString("labIcon");
  }
  
  public final String bYR()
  {
    String str2 = r.PX("discoverSearchEntry").optString("wording");
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
      x.e("MicroMsg.FTS.SearchOneSearchOpener", "fts h5 template not avail");
      return;
    }
    paramString = p.adR();
    paramString.putExtra("ftsbizscene", 20);
    Map localMap = p.b(20, true, 0);
    paramString.putExtra("ftsneedkeyboard", true);
    paramString.putExtra("rawUrl", p.v(localMap));
    d.b(paramActivity, "webview", ".ui.tools.fts.FTSSearchOneSearchWebViewUI", paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/welab/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */