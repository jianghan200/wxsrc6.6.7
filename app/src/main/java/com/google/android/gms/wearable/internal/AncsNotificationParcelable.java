package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AncsNotificationParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator<AncsNotificationParcelable> CREATOR = new av();
  final String aYu;
  String baG;
  final String bdZ;
  final String bea;
  final String beb;
  final String bec;
  byte bed;
  byte bee;
  byte bef;
  byte beg;
  int mId;
  final int mVersionCode;
  
  AncsNotificationParcelable(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
  {
    this.mId = paramInt2;
    this.mVersionCode = paramInt1;
    this.aYu = paramString1;
    this.bdZ = paramString2;
    this.bea = paramString3;
    this.beb = paramString4;
    this.bec = paramString5;
    this.baG = paramString6;
    this.bed = paramByte1;
    this.bee = paramByte2;
    this.bef = paramByte3;
    this.beg = paramByte4;
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
      paramObject = (AncsNotificationParcelable)paramObject;
      if (this.beg != ((AncsNotificationParcelable)paramObject).beg) {
        return false;
      }
      if (this.bef != ((AncsNotificationParcelable)paramObject).bef) {
        return false;
      }
      if (this.bee != ((AncsNotificationParcelable)paramObject).bee) {
        return false;
      }
      if (this.bed != ((AncsNotificationParcelable)paramObject).bed) {
        return false;
      }
      if (this.mId != ((AncsNotificationParcelable)paramObject).mId) {
        return false;
      }
      if (this.mVersionCode != ((AncsNotificationParcelable)paramObject).mVersionCode) {
        return false;
      }
      if (!this.aYu.equals(((AncsNotificationParcelable)paramObject).aYu)) {
        return false;
      }
      if (this.bdZ != null)
      {
        if (this.bdZ.equals(((AncsNotificationParcelable)paramObject).bdZ)) {}
      }
      else {
        while (((AncsNotificationParcelable)paramObject).bdZ != null) {
          return false;
        }
      }
      if (!this.baG.equals(((AncsNotificationParcelable)paramObject).baG)) {
        return false;
      }
      if (!this.bea.equals(((AncsNotificationParcelable)paramObject).bea)) {
        return false;
      }
      if (!this.bec.equals(((AncsNotificationParcelable)paramObject).bec)) {
        return false;
      }
    } while (this.beb.equals(((AncsNotificationParcelable)paramObject).beb));
    return false;
  }
  
  public int hashCode()
  {
    int j = this.mVersionCode;
    int k = this.mId;
    int m = this.aYu.hashCode();
    if (this.bdZ != null) {}
    for (int i = this.bdZ.hashCode();; i = 0) {
      return ((((((((i + ((j * 31 + k) * 31 + m) * 31) * 31 + this.bea.hashCode()) * 31 + this.beb.hashCode()) * 31 + this.bec.hashCode()) * 31 + this.baG.hashCode()) * 31 + this.bed) * 31 + this.bee) * 31 + this.bef) * 31 + this.beg;
    }
  }
  
  public String toString()
  {
    return "AncsNotificationParcelable{mVersionCode=" + this.mVersionCode + ", mId=" + this.mId + ", mAppId='" + this.aYu + '\'' + ", mDateTime='" + this.bdZ + '\'' + ", mNotificationText='" + this.bea + '\'' + ", mTitle='" + this.beb + '\'' + ", mSubtitle='" + this.bec + '\'' + ", mDisplayName='" + this.baG + '\'' + ", mEventId=" + this.bed + ", mEventFlags=" + this.bee + ", mCategoryId=" + this.bef + ", mCategoryCount=" + this.beg + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    av.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/wearable/internal/AncsNotificationParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */