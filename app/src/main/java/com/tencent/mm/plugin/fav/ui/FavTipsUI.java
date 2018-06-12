package com.tencent.mm.plugin.fav.ui;

import android.os.Bundle;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public class FavTipsUI
  extends MMBaseActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new c.a(this);
    paramBundle.abt(getString(m.i.favorite_intro_title));
    paramBundle.abu(getString(m.i.favorite_intro_p_1) + "\n\n" + getString(m.i.favorite_intro_p_2));
    paramBundle.Gt(m.i.favorite_intro_btn).a(new FavTipsUI.1(this));
    paramBundle.e(new FavTipsUI.2(this));
    paramBundle.anj().show();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/FavTipsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */