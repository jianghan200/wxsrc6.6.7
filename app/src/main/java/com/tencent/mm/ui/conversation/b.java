package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.aq.d;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.wallet.e;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

public final class b
{
  public static void a(String paramString, Context paramContext, com.tencent.mm.storage.ai paramai, Runnable paramRunnable, boolean paramBoolean1, boolean paramBoolean2)
  {
    PBool localPBool = new PBool();
    Object localObject;
    if (s.fq(paramString))
    {
      paramai = null;
      au.HU();
      localObject = c.FT().GD(paramString);
      au.HU();
      c.FQ().b(new d(paramString, ((cm)localObject).field_msgSvrId));
      localPBool.value = false;
      paramContext.getString(R.l.app_tip);
      localObject = h.a(paramContext, paramContext.getString(R.l.app_waiting), true, new b.1(localPBool));
      if (!localPBool.value) {
        paramai = e.Uk(paramString);
      }
      if (!com.tencent.mm.platformtools.ai.oW(paramai))
      {
        ((ProgressDialog)localObject).dismiss();
        h.a(paramContext, false, paramContext.getString(R.l.wallet_chatting_del_conversation_note, new Object[] { paramai }), null, paramContext.getString(R.l.goto_conversation), paramContext.getString(R.l.del_conversation), new b.7(localPBool, paramContext, paramBoolean2, paramString, paramBoolean1), new b.8((ProgressDialog)localObject, localPBool, paramString, paramBoolean1, paramRunnable), -1, R.e.alert_btn_color_warn);
        if (!s.hm(paramString)) {
          break label731;
        }
        x.i("MicroMsg.ConvDelLogic", "del all qmessage");
        bd.Im();
        au.HU();
        c.FW().GL("@qqim");
      }
    }
    label731:
    while (!s.hk(paramString))
    {
      return;
      ((ProgressDialog)localObject).dismiss();
      h.a(paramContext, paramContext.getString(R.l.fmt_delconvmsg_confirm_group), "", paramContext.getString(R.l.app_delete), paramContext.getString(R.l.app_cancel), new b.9(paramString, localPBool, (ProgressDialog)localObject, paramRunnable), null, R.e.alert_btn_color_warn);
      break;
      if (s.hv(paramString))
      {
        au.HU();
        c.FW().GL(paramString);
        paramContext = new mk();
        paramContext.bXl.opType = 4;
        paramContext.bXl.bXq = 20;
        a.sFg.m(paramContext);
        break;
      }
      if (s.hl(paramString))
      {
        au.HU();
        c.FW().GL(paramString);
        break;
      }
      if (s.ho(paramString))
      {
        au.HU();
        c.FW().Yp(paramString);
        break;
      }
      if (com.tencent.mm.ac.f.eZ(paramString))
      {
        localPBool.value = false;
        paramContext.getString(R.l.app_tip);
        paramai = h.a(paramContext, paramContext.getString(R.l.app_waiting), true, new b.10(localPBool));
        paramai.dismiss();
        h.a(paramContext, paramContext.getString(R.l.fmt_delconvmsg_confirm), "", paramContext.getString(R.l.app_delete), paramContext.getString(R.l.app_cancel), new b.11(paramString, localPBool, paramai, paramString), null, R.e.alert_btn_color_warn);
        break;
      }
      au.HU();
      localObject = c.FT().GD(paramString);
      au.HU();
      c.FQ().b(new d(paramString, ((cm)localObject).field_msgSvrId));
      localPBool.value = false;
      paramContext.getString(R.l.app_tip);
      p localp = h.a(paramContext, paramContext.getString(R.l.app_waiting), true, new b.12(localPBool));
      localObject = null;
      if (!localPBool.value) {
        localObject = e.Uk(paramString);
      }
      if (!com.tencent.mm.platformtools.ai.oW((String)localObject))
      {
        localp.dismiss();
        h.a(paramContext, false, paramContext.getString(R.l.wallet_chatting_del_conversation_note, new Object[] { localObject }), null, paramContext.getString(R.l.goto_conversation), paramContext.getString(R.l.del_conversation), new b.13(localPBool, paramContext, paramBoolean2, paramString, paramBoolean1), new b.14(localp, localPBool, paramContext, paramString, paramai, paramRunnable, paramBoolean1), -1, R.e.alert_btn_color_warn);
        break;
      }
      localp.dismiss();
      if (s.hE(paramString)) {}
      for (int i = R.l.fmt_delconvmsg_confirm_biz;; i = R.l.fmt_delconvmsg_confirm)
      {
        h.a(paramContext, paramContext.getString(i), "", paramContext.getString(R.l.app_delete), paramContext.getString(R.l.app_cancel), new b.2(paramContext, paramString, paramai, localPBool, localp, paramRunnable), null, R.e.alert_btn_color_warn);
        break;
      }
    }
    x.i("MicroMsg.ConvDelLogic", "del all tmessage");
    bd.In();
    au.HU();
    c.FW().GL("@t.qq.com");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/conversation/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */