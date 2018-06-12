package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.d;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.base.n.d;

public final class f
  implements View.OnCreateContextMenuListener, AdapterView.OnItemLongClickListener
{
  private Activity activity;
  private com.tencent.mm.storage.ai conversation = null;
  private n.d hqV = new f.1(this);
  private String talker = "";
  private g unL;
  private ListView unh;
  private int[] uoE = new int[2];
  
  public f(g paramg, ListView paramListView, Activity paramActivity, int[] paramArrayOfInt)
  {
    this.unL = paramg;
    this.unh = paramListView;
    this.activity = paramActivity;
    this.uoE = paramArrayOfInt;
  }
  
  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    int j = 1;
    au.HU();
    ab localab = c.FR().Yg(this.talker);
    if (localab == null)
    {
      x.e("MicroMsg.ConversationClickListener", "onCreateContextMenu, contact is null, talker = " + this.talker);
      return;
    }
    String str = localab.BL();
    paramView = str;
    if (str.toLowerCase().endsWith("@chatroom"))
    {
      paramView = str;
      if (com.tencent.mm.platformtools.ai.oW(localab.field_nickname)) {
        paramView = this.activity.getString(R.l.chatting_roominfo_noname);
      }
    }
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenu.setHeaderTitle(j.a(this.activity, paramView));
    int i;
    if (this.conversation != null)
    {
      i = 1;
      label129:
      if ((i & s.b(this.conversation)) != 0)
      {
        paramView = this.talker;
        au.HU();
        paramView = c.FW().Yq(paramView);
        if (paramView == null) {
          break label398;
        }
        if ((paramView.field_unReadCount > 0) || (paramView.gh(1048576))) {
          break label392;
        }
        i = j;
        label185:
        if (i == 0) {
          break label404;
        }
        paramContextMenu.add(paramContextMenuInfo.position, 8, 0, R.l.main_conversation_longclick_setUnRead);
      }
      label207:
      if ((this.conversation != null) && (s.a(this.conversation)))
      {
        au.HU();
        if (!c.FW().Yx(this.talker)) {
          break label424;
        }
        paramContextMenu.add(paramContextMenuInfo.position, 6, 0, R.l.main_conversation_longclick_unplacedtop);
      }
    }
    for (;;)
    {
      if ((localab.ckW()) && (com.tencent.mm.l.a.gd(localab.field_type)) && (!s.hP(localab.field_username)) && (!s.hr(localab.field_username)))
      {
        paramView = com.tencent.mm.ac.f.kH(localab.field_username);
        if ((paramView != null) && (paramView.LV())) {
          paramContextMenu.add(paramContextMenuInfo.position, 10, 0, R.l.main_conversation_longclick_delete_biz_service);
        }
      }
      if ((this.conversation == null) || (this.conversation.field_conversationTime == -1L)) {
        break;
      }
      if (!s.hk(this.talker)) {
        break label470;
      }
      paramContextMenu.add(paramContextMenuInfo.position, 4, 0, R.l.main_delete_tmessage);
      return;
      i = 0;
      break label129;
      label392:
      i = 0;
      break label185;
      label398:
      i = 0;
      break label185;
      label404:
      paramContextMenu.add(paramContextMenuInfo.position, 7, 0, R.l.main_conversation_longclick_markRead);
      break label207;
      label424:
      if (localab.ckW()) {
        paramContextMenu.add(paramContextMenuInfo.position, 5, 0, R.l.contact_info_stick_biz);
      } else {
        paramContextMenu.add(paramContextMenuInfo.position, 5, 0, R.l.main_conversation_longclick_placedtop);
      }
    }
    label470:
    if (s.hl(this.talker))
    {
      paramContextMenu.add(paramContextMenuInfo.position, 4, 0, R.l.main_delete_bottleentry);
      return;
    }
    paramContextMenu.add(paramContextMenuInfo.position, 4, 0, R.l.main_delete);
  }
  
  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < this.unh.getHeaderViewsCount())
    {
      x.d("MicroMsg.ConversationClickListener", "on long click header view");
      return true;
    }
    this.conversation = ((com.tencent.mm.storage.ai)this.unL.Dy(paramInt - this.unh.getHeaderViewsCount()));
    if (this.conversation == null)
    {
      x.e("MicroMsg.ConversationClickListener", "headercount:%d, postion:%d", new Object[] { Integer.valueOf(this.unh.getHeaderViewsCount()), Integer.valueOf(paramInt) });
      return true;
    }
    this.talker = this.conversation.field_username;
    new com.tencent.mm.ui.widget.b.a(this.activity).a(paramView, paramInt, paramLong, this, this.hqV, this.uoE[0], this.uoE[1]);
    if (s.fq(this.talker)) {
      h.mEJ.h(14553, new Object[] { Integer.valueOf(1), Integer.valueOf(0), this.talker });
    }
    for (;;)
    {
      return true;
      h.mEJ.h(14553, new Object[] { Integer.valueOf(0), Integer.valueOf(0), this.talker });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/conversation/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */