package com.tencent.mm.modelsimple;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class BindWordingContent
  implements Parcelable
{
  public static final Parcelable.Creator<BindWordingContent> CREATOR = new BindWordingContent.1();
  public Integer brl = Integer.valueOf(0);
  public String content = "";
  public String title = "";
  
  public BindWordingContent(Parcel paramParcel)
  {
    String[] arrayOfString = new String[2];
    paramParcel.readStringArray(arrayOfString);
    this.title = arrayOfString[0];
    this.content = arrayOfString[1];
    this.brl = Integer.valueOf(paramParcel.readInt());
  }
  
  public BindWordingContent(String paramString1, String paramString2)
  {
    this.title = paramString1;
    this.content = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStringArray(new String[] { this.title, this.content });
    paramParcel.writeInt(this.brl.intValue());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelsimple/BindWordingContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */