package com.tencent.mm.ui.widget.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.j;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.mm.bw.a.f;
import com.tencent.mm.bw.a.g;
import com.tencent.mm.bw.a.j;

public final class b
  extends j
{
  private Context mContext;
  
  public b(Context paramContext)
  {
    this(paramContext, (byte)0);
  }
  
  private b(Context paramContext, byte paramByte)
  {
    super(paramContext, a.j.CustomSheetStyle);
    this.mContext = paramContext;
    dm();
  }
  
  private View b(int paramInt, View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    Object localObject1 = getWindow();
    Object localObject2;
    label66:
    View localView;
    if (bdK())
    {
      ((Window)localObject1).setGravity(5);
      ((Window)localObject1).setWindowAnimations(a.j.RightToLeftAnimation);
      ((Window)localObject1).getDecorView().setPadding(0, 0, 0, 0);
      localObject2 = ((Window)localObject1).getAttributes();
      if (!bdK()) {
        break label211;
      }
      ((WindowManager.LayoutParams)localObject2).width = -2;
      ((WindowManager.LayoutParams)localObject2).height = -1;
      ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
      localObject2 = (ViewGroup)LayoutInflater.from(this.mContext).inflate(a.g.menu_sheet_dialog, null);
      localView = ((ViewGroup)localObject2).findViewById(a.f.touch_outside);
      localObject1 = paramView;
      if (paramInt != 0)
      {
        localObject1 = paramView;
        if (paramView == null) {
          localObject1 = getLayoutInflater().inflate(paramInt, (ViewGroup)localObject2, false);
        }
      }
      if (!bdK()) {
        break label227;
      }
      paramView = (FrameLayout)((ViewGroup)localObject2).findViewById(a.f.menu_sheet_right_container);
      label148:
      paramView.setVisibility(0);
      if (paramLayoutParams != null) {
        break label242;
      }
      paramView.addView((View)localObject1);
      label163:
      if (Build.VERSION.SDK_INT >= 11) {
        break label252;
      }
      paramInt = 1;
    }
    for (;;)
    {
      if (paramInt != 0) {
        localView.setOnClickListener(new b.1(this));
      }
      return (View)localObject2;
      ((Window)localObject1).setGravity(80);
      ((Window)localObject1).setWindowAnimations(a.j.BottomToTopAnimation);
      break;
      label211:
      ((WindowManager.LayoutParams)localObject2).width = -1;
      ((WindowManager.LayoutParams)localObject2).height = -2;
      break label66;
      label227:
      paramView = (FrameLayout)((ViewGroup)localObject2).findViewById(a.f.menu_sheet_bottom_container);
      break label148;
      label242:
      paramView.addView((View)localObject1, paramLayoutParams);
      break label163;
      label252:
      paramView = new TypedValue();
      if (getContext().getTheme().resolveAttribute(16843611, paramView, true))
      {
        if (paramView.data != 0) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
      }
      else {
        paramInt = 0;
      }
    }
  }
  
  private boolean bdK()
  {
    return this.mContext.getResources().getConfiguration().orientation == 2;
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setLayout(-1, -1);
  }
  
  public final void setContentView(int paramInt)
  {
    super.setContentView(b(paramInt, null, null));
  }
  
  public final void setContentView(View paramView)
  {
    super.setContentView(b(0, paramView, null));
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(b(0, paramView, paramLayoutParams));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/widget/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */