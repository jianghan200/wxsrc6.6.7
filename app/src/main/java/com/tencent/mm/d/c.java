package com.tencent.mm.d;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.mm.bd.a.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.view.b.a.b;
import java.util.Stack;

public final class c
  extends b<com.tencent.mm.cache.a>
{
  private int bBA = (int)ad.getResources().getDimension(a.c.crop_rotation_layout_height);
  private Matrix bBB = new Matrix();
  private RectF bBC;
  private RectF bBD;
  private RectF bBE;
  private RectF bBF;
  public final Rect bBG = new Rect();
  public com.tencent.mm.t.a bBH;
  private boolean bBI = false;
  private boolean bBJ = false;
  public com.tencent.mm.b.a bBK;
  boolean bBL = false;
  boolean bBM = false;
  boolean bBN = false;
  boolean bBO = false;
  boolean bBP = false;
  public boolean bBQ = true;
  boolean bBR = false;
  float bBS;
  float bBT;
  float bBU;
  float bBV;
  float bBW;
  float bBX;
  public ValueAnimator bBY;
  public Rect bBZ = new Rect();
  private int bBy = (int)ad.getResources().getDimension(a.c.box_padding);
  private int bBz = (int)ad.getResources().getDimension(a.c.feature_select_layout_height);
  public int bCa = 0;
  public boolean bCb = false;
  public Rect bwl;
  
  private boolean vQ()
  {
    return (this.bBO) || (this.bBM) || (this.bBN) || (this.bBP);
  }
  
  public final void a(com.tencent.mm.bi.b paramb, Matrix paramMatrix, Rect paramRect)
  {
    super.a(paramb, paramMatrix, paramRect);
    this.bwl = new Rect();
    this.bBD = new RectF();
    this.bBC = new RectF();
    this.bBE = new RectF();
    this.bBF = new RectF();
    this.bBH = new com.tencent.mm.t.a(this.bwl);
    this.bBK = new com.tencent.mm.b.a(this);
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    com.tencent.mm.t.a locala;
    boolean bool1;
    boolean bool2;
    if (!this.bBJ)
    {
      paramCanvas.setMatrix(null);
      locala = this.bBH;
      bool1 = this.bBQ;
      bool2 = this.bBI;
      if (locala.bwl != null) {
        break label57;
      }
      x.e("MicroMsg.CropItem", "[draw] mBoxRect is null!");
    }
    label57:
    do
    {
      do
      {
        return;
        paramCanvas.setMatrix(this.bBB);
        break;
        if (bool1)
        {
          paramCanvas.save();
          paramCanvas.clipRect(locala.bwl, Region.Op.DIFFERENCE);
          paramCanvas.drawPaint(com.tencent.mm.t.a.dnB);
          paramCanvas.restore();
        }
      } while (!bool2);
      if (!com.tencent.mm.t.a.ea.equals(locala.bwl))
      {
        com.tencent.mm.t.a.dny.reset();
        com.tencent.mm.t.a.dny.moveTo(locala.bwl.left, locala.bwl.top);
        com.tencent.mm.t.a.dny.lineTo(locala.bwl.right, locala.bwl.top);
        com.tencent.mm.t.a.dny.lineTo(locala.bwl.right, locala.bwl.bottom);
        com.tencent.mm.t.a.dny.lineTo(locala.bwl.left, locala.bwl.bottom);
        com.tencent.mm.t.a.dny.close();
        com.tencent.mm.t.a.dnx.reset();
        int i = 1;
        while (i < 3)
        {
          com.tencent.mm.t.a.dnx.moveTo(locala.bwl.left + locala.bwl.width() / 3 * i, locala.bwl.top);
          com.tencent.mm.t.a.dnx.lineTo(locala.bwl.left + locala.bwl.width() / 3 * i, locala.bwl.bottom);
          com.tencent.mm.t.a.dnx.moveTo(locala.bwl.left, locala.bwl.top + locala.bwl.height() / 3 * i);
          com.tencent.mm.t.a.dnx.lineTo(locala.bwl.right, locala.bwl.top + locala.bwl.height() / 3 * i);
          i += 1;
        }
      }
      paramCanvas.drawRect(locala.bwl.left, locala.bwl.top, locala.bwl.right, locala.bwl.bottom, com.tencent.mm.t.a.dnA);
      paramCanvas.drawPath(com.tencent.mm.t.a.dnx, com.tencent.mm.t.a.dnC);
      paramCanvas.drawPath(com.tencent.mm.t.a.dny, com.tencent.mm.t.a.dnz);
      float f1 = locala.bwl.left;
      float f2 = com.tencent.mm.t.a.dnv;
      float f3 = locala.bwl.top;
      float f4 = com.tencent.mm.t.a.dnv / 2.0F;
      float f5 = locala.bwl.left;
      paramCanvas.drawLine(f1 - f2, f3 - f4, com.tencent.mm.t.a.dnw + f5, locala.bwl.top - com.tencent.mm.t.a.dnv / 2.0F, com.tencent.mm.t.a.dnD);
      f1 = locala.bwl.right;
      f2 = com.tencent.mm.t.a.dnw;
      f3 = com.tencent.mm.t.a.dnv / 2.0F;
      f4 = locala.bwl.top;
      f5 = com.tencent.mm.t.a.dnv / 2.0F;
      float f6 = locala.bwl.right;
      paramCanvas.drawLine(f3 + (f1 - f2), f4 - f5, com.tencent.mm.t.a.dnv + f6, locala.bwl.top - com.tencent.mm.t.a.dnv / 2.0F, com.tencent.mm.t.a.dnD);
      f1 = locala.bwl.left;
      f2 = com.tencent.mm.t.a.dnv / 2.0F;
      f3 = locala.bwl.top;
      f4 = com.tencent.mm.t.a.dnv / 2.0F;
      f5 = locala.bwl.left;
      f6 = com.tencent.mm.t.a.dnv / 2.0F;
      float f7 = locala.bwl.top;
      paramCanvas.drawLine(f1 - f2, f3 - f4, f5 - f6, com.tencent.mm.t.a.dnw + f7, com.tencent.mm.t.a.dnD);
      f1 = locala.bwl.left;
      f2 = com.tencent.mm.t.a.dnv / 2.0F;
      f3 = locala.bwl.bottom;
      f4 = com.tencent.mm.t.a.dnw;
      f5 = com.tencent.mm.t.a.dnv / 2.0F;
      f6 = locala.bwl.left;
      f7 = com.tencent.mm.t.a.dnv / 2.0F;
      float f8 = locala.bwl.bottom;
      paramCanvas.drawLine(f1 - f2, f5 + (f3 - f4), f6 - f7, com.tencent.mm.t.a.dnv / 2.0F + f8, com.tencent.mm.t.a.dnD);
      f1 = locala.bwl.right;
      f2 = com.tencent.mm.t.a.dnv / 2.0F;
      f3 = locala.bwl.top;
      f4 = locala.bwl.right;
      f5 = com.tencent.mm.t.a.dnv / 2.0F;
      f6 = locala.bwl.top;
      paramCanvas.drawLine(f2 + f1, f3, f5 + f4, com.tencent.mm.t.a.dnw + f6, com.tencent.mm.t.a.dnD);
      f1 = locala.bwl.right;
      f2 = com.tencent.mm.t.a.dnv / 2.0F;
      f3 = locala.bwl.bottom;
      f4 = com.tencent.mm.t.a.dnw;
      f5 = com.tencent.mm.t.a.dnv / 2.0F;
      f6 = locala.bwl.right;
      f7 = com.tencent.mm.t.a.dnv / 2.0F;
      f8 = locala.bwl.bottom;
      paramCanvas.drawLine(f2 + f1, f5 + (f3 - f4), f7 + f6, com.tencent.mm.t.a.dnv / 2.0F + f8, com.tencent.mm.t.a.dnD);
      f1 = locala.bwl.left;
      f2 = com.tencent.mm.t.a.dnv;
      f3 = locala.bwl.bottom;
      f4 = com.tencent.mm.t.a.dnv / 2.0F;
      f5 = locala.bwl.left;
      f6 = com.tencent.mm.t.a.dnw;
      f7 = locala.bwl.bottom;
      paramCanvas.drawLine(f1 - f2, f4 + f3, f6 + f5, com.tencent.mm.t.a.dnv / 2.0F + f7, com.tencent.mm.t.a.dnD);
      f1 = locala.bwl.right;
      f2 = com.tencent.mm.t.a.dnw;
      f3 = locala.bwl.bottom;
      f4 = com.tencent.mm.t.a.dnv / 2.0F;
      f5 = locala.bwl.right;
      f6 = com.tencent.mm.t.a.dnv;
      f7 = locala.bwl.bottom;
      paramCanvas.drawLine(f1 - f2, f4 + f3, f6 + f5, com.tencent.mm.t.a.dnv / 2.0F + f7, com.tencent.mm.t.a.dnD);
    } while (com.tencent.mm.t.a.ea.equals(locala.bwl));
    com.tencent.mm.t.a.ea.set(locala.bwl);
  }
  
  public final boolean q(MotionEvent paramMotionEvent)
  {
    if (!vM()) {
      return false;
    }
    Object localObject = this.bBn.cfQ().getBaseBoardView().getCurImageRect();
    this.bBU = (((RectF)localObject).top - (((RectF)localObject).bottom - this.bwl.bottom));
    this.bBV = (((RectF)localObject).bottom + (this.bwl.top - ((RectF)localObject).top));
    this.bBW = (((RectF)localObject).left - (((RectF)localObject).right - this.bwl.right));
    this.bBX = (((RectF)localObject).right + (this.bwl.left - ((RectF)localObject).left));
    if (this.bBX > this.bBG.right) {
      this.bBX = this.bBG.right;
    }
    if (this.bBW < this.bBy) {
      this.bBW = this.bBy;
    }
    if (this.bBV > this.bBG.bottom) {
      this.bBV = this.bBG.bottom;
    }
    if (this.bBU < this.bBy) {
      this.bBU = this.bBy;
    }
    switch (paramMotionEvent.getActionMasked())
    {
    case 3: 
    case 4: 
    default: 
    case 5: 
    case 0: 
      do
      {
        for (;;)
        {
          return this.bBL;
          this.bBO = false;
          this.bBM = false;
          this.bBN = false;
          this.bBP = false;
          this.bBL = false;
        }
        this.bBR = false;
        if (this.bBK != null) {
          this.bBK.cancel();
        }
        if (this.bBD.contains(paramMotionEvent.getX(), paramMotionEvent.getY())) {
          this.bBO = true;
        }
        if (this.bBC.contains(paramMotionEvent.getX(), paramMotionEvent.getY())) {
          this.bBN = true;
        }
        if (this.bBE.contains(paramMotionEvent.getX(), paramMotionEvent.getY())) {
          this.bBM = true;
        }
        if (this.bBF.contains(paramMotionEvent.getX(), paramMotionEvent.getY())) {
          this.bBP = true;
        }
        this.bBQ = false;
      } while (!vQ());
      if ((this.bBO) && (this.bBM))
      {
        this.bBO = true;
        this.bBM = true;
        this.bBN = false;
        this.bBP = false;
      }
      for (;;)
      {
        this.bBS = paramMotionEvent.getX();
        this.bBT = paramMotionEvent.getY();
        break;
        if ((this.bBO) && (this.bBP))
        {
          this.bBO = true;
          this.bBM = false;
          this.bBN = false;
          this.bBP = true;
        }
        else if ((this.bBN) && (this.bBP))
        {
          this.bBO = false;
          this.bBM = false;
          this.bBN = true;
          this.bBP = true;
        }
        else if ((this.bBN) && (this.bBP))
        {
          this.bBO = false;
          this.bBM = false;
          this.bBN = true;
          this.bBP = true;
        }
      }
    case 2: 
      this.bBR = true;
      if ((paramMotionEvent.getPointerCount() == 1) && (vQ()))
      {
        if ((this.bBP) && (this.bwl.right >= this.bwl.left))
        {
          if (this.bwl.right <= this.bBG.right)
          {
            if (paramMotionEvent.getX() - this.bBS <= this.bBG.right - this.bwl.right) {
              break label1869;
            }
            this.bwl.right = this.bBG.right;
          }
          label688:
          if (this.bwl.right < this.bwl.left + this.bBy * 2) {
            this.bwl.right = (this.bwl.left + this.bBy * 2);
          }
          if (this.bwl.right > this.bBG.right) {
            this.bwl.right = this.bBG.right;
          }
          if (((int)((RectF)localObject).right <= (int)this.bBX) && ((int)((RectF)localObject).right <= this.bwl.right))
          {
            if (paramMotionEvent.getX() - this.bBS <= this.bBX - ((RectF)localObject).right) {
              break label1900;
            }
            getMainMatrix().postTranslate(this.bBX - ((RectF)localObject).right, 0.0F);
          }
          label836:
          if ((this.bwl.width() > ((RectF)localObject).width()) && (this.bwl.right < this.bBG.right))
          {
            f1 = this.bwl.width() / ((RectF)localObject).width();
            getMainMatrix().postScale(f1, f1, this.bwl.left, this.bwl.centerY());
          }
        }
        if ((this.bBM) && (this.bwl.right >= this.bwl.left))
        {
          if (this.bwl.left >= this.bBG.left)
          {
            if (this.bBS - paramMotionEvent.getX() <= this.bwl.left - this.bBG.left) {
              break label1921;
            }
            this.bwl.left = this.bBG.left;
          }
          label995:
          if (this.bwl.left > this.bwl.right - this.bBy * 2) {
            this.bwl.left = (this.bwl.right - this.bBy * 2);
          }
          if (this.bwl.left < this.bBG.left) {
            this.bwl.left = this.bBG.left;
          }
          if (((int)((RectF)localObject).left >= (int)this.bBW) && ((int)((RectF)localObject).left >= this.bwl.left))
          {
            if (this.bBS - paramMotionEvent.getX() <= ((RectF)localObject).left - this.bBW) {
              break label1952;
            }
            getMainMatrix().postTranslate(this.bBW - ((RectF)localObject).left, 0.0F);
          }
          label1143:
          if ((this.bwl.width() > ((RectF)localObject).width()) && (this.bwl.left > this.bBG.left))
          {
            f1 = this.bwl.width() / ((RectF)localObject).width();
            getMainMatrix().postScale(f1, f1, this.bwl.right, this.bwl.centerY());
          }
        }
        if ((this.bBN) && (this.bwl.bottom >= this.bwl.top))
        {
          if (this.bwl.top >= this.bBG.top)
          {
            if (this.bBT - paramMotionEvent.getY() <= this.bwl.top - this.bBG.top) {
              break label1973;
            }
            this.bwl.top = this.bBG.top;
          }
          label1302:
          if (this.bwl.top > this.bwl.bottom - this.bBy * 2) {
            this.bwl.top = (this.bwl.bottom - this.bBy * 2);
          }
          if (this.bwl.top < this.bBG.top) {
            this.bwl.top = this.bBG.top;
          }
          if (((int)((RectF)localObject).top >= (int)this.bBU) && ((int)((RectF)localObject).top >= this.bwl.top))
          {
            if (this.bBT - paramMotionEvent.getY() <= ((RectF)localObject).top - this.bBU) {
              break label2004;
            }
            getMainMatrix().postTranslate(0.0F, this.bBU - ((RectF)localObject).top);
          }
          label1450:
          if ((this.bwl.height() > ((RectF)localObject).height()) && (this.bwl.top > this.bBG.top))
          {
            f1 = this.bwl.height() / ((RectF)localObject).height();
            getMainMatrix().postScale(f1, f1, this.bwl.centerX(), this.bwl.bottom);
          }
        }
        if ((this.bBO) && (this.bwl.bottom >= this.bwl.top))
        {
          if (this.bwl.bottom <= this.bBG.bottom)
          {
            if (paramMotionEvent.getY() - this.bBT <= this.bBG.bottom - this.bwl.bottom) {
              break label2025;
            }
            this.bwl.bottom = this.bBG.bottom;
          }
          label1609:
          if (this.bwl.bottom < this.bwl.top + this.bBy * 2) {
            this.bwl.bottom = (this.bwl.top + this.bBy * 2);
          }
          if (this.bwl.bottom > this.bBG.bottom) {
            this.bwl.bottom = this.bBG.bottom;
          }
          if (((int)((RectF)localObject).bottom <= (int)this.bBV) && ((int)((RectF)localObject).bottom <= this.bwl.bottom))
          {
            if (paramMotionEvent.getY() - this.bBT <= this.bBV - ((RectF)localObject).bottom) {
              break label2056;
            }
            getMainMatrix().postTranslate(0.0F, this.bBV - ((RectF)localObject).bottom);
          }
          label1757:
          if ((this.bwl.height() > ((RectF)localObject).height()) && (this.bwl.bottom < this.bBG.bottom))
          {
            f1 = this.bwl.height() / ((RectF)localObject).height();
            getMainMatrix().postScale(f1, f1, this.bwl.centerX(), this.bwl.top);
          }
        }
        vR();
        this.bBL = true;
        vO();
        this.bBS = paramMotionEvent.getX();
        this.bBT = paramMotionEvent.getY();
      }
      for (;;)
      {
        t(paramMotionEvent);
        break;
        label1869:
        Rect localRect = this.bwl;
        localRect.right = ((int)(localRect.right + (paramMotionEvent.getX() - this.bBS)));
        break label688;
        label1900:
        getMainMatrix().postTranslate(paramMotionEvent.getX() - this.bBS, 0.0F);
        break label836;
        label1921:
        localRect = this.bwl;
        localRect.left = ((int)(localRect.left - (this.bBS - paramMotionEvent.getX())));
        break label995;
        label1952:
        getMainMatrix().postTranslate(paramMotionEvent.getX() - this.bBS, 0.0F);
        break label1143;
        label1973:
        localRect = this.bwl;
        localRect.top = ((int)(localRect.top - (this.bBT - paramMotionEvent.getY())));
        break label1302;
        label2004:
        getMainMatrix().postTranslate(0.0F, paramMotionEvent.getY() - this.bBT);
        break label1450;
        label2025:
        localRect = this.bwl;
        localRect.bottom = ((int)(localRect.bottom + (paramMotionEvent.getY() - this.bBT)));
        break label1609;
        label2056:
        getMainMatrix().postTranslate(0.0F, paramMotionEvent.getY() - this.bBT);
        break label1757;
        this.bBL = false;
      }
    }
    float f1 = this.bBG.width() * 1.0F / this.bwl.width();
    float f2 = this.bBG.height() * 1.0F / this.bwl.height();
    if (f1 < f2)
    {
      label2131:
      f2 = this.bBG.centerX();
      float f3 = this.bBG.centerY();
      float f4 = this.bwl.centerX();
      float f5 = this.bwl.centerY();
      if (this.bBR)
      {
        this.bBK.bwo = 1000L;
        paramMotionEvent = this.bBK;
        localObject = this.bwl;
        paramMotionEvent.bwj = (f2 - f4);
        paramMotionEvent.bwk = (f3 - f5);
        paramMotionEvent.bwl = ((Rect)localObject);
        paramMotionEvent.bwm.set(paramMotionEvent.bwl);
        paramMotionEvent.bwi = f1;
        this.bBK.play();
      }
      if (!vQ()) {
        break label2288;
      }
    }
    label2288:
    for (this.bBL = true;; this.bBL = false)
    {
      this.bBO = false;
      this.bBM = false;
      this.bBN = false;
      this.bBP = false;
      vP();
      break;
      f1 = f2;
      break label2131;
    }
  }
  
  public final a vE()
  {
    return a.bBk;
  }
  
  public final void vF() {}
  
  public final void vH()
  {
    super.vH();
    if (this.bBG.isEmpty()) {
      this.bBG.set(this.bBy, this.bBy * 2, getBoardRect().width() - this.bBy, getBoardRect().height() - this.bBz - this.bBA - this.bBy * 2);
    }
    x.i("MicroMsg.CropArtist", "[onAlive] CROP_MAX_RECT:%s", new Object[] { this.bBG });
    com.tencent.mm.t.a locala = ((com.tencent.mm.cache.a)vG()).yq();
    if ((locala != null) && (!locala.dnF.isEmpty()))
    {
      this.bBn.cfQ().getBaseBoardView().m(locala.dnF);
      float f = a(locala.mMatrix);
      x.i("MicroMsg.CropArtist", "[onAlive] rotation:%s", new Object[] { Float.valueOf(f) });
      getMainMatrix().postRotate(-f, locala.dnF.centerX(), locala.dnF.centerY());
    }
  }
  
  public final void vI()
  {
    super.vI();
    this.bBn.cfQ().getActionBar().setVisibility(8);
    this.bBZ.setEmpty();
    com.tencent.mm.t.a locala;
    if (((com.tencent.mm.cache.a)vG()).aW(true) <= 0)
    {
      locala = new com.tencent.mm.t.a();
      locala.mMatrix.set(getMainMatrix());
      ((com.tencent.mm.cache.a)vG()).a(locala);
      vS();
      this.bBn.cfQ().getBaseBoardView().uUg = this.bwl;
      this.bBn.cfQ().getBaseBoardView().a(new c.1(this), 0.0F, false);
    }
    for (;;)
    {
      setOneFingerMoveEnable(true);
      return;
      locala = ((com.tencent.mm.cache.a)vG()).yq();
      if (locala == null)
      {
        x.e("MicroMsg.CropArtist", "item is null!!!");
        return;
      }
      this.bwl.set(new Rect(locala.bwl));
      this.bBn.cfQ().getBaseBoardView().uUg = locala.bwl;
      try
      {
        ((com.tencent.mm.cache.a)vG()).a((com.tencent.mm.t.a)locala.clone());
        this.bBn.cfQ().getBaseBoardView().a(new c.2(this), 0.0F, false);
      }
      catch (CloneNotSupportedException localCloneNotSupportedException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.CropArtist", localCloneNotSupportedException, "", new Object[0]);
        }
      }
    }
  }
  
  public final boolean vK()
  {
    return !((com.tencent.mm.cache.a)vG()).dak.equals(getMainMatrix());
  }
  
  public final void vR()
  {
    this.bBD.set(this.bwl.left - this.bBy, this.bwl.bottom - this.bBy, this.bwl.right + this.bBy, this.bwl.bottom + this.bBy);
    this.bBC.set(this.bwl.left - this.bBy, this.bwl.top - this.bBy, this.bwl.right + this.bBy, this.bwl.top + this.bBy);
    this.bBE.set(this.bwl.left - this.bBy, this.bwl.top - this.bBy, this.bwl.left + this.bBy, this.bwl.bottom + this.bBy);
    this.bBF.set(this.bwl.right - this.bBy, this.bwl.top - this.bBy, this.bwl.right + this.bBy, this.bwl.bottom + this.bBy);
  }
  
  public final void vS()
  {
    float f1 = this.bBn.cfS().getWidth() * 1.0F / this.bBn.cfS().getHeight();
    int i;
    if (f1 < this.bBG.width() * 1.0F / this.bBG.height())
    {
      float f2 = this.bBG.height();
      i = (int)((this.bBG.width() - f1 * f2) / 2.0F);
      this.bwl.set(this.bBG.left + i, this.bBG.top, this.bBG.right - i, this.bBG.bottom);
    }
    for (;;)
    {
      vR();
      return;
      f1 = this.bBG.width() / f1;
      i = (int)((this.bBG.height() - f1) / 2.0F);
      this.bwl.set(this.bBG.left, this.bBG.top + i, this.bBG.right, this.bBG.bottom - i);
    }
  }
  
  public final void vT()
  {
    this.bBn.cfQ().getBaseBoardView().uUg = this.bBn.cfQ().getBaseBoardView().getRawBoardRect();
    final Object localObject1 = new RectF(this.bwl);
    Object localObject2 = new Matrix();
    getMainMatrix().invert((Matrix)localObject2);
    ((Matrix)localObject2).mapRect((RectF)localObject1);
    localObject2 = new Rect();
    ((RectF)localObject1).round((Rect)localObject2);
    this.bBn.cfQ().getBaseBoardView().m((Rect)localObject2);
    localObject1 = new com.tencent.mm.t.a();
    ((com.tencent.mm.t.a)localObject1).bwl = new Rect(this.bwl);
    ((com.tencent.mm.t.a)localObject1).dnF.set((Rect)localObject2);
    this.bBn.cfQ().getBaseBoardView().a(new a.b()
    {
      public final void onStart() {}
      
      public final void vU()
      {
        Object localObject = localObject1;
        Matrix localMatrix = c.this.getMainMatrix();
        ((com.tencent.mm.t.a)localObject).mMatrix.set(localMatrix);
        localObject = (com.tencent.mm.cache.a)c.this.vG();
        if (((com.tencent.mm.cache.a)localObject).dai != null) {
          ((com.tencent.mm.cache.a)localObject).dai.clear();
        }
        ((com.tencent.mm.cache.a)c.this.vG()).a(localObject1);
      }
    }, 0.0F, true);
    this.bBn.cfQ().getActionBar().setVisibility(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */