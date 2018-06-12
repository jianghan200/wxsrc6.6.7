package com.tencent.mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import junit.framework.Assert;

public class FaceContextData
  implements Parcelable
{
  public static final Parcelable.Creator<FaceContextData> CREATOR = new FaceContextData.1();
  private static volatile FaceContextData iNp = null;
  public long iNq = -1L;
  
  public FaceContextData() {}
  
  protected FaceContextData(Parcel paramParcel)
  {
    this.iNq = paramParcel.readLong();
  }
  
  public static void a(FaceContextData paramFaceContextData)
  {
    if (paramFaceContextData == null)
    {
      iNp = null;
      return;
    }
    if (iNp != null)
    {
      b(paramFaceContextData);
      return;
    }
    try
    {
      if (iNp != null)
      {
        b(paramFaceContextData);
        return;
      }
    }
    finally {}
    iNp = paramFaceContextData;
  }
  
  public static FaceContextData aJD()
  {
    try
    {
      FaceContextData localFaceContextData = iNp;
      return localFaceContextData;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static void b(FaceContextData paramFaceContextData)
  {
    if ((iNp != null) && (paramFaceContextData != null)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      iNp.iNq = paramFaceContextData.iNq;
      return;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.iNq);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/facedetect/model/FaceContextData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */