package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ac.a;
import com.tencent.mm.ac.c;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.f;
import com.tencent.mm.ac.z;
import com.tencent.mm.plugin.brandservice.b.d;
import com.tencent.mm.plugin.brandservice.b.e;
import com.tencent.mm.plugin.brandservice.b.g;
import com.tencent.mm.plugin.brandservice.b.h;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.l;
import java.util.List;

public class EnterpriseBizContactListUI
  extends MMActivity
{
  private long cYb;
  private boolean djO = false;
  private long eiC = 0L;
  public String hph;
  private l hpi;
  private EnterpriseBizContactListView hpj;
  private ag hpk;
  
  public void finish()
  {
    this.eiC = (System.currentTimeMillis() / 1000L);
    super.finish();
  }
  
  protected final int getLayoutId()
  {
    return b.e.enterprise_biz_list_sort;
  }
  
  protected final void initView()
  {
    setMMTitle(((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(this.hph).BK());
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        EnterpriseBizContactListUI.this.YC();
        EnterpriseBizContactListUI.this.finish();
        return true;
      }
    });
    if (!bi.oW(this.hph))
    {
      com.tencent.mm.ac.d locald = f.kH(this.hph);
      if ((locald != null) && (locald.LY())) {
        addIconOptionMenu(1, b.h.actionbar_title_new_group_chat, b.g.actionbar_icon_dark_add, new EnterpriseBizContactListUI.2(this));
      }
    }
    this.hpj = ((EnterpriseBizContactListView)findViewById(b.d.enterprise_new_biz_list_view));
    this.hpj.setFatherBizName(this.hph);
    this.hpj.setExcludeBizChat(false);
    this.hpj.refresh();
    this.hpj.auX();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    do
    {
      return;
    } while ((paramInt2 != -1) || (paramIntent == null));
    String str1 = paramIntent.getStringExtra("be_send_card_name");
    String str2 = paramIntent.getStringExtra("received_card_name");
    boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
    paramIntent = paramIntent.getStringExtra("custom_send_text");
    com.tencent.mm.plugin.messenger.a.g.bcT().l(str1, str2, bool);
    com.tencent.mm.plugin.messenger.a.g.bcT().dF(paramIntent, str2);
    com.tencent.mm.ui.widget.snackbar.b.h(this, this.mController.tml.getString(b.h.has_send));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.hph = getIntent().getStringExtra("enterprise_biz_name");
    this.cYb = (System.currentTimeMillis() / 1000L);
    if (this.hpk == null) {
      this.hpk = new ag()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          if ((paramAnonymousMessage != null) && (paramAnonymousMessage.what == 1) && (EnterpriseBizContactListUI.this != null) && (!EnterpriseBizContactListUI.this.isFinishing()))
          {
            z.Nk().km(EnterpriseBizContactListUI.this.hph);
            z.MY();
            paramAnonymousMessage = e.kC(EnterpriseBizContactListUI.this.hph);
            int i = 0;
            while (i < paramAnonymousMessage.size())
            {
              String str = (String)paramAnonymousMessage.get(i);
              if ((com.tencent.mm.model.s.he(str)) && ((f.kN(str)) || (f.eZ(str)))) {
                z.Nk().km(str);
              }
              i += 1;
            }
          }
        }
      };
    }
    for (;;)
    {
      this.hpk.sendEmptyMessageDelayed(1, 500L);
      return;
      this.hpk.removeMessages(1);
    }
  }
  
  protected void onDestroy()
  {
    if (this.hpj != null) {
      EnterpriseBizContactListView.release();
    }
    if ((this.cYb <= 0L) || (this.eiC <= 0L))
    {
      super.onDestroy();
      return;
    }
    long l = this.eiC - this.cYb;
    com.tencent.mm.ac.b localb = z.Nh().kn(this.hph);
    int i;
    if (localb != null)
    {
      i = localb.field_qyUin;
      label66:
      if (localb == null) {
        break label188;
      }
    }
    label188:
    for (int j = localb.field_userUin;; j = 0)
    {
      h.mEJ.h(13465, new Object[] { "", Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(2), Long.valueOf(l) });
      x.d("MicroMsg.BrandService.EnterpriseBizContactListUI", "quit biz enterprise father report: %s,%s,%s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(2), Long.valueOf(l) });
      break;
      i = 0;
      break label66;
    }
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    if (!com.tencent.mm.model.s.he(this.hph))
    {
      x.e("MicroMsg.BrandService.EnterpriseBizContactListUI", "%s !isContact", new Object[] { this.hph });
      finish();
    }
    do
    {
      return;
      initView();
    } while (this.djO);
    int k = getIntent().getIntExtra("enterprise_from_scene", 5);
    int i = -1;
    if (this.hpj != null) {
      i = this.hpj.getContactCount();
    }
    com.tencent.mm.ac.b localb = z.Nh().kn(this.hph);
    int j;
    long l1;
    if (localb != null)
    {
      j = localb.field_qyUin;
      if (localb == null) {
        break label363;
      }
      l1 = localb.field_wwCorpId;
      label114:
      if (localb == null) {
        break label369;
      }
    }
    label363:
    label369:
    for (long l2 = localb.field_wwUserVid;; l2 = 0L)
    {
      h.mEJ.h(12892, new Object[] { this.hph, Integer.valueOf(k), Integer.valueOf(i), "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2) });
      x.d("MicroMsg.BrandService.EnterpriseBizContactListUI", "enter biz enterprise father report: %s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { this.hph, Integer.valueOf(k), Integer.valueOf(i), "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2) });
      this.djO = true;
      return;
      j = 0;
      break;
      l1 = 0L;
      break label114;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */