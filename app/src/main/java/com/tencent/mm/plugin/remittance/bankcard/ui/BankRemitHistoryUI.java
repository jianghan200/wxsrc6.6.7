package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.remittance.bankcard.a.e;
import com.tencent.mm.plugin.remittance.bankcard.a.i;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.amk;
import com.tencent.mm.protocal.c.bdx;
import com.tencent.mm.protocal.c.ry;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.tools.k;
import com.tencent.mm.wallet_core.c.h;
import com.tencent.mm.wallet_core.c.h.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankRemitHistoryUI
  extends BankRemitBaseUI
  implements n.d
{
  private boolean eBY = false;
  private boolean eBZ = false;
  private k gcQ;
  private View ipW;
  private int limit = 20;
  private ListView mvF;
  private a mvG;
  private List<amk> mvH = new ArrayList();
  private int offset = 0;
  
  private void bra()
  {
    x.i("MicroMsg.BankRemitHistoryUI", "fetch data: %s, %s", new Object[] { Integer.valueOf(this.limit), Integer.valueOf(this.offset) });
    this.eBY = true;
    i locali = new i(this.limit, this.offset);
    locali.m(this);
    a(locali, false, false);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, l paraml)
  {
    if ((paraml instanceof i))
    {
      paramString = (i)paraml;
      paramString.a(new BankRemitHistoryUI.5(this, paramString)).b(new h.a()
      {
        public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          x.e("MicroMsg.BankRemitHistoryUI", "history response error: %s, %s", new Object[] { Integer.valueOf(paramString.mua.hUm), paramString.mua.hUn });
        }
      }).c(new BankRemitHistoryUI.3(this));
      this.eBY = false;
    }
    while (!(paraml instanceof e)) {
      return false;
    }
    paramString = (e)paraml;
    paramString.a(new BankRemitHistoryUI.8(this, paramString)).b(new h.a()
    {
      public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
      {
        x.e("MicroMsg.BankRemitHistoryUI", "history response: %s, %s", new Object[] { Integer.valueOf(paramString.mtW.hUm), paramString.mtW.hUn });
      }
    }).c(new BankRemitHistoryUI.6(this));
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.bank_remit_history_ui;
  }
  
  protected final void initView()
  {
    this.mvF = ((ListView)findViewById(a.f.brhu_lv));
    this.ipW = LayoutInflater.from(this).inflate(a.g.aa_record_list_loading_more, null);
    this.gcQ = new k(this);
    this.mvG = new a((byte)0);
    this.mvF.addFooterView(this.ipW);
    this.mvF.setAdapter(this.mvG);
    this.mvF.setOnItemLongClickListener(new BankRemitHistoryUI.1(this));
    this.mvF.setOnScrollListener(new BankRemitHistoryUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(1511);
    jr(1737);
    setMMTitle(a.i.bank_remit_history_title);
    initView();
    bra();
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    paramContextMenu.add(0, 1, 0, a.i.bank_remit_select_payee_delete_text);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1511);
    js(1737);
  }
  
  public void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    Object localObject = (AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo();
    localObject = (amk)this.mvF.getItemAtPosition(((AdapterView.AdapterContextMenuInfo)localObject).position);
    if ((paramMenuItem.getItemId() == 1) && (localObject != null))
    {
      paramMenuItem = ((amk)localObject).rlf;
      x.i("MicroMsg.BankRemitHistoryUI", "delete record: %s", new Object[] { paramMenuItem });
      paramMenuItem = new e(paramMenuItem);
      paramMenuItem.m(this);
      a(paramMenuItem, true, true);
    }
  }
  
  private final class a
    extends BaseAdapter
  {
    private SimpleDateFormat mvL = new SimpleDateFormat(BankRemitHistoryUI.this.mController.tml.getString(a.i.bank_remit_history_date_format_pattern));
    
    private a() {}
    
    private String bx(long paramLong)
    {
      return this.mvL.format(new Date(1000L * paramLong));
    }
    
    public final int getCount()
    {
      return BankRemitHistoryUI.i(BankRemitHistoryUI.this).size();
    }
    
    public final Object getItem(int paramInt)
    {
      return BankRemitHistoryUI.i(BankRemitHistoryUI.this).get(paramInt);
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      View localView = paramView;
      if (paramView == null)
      {
        localView = LayoutInflater.from(BankRemitHistoryUI.this.mController.tml).inflate(a.g.bank_remit_history_item, paramViewGroup, false);
        localView.setTag(new BankRemitHistoryUI.b(BankRemitHistoryUI.this, localView));
      }
      paramView = (BankRemitHistoryUI.b)localView.getTag();
      paramViewGroup = (amk)getItem(paramInt);
      String str = bx(paramViewGroup.rPc);
      if (paramInt == 0) {
        paramInt = 1;
      }
      for (;;)
      {
        if (paramInt != 0)
        {
          paramView.mvM.setText(str);
          paramView.mvM.setVisibility(0);
        }
        for (;;)
        {
          paramView.mvP.setUrl(paramViewGroup.mug);
          paramView.fAK.setText(paramViewGroup.title);
          paramView.mvN.setText(paramViewGroup.rPd);
          paramView.eBP.setText(paramViewGroup.rPb);
          if (bi.oW(paramViewGroup.rPe)) {
            break label245;
          }
          if (!bi.oW(paramViewGroup.rPf)) {
            paramView.mvO.setTextColor(Color.parseColor(paramViewGroup.rPf));
          }
          paramView.mvO.setText(paramViewGroup.rPe);
          paramView.mvO.setVisibility(0);
          return localView;
          if (str.equals(bx(((amk)getItem(paramInt - 1)).rPc))) {
            break label257;
          }
          paramInt = 1;
          break;
          paramView.mvM.setVisibility(8);
        }
        label245:
        paramView.mvO.setVisibility(8);
        return localView;
        label257:
        paramInt = 0;
      }
    }
  }
  
  private final class b
  {
    TextView eBP;
    TextView fAK;
    TextView mvM;
    TextView mvN;
    TextView mvO;
    CdnImageView mvP;
    
    public b(View paramView)
    {
      this.mvM = ((TextView)paramView.findViewById(a.f.brhi_header_tv));
      this.fAK = ((TextView)paramView.findViewById(a.f.brhi_desc_tv));
      this.mvN = ((TextView)paramView.findViewById(a.f.brhi_money_tv));
      this.eBP = ((TextView)paramView.findViewById(a.f.brhi_date_tv));
      this.mvO = ((TextView)paramView.findViewById(a.f.brhi_state_tv));
      this.mvP = ((CdnImageView)paramView.findViewById(a.f.brhi_bank_icon_iv));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitHistoryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */