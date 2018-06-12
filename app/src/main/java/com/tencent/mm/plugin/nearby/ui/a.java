package com.tencent.mm.plugin.nearby.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Message;
import android.view.View;
import android.widget.CheckBox;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bl;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bb;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.r;
import java.util.Timer;
import java.util.TimerTask;
import junit.framework.Assert;

public final class a
  implements e, com.tencent.mm.pluginsdk.b.a, m.b
{
  private static boolean lBG = true;
  private Context context;
  private f eOE;
  private ab guS;
  private com.tencent.mm.plugin.nearby.a.c lBD;
  private View lBE;
  private CheckBox lBF;
  private com.tencent.mm.ui.widget.a.c lBH = null;
  private p tipDialog;
  
  public a(Context paramContext)
  {
    this.context = paramContext;
    this.lBE = View.inflate(paramContext, R.i.lbs_open_dialog_view, null);
    this.lBF = ((CheckBox)this.lBE.findViewById(R.h.lbs_open_dialog_cb));
    this.lBF.setChecked(false);
    au.DF().a(148, this);
  }
  
  private void auv()
  {
    boolean bool3 = true;
    Object localObject;
    int i;
    label66:
    boolean bool2;
    if ((q.GQ() & 0x200) == 0)
    {
      bool1 = true;
      localObject = (HelperHeaderPreference)this.eOE.ZZ("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).an(this.guS.field_username, this.guS.BL(), this.context.getString(R.l.contact_info_lbs_tip));
      if (!bool1) {
        break label157;
      }
      i = 1;
      ((HelperHeaderPreference)localObject).nw(i);
      this.eOE.bw("contact_info_lbs_install", bool1);
      localObject = this.eOE;
      if (bool1) {
        break label162;
      }
      bool2 = true;
      label96:
      ((f)localObject).bw("contact_info_lbs_go_lbs", bool2);
      localObject = this.eOE;
      if (bool1) {
        break label167;
      }
      bool2 = true;
      label118:
      ((f)localObject).bw("contact_info_lbs_clear_info", bool2);
      localObject = this.eOE;
      if (bool1) {
        break label172;
      }
    }
    label157:
    label162:
    label167:
    label172:
    for (boolean bool1 = bool3;; bool1 = false)
    {
      ((f)localObject).bw("contact_info_lbs_uninstall", bool1);
      return;
      bool1 = false;
      break;
      i = 0;
      break label66;
      bool2 = false;
      break label96;
      bool2 = false;
      break label118;
    }
  }
  
  public static void m(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (final Object localObject = paramContext.getString(R.l.settings_plugins_installing);; localObject = paramContext.getString(R.l.settings_plugins_uninstalling))
    {
      lBG = paramBoolean;
      paramContext.getString(R.l.app_tip);
      paramContext = h.a(paramContext, (String)localObject, true, null);
      localObject = new ag()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          int i = q.GQ();
          if (this.hlD) {
            i &= 0xFDFF;
          }
          for (;;)
          {
            au.HU();
            com.tencent.mm.model.c.DT().set(34, Integer.valueOf(i));
            au.HU();
            com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.l("", "", "", "", "", "", "", "", i, "", ""));
            if (!this.hlD)
            {
              com.tencent.mm.az.d.SG().aPm();
              au.DF().a(new com.tencent.mm.plugin.nearby.a.c(2, 0.0F, 0.0F, 0, 0, "", ""), 0);
            }
            if (this.hlE != null) {
              this.hlE.a(null, null);
            }
            return;
            i |= 0x200;
          }
        }
      };
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          if (this.hlF != null)
          {
            this.hlF.dismiss();
            localObject.sendEmptyMessage(0);
          }
        }
      }, 1500L);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((this.lBD == null) && (((com.tencent.mm.plugin.nearby.a.c)paraml).Oh() == 2)) {}
    for (;;)
    {
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactWidgetLBS", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
      if (paraml.getType() == 148)
      {
        if (this.tipDialog != null)
        {
          this.tipDialog.dismiss();
          this.tipDialog = null;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0)) {}
        for (paramInt1 = R.l.nearby_friend_clear_location_ok; (((com.tencent.mm.plugin.nearby.a.c)paraml).Oh() == 2) && (lBG); paramInt1 = R.l.nearby_friend_clear_location_failed)
        {
          h.a(this.context, paramInt1, R.l.app_tip, new a.8(this));
          this.lBD = null;
          return;
        }
      }
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    int i = bi.p(paramObject, 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetLBS", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    au.HU();
    if ((paramm != com.tencent.mm.model.c.DT()) || (i <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetLBS", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
    }
    while ((i != 40) && (i != 34) && (i != 7)) {
      return;
    }
    auv();
  }
  
  public final boolean a(f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    if (paramf != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramab != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(s.hs(paramab.field_username));
      au.HU();
      com.tencent.mm.model.c.DT().a(this);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.ContactWidgetLBS", "listener added");
      this.guS = paramab;
      this.eOE = paramf;
      lBG = true;
      paramf.addPreferencesFromResource(R.o.contact_info_pref_lbs);
      auv();
      return true;
    }
  }
  
  public final boolean auw()
  {
    au.HU();
    com.tencent.mm.model.c.DT().b(this);
    au.DF().b(148, this);
    com.tencent.mm.plugin.nearby.a.ezo.vl();
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final boolean wX(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetLBS", "handleEvent : key = " + paramString);
    if (bi.oV(paramString).length() <= 0) {
      return false;
    }
    if (paramString.equals("contact_info_lbs_go_lbs"))
    {
      au.HU();
      paramString = (Boolean)com.tencent.mm.model.c.DT().get(4103, null);
      if ((paramString == null) || (!paramString.booleanValue())) {
        com.tencent.mm.bg.d.A(this.context, "nearby", ".ui.NearbyFriendsIntroUI");
      }
      for (;;)
      {
        return true;
        paramString = bl.ID();
        if (paramString == null)
        {
          com.tencent.mm.bg.d.A(this.context, "nearby", ".ui.NearbyPersonalInfoUI");
        }
        else
        {
          String str1 = bi.oV(paramString.getProvince());
          String str2 = bi.oV(paramString.getCity());
          int i = paramString.sex;
          if ((str1.equals("")) || (str2.equals("")) || (i == 0))
          {
            com.tencent.mm.bg.d.A(this.context, "nearby", ".ui.NearbyPersonalInfoUI");
          }
          else
          {
            au.HU();
            paramString = (Boolean)com.tencent.mm.model.c.DT().get(4104, null);
            if ((paramString == null) || (!paramString.booleanValue()))
            {
              com.tencent.mm.be.a.eF(this.context);
              ((Activity)this.context).finish();
            }
            else if (this.lBH == null)
            {
              this.lBH = h.a(this.context, this.context.getString(R.l.app_tip), this.lBE, new DialogInterface.OnClickListener()new a.3
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  au.HU();
                  paramAnonymousDialogInterface = com.tencent.mm.model.c.DT();
                  if (!a.b(a.this).isChecked()) {}
                  for (boolean bool = true;; bool = false)
                  {
                    paramAnonymousDialogInterface.set(4104, Boolean.valueOf(bool));
                    com.tencent.mm.be.a.eF(a.a(a.this));
                    ((Activity)a.a(a.this)).finish();
                    return;
                  }
                }
              }, new a.3(this));
            }
            else
            {
              this.lBH.show();
            }
          }
        }
      }
    }
    if (paramString.equals("contact_info_lbs_install"))
    {
      m(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_lbs_clear_info"))
    {
      h.a(this.context, R.l.nearby_friend_clear_location_exit_hint, R.l.nearby_friend_clear_location_exit, new DialogInterface.OnClickListener()new a.5
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          a.a(a.this, new com.tencent.mm.plugin.nearby.a.c(2, 0.0F, 0.0F, 0, 0, "", ""));
          au.DF().a(a.c(a.this), 0);
          paramAnonymousDialogInterface = a.this;
          Context localContext = a.a(a.this);
          a.a(a.this).getString(R.l.app_tip);
          a.a(paramAnonymousDialogInterface, h.a(localContext, a.a(a.this).getString(R.l.nearby_friend_clearing_location), true, new a.4.1(this)));
        }
      }, new a.5(this));
      return true;
    }
    if (paramString.equals("contact_info_lbs_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.settings_plugins_uninstall_hint), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new a.1(this), null);
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetLBS", "handleEvent : unExpected key = " + paramString);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/nearby/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */