package com.tencent.mm.plugin.product.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.product.b.n.a;
import com.tencent.mm.sdk.platformtools.bi;

public final class m
  implements y.a
{
  public TextView eBO;
  public ImageView gxd;
  public n.a lTD;
  
  public final void m(String paramString, Bitmap paramBitmap)
  {
    if ((this.lTD == null) || (bi.oW(this.lTD.iconUrl))) {}
    while (!paramString.equals(this.lTD.iconUrl)) {
      return;
    }
    this.gxd.post(new m.1(this, paramBitmap));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/product/ui/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */