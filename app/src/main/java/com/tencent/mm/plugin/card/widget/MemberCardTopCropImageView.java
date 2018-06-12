package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.sdk.platformtools.ad;

public class MemberCardTopCropImageView
  extends ImageView
{
  protected int hGJ = -1;
  protected int hJO = -1;
  private float hJP;
  protected int itemPadding = -1;
  
  public MemberCardTopCropImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public MemberCardTopCropImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    setScaleType(ImageView.ScaleType.MATRIX);
    this.hGJ = a.ad(ad.getContext(), a.b.card_item_height);
    this.itemPadding = (a.ad(ad.getContext(), a.b.MiddlePadding) * 2);
  }
  
  public float getShowScale()
  {
    return this.hJP;
  }
  
  protected boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (getDrawable() == null) {
      return super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    Matrix localMatrix = getImageMatrix();
    int i = getDrawable().getIntrinsicWidth();
    int j = getDrawable().getIntrinsicHeight();
    this.hJO = (getContext().getResources().getDisplayMetrics().widthPixels - this.itemPadding);
    int k = this.hJO;
    int m = this.hGJ;
    if (i * m > j * k) {}
    for (this.hJP = (m / j);; this.hJP = (k / i))
    {
      localMatrix.setScale(this.hJP, this.hJP);
      setImageMatrix(localMatrix);
      return super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/card/widget/MemberCardTopCropImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */