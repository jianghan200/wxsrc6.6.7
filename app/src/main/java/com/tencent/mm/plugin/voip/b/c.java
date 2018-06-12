package com.tencent.mm.plugin.voip.b;

import android.annotation.SuppressLint;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class c
{
  public int mState;
  public Map<Integer, Map<Integer, Integer>> oSW;
  
  public c(int paramInt)
  {
    this.mState = paramInt;
  }
  
  @SuppressLint({"UseSparseArrays"})
  public final void Y(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.oSW == null) {
      this.oSW = new HashMap();
    }
    Object localObject;
    if (!this.oSW.containsKey(Integer.valueOf(paramInt1)))
    {
      localObject = new HashMap();
      this.oSW.put(Integer.valueOf(paramInt1), localObject);
    }
    for (;;)
    {
      ((Map)localObject).put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt3));
      return;
      localObject = (Map)this.oSW.get(Integer.valueOf(paramInt1));
    }
  }
  
  public final boolean yX(int paramInt)
  {
    if ((this.oSW == null) || (!this.oSW.containsKey(Integer.valueOf(this.mState))))
    {
      x.e("MicroMsg.Voip.VoipStateMachine", "no rule for state: %s", new Object[] { b.yR(this.mState) });
      return false;
    }
    if (!((Map)this.oSW.get(Integer.valueOf(this.mState))).containsKey(Integer.valueOf(paramInt)))
    {
      x.e("MicroMsg.Voip.VoipStateMachine", "state: %s don't contain rule for action: %s", new Object[] { b.yR(this.mState), b.yR(paramInt) });
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */