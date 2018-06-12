package com.tencent.recovery.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class RecoveryStatusItem
  extends RecoveryPersistentItem
{
  public static final Parcelable.Creator<RecoveryStatusItem> CREATOR = new Parcelable.Creator() {};
  public String clientVersion;
  public String fMk;
  public String processName;
  public long timestamp;
  public int vhi;
  public int vhk;
  public int vhl;
  
  public final boolean ack(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return false;
    }
    try
    {
      paramString = paramString.split(",");
      this.processName = paramString[0];
      this.fMk = paramString[1];
      this.clientVersion = paramString[2];
      this.vhi = Integer.valueOf(paramString[3]).intValue();
      this.vhl = Integer.valueOf(paramString[4]).intValue();
      this.vhk = Integer.valueOf(paramString[5]).intValue();
      this.timestamp = Long.valueOf(paramString[6]).longValue();
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public final String cEY()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.processName);
    localStringBuffer.append(",");
    localStringBuffer.append(this.fMk);
    localStringBuffer.append(",");
    localStringBuffer.append(this.clientVersion);
    localStringBuffer.append(",");
    localStringBuffer.append(this.vhi);
    localStringBuffer.append(",");
    localStringBuffer.append(this.vhl);
    localStringBuffer.append(",");
    localStringBuffer.append(this.vhk);
    localStringBuffer.append(",");
    localStringBuffer.append(this.timestamp);
    return localStringBuffer.toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.processName);
    paramParcel.writeString(this.fMk);
    paramParcel.writeString(this.clientVersion);
    paramParcel.writeInt(this.vhi);
    paramParcel.writeInt(this.vhl);
    paramParcel.writeInt(this.vhk);
    paramParcel.writeLong(this.timestamp);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/model/RecoveryStatusItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */