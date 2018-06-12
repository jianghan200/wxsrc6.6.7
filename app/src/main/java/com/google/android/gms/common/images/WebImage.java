package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import java.util.Arrays;

public final class WebImage
  implements SafeParcelable
{
  public static final Parcelable.Creator<WebImage> CREATOR = new b();
  final Uri aMO;
  final int aMP;
  final int aMQ;
  final int mVersionCode;
  
  WebImage(int paramInt1, Uri paramUri, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.aMO = paramUri;
    this.aMP = paramInt2;
    this.aMQ = paramInt3;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (!(paramObject instanceof WebImage))) {
        return false;
      }
      paramObject = (WebImage)paramObject;
    } while ((v.c(this.aMO, ((WebImage)paramObject).aMO)) && (this.aMP == ((WebImage)paramObject).aMP) && (this.aMQ == ((WebImage)paramObject).aMQ));
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.aMO, Integer.valueOf(this.aMP), Integer.valueOf(this.aMQ) });
  }
  
  public final String toString()
  {
    return String.format("Image %dx%d %s", new Object[] { Integer.valueOf(this.aMP), Integer.valueOf(this.aMQ), this.aMO.toString() });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/common/images/WebImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */