package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.q;
import com.tencent.mm.model.y;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.setting.a.c;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.h;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.plugin.sns.b.k;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.e.e;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class SettingsPrivacyUI
  extends MMPreference
{
  private String cXR = "";
  private HashMap<Integer, Integer> eGU = new HashMap();
  private f eOE;
  boolean hLI = false;
  private boolean mRv = false;
  private boolean mTp = true;
  private boolean mTq = false;
  private boolean mTr = false;
  private boolean mTs = false;
  private boolean mTt = true;
  private int mTu = e.e.thv;
  private int status;
  
  private void a(LinearLayout paramLinearLayout, int paramInt1, int paramInt2, boolean paramBoolean, View.OnClickListener paramOnClickListener)
  {
    TextView localTextView = (TextView)View.inflate(this.mController.tml, a.g.radio_btn_item, null);
    localTextView.setText(paramInt1);
    localTextView.setTag(Integer.valueOf(paramInt2));
    paramLinearLayout.addView(localTextView);
    localTextView.setOnClickListener(paramOnClickListener);
    if (paramBoolean) {
      localTextView.setCompoundDrawablesWithIntrinsicBounds(a.h.radio_on, 0, 0, 0);
    }
  }
  
  private void btT()
  {
    Object localObject = new bqd();
    if (n.nky != null) {
      localObject = n.nky.Lv(this.cXR);
    }
    for (;;)
    {
      if (localObject == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingPrivacy", "userinfo is null");
        return;
      }
      int i = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sWj, Integer.valueOf(0))).intValue();
      if (i > ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sWk, Integer.valueOf(0))).intValue())
      {
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sWk, Integer.valueOf(i));
        btU();
      }
      c.a locala = new c.a(this.mController.tml);
      locala.Gu(a.i.app_cancel);
      locala.Gq(a.i.contact_info_feedsapp_recent_select);
      View localView = View.inflate(this.mController.tml, a.g.mm_alert_switch, null);
      LinearLayout localLinearLayout = (LinearLayout)localView.findViewById(a.f.switcher_container);
      SettingsPrivacyUI.2 local2 = new SettingsPrivacyUI.2(this, localLinearLayout);
      i = ((bqd)localObject).sod;
      a(localLinearLayout, a.i.contact_info_feedsapp_recent_select_half_year, 1, this.mTq, local2);
      a(localLinearLayout, a.i.contact_info_feedsapp_recent_select_three_day, 0, this.mTr, local2);
      i = a.i.contact_info_feedsapp_recent_select_all;
      if ((!this.mTq) && (!this.mTr)) {}
      for (boolean bool = true;; bool = false)
      {
        a(localLinearLayout, i, 2, bool, local2);
        locala.dR(localView);
        localObject = locala.anj();
        localLinearLayout.setTag(localObject);
        ((c)localObject).show();
        addDialog((Dialog)localObject);
        return;
      }
    }
  }
  
  private void btU()
  {
    Object localObject = new bqd();
    if (n.nky != null) {
      localObject = n.nky.Lv(this.cXR);
    }
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingPrivacy", "userinfo is null");
      return;
    }
    int i = ((bqd)localObject).sod;
    localObject = (CheckBoxPreference)this.eOE.ZZ("timeline_stranger_show");
    boolean bool;
    if (localObject != null)
    {
      ((Preference)localObject).tDr = false;
      if ((i & 0x1) > 0)
      {
        bool = true;
        this.mRv = bool;
        if (this.mRv) {
          break label472;
        }
        ((CheckBoxPreference)localObject).qpJ = true;
      }
    }
    else
    {
      label102:
      localObject = (IconPreference)this.eOE.ZZ("timeline_recent_show_select");
      if (localObject != null)
      {
        ((Preference)localObject).tDr = false;
        if ((i & 0x200) <= 0) {
          break label481;
        }
        bool = true;
        label140:
        this.mTq = bool;
        if ((i & 0x400) <= 0) {
          break label486;
        }
        bool = true;
        label155:
        this.mTr = bool;
        if ((i & 0x800) <= 0) {
          break label491;
        }
        bool = true;
        label170:
        this.mTs = bool;
        if (!this.mTq) {
          break label496;
        }
        ((IconPreference)localObject).setSummary(a.i.contact_info_feedsapp_recent_select_half_year);
        label190:
        i = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sWj, Integer.valueOf(0))).intValue();
        int j = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sWk, Integer.valueOf(0))).intValue();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingPrivacy", "willShowRecentRedCodeId  %d, currentRecentRedCodeId %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if (i <= j) {
          break label525;
        }
        ((IconPreference)localObject).Et(0);
      }
      label273:
      if ((!d.QS("sns")) || ((q.GQ() & 0x8000) != 0)) {
        break label535;
      }
      bool = true;
      label294:
      this.mTp = bool;
      localObject = new StringBuilder("isSnsOpenEntrance ").append(this.mTp).append(", install ").append(d.QS("sns")).append(", flag ");
      if ((q.GQ() & 0x8000) != 0) {
        break label540;
      }
      bool = true;
      label351:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingPrivacy", bool);
      if (!this.mTp) {
        break label545;
      }
      this.eOE.bw("settings_sns_notify", false);
      label385:
      if (this.mTp)
      {
        localObject = (CheckBoxPreference)this.eOE.ZZ("settings_sns_notify");
        if (localObject != null)
        {
          ((Preference)localObject).tDr = false;
          this.mTt = bi.a((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(68384, null), true);
          if (!this.mTt) {
            break label561;
          }
        }
      }
    }
    label472:
    label481:
    label486:
    label491:
    label496:
    label525:
    label535:
    label540:
    label545:
    label561:
    for (((CheckBoxPreference)localObject).qpJ = true;; ((CheckBoxPreference)localObject).qpJ = false)
    {
      this.eOE.notifyDataSetChanged();
      return;
      bool = false;
      break;
      ((CheckBoxPreference)localObject).qpJ = false;
      break label102;
      bool = false;
      break label140;
      bool = false;
      break label155;
      bool = false;
      break label170;
      if (this.mTr)
      {
        ((IconPreference)localObject).setSummary(a.i.contact_info_feedsapp_recent_select_three_day);
        break label190;
      }
      ((IconPreference)localObject).setSummary(a.i.contact_info_feedsapp_recent_select_all);
      break label190;
      ((IconPreference)localObject).Et(8);
      break label273;
      bool = false;
      break label294;
      bool = false;
      break label351;
      this.eOE.bw("settings_sns_notify", true);
      break label385;
    }
  }
  
  private boolean d(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingPrivacy", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.status |= paramInt1;
      if (!paramBoolean) {
        break label95;
      }
    }
    label95:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      this.eGU.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      return true;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }
  
  private boolean uL(int paramInt)
  {
    return (this.status & paramInt) != 0;
  }
  
  public final int Ys()
  {
    return a.k.settings_about_privacy;
  }
  
  public final com.tencent.mm.ui.base.preference.h a(SharedPreferences paramSharedPreferences)
  {
    return new com.tencent.mm.ui.base.preference.a(this, paramSharedPreferences);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    paramPreference = paramPreference.mKey;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingPrivacy", paramPreference + " item has been clicked!");
    if (paramPreference.equals("settings_need_verify")) {
      return d(((CheckBoxPreference)paramf.ZZ("settings_need_verify")).isChecked(), 32, 4);
    }
    if (paramPreference.equals("settings_recommend_mobilefriends_to_me"))
    {
      if (!((CheckBoxPreference)paramf.ZZ("settings_recommend_mobilefriends_to_me")).isChecked()) {}
      for (bool1 = true;; bool1 = false) {
        return d(bool1, 256, 7);
      }
    }
    if (paramPreference.equals("settings_about_blacklist"))
    {
      paramf = y.jdMethod_if(getString(a.i.group_blacklist));
      paramPreference = new Intent();
      paramPreference.putExtra("filter_type", paramf.getType());
      paramPreference.putExtra("titile", getString(a.i.settings_private_blacklist));
      paramPreference.putExtra("list_attr", 32768);
      b.ezn.h(this, paramPreference);
      return true;
    }
    if (paramPreference.equals("timline_outside_permiss"))
    {
      paramf = new Intent();
      paramf.putExtra("k_sns_tag_id", 4L);
      paramf.putExtra("k_sns_from_settings_about_sns", 1);
      d.b(this, "sns", ".ui.SnsBlackDetailUI", paramf);
    }
    for (;;)
    {
      return false;
      if (paramPreference.equals("edit_timeline_group"))
      {
        d.A(this, "sns", ".ui.SnsTagPartlyUI");
      }
      else if (paramPreference.equals("timeline_black_permiss"))
      {
        paramf = new Intent();
        paramf.putExtra("k_sns_tag_id", 5L);
        paramf.putExtra("k_sns_from_settings_about_sns", 2);
        paramf.putExtra("k_tag_detail_sns_block_scene", 8);
        d.b(this, "sns", ".ui.SnsTagDetailUI", paramf);
      }
      else if (paramPreference.equals("timeline_stranger_show"))
      {
        if (!this.mRv) {}
        for (;;)
        {
          this.mRv = bool1;
          if (n.nky != null) {
            n.nky.aQ(this.cXR, this.mRv);
          }
          if (n.nky == null) {
            break;
          }
          paramf = n.nky.aR(this.cXR, this.mRv);
          n.nky.a(this.cXR, paramf);
          if (paramf != null) {
            break label430;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingPrivacy", "userinfo in null !");
          return false;
          bool1 = false;
        }
        label430:
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingPrivacy", "dancy userinfo " + paramf.toString());
        ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(51, paramf));
      }
      else
      {
        if (paramPreference.equals("settings_find_google_contact"))
        {
          bool1 = bool2;
          if (!((CheckBoxPreference)paramf.ZZ("settings_find_google_contact")).isChecked()) {
            bool1 = true;
          }
          d(bool1, 1048576, 29);
          return true;
        }
        if (paramPreference.equals("settings_add_me_way"))
        {
          startActivity(new Intent(this, SettingsAddMeUI.class));
          return true;
        }
        if (paramPreference.equals("timeline_recent_show_select"))
        {
          btT();
        }
        else
        {
          if (paramPreference.equals("settings_sns_notify"))
          {
            if (!this.mTt)
            {
              bool1 = true;
              this.mTt = bool1;
              if (!this.mTt) {
                break label658;
              }
              com.tencent.mm.plugin.report.service.h.mEJ.h(14098, new Object[] { Integer.valueOf(3) });
            }
            for (;;)
            {
              com.tencent.mm.kernel.g.Ei().DT().set(68384, Boolean.valueOf(this.mTt));
              btU();
              return true;
              bool1 = false;
              break;
              label658:
              com.tencent.mm.plugin.report.service.h.mEJ.h(14098, new Object[] { Integer.valueOf(4) });
            }
          }
          if (paramPreference.equals("settings_unfamiliar_contact"))
          {
            startActivity(new Intent(this, UnfamiliarContactUI.class));
          }
          else if (paramPreference.equals("settings_privacy_agreements"))
          {
            paramPreference = com.tencent.mm.kernel.g.Ei().DT().get(274436, "").toString();
            paramf = paramPreference;
            if (bi.oW(paramPreference)) {
              paramf = w.chO();
            }
            com.tencent.mm.platformtools.a.b(this, getString(a.j.license_read_url, new Object[] { w.chP(), paramf, "setting", Integer.valueOf(0), Integer.valueOf(0) }), 0, false);
          }
          else if (paramPreference.equals("settings_auth_manage"))
          {
            startActivity(new Intent(this, SettingsManageAuthUI.class));
          }
        }
      }
    }
  }
  
  protected final void initView()
  {
    boolean bool2 = false;
    setMMTitle(a.i.settings_about_privacy);
    setBackBtn(new SettingsPrivacyUI.3(this));
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.SettingPrivacy", "init function status: " + Integer.toBinaryString(this.status));
    Object localObject1 = (CheckBoxPreference)this.eOE.ZZ("settings_need_verify");
    ((Preference)localObject1).tDr = false;
    ((CheckBoxPreference)localObject1).qpJ = uL(32);
    localObject1 = (String)com.tencent.mm.kernel.g.Ei().DT().get(6, null);
    Object localObject2 = (CheckBoxPreference)this.eOE.ZZ("settings_recommend_mobilefriends_to_me");
    ((Preference)localObject2).tDr = false;
    boolean bool1;
    if ((localObject1 != null) && (((String)localObject1).length() > 0)) {
      if (!uL(256))
      {
        bool1 = true;
        ((CheckBoxPreference)localObject2).qpJ = bool1;
      }
    }
    for (;;)
    {
      localObject1 = (CheckBoxPreference)this.eOE.ZZ("settings_find_google_contact");
      ((Preference)localObject1).tDr = false;
      bool1 = bool2;
      if (!uL(1048576)) {
        bool1 = true;
      }
      ((CheckBoxPreference)localObject1).qpJ = bool1;
      localObject2 = (String)com.tencent.mm.kernel.g.Ei().DT().get(208903, null);
      if ((!bi.fU(this)) || (TextUtils.isEmpty((CharSequence)localObject2))) {
        this.eOE.c((Preference)localObject1);
      }
      if ((!((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(335873, Boolean.valueOf(true))).booleanValue()) || (!n.nkA.bwW())) {
        this.eOE.bw("edit_timeline_group", true);
      }
      this.eOE.bw("settings_unfamiliar_contact", true);
      localObject1 = this.eOE.ZZ("settings_privacy_agreements");
      localObject2 = getString(a.i.privacy_detail);
      Spannable localSpannable = Spannable.Factory.getInstance().newSpannable(getString(a.i.privacy_detail_tip) + (String)localObject2);
      localSpannable.setSpan(new ForegroundColorSpan(getResources().getColor(a.c.link_color)), localSpannable.length() - ((String)localObject2).length(), localSpannable.length(), 33);
      ((Preference)localObject1).setTitle(localSpannable);
      this.eOE.notifyDataSetChanged();
      return;
      bool1 = false;
      break;
      this.eOE.c((Preference)localObject2);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = true;
    super.onCreate(paramBundle);
    this.eOE = this.tCL;
    this.status = q.GJ();
    this.cXR = q.GF();
    this.mTt = bi.a((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(68384, null), true);
    this.mTu = getIntent().getIntExtra("enter_scene", e.e.thv);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingPrivacy", "sns Notify " + this.mTt);
    initView();
    com.tencent.mm.plugin.report.service.h.mEJ.h(14098, new Object[] { Integer.valueOf(9) });
    if ((this.mTu == e.e.thw) || (this.mTu == e.e.thx))
    {
      paramBundle = new bqd();
      if (n.nky != null) {
        paramBundle = n.nky.Lv(this.cXR);
      }
      if (paramBundle != null)
      {
        int i = paramBundle.sod;
        if ((i & 0x200) <= 0) {
          break label228;
        }
        bool1 = true;
        this.mTq = bool1;
        if ((i & 0x400) <= 0) {
          break label233;
        }
        bool1 = true;
        label202:
        this.mTr = bool1;
        if ((i & 0x800) <= 0) {
          break label238;
        }
      }
    }
    label228:
    label233:
    label238:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.mTs = bool1;
      btT();
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label202;
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
    com.tencent.mm.kernel.g.Ei().DT().set(7, Integer.valueOf(this.status));
    Iterator localIterator = this.eGU.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      int j = ((Integer)((Map.Entry)localObject).getValue()).intValue();
      localObject = new xt();
      ((xt)localObject).rDz = i;
      ((xt)localObject).rDA = j;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(23, (com.tencent.mm.bk.a)localObject));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingPrivacy", "switch  " + i + " " + j);
    }
    this.eGU.clear();
  }
  
  protected void onResume()
  {
    super.onResume();
    this.status = q.GJ();
    btU();
    if (!this.hLI)
    {
      String str = getIntent().getStringExtra("need_matte_high_light_item");
      if (!bi.oW(str))
      {
        int i = this.eOE.aab(str);
        setSelection(i - 3);
        new ag().postDelayed(new SettingsPrivacyUI.1(this, i), 10L);
      }
      this.hLI = true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */