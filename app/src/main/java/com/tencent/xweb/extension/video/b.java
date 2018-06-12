package com.tencent.xweb.extension.video;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import org.xwalk.core.R.id;

public final class b
{
  ImageView gaS = null;
  ImageView ndi;
  ImageView ndj;
  private ImageView ndk = null;
  float tua;
  float upl = 0.0F;
  a vAZ;
  boolean vBa = false;
  float vBb;
  
  public b(FrameLayout paramFrameLayout, a parama)
  {
    this.vAZ = parama;
    this.ndi = ((ImageView)paramFrameLayout.findViewById(R.id.player_progress_bar_front));
    this.gaS = ((ImageView)paramFrameLayout.findViewById(R.id.player_progress_bar_middle));
    this.ndj = ((ImageView)paramFrameLayout.findViewById(R.id.player_progress_bar_background));
    this.ndk = ((ImageView)paramFrameLayout.findViewById(R.id.player_progress_point));
    this.ndk.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        float f1 = 0.0F;
        if (paramAnonymousMotionEvent.getAction() == 0)
        {
          b.this.vBa = false;
          b.this.upl = paramAnonymousMotionEvent.getX();
          if (b.this.vAZ != null) {
            b.this.vAZ.ajO();
          }
          return true;
        }
        float f2;
        if (paramAnonymousMotionEvent.getAction() == 2)
        {
          f2 = paramAnonymousMotionEvent.getX();
          float f3 = b.this.ndi.getWidth();
          f2 = (int)(f2 - b.this.upl + f3);
          if (f2 >= 0.0F) {}
        }
        for (;;)
        {
          b.this.vBb = (f1 * 100.0F / b.this.ndj.getWidth());
          b.this.c(b.this.vBb, true);
          if (b.this.vAZ != null) {
            b.this.vAZ.ajO();
          }
          b.this.vBa = true;
          return true;
          if (f2 > b.this.ndj.getWidth())
          {
            f1 = b.this.ndj.getWidth();
            continue;
            if ((b.this.vBa) && (b.this.vAZ != null)) {
              b.this.vAZ.aJ(b.this.vBb);
            }
            b.this.vBa = false;
            return true;
          }
          else
          {
            f1 = f2;
          }
        }
      }
    });
  }
  
  public final void c(float paramFloat, boolean paramBoolean)
  {
    if ((this.vBa) && (!paramBoolean)) {
      return;
    }
    float f;
    if (paramFloat < 0.0F) {
      f = 0.0F;
    }
    for (;;)
    {
      this.tua = f;
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.ndk.getLayoutParams();
      localLayoutParams.leftMargin = ((int)(f / 100.0F * this.ndj.getWidth() - this.ndk.getWidth() / 2));
      this.ndk.setLayoutParams(localLayoutParams);
      this.ndk.requestLayout();
      localLayoutParams = (FrameLayout.LayoutParams)this.ndi.getLayoutParams();
      localLayoutParams.width = ((int)(f / 100.0F * this.ndj.getWidth()));
      this.ndi.setLayoutParams(localLayoutParams);
      this.ndi.requestLayout();
      return;
      f = paramFloat;
      if (paramFloat > 100.0F) {
        f = 100.0F;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void aJ(float paramFloat);
    
    public abstract void ajO();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/xweb/extension/video/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */