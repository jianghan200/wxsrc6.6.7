package com.tencent.mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.facedetect.FaceProNative.FaceStatus;

public class FaceCharacteristicsResult
  implements Parcelable
{
  public static final Parcelable.Creator<FaceCharacteristicsResult> CREATOR = new FaceCharacteristicsResult.1();
  public String Yy;
  public int errCode;
  public FaceProNative.FaceStatus iNo;
  
  public FaceCharacteristicsResult() {}
  
  protected FaceCharacteristicsResult(Parcel paramParcel)
  {
    this.errCode = paramParcel.readInt();
    this.Yy = paramParcel.readString();
  }
  
  public static boolean ps(int paramInt)
  {
    return (paramInt >= 10) && (paramInt < 100);
  }
  
  public static boolean pt(int paramInt)
  {
    return (paramInt > 0) && (paramInt < 10);
  }
  
  public static boolean pu(int paramInt)
  {
    return paramInt <= 0;
  }
  
  public final void ad(int paramInt, String paramString)
  {
    this.errCode = paramInt;
    this.Yy = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "FaceCharacteristicsResult{mStatus=" + this.iNo + ", errCode=" + this.errCode + ", errMsg='" + this.Yy + '\'' + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.iNo, paramInt);
    paramParcel.writeInt(this.errCode);
    paramParcel.writeString(this.Yy);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/facedetect/model/FaceCharacteristicsResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */