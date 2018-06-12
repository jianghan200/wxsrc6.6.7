package com.tencent.mm.plugin.sns.ui.b;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.mm.sdk.platformtools.x;

public abstract class c
  implements View.OnCreateContextMenuListener
{
  public abstract void a(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo);
  
  public abstract boolean cO(View paramView);
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    if (cO(paramView))
    {
      a(paramContextMenu, paramView, paramContextMenuInfo);
      return;
    }
    x.e("MicroMsg.TimelineOnCreateContextMenuListener", "onMMCreateContextMenu error");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */