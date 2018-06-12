package com.tencent.mm.pluginsdk;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.tencent.mm.bp.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.w.a.c;
import com.tencent.mm.w.a.e;

public final class e
{
  public static void N(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      if ((paramActivity instanceof AppCompatActivity)) {
        ((AppCompatActivity)paramActivity).supportRequestWindowFeature(109);
      }
    }
    else {
      return;
    }
    paramActivity.requestWindowFeature(9);
  }
  
  public static void a(MMFragmentActivity paramMMFragmentActivity, View paramView)
  {
    if (paramMMFragmentActivity == null) {}
    while ((Build.VERSION.SDK_INT < 16) || (paramMMFragmentActivity.getWindow() == null) || (paramMMFragmentActivity.getWindow().getDecorView() == null)) {
      return;
    }
    paramMMFragmentActivity.getWindow().getDecorView().post(new e.2(paramMMFragmentActivity, paramView));
  }
  
  public static int cM(Context paramContext)
  {
    int i = 0;
    Object localObject = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(a.c.actionBarSize, (TypedValue)localObject, true)) {
      i = TypedValue.complexToDimensionPixelSize(((TypedValue)localObject).data, paramContext.getResources().getDisplayMetrics());
    }
    localObject = paramContext.getResources().getDisplayMetrics();
    int j = i;
    if (i <= 0)
    {
      if (((DisplayMetrics)localObject).widthPixels > ((DisplayMetrics)localObject).heightPixels) {
        j = paramContext.getResources().getDimensionPixelSize(a.e.DefaultActionbarHeightLand);
      }
    }
    else {
      return j;
    }
    return paramContext.getResources().getDimensionPixelSize(a.e.DefaultActionbarHeightPort);
  }
  
  public static int eK(Context paramContext)
  {
    int i = 0;
    if ((paramContext instanceof MMActivity)) {
      i = ((MMActivity)paramContext).mController.getTitleLocation();
    }
    int j = i;
    if (i <= 0) {
      j = paramContext.getResources().getDimensionPixelSize(a.e.DefaultActionbarHeightPort);
    }
    return j;
  }
  
  public static int eL(Context paramContext)
  {
    int j = com.tencent.mm.ui.base.s.ap(paramContext, -1);
    Rect localRect;
    int i;
    if (j > 0)
    {
      localRect = new Rect();
      ((Activity)paramContext).getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
      i = j;
      if (localRect.top > j) {
        i = 0;
      }
      return i;
    }
    if ((paramContext instanceof Activity))
    {
      localRect = new Rect();
      ((Activity)paramContext).getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
      i = ((Activity)paramContext).getWindow().getDecorView().getHeight();
      int[] arrayOfInt = new int[2];
      ((Activity)paramContext).getWindow().getDecorView().getLocationOnScreen(arrayOfInt);
      if ((i - localRect.height() >= 0) && (arrayOfInt[1] > 200)) {
        return i - localRect.height();
      }
      return localRect.top;
    }
    return a.fromDPToPix(paramContext, 20);
  }
  
  public static void k(MMActivity paramMMActivity)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      paramMMActivity.supportRequestWindowFeature(109);
    }
  }
  
  public static void l(MMActivity paramMMActivity)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      paramMMActivity.getWindow().getDecorView().post(new e.1(paramMMActivity));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */