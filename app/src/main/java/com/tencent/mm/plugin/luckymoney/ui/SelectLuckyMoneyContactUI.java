package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.contact.q;
import com.tencent.mm.ui.contact.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SelectLuckyMoneyContactUI
  extends MMBaseSelectContactUI
{
  private List<String> gRN;
  private View kXV;
  
  protected final void Wj()
  {
    super.Wj();
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(com.tencent.mm.ui.contact.s.cyz());
    localHashSet.addAll(com.tencent.mm.ui.contact.s.cyA());
    String str = getIntent().getStringExtra("Select_block_List");
    if (!bi.oW(str)) {
      localHashSet.addAll(bi.F(str.split(",")));
    }
    this.gRN = new ArrayList();
    this.gRN.addAll(localHashSet);
  }
  
  protected final boolean Wk()
  {
    return false;
  }
  
  protected final boolean Wl()
  {
    return false;
  }
  
  protected final String Wm()
  {
    return getString(a.i.lucky_money_select_friends);
  }
  
  protected final o Wn()
  {
    return new w(this, this.gRN);
  }
  
  protected final com.tencent.mm.ui.contact.m Wo()
  {
    return new q(this, this.gRN, false, this.scene);
  }
  
  protected final void a(ListView paramListView, int paramInt)
  {
    super.a(paramListView, paramInt);
    if (this.kXV == null)
    {
      View localView = View.inflate(this, a.g.select_conversation_header, null);
      this.kXV = localView.findViewById(a.f.content);
      ((TextView)localView.findViewById(a.f.tip_tv)).setText(a.i.lucky_money_go_select_multi_contact_title);
      paramListView.addHeaderView(localView);
    }
    this.kXV.setVisibility(paramInt);
  }
  
  public final int[] bbG()
  {
    return new int[] { 131072 };
  }
  
  protected final void bbH()
  {
    super.bbH();
    YC();
  }
  
  public final void iV(int paramInt)
  {
    if (paramInt < getContentLV().getHeaderViewsCount())
    {
      x.i("MicroMsg.SelectRemittanceContactUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
      x.i("MicroMsg.SelectRemittanceContactUI", "doCallSelectContactUI");
      paramInt = getIntent().getIntExtra("key_friends_num", 0);
      localObject = new Intent();
      int i = com.tencent.mm.ui.contact.s.s(new int[] { 16, 1, 2, 4, 16384, 64, 65536, 131072 });
      ((Intent)localObject).putExtra("list_type", 0);
      ((Intent)localObject).putExtra("list_attr", i);
      ((Intent)localObject).putExtra("max_limit_num", paramInt);
      ((Intent)localObject).putExtra("titile", getString(a.i.lucky_money_select_contact_title, new Object[] { Integer.valueOf(paramInt) }));
      ((Intent)localObject).putExtra("sub_title", getString(a.i.wechat_wxpay_authenticate));
      d.b(this, ".ui.contact.SelectContactUI", (Intent)localObject, 1);
      overridePendingTransition(a.a.push_up_in, a.a.fast_faded_out);
    }
    do
    {
      do
      {
        return;
        localObject = (a)getContentLV().getAdapter().getItem(paramInt);
      } while (localObject == null);
      localObject = ((a)localObject).guS;
    } while (localObject == null);
    String str = ((ai)localObject).field_username;
    x.i("MicroMsg.SelectRemittanceContactUI", "doClickUser=%s", new Object[] { str });
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Conv_User", str);
    Object localObject = null;
    if (com.tencent.mm.model.s.fq(str)) {
      localObject = getString(a.i.wallet_select_contact_num, new Object[] { Integer.valueOf(com.tencent.mm.model.m.gK(str)) });
    }
    ((h)g.l(h.class)).a(this.mController, str, getString(a.i.retransmit_to_conv_comfirm2), str, (String)localObject, getString(a.i.app_send), new SelectLuckyMoneyContactUI.1(this, localIntent));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent != null) {
      x.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = " + paramIntent.toString());
    }
    while (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        x.i("MicroMsg.SelectRemittanceContactUI", "getIntent = " + getIntent());
        setResult(-1, paramIntent);
        finish();
      }
      return;
      x.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = null");
    }
    x.e("MicroMsg.SelectRemittanceContactUI", "onActivityResult, unknown requestCode = " + paramInt1);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      bbH();
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/SelectLuckyMoneyContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */