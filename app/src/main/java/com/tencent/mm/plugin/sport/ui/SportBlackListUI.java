package com.tencent.mm.plugin.sport.ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.sport.b.d;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SportBlackListUI
  extends MMPreference
{
  private ContactListExpandPreference hLp;
  private List<String> opv;
  private ContactListExpandPreference.a opw = new SportBlackListUI.2(this);
  
  public final int Ys()
  {
    return R.o.sportblacklist_pref;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    return false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 != 0) || (paramIntent == null)) {}
    for (;;)
    {
      return;
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      if (!bi.oW(paramIntent))
      {
        paramIntent = bi.F(paramIntent.split(","));
        if (paramIntent != null)
        {
          this.opv.addAll(paramIntent);
          this.hLp.p(null, this.opv);
          this.hLp.refresh();
          paramIntent = paramIntent.iterator();
          while (paramIntent.hasNext())
          {
            String str = (String)paramIntent.next();
            au.HU();
            s.f(c.FR().Yg(str));
          }
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    d.kB(39);
    if (this.opv == null) {
      this.opv = new ArrayList();
    }
    au.HU();
    paramBundle = c.FR().d("@werun.black.android", "", null);
    while (paramBundle.moveToNext())
    {
      String str = paramBundle.getString(0);
      this.opv.add(str);
    }
    paramBundle.close();
    this.hLp = ((ContactListExpandPreference)this.tCL.ZZ("black_contact_list_pref"));
    this.hLp.a(this.tCL, this.hLp.mKey);
    this.hLp.kG(true).kH(true);
    this.hLp.p(null, this.opv);
    this.hLp.a(this.opw);
    this.hLp.setSummary(R.l.exdevice_we_sport_black_list_intro);
    setMMTitle(getString(R.l.exdevice_profile_add_black_list));
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        SportBlackListUI.this.finish();
        return false;
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sport/ui/SportBlackListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */