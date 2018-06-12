package com.tencent.mm.pluginsdk.ui.tools;

import android.view.View;
import com.tencent.mm.sdk.platformtools.x;

public final class n
{
  private static int qTR = -1;
  
  public static void a(View paramView, VideoSightView paramVideoSightView)
  {
    if ((paramView == null) || (paramVideoSightView == null)) {
      x.e("VideoSightHelper", "null view object " + paramView + "," + paramVideoSightView);
    }
    while (paramView.getVisibility() != 0) {
      return;
    }
    paramVideoSightView.addOnLayoutChangeListener(new n.1(paramView));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */