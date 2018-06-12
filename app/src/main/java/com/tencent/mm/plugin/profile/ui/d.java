package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import junit.framework.Assert;

public final class d
  implements a
{
  private final Context context;
  private f eOE;
  
  public d(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final boolean a(f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    boolean bool;
    label28:
    label40:
    Object localObject;
    if (paramab != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bi.oV(paramab.field_username).length() <= 0) {
        break label262;
      }
      bool = true;
      Assert.assertTrue(bool);
      if (paramf == null) {
        break label268;
      }
      bool = true;
      Assert.assertTrue(bool);
      auw();
      this.eOE = paramf;
      paramf.removeAll();
      paramf.addPreferencesFromResource(R.o.contact_info_pref_bottlecontact);
      localObject = (NormalUserHeaderPreference)paramf.ZZ("contact_info_header_normal");
      if (localObject != null)
      {
        ((NormalUserHeaderPreference)localObject).qPo = "ContactWidgetBottleContact";
        ((NormalUserHeaderPreference)localObject).a(paramab, 0, null);
      }
      localObject = (NormalUserFooterPreference)paramf.ZZ("contact_info_footer_normal");
      bool = ((Activity)this.context).getIntent().getBooleanExtra("Contact_FMessageCard", false);
      if ((localObject != null) && (!((NormalUserFooterPreference)localObject).a(paramab, "", paramBoolean, false, true, 25, 0, bool, false, 0L, ""))) {
        paramf.c((Preference)localObject);
      }
      localObject = (KeyValuePreference)paramf.ZZ("contact_info_signature");
      if ((paramab.signature == null) || (paramab.signature.trim().equals(""))) {
        break label274;
      }
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).tCA = false;
        ((KeyValuePreference)localObject).setTitle(this.context.getString(R.l.contact_info_signature));
        ((KeyValuePreference)localObject).setSummary(j.a(this.context, paramab.signature));
        ((KeyValuePreference)localObject).lO(false);
      }
    }
    for (;;)
    {
      return true;
      bool = false;
      break;
      label262:
      bool = false;
      break label28;
      label268:
      bool = false;
      break label40;
      label274:
      paramf.c((Preference)localObject);
    }
  }
  
  public final boolean auw()
  {
    if (this.eOE == null) {}
    Object localObject;
    do
    {
      return true;
      localObject = (FriendPreference)this.eOE.ZZ("contact_info_friend");
      if (localObject != null) {
        ((FriendPreference)localObject).auw();
      }
      localObject = (NormalUserHeaderPreference)this.eOE.ZZ("contact_info_header_normal");
      if (localObject != null) {
        ((NormalUserHeaderPreference)localObject).onDetach();
      }
      localObject = (NormalUserFooterPreference)this.eOE.ZZ("contact_info_footer_normal");
    } while (localObject == null);
    ((NormalUserFooterPreference)localObject).auw();
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final boolean wX(String paramString)
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */