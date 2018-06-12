package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.al.b;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import junit.framework.Assert;

public final class e
  implements com.tencent.mm.pluginsdk.b.a
{
  Context context;
  private f eOE;
  private ab guS;
  boolean isDeleteCancel = false;
  private boolean lUD;
  private HelperHeaderPreference.a lVY;
  private int status;
  p tipDialog = null;
  
  public e(Context paramContext)
  {
    this.context = paramContext;
    this.lVY = new o(paramContext);
    this.status = -1;
  }
  
  private void b(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetFMessage", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.status |= paramInt1;
      au.HU();
      c.DT().set(7, Integer.valueOf(this.status));
      if (!paramBoolean) {
        break label115;
      }
    }
    label115:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      au.HU();
      c.FQ().b(new com.tencent.mm.aq.g(paramInt2, paramInt1));
      return;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }
  
  private boolean uL(int paramInt)
  {
    return (this.status & paramInt) != 0;
  }
  
  public final boolean a(f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    int i = 0;
    boolean bool;
    label22:
    CheckBoxPreference localCheckBoxPreference1;
    CheckBoxPreference localCheckBoxPreference2;
    CheckBoxPreference localCheckBoxPreference3;
    if (paramf != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramab == null) {
        break label354;
      }
      bool = true;
      Assert.assertTrue(bool);
      Assert.assertTrue(s.hj(paramab.field_username));
      this.eOE = paramf;
      this.lUD = paramBoolean;
      this.guS = paramab;
      if (this.status == -1) {
        this.status = q.GJ();
      }
      paramf.addPreferencesFromResource(R.o.contact_info_pref_fmessage);
      localCheckBoxPreference1 = (CheckBoxPreference)paramf.ZZ("contact_info_recommend_qqfriends_to_me");
      localCheckBoxPreference2 = (CheckBoxPreference)paramf.ZZ("contact_info_recommend_mobilefriends_to_me");
      localCheckBoxPreference3 = (CheckBoxPreference)paramf.ZZ("contact_info_recommend_fbfriends_to_me");
      if (uL(256)) {
        break label360;
      }
      paramBoolean = true;
      label127:
      localCheckBoxPreference2.qpJ = paramBoolean;
      if (uL(128)) {
        break label365;
      }
      paramBoolean = true;
      label145:
      localCheckBoxPreference1.qpJ = paramBoolean;
      if ((q.GL() & 0x4) == 0) {
        break label370;
      }
      paramBoolean = true;
      label161:
      localCheckBoxPreference3.qpJ = paramBoolean;
      ((HelperHeaderPreference)paramf.ZZ("contact_info_header_helper")).a(paramab, this.lVY);
      au.HU();
      if (bi.f((Integer)c.DT().get(9, null)) == 0) {
        break label375;
      }
      paramInt = 1;
      label211:
      if (paramInt == 0) {
        break label381;
      }
      paramf.c(paramf.ZZ("contact_info_bind_qq_entry"));
      paramf.c(paramf.ZZ("contact_info_bind_qq_entry_tip"));
      label246:
      if (com.tencent.mm.plugin.account.friend.a.l.XC() != l.a.eKt) {
        break label429;
      }
      paramInt = 1;
      label258:
      if (paramInt == 0) {
        break label435;
      }
      paramf.c(paramf.ZZ("contact_info_bind_mobile_entry"));
      paramf.c(paramf.ZZ("contact_info_bind_mobile_entry_tip"));
    }
    for (;;)
    {
      paramInt = i;
      if ((q.GQ() & 0x2000) == 0) {
        paramInt = 1;
      }
      if (paramInt == 0) {
        break label477;
      }
      paramBoolean = q.Hg();
      paramf.c(localCheckBoxPreference3);
      if (paramBoolean) {
        break label461;
      }
      paramf.ZZ("contact_info_bind_fb_entry").setSummary(R.l.settings_bind_qq_unbind);
      return true;
      bool = false;
      break;
      label354:
      bool = false;
      break label22;
      label360:
      paramBoolean = false;
      break label127;
      label365:
      paramBoolean = false;
      break label145;
      label370:
      paramBoolean = false;
      break label161;
      label375:
      paramInt = 0;
      break label211;
      label381:
      paramf.c(localCheckBoxPreference1);
      if (b.PB()) {
        break label246;
      }
      paramf.c(paramf.ZZ("contact_info_bind_qq_entry"));
      paramf.c(paramf.ZZ("contact_info_bind_qq_entry_tip"));
      break label246;
      label429:
      paramInt = 0;
      break label258;
      label435:
      paramf.c(localCheckBoxPreference2);
      paramf.ZZ("contact_info_bind_mobile_entry").setSummary(R.l.settings_bind_qq_unbind);
    }
    label461:
    paramf.ZZ("contact_info_bind_fb_entry").setSummary(R.l.contact_info_facebookapp_bind_success);
    return true;
    label477:
    paramf.c(paramf.ZZ("contact_info_bind_fb_entry"));
    paramf.c(paramf.ZZ("contact_info_bind_fb_entry_tip"));
    paramf.c(localCheckBoxPreference3);
    return true;
  }
  
  public final boolean auw()
  {
    com.tencent.mm.plugin.profile.a.ezo.vl();
    this.eOE.ZZ("contact_info_header_helper");
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final boolean wX(String paramString)
  {
    boolean bool = false;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetFMessage", "handlerEvent : key = " + paramString);
    if (bi.oV(paramString).length() <= 0) {
      return false;
    }
    if (paramString.equals("contact_info_recommend_qqfriends_to_me"))
    {
      if (!((CheckBoxPreference)this.eOE.ZZ("contact_info_recommend_qqfriends_to_me")).isChecked()) {}
      for (bool = true;; bool = false)
      {
        b(bool, 128, 6);
        return true;
      }
    }
    if (paramString.equals("contact_info_recommend_mobilefriends_to_me"))
    {
      if (!((CheckBoxPreference)this.eOE.ZZ("contact_info_recommend_mobilefriends_to_me")).isChecked()) {
        bool = true;
      }
      b(bool, 256, 7);
      return true;
    }
    if (paramString.equals("contact_info_recommend_fbfriends_to_me"))
    {
      bool = ((CheckBoxPreference)this.eOE.ZZ("contact_info_recommend_fbfriends_to_me")).isChecked();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetFMessage", "switch change : open = " + bool + " item value = 4 functionId = 18");
      int i = q.GL();
      if (bool)
      {
        i |= 0x4;
        au.HU();
        c.DT().set(40, Integer.valueOf(i));
        if (!bool) {
          break label247;
        }
      }
      label247:
      for (i = 1;; i = 2)
      {
        au.HU();
        c.FQ().b(new com.tencent.mm.aq.g(18, i));
        return true;
        i &= 0xFFFFFFFB;
        break;
      }
    }
    if (paramString.equals("contact_info_view_message"))
    {
      paramString = new Intent();
      if (this.lUD)
      {
        paramString.putExtra("Chat_User", this.guS.field_username);
        paramString.putExtra("Chat_Mode", 1);
        paramString.addFlags(67108864);
        ((Activity)this.context).setResult(-1, paramString);
        ((Activity)this.context).finish();
        return true;
      }
      paramString.putExtra("Chat_User", this.guS.field_username);
      paramString.putExtra("Chat_Mode", 1);
      paramString.addFlags(67108864);
      com.tencent.mm.plugin.profile.a.ezn.e(paramString, this.context);
      ((Activity)this.context).finish();
      return true;
    }
    if (paramString.equals("contact_info_bind_mobile_entry"))
    {
      com.tencent.mm.plugin.profile.a.ezn.g(new Intent(), this.context);
      return true;
    }
    if (paramString.equals("contact_info_bind_qq_entry"))
    {
      com.tencent.mm.plugin.profile.a.ezn.h(new Intent(), this.context);
      return true;
    }
    if (paramString.equals("contact_info_bind_fb_entry"))
    {
      d.b(this.context, "account", ".ui.FacebookAuthUI", new Intent());
      return true;
    }
    if (paramString.equals("contact_info_fmessage_clear_data"))
    {
      h.a(this.context, this.context.getString(R.l.contact_info_clear_data), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramAnonymousDialogInterface = e.this;
          paramAnonymousDialogInterface.isDeleteCancel = false;
          Context localContext = paramAnonymousDialogInterface.context;
          paramAnonymousDialogInterface.context.getString(R.l.app_tip);
          paramAnonymousDialogInterface.tipDialog = h.a(localContext, paramAnonymousDialogInterface.context.getString(R.l.app_waiting), true, new e.2(paramAnonymousDialogInterface));
          bd.a("fmessage", new e.3(paramAnonymousDialogInterface));
          au.HU();
          c.FW().Yp("fmessage");
        }
      }, null);
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetFMessage", "handleEvent : unExpected key = " + paramString);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */