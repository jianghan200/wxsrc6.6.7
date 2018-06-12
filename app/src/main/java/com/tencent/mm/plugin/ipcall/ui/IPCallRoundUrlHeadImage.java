package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.c;

public class IPCallRoundUrlHeadImage
  extends CdnImageView
{
  public IPCallRoundUrlHeadImage(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public IPCallRoundUrlHeadImage(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void setImageBitmapCompleted(Bitmap paramBitmap)
  {
    if (paramBitmap != null) {
      setImageBitmap(c.a(paramBitmap, false, 0.5F * paramBitmap.getWidth()));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallRoundUrlHeadImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */