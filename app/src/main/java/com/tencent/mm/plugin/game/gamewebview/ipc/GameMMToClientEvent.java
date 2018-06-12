package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.game.gamewebview.b.a.c;
import com.tencent.mm.plugin.game.gamewebview.b.a.e;
import com.tencent.mm.plugin.game.gamewebview.ui.h;
import com.tencent.mm.plugin.game.gamewebview.ui.h.3;
import com.tencent.mm.plugin.webview.modeltools.f;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public class GameMMToClientEvent
  extends GWMainProcessTask
{
  public static Parcelable.Creator<GameMMToClientEvent> CREATOR = new GameMMToClientEvent.1();
  private static GameMMToClientEvent jGh;
  private int fEp;
  private String fEq;
  public Object fEr;
  int jGg;
  public Bundle jfZ;
  
  public GameMMToClientEvent() {}
  
  private GameMMToClientEvent(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  private static GameMMToClientEvent aSo()
  {
    if (jGh == null) {}
    try
    {
      if (jGh == null) {
        jGh = new GameMMToClientEvent();
      }
      return jGh;
    }
    finally {}
  }
  
  public static void qI(int paramInt)
  {
    aSo().fEp = 1;
    aSo().jGg = paramInt;
    GameWebViewMainProcessService.a(aSo());
  }
  
  public static void qJ(int paramInt)
  {
    aSo().fEp = 2;
    aSo().jGg = paramInt;
    GameWebViewMainProcessService.a(aSo());
  }
  
  public final void aai()
  {
    switch (this.fEp)
    {
    default: 
      return;
    case 1: 
      a.a(this.jGg, this);
      return;
    }
    a.qK(this.jGg);
  }
  
  public final void aaj()
  {
    int i = this.jfZ.getInt("mm_to_client_notify_type");
    x.i("MicroMsg.GameMMToClientEvent", "notifyType = " + i);
    switch (i)
    {
    }
    Object localObject2;
    String str;
    do
    {
      Object localObject1;
      int j;
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return;
                localObject1 = this.jfZ.getString("js_event_name");
              } while (bi.oW((String)localObject1));
              if ((com.tencent.mm.plugin.game.gamewebview.b.b.jHU == null) || (com.tencent.mm.plugin.game.gamewebview.b.b.jHU.size() == 0))
              {
                com.tencent.mm.plugin.game.gamewebview.b.b.jHU = new HashMap();
                com.tencent.mm.plugin.game.gamewebview.b.b.a(new c());
                com.tencent.mm.plugin.game.gamewebview.b.b.a(new com.tencent.mm.plugin.game.gamewebview.b.a.b());
                com.tencent.mm.plugin.game.gamewebview.b.b.a(new e());
                com.tencent.mm.plugin.game.gamewebview.b.b.a(new com.tencent.mm.plugin.game.gamewebview.b.a.d());
                com.tencent.mm.plugin.game.gamewebview.b.b.a(new com.tencent.mm.plugin.game.gamewebview.b.a.a());
              }
              localObject1 = (com.tencent.mm.plugin.game.gamewebview.b.a)com.tencent.mm.plugin.game.gamewebview.b.b.jHU.get(localObject1);
            } while (localObject1 == null);
            ((com.tencent.mm.plugin.game.gamewebview.b.a)localObject1).m(this.jGg, this.jfZ);
            return;
            localObject2 = com.tencent.mm.plugin.game.gamewebview.model.a.qL(this.jGg);
          } while (localObject2 == null);
          localObject1 = this.jfZ.getString("file_path");
          str = this.jfZ.getString("result");
          i = this.jfZ.getInt("code_type");
          j = this.jfZ.getInt("code_version");
        } while (((com.tencent.mm.plugin.game.gamewebview.ui.d)localObject2).jJy == null);
        localObject2 = ((com.tencent.mm.plugin.game.gamewebview.ui.d)localObject2).jJy;
        x.d("MicroMsg.GameWebViewMenuListHelper", "result: " + str);
      } while ((((h)localObject2).gcU == null) || (localObject1 == null) || (!((String)localObject1).equals(((h)localObject2).gcU.pUp)));
      if (((h)localObject2).gcU != null) {
        ((h)localObject2).gcU.bVc();
      }
      ((h)localObject2).gcS = i;
      ((h)localObject2).gcT = j;
    } while ((str == null) || (((h)localObject2).gcQ == null));
    new ag().post(new h.3((h)localObject2, str));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void g(Parcel paramParcel)
  {
    this.fEp = paramParcel.readInt();
    this.jGg = paramParcel.readInt();
    this.jfZ = paramParcel.readBundle(getClass().getClassLoader());
    try
    {
      this.fEq = paramParcel.readString();
      if (!bi.oW(this.fEq))
      {
        Class localClass = Class.forName(this.fEq);
        if (localClass != null) {
          this.fEr = paramParcel.readParcelable(localClass.getClassLoader());
        }
      }
      return;
    }
    catch (Exception paramParcel)
    {
      x.e("MicroMsg.GameMMToClientEvent", "can't parcel data ex: " + paramParcel.getMessage());
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.fEp);
    paramParcel.writeInt(this.jGg);
    paramParcel.writeBundle(this.jfZ);
    if ((!bi.oW(this.fEq)) && (this.fEr != null))
    {
      paramParcel.writeString(this.fEq);
      paramParcel.writeParcelable((Parcelable)this.fEr, paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/GameMMToClientEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */