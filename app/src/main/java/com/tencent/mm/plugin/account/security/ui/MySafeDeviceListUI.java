package com.tencent.mm.plugin.account.security.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ab.o;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.a.k;
import com.tencent.mm.plugin.account.security.a.b;
import com.tencent.mm.plugin.account.security.a.c;
import com.tencent.mm.plugin.account.security.a.d;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.ahm;
import com.tencent.mm.protocal.c.arp;
import com.tencent.mm.protocal.c.bid;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MySafeDeviceListUI
  extends MMPreference
  implements com.tencent.mm.ab.e, j.a
{
  private ProgressDialog eHw = null;
  private f eOE;
  private int eOF = -2;
  private List<SafeDeviceListPreference> eOG;
  private a eOH;
  private List<d> eOI;
  private MenuItem.OnMenuItemClickListener eOJ = new MenuItem.OnMenuItemClickListener()
  {
    public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
    {
      MySafeDeviceListUI.a(MySafeDeviceListUI.this);
      return true;
    }
  };
  private ag handler = new MySafeDeviceListUI.3(this);
  
  private void Yt()
  {
    this.eOG.clear();
    this.eOI = com.tencent.mm.plugin.account.security.a.g.Yq().Yn();
    this.eOE.removeAll();
    this.eOE.addPreferencesFromResource(a.k.safe_device_list_pref);
    if (this.eOI.size() == 0)
    {
      this.eOE.aaa("my_safe_device_list_tip");
      showOptionMenu(false);
      return;
    }
    if (this.eOF == 1)
    {
      addTextOptionMenu(0, getString(a.j.safe_device_edit), this.eOJ);
      this.eOF ^= 0xFFFFFFFF;
    }
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
    Iterator localIterator = this.eOI.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      SafeDeviceListPreference localSafeDeviceListPreference = new SafeDeviceListPreference(this);
      localSafeDeviceListPreference.setKey("mysafedevice_" + locald.field_uid);
      localSafeDeviceListPreference.setTitle(j.a(this, locald.field_name));
      localSafeDeviceListPreference.setSummary(localSimpleDateFormat.format(new Date(locald.field_createtime * 1000L)));
      localSafeDeviceListPreference.eOR = this.eOH;
      localSafeDeviceListPreference.eOS = this.eOH;
      localSafeDeviceListPreference.eOO = locald;
      this.eOE.a(localSafeDeviceListPreference, -1);
      this.eOG.add(localSafeDeviceListPreference);
    }
    showOptionMenu(true);
  }
  
  public final int Ys()
  {
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    Object localObject = null;
    x.i("MicroMsg.MySafeDeviceListUI", "errorCode %d, errorMsg %s, scene %s", new Object[] { Integer.valueOf(paramInt2), paramString, paraml });
    if ((this.eHw != null) && (this.eHw.isShowing()))
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if (paraml.getType() == 850)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paraml = (b)paraml;
        paramString = (String)localObject;
        if (paraml.eOo != null)
        {
          paramString = (String)localObject;
          if (paraml.eOo.rKK != null)
          {
            paramString = (String)localObject;
            if (paraml.eOo.rKK.siQ != null) {
              paramString = paraml.eOo.rKK.siQ;
            }
          }
        }
        if ((paramString != null) && (paramString != null))
        {
          com.tencent.mm.plugin.account.security.a.g.Yq().fV("SafeDeviceInfo", "delete from SafeDeviceInfo");
          paramString = paramString.iterator();
          while (paramString.hasNext())
          {
            paraml = (arp)paramString.next();
            com.tencent.mm.plugin.account.security.a.g.Yq().a(new d(paraml));
          }
        }
      }
    }
    else if (paraml.getType() == 361)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label299;
      }
      paramString = (c)paraml;
      paraml = new d();
      paraml.field_devicetype = paramString.bKv;
      paraml.field_name = paramString.deviceName;
      paraml.field_uid = paramString.byN;
      paraml.field_createtime = 0L;
      com.tencent.mm.plugin.account.security.a.g.Yq().c(paraml, new String[0]);
      h.bA(this, com.tencent.mm.bp.a.af(this, a.j.safe_device_mod_name_ok));
    }
    label299:
    while (!com.tencent.mm.plugin.account.a.a.ezo.a(this, paramInt1, paramInt2, paramString)) {
      return;
    }
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    x.i("MicroMsg.MySafeDeviceListUI", "notify " + paramString);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        MySafeDeviceListUI.g(MySafeDeviceListUI.this);
      }
    });
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if (bi.oW(paramf))
    {
      x.e("MicroMsg.MySafeDeviceListUI", "null key");
      return false;
    }
    if (paramf.startsWith("mysafedevice_"))
    {
      paramf = (SafeDeviceListPreference)paramPreference;
      if (paramf != null)
      {
        paramf = paramf.eOO;
        h.a(this.mController.tml, getString(a.j.safe_device_edit_title), paramf.field_name, getString(a.j.safe_device_mod_name_hint), -1, new MySafeDeviceListUI.4(this, paramf));
      }
    }
    return true;
  }
  
  protected final void initView()
  {
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        MySafeDeviceListUI.this.finish();
        return true;
      }
    });
    this.eOE = this.tCL;
    this.eOG = new LinkedList();
    this.eOH = new a((byte)0);
    addTextOptionMenu(0, getString(a.j.safe_device_edit), this.eOJ);
    setMMTitle(a.j.settings_manage_login_device);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.DF().a(850, this);
    com.tencent.mm.kernel.g.DF().a(361, this);
    com.tencent.mm.plugin.account.security.a.g.Yq().c(this);
    initView();
    paramBundle = new b();
    com.tencent.mm.kernel.g.DF().a(paramBundle, 0);
    getString(a.j.app_tip);
    this.eHw = h.a(this, getString(a.j.app_waiting), true, new MySafeDeviceListUI.2(this, paramBundle));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.kernel.g.DF().b(850, this);
    com.tencent.mm.kernel.g.DF().b(361, this);
    com.tencent.mm.plugin.account.security.a.g.Yq().d(this);
  }
  
  protected void onResume()
  {
    super.onResume();
    Yt();
  }
  
  private final class a
    implements SafeDeviceListPreference.a, SafeDeviceListPreference.b
  {
    private a() {}
    
    public final void pH(String paramString)
    {
      MySafeDeviceListUI.b(MySafeDeviceListUI.this).aaa(paramString);
      MySafeDeviceListUI.d(MySafeDeviceListUI.this).sendEmptyMessage(0);
      MySafeDeviceListUI.this.addTextOptionMenu(0, MySafeDeviceListUI.this.getString(a.j.safe_device_edit), MySafeDeviceListUI.e(MySafeDeviceListUI.this));
      MySafeDeviceListUI.a(MySafeDeviceListUI.this, MySafeDeviceListUI.f(MySafeDeviceListUI.this) ^ 0xFFFFFFFF);
      MySafeDeviceListUI.g(MySafeDeviceListUI.this);
    }
    
    public final void pI(String paramString)
    {
      x.e("MicroMsg.MySafeDeviceListUI", "delete safedevice failed" + paramString);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/security/ui/MySafeDeviceListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */