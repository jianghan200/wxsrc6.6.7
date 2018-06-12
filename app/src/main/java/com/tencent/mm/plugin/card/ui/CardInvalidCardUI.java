package com.tencent.mm.plugin.card.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.model.r;
import com.tencent.mm.ui.base.h;

public class CardInvalidCardUI
  extends CardBaseUI
{
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    super.a(paramInt1, paramInt2, paramString, paraml);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paraml instanceof r)))
    {
      if (!this.htp) {
        break label53;
      }
      h.bA(this, getResources().getString(a.g.card_clear_success_tips));
    }
    for (;;)
    {
      this.htp = false;
      return;
      label53:
      h.bA(this, getResources().getString(a.g.card_delete_success_tips));
    }
  }
  
  protected final void avD()
  {
    setMMTitle(a.g.card_invalid_card);
    addTextOptionMenu(0, getString(a.g.card_clear), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        CardInvalidCardUI.a(CardInvalidCardUI.this);
        return true;
      }
    });
    if (this.htl.getCount() > 0)
    {
      enableOptionMenu(true);
      return;
    }
    enableOptionMenu(false);
  }
  
  protected final int avE()
  {
    return n.a.hwO;
  }
  
  protected final int getLayoutId()
  {
    return a.e.card_invalid_card_ui;
  }
  
  protected final void initView()
  {
    super.initView();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    super.initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardInvalidCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */