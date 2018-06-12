package com.tencent.mm.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout;

public class KeyboardLinearLayout
  extends OnLayoutChangedLinearLayout
{
  public String TAG = "MicroMsg.KeyboardLinearLayout";
  private boolean mHasInit = false;
  private int mHeight;
  private boolean tki;
  private a tkj;
  
  public KeyboardLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mHasInit = false;
    this.mHeight = 0;
    this.tki = false;
    this.TAG += getId();
  }
  
  public KeyboardLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void AG(int paramInt)
  {
    if (!this.mHasInit)
    {
      this.mHasInit = true;
      this.mHeight = paramInt;
      x.i(this.TAG, "init height:%d", new Object[] { Integer.valueOf(this.mHeight) });
      if (this.tkj != null) {
        this.tkj.qN(-1);
      }
      if ((this.mHasInit) && (!this.tki) && (this.mHeight - paramInt > 100))
      {
        this.tki = true;
        qN(-3);
        x.w(this.TAG, "show keyboard!! mHeight: " + this.mHeight + " b: " + paramInt);
      }
      if ((this.mHasInit) && (this.tki) && (this.mHeight - paramInt <= 100))
      {
        this.tki = false;
        qN(-2);
        x.w(this.TAG, "hide keyboard!! mHeight: " + this.mHeight + " b: " + paramInt);
      }
      return;
    }
    if (this.mHeight < paramInt) {}
    for (int i = paramInt;; i = this.mHeight)
    {
      this.mHeight = i;
      break;
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AG(paramInt4);
  }
  
  public void qN(int paramInt)
  {
    if (this.tkj != null) {
      this.tkj.qN(paramInt);
    }
  }
  
  public void setOnkbdStateListener(a parama)
  {
    this.tkj = parama;
  }
  
  public static abstract interface a
  {
    public abstract void qN(int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/KeyboardLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */