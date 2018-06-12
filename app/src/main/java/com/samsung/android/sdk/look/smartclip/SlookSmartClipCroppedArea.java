package com.samsung.android.sdk.look.smartclip;

import android.graphics.Rect;
import android.view.View;

public abstract interface SlookSmartClipCroppedArea
{
  public abstract Rect getRect();
  
  public abstract boolean intersects(Rect paramRect);
  
  public abstract boolean intersects(View paramView);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/samsung/android/sdk/look/smartclip/SlookSmartClipCroppedArea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */