package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.a.j;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

public final class m
  extends h
{
  public ImageView qvP;
  public MMPinProgressBtn qvQ;
  public ImageView qvR;
  private ImageView qvS;
  
  public m(View paramView, k paramk)
  {
    super(paramView, paramk);
    this.qvP = ((ImageView)paramView.findViewById(R.h.status_btn));
    this.qvQ = ((MMPinProgressBtn)paramView.findViewById(R.h.video_progress));
    this.qvR = ((ImageView)paramView.findViewById(R.h.video_thumb));
    this.qvP.setImageResource(R.k.shortvideo_play_btn);
    this.qvS = ((ImageView)paramView.findViewById(R.h.video_mask));
    this.eRj.setVisibility(8);
    this.qvq.setVisibility(8);
    this.qvS.setVisibility(8);
    this.qvu.setTag(this);
    this.qvu.setOnClickListener(this.jXR);
  }
  
  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    j localj = (j)paramb;
    Object localObject3 = com.tencent.mm.plugin.wenote.b.c.Sq(localj.bOX);
    Object localObject1 = localObject3;
    if (localObject3 == null)
    {
      localObject1 = localObject3;
      if (com.tencent.mm.a.e.cn(localj.bVd))
      {
        localObject3 = com.tencent.mm.plugin.fav.ui.c.By(localj.bVd);
        localObject1 = localObject3;
        if (localObject3 == null) {}
      }
    }
    for (;;)
    {
      try
      {
        if (com.tencent.mm.a.e.cn(localj.bOX)) {
          com.tencent.mm.a.e.deleteFile(localj.bOX);
        }
        com.tencent.mm.pluginsdk.i.e.a((Bitmap)localObject3, Bitmap.CompressFormat.JPEG, localj.bOX);
        localObject1 = localObject3;
        if (localObject1 == null) {
          break label180;
        }
        localObject3 = this.qvR.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject3).width = -1;
        ((ViewGroup.LayoutParams)localObject3).height = -1;
        this.qvR.setLayoutParams((ViewGroup.LayoutParams)localObject3);
        this.qvR.setImageBitmap((Bitmap)localObject1);
        this.qvR.setBackground(null);
        if (!paramb.qoO) {
          break label256;
        }
        this.qvS.setVisibility(0);
        super.a(paramb, paramInt1, paramInt2);
        return;
      }
      catch (Exception localException)
      {
        localObject2 = localObject3;
      }
      continue;
      label180:
      Object localObject2 = this.qvR.getResources().getDisplayMetrics();
      float f = ((DisplayMetrics)localObject2).density;
      localObject3 = this.qvR.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject3).width = (((DisplayMetrics)localObject2).widthPixels - (int)(f * 40.0F + 0.5F));
      ((ViewGroup.LayoutParams)localObject3).height = (((ViewGroup.LayoutParams)localObject3).width * 52 / 68);
      this.qvR.setLayoutParams((ViewGroup.LayoutParams)localObject3);
      continue;
      label256:
      this.qvS.setVisibility(8);
    }
  }
  
  public final int caZ()
  {
    return 6;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */