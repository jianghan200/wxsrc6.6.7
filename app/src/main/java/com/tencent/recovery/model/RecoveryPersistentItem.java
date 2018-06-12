package com.tencent.recovery.model;

import android.os.Parcelable;

public abstract class RecoveryPersistentItem
  implements Parcelable
{
  public abstract boolean ack(String paramString);
  
  public abstract String cEY();
  
  public String toString()
  {
    return cEY();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/model/RecoveryPersistentItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */