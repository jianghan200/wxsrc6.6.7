package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import java.util.Arrays;

public class PlayLoggerContext
  implements SafeParcelable
{
  public static final b CREATOR = new b();
  public final String baA;
  public final boolean baB;
  public final String baC;
  public final boolean baD;
  public final int baE;
  public final int bax;
  public final int bay;
  public final String baz;
  public final String packageName;
  public final int versionCode;
  
  public PlayLoggerContext(int paramInt1, String paramString1, int paramInt2, int paramInt3, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, boolean paramBoolean2, int paramInt4)
  {
    this.versionCode = paramInt1;
    this.packageName = paramString1;
    this.bax = paramInt2;
    this.bay = paramInt3;
    this.baz = paramString2;
    this.baA = paramString3;
    this.baB = paramBoolean1;
    this.baC = paramString4;
    this.baD = paramBoolean2;
    this.baE = paramInt4;
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
      if (!(paramObject instanceof PlayLoggerContext)) {
        break;
      }
      paramObject = (PlayLoggerContext)paramObject;
    } while ((this.versionCode == ((PlayLoggerContext)paramObject).versionCode) && (this.packageName.equals(((PlayLoggerContext)paramObject).packageName)) && (this.bax == ((PlayLoggerContext)paramObject).bax) && (this.bay == ((PlayLoggerContext)paramObject).bay) && (v.c(this.baC, ((PlayLoggerContext)paramObject).baC)) && (v.c(this.baz, ((PlayLoggerContext)paramObject).baz)) && (v.c(this.baA, ((PlayLoggerContext)paramObject).baA)) && (this.baB == ((PlayLoggerContext)paramObject).baB) && (this.baD == ((PlayLoggerContext)paramObject).baD) && (this.baE == ((PlayLoggerContext)paramObject).baE));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.versionCode), this.packageName, Integer.valueOf(this.bax), Integer.valueOf(this.bay), this.baC, this.baz, this.baA, Boolean.valueOf(this.baB), Boolean.valueOf(this.baD), Integer.valueOf(this.baE) });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PlayLoggerContext[");
    localStringBuilder.append("versionCode=").append(this.versionCode).append(',');
    localStringBuilder.append("package=").append(this.packageName).append(',');
    localStringBuilder.append("packageVersionCode=").append(this.bax).append(',');
    localStringBuilder.append("logSource=").append(this.bay).append(',');
    localStringBuilder.append("logSourceName=").append(this.baC).append(',');
    localStringBuilder.append("uploadAccount=").append(this.baz).append(',');
    localStringBuilder.append("loggingId=").append(this.baA).append(',');
    localStringBuilder.append("logAndroidId=").append(this.baB).append(',');
    localStringBuilder.append("isAnonymous=").append(this.baD).append(',');
    localStringBuilder.append("qosTier=").append(this.baE);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/playlog/internal/PlayLoggerContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */