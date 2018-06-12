package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.g.a.ak;
import com.tencent.mm.g.a.ms;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public class QBarLogicTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<QBarLogicTask> CREATOR = new QBarLogicTask.2();
  private static c dlW = new QBarLogicTask.1();
  private static Map<String, Integer> jIg;
  public String bSw;
  public int type;
  
  public QBarLogicTask() {}
  
  private QBarLogicTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    switch (this.type)
    {
    default: 
      return;
    case 1: 
      str = this.bSw;
      if (jIg == null)
      {
        jIg = new HashMap();
        a.sFg.b(dlW);
      }
      localObject = new ms();
      ((ms)localObject).bXH.filePath = str;
      a.sFg.m((b)localObject);
      jIg.put(str, Integer.valueOf(1));
      return;
    }
    String str = this.bSw;
    if ((jIg == null) || (!jIg.containsKey(str)))
    {
      x.e("MicroMsg.QBarLogicTask", "%s is not recognizing", new Object[] { str });
      return;
    }
    Object localObject = new ak();
    ((ak)localObject).bHM.filePath = str;
    a.sFg.m((b)localObject);
    jIg.remove(str);
  }
  
  public final void aaj() {}
  
  public final void g(Parcel paramParcel)
  {
    this.type = paramParcel.readInt();
    this.bSw = paramParcel.readString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.bSw);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/model/QBarLogicTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */