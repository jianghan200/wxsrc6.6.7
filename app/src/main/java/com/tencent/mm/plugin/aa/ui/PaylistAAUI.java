package com.tencent.mm.plugin.aa.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.aa.a.c.f;
import com.tencent.mm.plugin.aa.a.c.g.d;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.ui.d.m;
import com.tencent.mm.protocal.c.t;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.List;

public class PaylistAAUI
  extends BaseAAPresenterActivity
{
  private String bJh;
  private String bXw;
  private Dialog eBX = null;
  private View eCD;
  private com.tencent.mm.plugin.aa.a.c.g eDU = (com.tencent.mm.plugin.aa.a.c.g)t(com.tencent.mm.plugin.aa.a.c.g.class);
  private f eDV = (f)w(f.class);
  private LinearLayout eDW;
  private LinearLayout eDX;
  private LinearLayout eDY;
  private WalletTextView eDZ;
  private Button eEa;
  private TextView eEb;
  private TextView eEc;
  private TextView eEd;
  private TextView eEe;
  private String eEf;
  private String eEg;
  private String eEh;
  private int eEi;
  private String eEj;
  private long eEk;
  private String title;
  
  private static boolean C(int paramInt1, int paramInt2, int paramInt3)
  {
    return (paramInt1 == com.tencent.mm.plugin.aa.a.a.ezM) && (paramInt2 != com.tencent.mm.plugin.aa.a.a.ezQ) && (paramInt3 == com.tencent.mm.plugin.aa.a.a.ezI);
  }
  
  private void WA()
  {
    this.eBX = com.tencent.mm.wallet_core.ui.g.b(this, false, null);
    this.eCD.setVisibility(4);
    g.d locald = this.eDU.eBB;
    com.tencent.mm.vending.g.g.cBK().c(locald).f(new PaylistAAUI.10(this)).a(new PaylistAAUI.9(this));
  }
  
  private void a(LinearLayout paramLinearLayout, t paramt, boolean paramBoolean)
  {
    LinearLayout localLinearLayout = (LinearLayout)getLayoutInflater().inflate(a.g.paylist_aa_memeber_item, paramLinearLayout, false);
    Object localObject1 = (ImageView)localLinearLayout.findViewById(a.f.paylist_aa_member_avatar_iv);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(a.f.paylist_aa_member_name_tv);
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(a.f.paylist_aa_member_pay_state_tv);
    Object localObject2 = localLinearLayout.findViewById(a.f.divider);
    if (paramBoolean) {
      ((View)localObject2).setVisibility(8);
    }
    for (;;)
    {
      a.b.a((ImageView)localObject1, paramt.qYy);
      localObject1 = this.mController.tml;
      Object localObject3 = this.eDV;
      localObject2 = paramt.qYy;
      localObject3 = ((com.tencent.mm.vending.app.a)localObject3).uPN.getStringExtra("chatroom");
      localTextView1.setText(j.a((Context)localObject1, ((b)com.tencent.mm.kernel.g.l(b.class)).getDisplayName((String)localObject2, (String)localObject3), localTextView1.getTextSize()));
      if (paramt.qYA != com.tencent.mm.plugin.aa.a.a.ezT) {
        break;
      }
      localTextView2.setText(getString(a.i.paylist_aa_paid_money_title, new Object[] { Double.valueOf(paramt.qYl / 100.0D) }));
      localTextView2.setTextColor(getResources().getColor(a.c.paylist_done_receipt_text_color));
      localTextView2.setVisibility(0);
      paramLinearLayout.addView(localLinearLayout);
      return;
      ((View)localObject2).setVisibility(0);
    }
    if (paramt.qYA == com.tencent.mm.plugin.aa.a.a.ezS)
    {
      localTextView2.setText(getString(a.i.paylist_aa_by_person_member_unpaid_title, new Object[] { Double.valueOf(paramt.qYl / 100.0D) }));
      localTextView2.setTextColor(getResources().getColor(a.c.paylist_unreceipt_text_color));
      localTextView2.setVisibility(0);
      paramLinearLayout.addView(localLinearLayout);
      return;
    }
    localTextView2.setVisibility(8);
    paramLinearLayout.addView(localLinearLayout);
  }
  
  private void a(List<t> paramList, String paramString, boolean paramBoolean)
  {
    ((TextView)findViewById(a.f.paylist_aa_top_member_hint_tv)).setText(paramString);
    paramString = this.eEd;
    int i;
    label50:
    t localt;
    if (paramBoolean)
    {
      i = 0;
      paramString.setVisibility(i);
      paramString = (LinearLayout)findViewById(a.f.paylist_aa_top_member_layout);
      paramString.removeAllViews();
      i = 0;
      if (i >= paramList.size()) {
        return;
      }
      localt = (t)paramList.get(i);
      if (i < paramList.size() - 1) {
        break label113;
      }
    }
    label113:
    for (paramBoolean = true;; paramBoolean = false)
    {
      a(paramString, localt, paramBoolean);
      i += 1;
      break label50;
      i = 8;
      break;
    }
  }
  
  private void d(List<t> paramList, String paramString)
  {
    ((TextView)findViewById(a.f.paylist_aa_bottom_member_hint_tv)).setText(paramString);
    paramString = (LinearLayout)findViewById(a.f.paylist_aa_bottom_member_layout);
    paramString.removeAllViews();
    int i = 0;
    if (i < paramList.size())
    {
      t localt = (t)paramList.get(i);
      if (i >= paramList.size() - 1) {}
      for (boolean bool = true;; bool = false)
      {
        a(paramString, localt, bool);
        i += 1;
        break;
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.paylist_aa_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 233) {
      if (paramInt2 == -1)
      {
        x.i("MicroMsg.PaylistAAUI", "pay success, payMsgId: %s", new Object[] { this.bXw });
        localObject = (RealnameGuideHelper)paramIntent.getParcelableExtra("key_realname_guide_helper");
        if (localObject != null)
        {
          x.i("MicroMsg.PaylistAAUI", "do realname guide");
          Intent localIntent = new Intent();
          localIntent.putExtra("key_realname_guide_helper", (Parcelable)localObject);
          d.b(this, "wallet_core", ".id_verify.RealnameDialogActivity", localIntent);
        }
        com.tencent.mm.plugin.aa.a.h.pc(this.eEg);
        finish();
        localObject = this.eDU.eBD;
        com.tencent.mm.vending.g.g.a(this.bXw, this.eEh, this.eEj).c((com.tencent.mm.vending.c.a)localObject).f(new PaylistAAUI.7(this));
        com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 12L, 1L, false);
        paramIntent = paramIntent.getStringExtra("key_trans_id");
        localObject = this.eDU.eBE;
      }
    }
    do
    {
      com.tencent.mm.vending.g.g.a(Long.valueOf(this.eEk), this.bJh, paramIntent).c((com.tencent.mm.vending.c.a)localObject);
      do
      {
        return;
      } while ((paramInt1 != 222) || (paramInt2 != -1));
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      x.i("MicroMsg.PaylistAAUI", "select chatroom：%s", new Object[] { paramIntent });
    } while (bi.oW(paramIntent));
    Object localObject = new Intent(this.mController.tml, LaunchAAUI.class);
    ((Intent)localObject).putExtra("enter_scene", 3);
    ((Intent)localObject).putExtra("chatroom_name", paramIntent);
    startActivity((Intent)localObject);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setBackBtn(new PaylistAAUI.1(this));
    setMMTitle(a.i.launch_aa_title);
    this.eEg = getIntent().getStringExtra("chatroom");
    this.eDW = ((LinearLayout)findViewById(a.f.paylist_aa_pay_info_layout));
    this.eDX = ((LinearLayout)findViewById(a.f.paylist_aa_instant_pay_layout));
    this.eDY = ((LinearLayout)findViewById(a.f.paylist_aa_bottom_layout));
    this.eEb = ((TextView)findViewById(a.f.paylist_aa_pay_info_msg_tv));
    this.eEc = ((TextView)findViewById(a.f.paylist_aa_close_info_msg_tv));
    this.eCD = findViewById(a.f.root_container);
    this.eEd = ((TextView)findViewById(a.f.paylist_aa_send_tip_tv));
    this.eEd.setClickable(true);
    this.eEd.setOnTouchListener(new m(this));
    paramBundle = new SpannableStringBuilder(getString(a.i.paylist_aa_recevier_send_tip_title));
    paramBundle.setSpan(new a(new PaylistAAUI.8(this)), 0, paramBundle.length(), 18);
    this.eEd.setText(paramBundle);
    this.eEe = ((TextView)findViewById(a.f.paylist_aa_bottom_tip_tv));
    WA();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/PaylistAAUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */