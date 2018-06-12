package com.tencent.tencentmap.mapsdk.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class qv
  implements Parcelable
{
  public static final Parcelable.Creator<qv> CREATOR = new qv.1();
  private int a = 0;
  private int b = 0;
  
  public qv(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  private qv(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      do
      {
        return false;
      } while (paramObject.getClass() != getClass());
      paramObject = (qv)paramObject;
    } while ((this.a != ((qv)paramObject).a) || (this.b != ((qv)paramObject).b));
    return true;
  }
  
  public final int hashCode()
  {
    return this.b * 7 + this.a * 11;
  }
  
  public final String toString()
  {
    return this.a + "," + this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */