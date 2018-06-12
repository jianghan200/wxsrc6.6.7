package com.tencent.neattextview.textview.layout;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import java.io.Serializable;

public abstract interface a
  extends Serializable
{
  public abstract void a(Canvas paramCanvas, TextPaint paramTextPaint, float paramFloat);
  
  public abstract float[] cEb();
  
  public abstract RectF cEc();
  
  public abstract float cEd();
  
  public abstract boolean cEe();
  
  public abstract float cEf();
  
  public abstract int getEnd();
  
  public abstract float getHeight();
  
  public abstract int getStart();
  
  public abstract float getWidth();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/neattextview/textview/layout/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */