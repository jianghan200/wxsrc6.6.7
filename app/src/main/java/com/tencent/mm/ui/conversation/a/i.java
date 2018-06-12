package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import com.tencent.mm.R.f;
import com.tencent.mm.R.i;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.b.c;

public final class i
  extends b
{
  int csE;
  private c tiA;
  View usj;
  
  public i(Context paramContext)
  {
    super(paramContext);
    this.usj = View.inflate(paramContext, R.i.invite_friend_view_in_chat, null);
    if (this.usj == null) {
      return;
    }
    this.csE = ai.getInt(g.AT().getValue("InviteFriendsControlFlags"), 0);
    this.usj.setVisibility(8);
    this.usj.setPadding(0, -com.tencent.mm.bp.a.fromDPToPix(paramContext, R.f.NormalListHeight), 0, 0);
    if ((this.csE & 0x1) > 0)
    {
      this.usj.setVisibility(0);
      this.usj.setPadding(0, 0, 0, 0);
    }
    this.usj.setOnClickListener(new i.1(this, paramContext));
    this.tiA = new i.2(this);
  }
  
  public final boolean anR()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.tiA);
    return (this.usj != null) && (this.usj.getVisibility() == 0);
  }
  
  public final void destroy() {}
  
  public final int getLayoutId()
  {
    return -1;
  }
  
  public final View getView()
  {
    return this.usj;
  }
  
  public final void release()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.tiA);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/conversation/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */