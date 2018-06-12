package oicq.wlogin_sdk.tools;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ErrMsg
  implements Parcelable, Cloneable
{
  public static final Parcelable.Creator<ErrMsg> CREATOR = new Parcelable.Creator() {};
  public String message;
  public String title;
  private int type;
  public String vJM;
  
  public ErrMsg()
  {
    this.type = 0;
    this.title = "";
    this.message = "";
    this.vJM = "";
  }
  
  private ErrMsg(Parcel paramParcel)
  {
    this.type = paramParcel.readInt();
    this.title = paramParcel.readString();
    this.message = paramParcel.readString();
    this.vJM = paramParcel.readString();
  }
  
  public final void cKi()
  {
    this.type = 0;
    this.title = "";
    this.message = "";
    this.vJM = "";
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.title);
    paramParcel.writeString(this.message);
    paramParcel.writeString(this.vJM);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/tools/ErrMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */