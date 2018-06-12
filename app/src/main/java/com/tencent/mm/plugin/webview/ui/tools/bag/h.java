package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.graphics.Point;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.b;

public final class h
{
  static void a(MMActivity paramMMActivity, Point paramPoint, float paramFloat, e parame)
  {
    as.I(ad.getContext(), R.l.webview_minimize_sound_path);
    b.a(paramMMActivity, new h.1(parame, paramMMActivity, paramPoint, paramFloat));
  }
  
  public static void a(MMActivity paramMMActivity, Point paramPoint, e parame)
  {
    a(paramMMActivity, paramPoint, -1.0F, parame);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/bag/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */