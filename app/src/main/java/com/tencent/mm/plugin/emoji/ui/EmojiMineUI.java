package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.model.f;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.adh;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class EmojiMineUI
  extends BaseEmojiStoreUI
  implements View.OnClickListener
{
  private final String TAG = "MicroMsg.emoji.EmojiMineUI";
  private View ilr;
  private TextView ils;
  private ViewGroup imc;
  private ViewGroup imd;
  private ViewGroup ime;
  private ViewGroup imf;
  private TextView imh;
  
  public final void a(String paramString, l paraml)
  {
    if ((paramString != null) && (paramString.equals("event_update_group")))
    {
      aFD();
      ct(131074, 50);
    }
  }
  
  protected final void a(boolean paramBoolean1, f paramf, boolean paramBoolean2, boolean paramBoolean3) {}
  
  protected final int aFd()
  {
    return 24;
  }
  
  protected final int aFe()
  {
    return 7;
  }
  
  protected final com.tencent.mm.plugin.emoji.a.a.a aFf()
  {
    return new com.tencent.mm.plugin.emoji.a.c(this.mController.tml);
  }
  
  protected final void aFg()
  {
    this.imf = ((ViewGroup)View.inflate(this.mController.tml, R.i.emoji_mine_header, null));
    this.imh = ((TextView)this.imf.findViewById(16908310));
    this.imh.setText(R.l.settings_emoji_use_tip);
    this.imf.setVisibility(8);
    this.imh.setVisibility(8);
    this.CU.addHeaderView(this.imf, null, false);
    this.imc = ((ViewGroup)View.inflate(this.mController.tml, R.i.emoji_mine_footer, null));
    this.imd = ((ViewGroup)this.imc.findViewById(R.h.mine_more_custom));
    ((TextView)this.imd.findViewById(16908310)).setText(R.l.emoji_custom);
    this.ime = ((ViewGroup)this.imc.findViewById(R.h.mine_more_paid));
    ((TextView)this.ime.findViewById(16908310)).setText(R.l.emoji_paid);
    this.ime.findViewById(R.h.content).setBackgroundResource(R.g.comm_list_item_selector_no_divider);
    this.imd.setOnClickListener(this);
    this.ime.setOnClickListener(this);
    this.CU.addFooterView(this.imc, null, false);
  }
  
  protected final boolean aFi()
  {
    return false;
  }
  
  protected final boolean aFj()
  {
    return false;
  }
  
  protected final int aFm()
  {
    return 8;
  }
  
  protected final int aFo()
  {
    return 2;
  }
  
  protected final boolean aFr()
  {
    boolean bool = true;
    if (this.ihz != null)
    {
      this.ihz.notifyDataSetChanged();
      this.ikC = true;
      this.gQd.setVisibility(8);
    }
    for (;;)
    {
      aFv();
      return bool;
      bool = false;
    }
  }
  
  protected final boolean aFt()
  {
    return true;
  }
  
  protected final boolean aFu()
  {
    return false;
  }
  
  public final void aFv()
  {
    if (this.imf != null)
    {
      if ((this.ihz != null) && (!this.ihz.isEmpty()))
      {
        this.imf.setVisibility(0);
        this.imh.setVisibility(0);
      }
    }
    else {
      return;
    }
    this.imf.setVisibility(8);
    this.imh.setVisibility(8);
  }
  
  protected final void c(adh paramadh)
  {
    super.c(paramadh);
  }
  
  protected final int getLayoutId()
  {
    return R.i.emoji_store_mine;
  }
  
  public final void h(String paramString1, int paramInt1, int paramInt2, String paramString2) {}
  
  protected final void initView()
  {
    setMMTitle(R.l.settings_emoji_mine);
    super.initView();
    this.ilr = findViewById(R.h.sync_view);
    this.ils = ((TextView)this.ilr.findViewById(R.h.sync_status));
    this.ils.setText(R.l.emoji_sync_syncing_in_wifi);
    if (i.aEx().ije.iju)
    {
      i.aEx();
      if (BKGLoaderManager.aEY())
      {
        this.ilr.setVisibility(0);
        ct(8001, 3000);
      }
    }
    for (;;)
    {
      this.CU.setOnScrollListener(null);
      return;
      this.ilr.setVisibility(8);
    }
  }
  
  public final void l(Message paramMessage)
  {
    if ((paramMessage.what == 8001) && (this.ilr != null)) {
      this.ilr.setVisibility(8);
    }
    super.l(paramMessage);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.imd)
    {
      paramView = new Intent();
      paramView.setClass(this, EmojiCustomUI.class);
      startActivity(paramView);
    }
    while (paramView != this.ime) {
      return;
    }
    paramView = new Intent();
    paramView.setClass(this, EmojiPaidUI.class);
    startActivity(paramView);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    int i = getIntent().getIntExtra("10931", 0);
    h.mEJ.k(10931, String.valueOf(i));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiMineUI", "jacks statistics enter Emoji Setting UI:%d", new Object[] { Integer.valueOf(i) });
    setBackBtn(new EmojiMineUI.1(this));
    addTextOptionMenu(0, getString(R.l.emoji_sequence), new EmojiMineUI.2(this));
    au.HU();
    if (!((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sOU, Boolean.valueOf(false))).booleanValue()) {
      com.tencent.mm.plugin.emoji.c.a.eh(true);
    }
    h.mEJ.a(406L, 3L, 1L, false);
    h.mEJ.a(406L, 5L, System.currentTimeMillis() - l, false);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    super.onItemClick(paramAdapterView, paramView, paramInt - 1, paramLong);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/EmojiMineUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */