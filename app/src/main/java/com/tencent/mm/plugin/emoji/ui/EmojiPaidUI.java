package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.emoji.a.a.a;
import com.tencent.mm.plugin.emoji.a.d;
import com.tencent.mm.plugin.emoji.f.g;
import com.tencent.mm.plugin.emoji.model.f;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.ArrayList;

public class EmojiPaidUI
  extends BaseEmojiStoreUI
{
  private g[] imj;
  
  protected final void a(g paramg) {}
  
  public final void a(String paramString, l paraml)
  {
    if ((paramString != null) && (paramString.equals("event_update_group")))
    {
      aFD();
      ct(131074, 50);
    }
  }
  
  protected final void a(boolean paramBoolean1, f paramf, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((paramf != null) && (paramBoolean1) && (this.ihz != null)) {
      this.ihz.b(paramf);
    }
    if ((this.ihz == null) || (paramf == null) || (paramf.ihp <= 0))
    {
      this.gQd.setVisibility(0);
      this.ikg.setText(R.l.emoji_no_play_history);
      this.CU.setVisibility(8);
      return;
    }
    this.gQd.setVisibility(8);
    this.CU.setVisibility(0);
  }
  
  protected final int aFd()
  {
    return 10;
  }
  
  protected final int aFe()
  {
    return 6;
  }
  
  protected final a aFf()
  {
    return new d(this.mController.tml);
  }
  
  protected final void aFh() {}
  
  protected final boolean aFj()
  {
    return false;
  }
  
  protected final int aFm()
  {
    return 2;
  }
  
  protected final int aFo()
  {
    return 2;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.emoji_paid);
    if (q.GR()) {
      addIconOptionMenu(0, R.g.mm_title_btn_menu, new EmojiPaidUI.1(this));
    }
    super.initView();
    this.gQd.setVisibility(8);
    this.CU.setVisibility(8);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiPaidUI", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    aFs();
    String str = "";
    if (paramIntent != null)
    {
      paramInt1 = paramIntent.getIntExtra("key_err_code", 0);
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.EmojiPaidUI", "errCode:" + paramInt1);
      str = paramIntent.getStringExtra("key_err_msg");
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.EmojiPaidUI", "errMsg:" + str);
    }
    for (;;)
    {
      if (paramInt2 == -1)
      {
        if ((paramIntent != null) && (paramInt1 == 0))
        {
          paramIntent = paramIntent.getStringArrayListExtra("key_response_product_ids");
          if ((paramIntent != null) && (paramIntent.size() > 0))
          {
            this.ikl = null;
            this.iki = -1;
            w(false, false);
            au.HU();
            c.DT().set(208900, Boolean.valueOf(true));
            Toast.makeText(this, R.l.emoji_restore_success, 0).show();
            return;
          }
          Toast.makeText(this, str, 0).show();
          return;
        }
        Toast.makeText(this, str, 0).show();
        return;
      }
      Toast.makeText(this, R.l.emoji_restore_failed, 0).show();
      return;
      paramInt1 = 0;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if ((this.imj != null) && (this.imj.length > 0))
    {
      int i = 0;
      while (i < this.imj.length)
      {
        au.DF().c(this.imj[i]);
        i += 1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/EmojiPaidUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */