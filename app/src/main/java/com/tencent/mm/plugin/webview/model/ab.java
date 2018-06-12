package com.tencent.mm.plugin.webview.model;

import android.net.Uri;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ab
{
  private static final Set<String> pRH;
  
  static
  {
    Object localObject1 = new HashSet();
    pRH = (Set)localObject1;
    ((Set)localObject1).add("file:///android_asset/");
    Object localObject2 = e.duO;
    localObject1 = localObject2;
    if (!bi.oW((String)localObject2)) {
      localObject1 = e.duO.replace("/data/user/0", "/data/data");
    }
    localObject2 = new File(p.zT(0));
    pRH.add("file://" + ((File)localObject2).getAbsolutePath());
    File localFile1 = new File(e.bnE, p.zR(0));
    pRH.add("file://" + localFile1.getAbsolutePath());
    File localFile2 = new File((String)localObject1, "wenote/res");
    pRH.add("file://" + localFile2.getAbsolutePath());
    localFile2 = new File(e.bnE, "wenote/res");
    pRH.add("file://" + localFile2.getAbsolutePath());
    x.i("MicroMsg.URLFilter", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", new Object[] { ((File)localObject2).getAbsolutePath(), localFile1.getAbsolutePath() });
    localObject1 = new File((String)localObject1, "emoji/res");
    pRH.add("file://" + ((File)localObject1).getAbsolutePath());
    localObject2 = new File(e.bnE, "emoji/res");
    pRH.add("file://" + ((File)localObject2).getAbsolutePath());
    x.i("MicroMsg.URLFilter", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", new Object[] { ((File)localObject1).getAbsolutePath(), ((File)localObject2).getAbsolutePath() });
    localObject1 = pRH.iterator();
    while (((Iterator)localObject1).hasNext()) {
      x.i("MicroMsg.URLFilter", "WebViewUI white list path : %s", new Object[] { (String)((Iterator)localObject1).next() });
    }
  }
  
  public static boolean Ql(String paramString)
  {
    if (af.exj)
    {
      x.w("MicroMsg.URLFilter", "skipLoadUrlCheck");
      return true;
    }
    if (bi.oW(paramString)) {
      return true;
    }
    paramString = paramString.toLowerCase();
    if (paramString.startsWith("about:blank")) {
      return false;
    }
    if (!paramString.startsWith("file://"))
    {
      paramString = Uri.parse(paramString);
      if (bi.oW(paramString.getHost())) {
        return true;
      }
      return !paramString.getHost().contains(s.cfB());
    }
    Iterator localIterator = pRH.iterator();
    while (localIterator.hasNext()) {
      if (paramString.startsWith((String)localIterator.next())) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/model/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */