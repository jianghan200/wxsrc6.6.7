package com.tencent.mm.view.footer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.mm.api.d;
import com.tencent.mm.api.l;
import com.tencent.mm.bd.a.a;
import com.tencent.mm.bd.a.b;
import com.tencent.mm.bd.a.c;
import com.tencent.mm.bd.a.d;
import com.tencent.mm.bd.a.e;
import com.tencent.mm.bd.a.g;
import com.tencent.mm.sdk.platformtools.c;

public abstract class a
  extends View
{
  public static final int[] uUQ = { -1, -16777216, -707825, 47944, -16535286, -15172610, -7054596, -449092 };
  private com.tencent.mm.bi.b bBn;
  private Paint dnG;
  protected int gEm = -1;
  protected Paint uSU;
  private final float uUA = getResources().getDimension(a.c.feature_padding);
  private Bitmap uUB;
  private Bitmap uUC;
  private Bitmap uUD;
  private Bitmap uUE;
  private Bitmap uUF;
  private Bitmap uUG;
  protected Bitmap uUH;
  protected Bitmap uUI;
  protected int uUJ = -1;
  protected int uUK = -1;
  private Rect[] uUL;
  private Rect[] uUM;
  protected Rect uUN;
  protected boolean uUO;
  protected Paint uUP;
  protected int uUR = -1;
  protected int uUS = -1;
  private boolean uUT = true;
  
  public a(Context paramContext, com.tencent.mm.bi.b paramb)
  {
    super(paramContext);
    setId(a.e.base_footer_view_id);
    this.bBn = paramb;
    cCi();
  }
  
  private Bitmap b(d paramd, boolean paramBoolean)
  {
    Bitmap localBitmap1 = null;
    switch (a.3.qVw[paramd.ordinal()])
    {
    }
    for (;;)
    {
      Bitmap localBitmap2 = localBitmap1;
      if (localBitmap1 == null) {
        localBitmap2 = a(paramd, paramBoolean);
      }
      return localBitmap2;
      if (paramBoolean)
      {
        localBitmap1 = this.uUE;
      }
      else
      {
        localBitmap1 = this.uUD;
        continue;
        if (paramBoolean)
        {
          localBitmap1 = this.uUG;
        }
        else
        {
          localBitmap1 = this.uUF;
          continue;
          if (paramBoolean) {
            localBitmap1 = this.uUC;
          } else {
            localBitmap1 = this.uUB;
          }
        }
      }
    }
  }
  
  private boolean cCj()
  {
    return getDetailHeight() > 0;
  }
  
  private void cCl()
  {
    if (this.uUM == null) {
      this.uUM = new Rect[uUQ.length];
    }
    if (this.uUN == null) {
      this.uUN = new Rect();
    }
    float f1 = getResources().getDimension(a.c.doodle_radio);
    float f2 = (getMeasuredWidth() - getPaddingLeftAndRight() - this.uUH.getWidth() - 2.0F * f1 * uUQ.length) / uUQ.length;
    int k = (int)(f1 * 2.0F);
    int j = (int)(getPaddingLeftAndRight() / 2 + f1 + 5.0F);
    int m = (int)((getDetailHeight() - f1 * 2.0F) / 2.0F + f1);
    int i = 0;
    while (i < uUQ.length)
    {
      this.uUM[i] = new Rect(j - k, m - k, j + k, m + k);
      j = (int)(j + (2.0F * f1 + f2));
      i += 1;
    }
    i = getMeasuredWidth() - getPaddingLeftAndRight() / 2 - this.uUH.getWidth() / 2;
    this.uUN.set(i - this.uUH.getWidth(), 0, i + this.uUH.getWidth(), getDetailHeight());
  }
  
  public static int getColor(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < uUQ.length)) {
      return uUQ[paramInt];
    }
    return -65536;
  }
  
  protected final d GT(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < getFeatureCount())) {
      return getPresenter().getFeatures()[paramInt];
    }
    return d.bwM;
  }
  
  protected boolean GU(int paramInt)
  {
    d locald = GT(paramInt);
    switch (a.3.qVw[locald.ordinal()])
    {
    case 2: 
    case 3: 
    default: 
      return false;
    }
    return true;
  }
  
  protected abstract Bitmap a(d paramd, boolean paramBoolean);
  
  protected void cCi()
  {
    this.uSU = new Paint(1);
    this.uSU.setColor(-16711936);
    this.uUP = new Paint(1);
    this.uUP.setColor(getResources().getColor(a.b.divider_line_color));
    this.uUP.setStrokeWidth(0.6F);
    this.dnG = new Paint(1);
    this.dnG.setStyle(Paint.Style.FILL);
    this.dnG.setStrokeCap(Paint.Cap.ROUND);
    this.uUI = c.s(getResources().getDrawable(a.g.undo_press));
    this.uUH = c.s(getResources().getDrawable(a.g.undo_normal));
    this.uUB = c.s(getResources().getDrawable(a.g.doodle_unselected));
    this.uUC = c.s(getResources().getDrawable(a.g.doodle_selected));
    this.uUD = c.s(getResources().getDrawable(a.g.text_unselected));
    this.uUE = c.s(getResources().getDrawable(a.g.text_selected));
    this.uUF = BitmapFactory.decodeResource(getResources(), a.d.emoji_unselected);
    this.uUG = BitmapFactory.decodeResource(getResources(), a.d.emoji_selected);
  }
  
  protected void cCk()
  {
    if (this.uUL == null) {
      this.uUL = new Rect[getFeatureCount()];
    }
    int j = (int)(this.uUA + getIconWidth() / 2.0F);
    int k = (int)getIconWidth();
    int i = 0;
    while (i < getFeatureCount())
    {
      this.uUL[i] = new Rect(j - k, getDetailHeight(), j + k, getDetailHeight() + getMeasuredHeight());
      j = (int)(j + (getWidthSpacing() + getIconWidth()));
      i += 1;
    }
    if (GT(this.gEm) == d.bwN) {
      cCl();
    }
  }
  
  public final void cCm()
  {
    this.uUJ = this.uUK;
    requestLayout();
    invalidate();
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    case 2: 
    default: 
      return true;
      if (cCj())
      {
        if ((this.uUN == null) || (!this.uUN.contains(j, k))) {
          break label124;
        }
        this.uUO = true;
        postInvalidate();
      }
    case 0: 
      for (;;)
      {
        label50:
        i += 1;
        if (i >= getFeatureCount()) {
          break;
        }
        if (!this.uUL[i].contains(j, k)) {
          break label50;
        }
        this.uUR = i;
        postInvalidate();
        return true;
        label124:
        fs(j, k);
      }
    }
    i = 0;
    if (i < getFeatureCount())
    {
      if ((!this.uUL[i].contains(j, k)) || (this.uUR != i)) {
        break label352;
      }
      if (GU(i))
      {
        if (this.uUR != this.gEm) {
          this.gEm = this.uUR;
        }
      }
      else
      {
        label194:
        this.uUK = this.uUJ;
        if (!GU(i)) {
          break label325;
        }
        this.uUJ = this.gEm;
        getPresenter().getSelectedFeatureListener().a(GT(this.gEm));
      }
    }
    else
    {
      label240:
      if (cCj())
      {
        if ((this.uUN == null) || (!this.uUN.contains(j, k)) || (!this.uUO)) {
          break label359;
        }
        getPresenter().getSelectedFeatureListener().a(GT(this.gEm), -1);
      }
    }
    for (;;)
    {
      this.uUO = false;
      this.uUR = -1;
      requestLayout();
      postInvalidate();
      return true;
      this.gEm = -1;
      break label194;
      label325:
      this.uUJ = i;
      getPresenter().getSelectedFeatureListener().a(GT(i));
      break label240;
      label352:
      i += 1;
      break;
      label359:
      ft(j, k);
    }
  }
  
  protected void fs(int paramInt1, int paramInt2)
  {
    switch (a.3.qVw[GT(this.gEm).ordinal()])
    {
    }
    for (;;)
    {
      return;
      int i = 0;
      while (i < this.uUM.length)
      {
        if (this.uUM[i].contains(paramInt1, paramInt2))
        {
          this.uUS = i;
          this.uUT = false;
          return;
        }
        i += 1;
      }
    }
  }
  
  protected void ft(int paramInt1, int paramInt2)
  {
    switch (a.3.qVw[GT(this.gEm).ordinal()])
    {
    }
    for (;;)
    {
      return;
      int i = 0;
      while ((this.uUM != null) && (i < this.uUM.length))
      {
        if ((this.uUM[i].contains(paramInt1, paramInt2)) && (i == this.uUS))
        {
          getPresenter().getSelectedFeatureListener().a(d.bwN, i);
          return;
        }
        i += 1;
      }
    }
  }
  
  public d getCurFeatureType()
  {
    return GT(this.uUJ);
  }
  
  protected int getDetailHeight()
  {
    if (GT(this.gEm) == d.bwN) {
      return (int)getResources().getDimension(a.c.feature_select_detail_layout_height);
    }
    return 0;
  }
  
  protected int getFeatureCount()
  {
    return getPresenter().getFeatures().length;
  }
  
  protected float getHeightSpacing()
  {
    return (getMeasuredHeight() - getDetailHeight() - getIconWidth()) / 2.0F;
  }
  
  protected float getIconWidth()
  {
    Bitmap localBitmap = b(d.bwN, false);
    if (localBitmap == null) {
      return 0.0F;
    }
    return localBitmap.getWidth();
  }
  
  public int getPaddingLeftAndRight()
  {
    return (int)(2.0F * this.uUA);
  }
  
  protected com.tencent.mm.bi.b getPresenter()
  {
    return this.bBn;
  }
  
  protected float getWidthSpacing()
  {
    return (getMeasuredWidth() - getFeatureCount() * getIconWidth() - getPaddingLeftAndRight()) / (getFeatureCount() - 1);
  }
  
  protected void k(Canvas paramCanvas)
  {
    if (cCj())
    {
      paramCanvas.drawLine(0.0F, getDetailHeight(), getMeasuredWidth(), getDetailHeight(), this.uUP);
      l(paramCanvas);
    }
    float f1 = this.uUA;
    float f2 = getHeightSpacing();
    float f3 = getDetailHeight();
    int i = 0;
    if (i < getFeatureCount())
    {
      Object localObject = getPresenter().getFeatures()[i];
      if ((this.uUR == i) || (i == this.gEm)) {}
      for (boolean bool = true;; bool = false)
      {
        localObject = b((d)localObject, bool);
        if (localObject != null) {
          paramCanvas.drawBitmap((Bitmap)localObject, f1, f2 + f3, null);
        }
        f1 += getWidthSpacing() + getIconWidth();
        i += 1;
        break;
      }
    }
  }
  
  protected void l(Canvas paramCanvas)
  {
    Paint localPaint;
    if (GT(this.gEm) == d.bwN)
    {
      float f4 = getResources().getDimension(a.c.doodle_radio);
      float f5 = (getMeasuredWidth() - getPaddingLeftAndRight() - this.uUH.getWidth() - 2.0F * f4 * uUQ.length) / uUQ.length;
      float f1 = getPaddingLeftAndRight() / 2;
      float f2 = com.tencent.mm.bx.a.aH(1.5F) + (f1 + f4);
      float f6 = (getDetailHeight() - f4 * 2.0F) / 2.0F + f4;
      int i = 0;
      if (i < uUQ.length)
      {
        float f3 = 0.0F;
        if (this.uUS == i)
        {
          f1 = com.tencent.mm.bx.a.aH(2.0F);
          this.uUT = false;
        }
        for (;;)
        {
          this.dnG.setColor(-1);
          paramCanvas.drawCircle(f2, f6, com.tencent.mm.bx.a.aH(1.5F) + f4 + f1, this.dnG);
          this.dnG.setColor(uUQ[i]);
          paramCanvas.drawCircle(f2, f6, f1 + f4, this.dnG);
          f2 += 2.0F * f4 + f5;
          i += 1;
          break;
          f1 = f3;
          if (this.uUT)
          {
            f1 = f3;
            if (i == 2) {
              f1 = com.tencent.mm.bx.a.aH(2.0F);
            }
          }
        }
      }
      localPaint = new Paint();
      if (!vK()) {
        break label330;
      }
      localPaint.setAlpha(255);
      if ((!this.uUO) || (!vK())) {
        break label341;
      }
    }
    label330:
    label341:
    for (Bitmap localBitmap = this.uUI;; localBitmap = this.uUH)
    {
      paramCanvas.drawBitmap(localBitmap, getMeasuredWidth() - getPaddingLeftAndRight() / 2 - this.uUH.getWidth(), (getDetailHeight() - this.uUH.getHeight()) / 2, localPaint);
      return;
      localPaint.setAlpha(160);
      break;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawColor(0);
    k(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = getPaddingLeft();
    int k = getPaddingRight();
    paramInt2 = (int)getResources().getDimension(a.c.feature_select_layout_height);
    paramInt1 = paramInt2;
    if (cCj()) {
      paramInt1 = paramInt2 + getDetailHeight();
    }
    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i - j - k, 1073741824), paramInt1);
    cCk();
  }
  
  public void setCurFeatureType(d paramd)
  {
    int i = 0;
    if (i < getFeatureCount()) {
      if (getPresenter().getFeatures()[i] == paramd) {
        label25:
        if (!GU(i)) {
          break label64;
        }
      }
    }
    label64:
    for (this.gEm = i;; this.gEm = -1)
    {
      this.uUJ = i;
      requestLayout();
      invalidate();
      return;
      i += 1;
      break;
      i = -1;
      break label25;
    }
  }
  
  public void setFooterVisible(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.alpha_in);
      localAnimation.setAnimationListener(new a.1(this));
      startAnimation(localAnimation);
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.alpha_out);
    localAnimation.setAnimationListener(new a.2(this));
    startAnimation(localAnimation);
  }
  
  protected final boolean vK()
  {
    com.tencent.mm.d.b localb = getPresenter().b(getCurFeatureType());
    if (localb == null) {
      return false;
    }
    return localb.vK();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/view/footer/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */