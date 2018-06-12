package com.tencent.mm.plugin.music.a;

import com.tencent.mm.g.a.s;
import com.tencent.mm.g.a.s.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.sdk.b.c<s>
{
  public a()
  {
    this.sFo = s.class.getName().hashCode();
  }
  
  private static boolean a(s params)
  {
    boolean bool1 = true;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = false;
    boolean bool2 = false;
    if (params.bGU.action != 6) {
      x.d("MicroMsg.Audio.AudioActionListener", "callback, action:%d", new Object[] { Integer.valueOf(params.bGU.action) });
    }
    Object localObject1;
    switch (params.bGU.action)
    {
    default: 
      return true;
    case 10: 
      localObject1 = d.bhf().dQ(params.bGU.appId, params.bGU.bGW);
      params.bGU.bGW = ((String)localObject1);
      return true;
    case 0: 
      bool1 = d.bhf().b(params.bGU.bGY);
    }
    Object localObject2;
    Object localObject4;
    for (;;)
    {
      params.bGV.bGZ = bool1;
      return bool1;
      bool1 = d.bhf().a(params.bGU.bGW, params.bGU.bGY);
      continue;
      localObject1 = d.bhf();
      localObject2 = params.bGU.bGW;
      localObject3 = ((d)localObject1).HZ((String)localObject2);
      if (localObject3 == null) {
        x.e("MicroMsg.Audio.AudioPlayerMgr", "pauseAudio, player is null");
      }
      for (bool1 = false;; bool1 = true)
      {
        params.bGV.bGZ = bool1;
        return bool1;
        x.i("MicroMsg.Audio.AudioPlayerMgr", "pauseAudio, audioId:%s", new Object[] { localObject2 });
        ((f)localObject3).pause();
        ((d)localObject1).b((String)localObject2, (f)localObject3);
        ((d)localObject1).f((String)localObject2, (f)localObject3);
      }
      bool1 = d.bhf().HV(params.bGU.bGW);
      continue;
      localObject1 = d.bhf();
      localObject2 = params.bGU.bGW;
      localObject3 = ((d)localObject1).HZ((String)localObject2);
      if (localObject3 == null) {
        x.e("MicroMsg.Audio.AudioPlayerMgr", "stopPlayOnBackGround, player is null");
      }
      for (bool1 = bool3;; bool1 = true)
      {
        params.bGV.bGZ = bool1;
        return bool1;
        x.i("MicroMsg.Audio.AudioPlayerMgr", "stopPlayOnBackGround, audioId:%s", new Object[] { localObject2 });
        ((f)localObject3).dGA = false;
        ((f)localObject3).lxc = true;
        ((f)localObject3).bhw();
        ((f)localObject3).dkh = System.currentTimeMillis();
        localObject4 = (com.tencent.mm.z.a)((d)localObject1).lwH.get(localObject2);
        if (localObject4 != null)
        {
          ((com.tencent.mm.z.a)localObject4).dGs = 0;
          ((com.tencent.mm.z.a)localObject4).dGu = true;
        }
        ((d)localObject1).b((String)localObject2, (f)localObject3);
        ((d)localObject1).f((String)localObject2, (f)localObject3);
      }
      bool1 = d.bhf().HW(params.bGU.bGW);
      continue;
      localObject1 = d.bhf();
      localObject2 = params.bGU.bGW;
      int i = params.bGU.bGX;
      localObject3 = ((d)localObject1).HZ((String)localObject2);
      if (localObject3 == null)
      {
        x.e("MicroMsg.Audio.AudioPlayerMgr", "seekToAudio, player is null");
        bool1 = ((d)localObject1).bK((String)localObject2, i);
      }
      for (;;)
      {
        params.bGV.bGZ = bool1;
        return bool1;
        if (i < 0)
        {
          x.e("MicroMsg.Audio.AudioPlayerMgr", "seekToAudio, time pos is invalid time:%d, duration:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(((f)localObject3).getDuration()) });
          bool1 = bool4;
        }
        else
        {
          if (((f)localObject3).getDuration() <= 0) {
            x.e("MicroMsg.Audio.AudioPlayerMgr", "seekToAudio, duration is invalid, time:%d, duration:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(((f)localObject3).getDuration()) });
          }
          do
          {
            ((f)localObject3).bhx();
            bool1 = ((d)localObject1).bK((String)localObject2, i);
            break;
            if ((i > 0) && (i > ((f)localObject3).getDuration()))
            {
              x.e("MicroMsg.Audio.AudioPlayerMgr", "seekToAudio, time pos is invalid, exceed duration time:%d, duration:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(((f)localObject3).getDuration()) });
              bool1 = bool4;
              break;
            }
            x.i("MicroMsg.Audio.AudioPlayerMgr", "seekToAudio, audioId:%s, time:%s", new Object[] { localObject2, Integer.valueOf(i) });
          } while ((!((f)localObject3).PY()) && (!((f)localObject3).PZ()) && (!((f)localObject3).isPaused()));
          bool1 = ((f)localObject3).jdMethod_if(i);
        }
      }
      localObject1 = d.bhf().HZ(params.bGU.bGW);
      if (localObject1 == null) {
        x.e("MicroMsg.Audio.AudioPlayerMgr", "isStartPlayAudio, player is null");
      }
      for (bool1 = bool5;; bool1 = ((f)localObject1).PZ())
      {
        params.bGV.bGZ = bool1;
        return bool1;
      }
      localObject1 = d.bhf().HZ(params.bGU.bGW);
      if (localObject1 == null) {
        x.e("MicroMsg.Audio.AudioPlayerMgr", "isPlayingAudio, player is null");
      }
      for (bool1 = bool6;; bool1 = ((f)localObject1).PY())
      {
        params.bGV.bGZ = bool1;
        return bool1;
      }
      localObject1 = d.bhf().HZ(params.bGU.bGW);
      if (localObject1 == null) {
        x.e("MicroMsg.Audio.AudioPlayerMgr", "isStoppedAudio, player is null");
      }
      for (;;)
      {
        params.bGV.bGZ = bool1;
        return bool1;
        bool1 = ((f)localObject1).isStopped();
      }
      localObject1 = d.bhf();
      localObject2 = params.bGU.bGW;
      localObject3 = ((d)localObject1).HZ((String)localObject2);
      if (localObject3 == null)
      {
        x.e("MicroMsg.Audio.AudioPlayerMgr", "isPauseOnBackground, player is null");
        localObject1 = ((d)localObject1).HX((String)localObject2);
        bool1 = bool7;
        if (localObject1 == null) {}
      }
      for (bool1 = ((com.tencent.mm.z.c)localObject1).dGA;; bool1 = ((f)localObject3).dGA)
      {
        params.bGV.bGZ = bool1;
        return bool1;
      }
      localObject1 = d.bhf().HX(params.bGU.bGW);
      params.bGV.bHa = ((com.tencent.mm.z.c)localObject1);
      return true;
      i = d.bhf().HY(params.bGU.appId);
      params.bGV.count = i;
      return true;
      d.bhf().Ia(params.bGU.appId);
      return true;
      d.bhf().Ib(params.bGU.appId);
      return true;
      localObject1 = d.bhf();
      params = params.bGU.processName;
      if (((d)localObject1).lwE.size() == 0) {
        break;
      }
      x.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAllAudioPlayersByProcessName with name :%s", new Object[] { params });
      localObject2 = new ArrayList();
      ((ArrayList)localObject2).addAll(((d)localObject1).lwE);
      localObject2 = ((ArrayList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (String)((Iterator)localObject2).next();
        localObject4 = (String)((d)localObject1).lwF.get(localObject3);
        if ((params != null) && (params.equalsIgnoreCase((String)localObject4)))
        {
          x.i("MicroMsg.Audio.AudioPlayerMgr", "The app brand process name is same as the process which is killed by system");
          ((d)localObject1).Ib((String)localObject3);
        }
      }
      localObject1 = d.bhf().jE(params.bGU.bGW);
      params.bGU.bGY = ((com.tencent.mm.z.a)localObject1);
      return true;
      localObject4 = d.bhf();
      localObject2 = params.bGU.bGY;
      if (localObject2 != null) {
        break label1258;
      }
      x.e("MicroMsg.Audio.AudioPlayerMgr", "setAudioParam param == null");
      bool1 = bool2;
    }
    label1258:
    Object localObject3 = (com.tencent.mm.z.a)((d)localObject4).lwH.get(((com.tencent.mm.z.a)localObject2).bGW);
    if (localObject3 != null)
    {
      ((com.tencent.mm.z.a)localObject3).bGW = ((com.tencent.mm.z.a)localObject2).bGW;
      ((com.tencent.mm.z.a)localObject3).cfD = ((com.tencent.mm.z.a)localObject2).cfD;
      if ((((com.tencent.mm.z.a)localObject2).filePath != null) && (!((com.tencent.mm.z.a)localObject2).filePath.equals(""))) {
        ((com.tencent.mm.z.a)localObject3).filePath = ((com.tencent.mm.z.a)localObject2).filePath;
      }
      ((com.tencent.mm.z.a)localObject3).dGs = ((com.tencent.mm.z.a)localObject2).dGs;
      ((com.tencent.mm.z.a)localObject3).dGt = ((com.tencent.mm.z.a)localObject2).dGt;
      ((com.tencent.mm.z.a)localObject3).dGu = ((com.tencent.mm.z.a)localObject2).dGu;
      ((com.tencent.mm.z.a)localObject3).dGv = ((com.tencent.mm.z.a)localObject2).dGv;
      ((com.tencent.mm.z.a)localObject3).fromScene = ((com.tencent.mm.z.a)localObject2).fromScene;
      ((com.tencent.mm.z.a)localObject3).processName = ((com.tencent.mm.z.a)localObject2).processName;
      ((com.tencent.mm.z.a)localObject3).dGx = ((com.tencent.mm.z.a)localObject2).dGx;
      ((com.tencent.mm.z.a)localObject3).appId = ((com.tencent.mm.z.a)localObject2).appId;
      localObject1 = localObject3;
      if (((com.tencent.mm.z.a)localObject2).dGy != null)
      {
        ((com.tencent.mm.z.a)localObject3).dGy = ((com.tencent.mm.z.a)localObject2).dGy;
        localObject1 = localObject3;
      }
      label1439:
      localObject2 = ((d)localObject4).HZ(((com.tencent.mm.z.a)localObject2).bGW);
      if (localObject2 == null) {
        break label1499;
      }
      x.i("MicroMsg.Audio.AudioPlayerMgr", "setAudioParam player ok");
      ((f)localObject2).c((com.tencent.mm.z.a)localObject1);
    }
    for (;;)
    {
      bool1 = true;
      break;
      ((d)localObject4).lwH.put(((com.tencent.mm.z.a)localObject2).bGW, localObject2);
      localObject1 = localObject2;
      break label1439;
      label1499:
      x.e("MicroMsg.Audio.AudioPlayerMgr", "setAudioParam player is null");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/music/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */