package com.tencent.wecall.talkroom.model;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.f.i;
import com.tencent.mm.plugin.multi.talk;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.system.ConnectReceiver;
import com.tencent.wecall.talkroom.a.k;
import com.tencent.wecall.talkroom.a.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class e
  implements com.tencent.pb.talkroom.sdk.d
{
  private static e vxi = null;
  private final String TAG = "TalkRoomSdkApi";
  private com.tencent.pb.talkroom.sdk.a vxh = null;
  private ConnectReceiver vxj = new ConnectReceiver();
  private g.a vxk = new e.1(this);
  
  public static e cHL()
  {
    if (vxi == null) {}
    try
    {
      if (vxi == null) {
        vxi = new e();
      }
      return vxi;
    }
    finally {}
  }
  
  public static void ig(Context paramContext)
  {
    com.tencent.pb.common.c.d.oSX = paramContext;
    i.jdMethod_if(paramContext);
  }
  
  public final boolean B(String paramString1, int paramInt, String paramString2)
  {
    f localf = a.cHu();
    paramString2 = localf.a(paramString1, localf.kvL, localf.vxz, paramInt, 1, paramString2);
    com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "enterMultiTalk multiTalkGroupid:", paramString1, " isAccept: ", Boolean.valueOf(true), " routId: ", Integer.valueOf(paramInt), " ret: ", paramString2 });
    return paramString2 == f.b.vyB;
  }
  
  public final boolean HA(String paramString)
  {
    if (!a.cHu().bJP())
    {
      com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "subscribeLargeVideo isWorking is false" });
      return false;
    }
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "subscribeLargeVideo ownerUserName: ", paramString });
    f localf = a.cHu();
    if (TextUtils.isEmpty(localf.jTX))
    {
      com.tencent.pb.common.c.c.x("TalkRoomService", new Object[] { "subscribeLargeVideo mGroupId null " });
      return false;
    }
    paramString = new k(localf.jTX, localf.kvL, localf.vxz, paramString);
    boolean bool = com.tencent.pb.common.b.e.cEn().a(paramString);
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "subscribeLargeVideo ret: ", Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean HI(String paramString)
  {
    if (!com.tencent.pb.common.c.g.gr(paramString, a.cHu().jTX))
    {
      com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "exitMultiTalk groupid is not same; multiTalkGroupid: ", paramString, a.cHu().jTX });
      f.e locale;
      f localf;
      if (a.cHu().adn(paramString))
      {
        locale = a.cHu().adm(paramString);
        localf = a.cHu();
        if (locale != null) {
          break label90;
        }
        i = 0;
        if (locale != null) {
          break label99;
        }
      }
      label90:
      label99:
      for (l = 0L;; l = locale.kpp)
      {
        localf.a(paramString, i, l, 1);
        return false;
        i = locale.kpo;
        break;
      }
    }
    int i = a.cHu().kvL;
    long l = a.cHu().vxz;
    boolean bool = a.cHu().ar(paramString, 1, 100);
    com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "exitMultiTalk groupId: ", paramString, " roomId: ", Integer.valueOf(i), " roomKey: ", Long.valueOf(l) });
    return bool;
  }
  
  public final int a(byte[] paramArrayOfByte, short paramShort, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    f localf = a.cHu();
    int i;
    if (localf.vxI != null)
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "sendVideo ", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      i = localf.vxI.vwZ.SendVideo(paramArrayOfByte, paramShort, paramInt1, paramInt2, paramInt3, paramInt4);
      if (paramArrayOfByte != null) {
        break label172;
      }
    }
    label172:
    for (int j = 0;; j = paramArrayOfByte.length)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "sendVideo buffer size: ", Integer.valueOf(j), " len: ", Short.valueOf(paramShort), " w: ", Integer.valueOf(paramInt1), " h: ", Integer.valueOf(paramInt2), " format: ", Integer.valueOf(paramInt3), " mode: ", Integer.valueOf(paramInt4) });
      return i;
      i = -1;
      break;
    }
  }
  
  public final com.tencent.pb.talkroom.sdk.g a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    f localf = a.cHu();
    com.tencent.pb.talkroom.sdk.g localg = new com.tencent.pb.talkroom.sdk.g();
    int i;
    if (localf.vxI != null)
    {
      b localb = localf.vxI;
      i = localb.vwZ.videoTrans(paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
      localg = new com.tencent.pb.talkroom.sdk.g();
      localg.vgy = paramArrayOfInt;
      localg.vgz = localb.vwZ.field_localImgWidth;
      localg.vgA = localb.vwZ.field_localImgHeight;
      localg.ret = i;
    }
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "videoTrans ", Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), " multiTalkVideoRGBinfo: ", localg, " engine: ", localf.vxI });
    if (paramArrayOfByte == null)
    {
      i = 0;
      if (paramArrayOfInt != null) {
        break label277;
      }
    }
    label277:
    for (int j = 0;; j = paramArrayOfInt.length)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "videoTrans recordData size: ", Integer.valueOf(i), " len: ", Integer.valueOf(paramInt1), " localImg size: ", Integer.valueOf(j), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), " multiTalkVideoRGBinfo: ", localg });
      return localg;
      i = paramArrayOfByte.length;
      break;
    }
  }
  
  /* Error */
  public final boolean a(com.tencent.pb.talkroom.sdk.a parama, com.tencent.pb.talkroom.sdk.e parame)
  {
    // Byte code:
    //   0: getstatic 55	com/tencent/pb/common/c/d:oSX	Landroid/content/Context;
    //   3: ifnonnull +26 -> 29
    //   6: ldc 26
    //   8: iconst_2
    //   9: anewarray 4	java/lang/Object
    //   12: dup
    //   13: iconst_0
    //   14: ldc_w 273
    //   17: aastore
    //   18: dup
    //   19: iconst_1
    //   20: getstatic 55	com/tencent/pb/common/c/d:oSX	Landroid/content/Context;
    //   23: aastore
    //   24: invokestatic 106	com/tencent/pb/common/c/c:x	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: iconst_0
    //   28: ireturn
    //   29: aload_0
    //   30: aload_1
    //   31: putfield 30	com/tencent/wecall/talkroom/model/e:vxh	Lcom/tencent/pb/talkroom/sdk/a;
    //   34: aload_2
    //   35: invokestatic 276	com/tencent/wecall/talkroom/model/f:a	(Lcom/tencent/pb/talkroom/sdk/e;)V
    //   38: invokestatic 68	com/tencent/wecall/talkroom/model/a:cHu	()Lcom/tencent/wecall/talkroom/model/f;
    //   41: astore_3
    //   42: aload_0
    //   43: getfield 42	com/tencent/wecall/talkroom/model/e:vxk	Lcom/tencent/wecall/talkroom/model/g$a;
    //   46: astore_1
    //   47: aload_3
    //   48: getfield 280	com/tencent/wecall/talkroom/model/f:vxP	Lcom/tencent/wecall/talkroom/model/g;
    //   51: astore_3
    //   52: aload_1
    //   53: monitorenter
    //   54: aload_3
    //   55: getfield 286	com/tencent/wecall/talkroom/model/g:cWy	Ljava/util/List;
    //   58: aload_1
    //   59: invokeinterface 292 2 0
    //   64: ifeq +70 -> 134
    //   67: aload_1
    //   68: monitorexit
    //   69: invokestatic 298	com/tencent/pb/common/b/f:cEq	()Lcom/tencent/pb/common/b/f;
    //   72: aload_2
    //   73: putfield 302	com/tencent/pb/common/b/f:vco	Lcom/tencent/pb/talkroom/sdk/e;
    //   76: invokestatic 306	com/tencent/wecall/talkroom/model/a:cHt	()Lcom/tencent/wecall/talkroom/model/a;
    //   79: pop
    //   80: invokestatic 309	com/tencent/wecall/talkroom/model/a:cHv	()V
    //   83: new 311	android/content/IntentFilter
    //   86: dup
    //   87: invokespecial 312	android/content/IntentFilter:<init>	()V
    //   90: astore_1
    //   91: aload_1
    //   92: ldc_w 313
    //   95: invokevirtual 317	android/content/IntentFilter:setPriority	(I)V
    //   98: aload_1
    //   99: ldc_w 319
    //   102: invokevirtual 323	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   105: getstatic 55	com/tencent/pb/common/c/d:oSX	Landroid/content/Context;
    //   108: aload_0
    //   109: getfield 35	com/tencent/wecall/talkroom/model/e:vxj	Lcom/tencent/pb/common/system/ConnectReceiver;
    //   112: aload_1
    //   113: invokevirtual 329	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   116: pop
    //   117: ldc 26
    //   119: iconst_1
    //   120: anewarray 4	java/lang/Object
    //   123: dup
    //   124: iconst_0
    //   125: ldc_w 331
    //   128: aastore
    //   129: invokestatic 125	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: iconst_1
    //   133: ireturn
    //   134: aload_3
    //   135: getfield 286	com/tencent/wecall/talkroom/model/g:cWy	Ljava/util/List;
    //   138: aload_1
    //   139: invokeinterface 334 2 0
    //   144: pop
    //   145: aload_1
    //   146: monitorexit
    //   147: goto -78 -> 69
    //   150: astore_2
    //   151: aload_1
    //   152: monitorexit
    //   153: aload_2
    //   154: athrow
    //   155: astore_1
    //   156: ldc 26
    //   158: iconst_2
    //   159: anewarray 4	java/lang/Object
    //   162: dup
    //   163: iconst_0
    //   164: ldc_w 336
    //   167: aastore
    //   168: dup
    //   169: iconst_1
    //   170: aload_1
    //   171: aastore
    //   172: invokestatic 106	com/tencent/pb/common/c/c:x	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   175: iconst_0
    //   176: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	this	e
    //   0	177	1	parama	com.tencent.pb.talkroom.sdk.a
    //   0	177	2	parame	com.tencent.pb.talkroom.sdk.e
    //   41	94	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   54	69	150	finally
    //   134	147	150	finally
    //   151	153	150	finally
    //   29	54	155	java/lang/Exception
    //   69	132	155	java/lang/Exception
    //   153	155	155	java/lang/Exception
  }
  
  public final boolean a(String paramString1, int paramInt1, long paramLong, int paramInt2, String paramString2)
  {
    f.b localb = a.cHu().a(paramString1, paramInt1, paramLong, paramInt2, 100, paramString2);
    com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "enterMultiTalk multiTalkGroupid:", paramString1, " roomId: ", Integer.valueOf(paramInt1), " roomKey: ", Long.valueOf(paramLong), " routId: ", Integer.valueOf(paramInt2), " wxGroupId: ", paramString2, " ret: ", localb });
    return localb == f.b.vyB;
  }
  
  public final List<String> acj(String paramString)
  {
    if (!com.tencent.pb.common.c.g.gr(paramString, a.cHu().jTX))
    {
      com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "getTalkingMember groupid is not same; multiTalkGroupid: ", paramString, a.cHu().jTX });
      return null;
    }
    Object localObject1 = c.cHG().adg(paramString);
    if (localObject1 == null)
    {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "getTalkingMember talkroom is null: groupId: ", paramString });
      return null;
    }
    localObject1 = ((TalkRoom)localObject1).cHB();
    paramString = new ArrayList();
    localObject1 = ((List)localObject1).iterator();
    label195:
    label198:
    for (;;)
    {
      d locald;
      int i;
      if (((Iterator)localObject1).hasNext())
      {
        locald = (d)((Iterator)localObject1).next();
        if (locald == null) {
          continue;
        }
        Object localObject2 = a.cHu();
        i = locald.cHJ();
        if (((f)localObject2).vxI == null) {
          break label195;
        }
        localObject2 = ((f)localObject2).vxI;
        if ((com.tencent.pb.common.a.a.vbD) && (((b)localObject2).vwZ.GetVoiceActivity(i) == 1)) {
          i = 1;
        }
      }
      for (;;)
      {
        if (i == 0) {
          break label198;
        }
        paramString.add(locald.cHI());
        break;
        i = 0;
        continue;
        return paramString;
        i = 0;
      }
    }
  }
  
  public final boolean bL(byte[] paramArrayOfByte)
  {
    com.tencent.pb.common.b.f.cEq();
    int i = com.tencent.pb.common.b.f.bK(paramArrayOfByte);
    com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "handleMultiTalkNotify ret: ", Integer.valueOf(i) });
    return i == 0;
  }
  
  public final void bg(int paramInt, String paramString)
  {
    com.tencent.pb.a.a.a.Hi(paramInt);
    com.tencent.pb.a.a.a.aci(paramString);
    com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "setWxUinAndUsrName uin: ", Integer.valueOf(paramInt), " usrname: ", paramString });
  }
  
  public final boolean c(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "handleMultiTalkResp retCode: ", Integer.valueOf(paramInt1), " seq: ", Integer.valueOf(paramInt2), " cmdId: ", Integer.valueOf(paramInt3), " data length: ", Integer.valueOf(i) });
      if (paramInt1 != 0) {
        break label97;
      }
      com.tencent.pb.common.b.f.cEq().s(paramInt2, paramArrayOfByte);
    }
    label97:
    com.tencent.pb.common.b.f.a locala;
    do
    {
      return true;
      i = paramArrayOfByte.length;
      break;
      paramArrayOfByte = com.tencent.pb.common.b.f.cEq();
      locala = paramArrayOfByte.Hh(paramInt2);
    } while (locala == null);
    com.tencent.pb.common.c.c.x("NETCMD", new Object[] { "CLTRCV FAIL", Integer.valueOf(paramInt2), locala.vcr, Integer.valueOf(1), Integer.valueOf(paramInt1) });
    paramArrayOfByte.a(locala, -1, null);
    return true;
  }
  
  public final boolean cEI()
  {
    try
    {
      com.tencent.pb.common.c.c.cED();
      com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "setOpenLog: isOpenSdkLog", Boolean.valueOf(true), " level: ", Integer.valueOf(0) });
      return true;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "setOpenLog: ", localThrowable });
    }
    return false;
  }
  
  public final String cEJ()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("client_");
    ((StringBuilder)localObject).append(com.tencent.pb.a.a.a.cEG());
    ((StringBuilder)localObject).append("_");
    ((StringBuilder)localObject).append(System.currentTimeMillis());
    localObject = ((StringBuilder)localObject).toString();
    com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "genMultiTalkClientId clientId: ", localObject });
    return (String)localObject;
  }
  
  public final boolean f(String paramString1, String paramString2, List<String> paramList)
  {
    f localf = a.cHu();
    Object localObject1 = f.en(paramList);
    int i;
    if (localObject1.length > 0)
    {
      if (TextUtils.isEmpty(null)) {
        break label289;
      }
      throw new NullPointerException();
      com.tencent.pb.common.c.c.x("TalkRoomService", new Object[] { "createTalkRoom cliendId: ", paramString1, " voiceSingle2MultiInfo: ", null, " memeberUuids size: ", Integer.valueOf(localObject1.length), "routeId", Integer.valueOf(i), " context: ", null, " type: ", Integer.valueOf(0), " playId: ", Long.valueOf(0L), " sdkKey: ", null });
      if (com.tencent.pb.a.a.a.cEH()) {
        break label318;
      }
      com.tencent.pb.common.c.c.x("TalkRoomService", new Object[] { "createTalkRoom isAuthed: ", Boolean.valueOf(com.tencent.pb.a.a.a.cEH()), " isBindMobile: ", Boolean.valueOf(true) });
      h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "noAuth" });
    }
    for (;;)
    {
      paramString1 = null;
      com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "createTalkRoom clientId is: ", paramString1, "wXgroupId: ", paramString2, " creatorUsrName: ", com.tencent.pb.a.a.a.cEG(), " usrnameList: ", paramList });
      if (paramString1 == null) {
        break label988;
      }
      return true;
      label289:
      i = new Random().nextInt() << 16 | com.tencent.pb.a.a.a.cEG().hashCode() & 0xFFFF;
      break;
      label318:
      if (!com.tencent.pb.common.b.h.isNetworkConnected())
      {
        com.tencent.pb.common.c.c.x("TalkRoomService", new Object[] { "createTalkRoom isNetworkConnected is false" });
        h.Iv(61533);
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "noNetwork" });
      }
      else if (localf.bJP())
      {
        if (localf.bJP()) {
          h.Iv(61534);
        }
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "isBusy" });
      }
      else if (TextUtils.isEmpty(paramString1))
      {
        com.tencent.pb.common.c.c.x("TalkRoomService", new Object[] { "createTalkRoom cliendId is null" });
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "cliendIdnull" });
      }
      else if (!j.ads(paramString1))
      {
        com.tencent.pb.common.c.c.x("TalkRoomService", new Object[] { "createTalkRoom groupId is not cliend id: ", paramString1 });
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "isnotcliendId" });
      }
      else
      {
        if (c.cHG().adg(paramString1) == null) {
          c.cHG().c(paramString1, paramString2, (String[])localObject1);
        }
        localf.cHS();
        localf.mT(false);
        localf.cHP();
        if (localf.bHg()) {
          break label682;
        }
        com.tencent.pb.common.c.c.x("TalkRoomService", new Object[] { "createTalkRoom initEngine fail" });
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "initEnginefail" });
        localf.mT(false);
      }
    }
    label682:
    localf.vxH.cHZ();
    localf.jTX = paramString1;
    localf.vxT = paramString1;
    localf.vcc = i;
    localf.vxy = paramString1;
    localf.setState(1);
    localf.oLU = true;
    Object localObject2 = new f.a(localf);
    ((f.a)localObject2).groupId = localf.jTX;
    ((f.a)localObject2).vyv = ((String[])localObject1);
    ((f.a)localObject2).vyw = null;
    ((f.a)localObject2).vcN = i;
    ((f.a)localObject2).type = 0;
    ((f.a)localObject2).vyx = 0L;
    ((f.a)localObject2).vyy = null;
    ((f.a)localObject2).vyz = false;
    ((f.a)localObject2).vyA = paramString2;
    localObject1 = Message.obtain();
    ((Message)localObject1).what = 2;
    ((Message)localObject1).obj = localObject2;
    localf.mHandler.removeMessages(2);
    localObject2 = c.cHG().adg(localf.jTX);
    if (localObject2 == null) {
      com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup talkroom is null" });
    }
    for (;;)
    {
      localf.mHandler.sendMessage((Message)localObject1);
      localf.vxV = true;
      break;
      localObject2 = ((TalkRoom)localObject2).cHA();
      if ((localObject2 == null) || (((List)localObject2).size() != 1))
      {
        com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup TalkRoomMember list is not match" });
      }
      else
      {
        localObject2 = (d)((List)localObject2).get(0);
        if (localObject2 == null) {
          com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup talkRoomMember is null" });
        } else {
          com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup ret: ", Boolean.valueOf(((d)localObject2).cHK()) });
        }
      }
    }
    label988:
    return false;
  }
  
  public final void gK(boolean paramBoolean)
  {
    a.cHu();
    com.tencent.pb.talkroom.sdk.e locale = f.cHX();
    if (locale != null) {}
    for (boolean bool = locale.gG(paramBoolean);; bool = false)
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "switchSpeakerPhone", Boolean.valueOf(paramBoolean), " ret: ", Boolean.valueOf(bool), " realret: ", Boolean.valueOf(f.yJ()), " wxCallBack: ", locale });
      return;
    }
  }
  
  public final void mN(boolean paramBoolean)
  {
    f localf = a.cHu();
    com.tencent.pb.common.c.c.x("TalkRoomService", new Object[] { "setMute isMute: ", Boolean.valueOf(paramBoolean) });
    localf.mIsMute = paramBoolean;
    com.tencent.pb.common.c.h.af(new g.14(localf.vxP, paramBoolean));
  }
  
  public final boolean mO(boolean paramBoolean)
  {
    com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "holadMultiTalk isHold", Boolean.valueOf(paramBoolean) });
    f localf;
    if (paramBoolean)
    {
      localf = a.cHu();
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "syscall", "startHoldOn" });
      localf.vyd = true;
      localf.mU(false);
      com.tencent.pb.common.c.h.af(new g.10(localf.vxP));
    }
    do
    {
      return true;
      localf = a.cHu();
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "syscall", "endHoldOn" });
      localf.vyd = false;
      localf.cHQ();
    } while ((!localf.bJP()) || (!localf.kFG));
    localf.mU(true);
    com.tencent.pb.common.c.h.af(new g.12(localf.vxP));
    return true;
  }
  
  public final int setAppCmd(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    f localf = a.cHu();
    if (localf.vxI == null) {
      com.tencent.pb.common.c.c.x("TalkRoomService", new Object[] { "setAppCmd type: ", Integer.valueOf(paramInt1), " engine is null" });
    }
    for (int i = -1;; i = localf.vxI.vwZ.setAppCmd(paramInt1, paramArrayOfByte, paramInt2))
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "setAppCmd type: ", Integer.valueOf(paramInt1), " paramLen: ", Integer.valueOf(paramInt2), " ret: ", Integer.valueOf(i) });
      return i;
    }
  }
  
  public final com.tencent.pb.talkroom.sdk.f t(int[] paramArrayOfInt)
  {
    int j = 0;
    Object localObject1 = a.cHu();
    Object localObject2;
    if (((f)localObject1).vxI != null)
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "receiveVideo" });
      localObject2 = ((f)localObject1).vxI;
      localObject1 = new com.tencent.pb.talkroom.sdk.f();
      if (paramArrayOfInt == null)
      {
        com.tencent.pb.common.c.c.x("simon:TalkRoomContext", new Object[] { "receiveVideo imgBuffer is null" });
        if (paramArrayOfInt != null) {
          break label473;
        }
      }
    }
    label233:
    label234:
    label239:
    label352:
    label455:
    label473:
    for (int i = j;; i = paramArrayOfInt.length)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "receiveVideo imgBuffer size: ", Integer.valueOf(i), " MultiTalkVideoDecodeInfo: ", localObject1 });
      return (com.tencent.pb.talkroom.sdk.f)localObject1;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).ret = ((b)localObject2).vwZ.videoDecode(paramArrayOfInt);
      ((com.tencent.pb.talkroom.sdk.f)localObject1).vgt = paramArrayOfInt;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).vgu = ((b)localObject2).vwZ.field_remoteImgLength;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).vgv = ((b)localObject2).vwZ.field_remoteImgWidth;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).vgw = ((b)localObject2).vwZ.field_remoteImgHeight;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).vgx = (((b)localObject2).vwZ.field_remoteImgChannel & 0x3FFF);
      Object localObject3 = c.cHG();
      localObject2 = a.cHu().jTX;
      i = ((com.tencent.pb.talkroom.sdk.f)localObject1).vgx;
      if (TextUtils.isEmpty((CharSequence)localObject2))
      {
        com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "getUsrNameByMemberId groupId is null memberId: ", Integer.valueOf(i) });
        break label352;
        localObject2 = "";
        ((com.tencent.pb.talkroom.sdk.f)localObject1).vgr = ((String)localObject2);
        if (paramArrayOfInt != null) {
          break label455;
        }
      }
      for (i = 0;; i = paramArrayOfInt.length)
      {
        com.tencent.pb.common.c.c.d("simon:TalkRoomContext", new Object[] { "receiveVideo imgBuffer size:", Integer.valueOf(i), " MultiTalkVideoDecodeInfo: ", localObject1 });
        break;
        localObject3 = ((c)localObject3).adg((String)localObject2);
        if (localObject3 == null)
        {
          com.tencent.pb.common.c.c.x("TalkRoomManager", new Object[] { "getUsrNameByMemberId talkRoom is null groupId: ", localObject2, " memberId: ", Integer.valueOf(i) });
          break label234;
        }
        localObject3 = ((TalkRoom)localObject3).cHD().iterator();
        if (!((Iterator)localObject3).hasNext()) {
          break label234;
        }
        a.av localav = (a.av)((Iterator)localObject3).next();
        if ((localav == null) || (localav.kpU != i)) {
          break label233;
        }
        com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "getUsrNameByMemberId wxUserName:", localav.vez, " groupId: ", localObject2, " memberId: ", Integer.valueOf(i) });
        if (localav.vez == null) {
          break label234;
        }
        localObject2 = localav.vez;
        break label239;
      }
      localObject1 = new com.tencent.pb.talkroom.sdk.f();
      break;
    }
  }
  
  public final boolean ti(int paramInt)
  {
    if (!a.cHu().bJP())
    {
      com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "switchMultiTalkVideo isWorking is false" });
      return false;
    }
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "switchMultiTalkVideo action: ", Integer.valueOf(paramInt) });
    Object localObject = a.cHu();
    if (TextUtils.isEmpty(((f)localObject).jTX))
    {
      com.tencent.pb.common.c.c.x("TalkRoomService", new Object[] { "switchMultiTalkVideo mGroupId is null" });
      return false;
    }
    ((f)localObject).vxG = paramInt;
    localObject = new l(((f)localObject).jTX, ((f)localObject).kvL, ((f)localObject).vxz, paramInt);
    boolean bool = com.tencent.pb.common.b.e.cEn().a((com.tencent.pb.common.b.d)localObject);
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "switchMultiTalkVideo ret: ", Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean u(String paramString, List<String> paramList)
  {
    if (!com.tencent.pb.common.c.g.gr(paramString, a.cHu().jTX))
    {
      com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "addMultiTalkMember groupid is not same; multiTalkGroupid: ", paramString, a.cHu().jTX });
      return false;
    }
    f localf = a.cHu();
    int j = localf.kvL;
    long l = localf.vxz;
    int i;
    boolean bool;
    if (paramList == null)
    {
      i = 0;
      com.tencent.pb.common.c.c.x("TalkRoomService", new Object[] { "addrTalkRoomMember", paramString, Integer.valueOf(j), Long.valueOf(l), " users length: ", Integer.valueOf(i) });
      localf.vxV = false;
      if ((!TextUtils.isEmpty(paramString)) && (paramList != null)) {
        break label173;
      }
      bool = false;
    }
    for (;;)
    {
      com.tencent.pb.common.c.c.x("TalkRoomSdkApi", new Object[] { "addMultiTalkMember ret: ", Boolean.valueOf(bool) });
      return bool;
      i = paramList.size();
      break;
      label173:
      if (!com.tencent.pb.common.b.h.isNetworkConnected())
      {
        com.tencent.pb.common.c.c.x("TalkRoomService", new Object[] { "addTalkRoomMember isNetworkConnected is false" });
        bool = false;
      }
      else
      {
        paramList = f.en(paramList);
        if (paramList.length <= 0)
        {
          com.tencent.pb.common.c.c.x("TalkRoomService", new Object[] { "addTalkRoomMember users is null" });
          bool = false;
        }
        else
        {
          paramString = new com.tencent.wecall.talkroom.a.b(paramString, localf.kvL, localf.vxz, paramList);
          bool = com.tencent.pb.common.b.e.cEn().a(paramString);
          localf.vxH.Q(new String[] { "add", "req", String.valueOf(bool), String.valueOf(localf.state) });
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/wecall/talkroom/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */