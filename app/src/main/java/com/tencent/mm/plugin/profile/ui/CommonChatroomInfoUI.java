package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.o;

public class CommonChatroomInfoUI
  extends MMBaseSelectContactUI
{
  private ab guS;
  private a lUx;
  private b lUy;
  
  protected final void Wj()
  {
    super.Wj();
    String str = getIntent().getStringExtra("Select_Talker_Name");
    au.HU();
    this.guS = c.FR().Yg(str);
  }
  
  protected final boolean Wk()
  {
    return true;
  }
  
  protected final boolean Wl()
  {
    return false;
  }
  
  protected final String Wm()
  {
    if (this.guS.sex == 1) {
      return getString(R.l.contact_info_common_chatroom_male);
    }
    if (this.guS.sex == 2) {
      return getString(R.l.contact_info_common_chatroom_female);
    }
    return getString(R.l.contact_info_common_chatroom_unknow);
  }
  
  protected final o Wn()
  {
    if (this.lUx == null) {
      this.lUx = new a(this, this.scene, this.guS);
    }
    return this.lUx;
  }
  
  protected final m Wo()
  {
    if (this.lUy == null) {
      this.lUy = new b(this, this.scene, this.guS);
    }
    return this.lUy;
  }
  
  public final void iV(int paramInt)
  {
    e locale = (e)getContentLV().getAdapter().getItem(paramInt);
    if (locale != null) {
      d.e(this, ".ui.chatting.ChattingUI", new Intent().putExtra("Chat_User", locale.guS.field_username).putExtra("finish_direct", true));
    }
  }
  
  protected final void initView()
  {
    super.initView();
    a locala = this.lUx;
    i locali = new i();
    locali.bWm = locala.guS.field_username;
    locali.jsv = locala;
    locali.handler = locala.handler;
    locali.jsn = 6;
    locali.jsu = new a.a(locala, (byte)0);
    ((n)g.n(n.class)).search(2, locali);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/CommonChatroomInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */