package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.Spannable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.y;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.sdk.f.e;
import java.util.concurrent.CountDownLatch;

public final class ab
  extends a
{
  private static final int nFX = Color.parseColor("#26eae9e2");
  private CountDownLatch iyu;
  private RadarChart nFY;
  private Bitmap nFZ;
  private Bitmap nGa;
  
  public ab(Context paramContext, y paramy, ViewGroup paramViewGroup)
  {
    super(paramContext, paramy, paramViewGroup);
  }
  
  private static void a(Spannable paramSpannable, int paramInt1, int paramInt2, Object... paramVarArgs)
  {
    int i = 0;
    while (i < 2)
    {
      paramSpannable.setSpan(paramVarArgs[i], paramInt1, paramInt2, 18);
      i += 1;
    }
  }
  
  public final View bzM()
  {
    this.nFY = ((RadarChart)this.contentView.findViewById(i.f.chart));
    return this.contentView;
  }
  
  protected final void bzQ()
  {
    this.iyu = new CountDownLatch(2);
    e.b(new ab.1(this), "AdlandingRadarComp").start();
    y localy = (y)bzL();
    if (localy != null)
    {
      d.a(localy.nBB, localy.nAX, new ab.2(this));
      d.a(localy.nBH, localy.nAX, new ab.3(this));
      return;
    }
    Log.wtf("AdlandingRadarChartComp", "null info");
  }
  
  protected final int getLayout()
  {
    return i.g.sns_ad_native_landing_comp_radarchart;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */