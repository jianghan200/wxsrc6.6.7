package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.v.a;
import java.util.Arrays;

public final class ConnectionResult
  implements SafeParcelable
{
  public static final Parcelable.Creator<ConnectionResult> CREATOR = new i();
  public static final ConnectionResult aJB = new ConnectionResult(0, null);
  public final int aJC;
  public final PendingIntent aJD;
  final int mVersionCode;
  
  ConnectionResult(int paramInt1, int paramInt2, PendingIntent paramPendingIntent)
  {
    this.mVersionCode = paramInt1;
    this.aJC = paramInt2;
    this.aJD = paramPendingIntent;
  }
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramPendingIntent);
  }
  
  public final void b(Activity paramActivity, int paramInt)
  {
    if (!op()) {
      return;
    }
    paramActivity.startIntentSenderForResult(this.aJD.getIntentSender(), paramInt, null, 0, 0, 0);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof ConnectionResult)) {
        return false;
      }
      paramObject = (ConnectionResult)paramObject;
    } while ((this.aJC == ((ConnectionResult)paramObject).aJC) && (v.c(this.aJD, ((ConnectionResult)paramObject).aJD)));
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.aJC), this.aJD });
  }
  
  public final boolean isSuccess()
  {
    return this.aJC == 0;
  }
  
  public final boolean op()
  {
    return (this.aJC != 0) && (this.aJD != null);
  }
  
  public final String toString()
  {
    v.a locala = v.ag(this);
    int i = this.aJC;
    String str;
    switch (i)
    {
    case 12: 
    default: 
      str = "UNKNOWN_ERROR_CODE(" + i + ")";
    }
    for (;;)
    {
      return locala.h("statusCode", str).h("resolution", this.aJD).toString();
      str = "SUCCESS";
      continue;
      str = "SERVICE_MISSING";
      continue;
      str = "SERVICE_VERSION_UPDATE_REQUIRED";
      continue;
      str = "SERVICE_DISABLED";
      continue;
      str = "SIGN_IN_REQUIRED";
      continue;
      str = "INVALID_ACCOUNT";
      continue;
      str = "RESOLUTION_REQUIRED";
      continue;
      str = "NETWORK_ERROR";
      continue;
      str = "INTERNAL_ERROR";
      continue;
      str = "SERVICE_INVALID";
      continue;
      str = "DEVELOPER_ERROR";
      continue;
      str = "LICENSE_CHECK_FAILED";
      continue;
      str = "CANCELED";
      continue;
      str = "TIMEOUT";
      continue;
      str = "INTERRUPTED";
      continue;
      str = "API_UNAVAILABLE";
      continue;
      str = "SIGN_IN_FAILED";
      continue;
      str = "SERVICE_UPDATING";
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/common/ConnectionResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */