package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.collect.b.j;
import com.tencent.mm.plugin.collect.b.p;
import com.tencent.mm.plugin.collect.b.r;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.k;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import com.tencent.mm.ui.y;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectBillUI
  extends WalletBaseUI
{
  private boolean dDR = false;
  private String eBd;
  private int fromScene;
  private k gcQ;
  private View hFL;
  private long hUf;
  private ListView hWR;
  private boolean hWZ = false;
  private a hXn;
  private LinearLayout hXo;
  private CollectBillHeaderView hXp;
  private ImageView hXq;
  private MMSwitchBtn hXr;
  private ImageView hXs;
  private MMSwitchBtn hXt;
  private TextView hXu;
  private boolean hXv = false;
  private boolean hXw = true;
  private long hXx;
  private com.tencent.mm.ab.e hXy = new CollectBillUI.1(this);
  private n.d hXz = new CollectBillUI.7(this);
  private int limit = 20;
  private int type;
  
  private void aCf()
  {
    if (!this.dDR)
    {
      a(new r(this.type, this.hUf, this.eBd, this.limit), true, false);
      this.hWZ = true;
    }
  }
  
  private void ajx()
  {
    this.hWR.setVisibility(8);
    this.hXo.setVisibility(0);
    findViewById(a.f.collect_bill_empty_tv).setVisibility(0);
  }
  
  private void e(int paramInt1, int paramInt2, long paramLong)
  {
    if (this.hXw)
    {
      CollectBillHeaderView localCollectBillHeaderView = this.hXp;
      int i = this.type;
      localCollectBillHeaderView.hWO.setText(com.tencent.mm.plugin.collect.b.e.a(localCollectBillHeaderView.getContext(), paramLong, i));
      localCollectBillHeaderView.hWP.setText(com.tencent.mm.plugin.collect.b.e.os(paramInt2));
      localCollectBillHeaderView.hVS.setText(localCollectBillHeaderView.getContext().getString(a.i.collect_bill_total_num_text, new Object[] { Integer.valueOf(paramInt1) }));
      this.hXw = false;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    Object localObject;
    if ((paraml instanceof r))
    {
      paramString = (r)paraml;
      if (this.hXv)
      {
        this.hWR.removeFooterView(this.hFL);
        this.hXv = false;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.dDR = paramString.dDR;
        this.type = paramString.type;
        this.hUf = paramString.hUf;
        e(paramString.hUg, paramString.hUh, paramString.hUf);
        if (!paramString.hUJ.isEmpty())
        {
          if (bi.oW(this.eBd))
          {
            x.d("MicroMsg.CollectBillUI", "first query, hide block view");
            this.hWR.setVisibility(0);
            this.hXo.setVisibility(8);
          }
          paraml = this.hXn;
          localObject = paramString.hUJ;
          paraml.hWN.addAll((Collection)localObject);
          paraml.notifyDataSetChanged();
          this.eBd = ((com.tencent.mm.plugin.collect.b.a)paramString.hUJ.get(paramString.hUJ.size() - 1)).hTH;
        }
        for (;;)
        {
          this.hWZ = false;
          return true;
          this.dDR = true;
          if (bi.oW(this.eBd))
          {
            x.i("MicroMsg.CollectBillUI", "no record, show empty view");
            ajx();
          }
        }
      }
      x.i("MicroMsg.CollectBillUI", "net error!");
      this.hWZ = false;
      Toast.makeText(this, a.i.collect_bill_item_load_fail_text, 1).show();
      if (bi.oW(this.eBd)) {
        x.i("MicroMsg.CollectBillUI", "first query failed, finish activity!");
      }
      return true;
    }
    if ((paraml instanceof p))
    {
      paraml = (p)paraml;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = this.hXn;
        localObject = paraml.hTH;
        Iterator localIterator = paramString.hWN.iterator();
        while (localIterator.hasNext())
        {
          com.tencent.mm.plugin.collect.b.a locala = (com.tencent.mm.plugin.collect.b.a)localIterator.next();
          if (locala.hTH.equals(localObject))
          {
            paramString.hWN.remove(locala);
            paramString.notifyDataSetChanged();
          }
        }
        if (this.hXn.getCount() <= 0)
        {
          x.i("MicroMsg.CollectBillUI", "delete all records");
          ajx();
        }
        for (;;)
        {
          return false;
          e(paraml.hUg, paraml.hUh, this.hUf);
        }
      }
      x.i("MicroMsg.CollectBillUI", "net error, errType: %s, errCode: %s, errMsg: %s, billId: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paraml.hTH });
      Toast.makeText(this, a.i.collect_bill_item_del_fail_text, 1).show();
      return false;
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.collect_bill;
  }
  
  protected final void initView()
  {
    this.hWR = ((ListView)findViewById(a.f.collect_bill_lv));
    this.hXo = ((LinearLayout)findViewById(a.f.collect_bill_empty_ll));
    this.hXu = ((TextView)findViewById(a.f.collect_banner_tips));
    this.hFL = y.gq(this).inflate(a.g.collect_bill_loading_view, this.hWR, false);
    this.hXp = new CollectBillHeaderView(this);
    this.hWR.addHeaderView(this.hXp, null, false);
    this.hXn = new a(this);
    this.hWR.setAdapter(this.hXn);
    this.hWR.setOnScrollListener(new CollectBillUI.2(this));
    this.gcQ = new k(this);
    this.hWR.setOnItemClickListener(new CollectBillUI.3(this));
    this.hWR.setOnItemLongClickListener(new CollectBillUI.4(this));
    if (this.fromScene != 2) {
      addTextOptionMenu(0, getString(a.i.collect_bill_list_title), new CollectBillUI.5(this));
    }
    Object localObject;
    if (this.fromScene == 2)
    {
      localObject = this.hXp.findViewById(a.f.collect_rint_switch_layout);
      View localView = this.hXo.findViewById(a.f.collect_ring_switch_empty_layout);
      ((View)localObject).setVisibility(8);
      localView.setVisibility(8);
      return;
    }
    this.hXq = ((ImageView)this.hXp.findViewById(a.f.collect_ring_icon_iv));
    this.hXr = ((MMSwitchBtn)this.hXp.findViewById(a.f.collect_ring_switch_btn));
    this.hXs = ((ImageView)this.hXo.findViewById(a.f.collect_ring_icon_iv));
    this.hXt = ((MMSwitchBtn)this.hXo.findViewById(a.f.collect_ring_switch_btn));
    com.tencent.mm.plugin.collect.a.a.aBC();
    if (com.tencent.mm.plugin.collect.a.a.aBE())
    {
      this.hXr.setCheck(true);
      this.hXt.setCheck(true);
      this.hXq.setImageResource(a.h.collect_sound_on);
      this.hXs.setImageResource(a.h.collect_sound_on);
    }
    for (;;)
    {
      localObject = new CollectBillUI.6(this);
      this.hXr.setSwitchListener((MMSwitchBtn.a)localObject);
      this.hXt.setSwitchListener((MMSwitchBtn.a)localObject);
      return;
      this.hXr.setCheck(false);
      this.hXt.setCheck(false);
      this.hXq.setImageResource(a.h.collect_sound_off);
      this.hXs.setImageResource(a.h.collect_sound_off);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.hXx = q.GK();
    this.fromScene = getIntent().getIntExtra("key_from_scene", 0);
    this.type = getIntent().getIntExtra("key_type", 0);
    this.hUf = getIntent().getLongExtra("key_timestamp", System.currentTimeMillis() / 1000L);
    aCf();
    initView();
    setMMTitle(a.i.collect_bill_title);
    g.Ek();
    g.Eh().dpP.a(1256, this.hXy);
    paramBundle = new j();
    g.Ek();
    g.Eh().dpP.a(paramBundle, 0);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    paramContextMenu.add(0, 0, 0, a.i.collect_bill_menu_item_del_text);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    g.Ek();
    g.Eh().dpP.b(1256, this.hXy);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/CollectBillUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */