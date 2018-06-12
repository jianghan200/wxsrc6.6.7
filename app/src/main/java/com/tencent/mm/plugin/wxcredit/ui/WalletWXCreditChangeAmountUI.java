package com.tencent.mm.plugin.wxcredit.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.plugin.wxcredit.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.List;

public class WalletWXCreditChangeAmountUI
  extends WalletBaseUI
  implements View.OnClickListener
{
  private List<com.tencent.mm.plugin.wxcredit.a.l> qwQ;
  private List<com.tencent.mm.plugin.wxcredit.a.l> qwR = new ArrayList();
  private com.tencent.mm.plugin.wxcredit.a.l qwS;
  private com.tencent.mm.plugin.wxcredit.a.l qwT;
  private int qwU = -1;
  private boolean qwV;
  private boolean qwW;
  private TextView qwX;
  private TextView qwY;
  private TextView qwZ;
  private TextView qxa;
  private TextView qxb;
  private TextView qxc;
  private EditText qxd;
  private EditText qxe;
  private EditText qxf;
  private EditText qxg;
  private BaseAdapter qxh = new BaseAdapter()
  {
    private com.tencent.mm.plugin.wxcredit.a.l Bz(int paramAnonymousInt)
    {
      return (com.tencent.mm.plugin.wxcredit.a.l)WalletWXCreditChangeAmountUI.j(WalletWXCreditChangeAmountUI.this).get(paramAnonymousInt);
    }
    
    public final int getCount()
    {
      if (WalletWXCreditChangeAmountUI.j(WalletWXCreditChangeAmountUI.this) != null) {
        return WalletWXCreditChangeAmountUI.j(WalletWXCreditChangeAmountUI.this).size();
      }
      return 0;
    }
    
    public final long getItemId(int paramAnonymousInt)
    {
      return paramAnonymousInt;
    }
    
    public final View getView(int paramAnonymousInt, View paramAnonymousView, ViewGroup paramAnonymousViewGroup)
    {
      paramAnonymousView = (CheckedTextView)View.inflate(WalletWXCreditChangeAmountUI.this, a.g.wallet_list_dialog_item_singlechoice, null);
      paramAnonymousViewGroup = Bz(paramAnonymousInt);
      paramAnonymousView.setText(paramAnonymousViewGroup.desc);
      if (paramAnonymousViewGroup.qwH != 0) {}
      for (boolean bool = true;; bool = false)
      {
        paramAnonymousView.setChecked(bool);
        return paramAnonymousView;
      }
    }
  };
  private BaseAdapter qxi = new WalletWXCreditChangeAmountUI.2(this);
  
  private void aL()
  {
    if (this.qwS != null)
    {
      this.qwX.setText(this.qwS.desc);
      if (this.qwS.qwK == null) {
        break label293;
      }
      this.qxb.setVisibility(0);
      this.qxd.setVisibility(8);
      this.qwZ.setText(this.qwS.qwK.desc);
      this.qxe.setHint(this.qwS.qwK.hyz);
      if ("Y".equals(this.qwS.kQE))
      {
        this.qwZ.setVisibility(0);
        this.qxe.setVisibility(0);
        this.qxb.setText(a.i.app_yes);
      }
    }
    else if (this.qwT != null)
    {
      this.qwY.setText(this.qwT.desc);
      if (this.qwT.qwK == null) {
        break label389;
      }
      this.qxc.setVisibility(0);
      this.qxf.setVisibility(8);
      this.qxa.setText(this.qwT.qwK.desc);
      this.qxg.setHint(this.qwT.qwK.hyz);
      if (!"Y".equals(this.qwT.kQE)) {
        break label345;
      }
      this.qxa.setVisibility(0);
      this.qxg.setVisibility(0);
      this.qxc.setText(a.i.app_yes);
    }
    label293:
    label345:
    do
    {
      return;
      this.qwZ.setVisibility(8);
      this.qxe.setVisibility(8);
      if (!"N".equals(this.qwS.kQE)) {
        break;
      }
      this.qxb.setText(a.i.app_no);
      break;
      this.qxb.setVisibility(8);
      this.qxd.setVisibility(0);
      this.qxd.setHint(this.qwS.hyz);
      this.qwZ.setVisibility(8);
      this.qxe.setVisibility(8);
      break;
      this.qxa.setVisibility(8);
      this.qxg.setVisibility(8);
    } while (!"N".equals(this.qwT.kQE));
    this.qxc.setText(a.i.app_no);
    return;
    label389:
    this.qxc.setVisibility(8);
    this.qxf.setVisibility(0);
    this.qxf.setHint(this.qwT.hyz);
    this.qxa.setVisibility(8);
    this.qxg.setVisibility(8);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof e))
      {
        this.qwQ = ((e)paraml).qwo;
        this.qwU = ((e)paraml).qwp;
        if ((this.qwQ != null) && (this.qwQ.size() >= 2))
        {
          this.qwS = ((com.tencent.mm.plugin.wxcredit.a.l)this.qwQ.get(0));
          this.qwT = ((com.tencent.mm.plugin.wxcredit.a.l)this.qwQ.get(1));
          this.qwS.qwH = 1;
          this.qwT.qwH = 2;
        }
        aL();
        return true;
      }
    }
    else if ((paraml instanceof com.tencent.mm.plugin.wxcredit.a.c))
    {
      h.a(this, paramString, null, false, new WalletWXCreditChangeAmountUI.3(this));
      return true;
    }
    return false;
  }
  
  public final int getLayoutId()
  {
    return a.g.wallet_wxcredit_change_amount_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.wallet_wxcredit_qustion_title);
    this.qwX = ((TextView)findViewById(a.f.wallet_wxcredit_question_1));
    this.qwZ = ((TextView)findViewById(a.f.wallet_wxcredit_question_1_next));
    this.qwY = ((TextView)findViewById(a.f.wallet_wxcredit_question_2));
    this.qxa = ((TextView)findViewById(a.f.wallet_wxcredit_question_2_next));
    this.qxd = ((EditText)findViewById(a.f.wallet_wxcredit_answer_1));
    this.qxe = ((EditText)findViewById(a.f.wallet_wxcredit_answer_1_next));
    this.qxf = ((EditText)findViewById(a.f.wallet_wxcredit_answer_2));
    this.qxg = ((EditText)findViewById(a.f.wallet_wxcredit_answer_2_next));
    this.qxb = ((TextView)findViewById(a.f.wallet_wxcredit_answer_select_1));
    this.qxc = ((TextView)findViewById(a.f.wallet_wxcredit_answer_select_2));
    this.qxb.setOnClickListener(this);
    this.qxc.setOnClickListener(this);
    this.qwX.setOnClickListener(new WalletWXCreditChangeAmountUI.1(this));
    this.qwY.setOnClickListener(new WalletWXCreditChangeAmountUI.4(this));
    setBackBtn(new WalletWXCreditChangeAmountUI.5(this));
    findViewById(a.f.next_btn).setOnClickListener(new WalletWXCreditChangeAmountUI.6(this));
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == a.f.wallet_wxcredit_answer_select_1)
    {
      this.qwW = true;
      showDialog(2);
    }
    while (paramView.getId() != a.f.wallet_wxcredit_answer_select_2) {
      return;
    }
    this.qwW = false;
    showDialog(2);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    aL();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */