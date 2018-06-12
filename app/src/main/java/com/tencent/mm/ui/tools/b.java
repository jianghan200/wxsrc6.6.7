package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.f;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.a.eq;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.af;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bd.a;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

public final class b
{
  private static boolean isDeleteCancel = false;
  private static p tipDialog = null;
  
  public static void a(d paramd, Activity paramActivity, ab paramab, int paramInt)
  {
    a(paramd, paramActivity, paramab, false, null, paramInt);
  }
  
  public static void a(d paramd, Activity paramActivity, ab paramab, boolean paramBoolean, int paramInt)
  {
    boolean bool2 = true;
    if ((paramd == null) || (paramActivity == null) || (paramab == null))
    {
      boolean bool1;
      if (paramd == null)
      {
        paramBoolean = true;
        if (paramActivity != null) {
          break label72;
        }
        bool1 = true;
        label28:
        if (paramab != null) {
          break label78;
        }
      }
      for (;;)
      {
        x.e("MicroMsg.BizContactDeleteUtil", "error args, %b, %b, %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        return;
        paramBoolean = false;
        break;
        label72:
        bool1 = false;
        break label28;
        label78:
        bool2 = false;
      }
    }
    String str = paramab.field_username;
    paramab.Bc();
    au.HU();
    com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.c(str, paramInt));
    if (s.hc(str))
    {
      au.HU();
      com.tencent.mm.model.c.FR().Ym(str);
      au.HU();
      com.tencent.mm.model.c.Ga().in(str);
    }
    label431:
    for (;;)
    {
      if (com.tencent.mm.app.plugin.a.a.a(paramd))
      {
        paramd = new eq();
        paramd.bMu.bKC = str;
        com.tencent.mm.sdk.b.a.sFg.m(paramd);
      }
      paramd = z.MX();
      if (!bi.oW(str)) {
        x.i("MicroMsg.BizKFStorage", "deleteKFWorker by brand username(u:%s, r:%d).", new Object[] { str, Integer.valueOf(paramd.diF.delete("BizKF", "brandUsername = ?", new String[] { str })) });
      }
      z.Ne().Gy(str);
      z.Nf().Gy(str);
      if (!paramBoolean) {
        break;
      }
      if (paramActivity.getIntent().getIntExtra("Kdel_from", -1) == 0)
      {
        paramd = new Intent(paramActivity, LauncherUI.class);
        paramd.addFlags(67108864);
        paramActivity.startActivity(paramd);
      }
      paramActivity.finish();
      return;
      isDeleteCancel = false;
      paramActivity.getString(R.l.app_tip);
      tipDialog = h.a(paramActivity, paramActivity.getString(R.l.app_waiting), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          b.Ju();
        }
      });
      bd.a local3 = new bd.a()
      {
        public final void Io()
        {
          z.MY().delete(this.lXC);
          if (b.czB() != null)
          {
            b.czB().dismiss();
            b.czC();
          }
        }
        
        public final boolean Ip()
        {
          return b.yT();
        }
      };
      au.HU();
      com.tencent.mm.model.c.FR().a(str, paramab);
      if (paramd.LY()) {
        f.kP(paramd.field_username);
      }
      for (;;)
      {
        if ((paramActivity == null) || (!paramBoolean)) {
          break label431;
        }
        paramActivity.setResult(-1, paramActivity.getIntent().putExtra("_delete_ok_", true));
        break;
        bd.a(str, local3);
        au.HU();
        com.tencent.mm.model.c.FW().Yp(str);
      }
    }
  }
  
  public static void a(d paramd, Activity paramActivity, ab paramab, boolean paramBoolean, Runnable paramRunnable, int paramInt)
  {
    if ((paramd == null) || (paramActivity == null) || (paramab == null))
    {
      boolean bool1;
      if (paramd == null)
      {
        paramBoolean = true;
        if (paramActivity != null) {
          break label73;
        }
        bool1 = true;
        label25:
        if (paramab != null) {
          break label79;
        }
      }
      label73:
      label79:
      for (boolean bool2 = true;; bool2 = false)
      {
        x.e("MicroMsg.BizContactDeleteUtil", "bizInfo null : %s, context null : %s, ct null : %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        return;
        paramBoolean = false;
        break;
        bool1 = false;
        break label25;
      }
    }
    if (paramd.LZ()) {}
    for (String str = paramActivity.getString(R.l.brandservice_remove_enterprise_tips);; str = paramActivity.getString(R.l.brandservice_remove_subscribe_tips, new Object[] { paramab.BL() }))
    {
      h.a(paramActivity, str, "", paramActivity.getString(R.l.contact_info_remove_biz_alert_sure), paramActivity.getString(R.l.app_cancel), new b.1(paramd, paramActivity, paramab, paramBoolean, paramInt, paramRunnable), null);
      return;
    }
  }
  
  public static void c(d paramd, Activity paramActivity, ab paramab)
  {
    a(paramd, paramActivity, paramab, false, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/tools/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */