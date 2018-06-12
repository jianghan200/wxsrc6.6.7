package com.tencent.mm.plugin.collect.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.collect.b.q;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView.g;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.y;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.g;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CollectBillListUI
  extends WalletBaseUI
{
  private Dialog eXG;
  private View hFL;
  private int hUF = 0;
  private ListView hWR;
  private b hWS;
  private LinearLayout hWT;
  private CollectPullDownView hWU;
  private TextView hWV;
  private Dialog hWW;
  private boolean hWX = false;
  private boolean hWY = false;
  private boolean hWZ = false;
  private boolean hXa = false;
  private boolean hXb = false;
  private boolean hXc = false;
  private boolean hXd = true;
  private boolean hXe = false;
  private boolean hXf = false;
  private long hXg = 0L;
  private long hXh = 0L;
  private Calendar hXi;
  private List<com.tencent.mm.plugin.collect.b.h> hXj = new ArrayList();
  private int limit = 20;
  private int retryCount = 0;
  private int type = 0;
  
  private void a(int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    x.i("MicroMsg.CollectBillListUI", "get retry page, type: %d, timestamp: %s, tryNum: %d, directFlag: %d, chooseFlag: %d", new Object[] { Integer.valueOf(this.type), Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    a(new q(this.type, paramLong, paramInt2, this.limit, paramInt3, paramInt1), false, false);
    this.retryCount += 1;
  }
  
  private void aCe()
  {
    this.hWU.scrollTo(0, this.hWU.getTopHeight());
  }
  
  private void aCf()
  {
    int i = this.hWS.getCount();
    if (i > 0)
    {
      long l = this.hWS.ot(i - 1).hUf;
      if (l < this.hXh)
      {
        x.i("MicroMsg.CollectBillListUI", "server lastTimestamp is error! %s, %s", new Object[] { Long.valueOf(l), Long.valueOf(this.hXh) });
        this.hXh = l;
      }
    }
    x.i("MicroMsg.CollectBillListUI", "get next page, type: %d, timestamp: %s", new Object[] { Integer.valueOf(this.type), Long.valueOf(this.hXh) });
    a(new q(this.type, this.hXh, this.limit, 0), false, false);
    this.hWZ = true;
  }
  
  private void ajx()
  {
    this.hWR.setVisibility(8);
    this.hWT.setVisibility(0);
    this.hWV.setVisibility(0);
  }
  
  private void ec(boolean paramBoolean)
  {
    CollectPullDownView localCollectPullDownView = this.hWU;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      localCollectPullDownView.setBottomViewVisible(paramBoolean);
      return;
    }
  }
  
  private void yE(String paramString)
  {
    if (this.hWS.getCount() == 0)
    {
      x.i("MicroMsg.CollectBillListUI", "show empty view");
      if (!bi.oW(paramString))
      {
        this.hWV.setText(paramString);
        ajx();
      }
    }
    while (bi.oW(paramString)) {
      for (;;)
      {
        return;
        if (this.hXc)
        {
          this.hWV.setText(getString(a.i.collect_bill_list_empty_text1));
        }
        else
        {
          paramString = getString(a.i.collect_bill_list_empty_text1) + getString(a.i.collect_bill_list_empty_text2);
          this.hWV.setText(paramString);
        }
      }
    }
    Toast.makeText(this.mController.tml, paramString, 1).show();
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof q))
    {
      paraml = (q)paraml;
      if (this.eXG.isShowing()) {
        this.eXG.dismiss();
      }
      this.hWU.setLoadDataEnd(true);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paraml.hUF == 0)
        {
          if (this.hXb)
          {
            x.i("MicroMsg.CollectBillListUI", "is loading filter, skip!");
            return true;
          }
          if (paraml.hUG == 1)
          {
            this.hXd = paraml.dDR;
            if (!paraml.hUJ.isEmpty())
            {
              paramString = this.hWS;
              List localList = paraml.hUJ;
              paramString.hWN.addAll(0, localList);
              paramString.notifyDataSetChanged();
              this.hXg = ((com.tencent.mm.plugin.collect.b.h)paraml.hUJ.get(0)).hUf;
              this.hXa = false;
              this.hWY = false;
            }
          }
          for (;;)
          {
            return true;
            this.hXd = true;
            break;
            this.hXc = paraml.dDR;
            this.hWR.setVisibility(0);
            this.hWT.setVisibility(8);
            if (paraml.hUE)
            {
              if (!paraml.hUJ.isEmpty()) {
                this.hXj.addAll(paraml.hUJ);
              }
              if ((paraml.hUH == 0) && (paraml.hUI > 0) && (paraml.hUJ.isEmpty()))
              {
                x.i("MicroMsg.CollectBillListUI", "continue retry: %d", new Object[] { Integer.valueOf(this.retryCount) });
                a(paraml.hUI, paraml.hUf, paraml.hUG, paraml.hUF);
                return true;
              }
              this.retryCount = 0;
              if (this.hXj.size() > 0) {
                this.hWS.aL(this.hXj);
              }
              for (;;)
              {
                this.hWZ = false;
                this.hXh = paraml.hUf;
                aCe();
                ec(this.hXc);
                break;
                x.i("MicroMsg.CollectBillListUI", "retry data is empty");
                yE(paraml.fFG);
              }
            }
            if (!paraml.hUJ.isEmpty())
            {
              this.hWS.aL(paraml.hUJ);
              this.hXh = ((com.tencent.mm.plugin.collect.b.h)paraml.hUJ.get(paraml.hUJ.size() - 1)).hUf;
              if (this.hXh > paraml.hUf)
              {
                x.d("MicroMsg.CollectBillListUI", "use from_timestamp");
                this.hXh = paraml.hUf;
              }
              for (;;)
              {
                this.hWZ = false;
                aCe();
                ec(this.hXc);
                break;
                x.i("MicroMsg.CollectBillListUI", "last record timestamp is less than fromtimestamp, %s, %s", new Object[] { Long.valueOf(this.hXh), Long.valueOf(paraml.hUf) });
              }
            }
            if ((paraml.hUH == 0) && (paraml.hUI > 0))
            {
              x.i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", new Object[] { Integer.valueOf(paraml.hUI), Long.valueOf(paraml.hUf) });
              a(paraml.hUI, paraml.hUf, paraml.hUG, paraml.hUF);
              this.hXj.clear();
            }
            else
            {
              this.hWZ = false;
              aCe();
              x.i("MicroMsg.CollectBillListUI", "next loading is empty without retry");
              yE(paraml.fFG);
              ec(this.hXc);
            }
          }
        }
        this.hXc = paraml.dDR;
        if (paraml.hUE)
        {
          if (!paraml.hUJ.isEmpty()) {
            this.hXj.addAll(paraml.hUJ);
          }
          if ((paraml.hUH == 0) && (paraml.hUI > 0))
          {
            x.i("MicroMsg.CollectBillListUI", "continue retry: %d", new Object[] { Integer.valueOf(this.retryCount) });
            a(paraml.hUI, paraml.hUf, paraml.hUG, paraml.hUF);
          }
          for (;;)
          {
            return true;
            this.retryCount = 0;
            this.hXd = true;
            this.hXh = paraml.hUf;
            if (paraml.hUH == 0) {}
            for (this.hXc = false;; this.hXc = true)
            {
              if (this.hXj.size() <= 0) {
                break label831;
              }
              this.hWS.aK(this.hXj);
              break;
            }
            label831:
            x.i("MicroMsg.CollectBillListUI", "still empty data, show empty view");
            ajx();
            if (!bi.oW(paraml.fFG))
            {
              this.hWV.setText(paraml.fFG);
              this.hWV.setVisibility(0);
            }
            paramString = this.hWS;
            paramString.hWN.clear();
            paramString.notifyDataSetChanged();
          }
        }
        if (!paraml.hUJ.isEmpty())
        {
          this.hWS.aK(paraml.hUJ);
          this.hXg = ((com.tencent.mm.plugin.collect.b.h)paraml.hUJ.get(0)).hUf;
          this.hXh = ((com.tencent.mm.plugin.collect.b.h)paraml.hUJ.get(paraml.hUJ.size() - 1)).hUf;
        }
        for (;;)
        {
          this.hXb = false;
          this.hXd = false;
          break;
          if ((paraml.hUH == 0) && (paraml.hUI > 0))
          {
            x.i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", new Object[] { Integer.valueOf(paraml.hUI), Long.valueOf(paraml.hUf) });
            a(paraml.hUI, paraml.hUf, paraml.hUG, paraml.hUF);
            this.hXj.clear();
          }
          else
          {
            ajx();
          }
        }
      }
      x.i("MicroMsg.CollectBillListUI", "net error, errType: %s, errCode: %s, errMsg: %s, chooseFlag: %d, direcFlag: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paraml.hUF), Integer.valueOf(paraml.hUG) });
      if (paraml.hUF == 0) {
        if (paraml.hUG == 0)
        {
          this.hWZ = false;
          aCe();
        }
      }
      for (;;)
      {
        if (this.hWS.isEmpty()) {
          ajx();
        }
        Toast.makeText(this, a.i.collect_bill_item_load_fail_text, 1).show();
        return true;
        this.hXa = false;
        continue;
        this.hXb = false;
      }
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.collect_bill_list;
  }
  
  protected final void initView()
  {
    this.hWR = ((ListView)findViewById(a.f.collect_bill_list_lv));
    this.hWT = ((LinearLayout)findViewById(a.f.collect_bill_list_empty_ll));
    this.hWV = ((TextView)findViewById(a.f.collect_bill_list_empty_tv));
    this.hFL = y.gq(this).inflate(a.g.collect_bill_list_loading_view, this.hWR, false);
    View localView = new View(this);
    localView.setLayoutParams(new AbsListView.LayoutParams(-1, a.fromDPToPix(this, 5)));
    this.hWR.addHeaderView(localView, null, true);
    new View(this).setLayoutParams(new AbsListView.LayoutParams(-1, a.fromDPToPix(this, 10)));
    this.hWR.addFooterView(localView, null, true);
    this.hWR.setOverScrollMode(2);
    this.hWS = new b(this);
    this.hWR.setAdapter(this.hWS);
    this.hWR.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        x.d("MicroMsg.CollectBillListUI", "click item: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if ((paramAnonymousInt < 0) || (paramAnonymousInt >= paramAnonymousAdapterView.getAdapter().getCount())) {
          return;
        }
        paramAnonymousView = new Intent(CollectBillListUI.this.mController.tml, CollectBillUI.class);
        paramAnonymousAdapterView = (com.tencent.mm.plugin.collect.b.h)paramAnonymousAdapterView.getItemAtPosition(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          x.w("MicroMsg.CollectBillListUI", "invaild record: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          return;
        }
        paramAnonymousView.putExtra("key_type", paramAnonymousAdapterView.type);
        paramAnonymousView.putExtra("key_timestamp", paramAnonymousAdapterView.hUf);
        paramAnonymousView.putExtra("key_from_scene", 2);
        CollectBillListUI.this.startActivity(paramAnonymousView);
        com.tencent.mm.plugin.report.service.h.mEJ.h(13944, new Object[] { Integer.valueOf(3) });
      }
    });
    this.hWR.setOnScrollListener(new CollectBillListUI.8(this));
    this.hWU = ((CollectPullDownView)findViewById(a.f.collect_bill_list_pull_down_view));
    this.hWU.setTopViewVisible(false);
    this.hWU.setIsTopShowAll(false);
    this.hWU.setBottomViewVisible(true);
    this.hWU.setIsBottomShowAll(false);
    this.hWU.setCanOverScrool(true);
    this.hWU.setAtTopCallBack(new CollectBillListUI.9(this));
    this.hWU.setAtBottomCallBack(new CollectBillListUI.10(this));
    this.hWU.setOnTopLoadDataListener(new MMPullDownView.g()
    {
      public final boolean aCj()
      {
        x.d("MicroMsg.CollectBillListUI", "top load");
        return true;
      }
    });
    this.hWU.setOnBottomLoadDataListener(new CollectBillListUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    setMMTitle(a.i.collect_bill_list_title);
    if (this.hXf) {
      addIconOptionMenu(0, a.h.collect_bill_filter_icon, new CollectBillListUI.1(this));
    }
    this.eXG = g.a(this, false, new CollectBillListUI.3(this));
    aCf();
    com.tencent.mm.plugin.report.service.h.mEJ.h(13944, new Object[] { Integer.valueOf(4) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/CollectBillListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */