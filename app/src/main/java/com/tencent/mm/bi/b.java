package com.tencent.mm.bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.Editable;
import android.view.MotionEvent;
import com.tencent.mm.api.e;
import com.tencent.mm.api.i;
import com.tencent.mm.api.j;
import com.tencent.mm.api.l;
import com.tencent.mm.api.m.a;

public abstract interface b
{
  public abstract boolean I(MotionEvent paramMotionEvent);
  
  public abstract com.tencent.mm.cache.d a(com.tencent.mm.d.a parama);
  
  public abstract void a(Editable paramEditable, int paramInt1, int paramInt2);
  
  public abstract void a(j paramj, boolean paramBoolean);
  
  public abstract void a(m.a parama);
  
  public abstract void a(com.tencent.mm.view.a parama);
  
  public abstract <T extends com.tencent.mm.d.b> T b(com.tencent.mm.api.d paramd);
  
  public abstract void c(i parami);
  
  public abstract void cfP();
  
  public abstract com.tencent.mm.view.a cfQ();
  
  public abstract <T extends com.tencent.mm.d.b> T cfR();
  
  public abstract Bitmap cfS();
  
  public abstract boolean cfT();
  
  public abstract m.a getConfig();
  
  public abstract Context getContext();
  
  public abstract float getCurScale();
  
  public abstract com.tencent.mm.api.d[] getFeatures();
  
  public abstract float getInitScale();
  
  public abstract l getSelectedFeatureListener();
  
  public abstract void onAttachedToWindow();
  
  public abstract void onDestroy();
  
  public abstract void onDraw(Canvas paramCanvas);
  
  public abstract void onFinish();
  
  public abstract void setActionBarCallback(e parame);
  
  public abstract void setAutoShowFooterAndBar(boolean paramBoolean);
  
  public abstract boolean tW();
  
  public abstract void ua();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/bi/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */