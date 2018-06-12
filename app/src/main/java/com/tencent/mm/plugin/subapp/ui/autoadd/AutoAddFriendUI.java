package com.tencent.mm.plugin.subapp.ui.autoadd;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.k.e;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class AutoAddFriendUI
  extends MMActivity
{
  private MMSwitchBtn orG = null;
  private TextView orH = null;
  private MMSwitchBtn orI = null;
  private SparseIntArray orJ = new SparseIntArray();
  private int status;
  
  private static int bGv()
  {
    String str2 = com.tencent.mm.k.g.AT().getValue("AutoAddFriendShow");
    String str1 = str2;
    if (bi.oW(str2)) {
      str1 = "0";
    }
    try
    {
      i = bi.getInt(str1, 0);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AutoAddFriendUI", "getAutoAddDynamicConfig, autoAdd = %d", new Object[] { Integer.valueOf(i) });
      return i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i = 0;
      }
    }
  }
  
  private boolean uL(int paramInt)
  {
    return (this.status & paramInt) != 0;
  }
  
  protected final int getLayoutId()
  {
    return R.i.auto_add_friend;
  }
  
  protected final void initView()
  {
    this.orG = ((MMSwitchBtn)findViewById(R.h.need_to_verify));
    this.orH = ((TextView)findViewById(R.h.auto_add_contact_text));
    this.orI = ((MMSwitchBtn)findViewById(R.h.auto_add_contact));
    boolean bool = uL(32);
    this.orG.setCheck(bool);
    if (bGv() == 1)
    {
      this.orI.setCheck(uL(2097152));
      this.orI.setSwitchListener(new AutoAddFriendUI.1(this));
    }
    for (;;)
    {
      this.orG.setSwitchListener(new AutoAddFriendUI.2(this));
      setBackBtn(new AutoAddFriendUI.3(this));
      return;
      this.orH.setVisibility(8);
      this.orI.setVisibility(8);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.auto_add_friend_title);
    this.status = q.GJ();
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
    au.HU();
    c.DT().set(7, Integer.valueOf(this.status));
    int i = 0;
    while (i < this.orJ.size())
    {
      int j = this.orJ.keyAt(i);
      int k = this.orJ.valueAt(i);
      xt localxt = new xt();
      localxt.rDz = j;
      localxt.rDA = k;
      au.HU();
      c.FQ().b(new h.a(23, localxt));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AutoAddFriendUI", "switch  " + j + " " + k);
      i += 1;
    }
    this.orJ.clear();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/autoadd/AutoAddFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */