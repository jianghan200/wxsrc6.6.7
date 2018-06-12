package com.tencent.mm.pluginsdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.tools.a.a;
import com.tencent.mm.ui.widget.a.c;

@Deprecated
public abstract interface m
{
  public abstract void a(Activity paramActivity, Intent paramIntent, int paramInt);
  
  public abstract void a(Activity paramActivity, Intent paramIntent1, Intent paramIntent2, String paramString, int paramInt, a.a parama);
  
  public abstract void a(Context paramContext, Intent paramIntent1, Intent paramIntent2);
  
  public abstract void a(Intent paramIntent1, int paramInt, MMActivity paramMMActivity, Intent paramIntent2);
  
  public abstract void a(Intent paramIntent, Activity paramActivity);
  
  public abstract void a(Intent paramIntent, Activity paramActivity, int paramInt);
  
  public abstract void a(Intent paramIntent, Context paramContext);
  
  public abstract void a(Intent paramIntent, MMActivity.a parama, MMActivity paramMMActivity);
  
  public abstract void a(Intent paramIntent, MMActivity paramMMActivity);
  
  public abstract void a(MMActivity paramMMActivity, String paramString1, WXMediaMessage paramWXMediaMessage, String paramString2, String paramString3);
  
  public abstract void a(MMWizardActivity paramMMWizardActivity, Intent paramIntent);
  
  public abstract void a(boolean paramBoolean1, boolean paramBoolean2, Context paramContext, String paramString, int paramInt1, int paramInt2);
  
  public abstract void b(Intent paramIntent, Activity paramActivity);
  
  public abstract void b(Intent paramIntent, Context paramContext);
  
  public abstract boolean b(Context paramContext, String paramString, Bundle paramBundle);
  
  public abstract boolean b(Context paramContext, String paramString, Object... paramVarArgs);
  
  public abstract c bd(Context paramContext);
  
  public abstract Intent be(Context paramContext);
  
  public abstract void bf(Context paramContext);
  
  public abstract void bg(Context paramContext);
  
  public abstract void c(Intent paramIntent, Context paramContext);
  
  public abstract void cancelNotification(String paramString);
  
  public abstract void d(Context paramContext, Intent paramIntent);
  
  public abstract void d(Intent paramIntent, Context paramContext);
  
  public abstract void e(Context paramContext, Intent paramIntent);
  
  public abstract void e(Intent paramIntent, Context paramContext);
  
  public abstract void f(Context paramContext, Intent paramIntent);
  
  public abstract void f(Intent paramIntent, Context paramContext);
  
  public abstract void g(Context paramContext, Intent paramIntent);
  
  public abstract void g(Intent paramIntent, Context paramContext);
  
  public abstract void h(Context paramContext, Intent paramIntent);
  
  public abstract void h(Intent paramIntent, Context paramContext);
  
  public abstract void i(Intent paramIntent, Context paramContext);
  
  public abstract void j(Intent paramIntent, Context paramContext);
  
  public abstract void k(Intent paramIntent, Context paramContext);
  
  public abstract void l(Intent paramIntent, Context paramContext);
  
  public abstract void m(Intent paramIntent, Context paramContext);
  
  public abstract void n(Intent paramIntent, Context paramContext);
  
  public abstract void o(Intent paramIntent, Context paramContext);
  
  public abstract void p(Intent paramIntent, Context paramContext);
  
  public abstract void q(Intent paramIntent, Context paramContext);
  
  public abstract void r(Intent paramIntent, Context paramContext);
  
  public abstract void s(Context paramContext, String paramString);
  
  public abstract void s(Intent paramIntent, Context paramContext);
  
  public abstract void t(Intent paramIntent, Context paramContext);
  
  public abstract void u(Intent paramIntent, Context paramContext);
  
  public abstract void v(Intent paramIntent, Context paramContext);
  
  public abstract void vo();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */