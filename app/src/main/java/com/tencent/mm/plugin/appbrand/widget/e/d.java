package com.tencent.mm.plugin.appbrand.widget.e;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;
import com.tencent.mm.plugin.appbrand.compat.a.b.q;
import com.tencent.mm.plugin.appbrand.compat.a.c;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  private LinkedList<c.h> fSK;
  b.h gMr;
  private b gMs;
  public AnimatorSet gMt;
  g gMu;
  
  public d(LinkedList<c.h> paramLinkedList, b.h paramh, b paramb)
  {
    this.fSK = paramLinkedList;
    this.gMr = paramh;
    this.gMs = paramb;
    init();
  }
  
  private ValueAnimator a(c.h paramh)
  {
    Object localObject = new b.f[2];
    localObject[0] = ((c)com.tencent.mm.kernel.g.l(c.class)).g(paramh.fTN, paramh.fTM);
    localObject[1] = ((c)com.tencent.mm.kernel.g.l(c.class)).g(paramh.latitude, paramh.longitude);
    f localf1 = this.gMu.c(localObject[0]);
    f localf2 = this.gMu.c(localObject[1]);
    double[] arrayOfDouble = new double[1];
    b.q localq = this.gMs.adx();
    int i = 0;
    double d = 0.0D;
    while (i <= 0)
    {
      arrayOfDouble[0] = localq.a(localObject[0], localObject[1]);
      d = arrayOfDouble[0] + 0.0D;
      i += 1;
    }
    localObject = new ValueAnimator();
    ((ValueAnimator)localObject).setDuration((paramh.duration * arrayOfDouble[0] / d));
    ((ValueAnimator)localObject).setInterpolator(new LinearInterpolator());
    ((ValueAnimator)localObject).setFloatValues(new float[] { (float)arrayOfDouble[0] });
    ((ValueAnimator)localObject).addUpdateListener(new d.1(this, localf1, localf2, arrayOfDouble));
    return (ValueAnimator)localObject;
  }
  
  private void init()
  {
    this.gMt = new AnimatorSet();
    this.gMu = new g();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.fSK.iterator();
    while (localIterator.hasNext())
    {
      c.h localh = (c.h)localIterator.next();
      if (localh.rotate != 0.0F)
      {
        ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { this.gMr.getRotation(), this.gMr.getRotation() + localh.rotate });
        localValueAnimator.setDuration(localh.duration);
        localValueAnimator.setInterpolator(new LinearInterpolator());
        localValueAnimator.addUpdateListener(new d.2(this));
        localArrayList.add(localValueAnimator);
      }
      else
      {
        localArrayList.add(a(localh));
      }
    }
    this.gMt.playSequentially(localArrayList);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */