package com.tencent.mm.plugin.search.b.a.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.n.e;
import com.tencent.mm.plugin.fts.a.a.c;
import com.tencent.mm.plugin.fts.a.d.a.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.a.j;

public final class a
  implements b
{
  public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a paramVarArgs)
  {
    paramVarArgs = (j)paramVarArgs;
    ((n)com.tencent.mm.kernel.g.n(n.class)).updateTopHitsRank(paramVarArgs.jrx.jrV, paramVarArgs.fyJ, 0);
    if (((e)com.tencent.mm.kernel.g.l(e.class)).uo(paramVarArgs.jyt.field_url)) {}
    do
    {
      return true;
      if (paramVarArgs.jyt.field_actionType == 2)
      {
        localIntent = new Intent();
        localIntent.putExtra("rawUrl", paramVarArgs.jyt.field_url);
        d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
        return true;
      }
    } while (com.tencent.mm.plugin.search.a.a.L(paramContext, paramVarArgs.jyt.field_featureId));
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramVarArgs.jyt.field_updateUrl);
    d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/b/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */