package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.ui.w;
import com.tencent.mm.plugin.sns.ui.w.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class e
  implements w
{
  private Context context;
  TextView nNC;
  private ImageView nZa;
  w.a olA;
  float olB;
  View olC;
  ImageView olD;
  private View olE;
  private View olF;
  private int olG;
  Rect olH;
  private boolean olx;
  c oly;
  DynamicGridView olz;
  
  public e(View paramView1, View paramView2, View paramView3, Context paramContext, List<String> paramList, DynamicGridView paramDynamicGridView, w.a parama, c.a parama1, boolean paramBoolean)
  {
    this.olx = paramBoolean;
    this.context = paramContext;
    this.olA = parama;
    this.olC = paramView2;
    this.olE = paramView3;
    this.olz = paramDynamicGridView;
    this.olD = ((ImageView)paramView2.findViewById(i.f.del_img));
    this.nNC = ((TextView)paramView2.findViewById(i.f.del_tv));
    this.olF = paramView1;
    paramDynamicGridView.setWobbleInEditMode(false);
    af.byd();
    this.olG = ((s.getScreenWidth() - paramContext.getResources().getDimensionPixelSize(i.d.sns_upload_previewimg_view_margin) * 4 - paramContext.getResources().getDimensionPixelSize(i.d.LargerPadding) * 2) / 3);
    paramDynamicGridView.setColumnWidth(this.olG + paramContext.getResources().getDimensionPixelSize(i.d.sns_upload_previewimg_view_margin) * 2);
    paramDynamicGridView.setNumColumns(3);
    paramDynamicGridView.setOverScrollMode(2);
    paramDynamicGridView.setStretchMode(0);
    paramDynamicGridView.setClipChildren(false);
    paramDynamicGridView.setClipToPadding(false);
    paramDynamicGridView.setSelector(new ColorDrawable(0));
    this.oly = new c(paramContext, paramList, paramBoolean, parama1);
    bEL();
    paramDynamicGridView.setAdapter(this.oly);
    paramDynamicGridView.setOnDragListener(new e.1(this, paramDynamicGridView));
    paramDynamicGridView.setOnItemLongClickListener(new e.2(this));
    paramDynamicGridView.setOnItemClickListener(new e.3(this));
    paramDynamicGridView.setOnDropListener(new e.4(this, paramDynamicGridView, paramView1));
    paramDynamicGridView.getViewTreeObserver().addOnPreDrawListener(new e.5(this, paramDynamicGridView, paramList));
    af.byd();
    if (s.getScreenWidth() == 0) {
      new ag().postDelayed(new e.6(this, paramList), 50L);
    }
  }
  
  private void bEL()
  {
    if ((ad.chZ().getBoolean("key_show_tips", true)) && (this.oly.bEK() > 1))
    {
      this.olE.setVisibility(0);
      this.nZa = ((ImageView)this.olE.findViewById(i.f.sns_img_close_iv));
      this.nZa.setOnClickListener(new e.7(this));
      return;
    }
    this.olE.setVisibility(8);
  }
  
  public final void clean()
  {
    if ((this.olz != null) && (this.olz.getAdapter() == null)) {
      ((c)this.olz.getAdapter()).nQt = true;
    }
  }
  
  public final View getView()
  {
    return this.olz;
  }
  
  public final void setImageClick(w.a parama)
  {
    this.olA = parama;
  }
  
  public final void setIsShowAddImage(boolean paramBoolean)
  {
    this.olx = paramBoolean;
  }
  
  public final void setList$22875ea3(List<String> paramList)
  {
    if (this.oly != null)
    {
      this.oly.cu(paramList);
      bEL();
    }
  }
  
  public final void xH(int paramInt)
  {
    int i = 3;
    af.byd();
    this.olG = ((s.getScreenWidth() - this.context.getResources().getDimensionPixelSize(i.d.sns_upload_previewimg_view_margin) * 4 - this.context.getResources().getDimensionPixelSize(i.d.LargerPadding) * 2) / 3);
    this.olz.setColumnWidth(this.olG + this.context.getResources().getDimensionPixelSize(i.d.sns_upload_previewimg_view_margin) * 2);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.olz.getLayoutParams();
    af.byd();
    x.i("DynamicGrid", "setGridViewMargins margin: screenWith:%d", new Object[] { Integer.valueOf(s.getScreenWidth()) });
    paramInt = (paramInt + 3) / 3;
    if (paramInt > 3) {
      paramInt = i;
    }
    for (;;)
    {
      i = localMarginLayoutParams.leftMargin;
      int j = this.olF.getHeight();
      int k = this.olG;
      int m = this.context.getResources().getDimensionPixelSize(i.d.sns_upload_previewimg_view_margin);
      int n = localMarginLayoutParams.rightMargin;
      float f = com.tencent.mm.sdk.platformtools.c.chu().density;
      localMarginLayoutParams.setMargins(i, j - k - m * 2, n, (int)((4 - paramInt) * (f * 32.0F)));
      this.olz.setLayoutParams(localMarginLayoutParams);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/previewimageview/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */