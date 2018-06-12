package com.tencent.mm.ui.chatting.b;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.widget.ListView;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.chatting.b.b.k;
import com.tencent.mm.ui.chatting.b.b.m;
import com.tencent.mm.ui.chatting.b.b.w;

@com.tencent.mm.ui.chatting.b.a.a(cwo=k.class)
public class n
  extends a
  implements k
{
  public final void cpG()
  {
    cuZ();
  }
  
  public final void cpK()
  {
    cuY();
  }
  
  @TargetApi(11)
  public final void cuY()
  {
    if (Build.VERSION.SDK_INT < 11) {
      x.d("MicroMsg.ChattingUI.DragDropComponent", "sdk not support dragdrop event");
    }
    ChatFooter localChatFooter;
    do
    {
      return;
      if (this.bAG.getListView() != null) {
        this.bAG.getListView().setOnDragListener(null);
      }
      localChatFooter = ((m)this.bAG.O(m.class)).cvb();
    } while (localChatFooter == null);
    localChatFooter.setOnDragListener(null);
    localChatFooter.setEditTextOnDragListener(null);
  }
  
  @TargetApi(11)
  public final void cuZ()
  {
    boolean bool1 = ((w)this.bAG.O(w.class)).cvQ();
    boolean bool2 = ((w)this.bAG.O(w.class)).cvR();
    if ((bool1) || (bool2)) {
      return;
    }
    if (Build.VERSION.SDK_INT < 11)
    {
      x.d("MicroMsg.ChattingUI.DragDropComponent", "sdk not support dragdrop event");
      return;
    }
    new n.1(this).run();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/chatting/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */