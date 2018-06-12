package com.tencent.mm.plugin.aa.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.aa.a.d;
import com.tencent.mm.plugin.aa.a.k;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.d.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LaunchAAUI
  extends BaseAAPresenterActivity
{
  private String chatroomName = null;
  private TextView eBQ;
  private Dialog eBX;
  private TextView eDA;
  private TextView eDB;
  private ViewGroup eDC;
  private ViewGroup eDD;
  private List<String> eDE = new ArrayList();
  private ViewGroup eDF;
  private ViewGroup eDG;
  private TextView eDH;
  private ViewGroup eDI;
  private Map<String, Double> eDJ = new HashMap();
  private Map<String, LaunchAAByPersonNameAmountRow> eDK = new HashMap();
  private Button eDL;
  private TextView eDM;
  private TextView eDN;
  private d eDO = new d();
  private int eDP = 0;
  private int eDQ = 0;
  private boolean eDR = false;
  private boolean eDc = false;
  private com.tencent.mm.plugin.aa.a.c.e eDs = (com.tencent.mm.plugin.aa.a.c.e)t(com.tencent.mm.plugin.aa.a.c.e.class);
  private boolean eDt = false;
  private MMEditText eDu;
  private TextView eDv;
  private TextView eDw;
  private TextView eDx;
  private TextView eDy;
  private WalletFormView eDz;
  private int mode = com.tencent.mm.plugin.aa.a.a.ezD;
  private long timestamp = 0L;
  
  private void Wu()
  {
    if (this.mode == com.tencent.mm.plugin.aa.a.a.ezD)
    {
      str1 = getString(a.i.launch_aa_by_money_title_1);
      str2 = getString(a.i.launch_aa_by_money_title_2);
      localSpannableStringBuilder = new SpannableStringBuilder("");
      localSpannableStringBuilder.append(str1);
      localSpannableStringBuilder.append(str2);
      localSpannableStringBuilder.setSpan(new a(new a.a()
      {
        public final void We()
        {
          LaunchAAUI.e(LaunchAAUI.this);
        }
      }), str1.length(), localSpannableStringBuilder.length(), 18);
      this.eDx.setText(localSpannableStringBuilder);
    }
    while (this.mode != com.tencent.mm.plugin.aa.a.a.ezE) {
      return;
    }
    String str1 = getString(a.i.launch_aa_by_person_title_1);
    String str2 = getString(a.i.launch_aa_by_person_title_2);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder("");
    localSpannableStringBuilder.append(str1);
    localSpannableStringBuilder.append(str2);
    localSpannableStringBuilder.setSpan(new a(new LaunchAAUI.3(this)), str1.length(), localSpannableStringBuilder.length(), 18);
    this.eDx.setText(localSpannableStringBuilder);
  }
  
  private void Wv()
  {
    this.eDR = false;
    if (this.eDM.getVisibility() != 8)
    {
      this.eDM.startAnimation(AnimationUtils.loadAnimation(this, com.tencent.mm.plugin.wxpay.a.a.out_to_up));
      this.eDM.setVisibility(8);
    }
  }
  
  private void Ww()
  {
    if (this.mode == com.tencent.mm.plugin.aa.a.a.ezD)
    {
      if (bi.oW(this.eDz.getText()))
      {
        cd(false);
        return;
      }
      if (this.eDc)
      {
        cd(false);
        return;
      }
      if ((this.eDE == null) || (this.eDE.size() == 0))
      {
        cd(false);
        return;
      }
      if ((this.eDE.size() > d.VV()) || (this.eDt))
      {
        cd(false);
        return;
      }
      double d = com.tencent.mm.plugin.aa.a.h.a(this.eDz.getText(), this.eDE.size(), 5, 4);
      x.d("MicroMsg.LaunchAAUI", "b1: %s, b2: %s, avg: %s", new Object[] { this.eDz.getText(), Integer.valueOf(this.eDE.size()), Double.valueOf(d) });
      if (d < 0.01D)
      {
        x.i("MicroMsg.LaunchAAUI", "less than 0.01");
        cd(false);
      }
    }
    else
    {
      if ((this.eDJ == null) || (this.eDJ.size() == 0))
      {
        cd(false);
        return;
      }
      if ((this.eDJ.size() > d.VV()) || (this.eDt))
      {
        cd(false);
        return;
      }
    }
    cd(true);
  }
  
  private void Wx()
  {
    if (this.mode == com.tencent.mm.plugin.aa.a.a.ezD)
    {
      if ((this.eDE != null) && (this.eDE.size() > 0))
      {
        d = com.tencent.mm.plugin.aa.a.h.a(this.eDz.getText(), this.eDE.size(), 2, 2);
        this.eBQ.setText(getString(a.i.aa_amount_format, new Object[] { Double.valueOf(d) }));
      }
      for (;;)
      {
        this.eDv.setText(a.i.launch_aa_by_money_total_amount_hint);
        return;
        this.eBQ.setText(getString(a.i.aa_amount_zero));
      }
    }
    if ((this.eDJ == null) || (this.eDJ.size() == 0))
    {
      this.eDv.setText(getString(a.i.launch_aa_by_person_total_amount_hint, new Object[] { Integer.valueOf(0) }));
      this.eBQ.setText(getString(a.i.aa_amount_zero));
      return;
    }
    Iterator localIterator = this.eDJ.values().iterator();
    for (double d = 0.0D; localIterator.hasNext(); d = ((Double)localIterator.next()).doubleValue() + d) {}
    this.eBQ.setText(getString(a.i.aa_amount_format, new Object[] { Double.valueOf(d) }));
    this.eDv.setText(getString(a.i.launch_aa_by_person_total_amount_hint, new Object[] { Integer.valueOf(this.eDJ.size()) }));
  }
  
  private void Wy()
  {
    com.tencent.mm.plugin.report.service.h.mEJ.h(13721, new Object[] { Integer.valueOf(3), Integer.valueOf(3) });
    HashMap localHashMap = new HashMap();
    for (;;)
    {
      try
      {
        String str1 = this.eDu.getText().toString();
        if (bi.oW(str1))
        {
          str1 = getString(a.i.launch_aa_default_title);
          ArrayList localArrayList1 = new ArrayList();
          ArrayList localArrayList2 = new ArrayList();
          Object localObject = this.eDJ.keySet().iterator();
          long l1 = 0L;
          if (((Iterator)localObject).hasNext())
          {
            String str2 = (String)((Iterator)localObject).next();
            double d = ((Double)this.eDJ.get(str2)).doubleValue();
            com.tencent.mm.protocal.c.j localj = new com.tencent.mm.protocal.c.j();
            localj.cfh = com.tencent.mm.wallet_core.ui.e.gq(String.valueOf(d), "100");
            localj.username = str2;
            localArrayList1.add(localj);
            long l2 = localj.cfh;
            localArrayList2.add(localj.cfh);
            l1 = l2 + l1;
          }
          else
          {
            localObject = new com.tencent.mm.protocal.c.j();
            ((com.tencent.mm.protocal.c.j)localObject).username = q.GF();
            ((com.tencent.mm.protocal.c.j)localObject).cfh = l1;
            localHashMap.put(k.eAy, str1);
            localHashMap.put(k.eAz, Long.valueOf(l1));
            localHashMap.put(k.eAE, localArrayList1);
            localHashMap.put(k.eAC, this.chatroomName);
            localHashMap.put(k.eAF, Long.valueOf(this.timestamp));
            if (this.eBX != null) {
              this.eBX.dismiss();
            }
            this.eBX = com.tencent.mm.wallet_core.ui.g.b(this, false, null);
            localObject = this.eDs.eBt;
            com.tencent.mm.vending.g.g.cx(localHashMap).c((com.tencent.mm.vending.c.a)localObject).f(new LaunchAAUI.13(this)).a(new LaunchAAUI.11(this));
            com.tencent.mm.plugin.report.service.h.mEJ.h(13723, new Object[] { Integer.valueOf(2), Integer.valueOf(com.tencent.mm.plugin.aa.a.h.pb(this.chatroomName).size()), Integer.valueOf(localArrayList1.size() + 1), Long.valueOf(l1), str1, bi.c(localArrayList2, ",") });
            return;
          }
        }
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.LaunchAAUI", "launchAAByPerson error: %s", new Object[] { localException.getMessage() });
        return;
      }
    }
  }
  
  private void Wz()
  {
    if ((this.eDt) && (!this.eDR)) {
      if (this.mode == com.tencent.mm.plugin.aa.a.a.ezD) {
        pg(getString(a.i.launch_aa_by_person_number_exceed_limit_alert, new Object[] { Integer.valueOf(d.VV()) }));
      }
    }
    do
    {
      return;
      pg(getString(a.i.launch_aa_by_person_number_exceed_limit_alert, new Object[] { Integer.valueOf(d.VU()) }));
      return;
      if ((this.eDc) && (!this.eDR))
      {
        pg(getString(a.i.launch_aa_money_exceed_avg_amount_alert, new Object[] { Float.valueOf((float)d.VW() / 100.0F) }));
        return;
      }
    } while ((this.eDt) || (this.eDc));
    Wv();
  }
  
  private void cd(boolean paramBoolean)
  {
    this.eDL.setEnabled(paramBoolean);
    if (!paramBoolean)
    {
      this.eDv.setTextColor(getResources().getColor(a.c.aa_launch_amount_disable_color));
      this.eBQ.setTextColor(getResources().getColor(a.c.aa_launch_amount_disable_color));
      this.eDw.setTextColor(getResources().getColor(a.c.aa_launch_amount_disable_color));
      return;
    }
    this.eDv.setTextColor(getResources().getColor(a.c.black));
    this.eBQ.setTextColor(getResources().getColor(a.c.black));
    this.eDw.setTextColor(getResources().getColor(a.c.black));
  }
  
  private void pg(String paramString)
  {
    this.eDR = true;
    this.eDM.setVisibility(0);
    this.eDM.startAnimation(AnimationUtils.loadAnimation(this, com.tencent.mm.plugin.wxpay.a.a.in_from_up));
    this.eDM.setText(paramString);
  }
  
  protected final boolean Wt()
  {
    return false;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.launch_aa_ui_new;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    double d;
    if (paramInt1 == 233) {
      if (paramInt2 == -1)
      {
        paramIntent = paramIntent.getStringExtra("Select_Contact");
        if (this.mode == com.tencent.mm.plugin.aa.a.a.ezD)
        {
          if (!bi.oW(paramIntent))
          {
            paramIntent = paramIntent.split(",");
            this.eDE.clear();
            this.eDE.addAll(Arrays.asList(paramIntent));
          }
          paramIntent = com.tencent.mm.plugin.aa.a.h.pb(this.chatroomName);
          if ((paramIntent == null) || (this.eDE == null) || (this.eDE.size() != paramIntent.size()) || (!s.fq(this.chatroomName))) {
            break label287;
          }
          paramIntent = this.eDB;
          paramInt2 = a.i.launch_aa_by_money_all_group_member;
          if (this.eDE == null) {
            break label282;
          }
          paramInt1 = this.eDE.size();
          paramIntent.setText(getString(paramInt2, new Object[] { Integer.valueOf(paramInt1) }));
        }
        Wv();
        if ((this.eDE == null) || (this.eDE.size() <= d.VV())) {
          break label341;
        }
        this.eDt = true;
        d = bi.getDouble(this.eDz.getText(), 0.0D);
        if ((this.eDE == null) || (d * 100.0D / this.eDE.size() <= d.VW())) {
          break label349;
        }
        this.eDc = true;
        com.tencent.mm.plugin.report.service.h.mEJ.h(13722, new Object[] { Integer.valueOf(2) });
        Ww();
        Wx();
        Wz();
      }
    }
    label282:
    label287:
    label341:
    label349:
    while ((paramInt1 != 236) || (paramInt2 != -1)) {
      for (;;)
      {
        return;
        paramInt1 = 0;
        continue;
        paramIntent = this.eDB;
        paramInt2 = a.i.launch_aa_by_money_usernumber_wording;
        if (this.eDE != null) {}
        for (paramInt1 = this.eDE.size();; paramInt1 = 0)
        {
          paramIntent.setText(getString(paramInt2, new Object[] { Integer.valueOf(paramInt1) }));
          break;
        }
        this.eDt = false;
        continue;
        this.eDc = false;
      }
    }
    paramIntent = paramIntent.getStringArrayListExtra("selectUI");
    this.eDJ.clear();
    Object localObject;
    if (paramIntent != null) {
      try
      {
        if (paramIntent.size() > 0)
        {
          paramIntent = paramIntent.iterator();
          while (paramIntent.hasNext())
          {
            localObject = ((String)paramIntent.next()).split(",");
            d = bi.getDouble(localObject[1], 0.0D);
            this.eDJ.put(localObject[0], Double.valueOf(d));
          }
        }
        if (this.eDJ == null) {
          break label848;
        }
      }
      catch (Exception paramIntent)
      {
        x.e("MicroMsg.LaunchAAUI", "onActivityResult, SELECT_AMOUNT_SELECT_REQUEST_CODE error: %s", new Object[] { paramIntent.getMessage() });
        return;
      }
    }
    if (this.eDJ.size() > 0)
    {
      this.eDH.setText(getString(a.i.launch_aa_by_person_usernumber_wording, new Object[] { Integer.valueOf(this.eDJ.size()) }));
      this.eDH.setTextColor(getResources().getColor(a.c.black));
      paramInt1 = (int)getResources().getDimension(a.d.aa_launch_content_left_right_margin);
      paramInt2 = (int)getResources().getDimension(a.d.aa_launch_by_person_header_margin_large);
      int i = (int)getResources().getDimension(a.d.aa_launch_by_person_header_margin_large_bottom);
      this.eDI.setPadding(paramInt1, paramInt2, paramInt1, i);
      this.eDI.setBackgroundResource(a.e.launch_aa_dark_round_corner_bg);
      this.eDG.setVisibility(0);
    }
    for (;;)
    {
      this.eDG.removeAllViews();
      this.eDK.clear();
      if ((this.eDJ == null) || (this.eDJ.size() <= 0)) {
        break;
      }
      paramIntent = this.eDJ.keySet().iterator();
      paramInt1 = 0;
      while (paramIntent.hasNext())
      {
        localObject = (String)paramIntent.next();
        d = ((Double)this.eDJ.get(localObject)).doubleValue();
        LaunchAAByPersonNameAmountRow localLaunchAAByPersonNameAmountRow = new LaunchAAByPersonNameAmountRow(this);
        if (paramInt1 >= this.eDJ.size() - 1) {
          localLaunchAAByPersonNameAmountRow.setDividerVisible(false);
        }
        String str = this.chatroomName;
        localLaunchAAByPersonNameAmountRow.eCM.setText(com.tencent.mm.pluginsdk.ui.d.j.a(localLaunchAAByPersonNameAmountRow.getContext(), ((b)com.tencent.mm.kernel.g.l(b.class)).getDisplayName((String)localObject, str), localLaunchAAByPersonNameAmountRow.eCM.getTextSize()));
        localLaunchAAByPersonNameAmountRow.eBQ.setText(localLaunchAAByPersonNameAmountRow.getContext().getString(a.i.aa_amount_format, new Object[] { Double.valueOf(d) }));
        this.eDG.addView(localLaunchAAByPersonNameAmountRow);
        this.eDK.put(localObject, localLaunchAAByPersonNameAmountRow);
        paramInt1 += 1;
      }
      label848:
      this.eDH.setText(a.i.launch_aa_by_person_usernumber_default_wording);
      this.eDH.setTextColor(getResources().getColor(a.c.aa_comm_hint_color));
      paramInt1 = (int)getResources().getDimension(a.d.aa_launch_content_left_right_margin);
      this.eDI.setPadding(paramInt1, paramInt1, paramInt1, paramInt1);
      this.eDI.setBackgroundResource(a.e.launch_aa_white_round_corner_bg);
      this.eDG.setVisibility(8);
    }
    if (this.eCD != null) {
      this.eCD.requestLayout();
    }
    this.eDQ = 0;
    this.eDy.post(new LaunchAAUI.14(this));
    Wx();
    Ww();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.LaunchAAUI", "LaunchAAUI onCreate");
    setBackBtn(new LaunchAAUI.1(this));
    this.timestamp = (System.currentTimeMillis() / 1000L);
    setMMTitle(a.i.launch_aa_title);
    paramBundle = this.eDs.eBu;
    com.tencent.mm.vending.g.g.cBK().c(paramBundle).f(new LaunchAAUI.20(this)).a(new LaunchAAUI.19(this));
    this.chatroomName = getIntent().getStringExtra("chatroom_name");
    if (bi.oW(this.chatroomName))
    {
      x.e("MicroMsg.LaunchAAUI", "chatroomName is null!!!");
      this.chatroomName = "";
    }
    paramBundle = this.chatroomName;
    if (!bi.oW(paramBundle)) {
      if (s.fq(paramBundle))
      {
        this.chatroomName = paramBundle;
        this.eCD = findViewById(a.f.root_container);
        this.eCD.setOnTouchListener(new LaunchAAUI.12(this));
        this.eDx = ((TextView)findViewById(a.f.launch_aa_switch_mode));
        this.eDx.setClickable(true);
        this.eDx.setOnTouchListener(new m(this));
        Wu();
        this.eDL = ((Button)findViewById(a.f.launch_aa_button));
        this.eDL.setOnClickListener(new LaunchAAUI.15(this));
        this.eDM = ((TextView)findViewById(a.f.launch_aa_alert_tip_tv));
        this.eDN = ((TextView)findViewById(a.f.launch_aa_warn_tip_tv));
        this.eDu = ((MMEditText)findViewById(a.f.launch_aa_title_edit));
        this.eDv = ((TextView)findViewById(a.f.launch_aa_total_amount_hint));
        this.eBQ = ((TextView)findViewById(a.f.launch_aa_amount));
        this.eDw = ((TextView)findViewById(a.f.launch_aa_amount_unit));
        this.eDv.setText(a.i.launch_aa_by_money_total_amount_hint);
        this.mode = com.tencent.mm.plugin.aa.a.a.ezD;
        this.eDy = ((TextView)findViewById(a.f.aa_check_record));
        this.eDy.setClickable(true);
        this.eDy.setOnTouchListener(new m());
        paramBundle = new SpannableString(getString(a.i.check_aa_record));
        paramBundle.setSpan(new a(new LaunchAAUI.16(this)), 0, paramBundle.length(), 18);
        this.eDy.setText(paramBundle);
        this.eDy.setVisibility(8);
        this.eDu.addTextChangedListener(new LaunchAAUI.17(this));
        this.eDz = ((WalletFormView)findViewById(a.f.launch_aa_total_amount_edit_form));
        this.eDz.a(new LaunchAAUI.5(this));
        a(this.eDz, 2, false, false);
        this.eDB = ((TextView)findViewById(a.f.launch_aa_by_money_user_select));
        this.eDA = ((TextView)findViewById(a.f.launch_aa_by_money_user_select_hint));
        if (!s.fq(this.chatroomName)) {
          break label846;
        }
        paramBundle = com.tencent.mm.plugin.aa.a.h.pb(this.chatroomName);
        label541:
        this.eDE = paramBundle;
        if (this.eDE.size() <= d.VV()) {
          break label897;
        }
        this.eDE.clear();
        this.eDB.setText(getString(a.i.paylist_aa_by_money_select_group_memeber));
        Ww();
      }
    }
    for (;;)
    {
      this.eDB.setOnClickListener(new LaunchAAUI.6(this, paramBundle));
      this.eDC = ((ViewGroup)findViewById(a.f.launch_by_money_total_usernumber_content_layout));
      this.eDD = ((ViewGroup)findViewById(a.f.launch_by_money_total_amount_layout));
      this.eDz.requestFocus();
      this.eDt = false;
      this.eDH = ((TextView)findViewById(a.f.launch_aa_by_person_user_select));
      this.eDH.setText(a.i.launch_aa_by_person_usernumber_default_wording);
      this.eDH.setTextColor(getResources().getColor(a.c.aa_comm_hint_color));
      this.eDF = ((ViewGroup)findViewById(a.f.launch_by_person_user_layout));
      this.eDG = ((ViewGroup)findViewById(a.f.launch_by_person_user_list_layout));
      this.eDI = ((ViewGroup)findViewById(a.f.launch_aa_by_person_select_header_layout));
      this.eDI.setOnClickListener(new LaunchAAUI.7(this));
      cd(false);
      com.tencent.mm.plugin.report.service.h.mEJ.h(13721, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
      this.eDy.post(new LaunchAAUI.18(this));
      return;
      paramBundle = bi.F(paramBundle.split(","));
      if (paramBundle != null)
      {
        paramBundle.remove(q.GF());
        if (paramBundle.size() > 0)
        {
          paramBundle = (String)paramBundle.get(0);
          break;
        }
      }
      paramBundle = "";
      break;
      label846:
      x.i("MicroMsg.LaunchAAUI", "is single chat: %s", new Object[] { this.chatroomName });
      paramBundle = new ArrayList();
      paramBundle.add(q.GF());
      paramBundle.add(this.chatroomName);
      break label541;
      label897:
      if (s.fq(this.chatroomName)) {
        this.eDB.setText(getString(a.i.launch_aa_by_money_all_group_member, new Object[] { Integer.valueOf(paramBundle.size()) }));
      } else {
        this.eDB.setText(getString(a.i.launch_aa_by_money_usernumber_wording, new Object[] { Integer.valueOf(paramBundle.size()) }));
      }
    }
  }
  
  protected void onStop()
  {
    super.onStop();
    if (this.eDK != null) {
      this.eDK.clear();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/LaunchAAUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */