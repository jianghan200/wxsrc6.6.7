package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMTextureView;

public class MovableTextureView
  extends MMTextureView
{
  private float bBS;
  private float bBT;
  private View.OnClickListener mOnClickListener;
  public int mScreenHeight = 0;
  public int mScreenWidth = 0;
  public int mWidth = 320;
  public int oTN = 240;
  public int oUe = 800;
  public int oUf = 480;
  private long oUg;
  
  public MovableTextureView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MovableTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = 0;
    x.d("MicroMsg.MovableTextureView", "event: " + paramMotionEvent.getAction());
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
    case 2: 
      float f1;
      float f2;
      do
      {
        return true;
        this.bBS = paramMotionEvent.getRawX();
        this.bBT = paramMotionEvent.getRawY();
        this.oUg = System.currentTimeMillis();
        return true;
        f1 = paramMotionEvent.getRawX() - this.bBS;
        f2 = paramMotionEvent.getRawY() - this.bBT;
      } while ((Math.abs(f1) <= 1.0F) && (Math.abs(f2) <= 1.0F));
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
      int m = (int)(f1 + localLayoutParams.leftMargin);
      int k = (int)(f2 + localLayoutParams.topMargin);
      int i;
      if (m < 0)
      {
        i = 0;
        localLayoutParams.leftMargin = i;
        if (k >= 0) {
          break label229;
        }
        i = j;
      }
      for (;;)
      {
        localLayoutParams.topMargin = i;
        setLayoutParams(localLayoutParams);
        this.bBS = paramMotionEvent.getRawX();
        this.bBT = paramMotionEvent.getRawY();
        return true;
        i = m;
        if (m <= this.oUf) {
          break;
        }
        i = this.oUf;
        break;
        label229:
        if (k > this.oUe) {
          i = this.oUe;
        } else {
          i = k;
        }
      }
    }
    long l = System.currentTimeMillis();
    if ((this.oUg != 0L) && (l - this.oUg < 300L) && (l - this.oUg >= 0L) && (this.mOnClickListener != null)) {
      this.mOnClickListener.onClick(this);
    }
    h.mEJ.h(11079, new Object[] { Integer.valueOf(2) });
    return true;
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mOnClickListener = paramOnClickListener;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip/video/MovableTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */