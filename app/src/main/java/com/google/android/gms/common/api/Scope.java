package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;

public final class Scope
  implements SafeParcelable
{
  public static final Parcelable.Creator<Scope> CREATOR = new s();
  final String aKo;
  final int mVersionCode;
  
  Scope(int paramInt, String paramString)
  {
    w.i(paramString, "scopeUri must not be null or empty");
    this.mVersionCode = paramInt;
    this.aKo = paramString;
  }
  
  public Scope(String paramString)
  {
    this(1, paramString);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Scope)) {
      return false;
    }
    return this.aKo.equals(((Scope)paramObject).aKo);
  }
  
  public final int hashCode()
  {
    return this.aKo.hashCode();
  }
  
  public final String toString()
  {
    return this.aKo;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    s.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/common/api/Scope.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */