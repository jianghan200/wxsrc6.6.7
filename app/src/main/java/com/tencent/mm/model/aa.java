package com.tencent.mm.model;

import android.content.Context;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.l.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;

public final class aa
{
  private c dBo;
  
  public aa(c paramc)
  {
    this.dBo = paramc;
  }
  
  static int a(boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    int i = 3;
    ab localab2 = c.FR().Yg(paramString);
    ab localab1 = localab2;
    if (localab2 == null) {
      localab1 = new ab();
    }
    if ((int)localab1.dhP == 0)
    {
      localab1.setUsername(paramString);
      localab1.Bb();
      x(localab1);
      if (paramBoolean2) {
        i = 4;
      }
      localab1.eI(i);
      localab1.Bk();
      c.FR().T(localab1);
      i = 1;
    }
    while (!paramBoolean1) {
      return i;
    }
    localab1.Bk();
    c.FR().a(paramString, localab1);
    return 2;
  }
  
  public static void w(ab paramab)
  {
    ab localab = paramab;
    if (paramab == null) {
      localab = new ab();
    }
    if ((int)localab.dhP == 0)
    {
      localab.setUsername("filehelper");
      au.HU();
      if (c.FW().Yq(localab.field_username) != null) {
        break label71;
      }
      localab.Bc();
    }
    for (;;)
    {
      localab.eI(3);
      au.HU();
      c.FR().S(localab);
      return;
      label71:
      localab.Bb();
    }
  }
  
  static void x(ab paramab)
  {
    String str = paramab.field_username;
    Context localContext = ad.getContext();
    if (str.equals("qqsync"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_qqsync_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_qqsync_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_qqsync_quanpin));
    }
    if (str.equals("floatbottle"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_bottle_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_bottle_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_bottle_quanpin));
    }
    if (str.equals("shakeapp"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_shake_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_shake_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_shake_quanpin));
    }
    if (str.equals("lbsapp"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_lbs_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_lbs_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_lbs_quanpin));
    }
    if (str.equals("medianote"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_medianote_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_medianote_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_medianote_quanpin));
    }
    if (str.equals("newsapp"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_readerappnews_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_readerappnews_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_readerappnews_quanpin));
    }
    if (str.equals("facebookapp"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_facebookapp_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_facebookapp_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_facebookapp_quanpin));
    }
    if (str.equals("qqfriend"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_qqfriend_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_qqfriend_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_qqfriend_quanpin));
    }
    if (str.equals("masssendapp"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_masssend_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_masssend_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_masssend_quanpin));
    }
    if (str.equals("feedsapp"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_feedsapp_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_feedsapp_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_feedsapp_quanpin));
    }
    if (str.equals("fmessage"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_fmessage_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_fmessage_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_fmessage_quanpin));
    }
    if (str.equals("voipapp"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_voip_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_voip_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_voip_quanpin));
    }
    if (str.equals("officialaccounts"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_official_accounts_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_official_accounts_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_official_accounts_quanpin));
    }
    if (str.equals("helper_entry"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_helper_entry_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_helper_entry_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_helper_entry_quanpin));
    }
    if (str.equals("cardpackage"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_card_package_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_card_package_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_card_package_quanpin));
    }
    if (str.equals("voicevoipapp"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_voipaudio_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_voipaudio_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_voipaudio_quanpin));
    }
    if (str.equals("voiceinputapp"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_voiceinput_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_voiceinput_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_voiceinput_quanpin));
    }
    if (str.equals("qqmail"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_qqmail_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_qqmail_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_qqmail_quanpin));
    }
    if (str.equals("linkedinplugin"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_linkedin_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_linkedin_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_linkedin_quanpin));
    }
    if (str.equals("notifymessage"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_notify_message_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_notify_message_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_notify_message_quanpin));
    }
    if (str.equals("appbrandcustomerservicemsg"))
    {
      paramab.dx(localContext.getString(R.l.hardcode_plugin_app_brand_customer_service_message_nick));
      paramab.dy(localContext.getString(R.l.hardcode_plugin_app_brand_customer_service_message_pyinitial));
      paramab.dz(localContext.getString(R.l.hardcode_plugin_app_brand_customer_service_message_quanpin));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/model/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */