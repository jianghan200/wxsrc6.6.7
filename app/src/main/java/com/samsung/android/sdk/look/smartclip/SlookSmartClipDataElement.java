package com.samsung.android.sdk.look.smartclip;

import android.graphics.Rect;

public abstract interface SlookSmartClipDataElement
{
  public abstract void addTag(SlookSmartClipMetaTag paramSlookSmartClipMetaTag);
  
  public abstract SlookSmartClipMetaTagArray getAllTag();
  
  public abstract Rect getMetaAreaRect();
  
  public abstract SlookSmartClipMetaTagArray getTag(String paramString);
  
  public abstract void removeTag(String paramString);
  
  public abstract void setMetaAreaRect(Rect paramRect);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/samsung/android/sdk/look/smartclip/SlookSmartClipDataElement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */