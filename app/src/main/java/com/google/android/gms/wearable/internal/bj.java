package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.g;

public final class bj
  implements g
{
  private final String aEN;
  private final String aXv;
  
  public bj(g paramg)
  {
    this.aEN = paramg.getId();
    this.aXv = paramg.rR();
  }
  
  public final String getId()
  {
    return this.aEN;
  }
  
  public final String rR()
  {
    return this.aXv;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataItemAssetEntity[");
    localStringBuilder.append("@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    if (this.aEN == null) {
      localStringBuilder.append(",noid");
    }
    for (;;)
    {
      localStringBuilder.append(", key=");
      localStringBuilder.append(this.aXv);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(",");
      localStringBuilder.append(this.aEN);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/wearable/internal/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */