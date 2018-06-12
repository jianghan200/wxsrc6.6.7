package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.cc;
import com.tencent.mm.g.a.cc.a;
import com.tencent.mm.g.a.cc.b;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.a;
import com.tencent.mm.g.a.ch.b;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.g.a.mk.b;
import com.tencent.mm.g.a.qs;
import com.tencent.mm.g.a.qs.b;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class FavUrlTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<FavUrlTask> CREATOR = new Parcelable.Creator() {};
  public int actionType;
  public boolean bGZ;
  public boolean jHV;
  public boolean jHW;
  public Bundle jfZ;
  public int ret;
  public int type;
  
  public FavUrlTask() {}
  
  private FavUrlTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    switch (this.actionType)
    {
    default: 
    case 1: 
      do
      {
        return;
      } while (this.jfZ == null);
      long l = this.jfZ.getLong("msg_id", Long.MIN_VALUE);
      Object localObject2 = this.jfZ.getString("sns_local_id");
      int i = this.jfZ.getInt("news_svr_id", 0);
      Object localObject3 = this.jfZ.getString("news_svr_tweetid");
      localObject1 = new ch();
      boolean bool;
      if (Long.MIN_VALUE != l)
      {
        ((ch)localObject1).bJF.bJJ = this.jfZ.getInt("message_index", 0);
        bool = e.a((ch)localObject1, l);
        if (!bool) {
          break label498;
        }
        Object localObject4 = bi.oV(this.jfZ.getString("prePublishId"));
        localObject2 = u.ic((String)localObject4);
        localObject3 = u.Hx().v((String)localObject2, true);
        ((u.b)localObject3).p("sendAppMsgScene", Integer.valueOf(2));
        ((u.b)localObject3).p("preChatName", this.jfZ.getString("preChatName"));
        ((u.b)localObject3).p("preMsgIndex", Integer.valueOf(this.jfZ.getInt("preMsgIndex")));
        ((u.b)localObject3).p("prePublishId", localObject4);
        ((u.b)localObject3).p("preUsername", this.jfZ.getString("preUsername"));
        ((u.b)localObject3).p("getA8KeyScene", this.jfZ.getString("getA8KeyScene"));
        ((u.b)localObject3).p("referUrl", this.jfZ.getString("referUrl"));
        localObject4 = this.jfZ.getBundle("jsapiargs");
        if (localObject4 != null) {
          ((u.b)localObject3).p("adExtStr", ((Bundle)localObject4).getString("key_snsad_statextstr"));
        }
        ((ch)localObject1).bJF.bJK = ((String)localObject2);
        a.sFg.m((b)localObject1);
      }
      for (;;)
      {
        this.ret = ((ch)localObject1).bJG.ret;
        return;
        if (!bi.oW((String)localObject2))
        {
          localObject3 = new qs();
          ((qs)localObject3).cbk.cbn = ((String)localObject2);
          ((qs)localObject3).cbk.cbo = ((ch)localObject1);
          ((qs)localObject3).cbk.url = this.jfZ.getString("rawUrl");
          a.sFg.m((b)localObject3);
          bool = ((qs)localObject3).cbl.bJm;
          break;
        }
        if (i != 0)
        {
          localObject2 = new mk();
          ((mk)localObject2).bXl.opType = 3;
          ((mk)localObject2).bXl.bXn = ((ch)localObject1);
          ((mk)localObject2).bXl.bXo = i;
          ((mk)localObject2).bXl.bXp = ((String)localObject3);
          a.sFg.m((b)localObject2);
          bool = ((mk)localObject2).bXm.bJm;
          break;
        }
        this.jHV = true;
        return;
        if (((ch)localObject1).bJF.bJL == 0) {
          ((ch)localObject1).bJF.bJL = R.l.favorite_fail_nonsupport;
        }
        a.sFg.m((b)localObject1);
      }
    case 2: 
      localObject1 = new fz();
      ((fz)localObject1).bOL.type = 35;
      a.sFg.m((b)localObject1);
      return;
    case 3: 
      label498:
      this.jHW = d.QS("favorite");
      return;
    }
    Object localObject1 = new cc();
    ((cc)localObject1).bJy.bJA = this.jfZ.getLong("fav_local_id", -1L);
    a.sFg.m((b)localObject1);
    x.i("MicroMsg.FavUrlTask", "do del fav web url, local id %d, result %B", new Object[] { Long.valueOf(((cc)localObject1).bJy.bJA), Boolean.valueOf(((cc)localObject1).bJz.bJm) });
    this.bGZ = ((cc)localObject1).bJz.bJm;
  }
  
  public final void g(Parcel paramParcel)
  {
    boolean bool2 = true;
    this.actionType = paramParcel.readInt();
    this.jfZ = paramParcel.readBundle();
    if (paramParcel.readByte() == 1)
    {
      bool1 = true;
      this.jHV = bool1;
      if (paramParcel.readByte() != 1) {
        break label85;
      }
      bool1 = true;
      label43:
      this.bGZ = bool1;
      this.ret = paramParcel.readInt();
      this.type = paramParcel.readInt();
      if (paramParcel.readByte() != 1) {
        break label90;
      }
    }
    label85:
    label90:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.jHW = bool1;
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label43;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeInt(this.actionType);
    paramParcel.writeBundle(this.jfZ);
    if (this.jHV)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      if (!this.bGZ) {
        break label85;
      }
      paramInt = 1;
      label42:
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.ret);
      paramParcel.writeInt(this.type);
      if (!this.jHW) {
        break label90;
      }
    }
    label85:
    label90:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label42;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/model/FavUrlTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */