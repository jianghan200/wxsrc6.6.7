package com.tencent.mm.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.tencent.mm.cache.d;
import com.tencent.mm.sdk.platformtools.x;

public abstract class b<T extends d>
{
  public static final b bBs = new b()
  {
    public final void onDraw(Canvas paramAnonymousCanvas) {}
    
    public final a vE()
    {
      return a.bBg;
    }
    
    public final void vF() {}
  };
  public com.tencent.mm.bi.b bBn;
  private Matrix bBo;
  Rect bBp;
  private boolean bBq;
  private Bitmap bBr;
  private Canvas bBt = new Canvas();
  private Runnable bBu;
  PointF bBv = new PointF();
  private PointF bBw = new PointF();
  public boolean isCreated;
  private Context mContext;
  float[] values = new float[9];
  
  private float a(Matrix paramMatrix, int paramInt)
  {
    paramMatrix.getValues(this.values);
    return this.values[paramInt];
  }
  
  protected static int r(MotionEvent paramMotionEvent)
  {
    int i = 0;
    if (paramMotionEvent.getPointerCount() > 1)
    {
      i = (int)(paramMotionEvent.getX(0) - paramMotionEvent.getX(1));
      int j = (int)(paramMotionEvent.getY(0) - paramMotionEvent.getY(1));
      i = (int)Math.sqrt(j * j + i * i);
    }
    return i;
  }
  
  protected static int[] s(MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = new int[2];
    if (paramMotionEvent.getPointerCount() > 1)
    {
      arrayOfInt[0] = ((int)(paramMotionEvent.getX(0) - paramMotionEvent.getX(1)));
      arrayOfInt[1] = ((int)(paramMotionEvent.getY(0) - paramMotionEvent.getY(1)));
    }
    return arrayOfInt;
  }
  
  public final float a(Matrix paramMatrix)
  {
    return (float)Math.round(Math.atan2(a(paramMatrix, 1), a(paramMatrix, 0)) * 57.29577951308232D);
  }
  
  public void a(com.tencent.mm.bi.b paramb, Matrix paramMatrix, Rect paramRect)
  {
    x.i("MicroMsg.BaseArtist" + vE(), "[onCreate]");
    this.isCreated = true;
    this.mContext = paramb.getContext();
    this.bBn = paramb;
    this.bBo = paramMatrix;
    this.bBp = paramRect;
  }
  
  public void aH(boolean paramBoolean)
  {
    this.bBt.setBitmap(vL());
    vG().a(this.bBt, paramBoolean);
  }
  
  public final void b(Canvas paramCanvas)
  {
    if ((this.bBr != null) && (!this.bBr.isRecycled())) {
      paramCanvas.drawBitmap(this.bBr, 0.0F, 0.0F, null);
    }
  }
  
  protected final Rect getBoardRect()
  {
    return this.bBn.cfQ().getBaseBoardView().getBoardRect();
  }
  
  public final Matrix getMainMatrix()
  {
    return this.bBn.cfQ().getBaseBoardView().getMainMatrix();
  }
  
  public final float getRotation()
  {
    return (float)Math.round(Math.atan2(a(this.bBo, 1), a(this.bBo, 0)) * 57.29577951308232D);
  }
  
  public final float getScale()
  {
    float f1 = a(this.bBo, 3);
    float f2 = a(this.bBo, 0);
    return (float)Math.sqrt(f1 * f1 + f2 * f2);
  }
  
  protected final void h(Bitmap paramBitmap)
  {
    if ((vL() != null) && (!vL().isRecycled())) {
      vL().recycle();
    }
    this.bBr = paramBitmap;
  }
  
  public final boolean isAlive()
  {
    return (this.isCreated) && (this.bBq);
  }
  
  public void onDestroy()
  {
    this.isCreated = false;
    this.bBq = false;
    x.i("MicroMsg.BaseArtist" + vE(), "[onDestroy]");
    vJ();
  }
  
  public abstract void onDraw(Canvas paramCanvas);
  
  public final void onFinish()
  {
    x.i("MicroMsg.BaseArtist", "[onFinish] type:%s", new Object[] { vE() });
    this.bBq = false;
    this.isCreated = false;
    d locald = vG();
    if (locald != null) {
      locald.aV(true);
    }
    for (;;)
    {
      vJ();
      return;
      x.e("MicroMsg.BaseArtist", "[onFinish] type:%s cache is null", new Object[] { vE() });
    }
  }
  
  public boolean q(MotionEvent paramMotionEvent)
  {
    if (u(paramMotionEvent)) {
      t(paramMotionEvent);
    }
    return false;
  }
  
  public final void setOneFingerMoveEnable(boolean paramBoolean)
  {
    this.bBn.cfQ().getBaseBoardView().setOneFingerMoveEnable(paramBoolean);
  }
  
  protected final void t(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getPointerCount() > 1)
    {
      this.bBw.x = paramMotionEvent.getX(1);
      this.bBw.y = paramMotionEvent.getY(1);
    }
    for (;;)
    {
      if (paramMotionEvent.getActionMasked() == 6)
      {
        if ((paramMotionEvent.getPointerCount() <= 1) || (1 - paramMotionEvent.getActionIndex() < 0) || (1 - paramMotionEvent.getActionIndex() >= paramMotionEvent.getPointerCount())) {
          break;
        }
        this.bBv.x = paramMotionEvent.getX(1 - paramMotionEvent.getActionIndex());
        this.bBv.y = paramMotionEvent.getY(1 - paramMotionEvent.getActionIndex());
      }
      return;
      if (paramMotionEvent.getPointerCount() == 1)
      {
        this.bBv.x = paramMotionEvent.getX(0);
        this.bBv.y = paramMotionEvent.getY(0);
      }
    }
    this.bBv.x = paramMotionEvent.getX(0);
    this.bBv.y = paramMotionEvent.getY(0);
  }
  
  protected final boolean u(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramMotionEvent.getPointerCount() > 1) {
      if ((Math.abs(this.bBv.x - paramMotionEvent.getX(0)) <= 3.0F) && (Math.abs(this.bBv.y - paramMotionEvent.getY(0)) <= 3.0F) && (Math.abs(this.bBw.x - paramMotionEvent.getX(1)) <= 3.0F))
      {
        bool1 = bool2;
        if (Math.abs(this.bBw.y - paramMotionEvent.getY(1)) <= 3.0F) {}
      }
      else
      {
        bool1 = true;
      }
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramMotionEvent.getPointerCount() != 1);
      if (Math.abs(this.bBv.x - paramMotionEvent.getX(0)) > 3.0F) {
        break;
      }
      bool1 = bool2;
    } while (Math.abs(this.bBv.y - paramMotionEvent.getY(0)) <= 3.0F);
    return true;
  }
  
  public abstract a vE();
  
  public abstract void vF();
  
  public final T vG()
  {
    return this.bBn.a(vE());
  }
  
  public void vH()
  {
    x.i("MicroMsg.BaseArtist" + vE(), "[onAlive] isAlive:%s", new Object[] { Boolean.valueOf(this.bBq) });
    if (this.bBq) {
      return;
    }
    this.bBq = true;
    d locald = vG();
    if (locald != null)
    {
      locald.yo();
      locald.aV(false);
    }
    for (;;)
    {
      this.bBr = vL();
      return;
      x.e("MicroMsg.BaseArtist", "[onAlive] type:%s cache is null", new Object[] { vE() });
    }
  }
  
  public void vI()
  {
    x.i("MicroMsg.BaseArtist" + vE(), "[onSelected] ");
  }
  
  public final void vJ()
  {
    if ((this.bBr != null) && (!this.bBr.isRecycled())) {
      this.bBr.recycle();
    }
  }
  
  public boolean vK()
  {
    try
    {
      int i = vG().aW(true);
      return i > 0;
    }
    catch (Exception localException) {}
    return false;
  }
  
  protected final Bitmap vL()
  {
    Rect localRect;
    int i;
    if ((this.bBr == null) || (this.bBr.isRecycled()))
    {
      localRect = this.bBn.cfQ().getBaseBoardView().getImageBitmapRect();
      if ((!localRect.isEmpty()) && (this.bBn.cfQ().getBaseBoardView().cCg())) {
        break label113;
      }
      i = this.bBn.cfQ().getBaseBoardView().getBoardRect().width();
    }
    for (int j = this.bBn.cfQ().getBaseBoardView().getBoardRect().height();; j = localRect.height())
    {
      this.bBr = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_4444);
      return this.bBr;
      label113:
      i = localRect.width();
    }
  }
  
  protected final boolean vM()
  {
    return this.bBn.cfR().vE() == vE();
  }
  
  public final void vN()
  {
    if (vG().pop() != null) {
      vG().vN();
    }
    this.bBn.cfQ().removeCallbacks(this.bBu);
    com.tencent.mm.view.a locala = this.bBn.cfQ();
    Runnable local2 = new Runnable()
    {
      public final void run()
      {
        b.this.vF();
        b.this.vO();
        b.a(b.this);
      }
    };
    this.bBu = local2;
    locala.postDelayed(local2, 66L);
  }
  
  public final void vO()
  {
    this.bBn.cfQ().getBaseBoardView().postInvalidate();
  }
  
  public final void vP()
  {
    this.bBn.cfQ().getBaseFooterView().postInvalidate();
  }
  
  protected final float[] w(float paramFloat1, float paramFloat2)
  {
    Matrix localMatrix = new Matrix(this.bBo);
    this.bBo.invert(localMatrix);
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    localMatrix.mapPoints(arrayOfFloat);
    return arrayOfFloat;
  }
  
  protected final float[] x(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    this.bBo.mapPoints(arrayOfFloat);
    return arrayOfFloat;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */