package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import com.tencent.mm.modelstat.k;
import com.tencent.mm.modelstat.m;
import com.tencent.mm.modelstat.q;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SettingsNetStatUI
  extends MMPreference
{
  private f eOE;
  private long period;
  
  private void btP()
  {
    Object localObject2 = q.Sj().iu((int)(this.period / 86400000L));
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new k();
    }
    this.period = q.Sj().Sb();
    localObject2 = this.eOE.ZZ("settings_netstat_info");
    String str = DateFormat.format(getString(a.i.fmt_longdate, new Object[] { "" }), this.period).toString();
    ((Preference)localObject2).setTitle(getString(a.i.settings_traffic_all_statistic, new Object[] { str }));
    localObject2 = this.eOE.ZZ("settings_netstat_mobile");
    x.i("MicroMsg.SettingsNetStatUI", "dknetflow updateFlowStatistic mobile out:%d in:%d", new Object[] { Integer.valueOf(((k)localObject1).ekh), Integer.valueOf(((k)localObject1).ejV) });
    ((Preference)localObject2).setSummary(j(this, ((k)localObject1).ekh + ((k)localObject1).ejV));
    localObject2 = this.eOE.ZZ("settings_netstat_wifi");
    x.i("MicroMsg.SettingsNetStatUI", "dknetflow updateFlowStatistic wifi out:%d in:%d", new Object[] { Integer.valueOf(((k)localObject1).eki), Integer.valueOf(((k)localObject1).ejW) });
    ((Preference)localObject2).setSummary(j(this, ((k)localObject1).eki + ((k)localObject1).ejW));
    ((NetStatPreference)this.eOE.ZZ("settings_netstat_mobile_detail")).mQa = false;
    ((NetStatPreference)this.eOE.ZZ("settings_netstat_wifi_detail")).mQa = true;
    this.eOE.notifyDataSetChanged();
  }
  
  private static String j(Context paramContext, long paramLong)
  {
    return paramContext.getString(a.i.settings_total_traffic_statistic_all, new Object[] { bi.bF(paramLong) });
  }
  
  public final int Ys()
  {
    return a.k.settings_pref_netstat;
  }
  
  protected final boolean Yy()
  {
    return false;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_traffic_statistic);
    Object localObject1 = q.Sj();
    int i = (int)(bi.ciY() / 86400000L);
    if (((m)localObject1).it(i) == null)
    {
      localObject2 = new k();
      ((k)localObject2).ejM = i;
      ((k)localObject2).id = -1;
      ((m)localObject1).b((k)localObject2);
    }
    this.eOE = this.tCL;
    this.period = q.Sj().Sb();
    localObject1 = this.eOE.ZZ("settings_netstat_info");
    Object localObject2 = new SimpleDateFormat(getString(a.i.fmt_longdate), Locale.US).format(new Date(this.period));
    ((Preference)localObject1).setTitle(getString(a.i.settings_traffic_all_statistic, new Object[] { localObject2 }));
    x.i("MicroMsg.SettingsNetStatUI", "title datatime = " + (String)localObject2);
    x.d("MicroMsg.SettingsNetStatUI", "title datatime = " + (String)localObject2);
    setBackBtn(new SettingsNetStatUI.1(this));
    addTextOptionMenu(0, getString(a.i.settings_traffic_statistic_clear), new SettingsNetStatUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onResume()
  {
    super.onResume();
    btP();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsNetStatUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */