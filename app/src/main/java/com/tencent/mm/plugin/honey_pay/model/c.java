package com.tencent.mm.plugin.honey_pay.model;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.mm.g.a.ri;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.protocal.c.alr;
import com.tencent.mm.protocal.c.asp;
import com.tencent.mm.protocal.c.bhw;
import com.tencent.mm.protocal.c.btd;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public final class c
{
  private static String kjP = com.tencent.mm.compatible.util.e.bnE + "wallet";
  
  public static void EF(String paramString)
  {
    Object localObject = new sz();
    ((sz)localObject).cdR.scene = 8;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    x.i("MicroMsg.HoneyPayUtil", "trigger offline event");
    localObject = new ri();
    ((ri)localObject).ccb.ccc = false;
    ((ri)localObject).ccb.scene = 1;
    ((ri)localObject).ccb.ccd = true;
    ((ri)localObject).ccb.cce = 65281;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    if (!bi.oW(paramString)) {
      com.tencent.mm.plugin.offline.c.a.Ja(paramString);
    }
  }
  
  public static void R(String paramString1, String paramString2, String paramString3)
  {
    k(paramString1, paramString2, paramString3, null);
  }
  
  public static void S(String paramString1, String paramString2, String paramString3)
  {
    x.i("MicroMsg.HoneyPayUtil", "insert sys msg: %s, %s", new Object[] { paramString1, Boolean.valueOf(bi.oW(paramString2)) });
    if ((!bi.oW(paramString2)) && (!bi.oW(paramString1)))
    {
      paramString2 = x(x(paramString2, paramString1, -1), paramString3, -1);
      paramString3 = new com.tencent.mm.storage.bd();
      paramString3.eX(0);
      paramString3.ep(paramString1);
      paramString3.setStatus(3);
      paramString3.setContent(paramString2);
      paramString3.ay(com.tencent.mm.model.bd.o(paramString1, System.currentTimeMillis() / 1000L));
      paramString3.setType(10000);
      paramString3.fg(paramString3.field_flag | 0x8);
      long l = ((i)g.l(i.class)).bcY().T(paramString3);
      x.i("MicroMsg.HoneyPayUtil", "insert msgId: %s", new Object[] { Long.valueOf(l) });
      if (l <= 0L) {
        x.w("MicroMsg.HoneyPayUtil", "insert sys msg fail!");
      }
    }
  }
  
  public static void a(Context paramContext, asp paramasp, DialogInterface.OnClickListener paramOnClickListener)
  {
    h.a(paramContext, paramasp.bSc, "", paramasp.kRv, paramasp.kRu, false, paramOnClickListener, null);
  }
  
  public static void a(MMActivity paramMMActivity, Bundle paramBundle, alr paramalr)
  {
    RealnameGuideHelper localRealnameGuideHelper = new RealnameGuideHelper();
    localRealnameGuideHelper.a(paramalr.qYW, paramalr.kRt, paramalr.kRu, paramalr.kRv, paramalr.kRw, 0);
    paramBundle.putString("realname_verify_process_jump_plugin", "honey_pay");
    localRealnameGuideHelper.a(paramMMActivity, paramBundle, null, false);
  }
  
  public static void a(MMActivity paramMMActivity, bhw parambhw, int paramInt1, String paramString, int paramInt2, btd parambtd)
  {
    if ((parambhw != null) && (parambhw.siH != null) && (!parambhw.siH.isEmpty()))
    {
      paramString = new c.1(paramMMActivity, parambhw, paramString, parambtd, paramInt2);
      if (!bi.oW(parambhw.title)) {
        paramMMActivity.a(0, parambhw.title, a.c.white, paramString);
      }
    }
    else
    {
      return;
    }
    paramMMActivity.addIconOptionMenu(0, paramInt1, paramString);
  }
  
  public static void a(MMActivity paramMMActivity, bhw parambhw, String paramString, int paramInt, btd parambtd)
  {
    a(paramMMActivity, parambhw, a.h.actionbar_dark_icon_more, paramString, paramInt, parambtd);
  }
  
  public static int aWc()
  {
    return a.h.honey_pay_input_logo;
  }
  
  public static String dK(long paramLong)
  {
    return com.tencent.mm.wallet_core.ui.e.b(String.valueOf(paramLong), "100", RoundingMode.HALF_UP).toString();
  }
  
  public static String dL(long paramLong)
  {
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(1000L * paramLong));
  }
  
  public static String dn(String paramString1, String paramString2)
  {
    return x(paramString1, paramString2, -1);
  }
  
  public static void k(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    x.i("MicroMsg.HoneyPayUtil", "update msg: %s, %s", new Object[] { paramString1, Boolean.valueOf(bi.oW(paramString2)) });
    if ((!bi.oW(paramString2)) && (!bi.oW(paramString1)))
    {
      paramString2 = x(paramString2, paramString3, 6);
      if (bi.oW(paramString4)) {
        break label206;
      }
      paramString2 = x(paramString2, paramString4, 6);
    }
    label206:
    for (;;)
    {
      paramString3 = new a();
      paramString3.field_payMsgId = paramString1;
      com.tencent.mm.plugin.honey_pay.a.aWa().aWb().b(paramString3, new String[0]);
      if (paramString3.field_msgId > 0L)
      {
        x.i("MicroMsg.HoneyPayUtil", "find msg: %s", new Object[] { Long.valueOf(paramString3.field_msgId) });
        paramString1 = ((i)g.l(i.class)).bcY().dW(paramString3.field_msgId);
        if (paramString1.field_msgId > 0L)
        {
          paramString1.setContent(paramString2);
          ((i)g.l(i.class)).bcY().a(paramString1.field_msgId, paramString1);
        }
      }
      else
      {
        return;
      }
      x.w("MicroMsg.HoneyPayUtil", "can't find msg: %s, may be deleted", new Object[] { Long.valueOf(paramString3.field_msgId) });
      return;
    }
  }
  
  public static int rh(int paramInt)
  {
    int i = -1;
    if (paramInt == 1) {
      i = a.h.honey_pay_father_card_icon;
    }
    do
    {
      return i;
      if (paramInt == 2) {
        return a.h.honey_pay_mother_card_icon;
      }
    } while (paramInt != 3);
    return a.h.honey_pay_child_card_icon;
  }
  
  public static String x(String paramString1, String paramString2, int paramInt)
  {
    if (paramInt >= 0) {
      return paramString1.replace("$" + paramString2 + "$", com.tencent.mm.wallet_core.ui.e.dx(com.tencent.mm.wallet_core.ui.e.gT(paramString2), paramInt));
    }
    return paramString1.replace("$" + paramString2 + "$", com.tencent.mm.wallet_core.ui.e.gT(paramString2));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */