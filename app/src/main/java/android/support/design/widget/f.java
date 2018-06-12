package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.design.a.i;
import android.support.v4.d.d;
import android.support.v4.d.e;
import android.support.v4.view.z;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.Interpolator;

final class f
{
  private static final boolean cZ;
  private static final Paint da;
  private Paint dA;
  private float dB;
  private float dC;
  private float dD;
  private float dE;
  private boolean dF;
  private final TextPaint dG;
  Interpolator dH;
  private Interpolator dI;
  private float dJ;
  private float dK;
  private float dL;
  private int dM;
  private float dN;
  private float dO;
  private float dP;
  private int dQ;
  private boolean db;
  float dc;
  private final Rect dd;
  private final Rect de;
  private final RectF dg;
  int dh = 16;
  int di = 16;
  float dj = 15.0F;
  float dk = 15.0F;
  private int dl;
  int dm;
  private float dn;
  private float jdField_do;
  private float dp;
  private float dq;
  private float dr;
  private float ds;
  Typeface dt;
  Typeface du;
  private Typeface dv;
  private CharSequence dw;
  private boolean dx;
  private boolean dy;
  private Bitmap dz;
  CharSequence mText;
  private final View mView;
  
  static
  {
    if (Build.VERSION.SDK_INT < 18) {}
    for (boolean bool = true;; bool = false)
    {
      cZ = bool;
      da = null;
      return;
    }
  }
  
  public f(View paramView)
  {
    this.mView = paramView;
    this.dG = new TextPaint(129);
    this.de = new Rect();
    this.dd = new Rect();
    this.dg = new RectF();
  }
  
  private Typeface B(int paramInt)
  {
    TypedArray localTypedArray = this.mView.getContext().obtainStyledAttributes(paramInt, new int[] { 16843692 });
    try
    {
      Object localObject1 = localTypedArray.getString(0);
      if (localObject1 != null)
      {
        localObject1 = Typeface.create((String)localObject1, 0);
        return (Typeface)localObject1;
      }
      return null;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  private void W()
  {
    if ((this.de.width() > 0) && (this.de.height() > 0) && (this.dd.width() > 0) && (this.dd.height() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.db = bool;
      return;
    }
  }
  
  private void Y()
  {
    i(this.dc);
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, Interpolator paramInterpolator)
  {
    float f = paramFloat3;
    if (paramInterpolator != null) {
      f = paramInterpolator.getInterpolation(paramFloat3);
    }
    return a.b(paramFloat1, paramFloat2, f);
  }
  
  private static boolean a(Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (paramRect.left == paramInt1) && (paramRect.top == paramInt2) && (paramRect.right == paramInt3) && (paramRect.bottom == paramInt4);
  }
  
  private void aa()
  {
    if (this.dz != null)
    {
      this.dz.recycle();
      this.dz = null;
    }
  }
  
  private static int b(int paramInt1, int paramInt2, float paramFloat)
  {
    float f1 = 1.0F - paramFloat;
    float f2 = Color.alpha(paramInt1);
    float f3 = Color.alpha(paramInt2);
    float f4 = Color.red(paramInt1);
    float f5 = Color.red(paramInt2);
    float f6 = Color.green(paramInt1);
    float f7 = Color.green(paramInt2);
    float f8 = Color.blue(paramInt1);
    float f9 = Color.blue(paramInt2);
    return Color.argb((int)(f2 * f1 + f3 * paramFloat), (int)(f4 * f1 + f5 * paramFloat), (int)(f6 * f1 + f7 * paramFloat), (int)(f1 * f8 + f9 * paramFloat));
  }
  
  private void i(float paramFloat)
  {
    this.dg.left = a(this.dd.left, this.de.left, paramFloat, this.dH);
    this.dg.top = a(this.dn, this.jdField_do, paramFloat, this.dH);
    this.dg.right = a(this.dd.right, this.de.right, paramFloat, this.dH);
    this.dg.bottom = a(this.dd.bottom, this.de.bottom, paramFloat, this.dH);
    this.dr = a(this.dp, this.dq, paramFloat, this.dH);
    this.ds = a(this.dn, this.jdField_do, paramFloat, this.dH);
    j(a(this.dj, this.dk, paramFloat, this.dI));
    if (this.dm != this.dl) {
      this.dG.setColor(b(this.dl, this.dm, paramFloat));
    }
    for (;;)
    {
      this.dG.setShadowLayer(a(this.dN, this.dJ, paramFloat, null), a(this.dO, this.dK, paramFloat, null), a(this.dP, this.dL, paramFloat, null), b(this.dQ, this.dM, paramFloat));
      z.E(this.mView);
      return;
      this.dG.setColor(this.dm);
    }
  }
  
  private void j(float paramFloat)
  {
    k(paramFloat);
    boolean bool;
    if ((cZ) && (this.dD != 1.0F))
    {
      bool = true;
      this.dy = bool;
      if ((this.dy) && (this.dz == null) && (!this.dd.isEmpty()) && (!TextUtils.isEmpty(this.dw))) {
        break label77;
      }
    }
    for (;;)
    {
      z.E(this.mView);
      return;
      bool = false;
      break;
      label77:
      i(0.0F);
      this.dB = this.dG.ascent();
      this.dC = this.dG.descent();
      int i = Math.round(this.dG.measureText(this.dw, 0, this.dw.length()));
      int j = Math.round(this.dC - this.dB);
      if ((i > 0) && (j > 0))
      {
        this.dz = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
        new Canvas(this.dz).drawText(this.dw, 0, this.dw.length(), 0.0F, j - this.dG.descent(), this.dG);
        if (this.dA == null) {
          this.dA = new Paint(3);
        }
      }
    }
  }
  
  private void k(float paramFloat)
  {
    int k = 1;
    if (this.mText == null) {
      return;
    }
    float f1;
    int i;
    if (n(paramFloat, this.dk))
    {
      f1 = this.de.width();
      paramFloat = this.dk;
      this.dD = 1.0F;
      if (this.dv == this.dt) {
        break label362;
      }
      this.dv = this.dt;
      i = 1;
    }
    for (;;)
    {
      int j = i;
      label97:
      Object localObject;
      boolean bool;
      label164:
      label227:
      label237:
      float f2;
      if (f1 > 0.0F)
      {
        if ((this.dE != paramFloat) || (this.dF) || (i != 0))
        {
          i = 1;
          this.dE = paramFloat;
          this.dF = false;
          j = i;
        }
      }
      else
      {
        if ((this.dw != null) && (j == 0)) {
          break;
        }
        this.dG.setTextSize(this.dE);
        this.dG.setTypeface(this.dv);
        localObject = this.dG;
        if (this.dD == 1.0F) {
          break label336;
        }
        bool = true;
        ((TextPaint)localObject).setLinearText(bool);
        localObject = TextUtils.ellipsize(this.mText, this.dG, f1, TextUtils.TruncateAt.END);
        if (TextUtils.equals((CharSequence)localObject, this.dw)) {
          break;
        }
        this.dw = ((CharSequence)localObject);
        CharSequence localCharSequence = this.dw;
        if (z.I(this.mView) != 1) {
          break label342;
        }
        i = k;
        if (i == 0) {
          break label348;
        }
        localObject = e.th;
        this.dx = ((d)localObject).a(localCharSequence, localCharSequence.length());
        return;
        f1 = this.dd.width();
        f2 = this.dj;
        if (this.dv == this.du) {
          break label356;
        }
        this.dv = this.du;
      }
      label336:
      label342:
      label348:
      label356:
      for (i = 1;; i = 0)
      {
        if (n(paramFloat, this.dj))
        {
          this.dD = 1.0F;
          paramFloat = f2;
          break;
        }
        this.dD = (paramFloat / this.dj);
        paramFloat = f2;
        break;
        i = 0;
        break label97;
        bool = false;
        break label164;
        i = 0;
        break label227;
        localObject = e.tg;
        break label237;
      }
      label362:
      i = 0;
    }
  }
  
  private static boolean n(float paramFloat1, float paramFloat2)
  {
    return Math.abs(paramFloat1 - paramFloat2) < 0.001F;
  }
  
  final void A(int paramInt)
  {
    TypedArray localTypedArray = this.mView.getContext().obtainStyledAttributes(paramInt, a.i.TextAppearance);
    if (localTypedArray.hasValue(a.i.TextAppearance_android_textColor)) {
      this.dl = localTypedArray.getColor(a.i.TextAppearance_android_textColor, this.dl);
    }
    if (localTypedArray.hasValue(a.i.TextAppearance_android_textSize)) {
      this.dj = localTypedArray.getDimensionPixelSize(a.i.TextAppearance_android_textSize, (int)this.dj);
    }
    this.dQ = localTypedArray.getInt(a.i.TextAppearance_android_shadowColor, 0);
    this.dO = localTypedArray.getFloat(a.i.TextAppearance_android_shadowDx, 0.0F);
    this.dP = localTypedArray.getFloat(a.i.TextAppearance_android_shadowDy, 0.0F);
    this.dN = localTypedArray.getFloat(a.i.TextAppearance_android_shadowRadius, 0.0F);
    localTypedArray.recycle();
    if (Build.VERSION.SDK_INT >= 16) {
      this.du = B(paramInt);
    }
    Z();
  }
  
  final Typeface X()
  {
    if (this.dt != null) {
      return this.dt;
    }
    return Typeface.DEFAULT;
  }
  
  public final void Z()
  {
    int j = 1;
    float f2 = 0.0F;
    float f3;
    float f1;
    int i;
    if ((this.mView.getHeight() > 0) && (this.mView.getWidth() > 0))
    {
      f3 = this.dE;
      k(this.dk);
      if (this.dw == null) {
        break label402;
      }
      f1 = this.dG.measureText(this.dw, 0, this.dw.length());
      int k = this.di;
      if (!this.dx) {
        break label407;
      }
      i = 1;
      label83:
      i = android.support.v4.view.f.getAbsoluteGravity(k, i);
      switch (i & 0x70)
      {
      default: 
        this.jdField_do = ((this.dG.descent() - this.dG.ascent()) / 2.0F - this.dG.descent() + this.de.centerY());
        label162:
        switch (i & 0x800007)
        {
        default: 
          this.dq = this.de.left;
          label208:
          k(this.dj);
          f1 = f2;
          if (this.dw != null) {
            f1 = this.dG.measureText(this.dw, 0, this.dw.length());
          }
          k = this.dh;
          if (this.dx)
          {
            i = j;
            label264:
            i = android.support.v4.view.f.getAbsoluteGravity(k, i);
            switch (i & 0x70)
            {
            default: 
              this.dn = ((this.dG.descent() - this.dG.ascent()) / 2.0F - this.dG.descent() + this.dd.centerY());
              label342:
              switch (i & 0x800007)
              {
              default: 
                this.dp = this.dd.left;
              }
              break;
            }
          }
          break;
        }
        break;
      }
    }
    for (;;)
    {
      aa();
      j(f3);
      Y();
      return;
      label402:
      f1 = 0.0F;
      break;
      label407:
      i = 0;
      break label83;
      this.jdField_do = this.de.bottom;
      break label162;
      this.jdField_do = (this.de.top - this.dG.ascent());
      break label162;
      this.dq = (this.de.centerX() - f1 / 2.0F);
      break label208;
      this.dq = (this.de.right - f1);
      break label208;
      i = 0;
      break label264;
      this.dn = this.dd.bottom;
      break label342;
      this.dn = (this.dd.top - this.dG.ascent());
      break label342;
      this.dp = (this.dd.centerX() - f1 / 2.0F);
      continue;
      this.dp = (this.dd.right - f1);
    }
  }
  
  final void a(Typeface paramTypeface)
  {
    this.du = paramTypeface;
    this.dt = paramTypeface;
    Z();
  }
  
  final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!a(this.dd, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      this.dd.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.dF = true;
      W();
    }
  }
  
  final void b(Interpolator paramInterpolator)
  {
    this.dI = paramInterpolator;
    Z();
  }
  
  final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!a(this.de, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      this.de.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.dF = true;
      W();
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int j = paramCanvas.save();
    float f4;
    int i;
    float f1;
    label64:
    float f2;
    if ((this.dw != null) && (this.db))
    {
      f4 = this.dr;
      float f3 = this.ds;
      if ((!this.dy) || (this.dz == null)) {
        break label128;
      }
      i = 1;
      if (i == 0) {
        break label134;
      }
      f1 = this.dB * this.dD;
      f2 = f3;
      if (i != 0) {
        f2 = f3 + f1;
      }
      if (this.dD != 1.0F) {
        paramCanvas.scale(this.dD, this.dD, f4, f2);
      }
      if (i == 0) {
        break label155;
      }
      paramCanvas.drawBitmap(this.dz, f4, f2, this.dA);
    }
    for (;;)
    {
      paramCanvas.restoreToCount(j);
      return;
      label128:
      i = 0;
      break;
      label134:
      this.dG.ascent();
      f1 = 0.0F;
      this.dG.descent();
      break label64;
      label155:
      paramCanvas.drawText(this.dw, 0, this.dw.length(), f4, f2, this.dG);
    }
  }
  
  final void h(float paramFloat)
  {
    float f;
    if (paramFloat < 0.0F) {
      f = 0.0F;
    }
    for (;;)
    {
      if (f != this.dc)
      {
        this.dc = f;
        Y();
      }
      return;
      f = paramFloat;
      if (paramFloat > 1.0F) {
        f = 1.0F;
      }
    }
  }
  
  final void setText(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (!paramCharSequence.equals(this.mText)))
    {
      this.mText = paramCharSequence;
      this.dw = null;
      aa();
      Z();
    }
  }
  
  final void v(int paramInt)
  {
    if (this.dm != paramInt)
    {
      this.dm = paramInt;
      Z();
    }
  }
  
  final void w(int paramInt)
  {
    if (this.dl != paramInt)
    {
      this.dl = paramInt;
      Z();
    }
  }
  
  final void x(int paramInt)
  {
    if (this.dh != paramInt)
    {
      this.dh = paramInt;
      Z();
    }
  }
  
  final void y(int paramInt)
  {
    if (this.di != paramInt)
    {
      this.di = paramInt;
      Z();
    }
  }
  
  final void z(int paramInt)
  {
    TypedArray localTypedArray = this.mView.getContext().obtainStyledAttributes(paramInt, a.i.TextAppearance);
    if (localTypedArray.hasValue(a.i.TextAppearance_android_textColor)) {
      this.dm = localTypedArray.getColor(a.i.TextAppearance_android_textColor, this.dm);
    }
    if (localTypedArray.hasValue(a.i.TextAppearance_android_textSize)) {
      this.dk = localTypedArray.getDimensionPixelSize(a.i.TextAppearance_android_textSize, (int)this.dk);
    }
    this.dM = localTypedArray.getInt(a.i.TextAppearance_android_shadowColor, 0);
    this.dK = localTypedArray.getFloat(a.i.TextAppearance_android_shadowDx, 0.0F);
    this.dL = localTypedArray.getFloat(a.i.TextAppearance_android_shadowDy, 0.0F);
    this.dJ = localTypedArray.getFloat(a.i.TextAppearance_android_shadowRadius, 0.0F);
    localTypedArray.recycle();
    if (Build.VERSION.SDK_INT >= 16) {
      this.dt = B(paramInt);
    }
    Z();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/android/support/design/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */