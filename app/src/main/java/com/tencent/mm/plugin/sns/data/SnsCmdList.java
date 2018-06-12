package com.tencent.mm.plugin.sns.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.LinkedList;
import java.util.List;

public class SnsCmdList
  implements Parcelable
{
  public static final Parcelable.Creator<SnsCmdList> CREATOR = new SnsCmdList.1();
  private int nkL = 0;
  private int nkM = 0;
  public List<Integer> nkN = new LinkedList();
  public List<Integer> nkO = new LinkedList();
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void wj(int paramInt)
  {
    this.nkN.add(Integer.valueOf(paramInt));
  }
  
  public final void wk(int paramInt)
  {
    this.nkO.add(Integer.valueOf(paramInt));
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    this.nkL = this.nkN.size();
    paramParcel.writeInt(this.nkL);
    paramInt = 0;
    while (paramInt < this.nkL)
    {
      paramParcel.writeInt(((Integer)this.nkN.get(paramInt)).intValue());
      paramInt += 1;
    }
    this.nkM = this.nkO.size();
    paramParcel.writeInt(this.nkM);
    paramInt = i;
    while (paramInt < this.nkM)
    {
      paramParcel.writeInt(((Integer)this.nkO.get(paramInt)).intValue());
      paramInt += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/data/SnsCmdList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */