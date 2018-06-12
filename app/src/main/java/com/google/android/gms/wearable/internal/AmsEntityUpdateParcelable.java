package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AmsEntityUpdateParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator<AmsEntityUpdateParcelable> CREATOR = new at();
  byte bdX;
  final byte bdY;
  final String mValue;
  final int mVersionCode;
  
  AmsEntityUpdateParcelable(int paramInt, byte paramByte1, byte paramByte2, String paramString)
  {
    this.bdX = paramByte1;
    this.mVersionCode = paramInt;
    this.bdY = paramByte2;
    this.mValue = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (AmsEntityUpdateParcelable)paramObject;
      if (this.bdX != ((AmsEntityUpdateParcelable)paramObject).bdX) {
        return false;
      }
      if (this.mVersionCode != ((AmsEntityUpdateParcelable)paramObject).mVersionCode) {
        return false;
      }
      if (this.bdY != ((AmsEntityUpdateParcelable)paramObject).bdY) {
        return false;
      }
    } while (this.mValue.equals(((AmsEntityUpdateParcelable)paramObject).mValue));
    return false;
  }
  
  public int hashCode()
  {
    return ((this.mVersionCode * 31 + this.bdX) * 31 + this.bdY) * 31 + this.mValue.hashCode();
  }
  
  public String toString()
  {
    return "AmsEntityUpdateParcelable{mVersionCode=" + this.mVersionCode + ", mEntityId=" + this.bdX + ", mAttributeId=" + this.bdY + ", mValue='" + this.mValue + '\'' + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    at.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/wearable/internal/AmsEntityUpdateParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */