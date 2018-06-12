package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.i;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.af;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.m;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.f;
import junit.framework.Assert;

public final class h
  implements com.tencent.mm.pluginsdk.b.a
{
  Context context;
  private int eLK;
  private f eOE;
  private String fsV;
  private ab guS;
  u hLB;
  private boolean lUD;
  private boolean lUE;
  private int lWd;
  ContactListExpandPreference lWe;
  
  public h(Context paramContext)
  {
    this.context = paramContext;
    this.lWe = new ContactListExpandPreference(paramContext, 0);
  }
  
  public final boolean a(f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    if (paramab != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bi.oV(paramab.field_username).length() <= 0) {
        break label353;
      }
      bool = true;
      label28:
      Assert.assertTrue(bool);
      if (paramf == null) {
        break label359;
      }
    }
    label353:
    label359:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.eOE = paramf;
      this.guS = paramab;
      this.lUD = paramBoolean;
      this.eLK = paramInt;
      this.lUE = ((Activity)this.context).getIntent().getBooleanExtra("User_Verify", false);
      this.lWd = ((Activity)this.context).getIntent().getIntExtra("Kdel_from", -1);
      this.fsV = paramab.field_username;
      au.HU();
      this.hLB = c.Ga().ii(this.fsV);
      this.eOE.removeAll();
      paramf = new PreferenceSmallCategory(this.context);
      this.eOE.a(paramf);
      this.lWe.setKey("roominfo_contact_anchor");
      this.eOE.a(this.lWe);
      paramf = new PreferenceCategory(this.context);
      this.eOE.a(paramf);
      paramf = new NormalUserFooterPreference(this.context);
      paramf.setLayoutResource(R.i.contact_info_footer_normal);
      paramf.setKey("contact_info_footer_normal");
      if (paramf.a(this.guS, "", this.lUD, this.lUE, false, this.eLK, this.lWd, false, false, 0L, "")) {
        this.eOE.a(paramf);
      }
      this.lWe.a(this.eOE, this.lWe.mKey);
      paramf = m.gI(this.fsV);
      this.lWe.kG(false).kH(false);
      this.lWe.p(this.fsV, paramf);
      this.lWe.a(new h.1(this));
      return true;
      bool = false;
      break;
      bool = false;
      break label28;
    }
  }
  
  public final boolean auw()
  {
    NormalUserFooterPreference localNormalUserFooterPreference = (NormalUserFooterPreference)this.eOE.ZZ("contact_info_footer_normal");
    if (localNormalUserFooterPreference != null) {
      localNormalUserFooterPreference.auw();
    }
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final boolean wX(String paramString)
  {
    x.d("MicroMsg.ContactWidgetGroupCard", "handleEvent " + paramString);
    au.HU();
    paramString = c.FR().Yg(paramString);
    if ((paramString == null) || ((int)paramString.dhP <= 0)) {
      return true;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(this.context, ContactInfoUI.class);
    localIntent.putExtra("Contact_User", paramString.field_username);
    this.context.startActivity(localIntent);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */