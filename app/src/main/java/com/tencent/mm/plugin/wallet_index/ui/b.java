package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;

public abstract interface b
{
  public abstract void a(MMActivity paramMMActivity, d paramd);
  
  public abstract void a(MMActivity paramMMActivity, ArrayList<String> paramArrayList, d paramd, boolean paramBoolean);
  
  public abstract boolean a(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent);
  
  public abstract void b(MMActivity paramMMActivity, boolean paramBoolean);
  
  public abstract int bRd();
  
  public abstract void j(MMActivity paramMMActivity);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */