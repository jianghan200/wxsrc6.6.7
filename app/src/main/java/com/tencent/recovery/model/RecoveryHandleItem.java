package com.tencent.recovery.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class RecoveryHandleItem
  extends RecoveryPersistentItem
{
  public static final Parcelable.Creator<RecoveryHandleItem> CREATOR = new Parcelable.Creator() {};
  public String aAL;
  public String clientVersion;
  public String fMk;
  public String processName;
  public long timestamp;
  public String vhx;
  
  public final boolean ack(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return false;
    }
    try
    {
      paramString = paramString.split(",");
      this.fMk = paramString[0];
      this.clientVersion = paramString[1];
      this.aAL = paramString[2];
      this.processName = paramString[3];
      this.vhx = paramString[4];
      this.timestamp = Long.valueOf(paramString[5]).longValue();
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public final String cEY()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.fMk);
    localStringBuffer.append(",");
    localStringBuffer.append(this.clientVersion);
    localStringBuffer.append(",");
    localStringBuffer.append(this.aAL);
    localStringBuffer.append(",");
    localStringBuffer.append(this.processName);
    localStringBuffer.append(",");
    localStringBuffer.append(this.vhx);
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
    paramParcel.writeString(this.fMk);
    paramParcel.writeString(this.clientVersion);
    paramParcel.writeString(this.aAL);
    paramParcel.writeString(this.processName);
    paramParcel.writeString(this.vhx);
    paramParcel.writeLong(this.timestamp);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/model/RecoveryHandleItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */