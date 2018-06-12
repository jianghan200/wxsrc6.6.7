package com.tencent.mm.plugin.voip.widget;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.voip.ui.c;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMTextureView;
import java.lang.ref.WeakReference;

public abstract class BaseSmallView
  extends FrameLayout
{
  private WindowManager inU;
  protected ag ioW;
  private View.OnClickListener mOnClickListener;
  private long mStartTime;
  CaptureView oLP;
  protected long oMa;
  protected WeakReference<c> oQd;
  public MMTextureView oRM;
  private PointF oVD = new PointF();
  private Point oVE = new Point();
  private Point oVF = new Point();
  private Point oVG = new Point();
  private Point oVH;
  private Runnable oVI = new BaseSmallView.1(this);
  
  public BaseSmallView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.inU = ((WindowManager)paramContext.getSystemService("window"));
    this.ioW = new ag();
    this.oVH = new Point(this.inU.getDefaultDisplay().getWidth(), this.inU.getDefaultDisplay().getHeight());
  }
  
  private void dW(int paramInt1, int paramInt2)
  {
    WindowManager.LayoutParams localLayoutParams;
    if (this.inU != null)
    {
      localLayoutParams = (WindowManager.LayoutParams)getLayoutParams();
      localLayoutParams.x = paramInt1;
      localLayoutParams.y = paramInt2;
      x.d("MicroMsg.Voip.BaseSmallView", "updateWindowPosition, x: %d, y: %d", new Object[] { Integer.valueOf(localLayoutParams.x), Integer.valueOf(localLayoutParams.y) });
    }
    try
    {
      this.inU.updateViewLayout(this, localLayoutParams);
      return;
    }
    catch (Throwable localThrowable)
    {
      x.printErrStackTrace("MicroMsg.Voip.BaseSmallView", localThrowable, "", new Object[0]);
    }
  }
  
  public void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
  
  public void bKB() {}
  
  public abstract void bLM();
  
  public abstract void bLN();
  
  public void c(int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void dV(int paramInt1, int paramInt2) {}
  
  public abstract void onAnimationEnd();
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
    case 2: 
      for (;;)
      {
        return true;
        this.oVD.x = paramMotionEvent.getRawX();
        this.oVD.y = paramMotionEvent.getRawY();
        paramMotionEvent = (WindowManager.LayoutParams)getLayoutParams();
        this.oVE.x = paramMotionEvent.x;
        this.oVE.y = paramMotionEvent.y;
        continue;
        dW((int)Math.max(Math.min(this.oVE.x + paramMotionEvent.getRawX() - this.oVD.x, this.oVH.x), 0.0F), (int)Math.max(Math.min(this.oVE.y + paramMotionEvent.getRawY() - this.oVD.y, this.oVH.y), 0.0F));
      }
    }
    if ((Math.abs(paramMotionEvent.getRawX() - this.oVD.x) < BackwardSupportUtil.b.b(getContext(), 3.0F)) && (Math.abs(paramMotionEvent.getRawY() - this.oVD.y) < BackwardSupportUtil.b.b(getContext(), 3.0F)) && (this.mOnClickListener != null)) {
      this.mOnClickListener.onClick(this);
    }
    bLM();
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    this.oVF.x = ((int)Math.max(Math.min(f1 + this.oVE.x - this.oVD.x, this.oVH.x), 0.0F));
    this.oVF.y = ((int)Math.max(Math.min(f2 + this.oVE.y - this.oVD.y, this.oVH.y), 0.0F));
    int i = BackwardSupportUtil.b.b(getContext(), 5.0F);
    if (this.oVF.x + getWidth() / 2 <= this.oVH.x / 2) {}
    for (this.oVG.x = i;; this.oVG.x = (this.oVH.x - getWidth() - i))
    {
      this.oVG.y = this.oVF.y;
      this.mStartTime = System.currentTimeMillis();
      this.ioW.postDelayed(this.oVI, 5L);
      bLN();
      break;
    }
  }
  
  public abstract void setCaptureView(CaptureView paramCaptureView);
  
  public void setConnectSec(long paramLong)
  {
    this.oMa = paramLong;
  }
  
  public void setHWDecMode(int paramInt) {}
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mOnClickListener = paramOnClickListener;
  }
  
  public void setVoipUIListener(c paramc)
  {
    x.i("MicroMsg.Voip.BaseSmallView", "hwViewSmall setVoipUIListener, before initHWView");
    this.oQd = new WeakReference(paramc);
    ((c)this.oQd.get()).a(this.oRM);
  }
  
  public void uninit()
  {
    this.ioW.removeCallbacks(this.oVI);
    this.inU = null;
    if (this.oLP != null)
    {
      removeView(this.oLP);
      this.oLP = null;
      x.d("MicroMsg.Voip.BaseSmallView", "CaptureView removed");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/voip/widget/BaseSmallView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */