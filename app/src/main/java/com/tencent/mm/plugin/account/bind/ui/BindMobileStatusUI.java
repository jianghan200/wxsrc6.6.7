package com.tencent.mm.plugin.account.bind.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.plugin.account.a.e;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.i;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.ui.MMWizardActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class BindMobileStatusUI
  extends MMWizardActivity
{
  private SharedPreferences duR;
  private ImageView eFS;
  private TextView eGJ;
  private ImageView eGK;
  private ImageView eGL;
  private Boolean eGM = Boolean.valueOf(true);
  private Boolean eGN = Boolean.valueOf(true);
  private RelativeLayout eGO;
  private RelativeLayout eGP;
  private BindWordingContent eGQ;
  private int eGR;
  private boolean eGS;
  private boolean eGT;
  @SuppressLint({"UseSparseArrays"})
  private HashMap<Integer, Integer> eGU = new HashMap();
  private SparseArray<String> eGV = new SparseArray(3);
  private TextView eGm;
  private Button eGn;
  private int status;
  
  private boolean a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BindMobileStatusUI", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    label59:
    String str;
    Boolean localBoolean;
    if (paramBoolean)
    {
      this.status |= paramInt1;
      if (!paramBoolean) {
        break label182;
      }
      paramInt1 = 1;
      this.eGU.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      str = (String)this.eGV.get(paramInt2);
      if ((this.duR != null) && (str != null) && (str.length() > 0))
      {
        localBoolean = Boolean.valueOf(paramBoolean);
        if ((paramInt2 == 8) || (paramInt2 == 7)) {
          if (paramBoolean) {
            break label187;
          }
        }
      }
    }
    label182:
    label187:
    for (paramBoolean = true;; paramBoolean = false)
    {
      localBoolean = Boolean.valueOf(paramBoolean);
      this.duR.edit().putBoolean(str, localBoolean.booleanValue()).commit();
      return true;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
      paramInt1 = 2;
      break label59;
    }
  }
  
  public static void c(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool2 = false;
    int j = 1;
    paramContext = paramContext.getSharedPreferences(paramContext.getPackageName() + "_preferences", 0);
    Object localObject = paramContext.edit();
    boolean bool1;
    if (!paramBoolean1)
    {
      bool1 = true;
      ((SharedPreferences.Editor)localObject).putBoolean("settings_find_me_by_mobile", bool1).commit();
      paramContext = paramContext.edit();
      bool1 = bool2;
      if (!paramBoolean2) {
        bool1 = true;
      }
      paramContext.putBoolean("settings_recommend_mobilefriends_to_me", bool1).commit();
      i = q.GJ();
      if (!paramBoolean1) {
        break label264;
      }
      i |= 0x200;
      label114:
      if (!paramBoolean2) {
        break label273;
      }
      i |= 0x100;
      label124:
      com.tencent.mm.kernel.g.Ei().DT().set(7, Integer.valueOf(i));
      paramContext = new xt();
      paramContext.rDz = 8;
      if (!paramBoolean2) {
        break label282;
      }
      i = 1;
      label159:
      paramContext.rDA = i;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(23, paramContext));
      localObject = new xt();
      ((xt)localObject).rDz = 7;
      if (!paramBoolean1) {
        break label287;
      }
    }
    label264:
    label273:
    label282:
    label287:
    for (int i = j;; i = 2)
    {
      paramContext.rDA = i;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(23, (com.tencent.mm.bk.a)localObject));
      com.tencent.mm.plugin.account.a.a.ezo.vl();
      return;
      bool1 = false;
      break;
      i &= 0xFDFF;
      break label114;
      i &= 0xFEFF;
      break label124;
      i = 2;
      break label159;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.bind_mobile_status;
  }
  
  protected final void initView()
  {
    boolean bool2 = true;
    this.eFS = ((ImageView)findViewById(a.f.bind_m_contact_status_state_icon));
    this.eGJ = ((TextView)findViewById(a.f.bind_m_contact_status_bind_state_title));
    this.eGm = ((TextView)findViewById(a.f.bind_m_contact_status_bind_state_hint));
    this.eGn = ((Button)findViewById(a.f.bind_m_contact_status_ok_btn));
    this.eGK = ((ImageView)findViewById(a.f.bind_setttings_find_me_by_mobile));
    this.eGL = ((ImageView)findViewById(a.f.bind_settings_recommend_friends_with_contacts));
    this.eGO = ((RelativeLayout)findViewById(a.f.bind_m_contact_status_RL));
    this.eGP = ((RelativeLayout)findViewById(a.f.bind_m_contact_status_RL1));
    switch (this.eGR)
    {
    default: 
      if (this.eGQ != null) {}
      switch (this.eGQ.brl.intValue())
      {
      case 0: 
      case 1: 
      default: 
        label184:
        this.eGn.setVisibility(8);
        addTextOptionMenu(0, getString(a.j.app_finish), new BindMobileStatusUI.1(this));
        if ((com.tencent.mm.plugin.account.friend.a.l.XC() == l.a.eKt) || (com.tencent.mm.plugin.account.friend.a.l.XC() == l.a.eKu))
        {
          this.eFS.setImageResource(a.e.bind_mcontact_success);
          String str = (String)com.tencent.mm.kernel.g.Ei().DT().get(6, null);
          if ((str == null) || (str.equals(""))) {
            com.tencent.mm.kernel.g.Ei().DT().get(4097, null);
          }
        }
        break;
      }
      break;
    }
    for (;;)
    {
      this.eGK.setOnClickListener(new BindMobileStatusUI.2(this));
      this.eGL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          boolean bool2 = true;
          paramAnonymousView = BindMobileStatusUI.this;
          if (!BindMobileStatusUI.d(BindMobileStatusUI.this).booleanValue())
          {
            bool1 = true;
            BindMobileStatusUI.b(paramAnonymousView, Boolean.valueOf(bool1));
            if (!BindMobileStatusUI.d(BindMobileStatusUI.this).booleanValue()) {
              break label120;
            }
            BindMobileStatusUI.e(BindMobileStatusUI.this).setImageResource(a.i.checkbox_selected);
            label57:
            paramAnonymousView = BindMobileStatusUI.this;
            if (BindMobileStatusUI.d(BindMobileStatusUI.this).booleanValue()) {
              break label136;
            }
          }
          label120:
          label136:
          for (boolean bool1 = bool2;; bool1 = false)
          {
            BindMobileStatusUI.a(paramAnonymousView, bool1, 256, 7);
            if (!BindMobileStatusUI.d(BindMobileStatusUI.this).booleanValue()) {
              BindMobileStatusUI.a(BindMobileStatusUI.this, false, 2097152, 32);
            }
            return;
            bool1 = false;
            break;
            BindMobileStatusUI.e(BindMobileStatusUI.this).setImageResource(a.i.checkbox_unselected);
            break label57;
          }
        }
      });
      this.eGn.setOnClickListener(new BindMobileStatusUI.4(this));
      return;
      this.eGO.setVisibility(8);
      this.eGP.setVisibility(8);
      if (!this.eGS)
      {
        bool1 = true;
        label358:
        a(bool1, 512, 8);
        if (this.eGT) {
          break label397;
        }
      }
      label397:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        a(bool1, 256, 7);
        break;
        bool1 = false;
        break label358;
      }
      this.eGO.setVisibility(0);
      this.eGO.setBackgroundResource(a.e.bind_preference_one_item);
      this.eGP.setVisibility(8);
      break;
      this.eGm.setVisibility(8);
      break label184;
      this.eFS.setImageResource(a.e.bind_mcontact_error);
      this.eGm.setVisibility(8);
      this.eGJ.setText(getString(a.j.bind_mcontact_bind_error));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.duR = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.status = q.GJ();
    this.eGV.put(8, "settings_find_me_by_mobile");
    this.eGV.put(7, "settings_recommend_mobilefriends_to_me");
    this.eGV.put(32, "settings_autoadd_mobilefriends");
    a(false, 512, 8);
    a(false, 256, 7);
    setMMTitle(a.j.bind_mcontact_title_bind_finish);
    this.eGQ = ((BindWordingContent)getIntent().getParcelableExtra("kstyle_bind_wording"));
    this.eGR = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
    this.eGS = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
    this.eGT = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
    initView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      DT(1);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
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
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BindMobileStatusUI", "switch  " + i + " " + j);
    }
    this.eGU.clear();
    super.onPause();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/BindMobileStatusUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */