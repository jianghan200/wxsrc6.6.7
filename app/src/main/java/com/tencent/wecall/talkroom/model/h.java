package com.tencent.wecall.talkroom.model;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.pb.common.c.d;
import com.tencent.pb.common.c.f;
import com.tencent.pb.common.c.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class h
{
  static final String TAG = h.class.getCanonicalName();
  public static h vyU = new h();
  String deviceModel;
  public String groupId = "";
  public int kpU = -1;
  public int kpo = 0;
  public long kpp = 0L;
  long kqK = 0L;
  int kqL = 0;
  public int netType = -1;
  public int oOA = 0;
  public int oOD = 0;
  public int oOK = -1;
  public int oOw = 1;
  public int oOz = 0;
  int oWL = 0;
  int oWO = 0;
  int oWS = 0;
  long oWT = 0L;
  int oWY = 0;
  public int oWZ = 0;
  String oXe = "";
  public String vcI = "";
  public int vyV = 0;
  int vyW = 0;
  long vyX = 0L;
  long vyY = 0L;
  int vyZ = 0;
  public int vza = 0;
  int vzb = 0;
  long vzc = 0L;
  int vzd;
  int vze = -1;
  String vzf;
  int vzg;
  StringBuffer vzh = new StringBuffer();
  long vzi = 0L;
  long vzj = 0L;
  long vzk = 0L;
  
  public static void It(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendNetSceneStat", Integer.valueOf(paramInt) });
    f.u(527, 3, String.valueOf(paramInt));
  }
  
  public static void Iu(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendDeviceStat", Integer.valueOf(paramInt) });
    f.u(528, 3, String.valueOf(paramInt));
  }
  
  public static void Iv(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendtalkRoomDialStat", Integer.valueOf(paramInt) });
    f.u(530, 3, String.valueOf(paramInt));
  }
  
  public static void Iw(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendEngineStat", Integer.valueOf(paramInt) });
    f.u(529, 3, String.valueOf(paramInt));
  }
  
  public static void a(int paramInt, long paramLong, String... paramVarArgs)
  {
    h localh = new h();
    localh.groupId = "";
    localh.kpo = paramInt;
    localh.kpp = paramLong;
    localh.vcI = "";
    localh.Q(paramVarArgs);
    ado(localh.cHY());
    f.cEF();
  }
  
  public static void a(String paramString, int paramInt, long paramLong, String... paramVarArgs)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.x(TAG, new Object[] { "uploadTempReport groupId is null" });
      return;
    }
    com.tencent.pb.common.c.c.x(TAG, new Object[] { "uploadTempReport: ", paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    h localh = new h();
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    localh.groupId = str;
    localh.kpo = paramInt;
    localh.kpp = paramLong;
    localh.Q(paramVarArgs);
    ado(localh.cHY());
  }
  
  public static void a(String paramString1, String paramString2, int paramInt, long paramLong, String... paramVarArgs)
  {
    if ((TextUtils.isEmpty(paramString1)) && (TextUtils.isEmpty(paramString2)))
    {
      com.tencent.pb.common.c.c.x(TAG, new Object[] { "uploadTempReport groupId and clientGroupId is null" });
      return;
    }
    com.tencent.pb.common.c.c.x(TAG, new Object[] { "uploadTempReport: ", paramString1, " clientGroupId: ", paramString2, " roomid: ", Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    h localh = new h();
    String str = paramString1;
    if (paramString1 == null) {
      str = "";
    }
    localh.groupId = str;
    localh.kpo = paramInt;
    localh.kpp = paramLong;
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    localh.vcI = paramString1;
    localh.Q(paramVarArgs);
    ado(localh.cHY());
    f.cEF();
  }
  
  public static void ado(String paramString)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendSummaryNetScene", paramString });
    f.u(532, 3, paramString);
  }
  
  public static void adp(String paramString)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendEngineRecv", paramString });
    f.u(533, 3, paramString);
  }
  
  public static void adq(String paramString)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendEngineSend", paramString });
    f.u(534, 3, paramString);
  }
  
  public static void adr(String paramString)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendChannelStat", paramString });
    f.u(535, 3, paramString);
  }
  
  public static void cIb()
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendTalkRoomOnDialStat", Integer.valueOf(60535) });
    f.u(531, 3, "-5001");
  }
  
  public final void Ix(int paramInt)
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "stopStatus", Integer.valueOf(paramInt) });
    this.oWL = paramInt;
  }
  
  public final void Q(String... paramVarArgs)
  {
    int i = 0;
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {}
    for (;;)
    {
      return;
      if (this.vzh.length() > 900)
      {
        this.vzh.setLength(0);
        this.vzh.append("overmaxsize");
      }
      if (this.vzh.length() != 0) {
        this.vzh.append("-");
      }
      int j = paramVarArgs.length;
      while (i < j)
      {
        String str = paramVarArgs[i];
        this.vzh.append(str);
        this.vzh.append("|");
        i += 1;
      }
    }
  }
  
  public final String cHY()
  {
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "collectInfo" });
    this.vzf = Build.MANUFACTURER;
    this.deviceModel = Build.MODEL;
    this.vzg = Build.VERSION.SDK_INT;
    this.oXe = Build.VERSION.RELEASE;
    this.netType = k.ih(d.oSX);
    this.vzd = -1;
    this.vze = -1;
    Object localObject1 = new ArrayList();
    ((List)localObject1).add(this.groupId);
    ((List)localObject1).add(this.vcI);
    ((List)localObject1).add(Integer.valueOf(this.oOw));
    ((List)localObject1).add(Integer.valueOf(this.kpo));
    ((List)localObject1).add(Long.valueOf(this.kpp));
    ((List)localObject1).add(Integer.valueOf(this.kpU));
    ((List)localObject1).add(Integer.valueOf(this.oWL));
    ((List)localObject1).add(Integer.valueOf(this.oWS));
    ((List)localObject1).add(Integer.valueOf(this.oWO));
    ((List)localObject1).add(Integer.valueOf(this.kqL));
    ((List)localObject1).add(Integer.valueOf(this.vyV));
    ((List)localObject1).add(Integer.valueOf(this.vyW));
    ((List)localObject1).add(Long.valueOf(this.vyX));
    ((List)localObject1).add(Long.valueOf(this.vyY));
    ((List)localObject1).add(Integer.valueOf(this.vyZ));
    ((List)localObject1).add(Integer.valueOf(this.vza));
    ((List)localObject1).add(Integer.valueOf(this.vzb));
    ((List)localObject1).add(Long.valueOf(this.vzc));
    ((List)localObject1).add(Long.valueOf(this.oWT));
    ((List)localObject1).add(Long.valueOf(this.kqK));
    ((List)localObject1).add(Integer.valueOf(this.oWY));
    ((List)localObject1).add(Integer.valueOf(this.oWZ));
    ((List)localObject1).add(Integer.valueOf(this.netType));
    ((List)localObject1).add(Integer.valueOf(this.vzd));
    ((List)localObject1).add(Integer.valueOf(this.vze));
    ((List)localObject1).add(this.vzf);
    ((List)localObject1).add(this.deviceModel);
    ((List)localObject1).add(Integer.valueOf(this.vzg));
    ((List)localObject1).add(this.oXe);
    Object localObject2 = c.cHG();
    String str = this.groupId;
    localObject2 = ((c)localObject2).adg(str);
    int i;
    if (localObject2 == null) {
      i = 0;
    }
    for (;;)
    {
      ((List)localObject1).add(Integer.valueOf(i));
      ((List)localObject1).add(this.vzh.toString());
      ((List)localObject1).add(Integer.valueOf(this.oOK));
      ((List)localObject1).add(Integer.valueOf(this.oOD));
      ((List)localObject1).add(Integer.valueOf(this.oOz));
      ((List)localObject1).add(Integer.valueOf(this.oOA));
      localObject1 = g.a((Iterable)localObject1, ",", "_");
      com.tencent.pb.common.c.c.d(TAG, new Object[] { "logBuf: ", this.vzh.toString() });
      com.tencent.pb.common.c.c.d(TAG, new Object[] { "statresult", localObject1 });
      return (String)localObject1;
      i = ((TalkRoom)localObject2).vwY.size();
      com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "getGroupMemberSize groupid: ", str, " size: ", Integer.valueOf(i) });
    }
  }
  
  public final void cHZ()
  {
    this.vzi = System.currentTimeMillis();
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "beginCreateOrEnter", Long.valueOf(this.vzi) });
  }
  
  public final void cIa()
  {
    com.tencent.pb.common.c.c.x(TAG, new Object[] { "beginCreateOrNotify" });
    this.vzj = System.currentTimeMillis();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */