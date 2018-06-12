package com.tencent.mm.plugin.sight.decode.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.TextView;

public abstract interface a
{
  public abstract void aO(String paramString, boolean paramBoolean);
  
  public abstract void bvE();
  
  public abstract boolean bvF();
  
  public abstract void clear();
  
  public abstract void dt(int paramInt1, int paramInt2);
  
  public abstract Object getTagObject();
  
  public abstract Context getUIContext();
  
  public abstract String getVideoPath();
  
  public abstract void setCanPlay(boolean paramBoolean);
  
  public abstract void setDrawableWidth(int paramInt);
  
  public abstract void setForceRecordState(boolean paramBoolean);
  
  public abstract void setOnCompletionListener(b.e parame);
  
  public abstract void setOnDecodeDurationListener(b.f paramf);
  
  public abstract void setOnSightCompletionAction(b.g paramg);
  
  public abstract void setPosition(int paramInt);
  
  public abstract void setSightInfoView(TextView paramTextView);
  
  public abstract void setTagObject(Object paramObject);
  
  public abstract void setThumbBmp(Bitmap paramBitmap);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sight/decode/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */