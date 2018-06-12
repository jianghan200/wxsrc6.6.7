package com.tencent.mm.plugin.fav.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.y.g.a;

public abstract interface ab
  extends a
{
  public abstract int Bu(String paramString);
  
  public abstract int a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3);
  
  public abstract int a(g.a parama, WXMediaMessage paramWXMediaMessage, String paramString);
  
  public abstract void a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent, int paramInt3, int paramInt4);
  
  public abstract void a(Activity paramActivity, String paramString1, String paramString2);
  
  public abstract void a(Context paramContext, String paramString, g paramg, int paramInt, boolean paramBoolean, q.a parama);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/a/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */