package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.v.a;
import java.util.Arrays;

public final class Status
  implements g, SafeParcelable
{
  public static final Parcelable.Creator<Status> CREATOR = new t();
  public static final Status aKp = new Status(0);
  public static final Status aKq = new Status(14);
  public static final Status aKr = new Status(8);
  public static final Status aKs = new Status(15);
  public static final Status aKt = new Status(16);
  public final int aJC;
  final PendingIntent aJD;
  public final String aKu;
  final int mVersionCode;
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.mVersionCode = paramInt1;
    this.aJC = paramInt2;
    this.aKu = paramString;
    this.aJD = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }
  
  public Status(String paramString)
  {
    this(1, 8, paramString, null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status)) {}
    do
    {
      return false;
      paramObject = (Status)paramObject;
    } while ((this.mVersionCode != ((Status)paramObject).mVersionCode) || (this.aJC != ((Status)paramObject).aJC) || (!v.c(this.aKu, ((Status)paramObject).aKu)) || (!v.c(this.aJD, ((Status)paramObject).aJD)));
    return true;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.mVersionCode), Integer.valueOf(this.aJC), this.aKu, this.aJD });
  }
  
  public final boolean isSuccess()
  {
    return this.aJC <= 0;
  }
  
  public final Status oF()
  {
    return this;
  }
  
  public final String toString()
  {
    v.a locala = v.ag(this);
    if (this.aKu != null) {}
    for (String str = this.aKu;; str = b.dl(this.aJC)) {
      return locala.h("statusCode", str).h("resolution", this.aJD).toString();
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    t.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/common/api/Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */