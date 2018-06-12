package com.tencent.mm.plugin.multitalk.ui;

import com.tencent.mm.R.e;
import com.tencent.mm.plugin.multitalk.ui.widget.b;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;

public class MultiTalkAddMembersUI
  extends MultiTalkSelectContactUI
{
  protected final void initView()
  {
    super.initView();
    this.lbw.setBackgroundResource(R.e.default_bg_color);
    this.lbw.setPadding(b.lvi, b.lvi, b.lvi, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/multitalk/ui/MultiTalkAddMembersUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */