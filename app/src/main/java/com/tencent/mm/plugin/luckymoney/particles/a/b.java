package com.tencent.mm.plugin.luckymoney.particles.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.animation.Interpolator;

public abstract class b
{
  private final Matrix aaw = new Matrix();
  public int alpha;
  private final Paint kSN = new Paint(1);
  public long kSO;
  public float kSP;
  public float kSQ;
  public float kSR;
  public float kSS;
  public Long kST;
  public Long kSU;
  public float kSV;
  public float kSW;
  public Long kSX;
  public float kSY;
  public float kSZ;
  public Interpolator kSd;
  public Rect kSe;
  public float kSj;
  public float kSl;
  public Float kSn;
  public Float kSp;
  public float kSv;
  public Float kSx;
  public long kSz;
  public float kTa;
  public float kTb;
  public float kTc;
  public boolean kTd;
  public boolean kTe;
  public VelocityTracker kTf;
  public float kTg;
  public float kTh;
  public float kTi;
  public float kTj;
  public boolean terminated;
  
  public static float a(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, Long paramLong1, Float paramFloat)
  {
    if ((paramLong1 == null) || (paramLong < paramLong1.longValue())) {
      return (float)paramLong * paramFloat2 + paramFloat1 + 0.5F * paramFloat3 * (float)paramLong * (float)paramLong;
    }
    return (float)paramLong1.longValue() * paramFloat2 + paramFloat1 + 0.5F * paramFloat3 * (float)paramLong1.longValue() * (float)paramLong1.longValue() + (float)(paramLong - paramLong1.longValue()) * paramFloat.floatValue();
  }
  
  private static long a(float paramFloat1, float paramFloat2, float paramFloat3, Long paramLong, Float paramFloat, int paramInt1, int paramInt2)
  {
    double d1;
    if (paramFloat3 != 0.0F)
    {
      if (paramFloat3 > 0.0F) {}
      while ((paramLong == null) || (paramLong.longValue() < 0L))
      {
        d1 = Math.sqrt(2.0F * paramFloat3 * paramInt2 - 2.0F * paramFloat3 * paramFloat1 + paramFloat2 * paramFloat2);
        double d2 = (-d1 - paramFloat2) / paramFloat3;
        if (d2 > 0.0D)
        {
          return d2;
          paramInt2 = paramInt1;
        }
        else
        {
          d1 = (d1 - paramFloat2) / paramFloat3;
          if (d1 > 0.0D) {
            return d1;
          }
          return Long.MAX_VALUE;
        }
      }
      d1 = (paramInt2 - paramFloat1 - (float)paramLong.longValue() * paramFloat2 - 0.5D * paramFloat3 * paramLong.longValue() * paramLong.longValue() + paramFloat.floatValue() * (float)paramLong.longValue()) / paramFloat.floatValue();
      if (d1 > 0.0D) {
        return d1;
      }
      return Long.MAX_VALUE;
    }
    if (paramLong == null) {
      if (paramFloat2 <= 0.0F) {
        break label218;
      }
    }
    for (;;)
    {
      if (paramFloat2 != 0.0F)
      {
        d1 = (paramInt2 - paramFloat1) / paramFloat2;
        if (d1 > 0.0D)
        {
          return d1;
          paramFloat2 = paramFloat.floatValue();
          break;
          label218:
          paramInt2 = paramInt1;
          continue;
        }
        return Long.MAX_VALUE;
      }
    }
    return Long.MAX_VALUE;
  }
  
  private static Long a(Float paramFloat, float paramFloat1, float paramFloat2)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    long l;
    if (paramFloat != null)
    {
      if (paramFloat2 == 0.0F) {
        break label47;
      }
      l = ((paramFloat.floatValue() - paramFloat1) / paramFloat2);
      if (l <= 0L) {
        break label42;
      }
      localObject1 = Long.valueOf(l);
    }
    label42:
    label47:
    do
    {
      return (Long)localObject1;
      l = 0L;
      break;
      localObject1 = localObject2;
    } while (paramFloat.floatValue() >= paramFloat1);
    return Long.valueOf(0L);
  }
  
  public final void a(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramCanvas.save();
    paramCanvas.clipRect(this.kSe);
    this.aaw.reset();
    this.kSN.setAlpha(this.alpha);
    a(paramCanvas, this.aaw, this.kSN, paramFloat1, paramFloat2, paramFloat3);
    paramCanvas.restore();
  }
  
  protected abstract void a(Canvas paramCanvas, Matrix paramMatrix, Paint paramPaint, float paramFloat1, float paramFloat2, float paramFloat3);
  
  public abstract int getHeight();
  
  public abstract int getWidth();
  
  public final void i(Rect paramRect)
  {
    this.kSe = paramRect;
    this.kST = a(this.kSn, this.kSR, this.kSj);
    this.kSU = a(this.kSp, this.kSS, this.kSl);
    this.kSX = a(this.kSx, this.kSW, this.kSv);
    if (this.kSY == 0.0F) {
      if (this.kSz < 0L) {
        break label199;
      }
    }
    label199:
    for (float f = (float)this.kSz;; f = 9.223372E18F)
    {
      this.kSY = f;
      this.kSY = Math.min((float)a(this.kSP, this.kSR, this.kSj, this.kST, this.kSn, paramRect.left - getWidth(), paramRect.right), this.kSY);
      this.kSY = Math.min((float)a(this.kSQ, this.kSS, this.kSl, this.kSU, this.kSp, paramRect.top - getHeight(), paramRect.bottom), this.kSY);
      this.kSN.setAlpha(this.alpha);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/particles/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */