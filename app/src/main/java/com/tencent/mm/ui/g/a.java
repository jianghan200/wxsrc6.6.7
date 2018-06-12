package com.tencent.mm.ui.g;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public final class a
{
  private static b uuF;
  private static b uuG;
  
  @TargetApi(11)
  public static void b(Activity paramActivity, View paramView)
  {
    View localView = paramActivity.getWindow().getDecorView();
    uuF = b.gZ(paramActivity);
    uuG = b.gZ(paramActivity);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    Object localObject = new Rect();
    paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject);
    int i = ((Rect)localObject).top;
    int j = ((AppCompatActivity)paramActivity).getSupportActionBar().getHeight();
    int k = arrayOfInt[1];
    uuF.setHeight(k - i - j);
    localObject = new int[2];
    if ((paramActivity instanceof Activity))
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((Activity)paramActivity).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      localObject[0] = localDisplayMetrics.widthPixels;
      localObject[1] = localDisplayMetrics.heightPixels;
    }
    for (;;)
    {
      k = localObject[1];
      int m = arrayOfInt[1];
      int n = paramView.getHeight();
      uuG.setHeight(k - m - n);
      uuF.showAtLocation(localView, 48, 0, i + j);
      uuG.showAtLocation(localView, 80, 0, 0);
      return;
      paramActivity = ((WindowManager)paramActivity.getSystemService("window")).getDefaultDisplay();
      localObject[0] = paramActivity.getWidth();
      localObject[1] = paramActivity.getHeight();
    }
  }
  
  public static void dismiss()
  {
    if (uuF != null)
    {
      uuF.setAnimationStyle(-1);
      uuF.dismiss();
      uuF = null;
    }
    if (uuG != null)
    {
      uuG.setAnimationStyle(-1);
      uuG.dismiss();
      uuG = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */