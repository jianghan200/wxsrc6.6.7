package com.tencent.mm.plugin.chatroom.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import java.util.HashMap;

public class SelectDateUI
  extends MMActivity
  implements com.tencent.mm.plugin.chatroom.a.a
{
  private p fUo = null;
  private String gBf;
  private long hMw = -1L;
  private DayPickerView hOS;
  private HashMap<String, com.tencent.mm.plugin.chatroom.d.a> hOT;
  private TextView hOU;
  private ag mHandler;
  
  public final void a(com.tencent.mm.plugin.chatroom.d.a parama)
  {
    if (parama == null)
    {
      x.e("MicroMsg.SelectDateUI", "null == calendarDay");
      return;
    }
    x.i("MicroMsg.SelectDateUI", "Day Selected timestamp:%s day:%s month:%s year:%s", new Object[] { Long.valueOf(parama.hKT), Integer.valueOf(parama.day), Integer.valueOf(parama.month), Integer.valueOf(parama.year) });
    long l = parama.bJC;
    x.i("MicroMsg.SelectDateUI", "[goToChattingUI] msgLocalId:%s", new Object[] { Long.valueOf(l) });
    parama = new Intent().putExtra("Chat_User", this.gBf).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", l);
    com.tencent.mm.plugin.chatroom.a.ezn.e(parama, this);
  }
  
  public final long aAv()
  {
    return System.currentTimeMillis();
  }
  
  protected final int getLayoutId()
  {
    return R.i.select_date_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.room_search_chatting_content);
    this.hOS = ((DayPickerView)findViewById(R.h.pickerView));
    this.hOU = ((TextView)findViewById(R.h.search_nothing_hint));
    this.hOT = new HashMap();
    this.mHandler = new ag(getMainLooper());
    this.gBf = getIntent().getStringExtra("detail_username");
    e.post(new Runnable()
    {
      public final void run()
      {
        SelectDateUI.a(SelectDateUI.this);
        SelectDateUI.f(SelectDateUI.this).post(new SelectDateUI.1.1(this));
      }
    }, "prepare_data");
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        SelectDateUI.this.finish();
        return true;
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/SelectDateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */