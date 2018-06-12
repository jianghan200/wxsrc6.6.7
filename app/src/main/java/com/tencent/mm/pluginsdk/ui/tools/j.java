package com.tencent.mm.pluginsdk.ui.tools;

import android.annotation.TargetApi;
import android.widget.ListView;
import com.tencent.mm.sdk.platformtools.x;

@TargetApi(11)
public final class j
{
  public static void a(ListView paramListView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramListView == null) {
      return;
    }
    x.i("MicroMsg.ChattingUI.ScrollController", "setSelectionFromTop position %s smooth %s", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean) });
    paramListView.setItemChecked(paramInt1, true);
    paramListView.setSelectionFromTop(paramInt1, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */