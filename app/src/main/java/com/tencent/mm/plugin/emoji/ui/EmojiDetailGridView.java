package com.tencent.mm.plugin.emoji.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.tencent.mm.view.SmileySubGrid;

public class EmojiDetailGridView
  extends SmileySubGrid
{
  private String iiv;
  private EmojiDetailScrollView ilZ;
  private volatile boolean ima = true;
  
  public EmojiDetailGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected int getLongTouchTime()
  {
    return 200;
  }
  
  public String getProductId()
  {
    return this.iiv;
  }
  
  protected final int getSkewingY$3c7ec8d0()
  {
    return 0;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
  }
  
  public void setEmojiDetailScrollView(EmojiDetailScrollView paramEmojiDetailScrollView)
  {
    this.ilZ = paramEmojiDetailScrollView;
  }
  
  public void setProductId(String paramString)
  {
    this.iiv = paramString;
  }
  
  protected void setScrollEnable(boolean paramBoolean)
  {
    if (this.ilZ != null) {
      this.ilZ.setScrollEnable(paramBoolean);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/EmojiDetailGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */