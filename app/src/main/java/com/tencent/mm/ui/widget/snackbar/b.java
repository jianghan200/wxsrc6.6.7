package com.tencent.mm.ui.widget.snackbar;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

public final class b
{
  private static boolean uMJ = false;
  
  public static void a(Activity paramActivity, String paramString1, String paramString2, a.b paramb, a.c paramc)
  {
    paramActivity = new a.a(paramActivity);
    paramActivity.kjg = paramString1;
    paramActivity.uMv = paramString2;
    a(paramActivity.a(Short.valueOf((short)2500)), paramb, paramc);
  }
  
  public static void a(Context paramContext, View paramView, String paramString)
  {
    paramContext = new a.a(paramContext, paramView);
    paramContext.kjg = paramString;
    paramContext.a(Short.valueOf((short)1500)).cBa();
  }
  
  public static void a(Context paramContext, View paramView, String paramString1, String paramString2)
  {
    paramContext = new a.a(paramContext, paramView);
    paramContext.kjg = paramString1;
    paramContext.uMv = paramString2;
    a(paramContext.a(Short.valueOf((short)2500)), null, null);
  }
  
  public static void a(Fragment paramFragment, String paramString1, String paramString2, a.b paramb, a.c paramc)
  {
    paramFragment = new a.a(paramFragment.getContext(), paramFragment.getView());
    paramFragment.kjg = paramString1;
    paramFragment.uMv = paramString2;
    a(paramFragment.a(Short.valueOf((short)2500)), paramb, paramc);
  }
  
  private static void a(a.a parama, a.b paramb, a.c paramc)
  {
    if (paramb != null) {
      parama.uMH.uMB = paramb;
    }
    if (paramc != null) {
      parama.uMH.uMC = paramc;
    }
    parama.cBa();
  }
  
  public static boolean aKp()
  {
    return uMJ;
  }
  
  public static void d(Activity paramActivity, String paramString1, String paramString2)
  {
    paramActivity = new a.a(paramActivity);
    paramActivity.kjg = paramString1;
    paramActivity.uMv = paramString2;
    a(paramActivity.a(Short.valueOf((short)2500)), null, null);
  }
  
  public static void h(Activity paramActivity, String paramString)
  {
    paramActivity = new a.a(paramActivity);
    paramActivity.kjg = paramString;
    a(paramActivity.a(Short.valueOf((short)1500)), null, null);
  }
  
  public static void mH(boolean paramBoolean)
  {
    uMJ = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/widget/snackbar/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */