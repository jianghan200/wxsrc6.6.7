package com.tencent.mm.plugin.emoji.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Message;
import android.widget.TextView;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.sortlist.DragSortListView;
import com.tencent.mm.ui.widget.sortlist.DragSortListView.h;
import com.tencent.mm.ui.widget.sortlist.DragSortListView.l;
import java.util.ArrayList;
import java.util.Iterator;

public class EmojiSortUI
  extends EmojiBaseActivity
  implements com.tencent.mm.ab.e, j.a
{
  ProgressDialog eEX;
  private com.tencent.mm.plugin.emoji.a.e iml;
  private DragSortListView imm;
  private com.tencent.mm.plugin.emoji.f.s imn;
  private DragSortListView.h imo = new EmojiSortUI.4(this);
  private DragSortListView.l imp = new EmojiSortUI.5(this);
  private ArrayList<EmojiGroupInfo> mData = new ArrayList();
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.d("MicroMsg.emoji.EmojiSortUI", "ErrType:" + paramInt1 + "   errCode:" + paramInt2);
    if (this.eEX != null) {
      this.eEX.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt1 == 0))
    {
      this.iml.aDC();
      finish();
      return;
    }
    h.a(this, getString(R.l.emoji_sort_failed), "", new EmojiSortUI.6(this));
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    if ((paramString != null) && (paramString.equals("event_update_group")) && (this.iml != null))
    {
      paramString = this.iml;
      paraml = i.aEA().igy.cnt();
      paramString.clear();
      paraml = paraml.iterator();
      while (paraml.hasNext()) {
        paramString.insert((EmojiGroupInfo)paraml.next(), paramString.getCount());
      }
      paramString.notifyDataSetChanged();
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.emoji_sort;
  }
  
  protected final void initView()
  {
    setBackBtn(new EmojiSortUI.1(this));
    setMMTitle(getString(R.l.settings_emoji_manager));
    addTextOptionMenu(0, getString(R.l.app_finish), new EmojiSortUI.2(this));
    ((TextView)findViewById(16908310)).setText(R.l.emoji_store_manage_title);
  }
  
  public final void k(Message paramMessage) {}
  
  public final void l(Message paramMessage) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    this.mData = i.aEA().igy.cnt();
    this.imm = ((DragSortListView)findViewById(16908298));
    this.imm.setDropListener(this.imo);
    this.imm.setRemoveListener(this.imp);
    this.iml = new com.tencent.mm.plugin.emoji.a.e(this.mController.tml, this.mData);
    this.imm.setAdapter(this.iml);
    i.aEA().igy.c(this);
    au.DF().a(717, this);
  }
  
  protected void onDestroy()
  {
    i.aEA().igy.d(this);
    au.DF().b(717, this);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/EmojiSortUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */