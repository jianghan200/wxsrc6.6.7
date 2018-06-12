package com.tencent.mm.plugin.webview.modeltools;

import android.database.Cursor;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Set;

public final class h
  extends i<g>
{
  public static final String[] diD = { i.a(g.dhO, "WebViewHostsFilter") };
  private final e diF;
  
  public h(e parame)
  {
    this(parame, g.dhO, "WebViewHostsFilter");
  }
  
  private h(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    this.diF = parame;
  }
  
  public final Set<String> bVd()
  {
    long l = bi.VE();
    x.d("MicroMsg.WebViewStorage", "webview hijack deleteExpiredItem now = " + l);
    x.i("MicroMsg.WebViewStorage", "delete expired items request  : [%b]", new Object[] { Boolean.valueOf(fV("WebViewHostsFilter", "delete from WebViewHostsFilter where expireTime < " + l)) });
    Cursor localCursor = this.diF.a(getTableName(), new String[] { "host" }, null, null, null, null, null, 2);
    HashSet localHashSet = new HashSet();
    if ((localCursor != null) && (localCursor.moveToFirst())) {
      do
      {
        String str = localCursor.getString(0);
        if (!bi.oW(str))
        {
          localHashSet.add(str);
          x.d("MicroMsg.WebViewStorage", "webview hijack gethost = " + str);
        }
      } while (localCursor.moveToNext());
    }
    if (localCursor != null) {
      localCursor.close();
    }
    return localHashSet;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/modeltools/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */