package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState
  implements Parcelable
{
  public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator() {};
  FragmentState[] or;
  int[] os;
  BackStackState[] ot;
  
  public FragmentManagerState() {}
  
  public FragmentManagerState(Parcel paramParcel)
  {
    this.or = ((FragmentState[])paramParcel.createTypedArray(FragmentState.CREATOR));
    this.os = paramParcel.createIntArray();
    this.ot = ((BackStackState[])paramParcel.createTypedArray(BackStackState.CREATOR));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedArray(this.or, paramInt);
    paramParcel.writeIntArray(this.os);
    paramParcel.writeTypedArray(this.ot, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/FragmentManagerState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */