package com.tencent.wecall.talkroom.model;

import android.text.TextUtils;
import com.tencent.pb.a.a.a;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.aw;
import com.tencent.pb.common.c.e;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c
{
  private static boolean DEBUG = false;
  public static boolean vxa = false;
  private static final e<c> vxb = new e() {};
  Map<String, TalkRoom> vxc = new HashMap();
  Map<String, String> vxd = new HashMap();
  g vxe;
  
  private c()
  {
    com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "asyncLoadCache" });
  }
  
  public static boolean adj(String paramString)
  {
    paramString = cHG().adg(paramString);
    if (paramString == null) {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "isMySelfExit talkRoom is null" });
    }
    do
    {
      return true;
      paramString = paramString.cHC();
    } while ((paramString == null) || (20 == paramString.getState()));
    return false;
  }
  
  public static int adk(String paramString)
  {
    Object localObject = cHG().adg(paramString);
    if (localObject == null)
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "getMySelfReason talkRoom is null groupId: ", paramString });
      return 0;
    }
    localObject = ((TalkRoom)localObject).cHC();
    if ((localObject != null) && (((d)localObject).vxf != null)) {}
    for (int i = ((d)localObject).vxf.aAk;; i = 0)
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "getMySelfReason groupId: ", paramString, " reason: ", Integer.valueOf(i) });
      return i;
    }
  }
  
  public static c cHG()
  {
    return (c)vxb.get();
  }
  
  static void cHH()
  {
    com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "asyncWriteBackCache" });
  }
  
  public final TalkRoom adg(String paramString)
  {
    TalkRoom localTalkRoom2 = (TalkRoom)this.vxc.get(paramString);
    TalkRoom localTalkRoom1 = localTalkRoom2;
    if (localTalkRoom2 == null)
    {
      localTalkRoom1 = localTalkRoom2;
      if (j.ads(paramString))
      {
        paramString = (String)this.vxd.get(paramString);
        localTalkRoom1 = (TalkRoom)this.vxc.get(paramString);
      }
    }
    return localTalkRoom1;
  }
  
  public final int adh(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "getSelfMemberId invalid groupId" });
      return -1;
    }
    Object localObject = adg(paramString);
    if (localObject == null)
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "getSelfMemberId TalkRoom is null  groupId: ", paramString });
      return -1;
    }
    localObject = ((TalkRoom)localObject).adf(a.cEG());
    if (localObject != null)
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "getSelfMemberId TalkRoomMember is not null groupId: ", paramString, " uuid: ", a.cEG(), " memberId: ", Integer.valueOf(((d)localObject).cHJ()) });
      return ((d)localObject).cHJ();
    }
    com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "getSelfMemberId TalkRoomMember is null" });
    return -1;
  }
  
  public final int adi(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "getRountIdByGrouId invalid groupId" });
      return 0;
    }
    TalkRoom localTalkRoom = adg(paramString);
    if (localTalkRoom == null)
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "getRountIdByGrouId TalkRoom is null  groupId: ", paramString });
      return 0;
    }
    return localTalkRoom.cHx();
  }
  
  public final MultiTalkGroup adl(String paramString)
  {
    paramString = adg(paramString);
    if (paramString == null) {
      return null;
    }
    MultiTalkGroup localMultiTalkGroup = new MultiTalkGroup();
    localMultiTalkGroup.vgm = paramString.vgm;
    localMultiTalkGroup.vgn = paramString.vgn;
    localMultiTalkGroup.vcc = paramString.vcc;
    localMultiTalkGroup.vgo = paramString.vgo;
    localMultiTalkGroup.vgp = paramString.vgp;
    ArrayList localArrayList = new ArrayList();
    paramString = paramString.cHB();
    if (paramString.size() > 0)
    {
      Iterator localIterator = paramString.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        if (locald != null)
        {
          MultiTalkGroupMember localMultiTalkGroupMember = new MultiTalkGroupMember();
          localMultiTalkGroupMember.vgr = locald.cHI();
          if (locald.vxf != null)
          {
            paramString = locald.vxf.vfE;
            label154:
            localMultiTalkGroupMember.vgs = paramString;
            if (locald.vxf == null) {
              break label246;
            }
            i = locald.vxf.aAk;
            label177:
            localMultiTalkGroupMember.aAk = i;
            localMultiTalkGroupMember.status = locald.getState();
            if ((locald.vxf == null) || (locald.vxf.vfs == 0)) {
              break label251;
            }
          }
          label246:
          label251:
          for (int i = locald.vxf.vfs;; i = 0)
          {
            localMultiTalkGroupMember.vfs = i;
            localArrayList.add(localMultiTalkGroupMember);
            break;
            paramString = "";
            break label154;
            i = 0;
            break label177;
          }
        }
      }
    }
    localMultiTalkGroup.vgq = localArrayList;
    return localMultiTalkGroup;
  }
  
  public final boolean bE(String paramString, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf groupid is null" });
      return false;
    }
    paramString = adg(paramString);
    if (paramString == null)
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf talkRoom is null" });
      return false;
    }
    paramString = paramString.cHA();
    if (paramString == null)
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf TalkRoomMember list is null" });
      return false;
    }
    paramString = paramString.iterator();
    int i = 0;
    int j = 0;
    for (;;)
    {
      label87:
      if (paramString.hasNext())
      {
        d locald = (d)paramString.next();
        if (locald != null)
        {
          TalkRoom.cHw();
          if (locald.getState() != 10) {
            break label182;
          }
          if (locald.cHK()) {
            i = 1;
          }
        }
      }
    }
    label182:
    for (;;)
    {
      if ((paramBoolean) && (j != 0))
      {
        return true;
        j = 1;
      }
      else
      {
        if ((i != 0) && (j != 0))
        {
          com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf is true" });
          return true;
        }
        break label87;
        break;
      }
    }
  }
  
  public final boolean c(String paramString1, String paramString2, String... paramVarArgs)
  {
    com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "newTmpGroup groupId: ", paramString1 });
    if (!j.ads(paramString1))
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "newTmpGroup invalid clientGroupId" });
      return false;
    }
    if ((paramVarArgs == null) || (paramVarArgs.length == 0))
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "newTmpGroup empty uuid array" });
      return false;
    }
    try
    {
      Object localObject = new a.at();
      ((a.at)localObject).bOS = 0;
      ((a.at)localObject).vfd = paramString2;
      ((a.at)localObject).vfc = a.cEG();
      paramString2 = new TalkRoom(paramString1, null, (a.at)localObject);
      int j = paramVarArgs.length;
      int i = 0;
      while (i != j)
      {
        localObject = paramVarArgs[i];
        a.av localav = new a.av();
        localav.vez = ((String)localObject);
        localav.vfE = a.cEG();
        localav.status = 20;
        localav.kpU = -1;
        localav.vfs = ((int)(System.currentTimeMillis() / 1000L));
        paramString2.a(new d(localav, new a.aw()));
        i += 1;
      }
      this.vxc.put(paramString1, paramString2);
      cHH();
      return true;
    }
    catch (Exception paramString1)
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "newTmpGroup err: ", paramString1 });
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */