package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.a;

public class ConverterWrapper
  implements SafeParcelable
{
  public static final a CREATOR = new a();
  public final StringToIntConverter aOP;
  final int mVersionCode;
  
  ConverterWrapper(int paramInt, StringToIntConverter paramStringToIntConverter)
  {
    this.mVersionCode = paramInt;
    this.aOP = paramStringToIntConverter;
  }
  
  private ConverterWrapper(StringToIntConverter paramStringToIntConverter)
  {
    this.mVersionCode = 1;
    this.aOP = paramStringToIntConverter;
  }
  
  public static ConverterWrapper a(FastJsonResponse.a<?, ?> parama)
  {
    if ((parama instanceof StringToIntConverter)) {
      return new ConverterWrapper((StringToIntConverter)parama);
    }
    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/gms/common/server/converter/ConverterWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */