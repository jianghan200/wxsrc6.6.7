package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  private static b onb = new b();
  private com.tencent.mm.kiss.widget.textview.a.a omZ = null;
  public int ona = 0;
  
  public static b bEX()
  {
    return onb;
  }
  
  public final com.tencent.mm.kiss.widget.textview.a.a getTextViewConfig()
  {
    int i = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), (int)(15.0F * com.tencent.mm.bp.a.fe(ad.getContext())));
    if ((this.omZ == null) || ((int)this.omZ.duz != i)) {
      this.omZ = com.tencent.mm.kiss.widget.textview.a.b.Fe().V(i).gN(ad.getContext().getResources().getColor(i.c.sns_comment_color)).gM(16).duk;
    }
    return this.omZ;
  }
  
  public final int getViewWidth()
  {
    if (this.ona <= 0)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)ad.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      int i = localDisplayMetrics.widthPixels;
      int j = (int)(ad.getResources().getDimension(i.d.NormalPadding) + ad.getResources().getDimension(i.d.NormalPadding));
      int k = (int)ad.getResources().getDimension(i.d.sns_timeilne_margin_left);
      int m = (int)ad.getResources().getDimension(i.d.NormalPadding);
      this.ona = (i - k - j - m);
      x.i("MicroMsg.SnsCommentPreloadTextViewConfig", "screenWidth " + i + " textViewWidth " + this.ona + " padding: " + j + " marginLeft: " + k + " thisviewPadding: " + m);
    }
    return this.ona;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */