package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.plugin.qqmail.b.n;
import com.tencent.mm.plugin.qqmail.b.w;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;
import junit.framework.Assert;

public final class a
  implements e, com.tencent.mm.pluginsdk.b.a, m.b
{
  private static boolean mfX = false;
  private boolean bKe;
  private Context context;
  private ProgressDialog dId;
  private ProgressDialog eHw;
  private f eOE;
  private ab guS;
  private boolean lUD;
  private boolean mfW;
  
  public a(Context paramContext)
  {
    if (paramContext != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.context = paramContext;
      return;
    }
  }
  
  private void auv()
  {
    boolean bool2 = true;
    label42:
    Object localObject;
    int i;
    if ((q.GQ() & 0x1) == 0)
    {
      bool1 = true;
      this.bKe = bool1;
      au.HU();
      if (bi.f((Integer)c.DT().get(17, null)) != 1) {
        break label328;
      }
      bool1 = true;
      this.mfW = bool1;
      localObject = (HelperHeaderPreference)this.eOE.ZZ("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).an(this.guS.field_username, this.guS.BL(), this.context.getString(R.l.contact_info_qqmailhelper_tip));
      if (!this.bKe) {
        break label333;
      }
      i = 1;
      label104:
      ((HelperHeaderPreference)localObject).nw(i);
      this.eOE.bw("contact_info_qqmailhelper_install", this.bKe);
      localObject = this.eOE;
      if (this.bKe) {
        break label338;
      }
      bool1 = true;
      label140:
      ((f)localObject).bw("contact_info_qqmailhelper_view", bool1);
      localObject = this.eOE;
      if (this.bKe) {
        break label343;
      }
      bool1 = true;
      label165:
      ((f)localObject).bw("contact_info_qqmailhelper_compose", bool1);
      localObject = (CheckBoxPreference)this.eOE.ZZ("contact_info_qqmailhelper_recv_remind");
      if (localObject != null) {
        ((CheckBoxPreference)localObject).qpJ = this.mfW;
      }
      localObject = this.eOE;
      if (this.bKe) {
        break label348;
      }
      bool1 = true;
      label220:
      ((f)localObject).bw("contact_info_qqmailhelper_recv_remind", bool1);
      localObject = this.eOE;
      if ((this.bKe & this.mfW)) {
        break label353;
      }
      bool1 = true;
      label250:
      ((f)localObject).bw("contact_info_qqmailhelper_set_files_view", bool1);
      this.eOE.bw("contact_info_qqmailhelper_download_mgr_view", true);
      localObject = this.eOE;
      if (this.bKe) {
        break label358;
      }
      bool1 = true;
      label287:
      ((f)localObject).bw("contact_info_qqmailhelper_clear_data", bool1);
      localObject = this.eOE;
      if (this.bKe) {
        break label363;
      }
    }
    label328:
    label333:
    label338:
    label343:
    label348:
    label353:
    label358:
    label363:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      ((f)localObject).bw("contact_info_qqmailhelper_uninstall", bool1);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label42;
      i = 0;
      break label104;
      bool1 = false;
      break label140;
      bool1 = false;
      break label165;
      bool1 = false;
      break label220;
      bool1 = false;
      break label250;
      bool1 = false;
      break label287;
    }
  }
  
  private void hh(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (String str = this.context.getString(R.l.settings_plugins_installing);; str = this.context.getString(R.l.settings_plugins_uninstalling))
    {
      Context localContext = this.context;
      this.context.getString(R.l.app_tip);
      this.dId = h.a(localContext, str, true, null);
      mfX = true;
      hi(paramBoolean);
      return;
    }
  }
  
  private boolean hi(boolean paramBoolean)
  {
    n localn = new n(paramBoolean, "");
    if (!mfX) {
      this.eHw = h.a(this.context, this.context.getString(R.l.app_waiting), true, new a.4(this, localn));
    }
    au.DF().a(localn, 0);
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if (paraml.getType() != 24)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ContactWidgetQQMail", "onSceneEnd : unExpected type = " + paraml.getType());
      return;
    }
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if (this.dId != null)
    {
      this.dId.dismiss();
      this.dId = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      bool = ((n)paraml).ccZ;
      au.HU();
      paramString = c.DT();
      if (bool)
      {
        paramInt1 = 1;
        paramString.set(17, Integer.valueOf(paramInt1));
        if ((mfX) && (bi.ci(this.context)))
        {
          if (bool)
          {
            au.HU();
            c.DT().set(17, Integer.valueOf(1));
          }
          paramInt1 = q.GQ();
          if (!bool) {
            break label250;
          }
          paramInt1 &= 0xFFFFFFFE;
        }
      }
      for (;;)
      {
        au.HU();
        c.DT().set(34, Integer.valueOf(paramInt1));
        au.HU();
        c.FQ().b(new com.tencent.mm.aq.l("", "", "", "", "", "", "", "", paramInt1, "", ""));
        com.tencent.mm.plugin.qqmail.a.a.ezo.vl();
        if (!bool) {
          w.boy();
        }
        mfX = false;
        return;
        paramInt1 = 2;
        break;
        label250:
        paramInt1 |= 0x1;
      }
    }
    boolean bool = ((n)paraml).ccZ;
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetQQMail", "NetSceneSwitchPushMail fail : errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (paramInt1 == 4)
    {
      switch (paramInt2)
      {
      default: 
        return;
      case -31: 
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactWidgetQQMail", "need second pass");
        paramString = View.inflate(this.context, R.i.secondpass, null);
        paraml = (EditText)paramString.findViewById(R.h.secondpass_et);
        h.a(this.context, this.context.getString(R.l.contact_info_qqmailhelper_secondpass), paramString, new a.5(this, bool, paraml));
        return;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ContactWidgetQQMail", "onSceneEnd, sys err");
    }
    if (mfX)
    {
      paramString = this.context;
      if (bool) {
        paramInt1 = R.l.settings_plugins_install_fail;
      }
    }
    for (paramString = paramString.getString(paramInt1);; paramString = this.context.getString(R.l.app_err_server_busy_tip))
    {
      Toast.makeText(this.context, paramString, 1).show();
      mfX = false;
      return;
      paramInt1 = R.l.settings_plugins_uninstall_fail;
      break;
    }
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    int i = bi.p(paramObject, 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetQQMail", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    au.HU();
    if ((paramm != c.DT()) || (i <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetQQMail", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
    }
    while ((i != 17) && (i != 34) && (i != 7)) {
      return;
    }
    auv();
  }
  
  public final boolean a(f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    boolean bool2 = false;
    if (paramf != null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      bool1 = bool2;
      if (paramab != null) {
        bool1 = true;
      }
      Assert.assertTrue(bool1);
      Assert.assertTrue(s.hi(paramab.field_username));
      au.HU();
      c.DT().a(this);
      au.DF().a(24, this);
      this.lUD = paramBoolean;
      this.guS = paramab;
      this.eOE = paramf;
      paramf.addPreferencesFromResource(R.o.contact_info_pref_qqmail);
      auv();
      return true;
    }
  }
  
  public final boolean auw()
  {
    au.HU();
    c.DT().b(this);
    au.DF().b(24, this);
    if (this.dId != null)
    {
      this.dId.dismiss();
      this.dId = null;
    }
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final boolean wX(String paramString)
  {
    boolean bool1 = false;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetQQMail", "handleEvent : key = " + paramString);
    if (bi.oV(paramString).length() <= 0) {
      return false;
    }
    if (paramString.equals("contact_info_qqmailhelper_view"))
    {
      paramString = new Intent();
      if (this.lUD)
      {
        paramString.putExtra("Chat_User", this.guS.field_username);
        paramString.putExtra("Chat_Mode", 1);
        paramString.addFlags(67108864);
        ((Activity)this.context).setResult(-1, paramString);
      }
      for (;;)
      {
        ((Activity)this.context).finish();
        return true;
        paramString.putExtra("Chat_User", this.guS.field_username);
        paramString.putExtra("Chat_Mode", 1);
        paramString.addFlags(67108864);
        com.tencent.mm.plugin.qqmail.a.a.ezn.e(paramString, this.context);
      }
    }
    if (paramString.equals("contact_info_qqmailhelper_compose"))
    {
      paramString = new Intent(this.context, ComposeUI.class);
      if (this.lUD)
      {
        paramString.putExtra("Chat_User", this.guS.field_username);
        paramString.addFlags(67108864);
        ((Activity)this.context).setResult(-1, paramString);
      }
      for (;;)
      {
        ((Activity)this.context).finish();
        return true;
        paramString.putExtra("Chat_User", this.guS.field_username);
        paramString.addFlags(67108864);
        this.context.startActivity(paramString);
      }
    }
    if (paramString.equals("contact_info_qqmailhelper_set_files_view"))
    {
      au.HU();
      paramString = new Intent("android.intent.action.VIEW", Uri.parse(bi.oV((String)c.DT().get(29, null))));
      paramString.putExtra("title", this.context.getString(R.l.contact_info_qqmailhelper_set_files_view));
      paramString.putExtra("zoom", false);
      paramString.putExtra("show_bottom", false);
      paramString.putExtra("showShare", false);
      paramString.putExtra("vertical_scroll", false);
      com.tencent.mm.plugin.qqmail.a.a.ezn.j(paramString, this.context);
      return true;
    }
    if (paramString.equals("contact_info_qqmailhelper_recv_remind"))
    {
      paramString = (CheckBoxPreference)this.eOE.ZZ(paramString);
      boolean bool2 = paramString.isChecked();
      hi(bool2);
      if (!bool2) {
        bool1 = true;
      }
      paramString.qpJ = bool1;
      return true;
    }
    if (paramString.equals("contact_info_qqmailhelper_clear_data"))
    {
      h.a(this.context, this.context.getString(R.l.contact_info_clear_data_wording), "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
      }, null);
      return true;
    }
    if (paramString.equals("contact_info_qqmailhelper_install"))
    {
      au.HU();
      if (bi.f((Integer)c.DT().get(9, null)) == 0)
      {
        h.b(this.context, R.l.settings_weibo_notice, R.l.app_tip, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            com.tencent.mm.plugin.qqmail.a.a.ezn.h(null, a.a(a.this));
          }
        }, null);
        return true;
      }
      hh(true);
      return true;
    }
    if (paramString.equals("contact_info_qqmailhelper_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.settings_plugins_uninstall_hint), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new a.3(this), null);
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetQQMail", "handleEvent : unExpected key = " + paramString);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */