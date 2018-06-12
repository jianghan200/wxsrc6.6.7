package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.d.d;
import com.tencent.mm.plugin.card.d.k;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.model.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.bqs;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.lg;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;

public class CardViewUI
  extends CardBaseUI
{
  private int Xe = 1;
  private String dxx = "";
  private LinkedList<lg> hBf = new LinkedList();
  private int hCB;
  private String hGQ;
  private View hGR;
  private int hop;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    int i = 0;
    if ((paraml instanceof t))
    {
      dO(false);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((t)paraml).hxb;
        if ((paramString != null) && (paramString.size() > 0))
        {
          if ((this.htl instanceof g))
          {
            paraml = (g)this.htl;
            if (paramString != null)
            {
              paraml.hzT.clear();
              paraml.hzT.addAll(paramString);
              paraml.hEV.clear();
              paramInt1 = i;
              while (paramInt1 < paramString.size())
              {
                paraml.hEV.add(new Boolean(true));
                paramInt1 += 1;
              }
            }
          }
          this.htl.notifyDataSetChanged();
        }
        return;
      }
      d.b(this, paramString, paramInt2);
      return;
    }
    super.a(paramInt1, paramInt2, paramString, paraml);
  }
  
  protected final void a(com.tencent.mm.plugin.card.base.b paramb)
  {
    if (this.Xe == 0)
    {
      am.axn().hts = ((CardInfo)paramb);
      Intent localIntent = new Intent(this, CardDetailUI.class);
      localIntent.putExtra("key_card_id", ((CardInfo)paramb).field_card_id);
      localIntent.putExtra("key_from_scene", 51);
      localIntent.putExtra("key_from_appbrand_type", this.hCB);
      startActivity(localIntent);
      return;
    }
    super.a(paramb);
  }
  
  protected final void a(CardInfo paramCardInfo)
  {
    if (this.Xe == 1)
    {
      this.hts = paramCardInfo;
      i(this.hGQ, 1, true);
    }
    do
    {
      return;
      super.a(paramCardInfo);
    } while (this.hts == null);
    h.mEJ.h(11582, new Object[] { "OperGift", Integer.valueOf(4), Integer.valueOf(this.hts.awm().huV), this.hts.field_card_tp_id, this.hts.field_card_id, this.hGQ });
  }
  
  protected final void avD()
  {
    int i;
    if (this.Xe == 0)
    {
      setMMTitle(a.g.card_view_ui_title);
      com.tencent.mm.kernel.g.Eh().dpP.a(699, this);
      i = a.g.card_accept_card_list_no_card_tips;
      if (this.Xe != 0) {
        break label155;
      }
      dO(true);
      Object localObject = new bqs();
      ((bqs)localObject).soQ = this.dxx;
      x.i("MicroMsg.CardViewUI", "doBatchGetCardItemByTpInfo templateId:%s", new Object[] { this.dxx });
      localObject = new t(this.hBf, (bqs)localObject, this.hop);
      com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject, 0);
      i = a.g.card_accept_card_list_no_card_tips;
    }
    for (;;)
    {
      findViewById(a.d.no_card_tip_img).setVisibility(8);
      ((TextView)findViewById(a.d.no_card_tip_text)).setText(i);
      return;
      if (this.Xe != 1) {
        break;
      }
      setMMTitle(a.g.card_gift_ui_title);
      break;
      label155:
      if (this.Xe == 1)
      {
        this.hGR = View.inflate(this, a.e.card_list_header_tip_layout, null);
        if (this.htn != null) {
          this.htn.addView(this.hGR);
        }
        i = a.g.card_show_none_gift_card;
      }
    }
  }
  
  protected final int avE()
  {
    return n.a.hwP;
  }
  
  protected final BaseAdapter avF()
  {
    if (this.Xe == 0) {
      return new g(getApplicationContext());
    }
    return super.avF();
  }
  
  protected final boolean avH()
  {
    if (this.Xe == 1) {
      return false;
    }
    return super.avH();
  }
  
  protected final void avI() {}
  
  protected final void b(com.tencent.mm.plugin.card.base.b paramb)
  {
    if (this.Xe == 1)
    {
      a((CardInfo)paramb);
      return;
    }
    super.b(paramb);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      x.e("MicroMsg.CardViewUI", "onCreate intent is null");
      finish();
      return;
    }
    this.hop = paramBundle.getIntExtra("key_previous_scene", 7);
    this.hCB = paramBundle.getIntExtra("key_from_appbrand_type", 0);
    this.Xe = paramBundle.getIntExtra("view_type", 0);
    this.hGQ = paramBundle.getStringExtra("user_name");
    paramBundle = paramBundle.getStringExtra("card_list");
    this.dxx = getIntent().getStringExtra("key_template_id");
    if (this.Xe == 0)
    {
      if (TextUtils.isEmpty(paramBundle))
      {
        x.e("MicroMsg.CardViewUI", "oncreate card_list is empty");
        finish();
        return;
      }
      paramBundle = k.bb(paramBundle, this.hop);
      if ((paramBundle != null) && (paramBundle.size() > 0))
      {
        this.hBf.clear();
        this.hBf.addAll(paramBundle);
      }
    }
    initView();
  }
  
  protected void onDestroy()
  {
    com.tencent.mm.kernel.g.Eh().dpP.b(699, this);
    super.onDestroy();
  }
  
  public void onSwipeBack()
  {
    super.onSwipeBack();
    if (this.hop == 26) {
      overridePendingTransition(0, 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */