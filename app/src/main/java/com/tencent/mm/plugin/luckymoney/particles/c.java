package com.tencent.mm.plugin.luckymoney.particles;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public final class c
{
  ValueAnimator gGc;
  private final b kRS;
  private final d kRT;
  final ViewGroup kRU;
  final ConfettiView kRV;
  final Queue<com.tencent.mm.plugin.luckymoney.particles.a.b> kRW = new LinkedList();
  final List<com.tencent.mm.plugin.luckymoney.particles.a.b> kRX = new ArrayList(300);
  long kRY;
  int kRZ;
  public float kSA;
  public float kSB;
  long kSa;
  float kSb;
  float kSc;
  public Interpolator kSd;
  private Rect kSe;
  private float kSf;
  private float kSg;
  private float kSh;
  private float kSi;
  private float kSj;
  private float kSk;
  private float kSl;
  private float kSm;
  private Float kSn;
  private Float kSo;
  private Float kSp;
  private Float kSq;
  private int kSr;
  private int kSs;
  private float kSt;
  private float kSu;
  private float kSv;
  private float kSw;
  private Float kSx;
  private Float kSy;
  private long kSz;
  final Random random = new Random();
  
  public c(Context paramContext, b paramb, d paramd, ViewGroup paramViewGroup)
  {
    this(paramb, paramd, paramViewGroup, ConfettiView.dN(paramContext));
  }
  
  private c(b paramb, d paramd, ViewGroup paramViewGroup, ConfettiView paramConfettiView)
  {
    this.kRS = paramb;
    this.kRT = paramd;
    this.kRU = paramViewGroup;
    this.kRV = paramConfettiView;
    this.kRV.kRX = this.kRX;
    this.kRV.addOnAttachStateChangeListener(new c.1(this));
    this.kSz = -1L;
    this.kSe = new Rect(0, 0, paramViewGroup.getWidth(), paramViewGroup.getHeight());
  }
  
  private static float a(float paramFloat1, float paramFloat2, Random paramRandom)
  {
    return (paramRandom.nextFloat() * 2.0F - 1.0F) * paramFloat2 + paramFloat1;
  }
  
  final void A(int paramInt, long paramLong)
  {
    int i = 0;
    if (i < paramInt)
    {
      Object localObject2 = (com.tencent.mm.plugin.luckymoney.particles.a.b)this.kRW.poll();
      Object localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = this.kRS.b(this.random);
      }
      localObject2 = this.kRT;
      Random localRandom = this.random;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSO = 0L;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSQ = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSP = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSS = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSR = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSl = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSj = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSp = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSn = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSU = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kST = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSV = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSW = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSv = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSx = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSX = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSz = 0L;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSY = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSZ = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSd = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kTb = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kTa = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kTc = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).alpha = 255;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kTd = false;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).terminated = false;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSO = paramLong;
      float f1 = localRandom.nextFloat();
      float f2 = ((d)localObject2).kSD;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSP = (f1 * (((d)localObject2).kSF - ((d)localObject2).kSD) + f2);
      f1 = localRandom.nextFloat();
      f2 = ((d)localObject2).kSE;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSQ = ((((d)localObject2).kSG - ((d)localObject2).kSE) * f1 + f2);
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSR = a(this.kSf, this.kSg, localRandom);
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSS = a(this.kSh, this.kSi, localRandom);
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSj = a(this.kSj, this.kSk, localRandom);
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSl = a(this.kSl, this.kSm, localRandom);
      if (this.kSn == null)
      {
        localObject2 = null;
        label381:
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSn = ((Float)localObject2);
        if (this.kSp != null) {
          break label571;
        }
        localObject2 = null;
        label398:
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSp = ((Float)localObject2);
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSV = a(this.kSr, this.kSs, localRandom);
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSW = a(this.kSt, this.kSu, localRandom);
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSv = a(this.kSv, this.kSw, localRandom);
        if (this.kSx != null) {
          break label598;
        }
      }
      label571:
      label598:
      for (localObject2 = null;; localObject2 = Float.valueOf(a(this.kSx.floatValue(), this.kSy.floatValue(), localRandom)))
      {
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSx = ((Float)localObject2);
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSz = this.kSz;
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSd = this.kSd;
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).kSY = a(this.kSA, this.kSB, localRandom);
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).i(this.kSe);
        this.kRX.add(localObject1);
        i += 1;
        break;
        localObject2 = Float.valueOf(a(this.kSn.floatValue(), this.kSo.floatValue(), localRandom));
        break label381;
        localObject2 = Float.valueOf(a(this.kSp.floatValue(), this.kSq.floatValue(), localRandom));
        break label398;
      }
    }
  }
  
  public final c I(float paramFloat1, float paramFloat2)
  {
    this.kSf = (paramFloat1 / 1000.0F);
    this.kSg = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public final c J(float paramFloat1, float paramFloat2)
  {
    this.kSh = (paramFloat1 / 1000.0F);
    this.kSi = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public final c al(float paramFloat)
  {
    this.kSj = (paramFloat / 1000000.0F);
    this.kSk = 0.0F;
    return this;
  }
  
  public final c am(float paramFloat)
  {
    this.kSl = (paramFloat / 1000000.0F);
    this.kSm = 0.0F;
    return this;
  }
  
  public final c bbb()
  {
    this.kSr = 180;
    this.kSs = 180;
    return this;
  }
  
  public final c bbc()
  {
    this.kSv = 3.6E-4F;
    this.kSw = 1.8E-4F;
    return this;
  }
  
  public final c bbd()
  {
    this.kSx = Float.valueOf(0.36F);
    this.kSy = Float.valueOf(0.0F);
    return this;
  }
  
  public final void bbe()
  {
    if (this.gGc != null) {
      this.gGc.cancel();
    }
    this.kRV.bbe();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/particles/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */