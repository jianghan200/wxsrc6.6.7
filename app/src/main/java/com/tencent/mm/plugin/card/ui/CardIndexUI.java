package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.d.i;
import com.tencent.mm.plugin.card.model.ad;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.f;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.s.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;

public class CardIndexUI
  extends CardBaseUI
{
  private final String TAG = "MicroMsg.CardIndexUI";
  int fromScene = 0;
  private View hEK;
  private TextView hEL;
  private f hEM;
  private TextView hEN;
  private TextView hEO;
  private ImageView hEP;
  private LinearLayout hEQ;
  int hER = -1;
  private long mStartTime = 0L;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    super.a(paramInt1, paramInt2, paramString, paraml);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!(paraml instanceof com.tencent.mm.plugin.card.model.x)) {
        break label186;
      }
      this.hEM = i.xT((String)g.Ei().DT().get(282885, ""));
      if (this.hEM == null) {
        this.hEM = new f();
      }
      if ((this.hEM != null) && (!TextUtils.isEmpty(this.hEM.hwk))) {
        this.hEN.setText(this.hEM.hwk);
      }
      if ((this.hEM != null) && (this.hEM.hwn)) {
        break label127;
      }
      this.hEK.setVisibility(8);
    }
    label127:
    label186:
    while ((!(paraml instanceof ad)) || (!((ad)paraml).hxk) || (!(this.htl instanceof c)))
    {
      return;
      this.hEL.setText(this.hEM.hwl);
      if ((!TextUtils.isEmpty(this.hEM.hwl)) && (!TextUtils.isEmpty(this.hEM.hwm)))
      {
        this.hEK.setVisibility(0);
        return;
      }
      this.hEK.setVisibility(8);
      return;
    }
    ((c)this.htl).lB(false);
    ((c)this.htl).lB(true);
    ((c)this.htl).WT();
  }
  
  protected final void avD()
  {
    if (1 == this.hER)
    {
      setMMTitle(a.g.card_member_card_title);
      this.hEN = ((TextView)findViewById(a.d.no_card_tip_text));
      this.hEO = ((TextView)findViewById(a.d.no_card_tip_title));
      this.hEP = ((ImageView)findViewById(a.d.no_card_tip_img));
      this.hEK = findViewById(a.d.card_experience_layout);
      this.hEL = ((TextView)findViewById(a.d.card_experience_url_tv));
      this.hEQ = ((LinearLayout)findViewById(a.d.no_card_tip_layout));
      this.hEK.setVisibility(8);
      this.hEO.setVisibility(0);
      this.hEN.setVisibility(0);
      this.hEP.setVisibility(8);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.hEQ.getLayoutParams();
      localLayoutParams.topMargin = BackwardSupportUtil.b.b(this, 100.0F);
      this.hEQ.setLayoutParams(localLayoutParams);
      if (1 != this.hER) {
        break label239;
      }
      this.hEO.setText(getString(a.g.card_list_member_card_empty_tips_title));
      this.hEN.setText(getString(a.g.card_list_member_card_empty_tips));
    }
    for (;;)
    {
      this.hEL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if (!TextUtils.isEmpty(CardIndexUI.a(CardIndexUI.this).hwm)) {
            com.tencent.mm.plugin.card.d.b.a(CardIndexUI.this, CardIndexUI.a(CardIndexUI.this).hwm, 0);
          }
        }
      });
      return;
      if (3 == this.hER)
      {
        setMMTitle(a.g.card_ticket_title);
        break;
      }
      setMMTitle(a.g.card_mm_card_package_new);
      break;
      label239:
      if (3 == this.hER)
      {
        this.hEO.setText(getString(a.g.card_list_ticket_card_empty_tips_title));
        this.hEN.setText(getString(a.g.card_list_ticket_card_empty_tips));
      }
      else
      {
        this.hEO.setText(getString(a.g.card_select_list_no_card_tips));
        this.hEN.setText(getString(a.g.card_share_card_list_no_card_tips));
      }
    }
  }
  
  protected final int avE()
  {
    if (1 == this.hER) {
      return n.a.hwR;
    }
    if (3 == this.hER) {
      return n.a.hwQ;
    }
    return n.a.hwN;
  }
  
  protected final BaseAdapter avF()
  {
    if (3 == this.hER) {
      return new k(this, avE());
    }
    return new c(this, avE());
  }
  
  protected final void initView()
  {
    if (getIntent() != null) {
      this.hER = getIntent().getIntExtra("key_card_type", -1);
    }
    super.initView();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardIndexUI", "oncreate");
    this.mStartTime = System.currentTimeMillis();
    initView();
    g.Eh().dpP.a(984, this);
    am.axh();
    com.tencent.mm.plugin.card.b.b.nG(1);
    int i = am.axm().huN;
    if ((com.tencent.mm.s.c.Cp().aT(262152, 266256)) || (i > 0))
    {
      h.mEJ.h(11324, new Object[] { "CardPackageListView", Integer.valueOf(0), "", "", Integer.valueOf(1), Integer.valueOf(this.fromScene), "", Integer.valueOf(0), "" });
      return;
    }
    h.mEJ.h(11324, new Object[] { "CardPackageListView", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(this.fromScene), "", Integer.valueOf(0), "" });
  }
  
  protected void onDestroy()
  {
    g.Eh().dpP.b(984, this);
    long l1 = System.currentTimeMillis();
    long l2 = this.mStartTime;
    h.mEJ.h(13219, new Object[] { "CardPackageListView", Integer.valueOf(this.fromScene), "", "", Long.valueOf(l1 - l2) });
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
  
  protected void onStop()
  {
    super.onStop();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardIndexUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */