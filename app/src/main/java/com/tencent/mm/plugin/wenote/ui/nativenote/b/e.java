package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.wenote.b.c;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.sdk.platformtools.bi;

public final class e
  extends h
{
  private int dwJ = 0;
  private ImageView qvj;
  
  public e(View paramView, k paramk)
  {
    super(paramView, paramk);
    this.bOA.setVisibility(0);
    this.eRj.setVisibility(8);
    this.qvq.setVisibility(8);
    this.bOA.setTag(this);
    this.bOA.setOnClickListener(this.jXR);
    this.qvj = ((ImageView)paramView.findViewById(R.h.image_mask));
    this.qvj.setVisibility(8);
    this.dwJ = (k.mScreenWidth - (int)k.aq(20.0F));
  }
  
  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    Object localObject1 = ((com.tencent.mm.plugin.wenote.model.a.e)paramb).bVd;
    Object localObject2 = ((com.tencent.mm.plugin.wenote.model.a.e)paramb).qpe;
    if (!com.tencent.mm.a.e.cn((String)localObject1)) {
      if (com.tencent.mm.a.e.cn((String)localObject2)) {
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      if (this.qtF.qrC == 3) {
        if (com.tencent.mm.a.e.cn((String)localObject2)) {
          localObject1 = localObject2;
        }
      }
      for (;;)
      {
        label61:
        if (bi.oW((String)localObject1))
        {
          localObject1 = null;
          label72:
          this.bOA.setImageBitmap(null);
          localObject2 = this.bOA.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject2).width = -1;
          ((ViewGroup.LayoutParams)localObject2).height = -1;
          this.bOA.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          if (localObject1 == null) {
            break label166;
          }
          this.bOA.setImageBitmap((Bitmap)localObject1);
          label124:
          if (!paramb.qoO) {
            break label225;
          }
          this.qvj.setVisibility(0);
        }
        for (;;)
        {
          super.a(paramb, paramInt1, paramInt2);
          return;
          localObject1 = null;
          break;
          break label61;
          localObject1 = c.Sq((String)localObject1);
          break label72;
          label166:
          this.bOA.setImageBitmap(null);
          localObject1 = this.bOA.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject1).width = this.dwJ;
          ((ViewGroup.LayoutParams)localObject1).height = this.dwJ;
          this.bOA.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          this.bOA.setBackgroundColor(Color.parseColor("#f6f6f6"));
          break label124;
          label225:
          this.qvj.setVisibility(8);
        }
      }
    }
  }
  
  public final int caZ()
  {
    return 2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */