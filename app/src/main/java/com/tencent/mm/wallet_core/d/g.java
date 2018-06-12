package com.tencent.mm.wallet_core.d;

import android.content.Intent;
import com.tencent.mm.ab.l;
import com.tencent.mm.ui.MMActivity;

public abstract class g
{
  public MMActivity fEY;
  public i uXK;
  
  public g(MMActivity paramMMActivity, i parami)
  {
    this.fEY = paramMMActivity;
    this.uXK = parami;
  }
  
  public abstract boolean d(int paramInt1, int paramInt2, String paramString, l paraml);
  
  public abstract boolean m(Object... paramVarArgs);
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public boolean r(Object... paramVarArgs)
  {
    return false;
  }
  
  public boolean s(Object... paramVarArgs)
  {
    return false;
  }
  
  public CharSequence ui(int paramInt)
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/wallet_core/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */