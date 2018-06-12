package com.tencent.recovery;

import com.tencent.recovery.model.RecoveryStatusItem;
import java.util.ArrayList;

public final class RecoveryContext
{
  public ArrayList<RecoveryStatusItem> vhg = new ArrayList();
  
  public final String toString()
  {
    return this.vhg.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/RecoveryContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */