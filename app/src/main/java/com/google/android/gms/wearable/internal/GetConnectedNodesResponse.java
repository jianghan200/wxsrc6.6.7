package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class GetConnectedNodesResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<GetConnectedNodesResponse> CREATOR = new q();
  public final List<NodeParcelable> beB;
  public final int statusCode;
  public final int versionCode;
  
  GetConnectedNodesResponse(int paramInt1, int paramInt2, List<NodeParcelable> paramList)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.beB = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    q.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/wearable/internal/GetConnectedNodesResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */