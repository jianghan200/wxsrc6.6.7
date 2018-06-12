package com.tencent.mm.plugin.mmsight;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.sdk.platformtools.x;

public class SightCaptureResult
  implements Parcelable
{
  public static final Parcelable.Creator<SightCaptureResult> CREATOR = new SightCaptureResult.1();
  public boolean leb = false;
  public boolean lec = false;
  public boolean led = true;
  public String lee = "";
  public String lef = "";
  public String leg = "";
  public String leh = "";
  public int lei = 0;
  public aso lej = new aso();
  public String lek = "";
  
  protected SightCaptureResult(Parcel paramParcel)
  {
    if (paramParcel.readByte() != 0)
    {
      bool = true;
      this.leb = bool;
      if (paramParcel.readByte() == 0) {
        break label193;
      }
      bool = true;
      label88:
      this.lec = bool;
      if (paramParcel.readByte() == 0) {
        break label198;
      }
    }
    label193:
    label198:
    for (boolean bool = true;; bool = false)
    {
      this.led = bool;
      this.lee = paramParcel.readString();
      this.lef = paramParcel.readString();
      this.leg = paramParcel.readString();
      this.leh = paramParcel.readString();
      this.lei = paramParcel.readInt();
      this.lek = paramParcel.readString();
      try
      {
        byte[] arrayOfByte = new byte[paramParcel.readInt()];
        paramParcel.readByteArray(arrayOfByte);
        this.lej = new aso();
        this.lej.aG(arrayOfByte);
        return;
      }
      catch (Exception paramParcel)
      {
        x.e("MicroMsg.SightCaptureResult", "read ext info error: %s", new Object[] { paramParcel.getMessage() });
      }
      bool = false;
      break;
      bool = false;
      break label88;
    }
  }
  
  public SightCaptureResult(boolean paramBoolean, String paramString)
  {
    this.led = paramBoolean;
    this.lek = paramString;
    this.leb = false;
    this.lec = true;
  }
  
  public SightCaptureResult(boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, aso paramaso)
  {
    this.led = paramBoolean;
    this.lee = paramString1;
    this.lef = paramString2;
    this.leg = paramString3;
    this.lei = paramInt;
    this.lej = paramaso;
    this.leh = paramString4;
    this.leb = true;
    this.lec = false;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    if (this.leb)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      if (!this.lec) {
        break label123;
      }
      paramInt = 1;
      label26:
      paramParcel.writeByte((byte)paramInt);
      if (!this.led) {
        break label128;
      }
    }
    label123:
    label128:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeString(this.lee);
      paramParcel.writeString(this.lef);
      paramParcel.writeString(this.leg);
      paramParcel.writeString(this.leh);
      paramParcel.writeInt(this.lei);
      paramParcel.writeString(this.lek);
      try
      {
        byte[] arrayOfByte = this.lej.toByteArray();
        paramParcel.writeInt(arrayOfByte.length);
        paramParcel.writeByteArray(arrayOfByte);
        return;
      }
      catch (Exception paramParcel)
      {
        x.e("MicroMsg.SightCaptureResult", "write ext info error");
      }
      paramInt = 0;
      break;
      paramInt = 0;
      break label26;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/mmsight/SightCaptureResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */