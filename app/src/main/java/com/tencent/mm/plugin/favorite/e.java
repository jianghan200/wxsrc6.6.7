package com.tencent.mm.plugin.favorite;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.fav.a.ab;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.pluginsdk.ui.tools.a;
import com.tencent.mm.ui.widget.a.c;

public final class e
  implements ab
{
  public final int Bu(String paramString)
  {
    return o.SQ(paramString);
  }
  
  public final int a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3)
  {
    return l.a(paramWXMediaMessage, paramString1, paramString2, paramString3, 3, null);
  }
  
  public final int a(com.tencent.mm.y.g.a parama, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    return l.a(parama, paramWXMediaMessage, paramString);
  }
  
  public final void a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent, int paramInt3, int paramInt4)
  {
    a.a(paramActivity, paramInt1, paramInt2, paramIntent, true, paramInt3, paramInt4, 2);
  }
  
  public final void a(Activity paramActivity, String paramString1, String paramString2)
  {
    a.b(paramActivity, paramString1, paramString2, 2);
  }
  
  public final void a(Context paramContext, String paramString, g paramg, int paramInt, boolean paramBoolean, q.a parama)
  {
    com.tencent.mm.pluginsdk.ui.applet.g.a locala = new com.tencent.mm.pluginsdk.ui.applet.g.a(paramContext);
    locala.bZ(paramString);
    d.a(locala, paramContext, paramg);
    d.b(locala, paramContext, paramg);
    locala.g(Boolean.valueOf(paramBoolean)).BX(paramInt).a(parama).eIW.show();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/favorite/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */