package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new ParcelableVolumeInfo.1();
  public int sF;
  public int sG;
  public int sH;
  public int sI;
  public int sJ;
  
  public ParcelableVolumeInfo(Parcel paramParcel)
  {
    this.sF = paramParcel.readInt();
    this.sH = paramParcel.readInt();
    this.sI = paramParcel.readInt();
    this.sJ = paramParcel.readInt();
    this.sG = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.sF);
    paramParcel.writeInt(this.sH);
    paramParcel.writeInt(this.sI);
    paramParcel.writeInt(this.sJ);
    paramParcel.writeInt(this.sG);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/android/support/v4/media/session/ParcelableVolumeInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */