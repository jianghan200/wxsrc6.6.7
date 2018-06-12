package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Message;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.tencent.mm.compatible.b.f;
import com.tencent.mm.compatible.e.b;
import com.tencent.mm.compatible.e.c.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.compatible.util.l;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.e;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.protocal.c.byy;
import com.tencent.mm.protocal.c.cah;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ArrayBlockingQueue;

public class v2protocal
{
  public static final int lsT;
  private static final String[] oIK;
  public static final int oOf;
  public static boolean oOg;
  public static c oPU;
  public static Surface oPW;
  private static int oPw;
  public static int ovW;
  int bitrate = 300;
  public int channelStrategy = 0;
  public long dTS = 0L;
  public int defaultHeight = 240;
  public int defaultWidth = 320;
  public int[] field_ChannelReportDial = null;
  public int[] field_EngineReportStatFromApp = null;
  public int field_HWEncH = 0;
  public int field_HWEncW = 0;
  public int[] field_SpeedTestSvrParaArray = null;
  public int field_audioDuration = 0;
  public byte[] field_capInfo = null;
  int field_channelReportLength = 0;
  int field_channelStatLength = 0;
  public int field_connectingStatusKey = 0;
  int field_engine2ndReportLength = 0;
  int field_engine2ndStatLength = 0;
  int field_engineQosStatLength = 0;
  int field_engineVersionStatLength = 0;
  public int[] field_jbmBitratRsSvrParamArray = null;
  public double[] field_jbmBitratRsSvrParamDoubleArray = null;
  public int field_jbmParamArraySize = 0;
  public int field_jbmParamDoubleArraySize = 0;
  public int field_localImgHeight = 0;
  public int field_localImgWidth = 0;
  public int field_mGetValidSample = 0;
  int field_netFlowRecv = 0;
  int field_netFlowSent = 0;
  int field_newEngineExtStatLength = 0;
  int field_newEngineReportLength = 0;
  int field_newEngineStatLength = 0;
  public byte[] field_peerId = null;
  public int field_pstnChannelInfoLength = 0;
  public int field_pstnEngineInfoLength = 0;
  public int[] field_punchSvrArray = null;
  public int field_realLinkQualityInfoBuffLen = 0;
  public int field_recvVideoLen = 120;
  public int field_relayDataSyncKey = 0;
  public int[] field_relaySvrArray = null;
  public int[] field_relayTcpSvrArray = null;
  public int field_remoteImgHeight = 0;
  public int field_remoteImgLength = 0;
  public int field_remoteImgOrien = 0;
  public int field_remoteImgWidth = 0;
  public int field_sendVideoLen = 100;
  int field_speedTestInfoLength = 0;
  int field_statInfoLength = 0;
  public int field_statusSyncKey = 0;
  public int field_videoDuration = 0;
  public int field_voipcsChannelInfoLength = 0;
  public int field_voipcsEngineInfoLength = 0;
  private ag handler = null;
  public int height = 480;
  public String kFn = "";
  public int kpo = 0;
  public long kpp = 0L;
  public int kpr = 0;
  public int kpw = 0;
  public boolean lkO = false;
  public int netType = 0;
  public int oOA = 0;
  public int oOB = 65536;
  public int oOC = 0;
  public int oOD = 0;
  public int oOE = 7;
  public int oOF = 3;
  public int oOG = 3;
  public int oOH = 0;
  public int oOI = 0;
  public int oOJ = -1;
  public int oOK = -1;
  public int oOL = 0;
  public int oOM = 0;
  public int oON = 0;
  public int oOO = 0;
  public int oOP = 100;
  public int oOQ = 300;
  public int oOR = 1;
  public int oOS = 1;
  public int oOT = 0;
  public int oOU = 1;
  public int oOV = 0;
  public int oOW = 0;
  public int oOX = 0;
  public int oOY = 0;
  public int oOZ = 0;
  public int oOh = 0;
  public int oOi = 0;
  public int oOj = 0;
  public int oOk = 0;
  public long oOl = 0L;
  public byte[] oOm = null;
  public byte[] oOn = null;
  public byte[] oOo = null;
  public int oOp = 0;
  public byte[] oOq = null;
  public int oOr = 500;
  public int oOs = 30;
  public int oOt = 999;
  public int oOu = 0;
  public int oOv = 20;
  public int oOw = 0;
  public int oOx = 0;
  public int oOy = 0;
  public int oOz = 0;
  public int oPA = 0;
  public int oPB = 0;
  public int oPC = 0;
  public int oPD = 0;
  public int oPE = 0;
  byte[] oPF = new byte['က'];
  byte[] oPG = new byte['ࠀ'];
  byte[] oPH = new byte['ࠀ'];
  byte[] oPI = new byte['က'];
  byte[] oPJ = new byte['က'];
  byte[] oPK = new byte['ࠀ'];
  byte[] oPL = new byte['က'];
  public byte[] oPM = new byte['ࠀ'];
  public byte[] oPN = new byte['ࠀ'];
  public byte[] oPO = new byte['ࠀ'];
  public byte[] oPP = new byte['ࠀ'];
  public int[] oPQ = new int[30];
  int oPR = 0;
  public m oPS = new m();
  public d oPT = null;
  int oPV = 8;
  public boolean oPX = false;
  public int oPa = 0;
  public int oPb = 0;
  public int oPc = 0;
  public int oPd = 0;
  public int oPe = 0;
  public int[] oPf = null;
  public int oPg = 0;
  public int oPh = 0;
  public int oPi = 0;
  public int oPj = 0;
  public byte[] oPk = null;
  public int oPl = 0;
  public int oPm = 0;
  public int oPn = 0;
  public int oPo = 0;
  public byte[] oPp = new byte['ל'];
  public int oPq = 0;
  public byte[] oPr = null;
  public byte[] oPs = null;
  public int oPt = 0;
  public int oPu = 0;
  public int oPv = 0;
  public ArrayBlockingQueue<byte[]> oPx = new ArrayBlockingQueue(oPw);
  public long oPy = 0L;
  public byte[] oPz = new byte[8];
  public int width = 640;
  
  static
  {
    int i = com.tencent.mm.compatible.e.m.zj();
    if ((i & 0x400) != 0)
    {
      com.tencent.mm.compatible.loader.d.y(ad.getContext(), "libvoipCodec_v7a.so");
      com.tencent.mm.compatible.util.k.b("voipMain", v2protocal.class.getClassLoader());
      i = com.tencent.mm.compatible.e.m.zj();
      ovW = i;
      if ((i & 0x400) == 0) {
        break label140;
      }
    }
    label140:
    for (i = 16000;; i = 8000)
    {
      lsT = i;
      oOf = i / 1000 * 20 * 2;
      oOg = false;
      oPw = 10;
      oPU = null;
      oPW = null;
      oIK = new String[] { "OMX.qcom.", "OMX.Exynos.", "OMX.hisi" };
      return;
      if ((i & 0x200) != 0)
      {
        com.tencent.mm.compatible.loader.d.y(ad.getContext(), "libvoipCodec.so");
        break;
      }
      com.tencent.mm.compatible.loader.d.y(ad.getContext(), "libvoipCodec_v5.so");
      break;
    }
  }
  
  public v2protocal(ag paramag)
  {
    this.handler = paramag;
  }
  
  public static long aU(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    paramArrayOfByte.order(ByteOrder.nativeOrder());
    return paramArrayOfByte.getLong();
  }
  
  public static String bLs()
  {
    Object localObject2 = Build.MANUFACTURER;
    Object localObject1 = localObject2;
    if (((String)localObject2).contains(",")) {
      localObject1 = ((String)localObject2).replace(',', ' ');
    }
    Object localObject3 = Build.MODEL;
    localObject2 = localObject3;
    if (((String)localObject3).contains(",")) {
      localObject2 = ((String)localObject3).replace(',', ' ');
    }
    Object localObject4 = Build.VERSION.SDK;
    localObject3 = localObject4;
    if (((String)localObject4).contains(",")) {
      localObject3 = ((String)localObject4).replace(',', ' ');
    }
    String str = Build.VERSION.RELEASE;
    localObject4 = str;
    if (str.contains(",")) {
      localObject4 = ((String)localObject3).replace(',', ' ');
    }
    return "," + (String)localObject1 + "," + (String)localObject2 + "," + (String)localObject3 + "," + (String)localObject4;
  }
  
  private String bLt()
  {
    return "," + this.channelStrategy;
  }
  
  private String bLv()
  {
    a.eV("MicroMsg.Voip", "usePreConnect:" + this.oON);
    return "," + this.oON;
  }
  
  private String bLw()
  {
    a.eV("MicroMsg.Voip", "preConnectSuccess:" + this.oOO);
    return "," + this.oOO;
  }
  
  public static String bLy()
  {
    return "\000";
  }
  
  private native int forceredirect(int paramInt1, int paramInt2);
  
  private native int setsvraddr(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2);
  
  private native int uninit(int paramInt1, long paramLong, int paramInt2);
  
  public native int SendDTMF(int paramInt);
  
  public native int SendRUDP(byte[] paramArrayOfByte, int paramInt);
  
  public native int SetDTMFPayload(int paramInt);
  
  public native int StartSpeedTest(long paramLong, int paramInt);
  
  public native int StopSpeedTest();
  
  public final int a(byy parambyy1, byy parambyy2, byy parambyy3, int paramInt1, int paramInt2)
  {
    if ((parambyy1 != null) && (parambyy1.suW > 0))
    {
      a.eU("MicroMsg.Voip", "forceRedirect: got relay svr addr from server");
      this.field_relaySvrArray = a.a(parambyy1);
      if ((parambyy2 == null) || (parambyy2.suW <= 0)) {
        break label133;
      }
      a.eU("MicroMsg.Voip", "forceRedirect: got punch svr addr from server");
      this.field_punchSvrArray = a.a(parambyy2);
      label56:
      if ((parambyy3 == null) || (parambyy3.suW <= 0)) {
        break label145;
      }
      a.eU("MicroMsg.Voip", "forceRedirect: got relay tcp svr addr from server");
      this.field_relayTcpSvrArray = a.a(parambyy3);
    }
    for (;;)
    {
      paramInt1 = forceredirect(paramInt1, paramInt2);
      a.eU("MicroMsg.Voip", "v2protocal forceRedirect ret :" + paramInt1);
      return paramInt1;
      a.eU("MicroMsg.Voip", "forceRedirect: [TRANSPORT]No relay svr ip");
      break;
      label133:
      a.eU("MicroMsg.Voip", "forceRedirect: No punch svr ip");
      break label56;
      label145:
      a.eU("MicroMsg.Voip", "forceRedirect: No relay tcp svr ip");
    }
  }
  
  public final int a(byy parambyy1, byy parambyy2, byy parambyy3, cah paramcah)
  {
    if (parambyy1.suW > 0)
    {
      a.eU("MicroMsg.Voip", "setSvrAddr: got relay svr addr from server");
      this.field_relaySvrArray = a.a(parambyy1);
      if (parambyy2.suW <= 0) {
        break label142;
      }
      a.eU("MicroMsg.Voip", "setSvrAddr: got punch svr addr from server");
      this.field_punchSvrArray = a.a(parambyy2);
      label48:
      if (parambyy3.suW <= 0) {
        break label154;
      }
      a.eU("MicroMsg.Voip", "setSvrAddr:got tcpsvr addr from server");
      this.field_relayTcpSvrArray = a.a(parambyy3);
    }
    for (;;)
    {
      int i = setsvraddr(paramcah.swD, paramcah.swE, paramcah.swF, paramcah.userName, paramcah.eSH);
      a.eU("MicroMsg.Voip", "v2protocal setsvraddr ret :" + i);
      return i;
      a.eU("MicroMsg.Voip", "setSvrAddr: [TRANSPORT]No relay svr ip");
      break;
      label142:
      a.eU("MicroMsg.Voip", "setSvrAddr: No punch svr ip");
      break label48;
      label154:
      a.eU("MicroMsg.Voip", "setSvrAddr:no tcp svr addr ip");
    }
  }
  
  public native int app2EngineDataEx(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4);
  
  public native int app2EngineLinkQualityEx(int paramInt, byte[] paramArrayOfByte);
  
  public final int bGN()
  {
    this.netType = a.getNetType(ad.getContext());
    this.oOj = this.netType;
    if (this.netType == 5) {
      this.netType = 4;
    }
    boolean bool3;
    boolean bool4;
    label84:
    boolean bool5;
    label156:
    boolean bool6;
    label229:
    boolean bool7;
    label241:
    int i;
    label252:
    int j;
    label263:
    int m;
    int k;
    if ((this.oOj >= 4) && ((ovW & 0x400) != 0) && ((ovW & 0xFF) >= 26))
    {
      bool3 = true;
      if ((!bool3) || ((ovW & 0xFF) < 30)) {
        break label419;
      }
      bool4 = true;
      if ((q.deM.ddl <= 0) || (q.deM.dcN.width < 480) || (q.deM.dcN.height < 360) || (q.deM.dcP.width < 480) || (q.deM.dcP.height < 360)) {
        break label425;
      }
      bool5 = true;
      if ((q.deM.ddl < 2) || (q.deM.dcN.width < 640) || (q.deM.dcN.height < 480) || (q.deM.dcP.width < 640) || (q.deM.dcP.height < 480)) {
        break label431;
      }
      bool6 = true;
      if (q.deM.ddl != 0) {
        break label437;
      }
      bool7 = true;
      if (q.deM.ddm != 0) {
        break label443;
      }
      i = 1;
      if (q.deM.ddm <= 0) {
        break label448;
      }
      j = 1;
      this.oPX = false;
      if (i != 0) {
        break label1120;
      }
      if (!bool4) {
        break label1011;
      }
      m = 0;
      i = 0;
      if (Build.VERSION.SDK_INT < 21) {
        break label463;
      }
      k = MediaCodecList.getCodecCount() - 1;
    }
    Object localObject1;
    int n;
    for (;;)
    {
      m = i;
      if (k < 0) {
        break label463;
      }
      Object localObject2 = MediaCodecList.getCodecInfoAt(k);
      a.eV("MicroMsg.Voip", "steve codecInfo : " + ((MediaCodecInfo)localObject2).getName());
      localObject1 = ((MediaCodecInfo)localObject2).getSupportedTypes();
      localObject2 = ((MediaCodecInfo)localObject2).getName();
      n = 0;
      m = i;
      i = n;
      for (;;)
      {
        if (i < localObject1.length)
        {
          if (localObject1[i].equalsIgnoreCase("video/avc"))
          {
            m = 1;
            a.eV("MicroMsg.Voip", "steve : H.264 HW encoder found:" + (String)localObject2);
          }
          i += 1;
          continue;
          bool3 = false;
          break;
          label419:
          bool4 = false;
          break label84;
          label425:
          bool5 = false;
          break label156;
          label431:
          bool6 = false;
          break label229;
          label437:
          bool7 = false;
          break label241;
          label443:
          i = 0;
          break label252;
          label448:
          j = 0;
          break label263;
        }
      }
      k -= 1;
      i = m;
    }
    label463:
    boolean bool1;
    label489:
    boolean bool2;
    label509:
    label511:
    boolean bool8;
    if (m != 0)
    {
      bool1 = true;
      if (j == 0) {
        break label1111;
      }
      if ((q.deM.ddm & 0x10) == 0) {
        break label1017;
      }
      i = 1;
      if ((!bool1) || ((q.deM.ddm & 0xF) == 0)) {
        break label1022;
      }
      bool2 = true;
      j = i;
      if (!bool2) {
        break label1028;
      }
      bool8 = true;
      label519:
      this.oPX = bool8;
      a.eU("MicroMsg.Voip", "hwH264Local:" + bool1 + ",hwHEVCLocal:false, bSupportH264HW:" + bool2 + ", bSupportHEVCHW:false, svrHWCfg:" + q.deM.ddm);
      if (!bool2) {
        break label1106;
      }
      i = 1;
      label582:
      if (j == 0) {
        break label1103;
      }
      i |= 0x2;
    }
    for (;;)
    {
      if (((bool3) || (bool5)) && (!bool7))
      {
        if ((this.oPX) || (bool6))
        {
          this.defaultWidth = 640;
          this.defaultHeight = 480;
          label631:
          oOg = true;
          a.eU("MicroMsg.Voip", "steve:Set Enable 480! " + this.defaultWidth + "x" + this.defaultHeight);
        }
      }
      else
      {
        a.eU("MicroMsg.Voip", "steve: Android CPUFlag:" + (ovW & 0xFF) + ", 480x360 Enc flags: bEnable480FromLocal:" + bool3 + ", bEnable480FromSvr:" + bool5 + ", bDisable480FromSvr:" + bool7 + ", bEnable640FromLocal:" + bool4 + ", bEnable640FromSvr:" + bool6);
        this.oPf = new int[this.defaultWidth * this.defaultHeight];
        au.HU();
        this.oOi = com.tencent.mm.model.c.Df();
        if ((ovW & 0x400) == 0) {
          break label1051;
        }
        com.tencent.mm.compatible.loader.d.y(ad.getContext(), "libvoipCodec_v7a.so");
        a.eV("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v7a.so... ");
      }
      for (;;)
      {
        k = Build.VERSION.SDK_INT;
        j = OpenGlRender.bMg();
        localObject1 = ((WindowManager)ad.getContext().getSystemService("window")).getDefaultDisplay();
        m = ((Display)localObject1).getWidth();
        n = ((Display)localObject1).getHeight();
        k = init(this.netType | i << 8, 2, this.defaultWidth << 16 | this.defaultHeight, m << 16 | n, this.oOi, ovW | j << 24 | k << 16, e.duM + "app_lib/", 0);
        a.eU("MicroMsg.Voip", "protocal init ret :" + k + ",uin= " + this.oOi + ", gl_vs:" + j + ", cpuFlag0=" + ovW + ", hwCap= " + i);
        this.lkO = true;
        if (k < 0) {
          reset();
        }
        return k;
        label1011:
        bool1 = false;
        break;
        label1017:
        i = 0;
        break label489;
        label1022:
        bool2 = false;
        break label509;
        label1028:
        bool8 = false;
        break label519;
        this.defaultWidth = 480;
        this.defaultHeight = 360;
        break label631;
        label1051:
        if ((ovW & 0x200) != 0)
        {
          com.tencent.mm.compatible.loader.d.y(ad.getContext(), "libvoipCodec.so");
          a.eV("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec.so... ");
        }
        else
        {
          com.tencent.mm.compatible.loader.d.y(ad.getContext(), "libvoipCodec_v5.so");
          a.eV("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v5.so... ");
        }
      }
      label1103:
      continue;
      label1106:
      i = 0;
      break label582;
      label1111:
      j = 0;
      bool2 = bool1;
      break label511;
      label1120:
      i = 0;
    }
  }
  
  public final String bLA()
  {
    getChannelInfo(this.oPI, this.oPI.length, this.oPg, this.oPh, this.oPi, this.oPj);
    Object localObject = new StringBuilder().append(this.kpp).append(",").append(this.kpo).append(",").append(this.kpw).append(this.oPS.bKh());
    m localm = this.oPS;
    localObject = new StringBuilder(",").append(localm.oLg).toString() + new String(this.oPI, 0, this.field_channelStatLength);
    a.eU("MicroMsg.Voip", "voipreport:oldChannelString: " + (String)localObject);
    getChannelReport(this.oPI, this.oPI.length);
    localObject = new String(this.oPI, 0, this.field_channelReportLength);
    a.eU("MicroMsg.Voip", "voipreport:newChannelString: " + (String)localObject);
    return (String)localObject;
  }
  
  public final String bLB()
  {
    getNewEngineInfo(this.oPJ, this.oPJ.length);
    getNewEngineExtInfo(this.oPK, this.oPK.length);
    String str = this.kpw + "," + this.kpp + this.oPS.bKh() + "," + this.oOx + "," + this.oOy + bLu() + new String(this.oPJ, 0, this.field_newEngineStatLength) + "," + this.oOz + "," + this.oOA + bLx() + new String(this.oPK, 0, this.field_newEngineExtStatLength);
    a.eU("MicroMsg.Voip", "voipreport:oldNewEngineString:" + str);
    getNewEngineInfoReport(this.oPJ, this.oPJ.length);
    str = this.kpw + "," + this.kpp + this.oPS.bKh() + "," + this.oOx + "," + this.oOy + bLu() + new String(this.oPJ, 0, this.field_newEngineReportLength);
    a.eU("MicroMsg.Voip", "voipreport:yaoyaoguoNewEngineString:" + str);
    return str;
  }
  
  public final String bLC()
  {
    getEngine2ndInfo(this.oPL, this.oPL.length);
    String str = this.kpp + "," + this.kpo + "," + this.kpw + new String(this.oPL, 0, this.field_engine2ndStatLength);
    a.eU("MicroMsg.Voip", "voipreport:12805,oldEngine2ndString:" + str);
    getEngine2ndInfoReport(this.oPL, this.oPL.length);
    str = this.kpp + "," + this.kpo + "," + this.kpw + new String(this.oPL, 0, this.field_engine2ndReportLength);
    a.eU("MicroMsg.Voip", "voipreport:12805,newEngine2ndString:" + str);
    return str;
  }
  
  public final String bLu()
  {
    if (this.field_videoDuration == 0)
    {
      a.eV("MicroMsg.Voip", "captureFrames:" + this.oPA + ", videoduration: 0");
      return ",0";
    }
    a.eV("MicroMsg.Voip", "capturefps:" + this.oPA / this.field_videoDuration + " framecount:" + this.oPA + " videoDuration:" + this.field_videoDuration);
    return "," + this.oPA / this.field_videoDuration;
  }
  
  public final String bLx()
  {
    if (Build.VERSION.SDK_INT < 11)
    {
      this.oOF = 0;
      this.oOG = 2;
      if (q.deN.dbY >= 0) {
        this.oOF = q.deN.dbY;
      }
      if ((Build.VERSION.SDK_INT >= 11) && (l.xZ()) && (2 == q.deW.ddH)) {
        this.oOG = 2;
      }
      if (q.deN.dbZ >= 0) {
        this.oOG = q.deN.dbZ;
      }
      if (Build.VERSION.SDK_INT >= 11) {
        break label274;
      }
      this.oOE = 1;
      label98:
      if (q.deN.dby) {
        this.oOE = 1;
      }
      if (q.deN.dbX >= 0) {
        this.oOE = q.deN.dbX;
      }
      if (q.deN.dbz <= 0) {
        break label283;
      }
      this.oOH = 3;
      this.oOI = 0;
    }
    for (;;)
    {
      if (q.deN.dcb >= 0) {
        this.oOH = q.deN.dcb;
      }
      if (q.deN.dcc >= 0) {
        this.oOI = q.deN.dcc;
      }
      return "," + this.oOF + "," + this.oOG + "," + this.oOE + "," + this.oOH + "," + this.oOI;
      this.oOF = 3;
      this.oOG = 3;
      break;
      label274:
      this.oOE = 7;
      break label98;
      label283:
      if (q.deN.dca >= 0)
      {
        this.oOH = q.deN.dca;
        this.oOI = q.deN.dca;
      }
    }
  }
  
  public final String bLz()
  {
    long l3 = 0L;
    if ((this.oOx == 0) && (this.oOy == 0))
    {
      this.oPS.oLh = 0;
      this.oPS.oLp = a.getNetType(ad.getContext());
      this.oPS.oLo = this.field_videoDuration;
      this.oPS.oLn = this.field_audioDuration;
      this.oOC = au.HV().yP();
      if ((this.oPS.oLx <= 0L) || (this.oPS.oLr <= this.oPS.oLx)) {
        break label1145;
      }
    }
    label1145:
    for (long l1 = this.oPS.oLr - this.oPS.oLx;; l1 = 0L)
    {
      a.eV("MicroMsg.Voip", "voipreport:acceptcalltime:" + l1);
      setJNIAppCmd(1, this.oPz, this.oPz.length);
      long l4 = aU(this.oPz);
      Object localObject1 = this.oPS;
      if ((l4 > this.oPS.oLv) && (this.oPS.oLv > 0L)) {}
      for (long l2 = l4 - this.oPS.oLv;; l2 = 0L)
      {
        ((m)localObject1).oLy = l2;
        localObject1 = this.oPS;
        l2 = l3;
        if (l4 > this.oPS.oLx)
        {
          l2 = l3;
          if (this.oPS.oLx > 0L) {
            l2 = l4 - this.oPS.oLx;
          }
        }
        ((m)localObject1).oLz = l2;
        a.eV("MicroMsg.Voip", "voipreport:lCallerWaitTime:" + this.oPS.oLy + " lCalledWaitTime:" + this.oPS.oLz);
        int i = ovW;
        StringBuilder localStringBuilder = new StringBuilder().append(this.oOw).append(",").append(this.kpo).append(",").append(this.kpp).append(",").append(this.kpw).append(",").append(this.oPS.oKQ).append(",").append(this.oPS.oLc).append(",").append(this.oPS.oLd).append(",").append(this.oPS.oLe).append(",").append(this.oPS.oLf).append(",").append(this.oPS.oLg).append(",").append(this.oPS.oLh).append(",").append(this.oPS.oLa).append(",").append(this.oPS.oLi).append(",").append(this.oPS.oLj).append(",").append(this.oPS.oLk).append(",").append(this.oPS.oLl).append(",").append(this.oPS.oLm).append(",").append(this.oPS.oLn).append(",").append(this.oPS.oLo).append(",").append(this.oPS.oLp).append(bLv()).append(bLw()).append(bLs()).append(",").append(this.oPS.oLq).append(",").append(this.oOB).append(",").append(this.oOC).append(",").append(l1).append(",").append(this.oPS.oLy).append(",").append(this.oPS.oLz).append(",").append(this.oOD).append(",").append(this.oOj).append(bLt()).append(",").append(i & 0xFF).append(",").append(this.oOJ).append(",").append(this.oOK);
        Object localObject2 = Build.VERSION.INCREMENTAL;
        localObject1 = localObject2;
        if (((String)localObject2).contains(",")) {
          localObject1 = ((String)localObject2).replace(',', ' ');
        }
        String str = Build.DISPLAY;
        localObject2 = str;
        if (str.contains(",")) {
          localObject2 = str.replace(',', ' ');
        }
        localObject1 = new StringBuilder(",").append((String)localObject1).append(",").append((String)localObject2).toString() + "," + this.oPS.oLs + "," + this.oPS.oLu + "," + this.oPS.oLt + ",0," + this.oPS.oLA;
        a.eU("MicroMsg.Voip", "voipreport:initNetType:" + this.oOj);
        a.eU("MicroMsg.Voip", "voipreport:NewDialStatString:" + (String)localObject1);
        a.eU("MicroMsg.Voip", "voipreport:getChannelStrategyString:" + bLt());
        return (String)localObject1;
        if ((this.oOy != 0) && (this.oOx != 0))
        {
          this.oPS.oLh = 3;
          break;
        }
        if (this.oOy != 0)
        {
          this.oPS.oLh = 1;
          break;
        }
        if (this.oOx == 0) {
          break;
        }
        this.oPS.oLh = 2;
        break;
      }
    }
  }
  
  public native int connectToPeer();
  
  public native int connectToPeerDirect();
  
  public native int connectToPeerRelay();
  
  public native int doubleLinkSwitch(int paramInt);
  
  public native int exchangeCabInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int freeJNIReport();
  
  public native int getAVDuration(byte[] paramArrayOfByte, int paramInt);
  
  public native int getChannelInfo(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public native int getChannelReport(byte[] paramArrayOfByte, int paramInt);
  
  public native int getCurrentConnType();
  
  public native int getEngine2ndInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getEngine2ndInfoReport(byte[] paramArrayOfByte, int paramInt);
  
  public native int getEngineQosInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getEngineVersionInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getNewEngineExtInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getNewEngineInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getNewEngineInfoReport(byte[] paramArrayOfByte, int paramInt);
  
  public native int getPstnChannelInfo(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  public native int getPstnEngineInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getStatInfo(byte[] paramArrayOfByte, int paramInt1, int[] paramArrayOfInt, int paramInt2);
  
  public native int getVideoHWDecode(int[] paramArrayOfInt, byte[] paramArrayOfByte, int paramInt);
  
  public native int getVoipcsChannelInfo(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public native int getVoipcsEngineInfo(byte[] paramArrayOfByte, int paramInt);
  
  public native int getcurstrategy();
  
  public native int handleCommand(byte[] paramArrayOfByte, int paramInt);
  
  public final String iT(boolean paramBoolean)
  {
    if (this.lkO)
    {
      a.eU("MicroMsg.Voip", "call protocalUninit now...needStatInfo=" + paramBoolean);
      this.field_ChannelReportDial = new int[6];
      this.field_ChannelReportDial[0] = this.oPS.oLa;
      this.field_ChannelReportDial[1] = this.oPS.oLg;
      this.field_ChannelReportDial[2] = this.oPg;
      this.field_ChannelReportDial[3] = this.oPh;
      this.field_ChannelReportDial[4] = this.oPi;
      this.field_ChannelReportDial[5] = this.oPj;
      this.field_EngineReportStatFromApp = new int[12];
      bLx();
      this.field_EngineReportStatFromApp[0] = this.oOz;
      this.field_EngineReportStatFromApp[1] = this.oOA;
      this.field_EngineReportStatFromApp[2] = this.oOF;
      this.field_EngineReportStatFromApp[3] = this.oOG;
      this.field_EngineReportStatFromApp[4] = this.oOE;
      this.field_EngineReportStatFromApp[5] = this.oOH;
      this.field_EngineReportStatFromApp[6] = this.oOI;
      this.field_EngineReportStatFromApp[7] = -1;
      if (this.oPT != null)
      {
        this.field_EngineReportStatFromApp[8] = this.oPT.oIE;
        this.field_EngineReportStatFromApp[9] = this.oPT.oIG;
        this.field_EngineReportStatFromApp[10] = this.oPT.oIh;
        if (oPU == null) {
          break label1087;
        }
        this.field_EngineReportStatFromApp[11] = oPU.oId;
      }
      for (;;)
      {
        this.lkO = false;
        uninit(this.kpo, this.kpp, this.kpw);
        oOg = false;
        if (this.oPT != null)
        {
          this.oPT.bJz();
          this.oPT = null;
        }
        if (oPU != null)
        {
          oPU.interrupt();
          oPU.bJz();
          oPU = null;
        }
        oPW = null;
        a.eU("MicroMsg.Voip", "uninit over.");
        if (!paramBoolean) {
          break label1098;
        }
        getStatInfo(this.oPF, this.oPF.length, this.oPQ, 30);
        getEngineVersionInfo(this.oPG, this.oPG.length);
        getEngineQosInfo(this.oPH, this.oPH.length);
        Object localObject1 = new StringBuilder();
        long l = this.oOi;
        if (this.oOi < 0) {
          l = this.oOi + 4294967296L;
        }
        Object localObject2 = new StringBuilder().append(l).append(",").append(this.kpp).append(",").append(this.kpo).append(",").append(this.kpw).append(",");
        m localm = this.oPS;
        localObject2 = new StringBuilder().append(localm.oKQ).append(",").append(localm.oKR).append(",").append(localm.oKS).append(",").append(localm.oKT).append(",").append(localm.oKU).append(",").append(localm.oKV).append(",").append(localm.oKW).append(",").append(localm.oKX).append(",").append(localm.oKY).append(",").append(localm.oKZ).append(",").append(localm.oLa).toString();
        a.eU("MicroMsg.Voip", "voipreport:DailStatString:" + (String)localObject2);
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(new String(this.oPF, 0, this.field_statInfoLength)).append(bLs()).append(bLt());
        localObject2 = this.oPS;
        localObject1 = ((StringBuilder)localObject1).append("," + ((m)localObject2).oLb).append(new String(this.oPG, 0, this.field_engineVersionStatLength)).append(bLu());
        a.eV("MicroMsg.Voip", "cpuCapacity:" + ovW);
        localObject1 = new StringBuilder(",").append(ovW).toString() + bLv() + bLw() + new String(this.oPH, 0, this.field_engineQosStatLength);
        a.eU("MicroMsg.Voip", "statInfoBuffer = " + new String(this.oPF, 0, this.field_statInfoLength));
        a.eU("MicroMsg.Voip", "engineVersionInfoBuffer = " + new String(this.oPG, 0, this.field_engineVersionStatLength));
        a.eU("MicroMsg.Voip", "engineQosInfoBuffer = " + new String(this.oPH, 0, this.field_engineQosStatLength));
        a.eU("MicroMsg.Voip", "voipreport:StatString = " + (String)localObject1);
        am.a.dBs.aY(this.field_netFlowRecv, this.field_netFlowSent);
        a.eV("MicroMsg.Voip", "voip net flow = " + (this.field_netFlowSent + this.field_netFlowRecv));
        return (String)localObject1;
        this.field_EngineReportStatFromApp[8] = 0;
        this.field_EngineReportStatFromApp[9] = 0;
        this.field_EngineReportStatFromApp[10] = 0;
        break;
        label1087:
        this.field_EngineReportStatFromApp[11] = 0;
      }
    }
    label1098:
    return "";
  }
  
  public native int init(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, String paramString, int paramInt7);
  
  public native int isDCReady();
  
  public native int isDCSameLan();
  
  public native int isRelayConnReady();
  
  public int keep_onNotifyFromJni(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    if (paramInt1 == 100)
    {
      a.b(paramArrayOfByte, "MicroMsg.Voip", paramInt2);
      return 0;
    }
    if (paramInt1 == 101)
    {
      a.b(paramArrayOfByte, "MicroMsg.v2Core", paramInt2);
      return 0;
    }
    Message localMessage = new Message();
    localMessage.what = 59998;
    localMessage.arg1 = paramInt1;
    localMessage.arg2 = paramInt2;
    localMessage.obj = paramArrayOfByte;
    this.handler.sendMessage(localMessage);
    return 0;
  }
  
  public int keep_onNotifyFromJniInt(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if (paramArrayOfInt != null)
    {
      a.eV("MicroMsg.VoipService", "callByJni : arg1:" + paramInt1 + " arg2:" + paramInt2);
      Message localMessage = new Message();
      localMessage.what = 59998;
      localMessage.arg1 = paramInt1;
      localMessage.arg2 = paramInt2;
      localMessage.obj = paramArrayOfInt;
      this.handler.sendMessage(localMessage);
    }
    return 0;
  }
  
  public native int parseSyncKeyBuff(byte[] paramArrayOfByte, int paramInt);
  
  public native int playCallback(byte[] paramArrayOfByte, int paramInt);
  
  public native int recordCallback(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public final void reset()
  {
    a.eU("MicroMsg.Voip", "v2protocal reset!");
    this.field_punchSvrArray = null;
    this.field_relaySvrArray = null;
    this.field_relayTcpSvrArray = null;
    this.field_peerId = null;
    this.field_capInfo = null;
    this.kpo = 0;
    this.oOl = 0L;
    this.oOk = 0;
    this.kpw = 0;
    this.kpp = 0L;
    this.channelStrategy = 0;
    this.kpr = 0;
    this.dTS = 0L;
    this.oOm = null;
    this.oOn = null;
    this.oOo = null;
    this.oOp = 0;
    this.oOq = null;
    this.oPj = 0;
    this.oPk = null;
    this.oPl = 0;
    this.oPm = 0;
    this.oPr = null;
    this.oPs = null;
    this.oPA = 0;
    this.oPB = 0;
    this.oPC = 0;
    this.oPD = 0;
    this.oPE = 0;
    this.field_videoDuration = 0;
    this.field_audioDuration = 0;
    this.oPR = 0;
    this.oOO = 0;
    this.oON = 0;
    this.field_engineVersionStatLength = 0;
    this.field_engineQosStatLength = 0;
    this.field_statusSyncKey = 0;
    this.field_relayDataSyncKey = 0;
    this.field_connectingStatusKey = 0;
    this.oOz = 0;
    this.oOA = 0;
    this.oOB = 65536;
    this.oOC = 0;
    this.oOD = 0;
    this.oOK = -1;
    this.oOL = 0;
    this.oPv = 0;
    this.oOh = 0;
    this.kFn = "";
    this.oPt = 0;
    this.oPu = 0;
    this.oPS.reset();
    this.oPS.bKg();
    oOg = false;
    this.field_jbmBitratRsSvrParamArray = null;
    this.field_jbmParamArraySize = 0;
    this.field_jbmBitratRsSvrParamDoubleArray = null;
    this.field_jbmParamDoubleArraySize = 0;
    int i = freeJNIReport();
    a.eU("MicroMsg.Voip", "freeJNIReport : " + i + ". [0: null, no need to free, 1: free success!]");
  }
  
  public native int setActive();
  
  public native int setAppCmd(int paramInt1, byte[] paramArrayOfByte, int paramInt2);
  
  public native int setConfigInfo(int paramInt1, long paramLong1, int paramInt2, long paramLong2, byte[] paramArrayOfByte1, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, byte[] paramArrayOfByte2, int paramInt8, int paramInt9, int paramInt10, int paramInt11, byte[] paramArrayOfByte3, int paramInt12, int paramInt13);
  
  public native int setInactive();
  
  public native int setJNIAppCmd(int paramInt1, byte[] paramArrayOfByte, int paramInt2);
  
  public native int setNetSignalValue(int paramInt1, int paramInt2);
  
  public native int setSvrConfig(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
  
  public native int setjbmbitraterssvrparam();
  
  public native int startEngine();
  
  public final int tf(int paramInt)
  {
    paramInt = setAppCmd(paramInt, new byte[] { 0 }, 1);
    if (paramInt < 0) {
      a.eU("MicroMsg.Voip", "setAppCmd: type:" + paramInt + ":ret:" + paramInt);
    }
    return paramInt;
  }
  
  public native int videoDecode(int[] paramArrayOfInt);
  
  public native int videoEncodeToLocal(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int[] paramArrayOfInt);
  
  public native int videoEncodeToSend(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public native int videoHWDecode(byte[] paramArrayOfByte);
  
  public native int videoHWProcess(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte2);
  
  public native int videoRorate90D(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte2, int paramInt5, int paramInt6, int paramInt7, int paramInt8);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip/model/v2protocal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */