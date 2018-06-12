package com.tencent.mm.plugin.collect.reward.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.f;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.mk;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMGridView;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class QrRewardSelectMoneyUI
  extends QrRewardBaseUI
{
  private int bVU;
  private String fIb;
  private String hVA;
  private String hVB;
  private String hVC;
  private String hVD;
  private int hVE;
  private String hVv;
  private String hVx;
  private String hVz;
  private List<Integer> hWl = new ArrayList();
  private ImageView hWm;
  private TextView hWn;
  private TextView hWo;
  private TextView hWp;
  private TextView hWq;
  private MMGridView hWr;
  private TextView hWs;
  private a hWt;
  private String hWu;
  private String hWv;
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, l paraml)
  {
    if ((paraml instanceof f))
    {
      paramString = (f)paraml;
      paramString.a(new QrRewardSelectMoneyUI.5(this, paramString)).b(new a.a()
      {
        public final void i(l paramAnonymousl)
        {
          x.e("MicroMsg.QrRewardSelectMoneyUI", "scan response error");
          if (!bi.oW(paramString.hVc.hUn)) {
            Toast.makeText(QrRewardSelectMoneyUI.this, paramString.hVc.hUn, 1).show();
          }
          QrRewardSelectMoneyUI.this.finish();
        }
      }).c(new a.a()
      {
        public final void i(l paramAnonymousl)
        {
          x.e("MicroMsg.QrRewardSelectMoneyUI", "net error: %s", new Object[] { paramString });
          com.tencent.mm.ui.base.h.a(QrRewardSelectMoneyUI.this.mController.tml, QrRewardSelectMoneyUI.this.getString(a.i.wallet_unknown_err), null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              QrRewardSelectMoneyUI.this.finish();
            }
          });
        }
      });
      ux(0);
    }
    return true;
  }
  
  protected final int getLayoutId()
  {
    return a.g.qr_reward_select_money_ui;
  }
  
  protected final void initView()
  {
    this.hWm = ((ImageView)findViewById(a.f.qrsm_avatar_iv));
    this.hWn = ((TextView)findViewById(a.f.qrsm_reward_amt_tv));
    this.hWo = ((TextView)findViewById(a.f.qrsm_name_tv));
    this.hWp = ((TextView)findViewById(a.f.qrsm_desc_tv));
    this.hWq = ((TextView)findViewById(a.f.qrsm_reward_money_title_tv));
    this.hWr = ((MMGridView)findViewById(a.f.qrsm_money_layout));
    this.hWs = ((TextView)findViewById(a.f.qrsm_other_reward_money_tv));
    this.hWt = new a((byte)0);
    this.hWr.setAdapter(this.hWt);
    this.hWr.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        paramAnonymousInt = ((Integer)paramAnonymousAdapterView.getAdapter().getItem(paramAnonymousInt)).intValue();
        QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this, paramAnonymousInt, 1);
      }
    });
    this.hWs.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this, 0, 2);
      }
    });
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        x.i("MicroMsg.QrRewardSelectMoneyUI", "pay succ");
        finish();
      }
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(1516);
    setMMTitle(a.i.qr_reward_main_title);
    ux(4);
    this.hWu = getIntent().getStringExtra("key_qrcode_url");
    this.bVU = getIntent().getIntExtra("key_channel", 0);
    this.fIb = getIntent().getStringExtra("key_web_url");
    x.i("MicroMsg.QrRewardSelectMoneyUI", "do scan code");
    a(new f(this.hWu, this.bVU, this.fIb), true, true);
    initView();
    int i = getIntent().getIntExtra("key_scene", 0);
    x.d("MicroMsg.QrRewardSelectMoneyUI", "scene: %s", new Object[] { Integer.valueOf(i) });
    com.tencent.mm.plugin.report.service.h.mEJ.h(14721, new Object[] { Integer.valueOf(2), Integer.valueOf(i) });
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1516);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a() {}
    
    public final int getCount()
    {
      return QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this).size();
    }
    
    public final Object getItem(int paramInt)
    {
      return QrRewardSelectMoneyUI.a(QrRewardSelectMoneyUI.this).get(paramInt);
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      View localView = paramView;
      if (paramView == null) {
        localView = LayoutInflater.from(QrRewardSelectMoneyUI.this.mController.tml).inflate(a.g.qr_reward_select_money_item, paramViewGroup, false);
      }
      paramInt = ((Integer)getItem(paramInt)).intValue();
      paramView = (TextView)localView.findViewById(a.f.qrsi_money_tv);
      int i = paramInt / 100;
      double d = paramInt / 100.0D;
      if (d > i)
      {
        paramView.setText(String.format("%.2f", new Object[] { Double.valueOf(d) }) + QrRewardSelectMoneyUI.this.getString(a.i.qr_reward_yuan));
        return localView;
      }
      paramView.setText(String.format("%d", new Object[] { Integer.valueOf(i) }) + QrRewardSelectMoneyUI.this.getString(a.i.qr_reward_yuan));
      return localView;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/ui/QrRewardSelectMoneyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */