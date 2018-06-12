package com.tencent.mm.plugin.voip.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class MMCheckBox
  extends CheckBox
{
  private Drawable oQa;
  private int oQb;
  
  public MMCheckBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MMCheckBox(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.oQa != null)
    {
      int[] arrayOfInt = getDrawableState();
      this.oQa.setState(arrayOfInt);
      invalidate();
    }
  }
  
  @TargetApi(11)
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    if ((Build.VERSION.SDK_INT >= 11) && (this.oQa != null)) {
      this.oQa.jumpToCurrentState();
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int j = 0;
    super.onDraw(paramCanvas);
    Drawable localDrawable = this.oQa;
    int i;
    int k;
    int m;
    if (localDrawable != null)
    {
      i = getGravity();
      int n = getGravity();
      k = localDrawable.getIntrinsicHeight();
      m = localDrawable.getIntrinsicWidth();
      switch (i & 0x70)
      {
      default: 
        i = 0;
        switch (n & 0x7)
        {
        }
        break;
      }
    }
    for (;;)
    {
      localDrawable.setBounds(j, i, j + m, k + i);
      localDrawable.draw(paramCanvas);
      return;
      i = getHeight() - k;
      break;
      i = (getHeight() - k) / 2;
      break;
      j = getWidth() - m;
      continue;
      j = (getWidth() - m) / 2;
    }
  }
  
  public void setButtonDrawable(int paramInt)
  {
    if ((paramInt != 0) && (paramInt == this.oQb)) {
      return;
    }
    this.oQb = paramInt;
    Drawable localDrawable = null;
    if (this.oQb != 0) {
      localDrawable = getResources().getDrawable(this.oQb);
    }
    setButtonDrawable(localDrawable);
  }
  
  public void setButtonDrawable(Drawable paramDrawable)
  {
    this.oQa = paramDrawable;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.oQa);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voip/ui/MMCheckBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */