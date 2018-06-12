package com.tencent.mm.view.footer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View.MeasureSpec;
import com.tencent.mm.api.d;
import com.tencent.mm.api.l;
import com.tencent.mm.bd.a.c;
import com.tencent.mm.bd.a.d;
import com.tencent.mm.bd.a.g;
import com.tencent.mm.bd.a.h;
import com.tencent.mm.sdk.platformtools.c;

public final class b
  extends a
{
  private Bitmap uUV;
  private Bitmap uUW;
  private Bitmap uUX;
  private Bitmap uUY;
  private Bitmap uUZ;
  private Bitmap uVa;
  private Bitmap uVb;
  private Bitmap uVc;
  private Bitmap uVd;
  private Bitmap uVe;
  private Bitmap uVf;
  private Bitmap uVg;
  private Bitmap uVh;
  private Bitmap uVi;
  private Rect[] uVj;
  private Rect[] uVk;
  private boolean uVl;
  private boolean uVm;
  private boolean uVn;
  private boolean uVo;
  private boolean uVp = true;
  private int uVq = -1;
  private Paint uvt;
  
  public b(Context paramContext, com.tencent.mm.bi.b paramb)
  {
    super(paramContext, paramb);
  }
  
  protected final boolean GU(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = super.GU(paramInt);
    switch (1.qVw[GT(paramInt).ordinal()])
    {
    default: 
      bool1 = bool2;
    }
    return bool1;
  }
  
  protected final Bitmap a(d paramd, boolean paramBoolean)
  {
    Bitmap localBitmap = null;
    if (paramd == d.bwR) {
      if (paramBoolean) {
        localBitmap = this.uUY;
      }
    }
    while (paramd != d.bwQ)
    {
      return localBitmap;
      return this.uUX;
    }
    if (paramBoolean) {
      return this.uUV;
    }
    return this.uUW;
  }
  
  protected final void cCi()
  {
    super.cCi();
    this.uvt = new Paint(1);
    this.uvt.setTextSize(getResources().getDimension(a.c.crop_reset_text_size));
    this.uUZ = BitmapFactory.decodeResource(getResources(), a.d.mosaic_one_unselected);
    this.uVa = BitmapFactory.decodeResource(getResources(), a.d.mosaic_one_selected);
    this.uVb = BitmapFactory.decodeResource(getResources(), a.d.mosaic_two_unselected);
    this.uVc = BitmapFactory.decodeResource(getResources(), a.d.mosaic_two_selected);
    this.uUW = c.s(getResources().getDrawable(a.g.mosaic_unselected));
    this.uUV = c.s(getResources().getDrawable(a.g.mosaic_selected));
    this.uUX = c.s(getResources().getDrawable(a.g.crop_unselected));
    this.uUY = c.s(getResources().getDrawable(a.g.crop_selected));
    this.uVd = c.s(getResources().getDrawable(a.g.rotation_normal));
    this.uVe = c.s(getResources().getDrawable(a.g.rotation_press));
    this.uVg = c.s(getResources().getDrawable(a.g.sure_crop_press));
    this.uVf = c.s(getResources().getDrawable(a.g.sure_crop_normal));
    this.uVh = c.s(getResources().getDrawable(a.g.cancel_crop_press));
    this.uVi = c.s(getResources().getDrawable(a.g.cancel_crop_normal));
  }
  
  protected final void cCk()
  {
    super.cCk();
    if (getCurFeatureType() == d.bwQ)
    {
      if (this.uVj == null) {
        this.uVj = new Rect[2];
      }
      if (this.uUN == null) {
        this.uUN = new Rect();
      }
      f1 = (getMeasuredWidth() - getPaddingLeftAndRight() - this.uUH.getWidth() - this.uVc.getWidth() - this.uUZ.getWidth()) / 3.0F;
      k = (int)(this.uVb.getWidth() / 2 + f1);
      i = (getDetailHeight() - this.uVb.getWidth()) / 2 + this.uVb.getWidth() / 2;
      j = this.uVb.getWidth() * 2;
      this.uVj[0] = new Rect(k - j, i - j, k + j, i + j);
      f2 = k;
      k = (int)(f1 + this.uVb.getWidth() + f2);
      this.uVj[1] = new Rect(k - j, i - j, k + j, i + j);
      i = getMeasuredWidth() - getPaddingLeftAndRight() / 2 - this.uUH.getWidth() / 2;
      this.uUN.set(i - this.uUH.getWidth(), 0, i + this.uUH.getWidth(), getDetailHeight());
    }
    while (getCurFeatureType() != d.bwR) {
      return;
    }
    if (this.uVk == null) {
      this.uVk = new Rect[4];
    }
    int i = (int)getResources().getDimension(a.c.crop_rotation_layout_height);
    float f1 = i / 2 - this.uVe.getHeight() / 2;
    float f2 = getResources().getDimension(a.c.feature_select_layout_height) / 2.0F;
    float f3 = this.uVi.getHeight() / 2;
    float f4 = i;
    float f5 = 1.0F * getPaddingLeftAndRight() / 2.0F;
    int j = (int)(f1 + this.uVi.getHeight() / 2);
    int k = (int)(f5 + this.uVi.getHeight() / 2);
    i = this.uVi.getHeight();
    this.uVk[0] = new Rect(k - i, j - i, k + i, j + i);
    j = (int)(f4 + (f2 - f3) + this.uVi.getHeight() / 2);
    this.uVk[1] = new Rect(k - i, j - i, k + i, j + i);
    k = getMeasuredWidth() - getPaddingLeftAndRight() / 2 - this.uVi.getHeight() / 2;
    this.uVk[2] = new Rect(k - i, j - i, k + i, j + i);
    k = getMeasuredWidth() / 2;
    this.uVk[3] = new Rect(k - i, j - i, k + i, j + i);
  }
  
  protected final void fs(int paramInt1, int paramInt2)
  {
    int j = 0;
    int i = 0;
    super.fs(paramInt1, paramInt2);
    switch (1.qVw[GT(this.gEm).ordinal()])
    {
    }
    do
    {
      return;
      do
      {
        i += 1;
        if (i >= this.uVj.length) {
          break;
        }
      } while (!this.uVj[i].contains(paramInt1, paramInt2));
      this.uVq = i;
      return;
      do
      {
        j += 1;
        if (j >= this.uVk.length) {
          break;
        }
      } while (!this.uVk[j].contains(paramInt1, paramInt2));
      if (j == 0)
      {
        this.uVm = true;
        return;
      }
      if (j == 1)
      {
        this.uVl = true;
        return;
      }
      if (j == 2)
      {
        this.uVn = true;
        return;
      }
    } while (j != 3);
    this.uVo = true;
  }
  
  protected final void ft(int paramInt1, int paramInt2)
  {
    int i = 0;
    super.ft(paramInt1, paramInt2);
    switch (1.qVw[GT(this.gEm).ordinal()])
    {
    }
    for (;;)
    {
      return;
      do
      {
        i += 1;
        if ((this.uVj == null) || (i >= this.uVj.length)) {
          break;
        }
      } while ((!this.uVj[i].contains(paramInt1, paramInt2)) || (i != this.uVq));
      getPresenter().getSelectedFeatureListener().a(d.bwQ, i);
      this.uUJ = this.gEm;
      return;
      i = 0;
      while ((this.uVk != null) && (i < this.uVk.length))
      {
        if (this.uVk[i].contains(paramInt1, paramInt2))
        {
          if (((i == 0) && (this.uVm)) || ((i == 1) && (this.uVl)) || ((i == 2) && (this.uVn)) || ((i == 3) && (this.uVo)))
          {
            getPresenter().getSelectedFeatureListener().a(d.bwR, i);
            this.uUJ = this.gEm;
          }
          this.uVm = false;
          this.uVl = false;
          this.uVn = false;
          this.uVo = false;
          return;
        }
        i += 1;
      }
    }
  }
  
  protected final int getDetailHeight()
  {
    int j = super.getDetailHeight();
    int i = j;
    if (j == 0)
    {
      if (getCurFeatureType() != d.bwQ) {
        break label35;
      }
      i = (int)getResources().getDimension(a.c.feature_select_detail_layout_height);
    }
    label35:
    do
    {
      return i;
      i = j;
    } while (getCurFeatureType() != d.bwR);
    return (int)(getResources().getDimension(a.c.feature_select_layout_height) + getResources().getDimension(a.c.crop_rotation_layout_height));
  }
  
  protected final void k(Canvas paramCanvas)
  {
    if (getCurFeatureType() != d.bwR)
    {
      super.k(paramCanvas);
      return;
    }
    l(paramCanvas);
  }
  
  protected final void l(Canvas paramCanvas)
  {
    super.l(paramCanvas);
    if (getCurFeatureType() == d.bwQ)
    {
      localPaint = new Paint();
      if (vK())
      {
        localPaint.setAlpha(255);
        if ((!this.uUO) || (!vK())) {
          break label227;
        }
        localBitmap = this.uUI;
        paramCanvas.drawBitmap(localBitmap, getMeasuredWidth() - getPaddingLeftAndRight() / 2 - this.uUH.getWidth(), (getDetailHeight() - this.uUH.getHeight()) / 2, localPaint);
        f1 = (getMeasuredWidth() - getPaddingLeftAndRight() - this.uUH.getWidth() - this.uVc.getWidth() - this.uUZ.getWidth()) / 3.0F;
        f2 = (getDetailHeight() - this.uVc.getHeight()) * 1.0F / 2.0F;
        if (this.uVp)
        {
          this.uVq = 0;
          this.uVp = false;
        }
        if (this.uVq != 0) {
          break label236;
        }
        paramCanvas.drawBitmap(this.uVa, f1, f2, null);
        paramCanvas.drawBitmap(this.uVb, f1 + f1 + this.uVc.getWidth(), f2, null);
      }
    }
    label227:
    label236:
    while (getCurFeatureType() != d.bwR)
    {
      for (;;)
      {
        Paint localPaint;
        return;
        localPaint.setAlpha(160);
        continue;
        Bitmap localBitmap = this.uUH;
      }
      if (this.uVq == 1)
      {
        paramCanvas.drawBitmap(this.uUZ, f1, f2, null);
        paramCanvas.drawBitmap(this.uVc, f1 + f1 + this.uVc.getWidth(), f2, null);
        return;
      }
      paramCanvas.drawBitmap(this.uUZ, f1, f2, null);
      paramCanvas.drawBitmap(this.uVb, f1 + f1 + this.uVc.getWidth(), f2, null);
      return;
    }
    int i = (int)getResources().getDimension(a.c.crop_rotation_layout_height);
    paramCanvas.drawLine(0.0F, i, getMeasuredWidth(), i, this.uUP);
    float f1 = getResources().getDimension(a.c.feature_select_layout_height) / 2.0F - this.uVi.getHeight() / 2 + i;
    float f2 = getPaddingLeftAndRight() * 1.0F / 2.0F;
    float f3 = i / 2 - this.uVe.getHeight() / 2;
    if (this.uVm)
    {
      paramCanvas.drawBitmap(this.uVe, f2, f3, null);
      if (!this.uVn) {
        break label608;
      }
      paramCanvas.drawBitmap(this.uVg, getMeasuredWidth() - f2 - this.uVi.getWidth(), f1, null);
      label462:
      if (!this.uVl) {
        break label637;
      }
      paramCanvas.drawBitmap(this.uVh, f2, f1, null);
    }
    for (;;)
    {
      f1 = getResources().getDimension(a.c.crop_reset_text_size) * 2.0F;
      f2 = getResources().getDimension(a.c.crop_reset_text_size);
      f3 = getResources().getDimension(a.c.feature_select_layout_height) / 2.0F;
      f2 = (f2 - 8.0F) / 2.0F + f3 + i;
      f3 = getMeasuredWidth() / 2;
      if (!this.uVo) {
        break label651;
      }
      this.uvt.setColor(-1);
      this.uvt.setAlpha(160);
      paramCanvas.drawText(getResources().getString(a.h.crop_reset), f3 - f1 / 2.0F, f2, this.uvt);
      return;
      paramCanvas.drawBitmap(this.uVd, f2, f3, null);
      break;
      label608:
      paramCanvas.drawBitmap(this.uVf, getMeasuredWidth() - f2 - this.uVi.getWidth(), f1, null);
      break label462;
      label637:
      paramCanvas.drawBitmap(this.uVi, f2, f1, null);
    }
    label651:
    if (vK())
    {
      this.uvt.setColor(-1);
      this.uvt.setAlpha(255);
      paramCanvas.drawText(getResources().getString(a.h.crop_reset), f3 - f1 / 2.0F, f2, this.uvt);
      return;
    }
    this.uvt.setColor(-1);
    this.uvt.setAlpha(100);
    paramCanvas.drawText(getResources().getString(a.h.crop_reset), f3 - f1 / 2.0F, f2, this.uvt);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (getCurFeatureType() != d.bwR)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = getPaddingLeft();
    int i = getPaddingRight();
    int j = View.MeasureSpec.makeMeasureSpec(getDetailHeight(), 1073741824);
    setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(paramInt1 - paramInt2 - i, 1073741824), j);
    cCk();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/view/footer/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */