package com.tencent.mm.plugin.sns.abtest;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import com.tencent.mm.model.a.e;
import com.tencent.mm.model.a.f;
import com.tencent.mm.model.a.g;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Set;

public final class c
{
  private static String nhW = "0";
  private static Set<Long> nhX = new HashSet();
  private static View.OnClickListener nhY;
  private static boolean nhl = false;
  private static com.tencent.mm.sdk.b.c nhu = new c.1();
  
  public static void b(View paramView, a.c paramc)
  {
    if (nhl)
    {
      paramc.ojp = false;
      paramc.ojn = ((ViewStub)paramView.findViewById(i.f.sns_post_hate_stub));
      paramc.ojn.setVisibility(8);
    }
  }
  
  public static void bwI()
  {
    if (g.IW().iP("6") != null)
    {
      nhW = g.IW().iP("6").value;
      x.d("MicroMsg.SellerABTestManager", "startABTest, value:%s", new Object[] { nhW });
      nhl = true;
      a.sFg.b(nhu);
      nhY = new c.2();
    }
  }
  
  public static void bwJ()
  {
    nhY = null;
    a.sFg.c(nhu);
    if (nhl)
    {
      g.IW().iP("6").dDS = 2L;
      g.IW().iP("6").result = nhX.size();
      f.a(g.IW().iP("6"));
      x.d("MicroMsg.SellerABTestManager", "endABTestWhenExitTimeline, scene:%d, result:%s", new Object[] { Integer.valueOf(2), nhX.size() });
    }
    nhW = "0";
    nhl = false;
    nhX.clear();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/abtest/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */