package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.game.gamewebview.model.b;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.Iterator;

public class SetGameWebTaskManagerTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<SetGameWebTaskManagerTask> CREATOR = new SetGameWebTaskManagerTask.1();
  public String className;
  public int type;
  public ArrayList<String> urlList;
  
  public SetGameWebTaskManagerTask() {}
  
  private SetGameWebTaskManagerTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    switch (this.type)
    {
    }
    for (;;)
    {
      return;
      if (!bi.cX(this.urlList))
      {
        Iterator localIterator = this.urlList.iterator();
        while (localIterator.hasNext()) {
          b.Dh((String)localIterator.next());
        }
        continue;
        if (!bi.cX(this.urlList))
        {
          localIterator = this.urlList.iterator();
          while (localIterator.hasNext()) {
            b.cV((String)localIterator.next(), this.className);
          }
        }
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void g(Parcel paramParcel)
  {
    this.type = paramParcel.readInt();
    this.className = paramParcel.readString();
    this.urlList = paramParcel.readArrayList(SetGameWebTaskManagerTask.class.getClassLoader());
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.className);
    paramParcel.writeList(this.urlList);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/SetGameWebTaskManagerTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */