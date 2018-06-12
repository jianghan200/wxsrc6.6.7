package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.contact.q;
import com.tencent.mm.ui.contact.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class SelectRemittanceContactUI
  extends MMBaseSelectContactUI
{
  private int fromScene;
  private List<String> gRN;
  private View kXV;
  private List<String> mBM;
  
  protected final void Wj()
  {
    super.Wj();
    this.fromScene = getIntent().getIntExtra("key_from_scene", 0);
    Object localObject = getIntent().getStringExtra("recent_remittance_contact_list");
    x.v("MicroMsg.SelectRemittanceContactUI", "recent list:" + (String)localObject);
    this.mBM = new ArrayList();
    if (!bi.oW((String)localObject)) {
      this.mBM = bi.F(((String)localObject).split(","));
    }
    localObject = new HashSet();
    ((HashSet)localObject).addAll(s.cyz());
    ((HashSet)localObject).addAll(s.cyA());
    String str = getIntent().getStringExtra("Select_block_List");
    if (!bi.oW(str)) {
      ((HashSet)localObject).addAll(bi.F(str.split(",")));
    }
    this.gRN = new ArrayList();
    this.gRN.addAll((Collection)localObject);
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
    if (this.fromScene == 1) {
      return getString(a.i.wallet_select_conversation_title);
    }
    return getString(a.i.remittance_title);
  }
  
  protected final o Wn()
  {
    return new c(this, this.mBM, this.gRN, this.fromScene);
  }
  
  protected final m Wo()
  {
    return new q(this, this.gRN, false, this.scene);
  }
  
  protected final void a(ListView paramListView, int paramInt)
  {
    super.a(paramListView, paramInt);
    View localView;
    TextView localTextView;
    if (this.kXV == null)
    {
      localView = View.inflate(this, a.g.select_conversation_header, null);
      this.kXV = localView.findViewById(a.f.content);
      localTextView = (TextView)localView.findViewById(a.f.tip_tv);
      if (this.fromScene != 1) {
        break label75;
      }
      localTextView.setText(a.i.wallet_select_conversation_create);
    }
    for (;;)
    {
      paramListView.addHeaderView(localView);
      this.kXV.setVisibility(paramInt);
      return;
      label75:
      localTextView.setText(a.i.remittance_go_select_contact);
    }
  }
  
  public final int[] bbG()
  {
    if (this.fromScene == 1) {
      return new int[] { 131072, 131075 };
    }
    return new int[] { 131072 };
  }
  
  protected final void bbH()
  {
    super.bbH();
    YC();
  }
  
  public final void iV(int paramInt)
  {
    Object localObject;
    if (paramInt < getContentLV().getHeaderViewsCount())
    {
      x.i("MicroMsg.SelectRemittanceContactUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
      x.i("MicroMsg.SelectRemittanceContactUI", "doCallSelectContactUI");
      localObject = new Intent();
      if (this.fromScene == 1)
      {
        ((Intent)localObject).putExtra("list_attr", s.s(new int[] { s.ukE, 16384, 64, 4096, 262144 }));
        ((Intent)localObject).putExtra("min_limit_num", 1);
        ((Intent)localObject).putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
        ((Intent)localObject).putExtra("titile", getString(a.i.wallet_select_create_chatroom_title));
        ((Intent)localObject).putExtra("without_openim", true);
        d.b(this, ".ui.contact.SelectContactUI", (Intent)localObject, 1);
        overridePendingTransition(a.a.push_up_in, a.a.fast_faded_out);
      }
    }
    for (;;)
    {
      return;
      paramInt = s.s(new int[] { 16, 1, 2, 4, 16384 });
      ((Intent)localObject).putExtra("list_type", 0);
      ((Intent)localObject).putExtra("list_attr", paramInt);
      ((Intent)localObject).putExtra("titile", getString(a.i.remittance_select_receiver_title));
      ((Intent)localObject).putExtra("sub_title", getString(a.i.wallet_wechat_authenticate_safely));
      break;
      localObject = (com.tencent.mm.ui.contact.a.a)getContentLV().getAdapter().getItem(paramInt);
      if (localObject != null)
      {
        localObject = ((com.tencent.mm.ui.contact.a.a)localObject).guS;
        if (localObject != null)
        {
          localObject = ((ai)localObject).field_username;
          x.i("MicroMsg.SelectRemittanceContactUI", "doClickUser=%s", new Object[] { localObject });
          Intent localIntent = new Intent();
          localIntent.putExtra("Select_Conv_User", (String)localObject);
          setResult(-1, localIntent);
          finish();
          YC();
          if ((cyp() instanceof c))
          {
            paramInt -= getContentLV().getHeaderViewsCount();
            localObject = (c)cyp();
            x.d("MicroMsg.RecentConversationAdapter", "pos: %s", new Object[] { Integer.valueOf(paramInt) });
            if (((c)localObject).mBK >= 0) {
              if (((c)localObject).mBL < 0) {
                paramInt = 1;
              }
            }
            while (paramInt != 0)
            {
              h.mEJ.h(13721, new Object[] { Integer.valueOf(6), Integer.valueOf(1) });
              return;
              if ((paramInt > ((c)localObject).mBK) && (paramInt < ((c)localObject).mBL)) {
                paramInt = 1;
              } else {
                paramInt = 0;
              }
            }
          }
        }
      }
    }
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
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      bbH();
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/SelectRemittanceContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */