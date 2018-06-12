package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class d<T>
  implements Parcelable.ClassLoaderCreator<T>
{
  private final c<T> sV;
  
  public d(c<T> paramc)
  {
    this.sV = paramc;
  }
  
  public final T createFromParcel(Parcel paramParcel)
  {
    return (T)this.sV.createFromParcel(paramParcel, null);
  }
  
  public final T createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return (T)this.sV.createFromParcel(paramParcel, paramClassLoader);
  }
  
  public final T[] newArray(int paramInt)
  {
    return this.sV.newArray(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/os/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */