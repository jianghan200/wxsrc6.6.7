package com.tencent.mm.plugin.setting.ui.setting;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.aq.l;
import com.tencent.mm.g.a.pk;
import com.tencent.mm.g.a.pk.b;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.pluginsdk.f.f.b;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

public class SettingsManageFindMoreUI
  extends MMPreference
{
  private HashMap<Integer, Integer> eGU = new HashMap();
  private long hXx;
  private HashMap<Integer, Integer> mSD = new HashMap();
  private HashMap<Integer, Integer> mSE = new HashMap();
  private int mSF;
  
  private void aXS()
  {
    Iterator localIterator = this.mSE.keySet().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if ((this.mSD.containsKey(Integer.valueOf(i))) && (this.mSD.get(Integer.valueOf(i)) != this.mSE.get(Integer.valueOf(i)))) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(15185, new Object[] { Integer.valueOf(i), this.mSE.get(Integer.valueOf(i)) });
      }
    }
  }
  
  private void c(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsManageFindMoreUI", "switch ext change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.hXx &= (paramInt1 ^ 0xFFFFFFFF);
      if (!paramBoolean) {
        break label93;
      }
    }
    label93:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      this.eGU.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      return;
      this.hXx |= paramInt1;
      break;
    }
  }
  
  private void r(boolean paramBoolean, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsManageFindMoreUI", "switch plugin flag, open %s, flag %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (!paramBoolean)
    {
      this.mSF |= paramInt;
      return;
    }
    this.mSF &= (paramInt ^ 0xFFFFFFFF);
  }
  
  private boolean vO(int paramInt)
  {
    return (this.hXx & paramInt) != 0L;
  }
  
  private boolean vP(int paramInt)
  {
    return (this.mSF & paramInt) == 0;
  }
  
  public final int Ys()
  {
    return a.k.settings_pref_manage_findmoreui;
  }
  
  public final com.tencent.mm.ui.base.preference.h a(SharedPreferences paramSharedPreferences)
  {
    return new com.tencent.mm.ui.base.preference.a(this, paramSharedPreferences);
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    int j = 0;
    if (!(paramPreference instanceof CheckBoxPreference)) {
      return true;
    }
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)paramPreference;
    paramf = paramPreference.mKey;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsManageFindMoreUI", "click pref key %s", new Object[] { paramf });
    int i = -1;
    if (paramf.equals("settings_sns_switch"))
    {
      r(localCheckBoxPreference.isChecked(), 32768);
      SharedPreferences localSharedPreferences = getSharedPreferences(ad.chY(), 0);
      paramPreference = localSharedPreferences.getString(q.GF() + "_sns_entrance_disappear", "");
      if ((!bi.oW(paramPreference)) && (paramPreference.startsWith("on")))
      {
        paramf = paramPreference;
        if (localCheckBoxPreference.isChecked())
        {
          paramf = paramPreference;
          if (paramPreference.equals("on_close")) {
            paramf = "on";
          }
        }
        paramPreference = paramf;
        if (!localCheckBoxPreference.isChecked())
        {
          paramPreference = paramf;
          if (paramf.equals("on")) {
            paramPreference = "on_close";
          }
        }
        localSharedPreferences.edit().putString(q.GF() + "_sns_entrance_disappear", paramPreference).commit();
      }
      i = 0;
    }
    for (;;)
    {
      if (localCheckBoxPreference.isChecked()) {
        j = 1;
      }
      if (i < 0) {
        break;
      }
      this.mSE.put(Integer.valueOf(i), Integer.valueOf(j));
      return true;
      if (paramf.equals("settings_scan_switch"))
      {
        c(localCheckBoxPreference.isChecked(), 1048576, 49);
        i = 1;
      }
      else if (paramf.equals("settings_search_switch"))
      {
        if (!localCheckBoxPreference.isChecked())
        {
          if (((com.tencent.mm.plugin.websearch.api.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.websearch.api.i.class)).b(this, new SettingsManageFindMoreUI.1(this, localCheckBoxPreference))) {
            ah.i(new SettingsManageFindMoreUI.2(this, localCheckBoxPreference), 500L);
          }
          i = 3;
        }
        else
        {
          c(localCheckBoxPreference.isChecked(), 2097152, 50);
          i = 3;
        }
      }
      else if (paramf.equals("settings_shopping_switch"))
      {
        i = 6;
        c(localCheckBoxPreference.isChecked(), 4194304, 51);
      }
      else
      {
        if (paramf.equals("settings_game_switch"))
        {
          c(localCheckBoxPreference.isChecked(), 8388608, 52);
          paramf = com.tencent.mm.plugin.report.service.h.mEJ;
          if (localCheckBoxPreference.isChecked()) {}
          for (long l = 0L;; l = 1L)
          {
            paramf.a(848L, l, 1L, false);
            i = 7;
            break;
          }
        }
        if (paramf.equals("settings_miniprogram_switch"))
        {
          i = 8;
          c(localCheckBoxPreference.isChecked(), 16777216, 53);
        }
        else if (paramf.equals("settings_wechatout_switch"))
        {
          i = 9;
          c(localCheckBoxPreference.isChecked(), 33554432, 54);
        }
        else if (paramf.equals("settings_shake_switch"))
        {
          i = 2;
          r(localCheckBoxPreference.isChecked(), 256);
        }
        else if (paramf.equals("settings_nearby_switch"))
        {
          i = 4;
          r(localCheckBoxPreference.isChecked(), 512);
        }
        else if (paramf.equals("settings_bottle_switch"))
        {
          i = 5;
          r(localCheckBoxPreference.isChecked(), 64);
        }
        else if (paramf.equals("settings_look_switch"))
        {
          ((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.welab.a.a.a.class)).bh("labs_browse", localCheckBoxPreference.isChecked());
          if ((!localCheckBoxPreference.isChecked()) && (com.tencent.mm.al.b.ml((String)com.tencent.mm.kernel.g.Ei().DT().get(274436, null)))) {
            this.tCL.bw("settings_look_switch", true);
          }
          i = 10;
        }
      }
    }
  }
  
  public void finish()
  {
    super.finish();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsManageFindMoreUI", "oplog extstatus:" + this.hXx + ",pluginFlag:" + this.mSF);
    com.tencent.mm.kernel.g.Ei().DT().set(147457, Long.valueOf(this.hXx));
    com.tencent.mm.kernel.g.Ei().DT().set(34, Integer.valueOf(this.mSF));
    Iterator localIterator = this.eGU.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      int j = ((Integer)((Map.Entry)localObject).getValue()).intValue();
      localObject = new xt();
      ((xt)localObject).rDz = i;
      ((xt)localObject).rDA = j;
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FQ().b(new h.a(23, (com.tencent.mm.bk.a)localObject));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsManageFindMoreUI", "switch  " + i + " " + j);
    }
    this.eGU.clear();
    ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FQ().b(new l("", "", "", "", "", "", "", "", this.mSF, "", ""));
    aXS();
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_manage_findmoreui);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        SettingsManageFindMoreUI.this.finish();
        return true;
      }
    });
    Object localObject1 = (CheckBoxPreference)this.tCL.ZZ("settings_sns_switch");
    ((Preference)localObject1).tDr = false;
    boolean bool1 = vP(32768);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsManageFindMoreUI", "openSns %s", new Object[] { Boolean.valueOf(bool1) });
    label140:
    label213:
    Object localObject2;
    boolean bool2;
    if (bool1)
    {
      ((CheckBoxPreference)localObject1).qpJ = true;
      this.mSD.put(Integer.valueOf(0), Integer.valueOf(1));
      localObject1 = (CheckBoxPreference)this.tCL.ZZ("settings_scan_switch");
      ((Preference)localObject1).tDr = false;
      if (!vO(1048576)) {
        break label1085;
      }
      ((CheckBoxPreference)localObject1).qpJ = false;
      this.mSD.put(Integer.valueOf(1), Integer.valueOf(0));
      localObject1 = (CheckBoxPreference)this.tCL.ZZ("settings_shake_switch");
      ((Preference)localObject1).tDr = false;
      bool1 = vP(256);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsManageFindMoreUI", "openShake %s", new Object[] { Boolean.valueOf(bool1) });
      if (!bool1) {
        break label1109;
      }
      ((CheckBoxPreference)localObject1).qpJ = true;
      this.mSD.put(Integer.valueOf(2), Integer.valueOf(1));
      localObject1 = (CheckBoxPreference)this.tCL.ZZ("settings_look_switch");
      ((Preference)localObject1).tDr = false;
      localObject2 = r.PX("discoverRecommendEntry");
      bool2 = ((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.welab.a.a.a.class)).RZ("labs_browse");
      if (!bool2) {
        break label1133;
      }
      if (!((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.welab.a.a.a.class)).RX("labs_browse")) {
        break label1501;
      }
      bool1 = true;
    }
    for (;;)
    {
      label286:
      if (com.tencent.mm.al.b.ml((String)com.tencent.mm.kernel.g.Ei().DT().get(274436, null)))
      {
        this.tCL.bw("settings_look_switch", true);
        bool2 = false;
        bool1 = false;
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsManageFindMoreUI", "isInExperiment %s ,openLook %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        label381:
        label431:
        label504:
        label576:
        label592:
        String str;
        if ((bool2) && (bool1))
        {
          ((CheckBoxPreference)localObject1).qpJ = true;
          this.mSD.put(Integer.valueOf(10), Integer.valueOf(1));
          localObject1 = (CheckBoxPreference)this.tCL.ZZ("settings_search_switch");
          ((Preference)localObject1).tDr = false;
          if (!vO(2097152)) {
            break label1208;
          }
          ((CheckBoxPreference)localObject1).qpJ = false;
          this.mSD.put(Integer.valueOf(3), Integer.valueOf(0));
          localObject1 = (CheckBoxPreference)this.tCL.ZZ("settings_nearby_switch");
          ((Preference)localObject1).tDr = false;
          bool1 = vP(512);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsManageFindMoreUI", "openNearby %s", new Object[] { Boolean.valueOf(bool1) });
          if (!bool1) {
            break label1232;
          }
          ((CheckBoxPreference)localObject1).qpJ = true;
          this.mSD.put(Integer.valueOf(4), Integer.valueOf(1));
          localObject1 = (CheckBoxPreference)this.tCL.ZZ("settings_bottle_switch");
          ((Preference)localObject1).tDr = false;
          bool1 = vP(64);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsManageFindMoreUI", "openFloatBottle %s", new Object[] { Boolean.valueOf(bool1) });
          if (!bool1) {
            break label1256;
          }
          ((CheckBoxPreference)localObject1).qpJ = true;
          this.mSD.put(Integer.valueOf(5), Integer.valueOf(1));
          if (!w.chM()) {
            break label1280;
          }
          localObject1 = com.tencent.mm.k.g.AT().getValue("JDEntranceConfigName");
          str = com.tencent.mm.k.g.AT().getValue("JDEntranceConfigIconUrl");
          localObject2 = com.tencent.mm.pluginsdk.f.f.qBo;
          if (localObject2 == null) {
            break label1487;
          }
        }
        label705:
        label737:
        label810:
        label918:
        label949:
        label1085:
        label1109:
        label1133:
        label1208:
        label1232:
        label1256:
        label1280:
        label1328:
        label1353:
        label1379:
        label1395:
        label1420:
        label1436:
        label1441:
        label1466:
        label1487:
        for (localObject2 = ((f.b)localObject2).bGp();; localObject2 = null)
        {
          if (!bi.G(new String[] { localObject1, str, localObject2 })) {}
          for (bool1 = true;; bool1 = false)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsManageFindMoreUI", "showShopping %s", new Object[] { Boolean.valueOf(bool1) });
            localObject1 = (CheckBoxPreference)this.tCL.ZZ("settings_shopping_switch");
            ((Preference)localObject1).tDr = false;
            if (bool1)
            {
              this.tCL.bw("settings_shopping_switch", false);
              if (!vO(4194304)) {
                break label1328;
              }
              ((CheckBoxPreference)localObject1).qpJ = false;
              this.mSD.put(Integer.valueOf(6), Integer.valueOf(0));
              localObject1 = a.a.aSm();
              localObject2 = (CheckBoxPreference)this.tCL.ZZ("settings_game_switch");
              ((Preference)localObject2).tDr = false;
              if ((localObject1 == null) || (!((com.tencent.mm.plugin.game.a.a)localObject1).aSd())) {
                break label1379;
              }
              if (!vO(8388608)) {
                break label1353;
              }
              ((CheckBoxPreference)localObject2).qpJ = false;
              this.mSD.put(Integer.valueOf(7), Integer.valueOf(0));
              localObject1 = new pk();
              ((pk)localObject1).cah.caj = true;
              com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
              bool1 = ((pk)localObject1).cai.cak;
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsManageFindMoreUI", "shouldShowMiniProgram %s", new Object[] { Boolean.valueOf(bool1) });
              localObject1 = (CheckBoxPreference)this.tCL.ZZ("settings_miniprogram_switch");
              ((Preference)localObject1).tDr = false;
              if (!bool1) {
                break label1420;
              }
              if (!vO(16777216)) {
                break label1395;
              }
              ((CheckBoxPreference)localObject1).qpJ = false;
              this.mSD.put(Integer.valueOf(8), Integer.valueOf(0));
              localObject1 = (CheckBoxPreference)this.tCL.ZZ("settings_wechatout_switch");
              if (com.tencent.mm.k.g.AT().getInt("WCOEntranceSwitch", 0) <= 0) {
                break label1436;
              }
              bool1 = true;
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsManageFindMoreUI", "showWeChatOut %s", new Object[] { Boolean.valueOf(bool1) });
              if (!bool1) {
                break label1466;
              }
              ((Preference)localObject1).tDr = false;
              if (!vO(33554432)) {
                break label1441;
              }
              ((CheckBoxPreference)localObject1).qpJ = false;
              this.mSD.put(Integer.valueOf(9), Integer.valueOf(0));
            }
            for (;;)
            {
              localObject1 = this.tCL.ZZ("settings_switch_bottom_tip");
              if (com.tencent.mm.al.b.ml((String)com.tencent.mm.kernel.g.Ei().DT().get(274436, null))) {
                ((Preference)localObject1).setTitle(a.i.settings_manage_plugin_eu_hint);
              }
              this.tCL.notifyDataSetChanged();
              return;
              ((CheckBoxPreference)localObject1).qpJ = false;
              this.mSD.put(Integer.valueOf(0), Integer.valueOf(0));
              break;
              ((CheckBoxPreference)localObject1).qpJ = true;
              this.mSD.put(Integer.valueOf(1), Integer.valueOf(1));
              break label140;
              ((CheckBoxPreference)localObject1).qpJ = false;
              this.mSD.put(Integer.valueOf(2), Integer.valueOf(0));
              break label213;
              if (((JSONObject)localObject2).optInt("entrySwitch") != 1) {
                break label1496;
              }
              bool1 = true;
              break label286;
              if (!bool2)
              {
                this.tCL.bw("settings_look_switch", true);
                break label381;
              }
              this.tCL.bw("settings_look_switch", false);
              ((CheckBoxPreference)localObject1).qpJ = false;
              this.mSD.put(Integer.valueOf(10), Integer.valueOf(0));
              break label381;
              ((CheckBoxPreference)localObject1).qpJ = true;
              this.mSD.put(Integer.valueOf(3), Integer.valueOf(1));
              break label431;
              ((CheckBoxPreference)localObject1).qpJ = false;
              this.mSD.put(Integer.valueOf(4), Integer.valueOf(0));
              break label504;
              ((CheckBoxPreference)localObject1).qpJ = false;
              this.mSD.put(Integer.valueOf(5), Integer.valueOf(0));
              break label576;
              if (w.chN())
              {
                localObject1 = com.tencent.mm.k.g.AT().getValue("JDEntranceConfigNameHKTW");
                break label592;
              }
              localObject1 = com.tencent.mm.k.g.AT().getValue("JDEntranceConfigNameEN");
              break label592;
              this.tCL.bw("settings_shopping_switch", true);
              break label705;
              ((CheckBoxPreference)localObject1).qpJ = true;
              this.mSD.put(Integer.valueOf(6), Integer.valueOf(1));
              break label737;
              ((CheckBoxPreference)localObject2).qpJ = true;
              this.mSD.put(Integer.valueOf(7), Integer.valueOf(1));
              break label810;
              this.tCL.bw("settings_game_switch", true);
              break label810;
              ((CheckBoxPreference)localObject1).qpJ = true;
              this.mSD.put(Integer.valueOf(8), Integer.valueOf(1));
              break label918;
              this.tCL.bw("settings_miniprogram_switch", true);
              break label918;
              bool1 = false;
              break label949;
              ((CheckBoxPreference)localObject1).qpJ = true;
              this.mSD.put(Integer.valueOf(9), Integer.valueOf(1));
              continue;
              this.tCL.bw("settings_wechatout_switch", true);
            }
          }
        }
      }
      label1496:
      bool1 = false;
      continue;
      label1501:
      bool1 = false;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.hXx = q.GK();
    this.mSF = q.GQ();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsManageFindMoreUI", "onCreate extStatus %d, pluginFlag %d", new Object[] { Long.valueOf(this.hXx), Integer.valueOf(this.mSF) });
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsManageFindMoreUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */