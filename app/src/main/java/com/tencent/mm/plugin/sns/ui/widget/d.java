package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mm.kiss.widget.textview.a.b;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class d
{
  private static d one = new d();
  public int ona = 0;
  private com.tencent.mm.kiss.widget.textview.a.a onf = null;
  private com.tencent.mm.kiss.widget.textview.a.a ong = null;
  
  public static d bEY()
  {
    return one;
  }
  
  public static float getTextSize()
  {
    return com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), (int)(16.0F * com.tencent.mm.bp.a.fe(ad.getContext())));
  }
  
  public final com.tencent.mm.kiss.widget.textview.a.a bEZ()
  {
    int i = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), (int)(16.0F * com.tencent.mm.bp.a.fe(ad.getContext())));
    if ((this.ong == null) || ((int)this.ong.duz != i))
    {
      b localb = b.Fe().gM(8388627).gN(ad.getContext().getResources().getColor(i.c.normal_text_color)).V(i);
      localb.duk.maxLines = 6;
      this.ong = localb.duk;
    }
    return this.ong;
  }
  
  public final com.tencent.mm.kiss.widget.textview.a.a getTextViewConfig()
  {
    int i = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), (int)(16.0F * com.tencent.mm.bp.a.fe(ad.getContext())));
    if ((this.onf == null) || ((int)this.onf.duz != i)) {
      this.onf = b.Fe().gM(8388627).gN(ad.getContext().getResources().getColor(i.c.normal_text_color)).V(i).duk;
    }
    return this.onf;
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
      this.ona = (i - k - j);
      x.i("MicroMsg.SnsPostDescPreloadTextViewConfig", "screenWidth " + i + " textViewWidth " + this.ona + " padding: " + j + " marginLeft: " + k + " thisviewPadding: " + m);
    }
    return this.ona;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */