package com.tencent.mm.plugin.luckymoney.particles;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.tencent.mm.plugin.wxpay.a.d;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public final class a
{
  private static int kRL;
  private static int kRM;
  private static int kRN;
  private static int kRO;
  private static int kRP;
  private static int kRQ;
  public c kRR;
  
  public a(ViewGroup paramViewGroup)
  {
    if (kRL == 0)
    {
      paramViewGroup = paramViewGroup.getResources();
      kRL = paramViewGroup.getDimensionPixelSize(a.d.default_confetti_size);
      kRM = paramViewGroup.getDimensionPixelOffset(a.d.default_velocity_slow);
      kRN = paramViewGroup.getDimensionPixelOffset(a.d.default_velocity_normal);
      kRO = paramViewGroup.getDimensionPixelOffset(a.d.default_velocity_fast);
      kRP = paramViewGroup.getDimensionPixelOffset(a.d.default_velocity_very_fast);
      kRQ = paramViewGroup.getDimensionPixelOffset(a.d.default_explosion_radius);
    }
  }
  
  public static a a(ViewGroup paramViewGroup, b paramb)
  {
    a locala = new a(paramViewGroup);
    paramViewGroup = new c(paramViewGroup.getContext(), paramb, new d(paramViewGroup.getWidth() / 2, paramViewGroup.getHeight() + 400), paramViewGroup).I(0.0F, 800.0F).J(-2000.0F, 1250.0F).am(2000.0F);
    paramViewGroup.kSA = 3000.0F;
    paramViewGroup.kSB = 500.0F;
    paramViewGroup = paramViewGroup.bbb();
    paramViewGroup.kSd = e.bbf();
    locala.kRR = paramViewGroup.bbc().bbd();
    return locala;
  }
  
  public final c z(int paramInt, long paramLong)
  {
    c localc = this.kRR;
    localc.kRZ = 0;
    localc.kSa = paramLong;
    localc.kSb = (paramInt / 1000.0F);
    localc.kSc = (1.0F / localc.kSb);
    if (localc.gGc != null) {
      localc.gGc.cancel();
    }
    localc.kRY = 0L;
    Object localObject = localc.kRX.iterator();
    while (((Iterator)localObject).hasNext())
    {
      localc.kRW.add(((Iterator)localObject).next());
      ((Iterator)localObject).remove();
    }
    localObject = localc.kRV.getParent();
    if (localObject != null)
    {
      if (localObject != localc.kRU) {
        ((ViewGroup)localObject).removeView(localc.kRV);
      }
    }
    else {
      localc.kRU.addView(localc.kRV);
    }
    localc.kRV.terminated = false;
    localc.A(localc.kRZ, 0L);
    localc.gGc = ValueAnimator.ofInt(new int[] { 0 }).setDuration(Long.MAX_VALUE);
    localc.gGc.addUpdateListener(new c.2(localc));
    localc.gGc.start();
    return localc;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/particles/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */