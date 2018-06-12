package com.tencent.mm.graphics.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.View.OnLongClickListener;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.c;
import com.tencent.mm.a.e;
import com.tencent.mm.graphics.a.b;
import com.tencent.mm.graphics.b.d;
import com.tencent.mm.graphics.b.d.1;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Timer;

public class WxBaseImageView
  extends FrameLayout
{
  public long YH;
  private Rect cO = new Rect();
  public ViewStub djA = null;
  private ViewStub djB = null;
  private ImageView djC = null;
  public SubsamplingScaleImageView djD = null;
  private com.tencent.mm.graphics.a.b djE = null;
  private int djF = 0;
  public com.tencent.mm.graphics.a.c djG = com.tencent.mm.graphics.a.c.diW;
  private boolean djH = false;
  public com.tencent.mm.graphics.c.a.a djI;
  public com.tencent.mm.graphics.c.a.a djJ;
  public boolean djK;
  public boolean djL;
  private boolean djM;
  private boolean djN;
  private boolean djO;
  private boolean djP = false;
  private boolean djQ = false;
  private ah djR = null;
  public int imageHeight;
  public int imageWidth;
  private Context mContext;
  
  public WxBaseImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }
  
  public WxBaseImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    LayoutInflater.from(getContext()).inflate(a.b.view_mm_image_view, this, true);
    this.djA = ((ViewStub)findViewById(com.tencent.mm.graphics.a.a.stub_tile));
    paramContext = this.djA.inflate();
    if (paramContext != null)
    {
      this.djD = ((SubsamplingScaleImageView)paramContext);
      this.djD.setVisibility(0);
    }
    paramContext = com.tencent.mm.graphics.b.c.djh;
    if (!paramContext.djm)
    {
      paramContext.djm = true;
      paramContext.aDX.postFrameCallback(paramContext);
    }
    d.djo.djp = new WeakReference(this.mContext);
    this.djD.setOnAttachStateChangeListener(new WxBaseImageView.1(this));
  }
  
  private void Cm()
  {
    if (!this.djH) {}
    while ((this.djO) || ((this.djK) && (!this.djM)) || ((this.djL) && (!this.djN))) {
      return;
    }
    x.i("MicroMsg.WxBaseImageView", "alvinluo reportImageInfo info ready and report");
    int i = com.tencent.mm.graphics.c.a.dju;
    com.tencent.mm.graphics.c.a.a locala1 = this.djJ;
    com.tencent.mm.graphics.c.a.a locala2 = this.djI;
    long l = System.currentTimeMillis();
    if (locala1 != null) {
      com.tencent.mm.graphics.c.a.a(l, locala1);
    }
    if (locala2 != null) {
      com.tencent.mm.graphics.c.a.a(l, locala2);
    }
    this.djO = true;
  }
  
  private void gj(int paramInt)
  {
    try
    {
      if ((this.djD != null) && (this.djI != null))
      {
        this.djI.djy = ((int)(System.currentTimeMillis() - this.YH));
        com.davemorrissey.labs.subscaleview.d.a locala = this.djD.getImageDecodeRecord();
        if (locala != null) {}
        for (this.djI.djz = locala.YQ;; this.djI.djz = 0)
        {
          this.djI.djx = paramInt;
          this.djI.orientation = this.djD.getPreviewOrientation();
          this.djI.width = this.djD.getPreviewWidth();
          this.djI.height = this.djD.getPreviewHeight();
          this.djI.Zk = 1;
          this.djI.fileSize = e.cm(this.djI.imagePath);
          return;
        }
      }
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.WxBaseImageView", localException, "alvinluo fillPreviewInfo exception", new Object[0]);
    }
  }
  
  private void gk(int paramInt)
  {
    try
    {
      if ((this.djD != null) && (this.djJ != null))
      {
        this.djJ.djy = ((int)(System.currentTimeMillis() - this.YH));
        com.davemorrissey.labs.subscaleview.d.a locala = this.djD.getImageDecodeRecord();
        com.tencent.mm.graphics.c.a.a locala1;
        int i;
        if (locala != null)
        {
          locala1 = this.djJ;
          i = locala.YR;
        }
        for (locala1.djz = (locala.YS + i);; this.djI.djz = 0)
        {
          this.djJ.djx = paramInt;
          this.djJ.orientation = this.djD.getRequiredRotation();
          this.djJ.width = this.djD.getSWidth();
          this.djJ.height = this.djD.getSHeight();
          this.djJ.Zk = this.djD.getFullImageSampleSize();
          this.djJ.fileSize = e.cm(this.djJ.imagePath);
          return;
        }
      }
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.WxBaseImageView", localException, "alvinluo fillMainInfo exception", new Object[0]);
    }
  }
  
  public String getActivityName()
  {
    if ((this.mContext != null) && ((this.mContext instanceof Activity))) {
      return ((Activity)this.mContext).getClass().getSimpleName();
    }
    return "Default";
  }
  
  public Bitmap getFullImageBitmap()
  {
    if (this.djD != null) {
      return this.djD.getFullImageBitmap();
    }
    return null;
  }
  
  public float getScale()
  {
    if (this.djD != null) {
      return this.djD.getScale();
    }
    return 1.0F;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.cO.left = getLeft();
    this.cO.right = getRight();
    this.cO.top = getTop();
    this.cO.bottom = getBottom();
    if (!getGlobalVisibleRect(this.cO)) {
      this.djH = false;
    }
    for (;;)
    {
      Cm();
      return;
      x.d("MicroMsg.WxBaseImageView", "alvinluo ImageView visible, can report");
      this.djH = true;
      if (this.djQ) {
        continue;
      }
      this.djQ = true;
      d locald = d.djo;
      synchronized (locald.djr)
      {
        if (locald.bgH)
        {
          x.w("MicroMsg.PerformanceMonitor", "hy: already running. stop last and run new");
          locald.bgH = false;
        }
        if (locald.bno != null) {
          locald.bno.cancel();
        }
        System.gc();
        locald.bno = new Timer("Handle_Monitor_mem_cpu", true);
        locald.djq.clear();
        if ((locald.djp != null) && (locald.djp.get() != null)) {
          locald.djq.put(Integer.valueOf(2), new com.tencent.mm.graphics.b.b((Context)locald.djp.get()));
        }
        locald.bno.scheduleAtFixedRate(new d.1(locald), 0L, 5L);
        locald.bgH = true;
      }
    }
  }
  
  public void setAnimateMode(com.tencent.mm.graphics.a.a parama)
  {
    x.d("MicroMsg.WxBaseImageView", "hy: set current animation mode: %s", new Object[] { parama });
  }
  
  public void setEdgeSwipeListener(SubsamplingScaleImageView.c paramc)
  {
    this.djD.setEdgeSwipeListener(paramc);
  }
  
  public void setFitType(ImageView.ScaleType paramScaleType)
  {
    x.d("MicroMsg.WxBaseImageView", "hy: set fit type: %s", new Object[] { paramScaleType });
  }
  
  public void setForceTileFlag(com.tencent.mm.graphics.a.c paramc)
  {
    x.d("MicroMsg.WxBaseImageView", "hy: setting force tile flag; %s", new Object[] { paramc });
    this.djG = paramc;
  }
  
  public void setGestureDetectorListener(GestureDetector.SimpleOnGestureListener paramSimpleOnGestureListener)
  {
    if (this.djD != null) {
      this.djD.setGestureDetectorListener(paramSimpleOnGestureListener);
    }
  }
  
  public void setImageMatrix(Matrix paramMatrix) {}
  
  public void setOnImageLoadEventListener(com.tencent.mm.graphics.a.b paramb)
  {
    if (this.djD != null)
    {
      this.djE = new WxBaseImageView.3(this, paramb);
      this.djD.setOnImageEventListener(this.djE);
    }
  }
  
  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    if (this.djD != null) {
      this.djD.setOnLongClickListener(paramOnLongClickListener);
    }
  }
  
  public void setScaleRate(float paramFloat)
  {
    if (this.djD != null) {
      this.djD.setScaleRate(paramFloat);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/graphics/ui/WxBaseImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */