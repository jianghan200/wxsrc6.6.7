package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import java.util.Arrays;

public class Asset
  implements SafeParcelable
{
  public static final Parcelable.Creator<Asset> CREATOR = new s();
  public byte[] bdf;
  public String bdg;
  public ParcelFileDescriptor bdh;
  final int mVersionCode;
  public Uri uri;
  
  Asset(int paramInt, byte[] paramArrayOfByte, String paramString, ParcelFileDescriptor paramParcelFileDescriptor, Uri paramUri)
  {
    this.mVersionCode = paramInt;
    this.bdf = paramArrayOfByte;
    this.bdg = paramString;
    this.bdh = paramParcelFileDescriptor;
    this.uri = paramUri;
  }
  
  public static Asset a(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    if (paramParcelFileDescriptor == null) {
      throw new IllegalArgumentException("Asset fd cannot be null");
    }
    return new Asset(1, null, null, paramParcelFileDescriptor, null);
  }
  
  public static Asset bB(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Asset digest cannot be null");
    }
    return new Asset(1, null, paramString, null, null);
  }
  
  public static Asset o(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("Asset data cannot be null");
    }
    return new Asset(1, paramArrayOfByte, null, null, null);
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
      if (!(paramObject instanceof Asset)) {
        return false;
      }
      paramObject = (Asset)paramObject;
    } while ((v.c(this.bdf, ((Asset)paramObject).bdf)) && (v.c(this.bdg, ((Asset)paramObject).bdg)) && (v.c(this.bdh, ((Asset)paramObject).bdh)) && (v.c(this.uri, ((Asset)paramObject).uri)));
    return false;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.bdf, this.bdg, this.bdh, this.uri });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Asset[@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    if (this.bdg == null) {
      localStringBuilder.append(", nodigest");
    }
    for (;;)
    {
      if (this.bdf != null)
      {
        localStringBuilder.append(", size=");
        localStringBuilder.append(this.bdf.length);
      }
      if (this.bdh != null)
      {
        localStringBuilder.append(", fd=");
        localStringBuilder.append(this.bdh);
      }
      if (this.uri != null)
      {
        localStringBuilder.append(", uri=");
        localStringBuilder.append(this.uri);
      }
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(", ");
      localStringBuilder.append(this.bdg);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    s.a(this, paramParcel, paramInt | 0x1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/wearable/Asset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */