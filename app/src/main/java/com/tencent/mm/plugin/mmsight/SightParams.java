package com.tencent.mm.plugin.mmsight;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelcontrol.d;
import com.tencent.mm.storage.x;

public class SightParams
  implements Parcelable
{
  public static final Parcelable.Creator<SightParams> CREATOR = new SightParams.1();
  public int lel = 2;
  public VideoTransPara lem;
  public String len = "";
  public String leo = "";
  public String lep = "";
  public String leq = "";
  public String ler = "";
  public boolean les = true;
  public boolean let = true;
  public String leu = "";
  public int lev;
  public int mode = 0;
  public int scene = -1;
  
  public SightParams(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 1) {
      this.lem = d.NP().NQ();
    }
    for (;;)
    {
      this.scene = paramInt1;
      this.mode = paramInt2;
      g.Ek();
      this.lev = ((Integer)g.Ei().DT().get(344066, Integer.valueOf(0))).intValue();
      return;
      if ((paramInt1 == 2) || (paramInt1 == 3) || (paramInt1 == 4)) {
        this.lem = d.NP().NR();
      } else {
        this.lem = d.NP().NR();
      }
    }
  }
  
  protected SightParams(Parcel paramParcel)
  {
    this.mode = paramParcel.readInt();
    this.lem = ((VideoTransPara)paramParcel.readParcelable(VideoTransPara.class.getClassLoader()));
    this.len = paramParcel.readString();
    this.leo = paramParcel.readString();
    this.lep = paramParcel.readString();
    this.leq = paramParcel.readString();
    this.lev = paramParcel.readInt();
    this.lel = paramParcel.readInt();
    if (paramParcel.readInt() > 0)
    {
      bool1 = true;
      this.les = bool1;
      this.scene = paramParcel.readInt();
      if (paramParcel.readByte() == 0) {
        break label189;
      }
    }
    label189:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.let = bool1;
      this.leu = paramParcel.readString();
      return;
      bool1 = false;
      break;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final SightParams m(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.lep = paramString1;
    this.len = paramString2;
    this.leo = paramString3;
    this.leq = paramString4;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byte b = 1;
    paramParcel.writeInt(this.mode);
    paramParcel.writeParcelable(this.lem, paramInt);
    paramParcel.writeString(this.len);
    paramParcel.writeString(this.leo);
    paramParcel.writeString(this.lep);
    paramParcel.writeString(this.leq);
    paramParcel.writeInt(this.lev);
    paramParcel.writeInt(this.lel);
    if (this.les)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.scene);
      if (!this.let) {
        break label115;
      }
    }
    for (;;)
    {
      paramParcel.writeByte(b);
      paramParcel.writeString(this.leu);
      return;
      paramInt = 0;
      break;
      label115:
      b = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/mmsight/SightParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */