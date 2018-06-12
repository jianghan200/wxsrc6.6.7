package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.ak.a.a.c;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public class WebViewBag
  extends FrameLayout
{
  private static final int qcb = com.tencent.mm.bp.a.fl(ad.getContext()) - b.qbk - b.qbm - b.qbn;
  private ImageView gER;
  View ido;
  private WindowManager inU;
  protected ag ioW;
  private View.OnClickListener mOnClickListener;
  private long mStartTime;
  private PointF oVD = new PointF();
  private Point oVE = new Point();
  private Point oVF = new Point();
  private Point oVG = new Point();
  private Point oVH;
  private Runnable oVI = new Runnable()
  {
    public final void run()
    {
      float f = (float)(System.currentTimeMillis() - WebViewBag.a(WebViewBag.this)) * 1.0F / 200.0F;
      if (f <= 1.0F)
      {
        WebViewBag.this.ioW.postDelayed(WebViewBag.b(WebViewBag.this), 5L);
        WebViewBag localWebViewBag = WebViewBag.this;
        int i = WebViewBag.c(WebViewBag.this).x;
        int j = (int)((WebViewBag.d(WebViewBag.this).x * 1.0F - WebViewBag.c(WebViewBag.this).x) * f);
        int k = WebViewBag.c(WebViewBag.this).y;
        WebViewBag.a(localWebViewBag, i + j, (int)(f * (WebViewBag.d(WebViewBag.this).y * 1.0F - WebViewBag.c(WebViewBag.this).y)) + k);
        return;
      }
      WebViewBag.a(WebViewBag.this, WebViewBag.d(WebViewBag.this).x, WebViewBag.d(WebViewBag.this).y);
      WebViewBag.e(WebViewBag.this);
    }
  };
  private a qbY;
  private WebViewBagBgView qbZ;
  private boolean qca;
  
  public WebViewBag(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.inU = ((WindowManager)paramContext.getSystemService("window"));
    this.ioW = new ag();
    this.oVH = new Point(com.tencent.mm.bp.a.fk(ad.getContext()), com.tencent.mm.bp.a.fl(ad.getContext()));
    LayoutInflater.from(paramContext).inflate(R.i.webview_bag, this);
    this.gER = ((ImageView)findViewById(R.h.icon));
    this.qbZ = ((WebViewBagBgView)findViewById(R.h.bg));
    this.ido = findViewById(R.h.root);
    this.qbZ.setStartColor(paramContext.getResources().getColor(R.e.webview_bag_bg_color));
    this.qbZ.setAngryColor(paramContext.getResources().getColor(R.e.webview_bag_bg_angry_color));
  }
  
  private void dW(int paramInt1, int paramInt2)
  {
    WindowManager.LayoutParams localLayoutParams;
    if (this.inU != null)
    {
      localLayoutParams = (WindowManager.LayoutParams)getLayoutParams();
      localLayoutParams.x = paramInt1;
      localLayoutParams.y = paramInt2;
    }
    try
    {
      this.inU.updateViewLayout(this, localLayoutParams);
      return;
    }
    catch (Throwable localThrowable)
    {
      x.printErrStackTrace("MicroMsg.WebViewBag", localThrowable, "", new Object[0]);
    }
  }
  
  public final void bWT()
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
    AnimationSet localAnimationSet = new AnimationSet(true);
    localAnimationSet.addAnimation(localAlphaAnimation);
    localAnimationSet.addAnimation(localScaleAnimation);
    localAnimationSet.setDuration(100L);
    localAnimationSet.restrictDuration(150L);
    localAnimationSet.setFillAfter(true);
    this.ido.startAnimation(localAnimationSet);
  }
  
  protected Point getLastTouchDownViewPos()
  {
    return this.oVE;
  }
  
  public final void j(int paramInt1, int paramInt2, long paramLong)
  {
    WebViewBagBgView localWebViewBagBgView = this.qbZ;
    localWebViewBagBgView.qck = false;
    long l = System.currentTimeMillis();
    x.i("MicroMsg.WebViewBagBgView", "setAngryInfo:%d now:%d", new Object[] { Long.valueOf(paramLong), Long.valueOf(l) });
    localWebViewBagBgView.mDuration = paramInt1;
    localWebViewBagBgView.ouh = paramInt2;
    localWebViewBagBgView.mStartTime = paramLong;
    localWebViewBagBgView.fE(l);
    if (paramLong > l) {
      localWebViewBagBgView.postDelayed(new WebViewBagBgView.1(localWebViewBagBgView), paramLong - l);
    }
    for (;;)
    {
      localWebViewBagBgView.invalidate();
      return;
      localWebViewBagBgView.qck = true;
    }
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    x.i("MicroMsg.WebViewBag", "onConfigurationChanged orientation:%d", new Object[] { Integer.valueOf(paramConfiguration.orientation) });
    this.oVH.x = com.tencent.mm.bp.a.fk(ad.getContext());
    this.oVH.y = com.tencent.mm.bp.a.fl(ad.getContext());
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.qca) {
      return super.onTouchEvent(paramMotionEvent);
    }
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      if (this.qbY != null) {
        this.qbY.onTouchEvent(paramMotionEvent);
      }
      return true;
      this.oVD.x = paramMotionEvent.getRawX();
      this.oVD.y = paramMotionEvent.getRawY();
      WindowManager.LayoutParams localLayoutParams = (WindowManager.LayoutParams)getLayoutParams();
      this.oVE.x = localLayoutParams.x;
      this.oVE.y = localLayoutParams.y;
      continue;
      dW((int)Math.max(Math.min(this.oVE.x + paramMotionEvent.getRawX() - this.oVD.x, this.oVH.x), 0.0F), (int)Math.max(Math.min(this.oVE.y + paramMotionEvent.getRawY() - this.oVD.y, this.oVH.y), 0.0F));
      continue;
      if ((Math.abs(paramMotionEvent.getRawX() - this.oVD.x) >= BackwardSupportUtil.b.b(getContext(), 3.0F)) || (Math.abs(paramMotionEvent.getRawY() - this.oVD.y) >= BackwardSupportUtil.b.b(getContext(), 3.0F))) {
        break;
      }
      if (this.mOnClickListener != null) {
        this.mOnClickListener.onClick(this);
      }
    }
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    this.oVF.x = ((int)Math.max(Math.min(f1 + this.oVE.x - this.oVD.x, this.oVH.x), 0.0F));
    this.oVF.y = ((int)Math.max(Math.min(f2 + this.oVE.y - this.oVD.y, this.oVH.y), 0.0F));
    if (this.oVF.x + getWidth() / 2 <= this.oVH.x / 2)
    {
      this.oVG.x = b.qbn;
      label410:
      this.oVG.y = this.oVF.y;
      if (this.oVG.y != 0) {
        break label525;
      }
      this.oVG.y = b.qbn;
    }
    for (;;)
    {
      this.mStartTime = System.currentTimeMillis();
      this.ioW.postDelayed(this.oVI, 5L);
      if (this.qbY == null) {
        break;
      }
      this.qbY.el(this.oVG.x, this.oVG.y);
      break;
      this.oVG.x = (this.oVH.x - getWidth() - b.qbn);
      break label410;
      label525:
      if (this.oVG.y > qcb) {
        this.oVG.y = qcb;
      }
    }
  }
  
  public void setIcon(String paramString)
  {
    Object localObject = new c.a();
    ((c.a)localObject).dXW = true;
    ((c.a)localObject).dXN = R.k.webview_bag_default_icon;
    localObject = ((c.a)localObject).Pt();
    o.Pj().a(paramString, this.gER, (c)localObject);
  }
  
  public void setListener(a parama)
  {
    this.qbY = parama;
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mOnClickListener = paramOnClickListener;
  }
  
  public void setTouchEnable(boolean paramBoolean)
  {
    x.i("MicroMsg.WebViewBag", "setTouchEnable enable:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.qca = paramBoolean;
  }
  
  public static abstract interface a
  {
    public abstract void el(int paramInt1, int paramInt2);
    
    public abstract void onTouchEvent(MotionEvent paramMotionEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/bag/WebViewBag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */