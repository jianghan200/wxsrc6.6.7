package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat
  implements Parcelable
{
  public static final Parcelable.Creator<RatingCompat> CREATOR = new RatingCompat.1();
  private final float sA;
  private final int sz;
  
  private RatingCompat(int paramInt, float paramFloat)
  {
    this.sz = paramInt;
    this.sA = paramFloat;
  }
  
  public final int describeContents()
  {
    return this.sz;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Rating:style=").append(this.sz).append(" rating=");
    if (this.sA < 0.0F) {}
    for (String str = "unrated";; str = String.valueOf(this.sA)) {
      return str;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.sz);
    paramParcel.writeFloat(this.sA);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/android/support/v4/media/RatingCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */