package com.tencent.mm.view.footer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.tencent.mm.api.d;
import com.tencent.mm.bd.a.g;
import com.tencent.mm.bi.b;

public final class c
  extends a
{
  private Bitmap uVt;
  private Bitmap uVu;
  
  public c(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  protected final boolean GU(int paramInt)
  {
    boolean bool = super.GU(paramInt);
    switch (c.1.qVw[GT(paramInt).ordinal()])
    {
    default: 
      return bool;
    }
    return false;
  }
  
  protected final Bitmap a(d paramd, boolean paramBoolean)
  {
    Bitmap localBitmap = null;
    if (paramd == d.bwS)
    {
      if (paramBoolean) {
        localBitmap = this.uVu;
      }
    }
    else {
      return localBitmap;
    }
    return this.uVt;
  }
  
  protected final void cCi()
  {
    super.cCi();
    this.uVt = com.tencent.mm.sdk.platformtools.c.s(getResources().getDrawable(a.g.crop_video_unselected));
    this.uVu = com.tencent.mm.sdk.platformtools.c.s(getResources().getDrawable(a.g.crop_video_selected));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/view/footer/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */