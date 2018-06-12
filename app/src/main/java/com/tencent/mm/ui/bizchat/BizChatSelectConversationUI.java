package com.tencent.mm.ui.bizchat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ac.a.c;
import com.tencent.mm.ac.a.e;
import com.tencent.mm.ac.a.j;
import com.tencent.mm.ac.a.k;
import com.tencent.mm.ac.z;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.ui.applet.g;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.protocal.c.hs;
import com.tencent.mm.protocal.c.qm;
import com.tencent.mm.protocal.c.xr;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.y;
import java.util.HashMap;

@com.tencent.mm.ui.base.a(19)
public class BizChatSelectConversationUI
  extends MMBaseSelectContactUI
  implements com.tencent.mm.ac.n
{
  private String hpJ = null;
  private int scene = 0;
  j tEx;
  private TextView tFu;
  private com.tencent.mm.ui.base.p tipDialog = null;
  
  private void a(final String paramString, final long paramLong, CharSequence paramCharSequence)
  {
    x.i("MicroMsg.BizChatSelectConversationUI", "doClickUser=%s", new Object[] { paramString });
    if (this.scene == 2) {
      if (getIntent().getBooleanExtra("enterprise_extra_params", true))
      {
        paramCharSequence = String.valueOf(paramCharSequence);
        g.a(this.mController, paramLong, getString(R.l.retransmit_to_conv_comfirm2), paramCharSequence, getString(R.l.app_send), new q.a()
        {
          public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
          {
            if (paramAnonymousBoolean)
            {
              paramAnonymousString = new Intent();
              paramAnonymousString.putExtra("enterprise_biz_name", paramString);
              paramAnonymousString.putExtra("key_biz_chat_id", paramLong);
              paramAnonymousString.putExtra("key_is_biz_chat", true);
              BizChatSelectConversationUI.this.setResult(-1, paramAnonymousString);
              BizChatSelectConversationUI.this.finish();
            }
          }
        });
      }
    }
    while (this.scene != 1)
    {
      return;
      paramCharSequence = String.valueOf(paramCharSequence);
      g.a(this.mController, paramLong, getString(R.l.retransmit_to_conv_comfirm2), paramCharSequence, getString(R.l.app_send), new BizChatSelectConversationUI.3(this, paramString, paramLong));
      return;
    }
    Object localObject = (HashMap)getIntent().getSerializableExtra("enterprise_extra_params");
    paramCharSequence = (String)((HashMap)localObject).get("img_url");
    String str = (String)((HashMap)localObject).get("desc");
    localObject = (String)((HashMap)localObject).get("title");
    g.a(this.mController, (String)localObject, paramCharSequence, str, true, getResources().getString(R.l.app_send), new q.a()
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        if (paramAnonymousBoolean)
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("enterprise_biz_name", paramString);
          localIntent.putExtra("key_biz_chat_id", paramLong);
          localIntent.putExtra("key_is_biz_chat", true);
          if (!bi.oW(paramAnonymousString)) {
            localIntent.putExtra("enterprise_share_append_text", paramAnonymousString);
          }
          BizChatSelectConversationUI.this.setResult(-1, localIntent);
          BizChatSelectConversationUI.this.finish();
        }
      }
    });
  }
  
  private void csx()
  {
    if (bi.oW(this.hpJ))
    {
      this.hpJ = getIntent().getStringExtra("enterprise_biz_name");
      if (bi.oW(this.hpJ))
      {
        x.e("MicroMsg.BizChatSelectConversationUI", "brandUserName is null");
        finish();
      }
    }
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
    return r.gT(this.hpJ);
  }
  
  protected final o Wn()
  {
    csx();
    return new d(this, this.hpJ);
  }
  
  protected final m Wo()
  {
    csx();
    return new com.tencent.mm.ui.contact.p(this, this.hpJ);
  }
  
  public final void a(int paramInt, l paraml)
  {
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    if (paraml.getType() == 1355)
    {
      paraml = ((com.tencent.mm.ac.a.n)paraml).Nt();
      paraml = z.Na().la(paraml.ruQ.rDx.riE);
      if (paraml == null) {
        Toast.makeText(ad.getContext(), getString(R.l.room_change_add_memberfail), 0).show();
      }
    }
    else
    {
      return;
    }
    a(this.hpJ, paraml.field_bizChatLocalId, paraml.field_chatName);
  }
  
  protected final void a(ListView paramListView, int paramInt)
  {
    super.a(paramListView, paramInt);
    if (this.tFu == null)
    {
      Object localObject = new BizChatSelectConversationUI.1(this);
      String str = getString(R.l.select_conversation_create);
      View localView = y.gq(this).inflate(R.i.group_card_item, null);
      localView.setOnClickListener((View.OnClickListener)localObject);
      localObject = (TextView)localView.findViewById(R.h.content_tv);
      ((TextView)localObject).setText(str);
      paramListView.addHeaderView(localView);
      this.tFu = ((TextView)localObject);
    }
    this.tFu.setVisibility(paramInt);
  }
  
  protected final void bbH()
  {
    super.bbH();
  }
  
  public final void iV(int paramInt)
  {
    if (paramInt < getContentLV().getHeaderViewsCount()) {
      x.i("MicroMsg.BizChatSelectConversationUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
    }
    a locala;
    do
    {
      return;
      if (!(getContentLV().getAdapter().getItem(paramInt) instanceof a))
      {
        x.w("MicroMsg.BizChatSelectConversationUI", "Click HeaderView not BizChatConvDataItem");
        return;
      }
      locala = (a)getContentLV().getAdapter().getItem(paramInt);
    } while (locala == null);
    String str = locala.username;
    long l = locala.hpD;
    if ((str == null) || (l == -1L))
    {
      x.i("MicroMsg.BizChatSelectConversationUI", "onclick err userName:%s,bizChatId:%s", new Object[] { str, Long.valueOf(l) });
      return;
    }
    a(str, l, locala.eCh);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1) {}
    label180:
    label233:
    label241:
    for (;;)
    {
      return;
      switch (paramInt1)
      {
      default: 
        return;
      }
      paramIntent = paramIntent.getBundleExtra("result_data");
      xr localxr;
      if (paramIntent != null)
      {
        x.i("MicroMsg.BizChatSelectConversationUI", "bundle != null");
        String str = paramIntent.getString("enterprise_members");
        localxr = new xr();
        c localc = new c();
        if (this.tEx != null)
        {
          paramIntent = this.tEx.field_addMemberUrl;
          localc.field_addMemberUrl = paramIntent;
          localc.field_brandUserName = this.hpJ;
          if (!e.a(localc, str, null, localxr)) {
            break label233;
          }
          if (localc.field_bizChatLocalId == -1L) {
            break label180;
          }
          a(this.hpJ, localc.field_bizChatLocalId, localc.field_chatName);
          paramInt1 = 1;
        }
      }
      for (;;)
      {
        if (paramInt1 != 0) {
          break label241;
        }
        Toast.makeText(this, getString(R.l.room_change_add_memberfail), 0).show();
        return;
        paramIntent = null;
        break;
        z.Ng();
        paramIntent = com.tencent.mm.ac.a.h.a(this.hpJ, localxr, this);
        getString(R.l.app_tip);
        this.tipDialog = com.tencent.mm.ui.base.h.a(this, getString(R.l.adding_room_mem), true, new BizChatSelectConversationUI.5(this, paramIntent));
        paramInt1 = 1;
        continue;
        paramInt1 = 0;
        continue;
        paramInt1 = 0;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool = false;
    super.onCreate(paramBundle);
    this.scene = getIntent().getIntExtra("biz_chat_scene", 1);
    csx();
    paramBundle = z.Nc().cA(this.hpJ);
    this.tEx = z.Nc().cz(paramBundle);
    String str = this.hpJ;
    if (this.tEx == null) {
      bool = true;
    }
    x.i("MicroMsg.BizChatSelectConversationUI", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", new Object[] { str, paramBundle, Boolean.valueOf(bool) });
    if ((bi.oW(paramBundle)) || (this.tEx == null) || (this.tEx.No()) || (bi.oW(this.tEx.field_addMemberUrl)))
    {
      z.Ng();
      com.tencent.mm.ac.a.h.a(this.hpJ, this);
      paramBundle = getActivity();
      getString(R.l.app_tip);
      this.tipDialog = com.tencent.mm.ui.base.h.a(paramBundle, getString(R.l.app_waiting), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          BizChatSelectConversationUI.this.finish();
        }
      });
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/bizchat/BizChatSelectConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */