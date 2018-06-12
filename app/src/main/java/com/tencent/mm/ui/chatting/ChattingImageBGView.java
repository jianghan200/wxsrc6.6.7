package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.mm.sdk.platformtools.x;

public class ChattingImageBGView
  extends ImageView
{
  private int gJE = 0;
  private Bitmap jDx;
  
  public ChattingImageBGView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setScaleType(ImageView.ScaleType.CENTER_CROP);
  }
  
  public ChattingImageBGView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setScaleType(ImageView.ScaleType.CENTER_CROP);
  }
  
  private void ctu()
  {
    post(new ChattingImageBGView.1(this));
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (this.gJE != paramInt3 - paramInt1))
    {
      this.gJE = (paramInt3 - paramInt1);
      x.d("MicroMsg.ChattingImageBGView", "on layout changed, %d, %d, %d, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      ctu();
    }
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    this.jDx = paramBitmap;
    super.setImageBitmap(paramBitmap);
    ctu();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/ChattingImageBGView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */