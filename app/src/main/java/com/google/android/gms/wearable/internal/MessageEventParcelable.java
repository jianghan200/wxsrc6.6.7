package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.l;

public class MessageEventParcelable
  implements SafeParcelable, l
{
  public static final Parcelable.Creator<MessageEventParcelable> CREATOR = new aa();
  final String aYw;
  final byte[] bdf;
  final int beF;
  final String ben;
  final int mVersionCode;
  
  MessageEventParcelable(int paramInt1, int paramInt2, String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    this.mVersionCode = paramInt1;
    this.beF = paramInt2;
    this.ben = paramString1;
    this.bdf = paramArrayOfByte;
    this.aYw = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final byte[] getData()
  {
    return this.bdf;
  }
  
  public final String getPath()
  {
    return this.ben;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("MessageEventParcelable[").append(this.beF).append(",").append(this.ben).append(", size=");
    if (this.bdf == null) {}
    for (Object localObject = "null";; localObject = Integer.valueOf(this.bdf.length)) {
      return localObject + "]";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    aa.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/wearable/internal/MessageEventParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */