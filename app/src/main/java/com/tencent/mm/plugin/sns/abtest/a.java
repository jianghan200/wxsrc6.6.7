package com.tencent.mm.plugin.sns.abtest;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.mm.model.a.e;
import com.tencent.mm.model.a.f;
import com.tencent.mm.model.a.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.SnsNotInterestUI;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  private static Context context = null;
  private static boolean nhl = false;
  private static String nhm = "0";
  private static View.OnClickListener nhn = null;
  private static int nho = -1;
  private static int nhp = -1;
  private static long nhq = 0L;
  private static View nhr = null;
  private static b nhs = null;
  private static NotInterestMenu.c nht = null;
  private static com.tencent.mm.sdk.b.c nhu = new a.1();
  private static com.tencent.mm.sdk.b.c nhv = new a.2();
  
  public static void a(Context paramContext, n paramn)
  {
    int i = 2;
    Intent localIntent;
    if ((nhl) && (paramn != null) && (paramContext != null))
    {
      nhq = paramn.field_snsId;
      a(paramn);
      localIntent = new Intent(paramContext, SnsNotInterestUI.class);
      localIntent.putExtra("sns_info_svr_id", nhq);
      if ((!nhl) || (bi.oW(nhm))) {
        break label145;
      }
      if ((!nhm.equals("1")) && (!nhm.equals("2"))) {
        break label101;
      }
      i = 1;
    }
    for (;;)
    {
      localIntent.putExtra("sns_info_not_interest_scene", i);
      paramContext.startActivity(localIntent);
      return;
      label101:
      if (nhm.equals("3"))
      {
        if (i.f(paramn)) {
          i = 4;
        } else if (paramn.field_type == 1) {
          i = 3;
        } else if (paramn.field_type == 2) {}
      }
      else {
        label145:
        i = 0;
      }
    }
  }
  
  public static void a(ContextMenu paramContextMenu, n paramn)
  {
    if ((nhl) && (nhm.equals("3")) && (paramn != null) && (!paramn.xb(32)) && (!paramn.field_userName.equals(af.bxU())) && (paramn.field_type != 15)) {
      paramContextMenu.add(0, 13, 0, i.j.sns_hate_op_un_like);
    }
  }
  
  public static void a(View paramView, a.c paramc)
  {
    if ((nhl) && (!bi.oW(nhm)) && (!nhm.equals("0")))
    {
      paramc.ojD = ((ImageView)paramView.findViewById(i.f.sns_hate_item_arrow));
      paramc.ojD.setVisibility(8);
      paramc.ojE = false;
      if (!nhm.equals("3")) {
        paramc.ojD.setOnClickListener(nhn);
      }
    }
  }
  
  private static void a(n paramn)
  {
    boolean bool = nhm.equals("3");
    if (paramn.field_type == 1) {
      if (bool) {
        nhp = 5;
      }
    }
    do
    {
      do
      {
        return;
        nhp = 0;
        return;
        if (paramn.field_type == 2)
        {
          if (bool)
          {
            nhp = 4;
            return;
          }
          nhp = 1;
          return;
        }
        if (paramn.field_type != 15) {
          break;
        }
      } while (bool);
      nhp = 2;
      return;
    } while (!i.f(paramn));
    if (bool)
    {
      nhp = 6;
      return;
    }
    nhp = 3;
  }
  
  public static void b(n paramn)
  {
    if (nhl)
    {
      nhq = paramn.field_snsId;
      a(paramn);
    }
  }
  
  public static void bwC()
  {
    if (nhs != null) {
      nhs.bwH();
    }
  }
  
  public static void clean()
  {
    nhp = -1;
    nho = -1;
    nhq = 0L;
    nhn = null;
    nht = null;
    nhr = null;
    context = null;
    nhl = false;
    nhm = "0";
    f.iU("7");
    com.tencent.mm.sdk.b.a.sFg.c(nhu);
    com.tencent.mm.sdk.b.a.sFg.c(nhv);
  }
  
  public static void d(Context paramContext, ViewGroup paramViewGroup)
  {
    if (g.IW().iP("7") != null)
    {
      nhl = true;
      nhm = g.IW().iP("7").value;
      x.d("MicroMsg.NotInteresetABTestManager", "start not interest abtest, testStyle:%s", new Object[] { nhm });
      nhr = paramViewGroup;
      nhs = new b(paramViewGroup);
      context = paramContext;
      com.tencent.mm.sdk.b.a.sFg.b(nhu);
      com.tencent.mm.sdk.b.a.sFg.b(nhv);
      nhn = new a.3();
      nht = new a.4();
      nhs.nhy = nht;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/abtest/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */