package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DataItemParcelable
  implements SafeParcelable, f
{
  public static final Parcelable.Creator<DataItemParcelable> CREATOR = new e();
  final Uri aMJ;
  byte[] bdf;
  final Map<String, g> ber;
  final int mVersionCode;
  
  DataItemParcelable(int paramInt, Uri paramUri, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    this.mVersionCode = paramInt;
    this.aMJ = paramUri;
    paramUri = new HashMap();
    paramBundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramUri.put(str, (DataItemAssetParcelable)paramBundle.getParcelable(str));
    }
    this.ber = paramUri;
    this.bdf = paramArrayOfByte;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final byte[] getData()
  {
    return this.bdf;
  }
  
  public final Uri getUri()
  {
    return this.aMJ;
  }
  
  public final Map<String, g> rQ()
  {
    return this.ber;
  }
  
  public String toString()
  {
    boolean bool = Log.isLoggable("DataItem", 3);
    StringBuilder localStringBuilder = new StringBuilder("DataItemParcelable[");
    localStringBuilder.append("@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    Object localObject2 = new StringBuilder(",dataSz=");
    if (this.bdf == null) {}
    for (Object localObject1 = "null";; localObject1 = Integer.valueOf(this.bdf.length))
    {
      localStringBuilder.append(localObject1);
      localStringBuilder.append(", numAssets=" + this.ber.size());
      localStringBuilder.append(", uri=" + this.aMJ);
      if (bool) {
        break;
      }
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
    localStringBuilder.append("]\n  assets: ");
    localObject1 = this.ber.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      localStringBuilder.append("\n    " + (String)localObject2 + ": " + this.ber.get(localObject2));
    }
    localStringBuilder.append("\n  ]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/DataItemParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */